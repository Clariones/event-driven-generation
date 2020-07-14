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
			.query(MODEL.helpApplication()).list_of("in project by status").with_string("project id").with_string("filter").pagination()
		.comments("按状态查询项目中的贷款申请")
			.do_it_as()
		.where(MODEL.helpApplication().helpProject().eq("${project id}"),
		MODEL.helpApplication().status().eq("${filter}").optional()
		)
		.wants(
				MODEL.helpApplication().status(),
				MODEL.helpApplication().submitter(),
				MODEL.helpApplication().helpContractList()
		)




		.query(MODEL.helpContract()).which("in project by status").with_string("project id").with_string("filter").pagination()
			.comments("按状态查看项目中的贷款合同")
			.do_it_as()
			.where(
					MODEL.helpContract().status().eq("${filter}").optional(),
					MODEL.helpContract().project().eq("${project id}")
			)
			.wants(
					MODEL.helpContract().status()
			)





		.find(MODEL.helpApplication()).which("by id").with_string("id")
			.comments("按id查询贷款申请")
			.do_it_as()
			.where(MODEL.helpApplication().id().eq("${id}"))
			.wants(
					MODEL.helpApplication().status(),
					MODEL.helpApplication().helpProject(),
					MODEL.helpApplication().platform(),
					MODEL.helpApplication().pledgedContract().contractPayItemList(),
					MODEL.helpApplication().pledgedContract().partyA(),
					MODEL.helpApplication().submitter().worker().employer()
					)


		.find(MODEL.helpContract()).which("by id").with_string("id")
			.comments("按id查询贷款合同")
			.do_it_as()
				.where(
						MODEL.helpContract().id().eq("${id}")
				)
			.wants(
					MODEL.helpContract().status(),
					MODEL.helpContract().project(),
					MODEL.helpContract().borrowerUnit(),
					MODEL.helpContract().helpApplication().helpProject(),
					MODEL.helpContract().pledgedContract().partyA(),
					MODEL.helpContract().projectProgress()

			)


		.find(MODEL.helpContract()).which("by project").with_string("project id")
			.comments("统计项目下的贷款合同")
			.do_it_as().count()
			.where(MODEL.helpContract().project().eq("${project id}"))




		.find(MODEL.helpApplication()).which("by project").with_string("project id")
				.comments("统计项目下的贷款申请")
				.do_it_as().count()
				.where(MODEL.helpApplication().helpProject().eq("${project id}"))

		;


		return script;
	}



}
