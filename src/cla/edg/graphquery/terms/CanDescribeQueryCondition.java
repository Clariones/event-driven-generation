package cla.edg.graphquery.terms;

public interface CanDescribeQueryCondition {
	BaseConditionDescriptor search_by(BaseQueryCondition condition);
}
