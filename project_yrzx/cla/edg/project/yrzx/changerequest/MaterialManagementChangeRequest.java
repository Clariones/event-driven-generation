package cla.edg.project.yrzx.changerequest;


import cla.edg.project.yrzx.gen.graphquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;


/**
 * 材料管理
 * 
 * 
 * @author Jarry Zhou
 *
 */
public class MaterialManagementChangeRequest implements ChangeRequestSpecFactory {

	@Override
	public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
		return builder
			.change_request("create material preserved sample").zh_CN("进场主材料存样")
				.icon("form")
				.step("material preserved basic info").zh_CN("存样主材料基础信息")
					.contains_event("material preserved basic info").zh_CN("存样主材料基础信息")
						.has_field("title").zh_CN("验收单名称")
						.has_field("num").zh_CN("验收单编号").value("系统自动生成").display()
						.has_field("project id").hidden()
						.has_field("project name").zh_CN("项目名称")
						.has_field("contract").zh_CN("分包合同").which_model_of(MODEL.standardContract()).values_can_select_from_query_by("project id")
						.has_field("material name").zh_CN("材料名称")
						.has_field("material category").zh_CN("材料类型").which_model_of(MODEL.materialCategory()).values_can_select_from_query_by("project id")
						.has_field("user part").zh_CN("使用部位")
						.has_field("model").zh_CN("型号规格")
						.has_field("uom").zh_CN("材料单位").which_model_of(MODEL.materialUnitOfMeasurement()).values_can_select_from_query_by("project id")
						.has_field("brand").zh_CN("材料品牌")
						.has_field("supplier").zh_CN("供货单位")
				.step("material preserved info").zh_CN("存样信息资料")
					.contains_event("material preserved info").zh_CN("存样信息资料")
						.has_field("seal up material name").zh_CN("存样材料名称")
						.has_field("seal up material num").zh_CN("存样材料编号").value("系统自动生成").display()
						.has_field("seal up").zh_CN("存样材料密封").value("密封").display()
						.has_field("material manager").zh_CN("材料管理员").which_model_of(MODEL.projectNomination()).values_can_select_from_query_by("project id")
						.has_field("images").zh_CN("旁站、巡视、见证资料").range(0,9)
						.has_field("comments").zh_CN("备注").which_type_of(FieldType.MULTI_TEXT)
						.has_field("create time").zh_CN("日期").disabled()

			.change_request("create material bid sample").zh_CN("投标主材料存样")
					.icon("form")
					.step("material bid sample basic info").zh_CN("投标主材料基础信息")
					.contains_event("material preserved basic info").zh_CN("投标主材料基础信息")
						.has_field("title").zh_CN("验收单名称")
						.has_field("num").zh_CN("验收单编号").value("系统自动生成").display()
						.has_field("project id").hidden()
						.has_field("project name").zh_CN("项目名称")
						.has_field("contract").zh_CN("分包合同").which_model_of(MODEL.standardContract()).values_can_select_from_query_by("project id")
						.has_field("material name").zh_CN("材料名称")
						.has_field("material category").zh_CN("材料类型").which_model_of(MODEL.materialCategory()).values_can_select_from_query_by("project id")
						.has_field("user part").zh_CN("使用部位")
						.has_field("model").zh_CN("型号规格")
						.has_field("uom").zh_CN("材料单位").which_model_of(MODEL.materialUnitOfMeasurement()).values_can_select_from_query_by("project id")
						.has_field("brand").zh_CN("材料品牌")
						.has_field("supplier").zh_CN("供货单位")
					.step("material bid sample info").zh_CN("投标存样信息资料")
					.contains_event("material preserved info").zh_CN("投标存样信息资料")
						.has_field("seal up material name").zh_CN("存样材料名称")
						.has_field("seal up material num").zh_CN("存样材料编号").value("系统自动生成").display()
						.has_field("seal up").zh_CN("存样材料密封").value("密封").display()
						.has_field("material manager").zh_CN("材料管理员").which_model_of(MODEL.projectNomination()).values_can_select_from_query_by("project id")
						.has_field("images").zh_CN("旁站、巡视、见证资料").range(0,9)
						.has_field("comments").zh_CN("备注").which_type_of(FieldType.MULTI_TEXT)
						.has_field("create time").zh_CN("日期").disabled()

			.change_request("apply for material change").zh_CN("材料变更申请")
				.icon("form")
				.step("material change contract info").zh_CN("合同材料信息")
					.contains_event("material change contract info")
					.has_field("contract").zh_CN("分包合同").which_model_of(MODEL.standardContract()).values_can_select_from_query_by("project id")
					.has_field("material category id").zh_CN("材料分类").hidden()
					.has_field("material name").zh_CN("材料名称")
					.has_field("model").zh_CN("型号规格")
					.has_field("uom").zh_CN("材料单位").which_model_of(MODEL.materialUnitOfMeasurement()).values_can_select_from_query_by("project id")
					.has_field("brand").zh_CN("材料品牌")
				.step("material change info").zh_CN("变更材料信息")
					.contains_event("material change info")
					.has_field("comments").zh_CN("变更说明").which_type_of(FieldType.MULTI_TEXT)
					.has_field("material name").zh_CN("材料名称")
					.has_field("model").zh_CN("型号规格")
					.has_field("uom").zh_CN("材料单位").which_model_of(MODEL.materialUnitOfMeasurement()).values_can_select_from_query_by("project id")
					.has_field("brand").zh_CN("材料品牌")
					.has_field("change account").zh_CN("变更数量").which_type_of(FieldType.DECIMAL)
					.has_field("price adjustment").zh_CN("价格调整")
					.has_field("application time").zh_CN("申请时间").which_type_of(FieldType.DATE).disabled()
					.has_field("applicant unit")	.zh_CN("变更申请单位").disabled()
					.has_field("applicant").zh_CN("变更申请人").which_model_of(MODEL.projectNomination()).disabled()

				.step("material change data upload").zh_CN("变更资料上传")
					.contains_event("material change data upload").zh_CN("变更资料上传")
					.has_field("images").which_type_of(FieldType.IMAGES).range(0,9)

				.step("material change audit").zh_CN("审核单位")
					.contains_event("material change audit").zh_CN("审核单位")
					.has_field("project constructor").zh_CN("项目建设方").disabled()
					.has_field("project supervision").zh_CN("项目监理").disabled()
					.has_field("project manager").zh_CN("项目经理").disabled()




			.change_request("apply for material acceptance").zh_CN("材料验收申请")
				.step("material acceptance basic info").zh_CN("材料基础信息")
					.contains_event("material acceptance basic info").zh_CN("材料基础信息")
					.has_field("title").zh_CN("验收单名称")
					.has_field("num").zh_CN("验收单编号").value("系统自动生成").display()
					.has_field("contract").zh_CN("分包合同").which_model_of(MODEL.standardContract()).values_can_select_from_query_by("project id")
					.has_field("material name").zh_CN("材料名称")
					.has_field("material type").zh_CN("材料类型")
					.has_field("user part").zh_CN("使用部位")
					.has_field("model").zh_CN("型号规格")
					.has_field("uom").zh_CN("材料单位").which_model_of(MODEL.materialUnitOfMeasurement()).values_can_select_from_query_by("project id")
					.has_field("brand").zh_CN("材料品牌")
					.has_field("supplier").zh_CN("供货单位")
					.has_field("auditor").zh_CN("验收负责人").which_model_of(MODEL.projectNomination()).values_can_select_from_query_by("project id")
				.step("material check").zh_CN("材料检查")
					.contains_event("material check").zh_CN("材料检查")
					.has_field("planned material count").zh_CN("计划材料数量")
					.has_field("actual material count").zh_CN("实际验收数量")
					.has_field("actual arrived count").zh_CN("实际到场数量")
					.has_field("is broken").zh_CN("材料包装、外观有无破损").values_canbe("正常破损","正常破损")
					.has_field("material matches").zh_CN("材料与样板相符").values_canbe(true,"是").or(false,"否")
					.has_field("meet quanlity standard").zh_CN("材料是否复合质量标准").values_canbe(true,"是").or(false,"否")
					.has_field("has certificates").zh_CN("材料资料及合格证是否齐全").values_canbe(true,"是").or(false,"否")
				.step("material acceptance images").zh_CN("旁站、巡视、见证资料")
					.contains_event("material acceptance image").zh_CN("旁站、巡视、见证资料")
					.has_field("images").which_type_of(FieldType.IMAGES).range(0,9)
					.has_field("comments").which_type_of(FieldType.MULTI_TEXT)

				;

	}
}
