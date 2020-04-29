package cla.edg.project.yrzx.changerequest;


import cla.edg.project.yrzx.gen.graphquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;


/**
 * 
 * 项目报告表单的ChangeRequest
 * 
 * 包括
 * 监理日志
 * 经理日志
 * 施工日志
 * 
 * @author Jarry Zhou
 *
 */
public class ClaMiscChangeRequest implements ChangeRequestSpecFactory {


	@Override
	public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
		return builder
				.change_request("add employee").zh_CN("添加员工")
					.has_field("mobile").zh_CN("手机号").which_type_of(FieldType.MOBILE)
						.place_holder("请输入要添加的员工的手机号")
					.has_field("role").zh_CN("角色").which_model_of(MODEL.role().getModelTypeName())
						.values_can_select_from_query_by(null)
					.has_field("job").zh_CN("职位").which_model_of(MODEL.job().getModelTypeName())
						.values_can_select_from_query_by(null)


					;
		
	}
}
