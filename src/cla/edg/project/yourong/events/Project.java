package cla.edg.project.yourong.events;

import cla.edg.eventscript.BaseEventDescriptionScript;
import cla.edg.eventscript.EventScript;

/**
 * 项目的生命周期:
 * 开始: 某个用户创建一个项目申请, 提交到平台
 * 处理:
 * 	1. 平台工作人员, 查看未处理的项目申请, 找到这个新的项目申请.
 *  2. 根据申请中的信息, [线下]和项目的提交人(一般就是业主)联系, 了解更详细的信息
 *  3. 然后根据了解到的信息, [线下]和客户沟通后, 在平台创建一个项目,并生成一个'信托服务'的账单,让用户去支付
 *  4. 用户支付了账单后, 项目启动
 *  5. 平台工作人员查看已经支付了信托服务费的项目, 看到这个项目
 *  6. 平台工作人员开始[线下]招投标, 确定各个工作包和工作包的品牌方
 *  7. 各个品牌方的负责人查看到新的工作包后, 创建工作包中的任务, 确定任务价格
 *  8. 平台工作人员, 根据经验, 决定每一批次的task, 生成一个合并支付订单,交给业主去支付
 *  9. 业主在项目概要页面可以看到订单, 在订单页面也可以看到, 无论哪个入口, 都可以支付订单.
 *  10. 各个品牌方的负责人看到任务状态变化为'已支付',或者其他什么表示'可以开始执行'的状态(根据任务类型有不同)后,开始填写工作日报,更改状态等
 *  11. 重复这个过程直到所有任务都完成了支付和工作, 项目完成, (可能)进入项目维护阶段
 *  12. 维护期结束, 项目真正结束.
 * @author clariones
 *
 */
public class Project extends BaseEventDescriptionScript{
	private static final EventScript SCRIPT = $("project")
			/**
			 * 开始: 由某个用户提交一个项目申请
			 */
			.on_event("application submited").with("input form data")
				.comments("用户提交了新项目申请")
			
			;
	

	@Override
	public EventScript getScript() {
		return SCRIPT;
	}
}
