package cla.edg.project.yrzx.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;

/**
 * Merchant
 */
public class MerchantQueryPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script
		.find(MODEL.merchant()).which("by id").with_string("merchant id")
			.comments("按id查找mechant")
			.do_it_as()
			.where(
					MODEL.merchant().id().eq("${merchant id}")
			)
			.wants(
					MODEL.merchant().merchantDetail().engineeringType(),
					MODEL.merchant().merchantDetail().careerType(),
					MODEL.merchant().merchantDetail().industryType()
			)



;

		return script;
	}



}
