package cla.edg.project.yourong.events;

import cla.edg.eventscript.BaseEventDescriptionScript;
import cla.edg.eventscript.EventScript;

public class YourongProjectBook extends BaseEventDescriptionScript{
	private static final EventScript SCRIPT = $("yourong project book")
			/**
			 * 开始: 由某个用户提交一个项目申请
			 */
			.on_event("confirm project book").with("yourong book")
				.comments("用户确认了项目建议书")
				.event_ripple("change yourong project book status")
			.on_event("reject project book").with("yourong book")
				.comments("用户不同意项目建议书")
				.event_ripple("change yourong project book status")
				
			.internal_only_bydefault()
			.on_event("change yourong project book status").with("yourong book").with("status id")
			
			;
	

	@Override
	public EventScript getScript() {
		return SCRIPT;
	}
}
