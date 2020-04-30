package cla.edg.project.yrzx.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;


public class MiscQueryPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script
			.query(MODEL.employeeNomination()).list_of("company merchant").pagination().with_string("merchant id")
				.comments("查询一个公司的所有岗位")
				.do_it_as()
				.where(MODEL.employeeNomination().employer().eq("${merchant id}"))
				.wants(MODEL.employeeNomination().employee(), MODEL.employeeNomination().job(), MODEL.employeeNomination().role())

			.query(MODEL.employeeNomination()).list_of("current user").pagination().with_string("merchant id")
				.comments("查询当前用户的所有岗位")
				.do_it_as()
				.where(MODEL.employeeNomination().employee().eq("${merchant id}"))
				.wants(MODEL.employeeNomination().employer(), MODEL.employeeNomination().job(), MODEL.employeeNomination().role())

		// 查询employee nomination 是否被使用，
			.find(MODEL.projectNomination()).which("used employee").with_string("employee id")
				.comments("统计指定员工在项目中的任职数量")
				.do_it_as().count()
				.where(MODEL.projectNomination().worker().eq("${employee id}"))

		//
			.query(MODEL.projectNomination()).list_of("current employee").with_string("project id").with_string("employee id")
				.comments("查询当前emplyee在指定项目中的职务列表")
				.do_it_as()
				.where(MODEL.projectNomination().project().eq("${project id}"),
						MODEL.projectNomination().worker().eq("${employee id}")
				).wants(MODEL.projectNomination().worker().employee(),
						MODEL.projectNomination().projectRole()
				)
		//
			.query(MODEL.merchant()).list_of("has contract in project").with_string("project id")
				.comments("查询在一个项目中,有签订合同的所有商家")
				.do_it_as()
				.where_any(MODEL.merchant().standardContractListAsPartyB().project().eq("${project id}"),
						MODEL.merchant().standardContractListAsPartyA().project().eq("${project id}")
				)
			;

		return script;
	}

}
