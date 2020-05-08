package cla.edg.project.yrzx.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;

public class MiscPageFlowPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script.request("test")
			.got_page("simple toast").title("提示")

		.request("view notification center").with_string("merchant id").comments("查看所有消息")
				.got_page("notification center")
			;
		return script;
	}

}
