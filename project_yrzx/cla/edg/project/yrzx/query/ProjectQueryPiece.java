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
			;
		return script;
	}

}
