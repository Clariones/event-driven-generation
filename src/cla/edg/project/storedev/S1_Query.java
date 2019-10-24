package cla.edg.project.storedev;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S1_Query extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
				.query("recommended_store").list_of("user").pagination().with_string("user id")
					.comments("新店推荐列表")
			;
	}
}
