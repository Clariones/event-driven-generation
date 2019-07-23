package cla.edg.project.yourong.events;

import cla.edg.eventscript.BaseEventDescriptionScript;
import cla.edg.eventscript.EventScript;

public class Contract extends BaseEventDescriptionScript{
	private static final EventScript SCRIPT = $("project running contract")
			/**
			 * 开始: 由某个用户提交一个项目申请
			 */
			.on_event("confirm").with("contract id")
				.comments("用户确认了项目合同")
				.event_ripple("change to confirmed")
			.on_event("reject").with("contract id")
				.comments("用户确认了项目合同")
				.event_ripple("change to tbd")
				
			.internal_only_bydefault()
			.on_event("change to confirmed")
			.on_event("change to tbd")
			;
	

	@Override
	public EventScript getScript() {
		return SCRIPT;
	}
}
