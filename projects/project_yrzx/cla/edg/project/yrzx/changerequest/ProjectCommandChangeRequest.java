package cla.edg.project.yrzx.changerequest;

import java.util.Map;


import cla.edg.project.yrzx.gen.graphquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;


/**
 * 
 * 项目指令表单的ChangeRequest
 * 
 * @author Jarry Zhou
 *
 */
public class ProjectCommandChangeRequest implements ChangeRequestSpecFactory {


	@Override
	public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
		return builder 
				
			.change_request("project command").zh_CN("项目指令单")
				.icon("form")
				.has_field("project id").zh_CN("项目ID").hidden()
				.has_field("project name").zh_CN("项目名称").disabled()
				.has_field("command name").zh_CN("指令名称")
				.has_field("directive type").zh_CN("指令类型")
					.which_model_of("daily_task_type").values_can_select_from_query_by(null)
				.has_field("command number").zh_CN("指令编号").value("提交后自动生成").disabled()
				.has_field("directive brief").zh_CN("指令事由")
					.range(1,200)
					.place_holder("请填写指令事由")
				.has_field("has cost").zh_CN("是否发生费用").which_type_of(FieldType.BOOLEAN)
					.values_canbe(true, "发生").or(false, "不发生")
					.defaule_value(false)
				.has_field("summary").zh_CN("具体内容").which_type_of(FieldType.MULTI_TEXT)
					.place_holder("具体内容")
				.has_field("content").zh_CN("详细内容").which_type_of(FieldType.MULTI_TEXT)
					.place_holder("详细内容")
				.has_field("images").zh_CN("图片").which_type_of(FieldType.IMAGES)
				.has_field("main recievers").zh_CN("主送单位").which_model_of(MODEL.projectNomination()).values_can_check_from_query_by(null)
				.has_field("copy to recievers").zh_CN("抄送单位").optional().which_model_of(MODEL.projectNomination()).values_can_check_from_query_by(null)
				.has_field("creator").zh_CN("发起人").disabled()
				.has_field("create time").zh_CN("时间").disabled()
				;
	}
}
