package cla.edg.project.yrzx;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class HighLevelMePageFlowPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
				.request("view me page").need_login()
					.got_page("me").title("我的").as_class("com.terapico.appview.MePage")
						.may_request("view my project list")
						.may_request("view my account list")
						.may_request("view my order list")
						.may_request("view my application list")
						.may_request("view my recommendation list")
				
				// me 页面的navigators
				// 项目
				.request("view my project list").with_string("filter").with_last_record_id()
					.comments("查看我的项目列表").need_login()
					.got_page("project list").title("我的项目").list_of("project")
						.may_request("view project hall")
				// 账户
				.request("view my account list").with_string("filter")
					.comments("查看我的账户").need_login()
					.got_page("account list").title("我的账户").list_of("account")
						.may_request("view account detail")
				// 订单
				.request("view my order list").with_string("filter").with_last_record_id()
					.comments("查看我的订单. 订单计算后分类为: 待处理订单/已完成订单/其他/全部").need_login()
					.got_page("order list").title("我的订单").list_of("order")
						.may_request("view order detail")
				// 装修申请
				.request("view my application list").with_string("filter").with_last_record_id()
					.comments("查看我的申请").need_login()
					.got_page("application list").title("我的申请").list_of("application")
						
				// 推荐
				.request("view my recommendation list").with_string("filter").with_last_record_id()
					.comments("查看我的推荐").need_login()
					.got_page("recommendation list").title("我的推荐").list_of("recommendation")
						
			// 账户详情		
			.request("view account detail").with_string("account id").with_last_record_id()
				.comments("查看某个账户的详情,带明细").need_login().no_footprint().can_refresh()
				.got_page("account detail").title("账户详情").list_of("account detail")
				
			// 订单详情
			.request("view order detail").with_string("order id")
				.comments("查看订单详情")
				.got_page("order detail").title("订单详情").as_class("")
				
			;
	}
}
