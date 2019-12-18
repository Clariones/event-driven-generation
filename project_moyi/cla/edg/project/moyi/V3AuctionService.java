package cla.edg.project.moyi;

import cla.edg.eventscript.EventScript;

public class V3AuctionService extends BaseMoyiEventScript {
	private static final EventScript SCRIPT = $("artwork auction v3")
			.on_event("submit sale request").with("input form data")
				.comments("提交拍品上架的请求")
				.rule_comments("首先做检查:保证金足够;是我持有的作品;目前没有其他正在进行的拍卖")
				.rule_comments("然后为艺术品构造一个拍品")
				.event_ripple("create or update artwork auction")

			.on_event("timeout for buyer").with("artwork auction order").comments("买家超时未付款，标记订单为买家违约")
			.on_event("buyer default delayed").with("artwork auction order").comments("买家违约后，人工处理决定延长违约认定期限，向后推3天")
			.on_event("buyer default confirmed").with("artwork auction order").comments("买家违约后，人工处理认定其确实违约")
				.rule_comments("退回所有墨契")
				.event_ripple("return ink deed").to("ink deed v3")

			.on_event("timeout for seller").with("artwork auction order").comments("卖家超时未付款，标记订单为卖家违约")
			.on_event("seller default delayed").with("artwork auction order").comments("卖家违约后，人工处理决定延长违约认定期限，向后推3天")
			.on_event("seller default confirmed").with("artwork auction order").comments("卖家违约后，人工处理认定其确实违约")
				.rule_comments("退回所有墨契")
				.rule_comments("退还买家的钱")
				.event_ripple("return ink deed").to("ink deed v3")
				.event_ripple("return buyer money")

			.on_event("confirm reception").with("artwork auction order").comments("确认收货，订单变为7天待结算状态")

			.on_event("time to settle account").with("artwork auction order").comments("确认收货七天后自动结算")
				.rule_comments("兑付墨契")
				.rule_comments("支付荐宝费用")
				.rule_comments("结算卖家收益")
				.rule_comments("从平台费用中支付给荐宝人")
				.rule_comments("从平台费用中支付给店铺推荐人")
				



			// //////////////////
			// 以下为内部消息
			// //////////////////

			.internal_only_bydefault()
			.on_event("create or update artwork auction").with("input form data")
				.comments("用提交的form中的信息, 创建一个拍卖")

			.on_event("return buyer money")
			;

	@Override
	public EventScript getScript() {
		return SCRIPT;
	}

}
