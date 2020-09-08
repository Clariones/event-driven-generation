package cla.edg.project.yrzx.changerequest;

import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;


/*
先行赔付
 */
public class AdvanceCompensationChangeRequest implements ChangeRequestSpecFactory {
	@Override
	public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
		return builder 
				
			.change_request("apply for advance compensation").zh_CN("先行赔付申请").need_login()
				.icon("form")
				.has_field("project id").hidden()
				.has_field("compensation application name").zh_CN("标题")
				.has_field("project name").zh_CN("项目名称").disabled()
				.has_field("reason").zh_CN("赔付原因")
					.place_holder("请填写申请先行赔付的原因").range(5,200)

				.has_field("images").zh_CN("照片").which_type_of(FieldType.IMAGES)

			
		;
	}
}
