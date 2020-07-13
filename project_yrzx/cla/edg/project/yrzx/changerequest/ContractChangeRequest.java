package cla.edg.project.yrzx.changerequest;


import cla.edg.project.yrzx.gen.graphquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;


/**
 * 
合同相关CR
 * 
 * @author Jarry Zhou
 *
 */
public class ContractChangeRequest implements ChangeRequestSpecFactory {

	@Override
	public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
		return builder
			.change_request("create contract payment application").zh_CN("创建收款申请")
				.icon("form")
					.contains_event("expected pay item comments")
					.has_field("project id").hidden()
					.has_field("pay item id").hidden()
					.has_field("comments").zh_CN("备注").which_type_of(FieldType.MULTI_TEXT)
					.has_field("document").zh_CN("上传资料")
					.has_field("images").zh_CN("见证图片").which_type_of(FieldType.IMAGES)

					.has_field("send to").zh_CN("主送").which_model_of(MODEL.projectNomination()).values_can_check_from_query_by(null)
					.has_field("cc to").zh_CN("抄送").which_model_of(MODEL.projectNomination()).values_can_check_from_query_by(null)


			.change_request("create contract").zh_CN("创建合同")
				.icon("form")
					.step("contract basic info").zh_CN("基本信息")
					.contains_event("contract basic info")
					.has_field("project").zh_CN("项目").which_model_of(MODEL.project()).values_can_select_from_query_by(null).disabled()
					.has_field("contract type").zh_CN("合同类型").which_model_of(MODEL.contractType()).values_can_select_from_query_by(null).disabled()
					.has_field("name").zh_CN("合同名称").place_holder("请参照合同原本输入")
					.has_field("number").zh_CN("合同编号").range(1,40).place_holder("请参照合同原本输入")
					.has_field("status").zh_CN("状态").which_model_of(MODEL.contractStatus()).values_can_select_from_query_by(null)
					.has_field("summary").zh_CN("摘要").which_type_of(FieldType.MULTI_TEXT).place_holder("请参照合同原本输入")
					.has_field("important rules").zh_CN("重要条款").which_type_of(FieldType.MULTI_TEXT).place_holder("请参照合同原本输入")
					.has_field("amount").zh_CN("总金额").which_type_of(FieldType.MONEY).place_holder("请参照合同原本输入")
					.has_field("party a").zh_CN("甲方").which_model_of(MODEL.merchant()).values_can_select_from_query_by(null)
					.has_field("party b").zh_CN("乙方").which_model_of(MODEL.merchant()).values_can_select_from_query_by(null)
					.has_field("submitter").zh_CN("提交人").which_model_of(MODEL.employeeNomination()).values_can_select_from_query_by(null).disabled()
					.has_field("document").zh_CN("合同原件").range(1,512).hidden().optional()
				.has_field("start date").zh_CN("开始时间").which_type_of(FieldType.DATE)
				.has_field("end date").zh_CN("结束时间").which_type_of(FieldType.DATE)
				.step("pay item").zh_CN("付款方式")
					.contains_event("contract payment phase").zh_CN("付款周期").many_times(1,100).show_them_all_in_cr()
						.has_field("name").zh_CN("名称")
						.has_field("criteria").zh_CN("付款条件").which_type_of(FieldType.MULTI_TEXT)
						.has_field("proportion").zh_CN("付款比例").which_type_of(FieldType.DECIMAL).range(0,1)
						.has_field("sub total").zh_CN("付款金额").which_type_of(FieldType.MONEY)
						.has_field("labor fee").zh_CN("劳务费用").which_type_of(FieldType.MONEY)
						.has_field("material fee").zh_CN("材料费用").which_type_of(FieldType.MONEY)
						.has_field("other fee").zh_CN("其它费用").which_type_of(FieldType.MONEY)
						.has_field("comments").zh_CN("备注").which_type_of(FieldType.MULTI_TEXT)
						.has_field("project progress").zh_CN("施工阶段").which_model_of(MODEL.projectProgress()).values_can_select_from_query_by(null)
						.has_field("expected pay time").zh_CN("预期付款时间").which_type_of(FieldType.DATE)


			.change_request("create additional contract").zh_CN("签证及补充合同")
				.icon("form")
					.step("additional contract basic info").zh_CN("基本信息")
					.contains_event("additional contract basic info")
					.has_field("project").zh_CN("项目").which_model_of(MODEL.project()).values_can_select_from_query_by(null).disabled()
					.has_field("contract").zh_CN("主合同").which_model_of(MODEL.standardContract()).values_can_select_from_query_by(null).disabled()
					.has_field("name").zh_CN("合同名称")
					.has_field("number").zh_CN("合同编号").range(1,40).place_holder("请参照合同原本输入")
					.has_field("contract type").zh_CN("合同类型").which_model_of(MODEL.supplementaryContractType()).values_can_select_from_query_by("project id")
					.has_field("status").zh_CN("状态").which_model_of(MODEL.contractStatus()).values_can_select_from_query_by(null)
					.has_field("submitter").zh_CN("提交人").which_model_of(MODEL.employeeNomination()).values_can_select_from_query_by(null).disabled()
					.has_field("summary").zh_CN("摘要").which_type_of(FieldType.MULTI_TEXT)
					.has_field("document").zh_CN("合同原件").range(1,512).hidden().optional()
				.step("pay item").zh_CN("付款方式")
				.contains_event("additional contract payment phase").zh_CN("付款周期调整").many_times(1,100)
					.has_field("name").zh_CN("名称")
					.has_field("criteria").zh_CN("付款条件").which_type_of(FieldType.MULTI_TEXT)
					.has_field("sub total").zh_CN("付款金额").which_type_of(FieldType.MONEY)
					.has_field("labor fee").zh_CN("劳务费用").which_type_of(FieldType.MONEY)
					.has_field("material fee").zh_CN("材料费用").which_type_of(FieldType.MONEY)
					.has_field("other fee").zh_CN("其它费用").which_type_of(FieldType.MONEY)
					.has_field("comments").zh_CN("备注").which_type_of(FieldType.MULTI_TEXT)
					.has_field("project progress").zh_CN("施工阶段").which_model_of(MODEL.projectProgress()).values_can_select_from_query_by(null)
					.has_field("expected pay time").zh_CN("预期付款时间").which_type_of(FieldType.DATE)




				.change_request("create loan contract").zh_CN("创建项目扶持合同")
					.icon("form")
					.step("select loan application").zh_CN("选择贷款申请")
						.contains_event("select loan application").zh_CN("选择贷款申请")
						.has_field("loan application").zh_CN("借款申请").which_model_of(MODEL.helpApplication()).values_can_select_from_query_by(null).disabled()
				.step("pledged contract info").zh_CN("质押合同信息")
					.contains_event("pledged contract info")
					.has_field("project name").zh_CN("合同项目名称")
					.has_field("pledged contract name").zh_CN("质押合同名称")
					.has_field("pledged amount").zh_CN("质押收益标的")
					.has_field("pledged contract material fee").zh_CN("质押合同材料费")
					.has_field("pledged contract party a").zh_CN("质押合同甲方")
					.has_field("pledged contract start time").zh_CN("质押合同开始时间")
					.has_field("pledged contract end time").zh_CN("质押合同结束时间")
				.step("loan contract basic info").zh_CN("合同基础信息")
					.contains_event("loan contract basic info")
						.has_field("name").zh_CN("合同名称").range(1,200).place_holder("请输入借款合同名称")
						.has_field("borrower_unit").zh_CN("借款单位").which_model_of(MODEL.merchant()).disabled()
						.has_field("pledged_contract").zh_CN("质押合同").which_model_of(MODEL.standardContract()).disabled()
						.has_field("loan usage").zh_CN("贷款用途").which_type_of(FieldType.MULTI_TEXT)
						.has_field("project progress").zh_CN("借款工程进度").which_model_of(MODEL.projectProgress()).values_can_select_from_query_by("project id")
						.has_field("loan amount").zh_CN("借款金额").which_type_of(FieldType.MONEY)
						.has_field("interest rate").zh_CN("借款利率").which_type_of(FieldType.DECIMAL)
						.has_field("repayment term").zh_CN("借款周期").which_type_of(FieldType.INTEGER)
						.has_field("apply time").zh_CN("申请时间").which_type_of(FieldType.DATE)
						.has_field("expected repayment time").zh_CN("预期还款时间").which_type_of(FieldType.DATE)
						.has_field("project").zh_CN("借款项目").which_model_of(MODEL.project())
						.has_field("document").zh_CN("借款合同原本").which_type_of(FieldType.MULTI_TEXT)


//					.step("contract confirmation").zh_CN("合同条款确认")
//					.has_field("document").zh_CN("合同文件")



				;
	}
}
