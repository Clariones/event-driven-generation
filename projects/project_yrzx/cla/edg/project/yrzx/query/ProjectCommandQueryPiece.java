package cla.edg.project.yrzx.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;

/**
 * 项目指令相关
 */
public class ProjectCommandQueryPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script
			.query(MODEL.projectCommand()).pagination().list_of("project by type").with_string("project id").with_string("type id")
				.do_it_as()
				.where(
						MODEL.projectCommand().project().eq("${project id}"),
						MODEL.projectCommand().dailyTaskType().eq("${type id}")
				)
				.wants(
						MODEL.projectCommand().project(),
						MODEL.projectCommand().dailyTaskType(),
						MODEL.projectCommand().projectCommandAssignmentList().reciever(),
						MODEL.projectCommand().projectMaterial().projectMaterialReviewRecordList()
				)
			.find(MODEL.projectCommand()).which("in project by type").with_string("project id")
				.do_it_as().count_by(MODEL.projectCommand().dailyTaskType())
				.where(
						MODEL.projectCommand().project().eq("${project id}")
				)

			.query(MODEL.projectNomination()).list_of("project").with_string("project id")
				.do_it_as()
				.where(
						MODEL.projectNomination().project().eq("${project id}")
				)

			.find(MODEL.projectCommand()).which("by id").with_string("command id")
				.do_it_as()
				.where(
						MODEL.projectCommand().id().eq("${command id}")
				)
				.wants(
						MODEL.projectCommand().project(),
						MODEL.projectCommand().dailyTaskType(),
						MODEL.projectCommand().projectCommandAssignmentList().reciever().worker().employee()

				)
		;

		return script;
	}



}
