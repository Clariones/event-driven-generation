package cla.edg.project.moyi;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class V4PageFlow extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
		// 新首页
			.request("view shopping homepage")
				.comments("查看2020年定义的新首页").no_login().has_footprint()
				.got_page("shopping homepage").title("聚镁Art0X").as_class("todo")
					.may_request("view hot shop list")
					.may_request("view hot artist list")
			.request("view next page auctions in shopping homepage").no_login().no_footprint().with_last_record_id()
				.comments("在2020年定义的新首页上上划翻页")
				.got_page("shopping homepage")
		// 聚好店
			.request("view hot shop list")
				.comments("聚好店入口页面").no_login().has_footprint()
				.got_page("hot shop list").title("聚好店").list_of("hot-shop")
			.request("view next page hot shop list").with_string("artwork type id").with_last_record_id()
				.comments("聚好店入口页面:翻页").no_login().has_footprint()
				.got_page("hot shop list")
		// 艺术家
			.request("view hot artist list")
				.comments("2020新定义的艺术家列表页面").no_login().has_footprint()
				.got_page("hot artist list").title("艺术家").list_of("hot-artist")
			.request("view next page hot artist list").with_string("artwork type id").with_last_record_id()
				.comments("2020新定义的艺术家列表页面").no_login().has_footprint()
				.got_page("hot artist list")
				
		// 拍品详情页调整
			.request("like on artwork auction").with_string("artwork auction id")
				.comments("在拍品详情页上点赞").need_login()
				.got_ajax_page()
			.request("reward on artwork auction").with_string("artwork auction id").with_float("reward value").with_string("comments")
				.comments("在拍品详情页上进行打赏").need_login()
				.got_ajax_page()
				
		
		// 打开用户的消息页面
			.request("view unread message")
				.comments("查看用户的消息列表页面").need_login()
				.got_ajax_page()
				
		// H5上的艺术家履历页面
			.request("view artist resume in h5").with_string("artist id").with_string("invite code")
				.comments("从分享中打开艺术家履历H5页面").no_login().can_refresh()
				.got_page("artist resume h5").title("艺术家")
				
		// 店铺详情改了列表业务规则,新增的"下一页所有拍品"
			.request("view next page autions in shop").with_string("shop id").with_string("timestamp string").with_last_record_id()
				.comments("游客查看店铺的下一页所有拍品").no_footprint().no_login()
				.got_page("store detail next page auctions").as_class("com.terapico.moyi.nativeappv2pageview.StoreDetailPage")
				
		// 下架拍品
			.request("show confirm off sale auction").with_string("artwork auction id")
				.comments("显示 确认下架 或者 不能下架 的popup").need_login().no_footprint()
				.got_popup_page()
					.may_request("confirm to off sale auction")
			.request("confirm to off sale auction").with_string("artwork auction id")
				.comments("确认执行 拍品下架 的操作").need_login().no_footprint()
				.got_page("artwork auction detail")
		;
	}
}
