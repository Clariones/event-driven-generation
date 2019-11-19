package cla.edg.project.moyi;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class V3PageFlowScript extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
			/** 店铺关注 */
			.request("moyi user watch moyi shop").with_string("shop id")
				.comments("用户关注店铺").need_login().no_footprint()
				.got_ajax_page()
			.request("moyi user unwatch moyi shop popup").with_string("shop id")
				.comments("提示用户取消关注").need_login().no_footprint()
				.got_popup_page()
			.request("moyi user unwatch moyi shop").with_string("shop id")
				.comments("用户取消关注店铺").need_login().no_footprint()
				.got_ajax_page()
			.request("moyi user unwatch moyi shop from list").with_string("shop id")
				.comments("用户取消关注店铺").need_login().no_footprint()
				.got_page("shops watched by user")
				
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
				
				
				
			/** 新的作品上架 */
			// 第一步, 点击'上架'. 可能是作品里的'我要卖', 也可能是'可售'列表直接点击, 也可能是'上架'
			.request("put product on sale v3").with_string("artwork id")
				.comments("2019-11-6:按v3新规则开始上架作品").no_footprint()
				.when("lack of deposit").comments("店铺保证金不够")
					.got_popup_page().comments("请求用户确认补保")
						.may_request("start to recharge shop deposit for new auction")
				.when("quick reshelf").comments("快速二次上架")
					.got_popup_page().comments("提示用户新拍卖的参数,请求确认")
						.may_request("confirm quick reshelf auction")
				.when_others().comments("正常情况下")
				.got_page("artwork auction application").comments("艺术品上架销售表单")
					.may_request("submit artwork auction application")
			// 第二步, 去缴店铺保证金订单
			.request("start to recharge shop deposit for new auction").with_string("shop id").with_float("minimum recommended value").with_string("artwork id")
				.comments("为artwork准备上架时发现保证金不够时,先缴保证金,成功后要转为上架")
				.got_page("pay shop deposit bill")
			// 第三步,缴完费, 在成功页面可能会又回到第一步,然后这次保证金	足够了,就会走'正常情况'.
				
			// 二次上架的确认执行
			.request("confirm quick reshelf auction").with_string("artwork auction id")
				.comments("2019-11-6:按照暂定规则, 重新上架")
				.got_page("artwork auction detail")
			;
	}
}
