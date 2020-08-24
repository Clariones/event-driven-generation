package com.terapico.query.utils;

import builder.Utils;
import builder.utils.Tree;
import cla.edg.modelbeanv2.BaseAttribute;
import cla.edg.modelbeanv2.BeanPathNode;
import cla.edg.modelbeanv2.LogicalOperator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OrderByClauseUtil {

    public static String makeOrderByClause(String targetAlias, LinkedList<BaseAttribute> orderByAttributes) {
        if (orderByAttributes == null || orderByAttributes.isEmpty()) {
            return " ORDER BY " + targetAlias+".id desc ";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" ORDER BY ");
        boolean isFirst = true;
        for (BaseAttribute attr : orderByAttributes) {
            if (!isFirst){
                sb.append(", ");
            }
            BeanPathNode lastNode = attr.getContainerBean().getBeanPath().getNodeList().getLast();
            sb.append(lastNode.getAliasName())
                    .append(".").append(lastNode.getAttributeName())
                    .append(" ").append(attr.getOrderByInstruction());
            isFirst = false;
        }
        return sb.toString();
    }

    public static String makePaginationWhere(String targetAlias, LinkedList<BaseAttribute> orderByAttributes) {
        if (orderByAttributes == null || orderByAttributes.isEmpty()){
            return String.format(" AND %s.id <= ? ", targetAlias);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" AND (");
        int caseNum = orderByAttributes.size();
        for(int i=0;i<caseNum;i++){
            sb.append(i==0?"(":") OR (" ).append(makePaginationSegment(orderByAttributes, i+1, i==(caseNum-1)));
        }
        sb.append("))");
        return sb.toString();
    }

    private static String makePaginationSegment(LinkedList<BaseAttribute> attrs, int conditionNum, boolean isLast) {
        StringBuilder sb = new StringBuilder("(");
        for(int i=0;i<conditionNum;i++){
            boolean isLastCond = i == (conditionNum-1);
            BaseAttribute attr = attrs.get(i);
            BeanPathNode lastNode = attr.getContainerBean().getBeanPath().getNodeList().getLast();
            sb.append(lastNode.getAliasName()).append('.').append(lastNode.getAttributeName());
            if ("desc".equals(attr.getOrderByInstruction())) {
                // 降序
                if (isLastCond){
                    sb.append(isLast?" <= ?":" < ?");
                }else{
                    sb.append(" = ?) AND (");
                }
            }else{
                if (isLastCond){
                    sb.append(isLast?" >= ?":" > ?");
                }else{
                    sb.append(" = ?) AND (");
                }
            }
        }
        return sb.append(")").toString();
    }
}
