package cla.edg.project.moyi;

import cla.edg.script.BaseEventDescriptionScript;
import cla.edg.script.EventScript;

public class Auction extends BaseEventDescriptionScript{
	private static final EventScript SCRIPT = $("auction")
			/**
			 * Best lucky
			 * 卖家上传所有权资料->支付证书费用->平台创建艺术品数字证书
			 * ->公示时间到->卖家发售墨契->用户购买墨契->平台为墨契冻结卖家保证金
			 * ->荐宝人荐宝->竞拍人预约->竞拍人缴付保证金->
			 * ->拍卖开始->竞拍人出价->拍卖成交
			 * ->买家支付拍卖相关订单->卖家发货->买家确认收货
			 * ->平台兑付墨契->平台解冻墨契保证金->买家收到销售款->关闭拍卖交易（待定）
			 */
			.on_event("seller upload ownership information")
				.comments("卖家上传所有权资料")
			.on_event("seller pay ownership certificate fee")
				.comments("支付证书费用")
				.event_ripple("create ownership certificate")
				.event_ripple("start auction")
			.on_event("create ownership certificate")
				.comments("平台创建艺术品数字证书").internal_only()
			.on_event("time to start auction display")
				.comments("公示时间到")
				.event_ripple("release ink deed liquidity")
			.on_event("seller put ink deed to sale")
				.comments("卖家发售墨契")
				.when("lack of deposit").comments("卖家的保证金不足以支持此次墨契的发售")
					.event_ripple("lack of seller deposit")
				.when("permitted").comments("可以正常发售墨契")
					.event_ripple("freeze seller deposit because of ink deed sold")
					.event_ripple("create ink deed transaction")
			.on_event("user pay for ink deed")
				.comments("用户购买墨契")
				.event_ripple("transfer ink deed ownership")
			.on_event("freeze seller deposit because of ink deed sold").internal_only()
				.comments("平台为墨契冻结卖家保证金")
			.on_event("referee share artwork")
				.comments("荐宝人荐宝")
			.on_event("bidder book auction")
				.comments("竞拍人预约")
				.when("has referee").comments("是通过荐宝人的链接触发的")
					.event_ripple("record referee for bidder")
					.event_ripple("register bidder")
				.when("has no referee").comments("不是荐宝人推荐的")
					.event_ripple("register bidder")
			.on_event("bidder pay deposit")
				.comments("竞拍人缴付保证金")
				.event_ripple("confirm bidder")
			.on_event("time to start auction bidding")
				.comments("拍卖开始")
				.event_ripple("freeze ink deed liquidity")
			.on_event("bidder offer price")
				.comments("竞拍人出价")
				.when("not register bidder").comments("未注册过的竞拍者")
					.event_ripple("register bidder")
				.when("not confirmed bidder").comments("未交足够的保证金")
					.event_ripple("lack of bidder deposit")
				.when_others().comments("可以正常出价")
					.event_ripple("update bidding price")
			.on_event("auction closed as deal").internal_only()
				.comments("拍卖成交")
				.event_ripple("release bidder deposit")
				.event_ripple("create auction orders")
			.on_event("buyer pay auction orders")
				.comments("买家支付拍卖相关订单")
			.on_event("seller deliver lot")
				.comments("卖家发货")
			.on_event("buyer confirm purchase")
				.comments("买家确认收货")
				.event_ripple("platform exchange ink deed")
				.event_ripple("release seller deposit without drawback")
				
				.event_ripple("seller get the sales income")
				.event_ripple("auction trade finish")
			.on_event("platform exchange ink deed").internal_only()
				.comments("平台兑付墨契")
			.on_event("release seller deposit without drawback").internal_only()
				.comments("平台解冻墨契保证金")
			.on_event("seller get the sales income").internal_only()
				.comments("买家收到销售款")
			.on_event("auction trade finish").internal_only()
				.comments("拍卖交易完成")
				.event_ripple("mark lot sold")
			/**
			 * 自动事件
			 * 拍卖结束时间到,支付超时，发货超时，确认超时
			 */
			.on_event("auction closed by time")
				.comments("拍卖结束时间到")
				.when("bought in").comments("流拍")
					.event_ripple("auction closed as bought in")
				.when("deal").comments("deal")
					.event_ripple("auction closed as deal")
			.on_event("timeout for buyer pay")
				.comments("支付超时")
				.event_ripple("buyer breached")
			.on_event("timeout for seller delivery")
				.comments("卖家发货超时")
				.event_ripple("seller breached")
			.on_event("timeout for buyer confirmation")
				.comments("买家确认超时")
				.event_ripple("platform exchange ink deed")
				.event_ripple("release seller deposit without drawback")
				.event_ripple("seller get the sales income")
				.event_ripple("auction trade finish")
			/**
			 * 异常情况
			 * 流拍，保证金不足，买家违约，卖家违约，投诉
			 */
			.on_event("auction closed as bought in").internal_only()
				.comments("流拍")
				.when("has ink deed sold").comments("有已销售的墨契")
					.event_ripple("drawback ink deed")
					.event_ripple("release seller deposit because of ink deed drawback")
					.event_ripple("release bidder deposit")
					.event_ripple("auction trade terminate")
				.when("no ink deed sold").comments("没有成交的墨契")
					.event_ripple("release seller deposit without drawback")
					.event_ripple("release bidder deposit")
					.event_ripple("auction trade terminate")
			.on_event("lack of seller deposit").internal_only()
				.comments("卖家保证金不足")
			.on_event("lack of bidder deposit").internal_only()
				.comments("买家保证金不足")
			.on_event("seller breached").internal_only()
				.comments("卖家违约")
				.event_ripple("refund buyer pay")
				.event_ripple("drawback ink deed")
				.event_ripple("confiscate seller deposit")
				.event_ripple("auction trade terminate")
			.on_event("buyer breached").internal_only()
				.comments("买家违约")
				.when("has ink deed sold").comments("有已销售的墨契")
					.event_ripple("confiscate buyer deposit")
					.event_ripple("drawback ink deed")
					.event_ripple("release seller deposit because of ink deed drawback")
					.event_ripple("route buyer penalty")
					.event_ripple("auction trade terminate")
				.when("no ink deed sold").comments("没有成交的墨契")
					.event_ripple("confiscate buyer deposit")
					.event_ripple("release seller deposit without drawback")
					.event_ripple("route buyer penalty")
					.event_ripple("auction trade terminate")
			.on_event("buyer complaint")
				.comments("买家投诉")
			/**
			 * 其它衍生事件
			 * 墨契二次售卖
			 */
			.on_event("user pend ink deed order")
				.comments("用户挂单销售墨契")
			
			/**
			 * 内部事件。 根据需求细节触发的内部事件。
			 */
			.on_event("start auction").internal_only()
				.comments("开始拍卖流程")
			.on_event("freeze ink deed liquidity").internal_only()
				.comments("冻结墨契流动性")
			.on_event("create ink deed transaction").internal_only()
				.comments("创建墨契交易")
			.on_event("register bidder").internal_only()
				.comments("登记竞拍者")
			.on_event("confirm bidder").internal_only()
				.comments("确认竞拍者资格")
			.on_event("release ink deed liquidity").internal_only()
				.comments("释放墨契流动性")
			.on_event("transfer ink deed ownership").internal_only()
				.comments("转移墨契所有权")
			.on_event("record referee for bidder").internal_only()
				.comments("记录荐宝人推荐成功的竞拍者")
			.on_event("create auction orders").internal_only()
				.comments("创建拍卖订单")
			.on_event("update bidding price").internal_only()
				.comments("有新的竞拍出价")
			.on_event("drawback ink deed").internal_only()
				.comments("给已经成交的墨契做退款处理")
			.on_event("release seller deposit because of ink deed drawback").internal_only()
				.comments("平台处理已成交墨契的退还事项后，解冻卖家保证金")
			.on_event("release bidder deposit").internal_only()
				.comments("解冻未竞拍成功的竞拍者的保证金")
			.on_event("auction trade terminate").internal_only()
				.comments("拍卖中止")
			.on_event("mark lot sold").internal_only()
				.comments("被拍卖的艺术品标注为已售")
			.on_event("confiscate seller deposit").internal_only()
				.comments("扣除卖家保证金")
			.on_event("refund buyer pay").internal_only()
				.comments("退款给买家")
			.on_event("route buyer penalty").internal_only()
				.comments("瓜分买家的违约金")
			.on_event("confiscate buyer deposit").internal_only()
				.comments("扣除买家保证金")
			;
	

	@Override
	public EventScript getScript() {
		return SCRIPT;
	}
}
