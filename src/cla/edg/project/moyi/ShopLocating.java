package cla.edg.project.moyi;

import cla.edg.eventscript.BaseEventDescriptionScript;
import cla.edg.eventscript.EventScript;

public class ShopLocating extends BaseEventDescriptionScript{
	private static final EventScript SCRIPT = $("ShopLocating")
			/**
			 * 店铺入驻
			 */
			.on_event("shop certification submit")
				.comments("店主提交店铺入驻申请")
				.when("new application").comments("是新申请")
					.event_ripple("create shop certification")
				.when("update application").comments("修改了申请，重新提交")
					.event_ripple("update shop certification")
			.on_event("create shop certification").internal_only()
				.comments("创建一个新的店铺认证申请")
			.on_event("update shop certification").internal_only()
				.comments("修改当前的店铺认证申请")
			.on_event("shop info submit")
				.comments("店主提交店铺基本信息")
				.when("new shop").comments("是新店铺")
					.event_ripple("new shop info")
				.when("update shop").comments("修改店铺信息")
					.event_ripple("update shop info")
			.on_event("new shop info").internal_only()
				.comments("新店铺创建")
			.on_event("update shop info").internal_only()
				.comments("新店铺创建")
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
