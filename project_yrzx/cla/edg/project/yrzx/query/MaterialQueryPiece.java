package cla.edg.project.yrzx.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;

/**
 *  材料管理
 */
public class MaterialQueryPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script

			.query(MODEL.materialType()).which("by material category").with_string("category code").pagination()
				.comments("按材料类别查询的不同材料类型")
				.do_it_as()
				.where(
						MODEL.materialType().category().code().eq("${category code}").optional()
				)

			.find(MODEL.materialRecord()).which("in project by material type").with_string("project id")
				.comments("按材料类别统计项目中的不同材料类型")
				.do_it_as().count_by(MODEL.materialRecord().type())
				.where(
						MODEL.materialRecord().project().eq("${project id}")
				)



;

		return script;
	}



}
