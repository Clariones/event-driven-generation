package cla.edg.project.yrzx.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;
import cla.edg.project.yrzx.gen.graphquery.PayItemStatus;

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






			.query(MODEL.projectNomination()).which("project by role").with_string("project id").with_string("role").pagination()
				.comments("按角色查询项目下的人")
				.do_it_as()
				.where(
						MODEL.projectNomination().project().eq("${project id}"),
						MODEL.projectNomination().projectRole().eq("${role}").optional()
				)
				.wants(MODEL.projectNomination().worker().employee())

			.query(MODEL.laborRecord()).list_of("merchant by type").with_string("merchant id").with_string("type id").pagination()
				.comments("按类型查询某人在项目中的出勤记录")
		 		.do_it_as()
				.where(MODEL.laborRecord().owner().eq("${merchant id}"),
					MODEL.laborRecord().type().eq("${type id}").optional()


				)
				.wants(MODEL.laborRecord().type())


			.find(MODEL.standardContract()).list_of("project by type").with_string("project id").with_string("type")
				.comments("统计项目下某类型合同数量")
				.do_it_as().count()
				.where(MODEL.standardContract().contractType().eq("${type}"),
						MODEL.standardContract().project().eq("${project id}")
						)

//			.find(MODEL.contractPayItem()).which("in project by type").with_string("project id").with_string("type")
//				.comments("统计项目下某类型的合同支付项目金额总和")
//				.do_it_as().sum(MODEL.contractPayItem().payAmount())
//				.where(MODEL.contractPayItem().contract().project().eq("${project id}"),
//					MODEL.contractPayItem().payItemType().code().eq("${type}")
//				)



			.find(MODEL.laborRecord()).list_of("user by date").with_string("project id").with_string("merchant id").with_date("start date").with_date("end date")
				.comments("查询某人某天的劳务记录")
				.do_it_as()
				.where(
						MODEL.laborRecord().project().eq("${project id}"),
						MODEL.laborRecord().owner().eq("${merchant id}"),
						MODEL.laborRecord().attendanceDate().bigger_or_eq("${start date}"),
						MODEL.laborRecord().attendanceDate().less_or_eq("${end date}")
				)
			.find(MODEL.laborRecord()).list_of("employee in project").with_string("merchant id").with_string("project id")
				.comments("统计某人在某项目中打了多少天卡")
				.do_it_as().count()
				.where(MODEL.laborRecord().project().eq("${project id}")
					,
						MODEL.laborRecord().owner().eq("${merchant id}")
				)


		;

		return script;
	}



}
