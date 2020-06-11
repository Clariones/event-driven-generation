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

						MODEL.employeeNomination().employee().licenseList().licenseCategory(),
						MODEL.employeeNomination().employer(),
						MODEL.employeeNomination().employee().merchantDetailList().industryType(),
						MODEL.employeeNomination().employee().merchantDetailList().careerType(),
						MODEL.employeeNomination().employee().merchantDetailList().engineeringType(),
						MODEL.employeeNomination().employee().debitCardList()

				)

		.query(MODEL.projectNomination()).which("in project by merchant and type").with_string("project id").with_string("merchant id").with_string("type id")
			.do_it_as()
			.where(
					MODEL.projectNomination().project().eq("${project id}")
					,
					MODEL.projectNomination().worker().employer().eq("${merchant id}")
					,
					MODEL.projectNomination().type().eq("${type id}")
			)
			.wants(
					MODEL.projectNomination().project(),
					MODEL.projectNomination().type(),
					MODEL.projectNomination().worker().employee(),
					MODEL.projectNomination().worker().job()

			)

			.query(MODEL.employeeNomination()).list_of("company merchant").pagination().with_string("merchant id").with_string("item id")
				.comments("查询一个公司的所有岗位")
				.do_it_as()
				.where(MODEL.employeeNomination().employer().eq("${merchant id}"))
				.wants(MODEL.employeeNomination().employee(), MODEL.employeeNomination().job(), MODEL.employeeNomination().role())



		;

		return script;
	}



}
