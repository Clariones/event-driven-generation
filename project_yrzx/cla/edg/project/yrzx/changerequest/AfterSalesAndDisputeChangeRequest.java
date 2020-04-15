package cla.edg.project.yrzx.changerequest;

import java.util.Map;



import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;


/**
 * 
 * 售后与劳务纠纷表单的hangeRequest
 * 
 * 目前都用一个form
 * 
 * @author Jarry Zhou
 *
 */
public class AfterSalesAndDisputeChangeRequest implements ChangeRequestSpecFactory {
	
	@Override
	public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
		return builder 
				
			.change_request("after sales").zh_CN("售后单")
				.icon("form")
				.has_field("project").which_model_of("project").hidden()
				.has_field("question description").zh_CN("问题描述")
				.has_field("images").zh_CN("图片").which_type_of(FieldType.IMAGES)
				.has_field("creator").zh_CN("创建人").disabled()
				.has_field("time").zh_CN("发起时间").which_type_of(FieldType.DATE_TIME);
	}
}
