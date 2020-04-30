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
				// 添加公司员工
				.change_request("add employee").zh_CN("添加员工")
					.has_field("mobile").zh_CN("手机号").which_type_of(FieldType.MOBILE)
						.place_holder("请输入要添加的员工的手机号")
					.has_field("role").zh_CN("角色").which_model_of(MODEL.role())
						.values_can_select_from_query_by(null)
					.has_field("job").zh_CN("职位").which_model_of(MODEL.job())
						.values_can_select_from_query_by(null)

				// 添加项目职位
				.change_request("add project nomination").zh_CN("添加岗位")
					.step("project nomination base info").zh_CN("基本信息")
						.contains_event("project info").zh_CN("基本信息")
							.has_field("project name").zh_CN("项目名称").display()
							.has_field("project id").zh_CN("项目ID").hidden()
							.has_field("merchant").zh_CN("服务商公司").which_model_of(MODEL.merchant())
								.place_holder("请选择任职人员所在的公司")
								.values_can_select_from_query_by(null)
					.step("project nomination job info").zh_CN("职务")
						.contains_event("project work position").zh_CN("职务信息")
							.has_field("company name").zh_CN("公司名称").display()
							.has_field("project job").zh_CN("职位").which_model_of(MODEL.projectOrganizationType())
								.place_holder("请选择职务类型")
								.values_can_select_from_query_by(null)
							.has_field("project role").zh_CN("类型").which_model_of(MODEL.projectRole())
								.place_holder("请选择权限类型")
								.values_can_select_from_query_by(null)
							.has_field("work package").zh_CN("工作包").which_model_of(MODEL.workPackage())
								.place_holder("请选择相关的工作包")
								.values_can_select_from_query_by(null)
								.optional()
							.has_field("employee").zh_CN("员工").which_model_of(MODEL.employeeNomination())
								.place_holder("请选择担任此岗位的员工")
								.values_can_select_from_query_by(null)
					;
		
	}
}
