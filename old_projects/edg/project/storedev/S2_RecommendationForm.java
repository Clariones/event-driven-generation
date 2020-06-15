package cla.edg.project.storedev;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S2_RecommendationForm extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
					.request("home page").comments("APP 登陆后的首页").can_refresh().need_login()
					.got_page("store developer home")
						.may_request("open base information form").comments("发起申请")

						//发起申请
						.request("open base information form").comments("打开 新店申请-基本信息").with_string("change request id")
							.has_footprint().can_refresh().need_login()
							.got_page("base information form").title("基本信息")

						.request("submit base information form").comments("提交 新店申请-基本信息").with_form("base_information")
//							.when("error")
//								.got_page("baseinformation form")
//							.when_others()
								.got_page("store information form")

						.request("open store information form").comments("打开 新店申请-门店信息").with_string("change request id")
							.has_footprint().can_refresh().need_login()
							.got_page("store information form").title("门店信息")

						.request("submit store information form").comments("提交 新店申请-基本信息").with_form("store_information")
//							.when("error")
//								.got_page("store information form")
//							.when_others()
								.got_page("people flow form")

						.request("open people flow form").comments("打开 新店申请-人群调研").with_string("change request id")
							.has_footprint().can_refresh().need_login()
							.got_page("people flow form")

						.request("submit people flow form").comments("提交 新店申请-人群调研").with_form("people_flow")
							.has_footprint().can_refresh().need_login()
//							.when("error")
//								.got_page("people flow form")
//							.when_others()
								.got_page("expense form")

						.request("open expense information form").comments("打开 新店申请-费用信息").with_string("change request id")
							.has_footprint().can_refresh().need_login()
							.got_page("expense form")

						.request("submit expense information form").comments("提交 新店申请-费用信息").with_form("expense_information")
							.has_footprint().can_refresh().need_login()
//							.when("error")
//								.got_page("expense form")
//							.when_others()
								.got_page("recommended store detail")

						.request("save expense information form").comments("保存 新店申请-费用信息").with_form("expense_information")
							.has_footprint().can_refresh().need_login()
							.got_page("expense form")
							
						.request("abandon form").comments("放弃表单提交，清空").with_string("change request id")
							.has_footprint().can_refresh().need_login()
							.got_page("me")

			;
	}
}
