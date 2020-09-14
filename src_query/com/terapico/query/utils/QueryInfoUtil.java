package com.terapico.query.utils;

import cla.edg.modelbean.*;
import clariones.poc.pathmap.Connector;
import clariones.poc.pathmap.PathMap;
import clariones.tool.builder.Utils;

import java.util.*;


public class QueryInfoUtil extends BaseQueryInfoUtil {

    public static final String LEAD_SPACE = "\r\n            +\"";
    protected PathMap pathMap = null;
    protected String targetAlias;

    public static String getLeafAttrName(BaseAttribute attr) {
        LinkedList<BeanPathNode> list = attr.getContainerBean().getBeanPath().getNodeList();
        BeanPathNode lstNode = list.getLast();
        if (PathMap.PATH_UPSTREAM.equals(lstNode.getPathType()) && "id".equals(lstNode.getAttributeName())){
            BeanPathNode preNode = list.get(list.size()-2);
            return preNode.getAliasName()+"."+lstNode.getByPath();
        }
        return lstNode.getAliasName()+"."+lstNode.getAttributeName();
    }

    public String getSql() {

        Set<String> arc = new HashSet<>();
        pathMap = PathMapUtil.makePathMap(this.getWhereClause(), false, arc);
        targetAlias = PathMapUtil.mergeIntoPathMap(pathMap, this.getTargetModelTypeName(), this.getQueryName());
        if (this.getOrderByAttributes() != null){
            for (BaseAttribute attr : getOrderByAttributes()) {
                PathMapUtil.mergeIntoPathMap(pathMap, attr, arc);
            }
        }
//        PathMapUtil.mergeIntoPathMap(pathMap, this.getCountAttr());
        PathMapUtil.mergeIntoPathMap(pathMap, this.getCountByAttr(), arc);
        PathMapUtil.mergeIntoPathMap(pathMap, this.getSumAttr(), arc);
        PathMapUtil.mergeIntoPathMap(pathMap, this.getSumByAttr(), arc);
//        if(this.getWantsBeans() != null){
//            for (BaseModelBean wantsBean : getWantsBeans()) {
//                PathMapUtil.getAliasFromPathMap(pathMap, wantsBean);
//            }
//        }

        String selectClause = SelectClauseUtil.makeSelectClause(this, targetAlias);// "\"select DISTINCT "+targetAlias+".* from ";//
        String fromClause = SelectClauseUtil.makeFromClause(pathMap, arc);
        String whereClause = WhereClauseUtil.makeWhere(this.getWhereClause());
        String paginationClause = "";
        if (needPagination()){
            paginationClause = "\r\n            +(isEmpty(lastRecord)?\"\":(\"" + OrderByClauseUtil.makePaginationWhere(targetAlias, this.getOrderByAttributes())+"\"))";
        }
        String orderByClause = "";
        if (needOrderBy()) {
            orderByClause = LEAD_SPACE + OrderByClauseUtil.makeOrderByClause(targetAlias, this.getOrderByAttributes()) +"\"";
        }
        String limitClause = "";
        if (needLimit()){
            limitClause = LEAD_SPACE + LimitClauseUtil.makeLimitClause() +"\"";
        }


        return selectClause + fromClause
                +" where (" + whereClause +")\""
                + paginationClause
                + orderByClause
                + limitClause
                ;
    }

    public String getSingleSql() {
        Set<String> arc = new HashSet<>();
        pathMap = PathMapUtil.makePathMap(this.getWhereClause(), false, arc);
        targetAlias = PathMapUtil.mergeIntoPathMap(pathMap, this.getTargetModelTypeName(), this.getQueryName());
        if (this.getOrderByAttributes() != null){
            for (BaseAttribute attr : getOrderByAttributes()) {
                PathMapUtil.mergeIntoPathMap(pathMap, attr, arc);
            }
        }
//        PathMapUtil.mergeIntoPathMap(pathMap, this.getCountAttr());
        PathMapUtil.mergeIntoPathMap(pathMap, this.getCountByAttr(), arc);
        PathMapUtil.mergeIntoPathMap(pathMap, this.getSumAttr(), arc);
        PathMapUtil.mergeIntoPathMap(pathMap, this.getSumByAttr(), arc);
//        if(this.getWantsBeans() != null){
//            for (BaseModelBean wantsBean : getWantsBeans()) {
//                PathMapUtil.getAliasFromPathMap(pathMap, wantsBean);
//            }
//        }

        String selectClause = SelectClauseUtil.makeSingleQuerySelectClause(this);
        String fromClause = SelectClauseUtil.makeFromClause(pathMap, arc);
        String whereClause = WhereClauseUtil.makeWhere(this.getWhereClause());
        String groupByClause = WhereClauseUtil.makeGroupBy(this);



        return selectClause+"\"\r\n"
                +"            +\"" + fromClause
                +" where (" + whereClause +")\""
                + (groupByClause.isEmpty() ? "" : ("\r\n            +\"" + groupByClause+"\""))
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

    public List<Connector> getPaginationEnhanceNodes(String initVarName){
        List<Connector> result = new ArrayList<>();
        if (this.getOrderByAttributes() == null || this.getOrderByAttributes() == null){
            Utils.error("这个查询不应该有 翻页 的代码 ("+this.getWhereClause().getDeclaredPosition()+")");
            return result;
        }
        Stack<Connector> beans = new Stack<>();
        for (BaseAttribute attr : getOrderByAttributes()) {
            handleBeanEhancement(beans, pathMap, attr.getContainerBean(), initVarName);
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

    private void handleBeanEhancement(Stack<Connector> connectorStack, PathMap pathMap, BaseModelBean targetBean, String initVarName) {
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
                connector.getExtraData().put("srcVar", initVarName);
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

    public List<Connector> getWantsEnhanceConnectors(String initVarName){
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
            handleBeanEhancement(beans, pathMap, bean, initVarName);
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
        if (this.getCountAttr() != null || this.getCountByAttr()!=null){
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

    public Collection<? extends String> getRefferedBeanNames() {
        Set<String> nameSet = new HashSet<>();
        nameSet.add(Utils.NameAsThis(this.getTargetModelTypeName()));
        for (Object o : this.getWhereClause().getOperandList()) {
            addToNameSet(nameSet, o);
        }
        addToNameSet(nameSet, this.getCountByAttr());
        addToNameSet(nameSet, this.getSumAttr());
        addToNameSet(nameSet, this.getSumByAttr());
        if (this.getOrderByAttributes() != null){
            for (BaseAttribute orderByAttribute : getOrderByAttributes()) {
                addToNameSet(nameSet, orderByAttribute);
            }
        }
        if (this.getWantsBeans() != null){
            for (BaseModelBean wantsBean : this.getWantsBeans()) {
                addToNameSet(nameSet, wantsBean);
            }
        }
        return nameSet;
    }

    private void addToNameSet(Set<String> nameSet, Object o) {
        if (o == null){
            return;
        }
        if (o instanceof BaseAttribute){
            addBeanPathToNameSet(nameSet, ((BaseAttribute) o).getContainerBean());
            return;
        }
        if (o instanceof BaseModelBean){
            addBeanPathToNameSet(nameSet, ((BaseModelBean) o));
            return;
        }
        if (o instanceof LogicalOperator){
            for (Object o1 : ((LogicalOperator) o).getOperandList()) {
                addToNameSet(nameSet, o1);
            }
        }
    }

    private void addBeanPathToNameSet(Set<String> nameSet, BaseModelBean bean) {
        for (BeanPathNode beanPathNode : bean.getBeanPath().getNodeList()) {
            nameSet.add(Utils.NameAsThis(beanPathNode.getBeanName()));
        }
    }
}
