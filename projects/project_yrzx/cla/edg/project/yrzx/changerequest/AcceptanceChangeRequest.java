package cla.edg.project.yrzx.changerequest;

import java.util.Map;


import cla.edg.project.yrzx.gen.graphquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;


/**
 * 
 * 工程验收相关表单的ChangeRequest
 * 
 * 包括
 * 工程验收申请单
 * 分部分项工程验收单
 * 工程进度验收单
 * 工序验收单
 * 竣工验收单
 * 
 * 其中
 * 工程验收申请通知单在线上操作,有changeRequest
 * 其他的以附件形式上传
 * 
 * 
 * @author Jarry Zhou
 *
 */
public class AcceptanceChangeRequest implements ChangeRequestSpecFactory {

	@Override
	public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
		return builder 
			// ✅ 工程验收申请单
			.change_request("acceptance application").zh_CN("工程验收申请通知单")
				// .request_base("pocService/handleCR/") 如果必要
				.icon("form")
				.has_field("title").zh_CN("标题")

				.has_field("project_id").hidden()
				.has_field("project_name").zh_CN("工程名称").disabled()
				.has_field("acceptance type").zh_CN("验收类型").which_model_of(MODEL.dailyTaskType().getModelTypeName())
					.values_can_select_from_query_by(null)
				.has_field("property_owner_id").hidden()
				.has_field("property_owner_name").zh_CN("业主单位").disabled()
				
				.has_field("epc_manage_company").zh_CN("EPC托管单位").disabled().value("优荣加速器")

				.has_field("acceptors").zh_CN("审核人")
					.which_model_of(MODEL.projectNomination().getModelTypeName())
					.values_can_check_from_query_by("project id")

//				.has_field("supervisor").zh_CN("监理单位").disabled()
//				.has_field("supervisor id").zh_CN("监理单位id").hidden()

				.has_field("acceptance_time").zh_CN("申请验收时间").which_type_of(FieldType.DATE_TIME)

				.has_field("application_unit_id").hidden()
				.has_field("application_unit").zh_CN("申请单位").disabled()
				
				.has_field("application_time").zh_CN("时间").disabled();
	}
}
