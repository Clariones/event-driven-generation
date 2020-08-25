package com.terapico.query.utils;

import cla.edg.modelbean.BaseAttribute;
import cla.edg.modelbean.BeanPathNode;

import java.util.LinkedList;

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
            if (attr.getOrderByInstruction().equals("pinyin")){
                sb.append("CONVERT("); //CONVERT(T1.name  USING GBK)
            }
            sb.append(lastNode.getAliasName())
                    .append(".").append(lastNode.getAttributeName());
            if (attr.getOrderByInstruction().equals("pinyin")){
                sb.append("  USING GBK)"); //CONVERT(T1.name  USING GBK)
            }
            sb.append(" ").append(attr.getOrderByDirection());
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
            if (attr.getOrderByInstruction().equals("pinyin")){
                sb.append("CONVERT("); //CONVERT(T1.name  USING GBK)
            }
            sb.append(lastNode.getAliasName()).append('.').append(lastNode.getAttributeName());
            if (attr.getOrderByInstruction().equals("pinyin")){
                sb.append("  USING GBK)"); //CONVERT(T1.name  USING GBK)
            }
            if ("desc".equals(attr.getOrderByDirection())) {
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
