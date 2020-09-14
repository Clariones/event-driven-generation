package com.terapico.query.utils;

import cla.edg.modelbean.*;
import clariones.poc.pathmap.InMemoryPathMapImpl;
import clariones.poc.pathmap.PathMap;
import clariones.tool.builder.Utils;

import java.util.HashSet;
import java.util.Set;

public class PathMapUtil {
    public static PathMap makePathMap(LogicalOperator whereClause, boolean beRelated, Set<String> attrRelatedConnectors) {
        PathMap resultMap = new InMemoryPathMapImpl();
        Set<String> sets = getAliasNameByMergeIntoPathMap(resultMap, whereClause, beRelated);
        attrRelatedConnectors.addAll(sets);
        return resultMap;
        // debug("PathMap="+Utils.toJson(resultMap, true));
    }

    /**
     * 把必要的路径合并起来,给每个特定的'通过条件'指定一个唯一的 别名
     * @param resultMap
     * @param whereClause
     * @param beRelated
     */
    private static Set<String> getAliasNameByMergeIntoPathMap(PathMap resultMap, LogicalOperator whereClause, boolean beRelated) {
        Set<String> attrRelatedConnectors = new HashSet<>();
        if (whereClause == null) {
            return attrRelatedConnectors;
        }
        if (whereClause.getOperandList() == null || whereClause.getOperandList().isEmpty()){
            return attrRelatedConnectors;
        }
        for (Object o : whereClause.getOperandList()) {
            if (o == null){
                continue;
            }
            if (o instanceof LogicalOperator){
                Set<String> sets = getAliasNameByMergeIntoPathMap(resultMap, (LogicalOperator) o, beRelated);
                attrRelatedConnectors.addAll(sets);
                continue;
            }
            if (o instanceof BaseModelBean){
                BaseModelBean mbean = (BaseModelBean)o;
                getAliasNameByMergeIntoPathMap(resultMap, mbean, beRelated);
                continue;
            }
            if (o instanceof BaseAttribute){
                BaseAttribute attr = (BaseAttribute) o;
                getAliasNameByMergeIntoPathMap(resultMap, attr.getContainerBean(), beRelated);
                for (BeanPathNode beanPathNode : attr.getContainerBean().getBeanPath().getNodeList()) {
                    attrRelatedConnectors.add(beanPathNode.getAliasName());
                }
                continue;
            }
            if (o instanceof String){
                continue;
            }
            if (o instanceof Number){
                continue;
            }

            Utils.debug("不知道怎么处理 %s:%s", o.getClass().getSimpleName(), String.valueOf(o));
        }
        return attrRelatedConnectors;
    }



    private static void getAliasNameByMergeIntoPathMap(PathMap resultMap, BaseModelBean bean, boolean beRelated) {
        BeanPath beanPath = bean.getBeanPath();
        boolean isFirst = true;
        for (BeanPathNode node : beanPath.getNodeList()) {
            if (isFirst){
                String t1 = resultMap.startFrom(node.getBeanName(), beRelated, bean.declaredPostion());
                if (t1 == null){
                    Utils.error("找不到%s, 请检查指定的路径(%s)", node.getBeanName(), bean.declaredPostion());
                }
                node.setAliasName(t1);
                isFirst = false;
            }else{
                String t2 = resultMap.toNode(node.getBeanName(), node.getByPath(), node.getPathType(), node.getMemberName());
                node.setAliasName(t2);
            }
        }
    }

    public static String mergeIntoPathMap(PathMap pathMap, String nodeName, String declaredPostion) {
        return pathMap.startFrom(nodeName, true, declaredPostion);
    }
    public static void mergeIntoPathMap(PathMap pathMap, BaseAttribute attr,Set<String> attrRelatedConnectors) {
        if (attr == null){
            return;
        }
         getAliasNameByMergeIntoPathMap(pathMap, attr.getContainerBean(), true);
        for (BeanPathNode beanPathNode : attr.getContainerBean().getBeanPath().getNodeList()) {
            attrRelatedConnectors.add(beanPathNode.getAliasName());
        }
    }

    public static void getAliasFromPathMap(PathMap pathMap, BaseModelBean bean) {
        getAliasNameByMergeIntoPathMap(pathMap,bean,true);
    }
}
