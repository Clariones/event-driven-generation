package cla.edg.project.yrzx.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;

public class ProjectQueryPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script
			.find(MODEL.project()).which("related to user").pagination().with_string("employee")
				.comments("统计有多少个项目，在我当前的 岗位 是有可能需要查看的")
				.do_it_as().count_by(MODEL.project().projectPhase())
				.where(MODEL.project().projectOrganizationList().worker().employee().eq("${employee}"))

				// .wants(MODEL.project().projectPhase(), MODEL.project().designStatus(), MODEL.project().standardContractList(), MODEL.project().projectOwner())
			.query(MODEL.project()).which("by user and phase").pagination().with_string("phase code").with_string("employee")
				.comments("查询指定项目阶段的，在我当前的岗位，需要查看的项目")
				.do_it_as()
				.where(MODEL.project().projectOrganizationList().worker().employee().eq("${employee}"),
						MODEL.project().projectPhase().eq("${phase code}"))
				.wants(MODEL.project().projectPhase(), MODEL.project().projectOwner(), MODEL.project().projectImageList(), MODEL.project().projectServiceType(), MODEL.project().constructionStatus())
				.order_by(MODEL.project().createTime()).desc()

			.find(MODEL.projectMaterial()).which("by daily task type").with_string("project id").with_string("type id")
				.comments("统计项目下的，某个daily task type 的文档")
				.do_it_as().count()
				.where(MODEL.projectMaterial().project().eq("${project id}"),
						MODEL.projectMaterial().dailyTaskType().eq("${type id}"))

			.query(MODEL.projectMaterial()).which("by daily task type").pagination().with_string("project id").with_string("type id")
				.comments("查找项目下的，某个daily task type 的文档")
				.do_it_as()
				.where(MODEL.projectMaterial().project().eq("${project id}"),
						MODEL.projectMaterial().dailyTaskType().eq("${type id}"))
				.wants(MODEL.projectMaterial().dailyTaskType(),
						MODEL.projectMaterial().materialReviewResult(),
						MODEL.projectMaterial().materialSubmitter().employee())
				.order_by(MODEL.projectMaterial().createTime()).desc()
			;
		return script;
	}

}
