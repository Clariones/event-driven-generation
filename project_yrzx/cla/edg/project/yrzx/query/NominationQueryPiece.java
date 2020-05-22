package cla.edg.project.yrzx.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;

/**
 * Employee / project nomination
 */
public class NominationQueryPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script
		.find(MODEL.employeeNomination()).which("by id").with_string("employee nomination id")
				.comments("按ID查询员工")
				.do_it_as()
				.where(MODEL.employeeNomination().id().eq("${employee nomination id}"))
				.wants(
						MODEL.employeeNomination().employee()
				)
;

		return script;
	}



}
