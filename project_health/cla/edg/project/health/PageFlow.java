package cla.edg.project.health;
import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.PageFlowScript;

public class PageFlow extends BasePageFlowDescriptionScript {

	private static final PageFlowScript SCRIPT = $("wechat app").need_login()
			.base_on()
				.base_package_name("com.doublechaintech.health")
				.project_name("health")
				.parent_class_name("BasicWxappService")
				.parent_class_package("com.doublechaintech.health.wechatapp")
				
				
				
				
				
				
			.standard_homepage("健康调查")
			.login_as("user")
			.login_from_wxapp_by_openid()
			.got_me_page().comments("首页，只有老师有首页，包含班级列表和近期问卷列表")
				.may_request("add class").comments("创建班级")
			
					
			/**
			 * 老师
			 */
			.request("teacher login").no_login().with_object("com.terapico.caf.baseelement.LoginParam as loginParam")
				.got_me_page()
				.may_request("add class")
				.may_request("view survey detail")
				.may_request("view class detail")
			
			.request("add class").got_page("add class")
				.may_request("submit class")
				
			.request("submit class").comments("创建班级").need_login()
				.with_form("teacher")
				.got_page("survey list")
			
			
			.request("view class detail").need_login().with_string("teacher id")
				.got_page("survey list").list_of("class_daily_health_survey")
				.may_request("view survey detail")
					
			.request("view survey detail").need_login().with_string("survey id").comments("问卷详情")
				.got_page("survey detail")
				
				
			.request("add survey").with_string("teacher id").comments("添加问卷").got_page("add survey")
				.may_request("publish survey")
				
			.request("publish survey").with_string("teacher id").with_string("survey date").comments("发布问卷")
				.got_page("survey detail")
			
			
				
			/**
			 * 学生
			 */
				
			.request("student login").no_login().with_string("survey id").comments("学生登录填写问卷")
				.when("submitted")
					.got_page("student survey detail")
				.when_others()
					.got_page("student survey form")
					.may_request("submit student survey")
					
			.request("student view survey").need_login().with_string("survey id").comments("学生登录后查看问卷")
				.when("submitted")
					.got_page("student survey detail")
				.when_others()
					.got_page("student survey form")
				.may_request("submit student survey")
					
			.request("submit student survey").need_login().with_string("survey id").with_string("answer").with_string("student name").got_page("student survey detail")
			
			;
		

	@Override
	public PageFlowScript getScript() {
		return SCRIPT.import_from(new Query())
				;
	}

}
