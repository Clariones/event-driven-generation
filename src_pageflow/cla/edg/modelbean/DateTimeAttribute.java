package cla.edg.modelbean;

public class DateTimeAttribute extends BaseAttribute {

	public LogicalOperator before(Object o) {
		return less(o);
	}
	public LogicalOperator after(Object o) {
		return bigger(o);
	}
}
