package com.terapico.query.utils;

public class LimitClauseUtil {
    public static String makeLimitClause() {
        return " LIMIT ?";
    }

    public static void makeLimitClause(QueryInfoUtil queryInfo) {
//        if (queryInfo.getTopNExpression() == null){
//            return " LIMIT ?";
//        }
//        // if such as: top("5")
//        // if such as: top("${xx}")
//        if (queryInfo.getTopNExpression().matches())
//            return " LIMIT:TODO ? ";

    }
}
