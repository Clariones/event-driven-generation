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
						MODEL.materialType().category().eq("${category code}").optional()
				)

			.find(MODEL.materialRecord()).which("in project by material type").with_string("project id")
				.comments("按材料类别统计项目中的不同材料类型")
				.do_it_as().count_by(MODEL.materialRecord().type())
				.where(
						MODEL.materialRecord().project().eq("${project id}")
				)


			.query(MODEL.materialRecord()).which("in project by type").with_string("project id").with_string("type id").pagination()
				.comments("按类型查询项目中的材料管理台账")
				.do_it_as()
				.where(
						MODEL.materialRecord().project().eq("${project id}"),
						MODEL.materialRecord().type().eq("${type id}")
				)

			.find(MODEL.materialRecord()).which("by id").with_string("id")
				.comments("按ID查询材料台账")
				.do_it_as()
				.where(
						MODEL.materialRecord().id().eq("${id}")
				)
				.wants(
						MODEL.materialRecord().project(),
						MODEL.materialRecord().type(),
						MODEL.materialRecord().contract()
				)

			.query(MODEL.materialPreservedSample()).which("by project").with_string("project id").pagination()
				.comments("查询项目中的进场材料存样")
				.do_it_as()
				.where(
						MODEL.materialPreservedSample().project().eq("${project id}")
				)

			.find(MODEL.materialPreservedSample()).which("by id").with_string("item id")
					.comments("按id查询项目材料进场存样")
				.do_it_as()
				.where(
						MODEL.materialPreservedSample().id().eq("${item id}")
				)
				.wants(
						MODEL.materialPreservedSample().project(),
						MODEL.materialPreservedSample().contract(),
						MODEL.materialPreservedSample().materialCategory(),
						MODEL.materialPreservedSample().materialManager(),
						MODEL.materialPreservedSample().materialUnitOfMeasurement()
				)

				.query(MODEL.materialBidSample()).which("by project").with_string("project id").pagination()
					.comments("查询项目中的投标材料存样")
				.do_it_as()
				.where(
						MODEL.materialBidSample().project().eq("${project id}")
				)

				.find(MODEL.materialBidSample()).which("by id").with_string("item id")
				.comments("按id查询项目材料投标存样")
				.do_it_as()
				.where(
						MODEL.materialBidSample().id().eq("${item id}")
				)
				.wants(
						MODEL.materialBidSample().project(),
						MODEL.materialBidSample().contract(),
						MODEL.materialBidSample().materialCategory(),
						MODEL.materialBidSample().materialManager(),
						MODEL.materialBidSample().materialUnitOfMeasurement()
				)

				.query(MODEL.materialChange()).which("in project").with_string("project id").with_string("category id").pagination()
					.comments("按类型查询项目中的材料变更")
					.do_it_as()
					.where(MODEL.materialChange().project().eq("${project id}")
						,MODEL.materialChange().contractMaterialCategory().eq("${category id}")
					)
					.wants(MODEL.materialChange().contract().partyB())
;

		return script;
	}



}
