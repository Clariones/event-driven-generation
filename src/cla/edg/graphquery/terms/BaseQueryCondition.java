package cla.edg.graphquery.terms;

public interface BaseQueryCondition extends CanDescribQueryPath, CanDescribeQueryWanted, CanOutofQuery{
	BaseQueryCondition and(BaseQueryCondition condition);
	BaseQueryCondition or(BaseQueryCondition condition);
}
