package cla.edg.project.storedev;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S2_RecommendationForm extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
					.request("home page").comments("APP 登陆后的首页").can_refresh().need_login().with_string("filter")
					.got_page("store developer home")
						.may_request("open baseinformation form").comments("发起申请")
						.may_request("open new store").comments("新开门店")
						.may_request("view rank").comments("查看排名")
					
						//发起申请
						.request("open baseinformation form").comments("打开 新店申请-基本信息")
							.has_footprint().can_refresh().need_login()
							.got_page("baseinformation form").title("基本信息")
								
						.request("submit baseinformation form").comments("提交 新店申请-基本信息").with_form("base_information")
							.got_page("people flow form")
							
						.request("open people flow form").comments("打开 新店申请-人群调研")
							.has_footprint().can_refresh().need_login()
							.got_page("people flow form")
							
						.request("submit people flow form").comments("提交 新店申请-人群调研").with_form("people_flow")
							.has_footprint().can_refresh().need_login()
							.got_page("expense form")
							
						.request("open expense information form").comments("打开 新店申请-费用信息")
							.has_footprint().can_refresh().need_login()
							.got_page("people flow form")
							
						.request("submit expense information form").comments("提交 新店申请-费用信息").with_form("expense_information")
							.has_footprint().can_refresh().need_login()
							.got_page("recommended store detail")
								
						.request("save expense information form").comments("保存 新店申请-费用信息").with_form("expense_information")
							.has_footprint().can_refresh().need_login()
							.got_page("expense form")
									
						//新开门店
						.request("open new store").comments("新开门店").need_login()
							.got_page("new store")
						
						.request("view rank").comments("查看排名").need_login().can_refresh()
							.got_page("ranking")
							
				
			;
	}
}
