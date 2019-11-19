package cla.edg.pageflow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.Gson;

import cla.edg.Utils;
import cla.edg.modelbean.BaseAttribute;
import cla.edg.modelbean.BaseModelBean;
import cla.edg.modelbean.CorperationPathNode;
import cla.edg.modelbean.EnumAttribute;
import cla.edg.modelbean.LogicalOperator;
import cla.edg.modelbean.ModelBeanRoute;
import cla.edg.modelbean.LogicalOperator.Operator;
import cla.edg.noderoute.RouteUtil;
import cla.edg.project.moyi.gen.graphquery.MODEL;

public class QueryActionInfo {
	protected String sqlTemplate;
	protected List<Object> paramDefinitions;
	protected Set<String> externTypesNeedKnown;
	protected List<CorperationPathNode> searchAlongPath;
	protected LogicalOperator searchWhere;
	protected List<Object> params;
	
	// /////////////////////////////////////////////
	protected String targetModelTypeName;
	protected boolean querySingle;
	protected boolean pagination;
	protected ModelBeanRoute beanRoute;
	public ModelBeanRoute getBeanRoute() {
		return beanRoute;
	}
	public void setBeanRoute(ModelBeanRoute beanRoute) {
		this.beanRoute = beanRoute;
	}
	public String getTargetModelTypeName() {
		return targetModelTypeName;
	}
	public void setTargetModelTypeName(String targetModelTypeName) {
		this.targetModelTypeName = targetModelTypeName;
	}
	public boolean isQuerySingle() {
		return querySingle;
	}
	public void setQuerySingle(boolean querySingle) {
		this.querySingle = querySingle;
	}
	public boolean isPagination() {
		return pagination;
	}
	public void setPagination(boolean pagination) {
		this.pagination = pagination;
	}
	
	// /////////////////////////////////////////////
	
	public LogicalOperator getSearchWhere() {
		return searchWhere;
	}
	public void setSearchWhere(LogicalOperator searchWhere) {
		this.searchWhere = searchWhere;
	}
	public List<CorperationPathNode> getSearchAlongPath() {
		return searchAlongPath;
	}
	public void setSearchAlongPath(List<CorperationPathNode> searchAlongPath) {
		this.searchAlongPath = searchAlongPath;
	}
	public Set<String> getExternTypesNeedKnown() {
		if (externTypesNeedKnown == null) {
			externTypesNeedKnown = new HashSet<>();
		}
		return externTypesNeedKnown;
	}

	public void setExternTypesNeedKnown(Set<String> externTypesNeedKnown) {
		this.externTypesNeedKnown = externTypesNeedKnown;
	}

	public List<Object> getParamDefinitions() {
		if (paramDefinitions == null) {
			paramDefinitions = new ArrayList<>();
		}
		return paramDefinitions;
	}

	public void setParamDefinitions(List<Object> paramDefinitions) {
		this.paramDefinitions = paramDefinitions;
	}

	public String getSqlTemplate() {
		return sqlTemplate;
	}

	public void setSqlTemplate(String sql) {
		sqlTemplate = sql;
	}
	
	public void addParam(Object param) {
		getParamDefinitions().add(String.valueOf(param));
	}
	public void addParamString(Object param) {
		getParamDefinitions().add(new Gson().toJson(param));
	}
	
	public String getDbSql() {
		return this.getSqlTemplate().replaceAll("\\?\\{[^\\}]+\\}", "?").replace("\n", "\" +\n\t\t\t\" ");
	}
	
	Pattern ptnSqlParam = Pattern.compile("(\\?(\\{[^\\}]+\\})?)");
	public List<Object> getParamPrepareQueue() {
		List<Object> result = new ArrayList<>();
		List<String> segs = Utils.findAllMatched( this.getSqlTemplate(), ptnSqlParam);
		int curAdditionalParamIdx = 0;
		for(String seg : segs) {
//			System.out.println(seg);
			if (seg.equals("?")) {
				result.add(getParamDefinitions().get(curAdditionalParamIdx++));
				continue;
			}
			String name = seg.substring(2, seg.length()-1);
			result.add(Utils.toJavaVariableName(name));
		}
		return result;
	}
	
	public List<Object> getParamsFromSearchClause() {
		return params;
	}
	
	public String getSqlFromSearchClause() {
		StringBuilder sb =  new StringBuilder();
		String selectStr = beanRoute.getSelectClause(this.getTargetModelTypeName());
		System.out.println("selectStr="+selectStr);
		sb.append(selectStr);
		
		params = new ArrayList<>();
		String whereClause = RouteUtil.getWhereClause(params, this.getSearchWhere());
		sb.append(whereClause);
		// create order by 
		makeSortClause(params, sb, null);
		// create limit
		makeLimitClause(params, sb, null);
		System.out.println("paramValueExpList="+params);
		return sb.toString().replaceAll("[\r\n]+", "\" +\r\n\t\t\t\"");
	}
	public String getSqlFromSearchClauseV1() {
		StringBuilder sb =  new StringBuilder();
		// create select first
		Map<String, BaseModelBean> allBeansUsed = new HashMap<>();
		List<CorperationPathNode> path = this.getSearchAlongPath();
		sb.append("select T1.* from ");
		path.forEach(node->{
			BaseModelBean from = node.getFromBean();
			BaseModelBean to = node.getToBean();
			String key = from.getFullPathInSearch();
			if (allBeansUsed.containsKey(key)) {
				// 已经存在了, 啥也不干
			}else {
				allBeansUsed.put(key, from);
			}
			from.assignAlias(String.format("T%d", allBeansUsed.size()));
			
			key = to.getFullPathInSearch();
			if (allBeansUsed.containsKey(key)) {
				// 已经存在了, 啥也不干
			}else {
				allBeansUsed.put(key, to);
			}
			to.assignAlias(String.format("T%d", allBeansUsed.size()));
			
			if (to.isReferDirection()) {
				// 是 from 引用单个 to
				sb.append(from.getModelTypeName()).append("_data ").append(from.getAdditonalData().aliasInSql).append(" left join ")
				.append(to.getModelTypeName()).append("_data ").append(to.getAdditonalData().aliasInSql).append(" on ")
				.append(from.getAdditonalData().aliasInSql).append(".").append(to.getName()).append('=').append(to.getAdditonalData().aliasInSql)
				.append(".id \n");
			}else {
				sb.append(to.getModelTypeName()).append("_data ").append(to.getAdditonalData().aliasInSql).append(" left join ")
				.append(from.getModelTypeName()).append("_data ").append(from.getAdditonalData().aliasInSql).append(" on ")
				.append(to.getAdditonalData().aliasInSql).append(".").append(to.getName()).append('=').append(from.getAdditonalData().aliasInSql)
				.append(".id \n");
			}
		});
		// create where then
		sb.append(" where ");
		LogicalOperator whereClauses = this.getSearchWhere();
		List<Object> paramValueExpList = new ArrayList<>();
		makeWhereClause(paramValueExpList, sb, whereClauses);
		// create order by 
		makeSortClause(paramValueExpList, sb, whereClauses);
		// create limit
		makeLimitClause(paramValueExpList, sb, whereClauses);
		System.out.println("paramValueExpList="+paramValueExpList);
		params = paramValueExpList;
		return sb.toString().replace("\n", "\" +\n\t\t\t\" ");
	}
	private void makeSortClause(List<Object> paramValueExpList, StringBuilder sb, LogicalOperator whereClauses) {
		sb.append("\n    ORDER BY T1.id DESC ");
	}
	private void makeLimitClause(List<Object> paramValueExpList, StringBuilder sb, LogicalOperator whereClauses) {
		sb.append("\n    LIMIT ? ");
		paramValueExpList.add("1");
	}
	private void makeWhereClause(List<Object> paramValueExpList, StringBuilder sb, LogicalOperator where) {
		Object op1 = where.getOp1();
		if (op1 instanceof BaseAttribute) {
			makeWhereClauseByAttribute(paramValueExpList, sb, where, (BaseAttribute)op1);
		}else if (op1 instanceof BaseModelBean) {
			makeWhereClauseByBean(paramValueExpList, sb, where, (BaseModelBean)op1);
		}else {
			throw new RuntimeException("where的op1只支持'模型'或者'属性'");
		}
	}
	private void makeWhereClauseByBean(List<Object> paramValueExpList, StringBuilder sb, LogicalOperator where,
			BaseModelBean op1) {
		String alias = findModelBeanAlais(op1.getPreviousBean());
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
		for(LogicalOperator subWhere : where.getOperations()) {
			switch(where.getCollectionType()) {
			case and:
				sb.append(" and ");
				break;
			case or:
				sb.append(" or ");
				break;
			default:
				throw new RuntimeException("只支持'and'或者'or'");
			}
			makeWhereClause(paramValueExpList, sb, subWhere);
		}
		sb.append(") ");
		return;
	}
	
	private void makeWhereClauseByAttribute(List<Object> paramValueExpList, StringBuilder sb, LogicalOperator where,
			BaseAttribute op1) {
		String alias = findModelBeanAlais(op1.getContainerBean());
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
		for(LogicalOperator subWhere : where.getOperations()) {
			switch(where.getCollectionType()) {
			case and:
				sb.append(" and ");
				break;
			case or:
				sb.append(" or ");
				break;
			default:
				throw new RuntimeException("只支持'and'或者'or'");
			}
			makeWhereClause(paramValueExpList, sb, subWhere);
		}
		sb.append(") ");
		return;
	}
	
	private String makeParamExp(List<Object> paramValueExpList, LogicalOperator where) {
		Operator operator = where.getOperator();
		Object op2 = where.getOp2();
		switch (operator) {
		case eq: 
		case not:
		case less_or_eq:
		case bigger_or_eq:
		case less:
		case bigger:
		{
			if (op2 instanceof EnumAttribute) {
				this.getExternTypesNeedKnown().add(((EnumAttribute) op2).getClassName());
				paramValueExpList.add(((EnumAttribute) op2).getConstantsName());
				return "?";
			}
			if (op2 instanceof String) {
				if (op2.equals("now()")){
					return "now()";
				}
				paramValueExpList.add(wrapString((String)op2));
				return "?";
			}
			if (op2 instanceof BaseModelBean) {
				BaseModelBean node = findModelBeanForAlias((BaseModelBean) op2);
				return node.getAdditonalData().aliasInSql+".id";
			}
			if (op2 instanceof BaseAttribute) {
				BaseModelBean node = findModelBeanForAlias(((BaseAttribute) op2).getContainerBean());
				return node.getAdditonalData().aliasInSql+"."+((BaseAttribute) op2).getName();
			}
			throw new RuntimeException("不晓得怎么处理op2:"+op2.getClass().getSimpleName()+"("+Utils.toJson(op2, false)+")");
		}
		

		case in:
		case not_in:
		{
			List<Object> list = Utils.convertToList(op2);
			for(Object d : list) {
				if (d instanceof EnumAttribute) {
					this.getExternTypesNeedKnown().add(((EnumAttribute) d).getClassName());
					paramValueExpList.add(((EnumAttribute) d).getConstantsName());
					continue;
				}
				if (d instanceof String) {
					paramValueExpList.add(wrapString((String)d));
					continue;
				}
				throw new RuntimeException("不晓得怎么处理op2 in/not_in:"+op2.getClass().getSimpleName()+"("+Utils.toJson(op2, false)+")");
			}
			return "(" + Utils.repeat(list.size()) +")";
		}
		case is_null:
			return "";
		case not_null:
			return "";
		default:
				throw new RuntimeException("不支持"+operator);
		}
	}
	Pattern ptnVariable = Pattern.compile("\\$\\{(.*)\\}");
	private String wrapString(String op2) {
		Matcher m = ptnVariable.matcher(op2);
		if (m.matches()) {
			return Utils.toJavaVariableName(m.group(1));
		}
		return new Gson().toJson(op2);
	}
	private String makeOperatorExp(Operator operator) {
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
				throw new RuntimeException("不支持"+operator);
		}
	}
	private String findModelBeanAlais(BaseModelBean bean) {
		BaseModelBean node = findModelBeanForAlias(bean);
		return node.getAdditonalData().aliasInSql;
	}
	private BaseModelBean findModelBeanForAlias(BaseModelBean bean) {
		if (bean.getPreviousBean() == null) {
			for(CorperationPathNode node : getSearchAlongPath()) {
				if (node.getFromBean().getModelTypeName().equals(bean.getModelTypeName())) {
					return node.getFromBean();
				}
				if (node.getToBean().getModelTypeName().equals(bean.getModelTypeName())) {
					return node.getToBean();
				}
			}
			throw new RuntimeException("没找到"+bean.getModelTypeName()+"的别名");
		}
		// 先用全路径找
		String key = bean.getFullPathInSearch();
		for(CorperationPathNode node : getSearchAlongPath()) {
			if (node.getFromBean().getFullPathInSearch().equals(key)) {
				return node.getFromBean();
			}
			if (node.getToBean().getFullPathInSearch().equals(bean.getModelTypeName())) {
				return node.getToBean();
			}
		}
		// 没找到全名匹配的,那就找自己的,尽可能匹配的父bean
		BaseModelBean pNode = findModelBeanForAlias(bean.getPreviousBean());
		for(CorperationPathNode node : getSearchAlongPath()) {
			if (node.getFromBean() == pNode) {
				return node.getToBean();
			}
		}
		throw new RuntimeException("没找到"+bean.getModelTypeName()+"的别名");
	}
	
}
