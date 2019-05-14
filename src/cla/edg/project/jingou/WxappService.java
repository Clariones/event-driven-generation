package cla.edg.project.jingou;

import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.BasePageFlowScript;

public class WxappService extends BasePageFlowDescriptionScript {

	private static final BasePageFlowScript SCRIPT = $("wxapp service").need_login()
		.request("home page")
			.comments("打开首页").has_footprint()
			.got_page("home")
				.comments("首页")
			;
		
//			

	@Override
	public BasePageFlowScript getScript() {
		return SCRIPT;
	}

}
