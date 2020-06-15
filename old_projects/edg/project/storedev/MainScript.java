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
//			.standard_me("植物医生")
			.request("view dashboard").with_string("filter")
			.comments("我的").need_login().has_footprint().can_refresh()
			.got_page("me").title("植物医生").as_class("com.terapico.appview.MePage")
			.import_from(new S0_Homepage())
			.import_from(new S1_Query())
			.import_from(new S2_RecommendationForm())
			.import_from(new S3_RecommendedStoreDetailPage())
			;


	@Override
	public PageFlowScript getScript() {
		return SCRIPT;
	}
}
