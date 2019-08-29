package cla.edg.project.yourong.events;

import cla.edg.eventscript.EventScript;

public class OwnerBills extends BaseYourongEventScript{
	private static final EventScript SCRIPT = $("owner bill")
			/**
			 * 开始: 由某公司发起支付申请
			 */
			.on_event("audit passed").with("bill")
				.comments("业主代表审核通过了支付申请")
				.event_ripple("change to need approve")
			.on_event("audit failed").with("bill")
				.comments("业主代表审核拒绝了支付申请")
				.event_ripple("change to audit fail")
			.on_event("approve done").with("bill")
				.comments("业主批准了支付申请")
				.event_ripple("change to need pay")
			.on_event("not approve").with("bill")
				.comments("业主不批准支付申请")
				.event_ripple("change to not approve")
				
			.internal_only_bydefault()
			.on_event("change to need approve")
			.on_event("change to audit fail")
			.on_event("change to need pay")
			.on_event("change to not approve")
			;
	

	@Override
	public EventScript getScript() {
		return SCRIPT;
	}
}
