package com.terapico.query.utils;

import cla.edg.modelbean.*;
import cla.edg.modelbean.LogicalOperator.Operator;
import clariones.poc.pathmap.PathMap;
import clariones.tool.builder.Utils;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SqlOperatorUtil {

    public static String prepareOperands(LogicalOperator lgExpr) {
        OperatorInfo helper = info.get(lgExpr.getOperator());
        return helper.operandsMaker.apply(lgExpr);
    }

    public static String prepareConditionExpression(LogicalOperator lgExpr) {
        if (!lgExpr.isOptional()){
            return null;
        }
        if (lgExpr.getOperandList() == null){
            Utils.error(".optional() 只能用在带参数的条件后面,不能用在 and/or 之后");
        }
        String var = null;
        for (Object o : lgExpr.getOperandList()) {
            if (o instanceof String){
                var = (String) o;
            }
        }
        if (var == null){
            Utils.error(".optional() 的参数必须是输入变量");
            return null;
        }
        Matcher m = ptnVariable.matcher(var);
        if (!m.matches()){
            Utils.error(".optional() 的参数必须是正确的变量格式,例如 ${user id}");
        }
        return "(isEmpty(" + Utils.nameAsThis(m.group(1))+")?\"1=1 OR \":\"\")+";
    }

    public static String prepareParams(LogicalOperator lgExpr) {
        // OperatorInfo rst = new OperatorInfo();
        if (lgExpr.getOperator() == null){
            return null;
        }
        List<String> result = new ArrayList<>();
        for (Object o : lgExpr.getOperandList()) {
            String paramExp = makeParameter(o, lgExpr.getDeclaredPosition());
            if (paramExp == null) {
                continue;
            }
            result.add(paramExp);
        }
        if (result.isEmpty()) {
            return null;
        }
        return String.join("," ,result);
    }

    public static class OperatorInfo{
        String operator;
        Function<LogicalOperator, String> operandsMaker;
    }

    private static OperatorInfo $(String op) {
        OperatorInfo rst = new OperatorInfo();
        rst.operator = op;
        return $(op, SqlOperatorUtil::prepareSimpleBinOperand);
    }

    private static String prepareSimpleBinOperand(LogicalOperator logicalOperator) {
        Utils.assertSize(logicalOperator.getOperandList(), 2);
        String op =  getSqlSymbolOfOperator(logicalOperator.getOperator());
        return makeOperand(logicalOperator.getOperandList().get(0)) +
                " " + op + " " +
                makeOperand(logicalOperator.getOperandList().get(1));
    }



    private static String prepareSimpleOneOperand(LogicalOperator logicalOperator) {
        Utils.assertSize(logicalOperator.getOperandList(), 1);
        String op =  getSqlSymbolOfOperator(logicalOperator.getOperator());
        return makeOperand(logicalOperator.getOperandList().get(0)) + " " + op;
    }

    private static String prepareInOperand(LogicalOperator logicalOperator) {
        List<Object> operands = logicalOperator.getOperandList();
        if (operands == null || operands.size() < 1) {
            Utils.error("'or'操作至少需要1个操作数");
            return null;
        }
        String op =  getSqlSymbolOfOperator(logicalOperator.getOperator());
        String paramExp = Utils.makeSqlParamPlaceholder(operands.size()-1) ;
        return makeOperand(logicalOperator.getOperandList().get(0)) + " " + op +" (" +paramExp+")";
    }

    private static OperatorInfo $(String op, Function<LogicalOperator, String> operandsMaker) {
        OperatorInfo rst = new OperatorInfo();
        rst.operator = op;
        rst.operandsMaker = operandsMaker;
        return rst;
    }

    protected static Map<Operator, OperatorInfo> info =  new HashMap<>();
    static{
        info.put(Operator.like, $("like"));
        info.put(Operator.eq, $("="));
        info.put(Operator.not, $("!="));
        info.put(Operator.less_or_eq, $("<="));
        info.put(Operator.bigger_or_eq, $(">="));
        info.put(Operator.less, $("<"));
        info.put(Operator.bigger, $(">"));
        info.put(Operator.in, $("in", SqlOperatorUtil::prepareInOperand));
        info.put(Operator.not_in, $("not in", SqlOperatorUtil::prepareInOperand));
        info.put(Operator.is_null, $("is null", SqlOperatorUtil::prepareSimpleOneOperand));
        info.put(Operator.not_null, $("is not null", SqlOperatorUtil::prepareSimpleOneOperand));
    }

    public static String getSqlSymbolOfOperator(Operator operator) {
        return info.get(operator).operator;
    }










    protected static Pattern ptnVariable = Pattern.compile("\\$\\{([\\w \\-0-9$/.]+)}");
    protected static Pattern ptnStringConst = Pattern.compile("\\$\\{['\"]([^\"]+)['\"]}");
    private static String makeOperand(Object o) {
        if (o instanceof BaseModelBean){
            BaseModelBean bean = (BaseModelBean) o;
            BeanPathNode pathNode = bean.getBeanPath().getNodeList().getLast();
            if (pathNode.getPathType().equals(PathMap.PATH_DOWNSTREAM)) {
                return pathNode.getAliasName() + ".id";
            }
            BeanPathNode sndPathNode = bean.getBeanPath().getNodeList().get(bean.getBeanPath().getNodeList().size() - 2);
//            Utils.debug(Utils.toJson(sndPathNode, true));
//            Utils.debug(Utils.toJson(pathNode, true));
            return sndPathNode.getAliasName() + "."+pathNode.getByPath();
        }
        if (o instanceof BaseAttribute){
            BaseAttribute attr = (BaseAttribute)o;
            BeanPathNode pathNode = attr.getContainerBean().getBeanPath().getNodeList().getLast();
            return pathNode.getAliasName()+"."+pathNode.getAttributeName();
        }
        return "?";
    }

    private static String makeParameter(Object o, String declaredPosition) {
        if (o instanceof BaseModelBean){
            return null;
        }
        if (o instanceof BaseAttribute){
            return null;
        }
        if (o instanceof Number){
            if (o instanceof Integer){
                return (Integer) o +"";
            }else{
                return String.valueOf(o);
            }
        }
        if (o instanceof Date){
            return '\''+Utils.format((Date)o, "yyyy-MM-dd HH:mm:ss")+'\'';
        }
        if (o instanceof String){
            String var = (String) o;
            Matcher m = ptnVariable.matcher(var);
            if (m.matches()){
                return Utils.nameAsThis(m.group(1));
            }
            m = ptnStringConst.matcher(var);
            if (m.matches()){
                return '\"' + Utils.nameAsThis(m.group(1)) + '\"';
            }
            return '"'+var+'"';
        }
        if (o instanceof EnumAttribute){
            return '"'+((EnumAttribute) o).getLiteralName()+'"';
        }
        if (o instanceof Boolean){
            return ((Boolean)o)?"true":"false";
        }
        Utils.error("尚不支持"+o.getClass().getSimpleName()+"类型的操作数 (" + declaredPosition+")");
        return null;
    }
}
