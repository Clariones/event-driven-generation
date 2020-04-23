package cla.edg.project.yrzx.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;

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
				.comments("按照项目资料类型统计资料数量")
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
			;
		return script;
	}

}
