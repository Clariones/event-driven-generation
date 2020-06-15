package cla.edg.project.yourong.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S99_Common extends PieceOfScript{
	

	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
			.request("send verify code").with_string("mobile").variable()
				.comments("发送验证码").no_footprint().no_login()
				.got_page("simple toast")
				
			.request("do some testing").with_string("message")
				.comments("debug").no_login().no_footprint()
				.todo()
				;
	}

	

}
