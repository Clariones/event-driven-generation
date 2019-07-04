package cla.edg.project.yourong.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S4_OrderForPropertyOwner extends PieceOfScript{
	

	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
				
		 // TODO
				.request("view main order list as owner").with_string("filter")
					.comments("以业主身份查看订单").todo()
				;
	}

	

}
