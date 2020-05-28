package cla.edg.project.yrzx.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;

/**
 * 金融服务相关
 */
public class FinanceServiceQueryPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script
			.query(MODEL.loanApplication()).list_of("in project by status").with_string("project id").with_string("filter").pagination()
		.comments("按状态查询项目中的贷款申请")
			.do_it_as()
		.where(MODEL.loanApplication().loanProject().eq("${project id}"),
		MODEL.loanApplication().status().eq("${filter}").optional()
		)
		.wants(

				MODEL.loanApplication().status(),
				MODEL.loanApplication().applicant(),
				MODEL.loanApplication().loanContractList(),
				MODEL.loanApplication().financialServiceStatisticReportList()
		)




		.query(MODEL.loanContract()).which("in project by status").with_string("project id").with_string("filter").pagination()
			.comments("按状态查看项目中的贷款合同")
			.do_it_as()
			.where(
					MODEL.loanContract().status().eq("${filter}").optional(),
					MODEL.loanContract().project().eq("${project id}")
			)
			.wants(
					MODEL.loanContract().borrower(),
					MODEL.loanContract().lender(),
					MODEL.loanContract().status()
			)



		.query(MODEL.loanFund()).which("in project").with_string("project id").pagination()
			.comments("查看项目的委贷资金")
			.do_it_as()
			.where(
					MODEL.loanFund().project().eq("${project id}")
			)
			.wants(
					MODEL.loanFund().project(),
					MODEL.loanFund().fundVendor()
			)

		.find(MODEL.loanApplication()).which("by id").with_string("id")
			.comments("按id查询贷款申请")
			.do_it_as()
			.where(MODEL.loanApplication().id().eq("${id}"))
			.wants(
					MODEL.loanApplication().applicant(),
					MODEL.loanApplication().status(),
					MODEL.loanApplication().loanProject(),
					MODEL.loanApplication().platform()
					)


		.find(MODEL.loanContract()).which("by id").with_string("id")
			.comments("按id查询贷款合同")
			.do_it_as()
				.where(
						MODEL.loanContract().id().eq("${id}")
				)
			.wants(
					MODEL.loanContract().status(),
					MODEL.loanContract().borrower(),
					MODEL.loanContract().lender(),
					MODEL.loanContract().loanApplication().loanProject()
			)


		.find(MODEL.loanContract()).which("by project").with_string("project id")
			.comments("统计项目下的贷款合同")
			.do_it_as().count()
			.where(MODEL.loanContract().project().eq("${project id}"))


		.find(MODEL.loanFund()).which("by project").with_string("project id")
			.comments("统计项目下的委贷资金")
			.do_it_as().count()
			.where(MODEL.loanFund().project().eq("${project id}"))

		.find(MODEL.loanApplication()).which("by project").with_string("project id")
				.comments("统计项目下的贷款申请")
				.do_it_as().count()
				.where(MODEL.loanApplication().loanProject().eq("${project id}"))

		;


		return script;
	}



}
