package cla.edg.project.yrzx.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;

/**
 * 劳务监督相关
 */
public class LaborQueryPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script
			.query(MODEL.laborWageManagementSheet()).list_of("project").with_string("project id")
				.do_it_as()
				.where(
						MODEL.laborWageManagementSheet().project().eq("${project id}")
				)
			.find(MODEL.laborWageManagementSheet()).which("id is").with_string("item id")
				.do_it_as()
				.where(
						MODEL.laborWageManagementSheet().id().eq("${item id}")
				)
				.wants(
						MODEL.laborWageManagementSheet().contract(),
						MODEL.laborWageManagementSheet().project(),
						MODEL.laborWageManagementSheet().bidPriceList(),
						MODEL.laborWageManagementSheet().contractPaymentManager(),
						MODEL.laborWageManagementSheet().dailyTaskType(),
						MODEL.laborWageManagementSheet().laborWage(),
						MODEL.laborWageManagementSheet().paymentManager(),
						MODEL.laborWageManagementSheet().platformLaborManager(),
						MODEL.laborWageManagementSheet().projectProgress()
				)

			.query(MODEL.laborDispute()).which("by project id").with_string("project id").pagination()
				.comments("查询项目中的劳务纠纷")
				.do_it_as()
				.where(MODEL.laborDispute().project().eq("${project id}"))
				.wants(
						MODEL.laborDispute().project(),
						MODEL.laborDispute().workPackage(),
						MODEL.laborDispute().type(),
						MODEL.laborDispute().status()
				)

			.query(MODEL.standardContract()).which("has workpackage by project").with_string("project id").pagination()
				.comments("查询项目下的分包合同")
				.do_it_as()
				.where(MODEL.standardContract().project().eq("${project id}"),
						MODEL.standardContract().workPackage().not_null()
						)
				.wants(
						MODEL.standardContract().workPackage(),
						MODEL.standardContract().partyB(),
						MODEL.standardContract().contractPayItemList()
				)


			.query(MODEL.projectNomination()).which("project by role").with_string("project id").with_string("role").pagination()
				.comments("按角色查询项目下的人")
				.do_it_as()
				.where(
						MODEL.projectNomination().project().eq("${project id}")
//						MODEL.projectNomination().projectRole().eq("${}")
				)

			.query(MODEL.laborRecord()).list_of("project nomination by type").with_string("project nomination id").with_string("type id").pagination()
				.comments("按类型查询某人在项目中的出勤记录")
		 		.do_it_as()
				.where(MODEL.laborRecord().projectNomination().eq("${project nomination id}"),
					MODEL.laborRecord().type().eq("${type id}")


				)
				.wants(MODEL.laborRecord().type())

		;

		return script;
	}



}
