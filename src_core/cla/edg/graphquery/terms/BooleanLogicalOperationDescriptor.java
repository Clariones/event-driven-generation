package cla.edg.graphquery.terms;

public interface BooleanLogicalOperationDescriptor extends BaseLogicalOperationDescriptor {
	default BaseQueryCondition is_true() {
		return addParamCondition("== true", null);
	}
	default BaseQueryCondition is_false() {
		return addParamCondition("== false", null);
	}
}
