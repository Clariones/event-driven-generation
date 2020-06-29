package cla.edg.project.yrzx.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class ReviewAndCommentPageFlowPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script
		.request("review pay item application").with_string("project id").with_string("item id")
				.comments("审核预期款项申请")
				.got_page("contract payment application detail")

		;



		return script;
	}

}
