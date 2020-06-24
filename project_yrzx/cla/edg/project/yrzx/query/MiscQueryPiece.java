package cla.edg.project.yrzx.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;
import cla.edg.project.yrzx.gen.graphquery.Role;


public class MiscQueryPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script
			.query(MODEL.employeeNomination()).list_of("company merchant except").pagination().with_string("merchant id").with_string("except id")
				.comments("查询一个公司除某个以外的所有岗位")
				.do_it_as()
				.where(MODEL.employeeNomination().employer().eq("${merchant id}"),
						MODEL.employeeNomination().employee().not("${except id}"))
				.wants(MODEL.employeeNomination().employee(), MODEL.employeeNomination().job(), MODEL.employeeNomination().role())

			.find(MODEL.employeeNomination()).which("is admin in company").with_string("merchant id")
				.comments("查询公司的管理员")
				.do_it_as()
				.where(MODEL.employeeNomination().employer().eq("${merchant id}"),MODEL.employeeNomination().role().eq(Role.ADMIN))
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
		//
			.query(MODEL.workPackage()).list_of("project").with_string("project id")
				.comments("查询项目下的工作包")
				.do_it_as()
				.where(MODEL.workPackage().project().eq("${project id}"))
				.wants(MODEL.workPackage().vendor())


			.query(MODEL.notification()).pagination().list_of("merchant").with_string("merchant id")
				.comments("查询发给当前merchant的消息")
				.do_it_as()
				.where(MODEL.notification().receiver().eq("${merchant id}"))
				.order_by(MODEL.notification().createTime()).desc()

			.query(MODEL.article()).list_of("category name").with_string("article category name").pagination()
				.comments("根据文章分类查询文章")
				.do_it_as()
				.where(MODEL.article().category().name().eq("${article category name}"))


		.query(MODEL.dailyTaskSecondType()).list_of("daily task type").with_string("type id")
			.do_it_as()
			.where(MODEL.dailyTaskSecondType().parent().code().eq("${type id }")).order_by(MODEL.dailyTaskSecondType().id()).asc()

		.query(MODEL.auditRecord()).list_of("item").with_string("item type").with_string("item id")
				.comments("根据审批的对象类型和ID 查询审批记录")
			.do_it_as()
			.where(MODEL.auditRecord().auditObjectId().eq("${item id}"),
					MODEL.auditRecord().auditObjectType().eq("${item type}"))
				.wants(MODEL.auditRecord().reviewer(),MODEL.auditRecord().status())


		.query(MODEL.ccRecord()).list_of("item").with_string("item type").with_string("item id")
				.comments("根据抄送的对象类型和ID 查询审批记录")
			.do_it_as()
			.where(MODEL.ccRecord().ccItemId().eq("${item id}"),
						MODEL.ccRecord().ccItemType().eq("${item type}"))

		.wants(MODEL.ccRecord().ccTo())


		.find(MODEL.auditRecord()).which("by reviewer").with_string("merchant id").with_string("review object type").with_string("status")
			.comments("查询某人review某对象的某种状态的记录")
			.do_it_as()
			.where(
					MODEL.auditRecord().reviewer().eq("${merchant id}"),
					MODEL.auditRecord().auditObjectType().eq("${review object type}"),
					MODEL.auditRecord().status().eq("${status}")
			)

		.query(MODEL.commentsRecord()).list_of("item").with_string("comment object type").with_string("item id")
				.comments("查询批注某对象的记录")
				.do_it_as()
				.where(
						MODEL.commentsRecord().commentObjectType().eq("${comment object type}"),
						MODEL.commentsRecord().commentObjectId().eq("${item id}")
				)
				.wants(MODEL.commentsRecord().submitter())

		.query(MODEL.projectNotification()).list_of("all").pagination()

				.query(MODEL.notification()).list_of("all").pagination()
		;

		return script;
	}

}
