package cla.edg.project.moyi;

import cla.edg.eventscript.EventScript;

public class V3InkDeedService extends BaseMoyiEventScript {
	private static final EventScript SCRIPT = $("ink deed v3")
			// 发行墨契相关
			.on_event("submit issuing request").with("artwork auction id").with("usufructRatio").with("number")
				.comments("提交发行墨契的请求")
				.rule_comments("检查规则: 店铺保证金不少于1000元;起拍价大于20元;没超过30%...")
				.rule_comments("DO:为用户生成一个 墨契发行 订单")
				
			.on_event("issue ink deed").with("artwork auction").with("usufructRatio").with("number")
				.comments("发行墨契")
				.rule_comments("会检查是否可以发行墨契: 首先同提交发行请求时一样检查一遍,防止当初的一些条件发生了变化")
				.rule_comments("DO:生成若干份墨契,并将之初始化")
				
			// 墨契挂单销售
			.on_event("put on sale").with("number").with("price").with("artwork auction")
				.comments("墨契上架销售")
				.rule_comments("选中若干份墨契,并将之状态转变为 流通中")
				
			// 拍卖状态变化导致的墨契状态变化
			.on_event("auction start").with("artwork auction")
				.comments("拍卖开始")
				.rule_comments("理论上所有墨契,状态转变为 待兑付")
				.rule_comments("实际上,只转变 '流通中','已预订' 的. 新发行的, 已结算的, 待生效的应该不动.")
				.rule_comments("我们允许开拍后,继续将开拍前下单的交易完成.")
				
			.on_event("auction bought in").with("artwork auction")
				.comments("拍卖流拍了,需要处理墨契")
				.rule_comments("所有墨契交易原路退回")
				
			.on_event("auction cancelled with buyer default").with("artwork auction")
				.comments("买家违约,聚镁仲裁,决定取消交易,需要处理墨契")
				.rule_comments("所有墨契交易原路退回")
				
			.on_event("auction cancelled with seller default").with("artwork auction")
				.comments("卖家违约,聚镁仲裁,决定取消交易,需要处理墨契")
				.rule_comments("所有墨契交易原路退回")
				
			.on_event("auction cancelled with dispute").with("artwork auction")
				.comments("买卖双方有纠纷,聚镁仲裁,决定取消交易,需要处理墨契")
				.rule_comments("所有墨契交易原路退回")
				
			.on_event("auction success settlement").with("artwork auction")
				.comments("交易成功结算,需要处理墨契后续相关事宜")
				.rule_comments("墨契兑付在这里处理. 还要处理墨契状态变化")
				.rule_comments("墨契兑付的财务部分,需要和订单,荐宝等一起处理.")
				
			.on_event("reshelf artwork").with("artwork auction")
				.comments("拍品二次上架,需要迁移墨契")
				.rule_comments("二次上架需要处理7种相关数据,此处仅处理墨契状态回迁到'新发行',重新计算发行价的事情")
				
			// 墨契交易相关
			.on_event("be drawn").with("user id").with("ink deed list").with("artwork auction")
				.comments("用户抽取了某些墨契")
				.rule_comments("该墨契状态应被设定为'被抽中'")
				.event_ripple("change status")
				.event_ripple("create ink deed order")
			.on_event("start to pay order").with("main order")
				.comments("用户下单购买墨契")
				.rule_comments("该墨契状态应被设定为'已预订'")
				.event_ripple("change status")
			.on_event("order completed").with("main order")
				.comments("用户完成了墨契订单")
				.rule_comments("该墨契状态应被设定为'新发行'")	// 购买完成后,不是'可流通',需要重新上架
			.on_event("order cancelled by user").with("main order")
				.comments("墨契订单被取消")
				.event_ripple("change status")
			.on_event("order cancelled because timeout").with("main order")
				.comments("因为用户超时未支付, 墨契订单被取消")
				.event_ripple("change status")
			.on_event("order released because timeout").with("main order")
				.comments("因为用户30秒内未下单,墨契被释放, 重新进入待售列表")
				.event_ripple("change status")
			
				
			// 内部事件
			.internal_only_bydefault()
			.on_event("change status").with("ink deed status").with("ink deed list")
				.comments("改变墨契状态事件")
			.on_event("create ink deed order").with("user id").with("ink deed list").with("artwork auction")
				.comments("创建墨契订单")
			;

	@Override
	public EventScript getScript() {
		return SCRIPT;
	}

}
