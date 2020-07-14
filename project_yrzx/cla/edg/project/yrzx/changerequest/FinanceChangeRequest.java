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
			.change_request("help application").zh_CN("扶持申请")
				.icon("form")
				.has_field("name").zh_CN("名称")
				.has_field("project id").hidden().fill_by_request("project id")
				.has_field("project name").zh_CN("扶持项目").disabled().fill_by_request("project id",MODEL.project().title())
				.has_field("borrower").zh_CN("申请人").disabled().fill_by_request("project nomination id",MODEL.projectNomination().title())
				.has_field("borrower unit").zh_CN("申请人单位").disabled()
				.has_field("amount").zh_CN("扶持金额").which_type_of(FieldType.MONEY)
				.has_field("pledged contract").zh_CN("质押合同").which_model_of(MODEL.standardContract()).values_can_select_from_query_by(null)
				.has_field("submit time").zh_CN("申请时间").display().value("提交后自动生成")
				.has_field("loan_usage").zh_CN("扶持原因").which_type_of(FieldType.MULTI_TEXT)
				.has_field("material merchant").zh_CN("材料商").which_model_of(MODEL.merchant()).values_can_check_from_query_by("project id")
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

				;
	}
}
