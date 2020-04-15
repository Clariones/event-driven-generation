package cla.edg.project.yrzx.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class ClientCRPageFlowPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
				.request("start CR application").need_login()
					.comments("打开 我要装修 的表单")
					.got_cr_page()
				.request("start CR recommendation").need_login()
					.comments("打开 我要推荐 的表单")
					.got_cr_page()
				.request("start CR emplacement").need_login()
					.comments("打开 我要入驻 的表单")
					.got_cr_page()
			;
	}
}
