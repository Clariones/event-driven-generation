package cla.edg.project.yrzx.changerequest;


import cla.edg.project.yrzx.gen.graphquery.ChangeRequest;
import cla.edg.project.yrzx.gen.graphquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;


/**
 * 金融服务相关CR
 * @author Jarry Zhou
 */
public class FinanceChangeRequest implements ChangeRequestSpecFactory {

	@Override
	public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
		return builder 
			.change_request("loan application").zh_CN("贷款申请")
				.icon("form")
				.has_field("name").zh_CN("贷款名称")
				.has_field("project id").hidden().fill_by_request("project id")
				.has_field("project name").zh_CN("贷款项目").disabled().fill_by_request("project id",MODEL.project().title())
				.has_field("borrower").zh_CN("借款人").disabled().fill_by_request("employee nomination id",MODEL.employeeNomination().title())
				.has_field("amount").zh_CN("借款金额").which_type_of(FieldType.MONEY)
				.has_field("pledged contract").zh_CN("质押合同").which_model_of(MODEL.standardContract()).values_can_select_from_query_by(null)
				.has_field("submit time").zh_CN("申请时间").display().value("提交后自动生成")
				.has_field("loan_usage").zh_CN("贷款用途").which_type_of(FieldType.MULTI_TEXT)
				.has_field("expected repayment time").zh_CN("预期还款时间").which_type_of(FieldType.DATE)

//		loan_application="借款申请:$(loan_application)"
//		borrower_unit="借款单位:$(merchant)"
//		pledged_contract="质押合同:$(standard_contract)"
//		name="XXX借款合同"
//		loan_usage="借款用途:text()"
//		project_progress="借款工程进度:$(project_progress)"
//		loan_amount="$3000.00|$99999.00|$0.00"
//		interest_rate="借款利率:0.9999999"
//		replyment_term="借款周期:1|2|3|[1,99999999]"
//		apply_time="2020-05-05"
//		expected_replyment_time="2020-05-05"
//		project="$(project)"
//		platform="$(platform)"
//			.change_request("create loan contract").zh_CN("创建贷款合同")
//				.icon("form")
//				.step("loan contract basic info").zh_CN("借款合同基础信息")
//					.contains_event("loan contract basic info")
//						.has_field("loan application").zh_CN("借款申请").which_model_of(MODEL.loanApplication()).values_can_select_from_query_by("project id")
//						.has_field("name").zh_CN("合同名称").range(1,200).place_holder("请输入借款合同名称")
//						.has_field("borrower_unit").zh_CN("借款单位").which_model_of(MODEL.merchant()).values_can_select_from_query_by("project id")
//						.has_field("pledged_contract").zh_CN("质押合同").which_model_of(MODEL.standardContract()).values_can_select_from_query_by("project id")
//
//						.has_field("loan usage").zh_CN("贷款用途").fill_by_request("application id",MODEL.loanApplication().loanUsage())
//						.has_field("project progress").zh_CN("借款工程进度").which_model_of(MODEL.projectProgress()).values_can_select_from_query_by("project id")
//						.has_field("loan amount").zh_CN("借款金额").fill_by_request("application id",MODEL.loanApplication().applicationAmount())
//						.has_field("interest rate").zh_CN("借款利率").which_type_of(FieldType.DECIMAL)
//						.has_field("repayment term").zh_CN("借款周期").which_type_of(FieldType.INTEGER)
//						.has_field("apply time").zh_CN("申请时间").fill_by_request("application id",MODEL.loanApplication().applicationTime())
//						.has_field("expected repayment time").zh_CN("预期还款时间").fill_by_request("application id",MODEL.loanApplication().expectedRepaymentTime())
//						.has_field("project").zh_CN("借款项目").which_model_of(MODEL.project())
//						.has_field("document").zh_CN("借款合同原本").which_type_of(FieldType.MULTI_TEXT)
//
//				.step("pledged contract info").zh_CN("质押合同信息")
//					.contains_event("pledged contract info")
//						.has_field("project name").zh_CN("合同项目名称")
//						.has_field("pledged contract name").zh_CN("质押合同名称")
//						.has_field("").zh_CN("质押收益标的")
//						.has_field("").zh_CN("质押合同材料费")
//						.has_field("").zh_CN("质押合同甲方")
//						.has_field("").zh_CN("质押合同开始时间")
//						.has_field("").zh_CN("质押合同结束时间")
//				.step("contract confirmation").zh_CN("合同条款确认")
//						.has_field("document").zh_CN("合同文件")



				;
	}
}
