package cla.edg.project.yrzx.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;

public class ContractQueryPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script
			// contract
			.find(MODEL.standardContract()).which("in project").with_string("project id")
				.comments("按照项目统计各个类型的合同数量")
				.do_it_as().count_by(MODEL.standardContract().contractType())
				.where(MODEL.standardContract().project().eq("${project id}"))
			.find(MODEL.standardContract()).which("in project with type").with_string("project id").with_string("type")
				.comments("按照项目统计某个类型的各种状态的合同数量")
				.do_it_as().count_by(MODEL.standardContract().contractStatus())
				.where(MODEL.standardContract().project().eq("${project id}"), MODEL.standardContract().contractType().eq("${type}"))
			.query(MODEL.standardContract()).list_of("project with type").pagination().with_string("project id").with_string("type").with_string("filter")
				.comments("查询项目中的，某个类型的，指定状态的订单列表")
				.do_it_as()
				.where(MODEL.standardContract().project().eq("${project id}"),
						MODEL.standardContract().contractType().eq("${type}"),
						MODEL.standardContract().contractStatus().eq("${filter}"))
				.order_by(MODEL.standardContract().lastUpdateTime()).asc()
				.wants(MODEL.standardContract().contractStatus(), MODEL.standardContract().partyA())
			.find(MODEL.standardContract()).which("by id").with_string("contract id")
				.comments("按ID加载合同")
				.do_it_as()
				.where(MODEL.standardContract().id().eq("${contract id}"))
				.wants(MODEL.standardContract().contractStatus(),
						MODEL.standardContract().contractType(),
						MODEL.standardContract().project(),
						MODEL.standardContract().partyA())
			// pay item
			.find(MODEL.contractPayItem()).which("in contract by pay status").with_string("contract id")
				.comments("统计一个合同下，每种状态的支付款项有多少个")
				.do_it_as().count_by(MODEL.contractPayItem().payItemStatus())
				.where(MODEL.contractPayItem().contract().eq("${contract id}"))
			.query(MODEL.contractPayItem()).list_of("contract").with_string("contract id").with_integer("top n")
				.comments("查询合同的 支付 类的支付款项")
				.do_it_as()
				.where(MODEL.contractPayItem().contract().eq("${contract id}"))
				.top("${top n}")
				.order_by(MODEL.contractPayItem().id()).asc()
				.wants(MODEL.contractPayItem().payer(), MODEL.contractPayItem().payItemStatus())
			.query(MODEL.contractPayItem()).list_of("contract by pay status").pagination().with_string("contract id").with_string("filter")
				.comments("查询合同的 支付 类的支付款项")
				.do_it_as()
				.where(MODEL.contractPayItem().contract().eq("${contract id}"))
				.order_by(MODEL.contractPayItem().id()).asc()
				.wants(MODEL.contractPayItem().payer(), MODEL.contractPayItem().payItemStatus())
			.find(MODEL.contractPayItem()).which("by id").with_string("item id")
				.comments("按照ID加载支付项")
				.do_it_as()
				.where(MODEL.contractPayItem().id().eq("${item id}"))
				.wants(MODEL.contractPayItem().payItemStatus(), MODEL.contractPayItem().payer())

			.query(MODEL.contractPayItem()).list_of("project").with_string("project id").pagination()
				.comments("查询项目下的所有合同支付项")
				.do_it_as()
				.where(
						MODEL.contractPayItem().contract().project().eq("${project id}")
				)
				.wants(
						MODEL.contractPayItem().contract(),
						MODEL.contractPayItem().payItemStatus(),
						MODEL.contractPayItem().payee().employeeNominationListAsEmployee().projectNominationList().project()
				)



			// commission pay item
			.find(MODEL.commissionPayItem()).which("in contract by pay status").with_string("contract id")
				.comments("统计一个合同下，每种状态的支付款项有多少个")
				.do_it_as().count_by(MODEL.commissionPayItem().payItemStatus())
				.where(MODEL.commissionPayItem().contract().eq("${contract id}"))
			.query(MODEL.commissionPayItem()).list_of("contract").with_string("contract id").with_integer("top n")
				.comments("查询合同的 提成 类的支付款项")
				.do_it_as()
				.where(MODEL.commissionPayItem().contract().eq("${contract id}"))
				.top("${top n}")
				.order_by(MODEL.commissionPayItem().id()).asc()
				.wants(MODEL.commissionPayItem().contractPayItem(), MODEL.commissionPayItem().payItemStatus(), MODEL.commissionPayItem().payer())
			.query(MODEL.commissionPayItem()).list_of("contract by pay status").pagination().with_string("contract id").with_string("filter")
				.comments("查询合同的 提成 类的支付款项")
				.do_it_as()
				.where(MODEL.commissionPayItem().contract().eq("${contract id}"))
				.order_by(MODEL.commissionPayItem().id()).asc()
				.wants(MODEL.commissionPayItem().contractPayItem(), MODEL.commissionPayItem().payItemStatus(), MODEL.commissionPayItem().payer())
			.find(MODEL.commissionPayItem()).which("by id").with_string("item id")
				.comments("按照ID加载抽成的款项")
				.do_it_as()
				.where(MODEL.commissionPayItem().id().eq("${item id}"))
				.wants(MODEL.commissionPayItem().payer(), MODEL.commissionPayItem().contractPayItem(), MODEL.commissionPayItem().payItemStatus())

			// contract review
			.query(MODEL.contractReviewRecord()).list_of("contract").pagination().with_string("contract id").with_integer("number")
				.comments("查询合同的审核记录")
				.do_it_as()
				.where(MODEL.contractReviewRecord().contract().eq("${contract id}"))
				.top("${number}")
				.wants(MODEL.contractReviewRecord().reviewer().type(), MODEL.projectNomination().projectRole(), MODEL.projectNomination().worker().employee())
			// contract comments
			.query(MODEL.contractCommentsRecord()).list_of("contract").pagination().with_string("contract id").with_integer("number")
				.comments("查询合同的批注记录")
				.do_it_as()
				.where(MODEL.contractCommentsRecord().contract().eq("${contract id}"))
				.top("${number}")
				.wants(MODEL.contractCommentsRecord().submitter().type(), MODEL.projectNomination().projectRole(), MODEL.projectNomination().worker().employee())
			;

		return script;
	}

}
