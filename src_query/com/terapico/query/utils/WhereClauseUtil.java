package com.terapico.query.utils;

import cla.edg.modelbean.BeanPathNode;
import cla.edg.modelbean.LogicalOperator;
import clariones.tool.builder.Utils;
import clariones.tool.builder.utils.Tree;

import java.util.ArrayList;
import java.util.List;

public class WhereClauseUtil {
    private static int exitsCnt = 1;
    public static String makeWhere(LogicalOperator lgExpr) {
        if (lgExpr == null){
            Utils.error("没有指定where条件");
        }
        exitsCnt = 1;
        Tree<WhereSegment> tree = new Tree<>();
        addToTree(tree, null, lgExpr);

        // Utils.debug("where clause tree: " + Utils.toJson(tree, true));

        return convertToString(tree);
    }

    public static String makeWhereParams(LogicalOperator lgExpr) {
        if (lgExpr == null){
            return "";
        }

        Tree<WhereSegment> tree = new Tree<>();
        addToTree(tree, null, lgExpr);

        // Utils.debug("where clause tree: " + Utils.toJson(tree, true));

        return convertParamTreeToString(tree);
    }

    public static String makeGroupBy(QueryInfoUtil queryInfo) {
        if (queryInfo.getCountAttr() != null){
            return "";
        }

        if (queryInfo.getCountByAttr() != null){
            return " GROUP BY " + QueryInfoUtil.getLeafAttrName(queryInfo.getCountByAttr()) + " ";
//                    lstNode.getAliasName()+"."+lstNode.getAttributeName()+" ";
        }

        if (queryInfo.getSumByAttr() != null){
            BeanPathNode lstNode = queryInfo.getSumByAttr().getContainerBean().getBeanPath().getNodeList().getLast();
            return " GROUP BY " + lstNode.getAliasName()+"."+lstNode.getAttributeName()+" ";
        }
        // Utils.debug("where clause tree: " + Utils.toJson(tree, true));

       return "";
    }


    private static String convertParamTreeToString(Tree<WhereSegment> tree) {
        StringBuilder sb = new StringBuilder();
        List<WhereSegment> whereSegments = tree.getByDeepFirstSearch(null);
        boolean first = true;
        for (WhereSegment whereSegment : whereSegments) {
            if (Utils.isBlank(whereSegment.params)){
                continue;
            }
            if (!first){
                sb.append("\r\n        ");
            }else{
                first = false;
            }
            sb.append("addParam(params,").append(whereSegment.params).append(");");
        }
        return sb.toString();
    }

    private static String convertToString(Tree<WhereSegment> tree) {
        StringBuilder sb = new StringBuilder();
        Tree.Node<WhereSegment> root = tree.getRoot();
        String rst = convertToString("+\" ", root);
        Utils.debug('"'+rst+'"');
        return rst;
    }

    private static String convertToString(String prefix, Tree.Node<WhereSegment> node) {
        WhereSegment data =  node.getData();
        String str = "";
        String logicalType = "";
        if (data.type.equals("logical_and")){
            logicalType = " AND ";
        }else if (data.type.equals("logical_or")){
            logicalType = " OR ";
        }else if (data.type.equals("where_exists")){
            logicalType = " EXISTS ";
        }else if (data.type.equals("where_not_exists")){
            logicalType = " NOT EXISTS ";
        }else if (data.type.equals("condition")){
            //
        }else{
            throw new RuntimeException("不支持 " + data.type);
        }
        if (node.isLeaf()){
            if (data.condition != null){
                return "\"+"+data.condition+"\"" + data.expression;
            }
            return data.expression;
        }
        List<String> childExp = new ArrayList<>();
        for (Tree.Node<WhereSegment> child : node.getChildren()) {
            if (data.condition == null){
                childExp.add("(" + convertToString(prefix + "  ", child) + ")");
            }else {
                childExp.add("(\"+" + data.condition+"+\""+convertToString(prefix + "  ", child));
            }
        }

        switch (logicalType){
            case " AND ":
            case " OR ":
            case "":
                return String.join("\"\r\n            "+prefix+logicalType, childExp);
        }
        Utils.debug("now node=%s", Utils.toJson(node));
        Utils.debug("it's %s", node.getChildren().get(0).getData().getClass());
        return "\"\r\n            "+prefix+logicalType+"(select "
                + "\"+existsSelect(queryName,"+ exitsCnt++ +")+\""//  + makeWhere(node.getChildren().get(0).getData());
                +" where "+childExp.get(0)+")";

    }


    private static void addToTree(Tree<WhereSegment> tree, Tree.Node<WhereSegment> parentNode, LogicalOperator lgExpr) {
        WhereSegment newNode = new WhereSegment();
        if (lgExpr.getOperator() == null) {
            newNode.type = andOr(lgExpr);
            if (newNode.type.contains("exists")){
                Utils.debug("now add it to tree: %s", Utils.toJson(lgExpr));
            }
            Tree.Node<WhereSegment> curTreeNode = null;
            if (parentNode == null) {
                WhereSegment root = new WhereSegment();
                curTreeNode = new Tree.Node<WhereSegment>();
                curTreeNode.setData(newNode);
                tree.setRoot(curTreeNode);
            } else {
                curTreeNode = tree.addLeaf(parentNode, newNode);
            }
            for (Object childOperand : lgExpr.getOperandList()) {
                addToTree(tree, curTreeNode, (LogicalOperator) childOperand);
            }
        } else {
            newNode.type = "condition";
            newNode.operator = SqlOperatorUtil.getSqlSymbolOfOperator(lgExpr.getOperator());
            newNode.expression = SqlOperatorUtil.prepareOperands(lgExpr);
            newNode.condition = SqlOperatorUtil.prepareConditionExpression(lgExpr);
            newNode.params = SqlOperatorUtil.prepareParams(lgExpr);
            if (parentNode == null) {
                Tree.Node<WhereSegment> curTreeNode = new Tree.Node<WhereSegment>();
                curTreeNode.setData(newNode);
                tree.setRoot(curTreeNode);
            } else {
                tree.addLeaf(parentNode, newNode);
            }
        }
    }

//    private static void addToTree2(Tree<WhereSegment> tree, Tree.Node<WhereSegment> parentNode, LogicalOperator whereScript) {
//        for (Object operand : whereScript.getOperandList()) {
//            if (operand instanceof LogicalOperator){
//                WhereSegment newNode = new WhereSegment();
//                LogicalOperator lgExpr = (LogicalOperator) operand;
//                if (lgExpr.getOperator() == null) {
//                    newNode.type = andOr(lgExpr);
//                    Tree.Node<WhereSegment> curTreeNode = tree.addLeaf(parentNode, newNode);
//                    for (Object childOperand : lgExpr.getOperandList()) {
//                        addToTree(tree, curTreeNode, (LogicalOperator) childOperand);
//                    }
//                }else{
//                    newNode.type = "condition";
//                    newNode.operator = SqlOperatorUtil.getSqlSymbolOfOperator(lgExpr.getOperator());
//                    newNode.expression = SqlOperatorUtil.prepareOperands(lgExpr);
//                    tree.addLeaf(parentNode, newNode);
//                }
//            }
//        }
//    }









    private static String andOr(LogicalOperator whereScript) {
        switch (whereScript.getCollectionType()){
            case and: return "logical_and";
            case or: return "logical_or";
            case exists: return "where_exists";
            case not_exists: return "where_not_exists";
        }
        throw new RuntimeException("无法处理"+ whereScript.getCollectionType());
    }
}
