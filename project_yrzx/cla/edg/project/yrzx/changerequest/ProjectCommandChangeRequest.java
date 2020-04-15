package cla.edg.project.yrzx.changerequest;

import java.util.Map;



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
				
			// ✅ 工程验收申请单
			.change_request("project command").zh_CN("项目指令单")
				.icon("form")
				.has_field("project id").zh_CN("项目ID").hidden()
				.has_field("directive type").zh_CN("指令类型")
					.which_model_of("daily_task_type").values_can_select_from_query_by("project command")
				.has_field("directive brief").zh_CN("指令事由")
					.range(1,200)
					.place_holder("请填写指令事由")
				.has_field("has cost").zh_CN("是否发生费用").which_type_of(FieldType.BOOLEAN)
					.values_canbe(true, "发生").or(false, "不发生")
					.defaule_value(false)
				.has_field("summary").zh_CN("具体内容").which_type_of(FieldType.MULTI_TEXT)
					.place_holder("具体内容")
				.has_field("content").zh_CN("具体内容").which_type_of(FieldType.MULTI_TEXT)
					.place_holder("详细内容")
				.has_field("images").zh_CN("图片").which_type_of(FieldType.IMAGES)
				.has_field("main recievers").zh_CN("主送单位").do_multiple_select()
				.has_field("copy to recievers").zh_CN("抄送单位").optional().do_multiple_select()
				;
	}
}
