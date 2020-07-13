package cla.edg.project.yrzx.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;


public class MoneyRelatedQueryPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script
		// 账本相关
			.query(MODEL.accountBook()).which("merchant").with_string("merchant id")
				.comments("查询公司的账户")
				.do_it_as()
				.where(MODEL.accountBook().owner().eq("${merchant id}"))
				.wants(MODEL.accountBook().owner(), MODEL.accountBook().type())
			.query(MODEL.accountBookItem()).which("account book").pagination().with_string("account book id").with_string("status")
				.comments("查询当前账户的条目")
				.do_it_as()
				.where(MODEL.accountBookItem().accountBook().eq("${account book id}"),
						MODEL.accountBookItem().status().eq("${status}").optional()
				)
			.query(MODEL.accountBookRecord()).which("account book").pagination().with_string("account book id")
				.comments("查询当前账户的流水记录")
				.do_it_as()
				.where(MODEL.accountBookRecord().payeeAccount().eq("${account book id}").or(MODEL.accountBookRecord().payerAccount().eq("${account book id}")))



			.query(MODEL.accountBookRecord()).list_of("user in time span").with_string("merchant id").with_date("start date").with_date("end date")
				.comments("查询某时间段内某人流水")
				.do_it_as()
				.where(
						MODEL.accountBookRecord().payerAccount().owner().eq("${merchant id}").or(
								MODEL.accountBookRecord().payeeAccount().owner().eq("${merchant id}")),
						MODEL.accountBookRecord().createTime().bigger_or_eq("${start date}"),
						MODEL.accountBookRecord().createTime().before("${end date}")
				)
				.wants(
						MODEL.accountBookRecord().payeeAccount().owner()

				)


				.find(MODEL.contractPayItem()).list_of("project to be paid in time").with_string("project id").with_string("merchant id").with_date("start time").with_date("end time")
				.comments("按月统计项目中合同预期支出总数")
				.do_it_as()
				.sum(MODEL.contractPayItem().payAmount())
				.where(
//						MODEL.contractPayItem().expectedTime().bigger_or_eq("${start time}"),
//						MODEL.contractPayItem().expectedTime().before("${end time}"),
						MODEL.contractPayItem().payer().eq("${merchant id}"),
						MODEL.contractPayItem().contract().project().eq("${project id}")
				)

				.find(MODEL.contractPayItem()).list_of("project to receive in time").with_string("project id").with_string("merchant id").with_date("start time").with_date("end time")
				.comments("按月统计项目中合同预期收入总数")
				.do_it_as()
				.sum(MODEL.contractPayItem().payAmount())
				.where(
//						MODEL.contractPayItem().expectedTime().bigger_or_eq("${start time}"),
//						MODEL.contractPayItem().expectedTime().before("${end time}"),
						MODEL.contractPayItem().payee().eq("${merchant id}"),
						MODEL.contractPayItem().contract().project().eq("${project id}")
				)

				.find(MODEL.contractPayItem()).list_of("project to receive by contract").with_string("project id").with_string("merchant id").with_string("contract id")
				.comments("按合同统计项目中预期收入总数")
				.do_it_as()
				.sum(MODEL.contractPayItem().payAmount())
				.where(
						MODEL.contractPayItem().payee().eq("${merchant id}"),
						MODEL.contractPayItem().contract().project().eq("${project id}"),
						MODEL.contractPayItem().contract().eq("${contract id}")
				)


				.find(MODEL.contractPayItem()).list_of("project to be paid by contract").with_string("project id").with_string("merchant id").with_string("contract id")
				.comments("按合同统计项目中预期支出总数")
				.do_it_as()
				.sum(MODEL.contractPayItem().payAmount())
				.where(
						MODEL.contractPayItem().payer().eq("${merchant id}"),
						MODEL.contractPayItem().contract().project().eq("${project id}"),
						MODEL.contractPayItem().contract().eq("${contract id}")
				)



				.find(MODEL.accountBook()).list_of("merchant by type").with_string("merchant id").with_string("type id")
					.comments("查询某人的某账本")
					.do_it_as()
					.where(
							MODEL.accountBook().owner().employeeNominationListAsEmployer().employee().eq("${merchant id}"),
							MODEL.accountBook().type().eq("${type id}")
					)


				.query(MODEL.accountBookRecord()).list_of("merchant").with_string("merchant id").pagination()
					.comments("查看某人相关流水")
					.do_it_as()
					.where(
							MODEL.accountBookRecord().payerAccount().owner().employeeNominationListAsEmployer().employee().eq("${merchant id}")
							.or(
									MODEL.accountBookRecord().payeeAccount().owner().employeeNominationListAsEmployer().employee().eq("${merchant id}")
							)
					)
					.wants(
							MODEL.accountBookRecord().payerAccount().owner()
					)
					.order_by(MODEL.accountBookRecord().createTime()).desc()

				.query(MODEL.accountBookRecord()).list_of("account book by payer in project").with_string("merchant id").with_string("project id").with_string("account book type").pagination()
					.comments("按项目查询某人的某本账上的付款记录")

				.query(MODEL.accountBookRecord()).list_of("account book by payee in project").with_string("merchant id").with_string("project id").with_string("account book type").pagination()
				.comments("按项目查询某人的某本账上的收款记录")


			.find(MODEL.accountBook()).list_of("merchant").with_string("merchant id")
				.do_it_as()
				.where(
						MODEL.accountBook().owner().eq("${merchant id}")
				)
			.order_by(MODEL.accountBook().lastUpdateTime()).desc()

		;

		return script;
	}

}
