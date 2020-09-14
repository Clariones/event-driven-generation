package com.terapico.query.utils;

import cla.edg.modelbean.BaseAttribute;
import cla.edg.modelbean.BaseModelBean;
import cla.edg.modelbean.LogicalOperator;

import java.util.LinkedList;

public class BaseQueryInfoUtil {
    protected String targetModelTypeName;
    protected String queryName;
    protected boolean querySingle;
    protected boolean pagination;
    protected LogicalOperator whereClause;
    protected LinkedList<BaseAttribute> orderByAttributes;
    protected LinkedList<BaseModelBean> wantsBeans;
    protected BaseAttribute countAttr;
    protected BaseAttribute countByAttr;
    protected BaseAttribute sumByAttr;
    protected BaseAttribute sumAttr;
    protected String topNExpression;


    public String getQueryName() {
        return queryName;
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }

    public LogicalOperator getWhereClause() {
        return whereClause;
    }

    public void setWhereClause(LogicalOperator whereClause) {
        this.whereClause = whereClause;
    }

    public LinkedList<BaseAttribute> getOrderByAttributes() {
        if (orderByAttributes == null) {
            orderByAttributes = new LinkedList<>();
        }
        return orderByAttributes;
    }

    public void setOrderByAttributes(LinkedList<BaseAttribute> orderByAttributes) {
        this.orderByAttributes = orderByAttributes;
    }

    public void addOrderBy(BaseAttribute attr) {
        getOrderByAttributes().add(attr);
    }
    public void addOrderBy(String expression) {
        getOrderByAttributes().add(new ExpressionAttr(expression));
    }

    public void setOrderByDirection(String orderByWay) {
        getOrderByAttributes().getLast().setOrderByDirection(orderByWay);
        getOrderByAttributes().getLast().setOrderByInstruction("native");
    }
    public void setOrderByPinyinDirection(String orderByWay) {
        getOrderByAttributes().getLast().setOrderByDirection(orderByWay);
        getOrderByAttributes().getLast().setOrderByInstruction("pinyin");
    }

    public LinkedList<BaseModelBean> getWantsBeans() {
        return wantsBeans;
    }

    public void setWantsBeans(LinkedList<BaseModelBean> wantsBeans) {
        this.wantsBeans = wantsBeans;
    }

    public BaseAttribute getCountAttr() {
        return countAttr;
    }

    public void setCountAttr(BaseAttribute countAttr) {
        this.countAttr = countAttr;
    }

    public BaseAttribute getCountByAttr() {
        return countByAttr;
    }

    public void setCountByAttr(BaseAttribute countByAttr) {
        this.countByAttr = countByAttr;
    }

    public BaseAttribute getSumByAttr() {
        return sumByAttr;
    }

    public void setSumByAttr(BaseAttribute sumByAttr) {
        this.sumByAttr = sumByAttr;
    }

    public BaseAttribute getSumAttr() {
        return sumAttr;
    }

    public void setSumAttr(BaseAttribute sumAttr) {
        this.sumAttr = sumAttr;
    }

    public String getTargetModelTypeName() {
        return targetModelTypeName;
    }

    public void setTargetModelTypeName(String targetModelTypeName) {
        this.targetModelTypeName = targetModelTypeName;
    }

    public boolean isPagination() {
        return pagination;
    }

    public void setPagination(boolean pagination) {
        this.pagination = pagination;
    }

    public boolean isQuerySingle() {
        return querySingle;
    }

    public void setQuerySingle(boolean querySingle) {
        this.querySingle = querySingle;
    }

    public String getTopNExpression() {
        return topNExpression;
    }

    public void setTopNExpression(String topNExpression) {
        this.topNExpression = topNExpression;
    }

    protected boolean needOrderBy() {
	    if (this.isPagination()){
	        return true;
        }
	    if (this.getCountAttr() != null && this.getCountByAttr() == null){
	        return false;
        }
	    return true;
    }
}
