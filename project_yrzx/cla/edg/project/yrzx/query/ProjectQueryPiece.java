package cla.edg.project.yrzx.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;

import java.util.stream.Stream;


public class ProjectQueryPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script
			.find(MODEL.project()).which("related to user").pagination().with_string("employee")
				.comments("统计有多少个项目，在我当前的 岗位 是有可能需要查看的")
				.do_it_as().count_by(MODEL.project().projectPhase())
				.where(MODEL.project().projectNominationList().worker().employee().eq("${employee}"))

				// .wants(MODEL.project().projectPhase(), MODEL.project().designStatus(), MODEL.project().standardContractList(), MODEL.project().projectOwner())
			.query(MODEL.project()).which("by user and phase").pagination().with_string("phase code").with_string("employee")
				.comments("查询指定项目阶段的，在我当前的岗位，需要查看的项目")
				.do_it_as()
				.where(MODEL.project().projectNominationList().worker().employee().eq("${employee}"),
						MODEL.project().projectPhase().eq("${phase code}"))
				.wants(MODEL.project().projectPhase(), MODEL.project().projectOwner(), MODEL.project().projectImageList(), MODEL.project().projectServiceType(), MODEL.project().constructionStatus())
				.order_by(MODEL.project().createTime()).desc()

			.find(MODEL.project()).which("for info page by id").with_string("project id")
				.comments("按照ID加载项目基本信息")
				.do_it_as()
				.where(MODEL.project().id().eq("${project id}"))
				.wants(MODEL.project().projectType(), MODEL.project().projectOwner(), MODEL.project().constructionStatus(), MODEL.project().projectServiceType())

		// 项目文档资料相关的查询
			.find(MODEL.projectMaterial()).which("by daily task type").with_string("project id").with_string("type id")
				.comments("统计项目下的，某个daily task type 的文档")
				.do_it_as().count()
				.where(MODEL.projectMaterial().project().eq("${project id}"),
						MODEL.projectMaterial().dailyTaskType().eq("${type id}"))

			.query(MODEL.projectMaterial()).which("by result with daily task type").pagination().with_string("project id").with_string("type id").with_string("result")
				.comments("查找项目下的，某个daily task type 内的，review result为指定状态的文档")
				.do_it_as()
				.where(MODEL.projectMaterial().project().eq("${project id}"),
						MODEL.projectMaterial().dailyTaskType().eq("${type id}"),
						MODEL.projectMaterial().materialReviewResult().eq("${result}"))
				.wants(MODEL.projectMaterial().dailyTaskType(),
						MODEL.projectMaterial().materialReviewResult(),
						MODEL.projectMaterial().materialSubmitter().employee())
				.order_by(MODEL.projectMaterial().createTime()).desc()

			.find(MODEL.projectMaterial()).which("by status in daily task of project").with_string("project id").with_string("task type")
				.comments("按照review结果的状态，统计某个项目中某类日常工作的相关资料的数量")
				.do_it_as().count_by(MODEL.projectMaterial().projectMaterialType())
				.where(MODEL.projectMaterial().project().eq("${project id}"),
						MODEL.projectMaterial().dailyTaskType().eq("${task type}"))

			.query(MODEL.projectMaterialReviewRecord()).which("by project material").pagination().with_string("material id").with_integer("number")
				.comments("查找某个项目资料所相关联的review记录列表")
				.do_it_as()
				.where(MODEL.projectMaterialReviewRecord().projectMaterial().eq("${material id}"))
				.top("${number}")
				.wants(MODEL.projectMaterialReviewRecord().reviewer().worker().employee(),
						MODEL.projectMaterialReviewRecord().reviewer().worker().job(),
						MODEL.projectMaterialReviewRecord().reviewer().type())
			.query(MODEL.projectMaterialCommentsRecord()).which("by project material").pagination().with_string("material id").with_integer("number")
				.comments("查找某个项目资料所相关联的批注记录列表")
				.do_it_as()
				.where(MODEL.projectMaterialCommentsRecord().projectMaterial().eq("${material id}"))
				.top("${number}")
				.wants(MODEL.projectMaterialCommentsRecord().submitter().worker().employee(),
						MODEL.projectMaterialCommentsRecord().submitter().worker().job(),
						MODEL.projectMaterialCommentsRecord().submitter().type())


		/// 查询 项目资料 | 资料档案 相关的数据
			.find(MODEL.projectMaterial()).which("by material type").with_string("project id")
				.comments("按照项目资料类型统计资料数量")
				.do_it_as().count_by(MODEL.projectMaterial().projectMaterialType())
				.where(MODEL.projectMaterial().project().eq("${project id}"))
			.find(MODEL.projectMaterial()).which("by material type and status").with_string("project id").with_string("type")
				.comments("按照状态统计某个项目资料类型下的资料数量")
				.do_it_as().count_by(MODEL.projectMaterial().materialReviewResult())
				.where(MODEL.projectMaterial().project().eq("${project id}"), MODEL.projectMaterial().projectMaterialType().eq("${type}"))
			.query(MODEL.projectMaterial()).which("by status and type").pagination().with_string("project id").with_string("type").with_string("filter")
				.comments("查询指定项目中某个类型的资料档案")
				.do_it_as()
				.where(MODEL.projectMaterial().project().eq("${project id}"),
						MODEL.projectMaterial().projectMaterialType().eq("${type}"),
						MODEL.projectMaterial().materialReviewResult().eq("${filter}"))
				.order_by(MODEL.projectMaterial().createTime()).desc()
				.wants(MODEL.projectMaterial().projectMaterialType(),
						MODEL.projectMaterial().materialSubmitter().employee())

		// 五书
			.query(MODEL.yourongProjectBook()).list_of("project").with_string("project id")
				.comments("查询项目的五书")
				.do_it_as()
				.where(MODEL.yourongProjectBook().project().eq("${project id}"))
				.wants(MODEL.yourongProjectBook().status(), MODEL.yourongProjectBook().type())
		// 项目组织
			.query(MODEL.projectNomination()).which("project level").with_string("project id")
				.comments("查询项目的所有 项目岗位, 不包括 分包商 级别")
				.do_it_as()
				.where(MODEL.projectNomination().project().eq("${project id}"),
						MODEL.projectNomination().workPackage().is_null())
				.wants(MODEL.projectNomination().worker().employee(), MODEL.projectNomination().projectRole(), MODEL.projectNomination().type())
			.query(MODEL.projectNomination()).which("work package level").pagination().with_string("project id").with_string("work package id")
				.comments("查询项目的所有 项目岗位, 不包括 分包商 级别")
				.do_it_as()
				.where(MODEL.projectNomination().project().eq("${project id}"),
						MODEL.projectNomination().workPackage().eq("${work package id}"))
				.wants(MODEL.projectNomination().worker().employee(),MODEL.projectNomination().worker().job(),
						MODEL.projectNomination().projectRole(), MODEL.projectNomination().type())
			.query(MODEL.workPackage()).which("assigned in project organization").with_string("project id")
				.comments("查询在项目组织中指定的，某个项目下的所有工作包")
				.do_it_as()
				.where(MODEL.workPackage().projectNominationList().project().eq("${project id}"))
				.order_by(MODEL.workPackage().name()).asc()
				.wants(MODEL.workPackage().vendor())
			.query(MODEL.projectNomination()).which("in project by merchant").with_string("project id").with_string("merchant id")
				.comments("查找某个merchant 在某个项目中所有岗位信息")
				.do_it_as()
				.where(MODEL.projectNomination().project().eq("${project id}"),
						MODEL.projectNomination().worker().employee().eq("${merchant id}"))
				.wants(MODEL.projectNomination().worker().employee(), MODEL.projectNomination().worker().job(),
						MODEL.projectNomination().projectRole(), MODEL.projectNomination().type())
			/// 项目验收相关查询
			.query(MODEL.projectAcceptance().getModelTypeName()).list_of("project by status and type").with_string("project id").with_string("filter").with_string("daily task type id").pagination()
				.do_it_as()
				.where(
						MODEL.projectAcceptance().project().eq("${project id}"),
						MODEL.projectAcceptance().status().eq("${filter}"),
						MODEL.projectAcceptance().dailyTaskType().eq("${daily task type id}")
				)
				.wants(
						MODEL.projectAcceptance().acceptanceApplication().projectMaterialReviewRecordList().status(),
						MODEL.projectAcceptance().acceptanceApplication().projectMaterialReviewRecordList().reviewer().type(),
						MODEL.projectNomination().worker().employee(),
						MODEL.projectAcceptance().dailyTaskType(),
						MODEL.projectAcceptance().applicationUnit(),
						MODEL.projectAcceptance().project(),
						MODEL.projectAcceptance().propertyOwner(),
						MODEL.projectAcceptance().status()
				)

			.find(MODEL.projectAcceptance().getModelTypeName()).which("by id").with_string("project acceptance id")
				.do_it_as()
				.where(MODEL.projectAcceptance().id().eq("${project acceptance id}"))
				.wants(
						MODEL.projectAcceptance().acceptanceApplication().projectMaterialReviewRecordList().status(),
						MODEL.projectAcceptance().acceptanceApplication().projectMaterialReviewRecordList().reviewer().type(),
						MODEL.projectNomination().worker().employee(),
						MODEL.projectAcceptance().dailyTaskType(),
						MODEL.projectAcceptance().applicationUnit(),
						MODEL.projectAcceptance().project(),
						MODEL.projectAcceptance().propertyOwner(),
						MODEL.projectAcceptance().status()
				)


				// 售后服务
			.query(MODEL.afterSales().getModelTypeName()).list_of("project by status and type").with_string("project id").with_string("filter").with_string("daily task type id").pagination()
				.do_it_as()
				.where(
						MODEL.afterSales().project().eq("${project id}"),
						MODEL.afterSales().status().eq("${filter}"),
						MODEL.afterSales().dailyTaskType().eq("${daily task type id}")
				)
				.wants(
						MODEL.afterSales().status(),
						MODEL.afterSales().project(),
						MODEL.afterSales().creator()
				)

			.find(MODEL.afterSales().getModelTypeName()).which("id is").with_string("id")
				.do_it_as()
				.where(
						MODEL.afterSales().id().eq("${id}")
				)
				.wants(
						MODEL.afterSales().status(),
						MODEL.afterSales().project(),
						MODEL.afterSales().creator().employee()
				)

				// 违约处罚
			.query(MODEL.projectPenalties().getModelTypeName()).list_of("project by status and type").with_string("project id").with_string("filter").with_string("daily task type id").pagination()
				.do_it_as()
				.where(
						MODEL.projectPenalties().project().eq("${project id}"),
						MODEL.projectPenalties().dailyTaskType().eq("${daily task type id}"),
						MODEL.projectPenalties().status().eq("${filter}")
				)
				.wants(
						MODEL.projectPenalties().status(),
						MODEL.projectPenalties().contract(),
						MODEL.projectPenalties().punishmentMaterial().dailyTaskType()
				)
			.find(MODEL.projectPenalties().getModelTypeName()).which("id is").with_string("id")
				.do_it_as()
				.where(
						MODEL.projectPenalties().id().eq("${id}")
				)
				.wants(
						MODEL.projectPenalties().status(),
						MODEL.projectPenalties().contract(),
						MODEL.projectPenalties().punishmentMaterial().project(),
						MODEL.projectPenalties().punishmentMaterial().dailyTaskType(),
						MODEL.projectPenalties().punishmentMaterial().projectMaterialReviewRecordList().status(),
						MODEL.projectPenalties().punishmentMaterial().projectMaterialReviewRecordList().reviewer().type(),
						MODEL.projectNomination().worker().employee()
				)
				// 项目进度

			.query(MODEL.projectProgress().getModelTypeName()).list_of("project by status and phase").with_string("project id").with_string("phase id").with_string("filter")
				.do_it_as()
				.where(
						MODEL.projectProgress().project().eq("${project id}"),
						MODEL.projectProgress().projectPhase().eq("${phase id}"),
						MODEL.projectProgress().status().eq("${filter}")
				)
				.wants(
						MODEL.projectProgress().status()
				)

				//项目报告
			.query(MODEL.projectReport().getModelTypeName()).list_of("project by type").with_string("project id").with_string("filter")
				.do_it_as()
				.where(
						MODEL.projectReport().project().eq("${project id}"),
						MODEL.projectReport().dailyTaskType().eq("${filter}")
				)
				.wants(
						MODEL.projectReport().dailyTaskType(),
						MODEL.projectReport().project()
				)
			.find(MODEL.projectReport().getModelTypeName()).which("id is").with_string("item id")
				.do_it_as()
				.where(
						MODEL.projectReport().id().eq("${item id}")
				)
				.wants(
						MODEL.projectReport().project(),
						MODEL.projectReport().dailyTaskType(),
						MODEL.projectReport().projectReportCheckItemList()
				)

			.query(MODEL.merchant().getModelTypeName()).list_of("project by role").with_string("project id").with_string("role")
				.do_it_as()
				.where(
						MODEL.merchant().employeeNominationListAsEmployee().projectNominationList().projectRole().eq("${role}"),
						MODEL.merchant().employeeNominationListAsEmployee().projectNominationList().project().eq("${project id}")
				)

			.query(MODEL.merchant().getModelTypeName()).list_of("partyB in project").with_string("project id")
				.comments("查询项目中的乙方")
				.do_it_as()
				.where(
						MODEL.merchant().standardContractListAsPartyB().project().eq("${project id}")
				)

				//劳务监督



				//按二级页面分类 统计 项目下该分类下条目数量

			.find(MODEL.afterSales()).which("in project by daily task type").with_string("project id")
				.do_it_as().count_by(MODEL.afterSales().dailyTaskType())
				.where(MODEL.afterSales().project().eq("${project id}"))

			.find(MODEL.projectPenalties()).which("in project by daily task type").with_string("project id")
				.do_it_as().count_by(MODEL.projectPenalties().dailyTaskType())
				.where(MODEL.projectPenalties().project().eq("${project id}"))

			.find(MODEL.projectAcceptance()).which("in project by daily task type").with_string("project id")
				.do_it_as().count_by(MODEL.projectAcceptance().dailyTaskType())
				.where(MODEL.projectAcceptance().project().eq("${project id}"))

			.find(MODEL.projectProgress()).which("in project by project phase").with_string("project id")
				.do_it_as().count_by(MODEL.projectProgress().projectPhase())
				.where(MODEL.projectProgress().project().eq("${project id}"))


		;

		return script;
	}



}
