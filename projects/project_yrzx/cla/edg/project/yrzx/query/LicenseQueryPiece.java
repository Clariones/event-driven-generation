package cla.edg.project.yrzx.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;

/**
 * License
 */
public class LicenseQueryPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script

		.find(MODEL.license()).which("of merchant by type").with_string("merchant id").with_string("category id")
			.comments("查找某个merchant的某类型的单个证件")
			.do_it_as()
			.where(
				MODEL.license().owner().eq("${merchant id}"),
				MODEL.license().licenseCategory().eq("${category id}")
			)
			.wants(
					MODEL.license().validateStatus()
			)

		.find(MODEL.licenseCategory()).which("by code").with_string("code")
			.comments("按code查找证件类型")
			.do_it_as()
			.where(
					MODEL.licenseCategory().code().eq("${code}")
			)


;

		return script;
	}



}
