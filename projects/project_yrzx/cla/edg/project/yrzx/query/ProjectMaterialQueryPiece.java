package cla.edg.project.yrzx.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;

/**
 * 项目资料
 */
public class ProjectMaterialQueryPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script
			.find(MODEL.projectMaterialType()).which("by parent type").with_string("project id")
				.comments("按父类型统计项目资料分类数量")
				.do_it_as().count_by(MODEL.projectMaterialType().parent())
				.where(MODEL.projectMaterialType().projectMaterialList().project().eq("${project id}"))

			.find(MODEL.projectMaterial()).which("by parent type").with_string("project id")
				.comments("按父类型统计项目资料分类数量")
				.do_it_as().count_by(MODEL.projectMaterial().projectMaterialType().parent())
				.where(MODEL.projectMaterial().project().eq("${project id}"))

;

		return script;
	}



}
