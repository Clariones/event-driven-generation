package cla.edg.project.yrzx.changerequest;


import cla.edg.project.yrzx.gen.graphquery.AuditStatus;
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
				// 添加公司员工 (employee nomination)
				.change_request("add employee").zh_CN("添加员工")
					.has_field("mobile").zh_CN("手机号").which_type_of(FieldType.MOBILE)
						.place_holder("请输入要添加的员工的手机号")
					.has_field("role").zh_CN("角色").which_model_of(MODEL.role())
						.values_can_select_from_query_by(null)
					.has_field("job").zh_CN("职位").which_model_of(MODEL.job())
						.values_can_select_from_query_by(null)
					.has_field("description").zh_CN("职责描述").which_type_of(FieldType.MULTI_TEXT)

				// 添加项目职位 (project nomination)
				.change_request("add project nomination").zh_CN("添加岗位")
//					.step("project nomination base info").zh_CN("基本信息")
//						.contains_event("project info").zh_CN("基本信息")
//							.has_field("project name").zh_CN("项目名称").display()
//							.has_field("project id").zh_CN("项目ID").hidden()
//							.has_field("merchant").zh_CN("服务商公司").which_model_of(MODEL.merchant())
//								.place_holder("请选择任职人员所在的公司")
//								.values_can_select_from_query_by(null)
					.step("project nomination job info").zh_CN("职务")
						.contains_event("project work position").zh_CN("职务信息")
							.has_field("project name").zh_CN("项目名称").display()
							.has_field("project id").zh_CN("项目ID").hidden()
							.has_field("merchant id").zh_CN("服务商id").hidden()
							.has_field("company name").zh_CN("公司名称").display()
							.has_field("project job").zh_CN("职位").which_model_of(MODEL.projectOrganizationType())
								.place_holder("请选择职务类型")
								.values_can_select_from_query_by(null)
							.has_field("description").zh_CN("职责描述").which_type_of(FieldType.MULTI_TEXT)
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

				.change_request("review").zh_CN("审核")
					.icon("form")
					.has_field("audit record id").hidden()
					.has_field("review result").zh_CN("审核结论").
						values_canbe(AuditStatus.APPROVED.getLiteralName(),"通过").or(AuditStatus.UNAPPROVED.getLiteralName(),"有疑虑")
						.range(0,48)
//						which_model_of(MODEL.auditStatus()).values_can_select_from_query_by("project id")
					.has_field("comments").zh_CN("备注").optional()
				.change_request("comments").zh_CN("添加批注")
					.icon("form")
					.has_field("comment item type").which_type_of(FieldType.MULTI_TEXT).hidden()
					.has_field("comment item id").which_type_of(FieldType.MULTI_TEXT).hidden()
					.has_field("comments").zh_CN("备注")


				.change_request("sign").zh_CN("签收")
					.icon("form")
					.has_field("sign object type").hidden().fill_by_request("item type")
					.has_field("sign object id").hidden().fill_by_request("item id")
					.has_field("comments").zh_CN("备注").which_type_of(FieldType.MULTI_TEXT).optional()
					.has_field("submit time").zh_CN("签收时间").disabled().value("提交后自动生成")

				.change_request("add design document").zh_CN("添加设计资料")
					.icon("form")
					.has_field("project").which_model_of(MODEL.project()).values_can_select_from_query_by(null)
					.has_field("name").zh_CN("名称").range(1,40)
					.has_field("type").zh_CN("类型").which_model_of(MODEL.dailyTaskType()).values_can_select_from_query_by(null)
					.has_field("submitter").zh_CN("提交人").which_model_of(MODEL.merchant()).values_can_select_from_query_by(null)
					.has_field("document").zh_CN("原件").range(1,512)


				.change_request("add project material").zh_CN("添加项目资料")
					.icon("form")
					.has_field("project").which_model_of(MODEL.project()).values_can_select_from_query_by(null)
					.has_field("name").zh_CN("名称").range(1,40)
					.has_field("type").zh_CN("类型").which_model_of(MODEL.dailyTaskType()).values_can_select_from_query_by(null)
					.has_field("submitter").zh_CN("提交人").which_model_of(MODEL.merchant()).values_can_select_from_query_by(null)
					.has_field("document").zh_CN("原件").range(1,512)


				.change_request("confirm help contract").zh_CN("确认扶持合同")
					.icon("form")
					.contains_event("check verify code")
					.has_field("verify code").which_type_of(FieldType.TEXT).range(1,20).place_holder("请输入验证码")
					.has_field("item id").hidden()
					.has_field("item type").hidden()

				;
		
	}
}
