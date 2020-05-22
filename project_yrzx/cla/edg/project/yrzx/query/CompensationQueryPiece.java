package cla.edg.project.yrzx.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;

/**
 * 先行赔付相关
 */
public class CompensationQueryPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script
		.query(MODEL.compensationApplication()).which("by project").with_string("project id").pagination()
			.comments("查询项目下的赔付申请")
			.do_it_as()
			.where(MODEL.compensationApplication().project().eq("${project id}"))
			.wants(
					MODEL.compensationApplication().status(),
					MODEL.compensationApplication().project(),
					MODEL.compensationApplication().submitter()
			)

			.query(MODEL.compensationInvestigation()).which("by project").with_string("project id").pagination()
				.comments("查询项目下的赔付调查")
				.do_it_as()
				.where(MODEL.compensationInvestigation().project().eq("${project id}"))
				.wants(
						MODEL.compensationInvestigation().project(),
						MODEL.compensationInvestigation().submitter(),
						MODEL.compensationInvestigation().compensationApplication()
				)

			.query(MODEL.compensationResult()).which("by project").with_string("project id").pagination()
				.comments("查询项目下的赔付结果")
				.do_it_as()
				.where(MODEL.compensationResult().project().eq("${project id}"))
				.wants(
						MODEL.compensationResult().project(),
						MODEL.compensationResult().submitter(),
						MODEL.compensationResult().compensationInvestigation()
				)

		;


		return script;
	}



}
