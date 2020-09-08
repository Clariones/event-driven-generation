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
		.query(MODEL.compensationApplication()).which("by project").with_string("project id").with_string("filter").pagination()
			.comments("按状态查询项目下的赔付申请")
			.do_it_as()
			.where(MODEL.compensationApplication().project().eq("${project id}"),MODEL.compensationApplication().status().eq("${filter}").optional())
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

			.query(MODEL.compensationResult()).which("by project").with_string("project id").with_string("filter").pagination()
				.comments("按状态查询项目下的赔付结果")
				.do_it_as()
				.where(MODEL.compensationResult().project().eq("${project id}"),MODEL.compensationResult().status().eq("${filter}").optional())
				.wants(
						MODEL.compensationResult().project(),
						MODEL.compensationResult().submitter(),
						MODEL.compensationResult().status(),
						MODEL.compensationResult().compensationInvestigation()
				)

			.find(MODEL.compensationApplication()).which("id is").with_string("application id")
				.comments("按ID 查询先行赔付申请")
				.do_it_as()
				.where(MODEL.compensationApplication().id().eq("${application id}"))
				.wants(

						MODEL.compensationApplication().status(),
						MODEL.compensationApplication().project(),
						MODEL.compensationApplication().submitter().employee()
				)

			.find(MODEL.compensationApplication()).which("by project").with_string("project id")
				.comments("统计项目下的赔付申请数量")
				.do_it_as().count()
				.where(MODEL.compensationApplication().project().eq("${project id}"))


			.find(MODEL.compensationInvestigation()).which("id is").with_string("investigation id")
				.comments("按ID 查询先行赔付调查")
				.do_it_as()
				.where(MODEL.compensationInvestigation().id().eq("${investigation id}"))
				.wants(
						MODEL.compensationInvestigation().submitter(),
						MODEL.compensationInvestigation().project(),
						MODEL.compensationInvestigation().compensationApplication().status()
				)


			.find(MODEL.compensationResult()).which("id is").with_string("result id")
				.comments("按ID 查询先行赔付结果")
				.do_it_as()
				.where(MODEL.compensationResult().id().eq("${result id}"))
				.wants(
						MODEL.compensationResult().submitter(),
						MODEL.compensationResult().project(),
						MODEL.compensationResult().compensationInvestigation()
				)

		;


		return script;
	}



}
