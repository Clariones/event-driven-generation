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




















				;
	}
}
