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
			.login_as("user").got_me_page().comments("登录后选择身份")
				.may_request("switch to teacher")
				.may_request("switch to student")
			.login_from_wxapp_by_openid()
			
			.request("update profile").need_login().with_string("name").with_string("avatar").with_string("userType")
				.when("switchToTeacher")
					.got_me_page()
				.when_others()
					.got_page("student survey list")
			/**
			 * ========================================老师========================================
			 */
			.request("switch to teacher")
				.when("empty class")
					.got_page("add class")
				.when_others()
					.got_me_page().comments("首页，只有老师有首页，包含班级列表和近期问卷列表")
					.may_request("add class").comments("创建班级")
			
			.request("add class").got_page("add class")
				.may_request("submit class")
				
			.request("submit class").comments("创建班级").need_login()
				.with_form("teacher")
				.got_me_page()
			
			
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
				 * ========================================学生========================================
				 */
				
			.request("switch to student").got_page("student survey list")
			
			.request("student view survey").need_login().with_string("survey id").comments("学生登录后查看问卷")
				.when("submitted")
					.got_page("student survey list").list_of("student_health_survey")
					.may_request("view student survey detail")
				.when_others()
					.got_page("student survey form")
				.may_request("submit student survey")
				
			.request("view student survey detail").with_string("student survey id").got_page("student survey detail")
					
			.request("submit student survey").need_login().with_string("survey id").with_string("answer").with_string("student name").got_page("student survey list")
			
			;
		

	@Override
	public PageFlowScript getScript() {
		return SCRIPT
				.import_from(new Query())
				;
	}

}
