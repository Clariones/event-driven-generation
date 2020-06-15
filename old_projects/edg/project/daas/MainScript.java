package cla.edg.project.daas;

import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.PageFlowScript;


public class MainScript extends BasePageFlowDescriptionScript {
	private static final PageFlowScript SCRIPT = $("daasService").need_login().no_footprint()
			.base_on()
				.base_package_name("com.doublechain.daas")
				.project_name("daas")
				.parent_class_name("BasicDaasService")
				.parent_class_package("com.doublechain.daas.daasservice")
			
			/**
			 * 由于目前是用jsp 做的，
			 * 为了不产生 .jsp 的url， 简单跳转页面也用脚本做
			 */
			.request("login").no_login()
				.got_page("login")
				.comments("访问登录页面")
				
			.request("doLogin").no_login().with_string("email").with_string("password")
				.comments("登录")
				.when("error").got_page("login")
				.when_others().got_page("download token")
				
			.request("registration").no_login()
				.comments("访问注册页面")
				.got_page("registration")
				
			.request("send code").no_login().with_string("email").got_page("registration")
				.comments("发送验证码到邮箱")
			
			.request("doRegistration").no_login().with_string("email").with_string("password").with_string("confirmPassword").with_string("code")
				.comments("注册")
				.when("error").got_page("registration")
				.when_others().got_page("welcome")
				
			.request("continue").got_page("login")
			
			.request("reset password").no_login().got_page("reset password")
				.comments("重置密码")
			
			;

	@Override
	public PageFlowScript getScript() {
		return SCRIPT;
	}
}
