package cla.edg.graphquery.terms;

public interface BaseQueryCondition {
	default BaseQueryCondition and(BaseQueryCondition condition) {
		return connectWith("&&", condition);
	}
	default BaseQueryCondition or(BaseQueryCondition condition) {
		return connectWith("||", condition);
	}
	
	BaseQueryCondition connectWith(String string, BaseQueryCondition condition);
	BaseQueryCondition wrapWithNot();
	
	
}
