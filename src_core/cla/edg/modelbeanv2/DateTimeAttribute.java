package cla.edg.modelbeanv2;

public class DateTimeAttribute extends BaseAttribute {

	public LogicalOperator before(Object o) {
		return less(o);
	}
	public LogicalOperator after(Object o) {
		return bigger(o);
	}
}
