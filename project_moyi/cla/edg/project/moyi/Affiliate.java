package cla.edg.project.moyi;

import cla.edg.eventscript.EventScript;

public class Affiliate extends BaseMoyiEventScript{
	private static final EventScript SCRIPT = $("affiliate")
			/**
			 * 发行
			 */
			.on_event("shared auction accessed")
				.comments("用户访问了被分享的艺术品拍卖")
				.when("success").comments("分享的链接被登录用户请求了")
					.event_ripple("affiliate success")
				.when("not valid").comments("无效的affiliate访问,没有分享者ID,或者是自己访问")
				.when("not login").comments("访问者是未登录用户")
					.event_ripple("affiliate access need cache")
			.on_event("new user register")
				.comments("新用户注册")
				.when("lead by affiliate").comments("是通过荐宝人引导注册的")
					.event_ripple("affiliate success")
				.when_others().comments("不是被引导的")
			.on_event("user login")
				.comments("用户注册登录")
				.when("lead by affiliate").comments("是通过荐宝人引导注册的")
					.event_ripple("affiliate success")
				.when_others().comments("不是被引导的")
			.internal_only_bydefault()
			
			.on_event("affiliate success")
				.comments("有效的affiliate访问")
				.event_ripple("clear cached affiliate access")
			.on_event("affiliate access need cache")
				.comments("需要将访问记录暂时缓存在session中")
			.on_event("clear cached affiliate access")
				.comments("需要将访问记录从缓存中清除")
			;

	@Override
	public EventScript getScript() {
		return SCRIPT;
	}
}
