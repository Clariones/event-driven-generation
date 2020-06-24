package cla.edg.project.yrzx.changerequest;


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
				.has_field("phase").zh_CN("项目阶段").which_model_of(MODEL.projectPhase()).values_can_select_from_query_by(null);

	}
}
