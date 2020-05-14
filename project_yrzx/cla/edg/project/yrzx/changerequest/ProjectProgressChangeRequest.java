package cla.edg.project.yrzx.changerequest;


import cla.edg.project.yrzx.gen.graphquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;


/**
 * 项目进度相关表单的ChangeRequest
 * @author Jarry Zhou
 */
public class ProjectProgressChangeRequest implements ChangeRequestSpecFactory {

	@Override
	public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
		return builder 
			.change_request("project progress").zh_CN("创建项目进度")
				.icon("form")
				.has_field("project id").hidden()
				.has_field("project name").disabled().zh_CN("项目名称")
				.has_field("phase name").disabled().zh_CN("项目阶段")
				.has_field("phase id").hidden()
				.has_field("title").zh_CN("标题").range(1,40)
				.has_field("project progress status").zh_CN("状态").which_model_of(MODEL.projectProgressStatus())
				.values_can_select_from_query_by("project id")
				.has_field("brief").zh_CN("简介").range(1,300)
				.has_field("plan start date").zh_CN("计划开始").which_type_of(FieldType.DATE)
				.has_field("actual start date").zh_CN("实际开始").which_type_of(FieldType.DATE)
				.has_field("plan finish date").zh_CN("计划结束").which_type_of(FieldType.DATE)
				.has_field("actual finish date").zh_CN("实际结束").which_type_of(FieldType.DATE)

				;
	}
}
