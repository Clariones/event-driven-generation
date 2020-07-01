package cla.edg.project.yrzx.changerequest;


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
				.has_field("borrower").zh_CN("借款人").disabled().fill_by_request("merchant id",MODEL.merchant().name())
				.has_field("amount").zh_CN("借款金额").which_type_of(FieldType.MONEY)
				.has_field("submit time").zh_CN("申请时间").display().value("提交后自动生成")
				.has_field("loan_usage").zh_CN("贷款用途").which_type_of(FieldType.MULTI_TEXT)
				.has_field("expected repayment time").zh_CN("预期还款时间").which_type_of(FieldType.DATE)
				;
	}
}
