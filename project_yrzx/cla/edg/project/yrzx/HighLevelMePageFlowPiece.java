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
				.request("view my project list")
					.comments("查看我的项目列表").need_login()
					.got_page("project list").title("我的项目").list_of("project")
						.may_request("view project mall")
				// 账户
				.request("view my account list")
					.comments("查看我的账户").need_login()
					.got_page("account list").title("我的账户").list_of("account")
				// 订单
				.request("view my order list")
					.comments("查看我的订单").need_login()
					.got_page("order list").title("我的订单").list_of("order")
				// 装修申请
				.request("view my application list")
					.comments("查看我的申请").need_login()
					.got_page("application list").title("我的申请").list_of("application")
				// 推荐
				.request("view my recommendation list")
					.comments("查看我的推荐").need_login()
					.got_page("recommendation list").title("我的推荐").list_of("recommendation")
						
						
			
					
			;
	}
}
