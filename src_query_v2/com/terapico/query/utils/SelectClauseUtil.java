package com.terapico.query.utils;

import builder.Utils;
import builder.utils.Tree;
import cla.edg.modelbeanv2.BeanPathNode;
import clariones.poc.pathmap.Connector;
import clariones.poc.pathmap.FootHolder;
import clariones.poc.pathmap.PathMap;
import com.terapico.query.builder.QueryBuilderV2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SelectClauseUtil {

    public static String makeFromClause(PathMap pathMap) {
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
            makeFromClauseByTree(sb, first, tree);
            first = false;
        }
        return sb.toString();
    }

    private static String prefix = "            +\"";
    private static void makeFromClauseByTree(StringBuilder sb, boolean first, Tree<Connector> tree) {
        if (!first){
            sb.append(", ");
        }
        List<Connector> connectors = tree.getByDeepFirstSearch();
        Connector fstConnector = connectors.remove(0);
        sb.append(' ').append(TABLE_NAME(fstConnector.getFootHolderName())).append(' ')
                .append(fstConnector.getAliasName()).append(" \"\r\n").append(prefix);
        for (Connector connector : connectors) {
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
            return "select COUNT("+info.targetAlias+".id) from ";
        }
        if (info.countByAttr != null){
            BeanPathNode lstNode = info.countByAttr.getContainerBean().getBeanPath().getNodeList().getLast();
            return "select " + lstNode.getAliasName()+".id, COUNT(1) from ";
        }
        if (info.sumByAttr != null){
            BeanPathNode lstByNode = info.sumByAttr.getContainerBean().getBeanPath().getNodeList().getLast();
            BeanPathNode lstNode = info.sumAttr.getContainerBean().getBeanPath().getNodeList().getLast();
            return "select "+lstByNode.getAliasName()+"."+lstByNode.getAliasName()+", SUM("
                    + lstNode.getAliasName()+"."+lstNode.getAliasName()+") from ";
        }
        if (info.sumAttr != null){
            BeanPathNode lstNode = info.sumAttr.getContainerBean().getBeanPath().getNodeList().getLast();
            return "select SUM(" + lstNode.getAliasName()+"."+lstNode.getAliasName()+") from ";
        }
        return null; // 没考虑到的情况, 就触发个空指针异常吧
    }
}
