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
				.has_field("phase id").hidden()
				.has_field("title").zh_CN("标题").range(1,40)
				.has_field("brief").zh_CN("简介").range(1,300)
				.has_field("plan start date").zh_CN("计划开始时间").which_type_of(FieldType.DATE)
				.has_field("actual start date").zh_CN("实际开始时间").which_type_of(FieldType.DATE)
				.has_field("plan finish date").zh_CN("计划结束时间").which_type_of(FieldType.DATE)
				.has_field("actual finish date").zh_CN("实际结束时间").which_type_of(FieldType.DATE)

				;
	}
}
