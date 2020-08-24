package com.terapico.query.utils;

import builder.Utils;
import cla.edg.modelbean.*;
import clariones.poc.pathmap.Connector;
import clariones.poc.pathmap.PathMap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class QueryInfoUtil extends BaseQueryInfoUtil {

    public static final String LEAD_SPACE = "\r\n            +\"";
    protected PathMap pathMap = null;
    protected String targetAlias;

    public String getSql() {
        pathMap = PathMapUtil.makePathMap(this.getWhereClause(), false);
        targetAlias = PathMapUtil.mergeIntoPathMap(pathMap, this.getTargetModelTypeName());
        if (this.getOrderByAttributes() != null){
            for (BaseAttribute attr : getOrderByAttributes()) {
                PathMapUtil.mergeIntoPathMap(pathMap, attr);
            }
        }
//        PathMapUtil.mergeIntoPathMap(pathMap, this.getCountAttr());
        PathMapUtil.mergeIntoPathMap(pathMap, this.getCountByAttr());
        PathMapUtil.mergeIntoPathMap(pathMap, this.getSumAttr());
        PathMapUtil.mergeIntoPathMap(pathMap, this.getSumByAttr());
//        if(this.getWantsBeans() != null){
//            for (BaseModelBean wantsBean : getWantsBeans()) {
//                PathMapUtil.getAliasFromPathMap(pathMap, wantsBean);
//            }
//        }

        String selectClause = "select DISTINCT("+targetAlias+".*) from";// SelectClauseUtil.makeSelectClause(this);
        String fromClause = SelectClauseUtil.makeFromClause(pathMap);
        String whereClause = WhereClauseUtil.makeWhere(this.getWhereClause());
        String paginationClause = "";
        if (needPagination()){
            paginationClause = "\r\n            +isEmpty(lastRecord)?\"\":(\"" + OrderByClauseUtil.makePaginationWhere(targetAlias, this.getOrderByAttributes())+"\")";
        }
        String orderByClause = "";
        if (needOrderBy()) {
            orderByClause = LEAD_SPACE + OrderByClauseUtil.makeOrderByClause(targetAlias, this.getOrderByAttributes()) +"\"";
        }
        String limitClause = "";
        if (needLimit()){
            limitClause = LEAD_SPACE + LimitClauseUtil.makeLimitClause();
        }


        return selectClause+"\"\r\n"
                +"            +\"" + fromClause
                +" where (" + whereClause +")\""
                + paginationClause
                + orderByClause
                + limitClause
                ;
    }

    public String getSingleSql() {
        pathMap = PathMapUtil.makePathMap(this.getWhereClause(), false);
        targetAlias = PathMapUtil.mergeIntoPathMap(pathMap, this.getTargetModelTypeName());
        if (this.getOrderByAttributes() != null){
            for (BaseAttribute attr : getOrderByAttributes()) {
                PathMapUtil.mergeIntoPathMap(pathMap, attr);
            }
        }
//        PathMapUtil.mergeIntoPathMap(pathMap, this.getCountAttr());
        PathMapUtil.mergeIntoPathMap(pathMap, this.getCountByAttr());
        PathMapUtil.mergeIntoPathMap(pathMap, this.getSumAttr());
        PathMapUtil.mergeIntoPathMap(pathMap, this.getSumByAttr());
//        if(this.getWantsBeans() != null){
//            for (BaseModelBean wantsBean : getWantsBeans()) {
//                PathMapUtil.getAliasFromPathMap(pathMap, wantsBean);
//            }
//        }

        String selectClause = SelectClauseUtil.makeSingleQuerySelectClause(this);
        String fromClause = SelectClauseUtil.makeFromClause(pathMap);
        String whereClause = WhereClauseUtil.makeWhere(this.getWhereClause());



        return selectClause+"\"\r\n"
                +"            +\"" + fromClause
                +" where (" + whereClause +")\""
                ;
    }

    public String getParamSetters() {
        if (this.getWhereClause() == null){
            return "";
        }
        return WhereClauseUtil.makeWhereParams(getWhereClause());
    }
    private boolean needLimit() {
	    if (needPagination()){
	        return true;
        }
        return this.getTopNExpression() != null;
    }

    private boolean needPagination() {
	    return this.isPagination();
    }

    public List<Connector> getPaginationEnhanceNodes(){
        List<Connector> result = new ArrayList<>();
        if (this.getOrderByAttributes() == null || this.getOrderByAttributes() == null){
            Utils.error("这个查询不应该有 翻页 的代码 ("+this.getWhereClause().getDeclaredPosition()+")");
            return result;
        }
        Stack<Connector> beans = new Stack<>();
        for (BaseAttribute attr : getOrderByAttributes()) {
            handleBeanEhancement(beans, pathMap, attr.getContainerBean());
            while(!beans.isEmpty()) {
                Connector c = beans.pop();
                if (alreadyInStack(result, c)) {
                    continue;
                }
                result.add(c);
            }
        }

        Utils.debug("enhance for ("+this.getWhereClause().getDeclaredPosition()+")");
        for (Connector o : result) {
            Utils.debug("\tBean %s, alias = %s, type=%s",
                    o.getFootHolderName(), o.getAliasName(),o.getPathType());
        }
        return result;
    }

    private void handleBeanEhancement(Stack<Connector> connectorStack, PathMap pathMap, BaseModelBean targetBean) {
        BeanPathNode lastNode = targetBean.getBeanPath().getNodeList().getLast();
        String beanConnectorName = lastNode.getAliasName();
        Connector connector = pathMap.getConnectorByAliasName(beanConnectorName);
        if (connector == null){
            Utils.error("order by的路径不对("+this.getWhereClause().getDeclaredPosition()+")");
        }
        while(connector != null){
            if (connector.getUpstream() != null && !connector.getUpstream().getAliasName().equals(targetAlias)) {
                connector.getExtraData().put("srcVar", Utils.nameAsThis(connector.getUpstream().getAliasName())+"List");
            }else{
                connector.getExtraData().put("srcVar", "list");
            }
            if (connector.getPathType() == null){

            }else if (connector.getPathType().equals(PathMap.PATH_DOWNSTREAM)){
                connector.getExtraData().put("methodName", connector.getMemberName());
            }

            connectorStack.push(connector);
            connector = connector.getUpstream();
        }
    }

    private boolean alreadyInStack(List<Connector> connectorStack, Connector connector) {
        if (connectorStack == null || connectorStack.isEmpty()){
            return false;
        }
        return connectorStack.stream().filter(it->it.getAliasName().equals(connector.getAliasName()))
                .findFirst().isPresent();
    }

    public List<String> getOrderByGetters(){
        LinkedList<BaseAttribute> attrs = getOrderByAttributes();
        if (attrs == null || attrs.isEmpty()){
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        for(int i=0;i<attrs.size();i++){

            for(int j=0;j<=i;j++){
                BaseAttribute attr = attrs.get(j);
                String beanName = attr.getContainerBean().getBeanPath().getNodeList().getLast().getAliasName();
                if (targetAlias.equals(beanName)){
                    beanName = "lastRecord";
                }
                String attrName = attr.getName();
                result.add(Utils.nameAsThis(beanName)+".get"+Utils.NameAsThis(attrName)+"()");
            }
        }
        return result;
    }

    public List<Connector> getWantsEnhanceConnectors(){
        if (this.getWantsBeans() == null || this.getWantsBeans().isEmpty()){
            return new ArrayList<>();
        }
        for (BaseModelBean wantedBean : getWantsBeans()) {
            PathMapUtil.getAliasFromPathMap(pathMap, wantedBean);
        }
        // 输出的结果要加两个变量: 1-srcVar: 从哪个地方来的,即以谁为起点来做enhance; 2-methodName: 用什么方法. 只有 downstream list才需要
        List<Connector> result = new ArrayList<>();
        Stack<Connector> beans = new Stack<>();
        for (BaseModelBean bean : getWantsBeans()) {
            handleBeanEhancement(beans, pathMap, bean);
            while(!beans.isEmpty()) {
                Connector c = beans.pop();
                if (alreadyInStack(result, c)) {
                    continue;
                }
                result.add(c);
            }
        }

        Utils.debug("enhance wanted ("+this.getWhereClause().getDeclaredPosition()+")");
        for (Connector o : result) {
            Utils.debug("\tBean %s, alias = %s, type=%s",
                    o.getFootHolderName(), o.getAliasName(),o.getPathType());
        }
        return result;
    }

    public String getMethodPrefix(){
        if (this.getCountAttr() != null){
            return "count";
        }
        if (this.getSumAttr() != null){
            return "sum";
        }
        return "find";
    }

    public String getSingleQueryResultType(){
        if (countAttr != null){
            return "Integer";
        }
        if (countByAttr != null){
            return "Map<String, Integer>";
        }
        if (sumByAttr != null){
            if (sumByAttr.getModelTypeName().equals("int")){
                return "Map<String, Integer>";
            }else{
                return "Map<String, BigDecimal>";
            }
        }
        if (sumAttr != null){
            if (sumAttr.getModelTypeName().equals("int")){
                return "Integer";
            }else{
                return "BigDecimal";
            }
        }

        return null;
    }
}
