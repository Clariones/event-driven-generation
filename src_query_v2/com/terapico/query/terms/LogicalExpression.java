package com.terapico.query.terms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

// 逻辑表达式, 用来表示 ((A && B) || (C && D)) 这样的东西
public class LogicalExpression {
    protected Operator operator; // 可以是 and, or, not

    // 参与逻辑运算的"子操作数".
    protected List<Object> operands;

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public List<Object> getOperands() {
        return operands;
    }

    public void setOperands(List<Object> operands) {
        this.operands = operands;
    }

    public LogicalExpression or(Object ... moreOperand) {
        return Operator.OR.of(toList(this, moreOperand));
    }
    public LogicalExpression and(Object ... moreOperand) {
        return Operator.AND.of(toList(this, moreOperand));
    }
    public LogicalExpression not() {
        return Operator.NOT.of(this);
    }

    private List<Object> toList(Object ... objects) {
        List<Object> list = new ArrayList<>();
        if (objects == null || objects.length == 0) {
            return list;
        }
        for (Object object : objects) {
            if (object instanceof Collection){
                list.addAll((Collection<?>) object);
                continue;
            }
            if (object.getClass().isArray()){
                list.addAll(Arrays.asList((Object[]) object));
                continue;
            }
            list.add(object);
        }
        return list;
    }
}
