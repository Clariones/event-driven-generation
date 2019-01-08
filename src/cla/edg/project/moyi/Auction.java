package cla.edg.project.moyi;

import cla.edg.script.BaseEventDescriptionScript;
import cla.edg.script.EventScript;

public class Auction extends BaseEventDescriptionScript{
	private static final EventScript SCRIPT = $("auction")
			.on_event("seller upload ownership information")
				.comments("卖家上传所有权资料")
				.event_ripple("create ownership certificate fee")
				
			.on_event("create ownership certificate fee")
				.comments("创建所有权证书费用，此费用需要卖家用IB支付")
				.internal_only()
				
			.on_event("seller cancel ownership certificate fee payment")
				.comments("用户不支付所有权证书费用. 此时取消前面的订单")
				.event_ripple("seller revoke auction")
				
			.on_event("seller revoke auction")
				.comments("卖家撤销了未发布的拍卖申请")
				
			.on_event("seller pay ownership certificate fee")
				.comments("用户支付所有权证书费用")
				.when("allright")
					.comments("没有任何其他问题")
					.event_ripple("create ownership certificate").comments("缴费后生成证书")
					.event_ripple("mark auction displayable")
				.when("lack of seller deposit")
					.comments("卖家的履约保证金不足")
					.event_ripple("create ownership certificate").comments("缴费后生成证书")
					.event_ripple("create seller performance deposit recharge notification")
						.comments("提醒充值保证金，否则交易容易被卡住")
						
			.on_event("create ownership certificate")
				.comments("创建艺术品所有权证书")
				
			.on_event("seller pay performance deposit recharge")
				.comments("卖家支付了履约保证金")
				.event_ripple("seller performance deposit recharged")
				
			.on_event("seller performance deposit recharged")
				.comments("卖家履约保证金到账").internal_only()
				.when("has auction released")
					.comments("有被阻塞的拍卖流程被释放")
					.event_ripple("mark auction displayable")
				.when("still blocking")
					.comments("充值金额还是不足以释放被阻塞的拍卖")
					.event_ripple("create seller performance deposit recharge notification")
						.comments("提醒充值保证金，否则交易不会被释放")
				.when("has auction released")
					.comments("没有被阻塞的拍卖需要被释放，并且保证金也足够")
					
			.on_event("create seller performance deposit recharge notification")
					.comments("提醒卖家充值履约保证金").internal_only()
					
			.on_event("mark auction displayable")
				.comments("允许被拍卖艺术品进行公示").internal_only()
				
			.on_event("bidder book auction")
				.comments("买家预约拍卖")
				.when("has referrer")
					.comments("有荐宝人")
					.event_ripple("create recommendation record")
					.event_ripple("create auction start alert service")
				.when("has no referrer")
					.comments("找不到荐宝人")
					.event_ripple("create auction start alert service")
						
			.on_event("create recommendation record")
				.comments("创建推荐记录，留待交易成功后发放奖励时作为计算依据").internal_only()
				
			.on_event("create auction start alert service")
				.comments("创建拍卖开始提醒任务").internal_only()
				.when("lack of bidder deposit")
					.comments("买家没有支付竞拍保证金")
					.event_ripple("create bidder deposit notification")
				.when("allright")
					.comments("正常情况下没有什么需要做的")
				
			.on_event("create bidder deposit notification")
				.comments("创建竞拍保证金支付通知").internal_only()
			
			.on_event("auction start to display")
				.comments("拍卖品的公示开始时间到")
				.when("lack of seller deposit")
					.comments("时间到了，但是保证金不足")
					.event_ripple("block all real right benifit contract trade")
					.event_ripple("create seller performance deposit recharge notification")
				.when("allright")
					.comments("正常情况，可以公示")
					.event_ripple("block all real right benifit contract trade")
					
			.on_event("block all real right benifit contract trade")
				.comments("冻结一切被拍卖艺术品的墨契交易").internal_only()
	
			.on_event("seller put real right benifit contract on sale")
				.comments("卖家发行物权墨契")
			;

	@Override
	public EventScript getScript() {
		return SCRIPT;
	}
}
