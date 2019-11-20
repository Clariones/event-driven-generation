package cla.edg.project.moyi;

import cla.edg.eventscript.EventScript;

public class V3AuctionService extends BaseMoyiEventScript {
	private static final EventScript SCRIPT = $("artwork auction v3")
			.on_event("submit sale request").with("input form data")
				.comments("提交拍品上架的请求")
				.rule_comments("首先做检查:保证金足够;是我持有的作品;目前没有其他正在进行的拍卖")
				.rule_comments("然后为艺术品构造一个拍品")
				.event_ripple("create or update artwork auction")
				
				
			// //////////////////
			// 以下为内部消息
			// //////////////////
				
			.internal_only_bydefault()
			.on_event("create or update artwork auction").with("input form data")
				.comments("用提交的form中的信息, 创建一个拍卖")
			;

	@Override
	public EventScript getScript() {
		return SCRIPT;
	}

}
