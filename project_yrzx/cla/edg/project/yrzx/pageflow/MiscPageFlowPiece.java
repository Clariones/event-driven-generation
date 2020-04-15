package cla.edg.project.yrzx.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class MiscPageFlowPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script.request("test")
			.got_page("simple toast").title("提示")
			
			;
		return script;
	}

}
