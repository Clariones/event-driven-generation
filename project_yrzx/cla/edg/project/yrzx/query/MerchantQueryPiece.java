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
					MODEL.merchant().merchantDetailList().engineeringType(),
					MODEL.merchant().merchantDetailList().careerType(),
					MODEL.merchant().merchantDetailList().industryType(),
					MODEL.merchant().debitCardList(),
					MODEL.merchant().licenseList().licenseCategory()
			)


		.find(MODEL.merchant()).which("by project nomination id").with_string("project nomination id")
			.comments("根据项目职位查询merchant")
			.do_it_as()
			.where(MODEL.merchant().employeeNominationListAsEmployee().projectNominationList().id().eq("${project nomination id}"))


		.query(MODEL.merchant()).which("in project by project role").with_string("project id").with_string("role id")
			.comments("查询某项目中的某职位的人")
			.do_it_as()
			.where(
					MODEL.merchant().employeeNominationListAsEmployee().projectNominationList().projectRole().eq("${role id}"),
					MODEL.merchant().employeeNominationListAsEmployee().projectNominationList().project().eq("${project id}")
			)


		.query(MODEL.merchant()).list_of("company by role").with_string("merchant id").with_string("role id")
		.comments("查询公司中某职位的人")
			.do_it_as()
				.where(
						MODEL.merchant().employeeNominationListAsEmployer().employer().eq("${merchant id}"),
						MODEL.merchant().employeeNominationListAsEmployer().role().eq("${role id}")
				)
;

		return script;
	}



}
