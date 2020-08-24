package com.terapico.query.utils;

import builder.Utils;
import builder.utils.Tree;
import cla.edg.modelbean.LogicalOperator;

import java.util.ArrayList;
import java.util.List;

public class WhereClauseUtil {
    public static String makeWhere(LogicalOperator lgExpr) {
        if (lgExpr == null){
            Utils.error("没有指定where条件");
        }

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

    private static String convertParamTreeToString(Tree<WhereSegment> tree) {
        StringBuilder sb = new StringBuilder();
        List<WhereSegment> whereSegments = tree.getByDeepFirstSearch();
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


        return String.join("\"\r\n            "+prefix+logicalType, childExp);
    }


    private static void addToTree(Tree<WhereSegment> tree, Tree.Node<WhereSegment> parentNode, LogicalOperator lgExpr) {
                WhereSegment newNode = new WhereSegment();
                if (lgExpr.getOperator() == null) {
                    newNode.type = andOr(lgExpr);
                    Tree.Node<WhereSegment> curTreeNode =null;
                    if (parentNode == null){
                        WhereSegment root = new WhereSegment();
                        curTreeNode = new Tree.Node<WhereSegment>();
                        curTreeNode.setData(newNode);
                        tree.setRoot(curTreeNode);
                    }else{
                        curTreeNode =tree.addLeaf(parentNode, newNode);
                    }
                    for (Object childOperand : lgExpr.getOperandList()) {
                        addToTree(tree, curTreeNode, (LogicalOperator) childOperand);
                    }
                }else{
                    newNode.type = "condition";
                    newNode.operator = SqlOperatorUtil.getSqlSymbolOfOperator(lgExpr.getOperator());
                    newNode.expression = SqlOperatorUtil.prepareOperands(lgExpr);
                    newNode.condition = SqlOperatorUtil.prepareConditionExpression(lgExpr);
                    newNode.params = SqlOperatorUtil.prepareParams(lgExpr);
                    if (parentNode == null){
                        Tree.Node<WhereSegment> curTreeNode = new Tree.Node<WhereSegment>();
                        curTreeNode.setData(newNode);
                        tree.setRoot(curTreeNode);
                    }else {
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
        return LogicalOperator.CollectionType.and.equals(whereScript.getCollectionType()) ? "logical_and" : "logical_or";
    }
}
