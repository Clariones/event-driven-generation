package cla.edg.project.yourong.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S1_LoginAndMe extends PieceOfScript{
	

	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
			.request("open wxapp login page")
				.comments("小程序端的登录页面.").no_footprint().no_login()
				.got_page("wxapp login").title("登录")
					.comments("小程序端的登录页面")
			.request("login from wxapp").with_form("MobileLogin")
				.comments("小程序端的登录页面.").no_footprint().no_login()
				.got_page("wxapp user profile").title("我的")
					.comments("小程序端的'我的'页面")
			.request("wxapp log out")
				.comments("小程序退出").no_footprint().no_login()
				.got_page("property owner wxapp home")
			.request("view profile")
				.comments("查看'我的'页面").need_login().no_footprint()
				.got_page("wxapp user profile")
					.may_request("view project list as owner")
					.may_request("view account list as owner")
					.may_request("view main order list as owner")
					.may_request("view application list as owner")
			// 账户
			.request("view account list as owner").with_string("filter")
				.comments("查看我的账户列表页面").need_login().no_footprint()
				.when("only one").comments("只有一个账户, 直接去")
					.got_page("account detail").title("账目详情")
						.comments("账户详情")
				.when_others().comments("通常情况下, 有多个账户可看")
					.got_page("account list").list_of("account_book").title("账簿列表")
						.comments("账户列表")
						.may_request("view account detail")
			.request("view account detail").with_string("account book id")
				.comments("查看账本").need_login().no_footprint().can_refresh()
				.got_page("account detail")
					.may_request("view more account book items")
					.may_request("view running account record")
			.request("view more account book items").with_string("account book id").with_string("last record id")
				.comments("查看账本内的条目: 翻页").need_login().no_footprint()
				.got_page("account detail")
			.request("view running account record").with_string("account book id")
				.comments("查看账本内的流水").need_login().no_footprint()
				.got_page("running account list").list_of("running_account").title("账目详情")
					.comments("账本流水列表")
					.may_request("view next page running account record")
			.request("view next page running account record").with_string("account book id").with_string("last record id")
				.comments("查看账本内的流水: 翻页").need_login().no_footprint()
				.got_page("running account list")
			
			// 项目申请
			.request("view application list as owner").with_string("filter")
				.comments("查看我的项目列表页面").need_login().no_footprint()
				.when("only one").comments("只有一个账户, 直接去")
					.got_page("project application detail").title("申请详情")
						.comments("项目申请详情")
				.when_others().comments("通常情况下, 有多个账户可看")
					.got_page("project application list").list_of("project_application").title("申请列表")
						.comments("项目申请列表")
		;
	}

	

}
