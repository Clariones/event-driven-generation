package cla.edg.project.yrzx.changerequest;


import cla.edg.project.yrzx.gen.graphquery.ChangeRequest;
import cla.edg.project.yrzx.gen.graphquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;


/**
*
 */
public class ProjectChangeRequest implements ChangeRequestSpecFactory {


	@Override
	public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
		return builder 
				
			// ✅✅✅ 施工日志
				.change_request("create project").zh_CN("新建项目")
				.icon("form")
				.has_field("description").zh_CN("项目描述").which_type_of(FieldType.MULTI_TEXT)
				.has_field("location").zh_CN("项目位置").which_type_of(FieldType.MULTI_TEXT)
				.has_field("area").zh_CN("项目面积").which_type_of(FieldType.DECIMAL)
				.has_field("budget").zh_CN("项目预算").which_type_of(FieldType.MONEY)
				.has_field("owner").zh_CN("项目业主").which_model_of(MODEL.merchant()).values_can_select_from_query_by(null)
				.has_field("store").zh_CN("门店").which_model_of(MODEL.merchant()).values_can_select_from_query_by(null)
				.has_field("type").zh_CN("项目类型").which_model_of(MODEL.projectType()).values_can_select_from_query_by(null)
				.has_field("phase").zh_CN("项目阶段").which_model_of(MODEL.projectPhase()).values_can_select_from_query_by(null)

//		title="大邑雅丽泰办公大楼装修工程|[1,50]"
//		description="项目施工描述信息|[1,200]"
//		location="成都市大邑县兴城大道（工业园区）|[1,150]"
//		project_area="28800080.00"
//		project_rough_budget="$100000000.00|[0.00,100000000]"
//
//		project_owner="$(merchant)"
//		store="$(merchant)"
//		partner="$(merchant?)"
//
//		project_type="$(project_type?)"
//		project_service_type="$(project_service_type)"
//		project_phase="$(project_phase)"
//		design_status="$(working_status?)"
//		construction_status="$(working_status?)"

			.change_request("create project").zh_CN("创建项目")
					.icon("form").
				has_field("title").zh_CN("项目名称").range(1,50).
				has_field("description").zh_CN("项目描述").range(1,200).
				has_field("location").zh_CN("项目地址").range(1,150).
				has_field("project_area").zh_CN("项目面积").which_type_of(FieldType.DECIMAL).
				has_field("project_rough_budget").zh_CN("项目预算").which_type_of(FieldType.DECIMAL).
				has_field("project_owner").zh_CN("业主单位").which_model_of(MODEL.merchant()).values_can_select_from_query_by(null).
				has_field("store").zh_CN("门店").which_model_of(MODEL.merchant()).values_can_select_from_query_by(null).
				has_field("partner").zh_CN("合作伙伴").which_model_of(MODEL.merchant()).values_can_select_from_query_by(null).optional().
				has_field("project_type").zh_CN("项目类型").which_model_of(MODEL.projectType()).values_can_select_from_query_by(null).optional().
				has_field("project_service_type").zh_CN("项目服务类型").which_model_of(MODEL.projectServiceType()).values_can_select_from_query_by(null).
				has_field("project_phase").zh_CN("项目阶段").which_model_of(MODEL.projectPhase()).values_can_select_from_query_by(null).
				has_field("design_status").zh_CN("设计状态").which_model_of(MODEL.workStatus()).values_can_select_from_query_by(null).optional().
				has_field("construction_status").zh_CN("施工状态").which_model_of(MODEL.contractStatus()).values_can_select_from_query_by(null).optional()


				;
	}
}
