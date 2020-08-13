package cla.edg.modelbean;

public class StringAttribute extends BaseAttribute {

    public LogicalOperator like(Object o) {
        return LogicalOperator.create(LogicalOperator.Operator.like, this, o);
    }
}
