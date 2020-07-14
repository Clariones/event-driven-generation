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
//				.change_request("create project").zh_CN("新建项目")
//				.icon("form")
//				.has_field("description").zh_CN("项目描述").which_type_of(FieldType.MULTI_TEXT)
//				.has_field("location").zh_CN("项目位置").which_type_of(FieldType.MULTI_TEXT)
//				.has_field("area").zh_CN("项目面积").which_type_of(FieldType.DECIMAL)
//				.has_field("budget").zh_CN("项目预算").which_type_of(FieldType.MONEY)
//				.has_field("owner").zh_CN("项目业主").which_model_of(MODEL.merchant()).values_can_select_from_query_by(null)
//				.has_field("store").zh_CN("门店").which_model_of(MODEL.merchant()).values_can_select_from_query_by(null)
//				.has_field("type").zh_CN("项目类型").which_model_of(MODEL.projectType()).values_can_select_from_query_by(null)
//				.has_field("phase").zh_CN("项目阶段").which_model_of(MODEL.projectPhase()).values_can_select_from_query_by(null)

//		title="大邑雅丽泰办公大楼装修工程|[1,50]"
//		description="项目施工描述信息|[1,200]"
//		location="成都市大邑县兴城大道（工业园区）|[1,150]"
//		project_area="28800080.00"
//		project_rough_budget="$100000000.00|[0.00,100000000]"
//		project_owner="$(merchant)"
//		store="$(merchant)"
//		partner="$(merchant?)"
//		project_type="$(project_type?)"
//		project_service_type="$(project_service_type)"
//		project_phase="$(project_phase)"
//		design_status="$(working_status?)"
//		construction_status="$(working_status?)"

//			.change_request("create project").zh_CN("创建项目")
//					.icon("form").
//					step("create project base info").zh_CN("项目基本信息")
//						.contains_event("create project base info").
//							has_field("title").zh_CN("项目名称").range(1,50).
//							has_field("description").zh_CN("项目描述").range(1,200).
//							has_field("location").zh_CN("项目地址").range(1,150).
//							has_field("project_area").zh_CN("项目面积").which_type_of(FieldType.DECIMAL).
//							has_field("project_rough_budget").zh_CN("项目预算").which_type_of(FieldType.DECIMAL).
//							has_field("project_owner").zh_CN("业主单位").which_model_of(MODEL.merchant()).values_can_select_from_query_by(null).
//							has_field("store").zh_CN("门店").which_model_of(MODEL.merchant()).values_can_select_from_query_by(null).
//							has_field("partner").zh_CN("合作伙伴").which_model_of(MODEL.merchant()).values_can_select_from_query_by(null).optional().
//							has_field("project_type").zh_CN("项目类型").which_model_of(MODEL.projectType()).values_can_select_from_query_by(null).optional().
//							has_field("project_service_type").zh_CN("项目服务类型").which_model_of(MODEL.projectServiceType()).values_can_select_from_query_by(null).
//							has_field("project_phase").zh_CN("项目阶段").which_model_of(MODEL.projectPhase()).values_can_select_from_query_by(null).
//							has_field("design_status").zh_CN("设计状态").which_model_of(MODEL.workStatus()).values_can_select_from_query_by(null).optional().
//							has_field("construction_status").zh_CN("施工状态").which_model_of(MODEL.contractStatus()).values_can_select_from_query_by(null).optional()


			.change_request("create project organization").zh_CN("添加项目组织")
				.step("select project").zh_CN("选择项目").contains_event("select project")

					.has_field("project").zh_CN("项目").which_model_of(MODEL.project()).values_can_select_from_query_by(null)


				.step("add project organization").zh_CN("添加项目组织").contains_event("add project organization").many_times(1,9999)

					.has_field("employee").zh_CN("员工").which_model_of(MODEL.employeeNomination())
						.place_holder("请选择担任此岗位的员工")

					.has_field("project organization type").zh_CN("组织类型").which_model_of(MODEL.projectOrganizationType())
						.place_holder("请选择职务类型")
						.values_can_select_from_query_by(null)

					.has_field("project role").zh_CN("项目职位").which_model_of(MODEL.projectRole())
						.place_holder("请选择权限类型")

					.has_field("description").zh_CN("项目职责描述").which_type_of(FieldType.MULTI_TEXT)
						.values_can_select_from_query_by(null)

					.has_field("work package").zh_CN("工作包").which_model_of(MODEL.workPackage())
						.place_holder("请选择相关的工作包")
						.values_can_select_from_query_by(null)
						.optional()
						.values_can_select_from_query_by(null)



//				<project_material
//		name="资料名称|[1,99]"
//		daily_task_type="$(daily_task_type)"
//		daily_task_template="$(daily_task_template?)"
//		project_material_type="$(project_material_type)"
//		document="document.docx"
//		material_submitter="$(employee_nomination)"
//		project="$(project)"
//		material_review_result="$(material_review_result)"
//		review_result_comment="审核结果备注|[1,999]"
//		create_time="createTime()"
//		last_update_time="updateTime()"
//		_vg4project="项目运营"
//				/>
//				.change_request("add project design document").zh_CN("添加项目设计资料")
//					.icon("form")
//					.has_field("name").range(1,99)
//					.has_field("document").range(1,512)
//					.has_field("submitter").which_model_of(MODEL.employeeNomination()).values_can_select_from_query_by(null)
//					.has_field("project").which_model_of(MODEL.project()).values_can_select_from_query_by(null)

				;
	}
}
