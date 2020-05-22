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
				.has_field("reason").zh_CN("赔付原因")
					.place_holder("请填写申请先行赔付的原因").range(5,200)

				.has_field("images").zh_CN("照片").which_type_of(FieldType.IMAGES)

			
			.change_request("apply recommendation").zh_CN("我要推荐").need_login()
				.icon("form")
				.has_field("recommendation_type").zh_CN("推荐类型")
					.place_holder("请选择推荐类型")
					.which_model_of("recommendation_type").values_can_select_from_query_by(null)
				.has_field("title").zh_CN("标题")
					.place_holder("请简短说明推荐理由")
				.has_field("comments").zh_CN("备注")
					.place_holder("请输入您的备注")
					.range(0,200)
				.has_field("contact name").zh_CN("联系人")
					.place_holder("请输入联系人姓名")
					.range(1,40)
				.has_field("contact mobile").zh_CN("联系电话")
					.place_holder("请输入联系人手机")
					.which_type_of(FieldType.MOBILE)

			.change_request("apply emplacement").zh_CN("我要入驻").need_login()
				.icon("form")
				.has_field("merchant_name").zh_CN("公司名称")
					.place_holder("请输入公司名称")
				.has_field("merchant_location").zh_CN("公司地址")
					.place_holder("请输入公司名称")
				.has_field("partner_type").zh_CN("类型")
					.place_holder("请选择类型")
					.which_model_of("partner_type").values_can_select_from_query_by(null)
				.has_field("service_location").zh_CN("地区")
					.place_holder("请选择地区")
					.which_model_of("available_service_location").values_can_select_from_query_by(null)
				.has_field("merchant_website").zh_CN("公司首页")
					.place_holder("请输入公司名称").optional().with_style(UIStyle.INPUT_URL)

				.has_field("comments").zh_CN("备注")
					.place_holder("请输入您的备注")
					.range(0,200)
				.has_field("contact name").zh_CN("联系人")
					.place_holder("请输入联系人姓名")
					.range(1,40)
				.has_field("contact mobile").zh_CN("联系电话")
					.place_holder("请输入联系人手机")
					.which_type_of(FieldType.MOBILE)
				;
	}
}
