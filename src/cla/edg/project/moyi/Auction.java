package cla.edg.project.moyi;

import cla.edg.eventscript.BaseEventDescriptionScript;
import cla.edg.eventscript.EventScript;

public class Auction extends BaseEventDescriptionScript{
	private static final EventScript SCRIPT = $("artwork auction")
//			/**
//			 * 确权
//			 */
//			.on_event("owner submit certificate info")
//				.comments("持有人提交了认证资料")
//				.when("already exists").comments("已经提交过资料")
//					.event_ripple("update ownership info")
//				.when("new application").comments("新的确权申请")
//					.event_ripple("create ownership certifcate")
//			.on_event("update ownership info").internal_only()
//				.comments("更新所有权信息")
//			.on_event("create ownership certifcate").internal_only()
//				.comments("初次创建所有权信息")
//			.on_event("ownership certificate bill paid")
//				.comments("认证服务费已付清")
//				.when("lack of deposit").comments("保证金不足")
//				.when_others().comments("正常情况")
//					.event_ripple("ownership certificate success")
//			.on_event("ownership certificate success").internal_only()
//				.comments("确权完成")
				
			/**
			 * 流拍
			 */
			.on_event("closed as bought in")
				.comments("流拍")
				.event_ripple("closed").comments("拍卖结束")
				.event_ripple("artwork rollback to wait for sale").comments("艺术品本次上架结束，回到‘已确权’状态")
				.event_ripple("handle ink deed when transaction failed").comments("处理墨契")
			.on_event("handle ink deed when transaction failed").internal_only()
				.comments("交易失败时处理墨契")
				.when("has ink deed sold").comments("有成交（已售）的墨契")
					.event_ripple("cash ink deed from seller deposit").comments("用卖家的保证金兑付墨契")
				.when_others().comments("其他：没有墨契需要处理，什么也不需要做。")
					.event_ripple("release seller deposit frozen by inke deed").comments("释放发行墨契时冻结的保证金")
			.on_event("closed as deal")
				.comments("成交")
				.event_ripple("closed").comments("拍卖结束")
				.event_ripple("artwork sold").comments("标记改作品已售")
				.event_ripple("calculate order price").comments("计算所有艺术品拍卖的订单价格条目")
				.event_ripple("create order").comments("创建艺术品拍卖订单")
			.on_event("paid").comments("订单已支付")
			.on_event("delivered").comments("卖家填写了物流信息，表示已经发货")
			.on_event("confirm reception").comments("买家确认收货，交易best luck结束")
				.event_ripple("handle ink deed when transaction success").comments("交易成功后，兑付墨契")
				.event_ripple("release seller deposit frozen by inke deed").comments("释放发行墨契时冻结的保证金")
				.event_ripple("pay recommendation commission").comments("发放荐宝佣金")
				.event_ripple("transfer artwork ownership to buyer").comments("修改艺术品的当前所有者")
			.on_event("submit complain").comments("用户提交了售后申请表单")
				.event_ripple("froze related money").comments("冻结所有相关的资金，等待投诉处理完毕")
			.on_event("complain resolved").comments("经调解协商，售后问题解决")
				.when("return to seller").comments("协商结果为退回卖家")
					.event_ripple("artwork rollback to wait for sale")
					.event_ripple("manually return to seller").comments("根据指定的协商结果，处理账目")
					.event_ripple("handle ink deed when transaction failed")
				.when("bought finally").comments("协商结果是买家同意购买")
					.event_ripple("handle ink deed when transaction success").comments("交易成功后，兑付墨契")
					.event_ripple("release seller deposit frozen by inke deed").comments("释放发行墨契时冻结的保证金")
					.event_ripple("pay recommendation commission").comments("发放荐宝佣金")
					.event_ripple("transfer artwork ownership to buyer").comments("修改艺术品的当前所有者")
					.event_ripple("manually confirm reception").comments("根据指定的协商结果，处理账目")
			/**内部事件*/
			.on_event("closed").internal_only()
				.comments("拍卖结束")
				.event_ripple("refund losed bidder deposit").comments("退还未中标竞拍者的保证金")
			.on_event("cash ink deed from seller deposit").comments("用卖家的保证金兑付墨契").internal_only()
			.on_event("release seller deposit frozen by inke deed").comments("释放发行墨契时冻结的保证金").internal_only()
			.on_event("artwork sold").comments("标记改作品已售").internal_only()
			.on_event("calculate order price").comments("计算所有艺术品拍卖的订单价格条目").internal_only()
			.on_event("create order").comments("创建艺术品拍卖订单").internal_only()
			.on_event("handle ink deed when transaction success").comments("交易成功后，兑付墨契").internal_only()
			.on_event("pay recommendation commission").comments("发放荐宝佣金").internal_only()
			.on_event("transfer artwork ownership to buyer").comments("修改艺术品的当前所有者").internal_only()
			.on_event("artwork rollback to wait for sale").comments("艺术品本次上架结束，回到‘已确权’状态").internal_only()
			.on_event("manually return to seller").comments("根据指定的协商结果，处理账目").internal_only()
			.on_event("manually confirm reception").comments("根据指定的协商结果，处理账目").internal_only()
			.on_event("refund losed bidder deposit").comments("退还未中标竞拍者的保证金").internal_only()
			.on_event("froze related money").comments("有售后纠纷后，冻结所有相关的资金，等待协商处理").internal_only()
			;
	

	@Override
	public EventScript getScript() {
		return SCRIPT;
	}
}
