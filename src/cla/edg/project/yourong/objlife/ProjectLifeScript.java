package cla.edg.project.yourong.objlife;

import cla.edg.objlifescript.BaseObjectLifeScript;
import cla.edg.objlifescript.ObjectLifeScript;

public class ProjectLifeScript extends BaseObjectLifeScript{
	protected static ObjectLifeScript SCRIPT = $("project")
			.configure()
				.package_name("com.ab.c")
				.explore_object("project")
			.start_from("load project")
			.then("check project proposal book").comments("检查项目建议书的状态")
				.when_has_not().stop_with("ask store to make project proposal book")
				.when("never confirmed").stop_with("ask property owner to confirm project proposal book")
				.when("reject").stop_with("notify store to communicate with property owner with project proposal book")
			.then_mark("EPC hosting finished").comments("EPC托管结束")
			
			
			.then("check need deisgn phase").comments("检查是否需要设计阶段的工作")
				.when_not().jump_to("design phase done")
				
			.then("check design spec book").comments("检查设计任务书的状态")
				.when_has_not().stop_with("ask store to make design spec book ready")
				.when("never confirmed").stop_with("ask property owner to confirm project proposal book")
			.then("check has design management info").comments("检查是否有设计管理信息")
				.when_not().continue_with("ask store to make design management info ready")
			.then("check has project design excess reserve bill").comments("检查有没有设计备付金账单")
				.when_not().stop_with("ask store to create project design excess reserve bill")
			.then("check has project design excess reserve order").comments("检查有没有设计备付金账单")
				.when_not().stop_with("ask store to create project design excess reserve order")
			.then("check project design execess reserve order status").comments("")
				.when("need verify").stop_with("ask owner finiance verify project design execess reserve order")
				.when("verify failed").stop_with("ask store to check project design execess reserve order")
				.when("need agree").stop_with("ask owner agree project design execess reserve order")
				.when("agree failed").stop_with("ask store to check project design execess reserve order")
				.when("need pay").stop_with("ask owner finiance pay project design execess reserve order")
			.then("check has design RFP").comments("")
				.when_not().stop_with("ask store to make design RFP ready")
			.then("check design RFP status").comments("")
				.when("need verify").stop_with("ask owner to confirm deisgn RFP")
			.then("check design RFP result").comments("")
				.when_not().stop_with("ask store to make design RFP result ready")
			.then("check design tripartite contract").comments("")
				.when_has_not().stop_with("ask store to make design tripartite contract ready")
				.when("never confirmed").stop_with("ask property owner to confirm design tripartite contract")
			.then("check design work packages").comments("")
				.when_not().stop_with("ask store to make design pakcage ready")
			.then("check design work package")
				.for_each("work package").comments("遍历每个设计阶段的work package")
					.start_from("check design package task").comments("")
						.when_has_not().stop_with("ask store to make design task ready")
					.then("check design task")
						.for_each("task").comments("遍历每个工作包里的task")
							.start_from("check task is finished").comments("")
								.when("not finished").stop_with("ask worker to finish design task")
							.then("check has design task bill").comments("")
								.when_has_not().continue_with("create design task bill automaticly")
							.finally_result("task").comments("综合所有task的检查结果, 最后给出一个 stop/continue 的结论")
						.when("wait until tasks finished").stop()
					.finally_result("work package").comments("综合所有package的检查结果, 最后给出一个 stop/continue 的结论")
				.when("wait until packages finished").stop()
			.then_mark("design phase done").comments("")
			
							
			.then("check need construction phase").comments("")
				.when_not().jump_to("construction phase done")
						
			.then("has project construction management info").comments("")
				.when_has_not().stop_with("ask store to make project construction management info ready")
			.do_all_of("check for 2 books for construction")
				.one_is("costs control book")
					.start_from("check costs control book").comments("")
						.when_has_not().stop_with("ask store to make costs control book ready")
					.then("check costs control book confirmed").comments("")
						.when_has_not().stop_with("ask owner to confirm costs control book")
						.when("reject").stop_with("ask store to update costs control book")
					.finally_result("costs control book")
				.one_is("construction tasks book")
					.start_from("check construction tasks book").comments("")
						.when_has_not().stop_with("ask store to make construction tasks book ready")
					.then("check construction tasks book confirmed").comments("")
						.when_has_not().stop_with("ask owner to confirm construction tasks book")
						.when("reject").stop_with("ask store to update construction tasks book")
					.finally_result("construction tasks book")
				.finally_result("check for 2 books for construction")
				.when("need wait confirm").stop()
			.then("check construction execess reserve order").comments("")
				.when_has_not().stop_with("ask store to make construction execess reserve order ready")
			.then("check construction execess reserve order status").comments("")
				.when("need verify").stop_with("ask owner finiance to verify construction execess reserve order")
				.when("need agree").stop_with("ask owner to agree construction execess reserve order")
				.when("failed anyway").stop_with("notify store to check construction execess reserve order")
			.then("check construction execess reserve order paid").comments("")
				.when_not().stop_with("ask owner finiance to pay construction execess reserve order")
			.then("check has construction RFP").comments("")
				.when_has_not().stop_with("ask store to make construction RFP ready")
				.when("need agree").stop_with("ask owner to agree construction RFP")
			.then("check construction RFP result").comments("")
				.when_has_not().stop_with("ask store to update construction RFP result")
			.then("check construction tripartite constract").comments("")
				.when_has_not().stop_with("ask store to make construction tripartite constract ready")
				.when("need agree").stop_with("ask owen to agree construction tripartite constract")
			.then("check construction work packages was created").comments("")
				.when_has_not().stop_with("ask store to create contruction work package")
			.then("check construction work packages")
				.for_each("work package")
					.start_from("check construction tasks was created").comments("")
						.when_has_not().stop_with("ask store to create tasks in construction work package")
					.then("check contruction task")
						.for_each("task")
							.do_one_of("check each contruction task").decided_by("check construction task type")
								.one_is("prepaid task").comments("先给钱, 后干活")
									.start_from("check has prepaid task bill").comments("")
										.when_has_not().continue_with("create prepaid task bill")
									.then("check construct task bill").comments("")
										.when("need verify").stop_with("ask owner finiance to verify bill")
										.when("need agree").stop_with("ask owner to agree bill")
										.when("need pay").stop_with("ask owner finiance to pay")
									.then("check construct task finished").comments("")
										.when_not().stop_with("ask worker to finish task")
									.then("construct task need acceptance").comments("")
										.when_not().stop()
									.then("check task acceptance done").comments("")
										.when("wait accept").stop_with("ask owner to accept task")
										.when("failed").stop_with("ask store to communicate with owner for this task")
									.finally_result("prepaid task").comments("只统计, 不需要处理")
								
								.one_is("normal task").comments("先干活, 后给钱")
									.start_from("check construct task finished").comments("")
										.when_not().stop_with("ask worker to finish task")
									.then("construct task need acceptance").comments("")
										.when_not().jump_to("check has task bill")
									.then("check task acceptance done").comments("")
										.when("wait accept").stop_with("ask owner to accept task")
										.when("failed").stop_with("ask store to communicate with owner for this task")
									.then("check has task bill").comments("")
										.when_has_not().continue_with("create prepaid task bill")
									.then("check construct task bill").comments("")
										.when("need verify").stop_with("ask owner finiance to verify bill")
										.when("need agree").stop_with("ask owner to agree bill")
										.when("need pay").stop_with("ask owner finiance to pay")
									.finally_result("normal task").comments("只统计, 不需要处理")
							.finally_result("task")
						.when("has task need handle").stop() // 有任务未关闭, 不继续
					.finally_result("work package")
				.then_mark("construction phase done")
							
				
				
				
				
				
				
				
				
			;
}
