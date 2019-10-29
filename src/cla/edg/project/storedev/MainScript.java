package cla.edg.project.storedev;

import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.PageFlowScript;


public class MainScript extends BasePageFlowDescriptionScript {
	private static final PageFlowScript SCRIPT = $("wxappservice").need_login().has_footprint()
			.base_on()
				.base_package_name("com.doublechain.storedev")
				.project_name("storedev")
				.parent_class_name("BasicWxappService")
				.parent_class_package("com.doublechain.storedev.wxappservice")
			.login_as("store_developer")
				.got_me_page()
				.login_from_wxapp_by_wechat_work()
				// .login_from_wxapp_by_openid()
				.login_by_mobile_with_verify_code()
				
			.standard_homepage("植物医生")
			.standard_me("植物医生")
			.import_from(new S0_Homepage())
			.import_from(new S1_Query())

			;
	

	@Override
	public PageFlowScript getScript() {
		return SCRIPT;
	}
}
