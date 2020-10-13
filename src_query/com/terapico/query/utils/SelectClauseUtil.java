package com.terapico.query.utils;

import cla.edg.modelbean.BaseAttribute;
import cla.edg.modelbean.BeanPathNode;
import clariones.poc.pathmap.Connector;
import clariones.poc.pathmap.FootHolder;
import clariones.poc.pathmap.PathMap;
import clariones.tool.builder.Utils;
import clariones.tool.builder.utils.Tree;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SelectClauseUtil {

    public static String makeFromClause(PathMap pathMap, Set<String> attrRelatedConnectors) {
        List<FootHolder> allNodes = pathMap.getAll();
        Set<String> usedAlias = new HashSet<>();
        boolean first = true;
        StringBuilder sb = new StringBuilder();
        for (FootHolder node : allNodes) {
            if (!isStartNode(node)){
                continue;
            }
            Connector connector = node.getConnectors().values().iterator().next();
            Tree<Connector> tree = pathMap.getTreeFrom(connector);
            makeFromClauseByTree(sb, first, tree, attrRelatedConnectors);
            first = false;
        }
        return sb.toString();
    }

    private static String prefix = "            +\"";
    private static void makeFromClauseByTree(StringBuilder sb, boolean first, Tree<Connector> tree, Set<String> attrRelatedConnectors) {
        if (!first){
            sb.append(", ");
        }
        Set<String> leafAlias = new HashSet<>();
        List<Connector> connectors = tree.getByDeepFirstSearch((node, type)->{
            if (type.equals("is_leaf")){
                Connector c = node.getData();
                if (!node.isLeaf()){
                    return;
                }
                if (c.getPathType() == null || c.getPathType().equals(PathMap.PATH_DOWNSTREAM)){
                    return;
                }
                if (attrRelatedConnectors.contains(c.getAliasName())){
                    return;
                }
                // Utils.debug(Utils.toJson(c, true));
                leafAlias.add(c.getAliasName());
                // Utils.debug(c.getAliasName()+" lllllll");
            }
        });
        Connector fstConnector = connectors.get(0);
        sb.append(' ').append(TABLE_NAME(fstConnector.getFootHolderName())).append(' ')
                .append(fstConnector.getAliasName())
                .append(" \"\r\n").append(prefix);
        for(int i=1;i<connectors.size();i++){
            Connector connector = connectors.get(i);

            if (leafAlias.contains(connector.getAliasName())){
                Utils.debug(connector.getAliasName()+" 111111");
                // continue;
            }

            sb.append(" LEFT JOIN ").append(TABLE_NAME(connector.getFootHolderName())).append(' ')
                    .append(connector.getAliasName()).append(" ON ");
            String upstreamAlias = connector.getUpstream().getAliasName();
            if (connector.getPathType().equals(PathMap.PATH_UPSTREAM)){
                sb.append(connector.getAliasName()).append(".id=").append(upstreamAlias)
                        .append(".").append(connector.getPathName()).append(" \"\r\n").append(prefix);
            }else{
                sb.append(connector.getAliasName()).append(".").append(connector.getPathName())
                        .append("=").append(upstreamAlias).append(".id \"\r\n").append(prefix);
            }
        }
    }

    private static String TABLE_NAME(String name) {
        return Utils.name_as_this(name)+"_data";
    }

    private static boolean isStartNode(FootHolder node) {
        return node.isStartNode();
    }

//    public static String makeSelectClause(QueryInfoUtil queryInfoUtil) {
//        return "select DISTINCT("++".* from";
//    }

    public static String makeSingleQuerySelectClause(QueryInfoUtil info) {
        if (info.countAttr != null){
            return "\"select COUNT( DISTINCT "+info.targetAlias+".id) from ";
        }
        if (info.countByAttr != null){
            return "\"select " +QueryInfoUtil.getLeafAttrName(info.countByAttr)+" as id," +
                    " COUNT(*) as count from ";
        }
        if (info.sumByAttr != null){
            BeanPathNode lstByNode = info.sumByAttr.getContainerBean().getBeanPath().getNodeList().getLast();
            BeanPathNode lstNode = info.sumAttr.getContainerBean().getBeanPath().getNodeList().getLast();
            return "\"select "+lstByNode.getAliasName()+"."+lstByNode.getAttributeName()+" as id, SUM("
                    + lstNode.getAliasName()+"."+lstNode.getAliasName()+") as sum from ";
        }
        if (info.sumAttr != null){
            BeanPathNode lstNode = info.sumAttr.getContainerBean().getBeanPath().getNodeList().getLast();
            return "\"select SUM(" + lstNode.getAliasName()+"."+lstNode.getAttributeName()+") as sum from ";
        }
        return "\"select DISTINCT "+info.targetAlias+".* from ";// 没考虑到的情况, 就触发个空指针异常吧
    }

    public static String makeSelectClause(QueryInfoUtil queryInfo, String targetAlias) {

        StringBuilder selectClause = new StringBuilder("\"select DISTINCT " + targetAlias + ".* ");
        if (queryInfo.getOrderByAttributes() == null || queryInfo.getOrderByAttributes().isEmpty()){
            return selectClause.append("from ").toString();
        }
        for (BaseAttribute orderByAttribute : queryInfo.getOrderByAttributes()) {
            String name = QueryInfoUtil.getLeafAttrName(orderByAttribute);
            if (name.startsWith(targetAlias)){
                continue;
            }
            selectClause.append(", ").append(name).append(" ");
        }
        return selectClause.append("from ").toString();
    }
}
