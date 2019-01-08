package cla.edg.project.moyi;

import cla.edg.script.BaseEventDescriptionScript;
import cla.edg.script.EventScript;

public class Auction extends BaseEventDescriptionScript{
	private static final EventScript SCRIPT = $("auction")
			.handle_event("system close auction by time")
				.comments("系统根据时间关闭拍卖")
				.when("bought in")
					.comments("流拍")
					.event_ripple("auction closed as bought in")
				.when("deal")
					.comments("成交")
					.event_ripple("auction closed as deal")
			.handle_event("auction closed as bought in")
				.comments("流拍").internal_only()
				.event_ripple("give back seller auction deposit").asyn().comments("流拍以后退还卖家履约保证金")
				.event_ripple("give back bidder deposit").asyn().comments("仅限未竞价成功的竞买人")
			.handle_event("auction closed as deal")
				.comments("成交").internal_only()
				.event_ripple("create auction order")
				.event_ripple("give back bidder deposit")
			;

	@Override
	public EventScript getScript() {
		return SCRIPT;
	}
}
