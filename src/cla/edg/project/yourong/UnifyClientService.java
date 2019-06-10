package cla.edg.project.yourong;

import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.BasePageFlowScript;
import cla.edg.pageflow.PageFlowScript;

public class UnifyClientService extends BasePageFlowDescriptionScript {

	private static final PageFlowScript SCRIPT = $("unify client service").need_login().has_footprint()
		/** 首页及登录 */
		.request("home page")
			.comments("打开首页.").has_footprint().no_login().can_refresh()
			.query("homepage_slide").which("merchant type").no_pagination().with_string("merchant type id")
				.comments("根据用户的merchant type来查询首页上的slide")
			.query("article").which("put in home page").no_pagination().with_string("merchant type id")
				.comments("根据用户的merchant type来查询首页上的article")
			.when("need select nomination").comments("因为账户原因(例如任职变动)需要重新选择角色")
				.got_page("working scenario selection")
					.comments("选择以哪个任职项目进行工作")
			.when("is property owner").comments("用户作为 业主 访问")
				.got_page("home page for property owner")
					.comments("业主 看到的首页内容")
			.when("is store employee").comments("用户作为 门店员工 访问")
				.got_page("home page for store employee")
					.comments("门店员工 看到的首页内容")
			.when("is partner employee").comments("用户作为 品牌方/服务商 访问")
				.got_page("home page for partner employee")
					.comments("品牌方/服务商员工 看到的首页内容")
			.when("is potential customer").comments("用户作为 潜在客户 访问")
				.got_page("home page for potential customer")
					.comments("潜在客户 看到的首页内容")
					.may_request("start to login")
		.request("start to login")
			.comments("去登录").no_footprint().no_login()
			.got_page("unify login")
				.comments("统一的登录页面")
				.may_request("unify login")
		.request("unify login").with_form("mobile login")
			.comments("统一登录").no_login().no_footprint()
			.got_page_same_as_request("home page")
		.request("logout")
			.comments("退出登录").need_login().no_footprint()
			.got_page_same_as_request("home page")
		.request("send verify code SMS").with_string("mobile").variable()
			.comments("发送短信验证码").no_login()
			.got_page("simple toast")
//		.request("start to choose nomination")
//			.comments("选择自己以哪个任职项工作")
//			.got_page("select employee nomination")
//				.may_request("switch employee nomination")
//		.request("switch employee nomination").with_string("employee nomination id")
//			.comments("切换当前工作身份")
//			.got_page_same_as_request("home page")
			
		.request("view article").with_string("article id")
			.comments("查看文章内容").no_login().has_footprint()
			.got_page("article detail")
			
			
		/***
		 * 	业主端的 page-flow
		 ***/
		.in_page("home page for potential customer")
			.may_request("apply to be a property owner")
			.may_request("apply to start a new project")
			.may_request("apply to be partner")
//			.may_request("view article")
			
		.in_page("home page for property owner")
			.may_request("apply to start a new project")
//			.may_request("apply to be an user").comments("TODO: 暂不实现")
			.may_request("view profile")
			.may_request("view my project list")
//			.may_request("view my order list")
			.may_request("view my project application list")
			.may_request("start to select working scenario")
			
		/** 申请成为业主. 首期先不做这个. 业主自动注册 */
		.request("apply to be a property owner")
			.comments("申请成为一个业主").no_login().no_footprint()
			.got_page("property owner register form")
				.comments("业主申请表单的填写页面")
				.may_request("submit property owner application")
		.request("submit property owner application").with_string("user id")
			.comments("TODO: 这个方法首期不做, 后面根据业务需要再说").no_login().no_footprint()
			.got_page("home page for property owner")
			
		.request("apply to be partner")
			.comments("申请成为品牌方/供应商").no_login().no_footprint()
			.got_page("partner register form")
				.comments("品牌方申请表单的填写页面")
				.may_request("submit partner application")
		.request("submit partner application").with_form("partner_application")
			.comments("提交品牌方注册申请表单").no_login().no_footprint()
			.got_page("simple popup")
			
		/** 我的 页面 */
			
		.request("view profile")
			.comments("查看个人信息")
			.query("project").which("current merchant").pagination().with_string("filter").with_string("owner type")
				.comments("查询当前用户相关的项目")
				.rule_comments("filter 表示进行中/已关闭等")
				.rule_comments("owner type 表示 以业主身份查看/以服务商身份查看/以门店身份查看 等")
			.query("main_order").which("current merchant").pagination().with_string("filter").with_string("owner type")
				.comments("查询当前用户相关的项目")
				.rule_comments("filter 表示待支付/支付中/已支付等")
				.rule_comments("owner type 表示 以付款人身份查看/以收款人身份查看 等")
			.got_page("my profile")
				.comments("个人信息")
				.may_request("start to select working scenario")
		.request("start to select working scenario")
			.comments("切换当前工作场景. 主要是切换job").no_footprint()
			.got_page("working scenario selection")
				.comments("选择工作场景")
				.may_request("select working scenario")
		.request("select working scenario").with_string("assignment id")
			.comments("选择一个工作场景").no_footprint()
			.got_page("my profile")
			
		/** 项目申请 */
		.request("apply to start a new project")
			.comments("申请一个新项目").no_login().no_footprint()
			.got_page("new project application form")
				.comments("填写 新项目申请表")
				.may_request("submit new project application")
		.request("submit new project application").with_form("customer_project_application")
			.comments("提交项目申请").no_login().no_footprint()
			.got_page("simple popup")
				.comments("项目申请 详情")
				// .may_request("cancel") // 申请需要撤销吗? 催促吗? 投诉吗? .....
		.request("view my project application list").with_string("filter")
			.comments("按状态查看我的项目申请列表")
			.query("customer_project_application").which("mine by status").pagination().with_string("user id")
				.comments("根据状态查询 新项目申请 的列表")
			.got_page("customer project application list").list_of("project_application")
				.comments("我的项目申请列表页面")
				.may_request("view my next page project application list")
				.may_request("view project application detail")
		.request("view my next page project application list").with_string("filter").with_string("last record id")
			.comments("按状态查看我的项目申请列表: 翻页")
			.got_page("customer project application list")
		.request("view project application detail").with_string("application id")
			.comments("查看 项目申请 详情")
			.got_page("project application detail")
				
		/** 项目列表 */
		.request("view my project list").with_string("filter")
			.comments("查看项目列表")
			.query("project").which("user owned").pagination().with_string("filter").with_string("merchant id")
				.comments("根据merchant ID, 查询该merchant作为业主时的所有项目")
				.rule_comments("作为业主公司的任意雇员都可以看得到")
				.rule_comments("作为业主公司的 老板/持有人, 可以看到")
				.rule_comments("按创建时间倒序排列, 即按ID倒序排列")
			.query("project").which("served by merchant").pagination().with_string("filter").with_string("merchant id")
				.comments("根据merchant ID, 查询该merchant作为服务提供商时的所有项目")
				.rule_comments("门店 类型的公司,所有雇员都看得到")
				.rule_comments("品牌商 类型的公司, 所在的工作包在项目内, 就可以看到")
				.rule_comments("按创建时间倒序排列, 即按ID倒序排列")
			
			.got_page("project list page")
				.comments("项目列表页面")
				.may_request("view project detail")
		.request("view project detail").with_string("project id")
			.comments("查看项目详情")
			.query("working_message").which("in project and not read").pagination().with_string("project id").with_boolean("already read").with_integer("top n")
				.comments("查询和当前项目相关的未读消息")
			.query("main_order").which("in project need pay").pagination().with_string("project id").with_boolean("pay to me").with_integer("top n")
				.comments("查询当前项目的待支付订单")
				.rule_comments("作为 业主方 可以看到所有我需要去支付的订单")
				.rule_comments("作为 服务商 可以看到所有需要给我支付的订单")
				.rule_comments("需要我支付还是需要支付给我, 在页面上需要有办法识别出来")
			.got_page("project detail")
				.comments("项目详情")
		;
		
//			

	@Override
	public PageFlowScript getScript() {
		return SCRIPT;
	}

}
