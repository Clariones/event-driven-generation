package cla.edg.modelbeanv2;

public class StringAttribute extends BaseAttribute {

    public LogicalOperator like(Object o) {
        return LogicalOperator.create(LogicalOperator.Operator.like, this, o);
    }
}
