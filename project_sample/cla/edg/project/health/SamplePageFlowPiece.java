package cla.edg.project.health;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class SamplePageFlowPiece extends PieceOfScript {
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
			.request("submit artwork auction application v3").with_form("artwork auction").customize()
				.comments("提交上架信息表单").no_footprint()
				.got_page("paid success")
				
			// 二次上架的确认执行
			.request("confirm quick reshelf auction").with_string("artwork auction id")
				.comments("2019-11-6:按照暂定规则, 重新上架")
				.got_page("artwork auction detail")
				
				
				
				
				
			/** 发行墨契 */
			.request("start issue ink deed v3").with_string("artwork auction id")
				.comments("艺术品卖家发行墨契").no_footprint()
				.when("first time to issue").comments("首次发行墨契")
					.got_page("ink deed issue").comments("发行墨契")
						.may_request("to set ink deed share number")
				.when("further issue").comments("增发墨契")
					.got_page("ink deed share number setting")
				
			/** 墨契销售 
			 *  墨契销售的业务规则现在是这样: 
			 *  1. 一次只能买一个;
			 *  2. 自动选最便宜的;
			 *  3. 中台配置锁定墨契的时间,单位是分钟,最小1分钟,最大30分钟;
			 *  页面流变成这样:
			 *  step1: 用户在x处点击'购买墨契' (x可能是拍品详情)
			 *  step2: 系统从数据库中找出用户可以买的一份墨契, 将其置为 "BE_DRAWN" (被抽中), 这样它在30秒内不会出现在候选清单中. 然后呈现为一个'订单'的页面
			 *  step3: 用户可以选择"去支付". 如果这样, 系统会将该墨契置为 "BOOKED" (已预订), 并生成真正的订单. 这样用户有几分钟的时间来完成支付
			 *  step4: 手机收到"去支付"的响应结果,调起微信支付, 完成支付,
			 *  step5: 系统将墨契交割
			 *  如果用户在step3处没有选择去支付, 该墨契30秒后就被自动释放
			 *  如果用户几分钟内都没有完成订单支付, 该墨契会被自动释放
			 *  
			 *  user id 和 object id 为空时, 表示对用户和墨契ID没有限制
			 */
			.request("buy one ink deed").with_string("artwork auction id").with_string("user id").with_string("object id").with_integer("quantity").variable()
				.comments("用户从拍品的可售墨契中,挑出价格最低的给用户去购买").need_login().no_footprint()
				.got_page("buy ink deed preview")
				
//			.request("view my ink deed info").with_string("artwork auction id")
//				.comments("查看用户自己的某个拍品的墨契")
//				.got_page()
//				
			.request("view selling ink deed of auction").with_string("artwork auction id").with_string("user id").with_string("price")
				.comments("查看某个拍品相关的墨契统计列表,按人和价格分组").no_login().has_footprint().can_refresh()
				.when("only one").comments("只有一个挂单可售")
					.got_page("ink deed detail by holder and price")
				.when_others().comments("有多个列表")
					.got_page("auction ink deed order list")
					
			.request("view selling ink deed by holder and price").with_string("artwork auction id").with_string("user id").with_string("price")
				.comments("根据墨契的持有人和售价,查看墨契详情").no_login().has_footprint().can_refresh()
				.got_page("ink deed detail by holder and price")
				
			.request("view ink deed order list v3").with_string("filter").with_last_record_id()
				.comments("用户按照订单状态分页查看他自己的默契订单")
				.got_page("ink deed order list v3").title("墨契订单")
					
		.request("view ink deed ids v3").with_string("scene code").with_string("artwork auction id").with_string("user id").with_float("price").with_string("filter")
			.comments("查看墨契ID列表")
			.got_page("ink deed id set")
				
			/**
			 * 个人账户
			 */
			.request("view my cash account v3")
				.comments("V3版本的用户现金账户详情").need_login().has_footprint().can_refresh()
				.got_page("user cash account detail v3").title("我的账户")
			.request("view frozen account record list").with_last_record_id()
				.comments("查看用户的待入账明细").need_login().no_footprint().can_refresh()
				.got_page("frozen account record list").title("待入账明细").list_of("frozen-record")
			;
	}
}
