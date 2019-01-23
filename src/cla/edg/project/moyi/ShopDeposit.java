package cla.edg.project.moyi;

import cla.edg.eventscript.BaseEventDescriptionScript;
import cla.edg.eventscript.EventScript;

public class ShopDeposit extends BaseEventDescriptionScript{
	private static final EventScript SCRIPT = $("shop deposit")
			/**
			 * 店铺入驻
			 */
			.on_event("income deposit")
				.comments("有保证金入账")
				.when("has debt").comments("还有欠账")
					.event_ripple("still has debt")
				.when("debt repaid").comments("欠账偿还完毕")
					.event_ripple("debt has been repaid")
				.when_others().comments("没有变化")
			.on_event("still has debt")
				.comments("缴费后还有欠费")
			.on_event("debt has been repaid")
				.comments("缴费后还清欠费")
			/**
			 * 未完全定义的事件
			 */
			.on_event("TBD")
				.comments("待定")
			;
	

	@Override
	public EventScript getScript() {
		return SCRIPT;
	}
}
