package cla.edg.project.bcex;

import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.PageFlowScript;


public class MainScript extends BasePageFlowDescriptionScript {
	private static final PageFlowScript SCRIPT = $("wxapp service").need_login().has_footprint()
			.base_on()
				.base_package_name("com.doublechaintech.bcex")
				.project_name("bcex")
				.parent_class_name("ChangeRequestCustomManagerImpl")
				.parent_class_package("com.doublechaintech.bcex.changerequest")
			.login_as("wechat_user")
				.got_me_page()
				// .login_from_wxapp_by_wechat_work()
				.login_from_wxapp_by_openid()
				// .login_by_mobile_with_verify_code()
				
			.standard_homepage("首页")
			.standard_me("我的")
			.import_from(new S01_Examing())
			;
	

	@Override
	public PageFlowScript getScript() {
		return SCRIPT;
	}
}
