package cla.edg.project.moyi;

import cla.edg.eventscript.BaseEventDescriptionScript;
import cla.edg.eventscript.EventScript;

public class InkDeed extends BaseEventDescriptionScript{
	private static final EventScript SCRIPT = $("ink deed")
			/**
			 * 发行
			 */
			.on_event("issue application submitted")
				.comments("用户提交了墨契发行请求")
				.event_ripple("create order for issue").comments("创建发行墨契的订单")
			.on_event("issue order paid")
				.comments("用户支付了墨契发行订单")
				.event_ripple("froze deposit by ink deed issuing").comments("发行墨契时,需要冻结相应的保证金").to("shop deposit")
				.event_ripple("create ink deed items").comments("生成所有的墨契条目")
				.event_ripple("update holding statistic by new issue").comments("根据新发行的墨契，更新持有情况")
			/**
			 * 挂单销售
			 */
			.on_event("entry order submitted")
				.comments("持有者提交了一个挂单请求")
				.event_ripple("create ink deed entry order").comments("创建墨契挂单")
				.event_ripple("update holding statistic by new entry order").comments("根据墨契挂单，更新持有人的持有情况")
			/**
			 * 撤销
			 */
			.on_event("entry order cancelled")
				.comments("持有者取消了墨契挂单")
				.event_ripple("ink deed need release from entry order").comments("释放ink deed 绑定的 entry order")
			/**
			 * 购买
			 */
			.on_event("start to buy ink deed")
				.comments("用户点击了 购买 按钮,准备支付")
				.event_ripple("unlock entry order timeout inventory").comments("由于超时而释放被锁定的墨契挂单")
				.event_ripple("lock down entry order").comments("锁定所售挂单")
				.event_ripple("create order for trade").comments("创建订单")
			.on_event("ink deed order paid")
				.comments("用户支付了墨契购买订单")
				.event_ripple("close ink deed order").comments("关闭墨契交易订单")
				.event_ripple("update holding statistic by trade").comments("更新持有人信息")
				.event_ripple("lock down entry order forever").comments("永久锁定墨契挂单")
			/**
			 * 拍卖交易成功,自动兑付
			 */
			.on_event("auction closed as success")
				.comments("艺术品拍卖成功关闭,自动兑付墨契")
				.event_ripple("cash ink deed by auction trade closed").comments("兑付墨契")
				.event_ripple("release seller deposit by ink deed cahsed").comments("兑付墨契后释放保证金").to("shop deposit")
			/**
			 * 不能自动兑付后,申请退款
			 */
			.on_event("drawback application submitted")
				.comments("")
				
			/**
			 * 以下全部是内部事件
			 */
			.internal_only_bydefault()
			.on_event("create order for issue")
				.comments("创建发行墨契的订单")
			.on_event("create ink deed items")
				.comments("生成所有的墨契条目")
			.on_event("create ink deed entry order")
				.comments("创建墨契挂单")
				.event_ripple("entry order need allocate ink deed").comments("挂单创建成功后,分配墨契ID")
			.on_event("lock down entry order")
				.comments("锁定所售挂单")
			.on_event("create order for trade")
				.comments("创建墨契销售订单")
			.on_event("unlock entry order timeout inventory")
				.comments("由于超时而释放被锁定的墨契挂单")
			.on_event("update holding statistic by trade")
				.comments("更新持有人信息")
			.on_event("update holding statistic by new issue")
				.comments("根据新发行的墨契，更新持有情况")
			.on_event("close ink deed order")
				.comments("关闭墨契交易订单")
				.event_ripple("entry order need transfer ink deed").comments("挂单成功交易后,转移墨契ID")
				.event_ripple("ink deed need release from entry order").comments("挂单成功交易后,释放绑定")
			.on_event("cash ink deed by auction trade closed")
				.comments("兑付墨契")
			.on_event("update holding statistic by new entry order")
				.comments("根据墨契挂单，更新持有人的持有情况")
			.on_event("lock down entry order forever")
				.comments("永久锁定墨契挂单")
			.on_event("entry order need allocate ink deed")
				.comments("挂单创建成功后,分配墨契ID")
			.on_event("entry order need transfer ink deed")
				.comments("挂单成功交易后,转移墨契ID,并释放绑定")
			.on_event("ink deed need release from entry order")
				.comments("挂单成功交易后,释放绑定")
			;
	

	@Override
	public EventScript getScript() {
		return SCRIPT;
	}
}
