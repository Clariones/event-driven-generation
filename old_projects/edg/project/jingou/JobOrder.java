package cla.edg.project.jingou;

import cla.edg.eventscript.BaseEventDescriptionScript;
import cla.edg.eventscript.EventScript;

/**
 * <pre>
					待卸货			待皮重				待定价			待确认		已结束		已取消
	称毛重		:	更新毛重,状态不变	报错					报错				报错			 -			 -
	称皮重		:	报错				更新皮重, 去待定价		报错				报错			 -			 -
	无上下文称重	:	更新毛重,状态不变	更新皮重, 去待定价		报错				报错			 -			 -
	卸货确认		:	去待皮重			报错					报错				报错			 -			 -
	提交定价信息	:	报错				报错					计算,去待确认		报错			 -			 -
	确认定价信息	:	报错				报错					报错				去 结束		 -			 -
	站长取消		:	去 取消			去 取消				去 取消			去 取消		 -			 -
 * </pre>
 * 其他事件:
 * 1. create 事件. 
 * 2. 各种有意义的日志类型事件, 例如用户选择重新称重.
 */
public class JobOrder extends BaseEventDescriptionScript {
	private static final EventScript SCRIPT = $("job order")
			.on_event("create").with("scale id").with("vehicle plate number").with("seller warehouse") // .with("vehicle plate number") 暂时不是必须的, 可能没有识别到
				.comments("create 事件,创建订单,工作单,运输单,及各项日志")
				.rule_comments("创建主订单")
				.rule_comments("创建line item")
				.rule_comments("创建工作单")
				.rule_comments("创建工作单shipping记录")
				.rule_comments("创建工作单下一步工作人员信息")
				
			.on_event("got gross weight").with("scale id").with("weight").with("job order")
				.comments("得到称毛重的结果")
				.event_ripple("update gross weight")
				.event_ripple("change to need unload")
			.on_event("got tare weight").with("scale id").with("weight").with("job order")
				.comments("得到称皮重的结果")
				.event_ripple("update tare weight")
				.event_ripple("change to need pricing")
			.on_event("got weight without type").with("scale id").with("job order")
				.comments("得到称重的结果,但是不清楚是皮重还是毛重")
				.when("fill gross weight")
					.event_ripple("change to need confirm gross weight")
				.when("fill tare weight")
					.event_ripple("change to need confirm tare weight")
			.on_event("unloading confirmed").with("job order")
				.comments("确认卸货")
				.event_ripple("change to need tare weight")
			.on_event("pricing info submitted").with("job order").with("input form data")
				.comments("提交了订单的定价信息")
				.event_ripple("update pricing info")
				.event_ripple("change to need confirm")
			.on_event("pricing confirmed").with("job order").with("job order pricing")
				.comments("确认了定价信息")
				.rule_comments("主订单变成 待支付")
				.event_ripple("change to closed")
			.on_event("cancel required").with("job order")
				.comments("有 取消 请求到来")
				.event_ripple("change to cancelled")
			.on_event("change to need confirm gross weight").with("job order")
			.on_event("change to need confirm tare weight").with("job order")
			.on_event("change to need tare weight").with("job order")
				.comments("状态改变:待称皮重")
			.on_event("change to need gross weight").with("job order")
				.comments("状态改变:待称皮重")
				
			.internal_only_bydefault()
			.on_event("update gross weight").comments("更新毛重")
			.on_event("update tare weight").comments("更新皮重")
			.on_event("update pricing info").with("job order").with("input form data")
				.comments("更新定价相关的几个信息")
				.rule_comments("首先取出product")
				.rule_comments("然后计算实际重量")
				.rule_comments("计算的结果,更新到job order上")
				.rule_comments("计算的结果,记录到pricing info中")
			.on_event("change to need unload").comments("状态改变:待卸货")
			.on_event("change to need pricing").comments("状态改变:待定价")
			
			.on_event("change to need confirm").comments("状态改变:待确认")
			.on_event("change to closed").comments("状态改变:已完成")
			.on_event("change to cancelled").comments("状态改变:已取消")
			
			;

	@Override
	public EventScript getScript() {
		return SCRIPT;
	}
}
