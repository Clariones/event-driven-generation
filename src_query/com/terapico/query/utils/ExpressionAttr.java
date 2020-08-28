package com.terapico.query.utils;

import cla.edg.modelbean.BaseAttribute;

public class ExpressionAttr extends BaseAttribute {
    protected String expression;

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public ExpressionAttr(String expression) {
        super();
        setExpression(expression);
    }
}
