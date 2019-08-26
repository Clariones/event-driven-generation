package cla.edg.graphquery.terms;

public interface BaseQueryCondition {
	BaseQueryCondition and(BaseQueryCondition condition);
	BaseQueryCondition or(BaseQueryCondition condition);
}
