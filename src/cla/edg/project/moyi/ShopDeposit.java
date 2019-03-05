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
			.on_event("release seller deposit by ink deed cahsed")
				.comments("兑付墨契后释放保证金")
			.on_event("froze deposit by ink deed issuing")
				.comments("发行墨契时,需要冻结相应的保证金")
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
