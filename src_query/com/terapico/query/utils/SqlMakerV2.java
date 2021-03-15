package com.terapico.query.utils;

import cla.edg.modelbean.BaseModelBean;
import cla.edg.modelbean.LogicalOperator;
import clariones.poc.pathmap.PathMap;

public class SqlMakerV2 {
    public static void test(PathMap pathMap, LogicalOperator whereClause) {
        StringBuilder sb = new StringBuilder();
        makeWhere(sb, "", pathMap, whereClause);
    }

    private static void makeWhere(StringBuilder sb, String prefix, PathMap pathMap, LogicalOperator whereClause) {
        int curIndex = 0;
        int lastIndex = whereClause.getOperandList().size() - 1;
        String newPrefix = prefix+"  ";
        for (Object o : whereClause.getOperandList()) {
            if (o instanceof LogicalOperator) {
                LogicalOperator lo = (LogicalOperator) o;
                if (curIndex != 0){
                    System.out.println(prefix+") "+SqlKeys.convertCollectionType(whereClause.getCollectionType(), false)+" (");
                }else{
                    System.out.println(prefix+SqlKeys.convertCollectionType(whereClause.getCollectionType(),true)+"(");
                }
                makeWhere(sb, newPrefix, pathMap, lo);
                if (curIndex == lastIndex){
                    System.out.println(prefix+")");
                }
            }else if (o instanceof BaseModelBean){
                makeWhere(sb, newPrefix, pathMap, (BaseModelBean) o);
            }else if (o instanceof String){
                makeWhere(sb, newPrefix, pathMap, (String) o);
            }else if (o instanceof Boolean){
                makeWhere(sb, newPrefix, pathMap, (Boolean) o);
            }else if (o instanceof Number){
                makeWhere(sb, newPrefix, pathMap, (Number) o);
            }else{
                System.out.println("need handle operand " + o.getClass().getSimpleName());
            }
            curIndex++;
        }

    }

    private static void makeWhere(StringBuilder sb, String prefix, PathMap pathMap, BaseModelBean bean) {
        System.out.println("  process " + bean.getBeanPath().getNodeList());
    }
    private static void makeWhere(StringBuilder sb, String prefix, PathMap pathMap, String exp) {
        System.out.println("  process " + exp);
    }
    private static void makeWhere(StringBuilder sb, String prefix, PathMap pathMap, Boolean exp) {
        System.out.println("  process " + exp);
    }
    private static void makeWhere(StringBuilder sb, String prefix, PathMap pathMap, Number exp) {
        System.out.println("  process " + exp);
    }
}
