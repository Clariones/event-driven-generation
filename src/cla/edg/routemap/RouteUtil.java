package cla.edg.routemap;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.Gson;

import cla.edg.Utils;
import cla.edg.modelbean.BaseAttribute;
import cla.edg.modelbean.BaseModelBean;
import cla.edg.modelbean.EnumAttribute;
import cla.edg.modelbean.LogicalOperator;
import cla.edg.modelbean.LogicalOperator.Operator;

public class RouteUtil {
	public static String getKey(Object data) {
		if (data == null) {
			return "NULL";
		}
		if (data instanceof String) {
			return String.valueOf(data).trim();
		}
		if (data instanceof Number) {
			return String.valueOf(data).trim();
		}
		try {
			Method m = data.getClass().getMethod("getId");
			if (m != null) {
				return String.valueOf(m.invoke(data)).trim();
			}
		} catch (Exception e) {
			// throw new RuntimeException("获取Key失败:" + data.getClass().getSimpleName(), e);
		}
		try {
			Method m = data.getClass().getMethod("getKey");
			if (m != null) {
				return String.valueOf(m.invoke(data)).trim();
			}
		} catch (Exception e) {
			// throw new RuntimeException("获取Key失败:" + data.getClass().getSimpleName(), e);
		}
		return data.getClass().getSimpleName() + "_" + data.hashCode();
	}

	public static String getWhereClause(List<Object> paramValueExpList, LogicalOperator c1) {
		if (c1 == null) {
			return "";
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("\r\n    WHERE ");
		makeWhereClause(paramValueExpList, sb, c1);
		return sb.toString();
	}

	private static void makeWhereClause(List<Object> paramValueExpList, StringBuilder sb, LogicalOperator where) {
		Object op1 = where.getOp1();
		if (op1 instanceof BaseAttribute) {
			makeWhereClauseByAttribute(paramValueExpList, sb, where, (BaseAttribute) op1);
		} else if (op1 instanceof BaseModelBean) {
			makeWhereClauseByBean(paramValueExpList, sb, where, (BaseModelBean) op1);
		} else {
			throw new RuntimeException("where的op1只支持'模型'或者'属性'");
		}
	}

	private static void makeWhereClauseByBean(List<Object> paramValueExpList, StringBuilder sb, LogicalOperator where,
			BaseModelBean op1) {
		String alias = findModelBeanAlais(where);
		if (where.hasMore()) {
			sb.append(" (");
		}
		sb.append("(").append(alias).append(".").append(op1.getName());
		sb.append(makeOperatorExp(where.getOperator())).append(makeParamExp(paramValueExpList, where));
		sb.append(")");
		if (!where.hasMore()) {
			return;
		}
		for (LogicalOperator subWhere : where.getOperations()) {
			switch (where.getCollectionType()) {
			case and:
				sb.append(" AND ");
				break;
			case or:
				sb.append(" OR ");
				break;
			default:
				throw new RuntimeException("只支持'and'或者'or'");
			}
			makeWhereClause(paramValueExpList, sb, subWhere);
		}
		sb.append(") ");
		return;
	}

	private static String findModelBeanAlais(LogicalOperator where) {
		return where.getDelareAtPoint().getAlias();
	}

	private static void makeWhereClauseByAttribute(List<Object> paramValueExpList, StringBuilder sb,
			LogicalOperator where, BaseAttribute op1) {
		String alias = findModelBeanAlais(where);
		sb.append(' ');
		if (where.getOperations() != null && where.getOperations().size() > 0) {
			sb.append("(");
		}
		sb.append("(").append(alias).append(".").append(op1.getName());
		sb.append(makeOperatorExp(where.getOperator())).append(makeParamExp(paramValueExpList, where));
		sb.append(") ");
		if (where.getOperations() == null || where.getOperations().isEmpty()) {
			return;
		}
		for (LogicalOperator subWhere : where.getOperations()) {
			switch (where.getCollectionType()) {
			case and:
				sb.append("AND ");
				break;
			case or:
				sb.append("OR ");
				break;
			default:
				throw new RuntimeException("只支持'and'或者'or'");
			}
			makeWhereClause(paramValueExpList, sb, subWhere);
		}
		sb.append(") ");
		return;
	}

	private static String makeParamExp(List<Object> paramValueExpList, LogicalOperator where) {
		Operator operator = where.getOperator();
		Object op2 = where.getOp2();
		switch (operator) {
		case eq:
		case not:
		case less_or_eq:
		case bigger_or_eq:
		case less:
		case bigger: {
			if (op2 instanceof EnumAttribute) {
				// getExternTypesNeedKnown().add(((EnumAttribute) op2).getClassName());
				paramValueExpList.add(((EnumAttribute) op2).getConstantsName());
				return "?";
			}
			if (op2 instanceof String) {
				if (op2.equals("now()")) {
					return "now()";
				}
				paramValueExpList.add(wrapString((String) op2));
				return "?";
			}
			// if (op2 instanceof BaseModelBean) {
			// BaseModelBean node = findModelBeanForAlias(where);
			// return node.getAdditonalData().aliasInSql+".id";
			// }
			// if (op2 instanceof BaseAttribute) {
			// BaseModelBean node = findModelBeanForAlias(((BaseAttribute)
			// op2).getContainerBean());
			// return node.getAdditonalData().aliasInSql+"."+((BaseAttribute)
			// op2).getName();
			// }
			throw new RuntimeException(
					"不晓得怎么处理op2:" + op2.getClass().getSimpleName() + "(" + Utils.toJson(op2, false) + ")");
		}

		case in:
		case not_in: {
			List<Object> list = Utils.convertToList(op2);
			for (Object d : list) {
				if (d instanceof EnumAttribute) {
					// this.getExternTypesNeedKnown().add(((EnumAttribute) d).getClassName());
					paramValueExpList.add(((EnumAttribute) d).getConstantsName());
					continue;
				}
				if (d instanceof String) {
					paramValueExpList.add(wrapString((String) d));
					continue;
				}
				throw new RuntimeException("不晓得怎么处理op2 in/not_in:" + op2.getClass().getSimpleName() + "("
						+ Utils.toJson(op2, false) + ")");
			}
			return "(" + Utils.repeat(list.size()) + ")";
		}
		case is_null:
			return "";
		case not_null:
			return "";
		default:
			throw new RuntimeException("不支持" + operator);
		}
	}

	protected static Pattern ptnVariable = Pattern.compile("\\$\\{(.*)\\}");

	private static String wrapString(String op2) {
		Matcher m = ptnVariable.matcher(op2);
		if (m.matches()) {
			return Utils.toJavaVariableName(m.group(1));
		}
		return new Gson().toJson(op2);
	}

	private static String makeOperatorExp(Operator operator) {
		switch (operator) {
		case eq:
			return " = ";
		case not:
			return " != ";
		case less_or_eq:
			return " <= ";
		case bigger_or_eq:
			return " >= ";
		case less:
			return " < ";
		case bigger:
			return " > ";
		case in:
			return " in ";
		case not_in:
			return " not in ";
		case is_null:
			return " is null ";
		case not_null:
			return " is not null ";
		default:
			throw new RuntimeException("不支持" + operator);
		}
	}
}
