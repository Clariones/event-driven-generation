package cla.edg.project.moyi;

import cla.edg.eventscript.BaseEventDescriptionScript;
import cla.edg.eventscript.EventScript;

public class Auction extends BaseEventDescriptionScript{
	private static final EventScript SCRIPT = $("artwork auction")
			/**
			 * 流拍
			 */
			.on_event("closed as bought in").with("artwork auction")
				.comments("竞拍结束,无人出价后的处理. 先判断有无墨契需要善后")
					.rule_comments("当前拍卖状态应为 流拍待处理")
					.rule_comments("退还竞拍失败者(=所有竞拍者)的竞拍保证金")
					.rule_comments("如果有墨契售出,留待持有者申请赎回,或者持有者自己购买回来, 所以当时不需要处理. 后续重新上架时,需要持有人赎回.")
					.rule_comments("如果没有墨契售出,不需要处理墨契")
					.rule_comments("艺术品和艺术品证书不需要变化, 保持不变")
					.rule_comments("若无墨契需要善后, 拍卖以 '流拍' 告终,否则可以直接 处理完毕")
				.when("has ink deed sold").comments("有墨契需要善后")
					.event_ripple("refund losed bidder deposit").comments("退还未中标竞拍者的保证金")
					.event_ripple("auction bought in").comments("拍卖以 '流拍' 告终")
				.when_others().comments("无需处理墨契")
					.event_ripple("refund losed bidder deposit").comments("退还未中标竞拍者的保证金")
					.event_ripple("auction closed").comments("拍卖全部处理完毕")
				
			.on_event("closed as deal").with("artwork auction")
				.comments("竞拍结束,有人出价后的处理.")
					.rule_comments("本次拍卖状态变为 成交")
					.rule_comments("当场退还竞拍失败者的竞拍保证金")
					.rule_comments("计算所有艺术品拍卖的订单价格条目")
					.rule_comments("创建艺术品拍卖订单")
					.rule_comments("如果有有效的荐宝记录,还要记录荐宝人")
					.rule_comments("艺术品和艺术品证书状态暂时保持不变, 等到确认收货后,才转移所有人")
					.rule_comments("所有持有的墨契暂时不动, 等待确认收货后才进行兑付")
				.event_ripple("auction deal").comments("拍卖成交")
				.event_ripple("refund losed bidder deposit").comments("退还未中标竞拍者的保证金")
				.event_ripple("calculate order price").comments("计算所有艺术品拍卖的订单价格条目")
				.event_ripple("create order").comments("创建艺术品拍卖订单")
				
			.on_event("paid").with("artwork auction order")
				.comments("拍卖订单订单已支付")
					.rule_comments("订单状态变成 已支付=待发货")
					.rule_comments("买家的竞拍保证金, 状态变成 支付扣除")

			.on_event("delivered").with("artwork auction order")
				.comments("卖家填写了物流信息，表示已经发货")
					.rule_comments("订单状态变成 已发货=待确认收货")
					
			.on_event("confirm reception").with("artwork auction order")
				.comments("买家确认收货，交易best luck结束")
					.rule_comments("先计算此单的分配, 即每一部分的'多少钱,给谁'")
					.rule_comments("然后根据分账明细处理订单和所涉及的人,作品")
				.event_ripple("calculate split details when confirm reception").comments("根据订单自动计算分账明细")
				.event_ripple("close auction trade with split details").comments("交易成功时,根据分账明细处理订单和所涉及的人,作品")
				
				
			.on_event("submit complain").with("artwork auction order")
				.comments("用户提交了售后申请表单")
					.rule_comments("订单状态变为 售后中")
					
			.on_event("complain resolved").with("artwork auction order").with("negotiate result")
				.comments("经调解协商，售后问题解决")
					.rule_comments("如果协商结果为成功交易:")
					.rule_comments("  协商内容包括每一部分的'多少钱,给谁'")
					.rule_comments("  然后按照成交的规则完成所有财务和状态处理")
					.rule_comments("如果协商结果为交易作废")
					.rule_comments("  协商内容包括每一部分的'多少钱,给谁', 已经如何处罚谁,多少钱")
					.rule_comments("  然后按照协商结果处理")
				.when("return to seller").comments("协商结果为退回卖家")
					.event_ripple("process when negotiate to invalid").comments("根据协商的结果,处理退回卖家的相关事项")
				.when("bought finally").comments("协商结果是买家同意购买")
					.event_ripple("close auction trade with split details")
					
			.on_event("timeout for seller").with("artwork auction order")
				.comments("卖家超时未发货")
					.rule_comments("罚卖家的店铺保证金: 起拍价3倍")
					.rule_comments("兑付墨契: 按发行价兑付, 从冻结的保证金里出")
			.on_event("timeout for buyer").with("artwork auction order")
				.comments("买家超时未付款")
					.rule_comments("罚买家的竞拍保证金: 全部")
					.rule_comments("兑付墨契: 按发行价兑付, 买家保证金出")
					.rule_comments("剩下的钱,平台和卖家平分")
					
			/**内部事件*/
			.internal_only_bydefault()
			.on_event("release seller deposit frozen by inke deed").comments("释放发行墨契时冻结的保证金")
			.on_event("calculate order price").comments("计算所有艺术品拍卖的订单价格条目")
			.on_event("create order").comments("创建艺术品拍卖订单")
			.on_event("handle ink deed when transaction success").comments("交易成功后，兑付墨契")
			.on_event("pay recommendation commission").comments("发放荐宝佣金")
			.on_event("transfer artwork ownership to buyer").comments("修改艺术品的当前所有者")
			.on_event("refund losed bidder deposit").comments("退还未中标竞拍者的保证金")
				.rule_comments("未中标的用户(如果流拍,所有人都流拍)的保证金退回个人账户余额")
			.on_event("close auction trade with split details").with("artwork auction order").with("order split detail")
				.comments("交易成功时,根据分账明细处理订单和所涉及的人,作品")
					.rule_comments("订单状态变为 已结束")
					.rule_comments("拍卖状态变为 成功结束")
					.rule_comments("艺术品 所有人转移到买家")
					.rule_comments("艺术品证书作废, 因为持有人变化了, 认证中的持有人照片,签章等都无效了.")
					.rule_comments("(如果有墨契交易), 兑付墨契")
					.rule_comments("(如果有推荐人), 发推荐奖金")
					.rule_comments("(如果有发行墨契), 释放墨契发行所冻结的保证金")
					.rule_comments("平台收3~5%的服务器")
					.rule_comments("剩余金额发给卖家账户")
				.event_ripple("order closed").comments("订单状态变为 已结束")
				.event_ripple("auction closed").comments("拍卖状态变为 成功结束")
				.event_ripple("transfer artwork ownership to buyer").comments("修改艺术品的当前所有者")
				.event_ripple("invalid artwork certificate").comments("作废艺术品证书")
				.event_ripple("handle ink deed when transaction success").comments("交易成功后，兑付墨契")
				.event_ripple("pay recommendation commission").comments("发放荐宝佣金")
				.event_ripple("release seller deposit frozen by inke deed").comments("释放发行墨契时冻结的保证金")
				.event_ripple("platform earn auction service fee").comments("平台收3~5%的服务器")
				.event_ripple("auction order paid to seller").comments("剩余金额发给卖家账户")
			.on_event("auction bought in").comments("拍卖以 '流拍' 告终")
			.on_event("auction deal").comments("拍卖以 '成交' 告终")
			.on_event("auction closed").comments("拍卖全部处理完毕")
			.on_event("process when negotiate to invalid").comments("根据协商的结果,处理退回卖家的相关事项")
			.on_event("invalid artwork certificate").comments("作废艺术品证书")
			.on_event("calculate split details when confirm reception").comments("根据订单自动计算分账明细")
			.on_event("order closed").comments("订单状态变为 已结束")
			.on_event("platform earn auction service fee").comments("平台收3~5%的服务器")
			.on_event("auction order paid to seller").comments("剩余金额发给卖家账户")
			;
	

	@Override
	public EventScript getScript() {
		return SCRIPT;
	}
}
