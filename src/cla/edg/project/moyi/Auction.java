package cla.edg.project.moyi;

import cla.edg.eventscript.BaseEventDescriptionScript;
import cla.edg.eventscript.EventScript;

public class Auction extends BaseEventDescriptionScript{
	private static final EventScript SCRIPT = $("artwork auction")
			/**
			 * 确权
			 */
			.on_event("owner submit certificate info")
				.comments("持有人提交了认证资料")
				.when("already exists").comments("已经提交过资料")
					.event_ripple("update ownership info")
				.when("new application").comments("新的确权申请")
					.event_ripple("create ownership certifcate")
			.on_event("update ownership info").internal_only()
				.comments("更新所有权信息")
			.on_event("create ownership certifcate").internal_only()
				.comments("初次创建所有权信息")
			.on_event("ownership certificate bill paid")
				.comments("认证服务费已付清")
				.when("lack of deposit").comments("保证金不足")
				.when_others().comments("正常情况")
					.event_ripple("ownership certificate success")
			.on_event("ownership certificate success").internal_only()
				.comments("确权完成")
			;
	

	@Override
	public EventScript getScript() {
		return SCRIPT;
	}
}
