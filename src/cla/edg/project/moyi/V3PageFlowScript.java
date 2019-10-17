package cla.edg.project.moyi;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class V3PageFlowScript extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
			.request("moyi user watch moyi shop").with_string("shop id")
				.comments("用户关注店铺").need_login().no_footprint()
				.got_ajax_page()
			.request("moyi user unwatch moyi shop popup").with_string("shop id")
				.comments("提示用户取消关注").need_login().no_footprint()
				.got_popup_page()
			.request("moyi user unwatch moyi shop").with_string("shop id")
				.comments("用户取消关注店铺").need_login().no_footprint()
				.got_ajax_page()
				
			.request("view watched user by shop").with_string("shop id")
				.comments("查看关注店铺的用户列表")
				.got_page("users watched shop").list_of("watched-user").title("关注的墨友")
			.request("view next page watched user by shop").with_string("shop id").with_last_record_id()
				.comments("查看关注店铺的用户列表: 翻页")
				.got_page("users watched shop")
				
			.request("view watched shop by user").with_string("user id")
				.comments("查看用户关注的店铺列表")
				
				.got_page("shops watched by user").list_of("watched-shop").title("关注的店铺")
			.request("view next page watched shop by user").with_string("user id").with_last_record_id()
				.comments("查看用户关注的店铺列表：翻页")
				
				.got_page("shops watched by user")
			;
	}
}
