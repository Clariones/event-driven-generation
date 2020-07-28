package com.terapico.query.terms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * 在查询的时候,可以对普通字段使用的操作符
 */
public enum Operator {
    EQUALS,             // ==
    NOT_EQUALS,         // !=
    BIGGER_THAN,        // >
    BIGGER_OR_EQUALS,   // >=
    LESS_THAN,          // <
    LESS_OR_EQUALS,     // <=
    IN,                 // in
    NOT_IN,             // not in

    AND,        // &&
    OR,         // ||
    NOT;        // !

    public LogicalExpression of(Object ... operands) {
        List<Object> list = new ArrayList<>();
        if (operands != null && operands.length > 0){
            list.addAll(Arrays.asList(operands));
        }
        return of(list);
    }

    public LogicalExpression of(List<Object> operands) {
        LogicalExpression expression = new LogicalExpression();
        expression.setOperator(this);
        expression.setOperands(operands);
        return expression;
    }
}
