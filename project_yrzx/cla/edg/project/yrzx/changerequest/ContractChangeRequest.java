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
					.has_field("project id").hidden().fill_by_request("project id")
					.has_field("contract type id").hidden().fill_by_request("type id")
					.has_field("name").zh_CN("合同名称")
					.has_field("number").zh_CN("合同编号").which_type_of(FieldType.MULTI_TEXT)
					.has_field("contract type").zh_CN("合同类型").disabled().fill_by_request_member("type id",MODEL.contractType().name())
					.has_field("status").zh_CN("状态").which_model_of(MODEL.contractStatus()).values_can_select_from_query_by(null)
					.has_field("project name").zh_CN("工程名称").disabled().fill_by_request_member("project id",MODEL.project().title())
					.has_field("project location").zh_CN("工程地址").disabled().fill_by_request_member("project id",MODEL.project().location())
					.has_field("summary").zh_CN("摘要").which_type_of(FieldType.MULTI_TEXT)
					.has_field("amount").zh_CN("总金额").which_type_of(FieldType.MONEY)
					.has_field("party a").zh_CN("甲方").which_model_of(MODEL.merchant()).values_can_select_from_query_by(null)
					.has_field("party b").zh_CN("乙方").which_model_of(MODEL.merchant()).values_can_select_from_query_by(null)
					.has_field("start date").zh_CN("工程开始日期").which_type_of(FieldType.DATE_TIME)
					.has_field("end date").zh_CN("工程结束日期").which_type_of(FieldType.DATE_TIME)
//					.has_field("contract document").zh_CN("合同文档").which_type_of(FieldType.of(""))
				.step("pay item").zh_CN("付款方式")
					.contains_event("contract payment phase").zh_CN("付款周期").many_times(1,100)
						.has_field("name").zh_CN("名称")
						.has_field("payer").zh_CN("付款方").which_model_of(MODEL.merchant()).values_can_select_from_query_by(null)
						.has_field("payee").zh_CN("收款方").which_model_of(MODEL.merchant()).values_can_select_from_query_by(null)
						.has_field("total amount").zh_CN("合同总金额").disabled().fill_by_submitted("amount")
						.has_field("criteria").zh_CN("付款条件").which_type_of(FieldType.MULTI_TEXT)
						.has_field("proportion").zh_CN("付款比例").which_type_of(FieldType.DECIMAL).range(0,1)
						.has_field("labor fee proportion").zh_CN("劳务费用比例").which_type_of(FieldType.DECIMAL).range(0,1)
						.has_field("material fee proportion").zh_CN("材料费用比例").which_type_of(FieldType.DECIMAL).range(0,1)
						.has_field("other proportion").zh_CN("其它费用比例").which_type_of(FieldType.DECIMAL).range(0,1)
						.has_field("comments").zh_CN("备注").which_type_of(FieldType.MULTI_TEXT)
						.has_field("project progress").zh_CN("施工阶段").which_model_of(MODEL.projectProgress()).values_can_select_from_query_by(null)
						.has_field("expected pay time").zh_CN("预期付款时间").which_type_of(FieldType.DATE)


			.change_request("create additional contract").zh_CN("签证及补充合同")
				.icon("form")
					.step("additional contract basic info").zh_CN("基本信息")
					.contains_event("additional contract basic info")
					.has_field("contract id").hidden().fill_by_request("contract id")
					.has_field("project id").hidden().fill_by_request("project id")
					.has_field("name").zh_CN("合同名称")
					.has_field("number").zh_CN("合同编号").which_type_of(FieldType.MULTI_TEXT)
					.has_field("contract type").zh_CN("合同类型").which_model_of(MODEL.supplementaryContractType()).values_can_select_from_query_by("project id")
					.has_field("main contract").zh_CN("主合同").disabled().fill_by_request_member("contract id",MODEL.standardContract().name())
					.has_field("project name").zh_CN("工程名称").disabled().fill_by_request_member("project id",MODEL.project().title())
					.has_field("summary").zh_CN("摘要").which_type_of(FieldType.MULTI_TEXT)
//					.has_field("contract document").zh_CN("合同文档").which_type_of(FieldType.of(""))
				.step("pay item").zh_CN("付款方式")
				.contains_event("additional contract payment phase").zh_CN("付款周期调整").many_times(1,100)
					.has_field("name").zh_CN("名称")
					.has_field("payment item").zh_CN("调整款项").which_model_of(MODEL.contractPayItem()).values_can_select_from_query_by(null)
					.has_field("comments").zh_CN("备注").which_type_of(FieldType.MULTI_TEXT)
					.has_field("adjustment").zh_CN("金额调整").which_type_of(FieldType.MONEY)
					.has_field("expected pay time").zh_CN("预期时间调整").which_type_of(FieldType.DATE).optional()


				/**
				 *
				 *   contract_pay_item="$(contract_pay_item)"
				 *     name="平台项目管理服务费|[1,99]"
				 *     brief="托管服务费首期支付|托管服务费二期支付|托管服务费三期支付|托管服务费四期支付|托管服务费五期支付|[1,99]"
				 *     amount="9999999.99"
				 *     expected_time="2020-05-05"
				 *     pay_criteira="合同款项支付条件文本描述|[1,999]"
				 *     create_time="createTime()"
				 */
//				.change_request("create contract additional item").zh_CN("创建增补合同")
//					.icon("form")
//					.has_field("contract pay item id").hidden()
//					.has_field("brief").zh_CN("描述")
//					.has_field("amount").zh_CN("变更金额")
//					.has_field("expected time")
				;
	}
}
