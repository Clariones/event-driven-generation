package cla.edg.project.yrzx.changerequest;


import cla.edg.project.yrzx.gen.graphquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;


/**
 * 劳务监督相关表单的ChangeRequest
 * @author Jarry Zhou
 */
public class ProjectLaborChangeRequest implements ChangeRequestSpecFactory {

	@Override
	public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
		return builder 
			.change_request("labor supervisor").zh_CN("工程劳务管理单")
				.icon("form")
				.has_field("number").zh_CN("编号").disabled()
				.has_field("creator").disabled().zh_CN("编制单位/部门").value("优荣装修项目管理有限公司(造价咨询部)")
				.has_field("project id").hidden()
				.has_field("project name").zh_CN("项目名称").disabled()
				.has_field("contract number").zh_CN("分包合同编号").disabled()
				.has_field("bid price list").zh_CN("中标价格清单上传")
				.has_field("total labor cost").zh_CN("中标人工费总额").which_type_of(FieldType.MONEY)
				.has_field("project progress").zh_CN("发放阶段")
				.has_field("plan pay date").zh_CN("计划支付时间").which_type_of(FieldType.DATE)
				.has_field("plan pay amount").zh_CN("计划支付金额").which_type_of(FieldType.MONEY)
				.has_field("contract payment manager").zh_CN("合同支付负责人")
				.has_field("platform labor manager").zh_CN("平台劳务管理负责人")
				.has_field("actual pay date").zh_CN("实际支付时间").which_type_of(FieldType.DATE)
				.has_field("actual pay amount").zh_CN("实际支付金额").which_type_of(FieldType.MONEY)
				.has_field("payment manager").zh_CN("支付负责人")
				.has_field("contractor commitment").zh_CN("分包单位承诺")
				.has_field("create time").disabled()

			.change_request("labor dispute").zh_CN("劳务纠纷申请")
				.icon("form")
				.has_field("project id").hidden()
				.has_field("project name").zh_CN("项目名称").display()
				.has_field("title").zh_CN("纠纷名称")
				.has_field("work package").zh_CN("工作包名称").which_model_of(MODEL.workPackage()).values_can_select_from_query_by("project id")
				.has_field("type").zh_CN("纠纷类型").which_model_of(MODEL.laborDisputeType()).values_can_select_from_query_by("project id")
				.has_field("level").zh_CN("纠纷等级").values_canbe("danger","红色").or( "warn","橙色").or( "primary", "蓝色").or("normal", "绿色").or("default","灰色")
				.has_field("summary").zh_CN("纠纷概述").which_type_of(FieldType.MULTI_TEXT)
				.has_field("litigant").zh_CN("当事人")
				.has_field("applicant").zh_CN("申请人").disabled().which_model_of(MODEL.projectNomination())
				.has_field("create time").zh_CN("申请时间").disabled()


				;
	}
}
