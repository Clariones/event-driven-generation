package cla.edg.project.storedev;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S1_Query extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
				.query("recommended_store").list_of("user").pagination().with_string("user id").with_string("filter")
					.comments("新店推荐列表")
					
				.query("recommended_store_audit_task").list_of("user").pagination().with_string("user id").with_string("filter")
				.comments("新店推荐列表")
				
				.query("personal_achievement_monthly").list_of("all").pagination().comments("开店排名")
			;
	}
}
