package cla.edg.project.yrzx.changerequest;

import cla.edg.project.yrzx.gen.graphquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

import java.util.HashMap;

public class ApplyEmplacementAndRecommendationChangeRequest implements ChangeRequestSpecFactory {
	@Override
	public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
		return builder 
				
			.change_request("apply decoration").zh_CN("我要装修").need_login()
				.icon("form")
				.has_field("property type").zh_CN("物业类型")
					.place_holder("请选择物业类型")
					.which_model_of("estate_property_type").values_can_select_from_query_by(null)
				.has_field("property_area").zh_CN("物业面积(平方米)")
					.place_holder("请输入物业面积")
					.which_type_of(FieldType.DECIMAL)
				.has_field("property_location").zh_CN("物业地址")
					.place_holder("请输入物业详细地址")
					.range(5,200)
				.has_field("contact name").zh_CN("联系人")
					.place_holder("请输入联系人姓名")
					.range(1,40)
				.has_field("contact mobile").zh_CN("联系电话")
					.place_holder("请输入联系人手机")
					.which_type_of(FieldType.MOBILE)
			
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

			.change_request("apply emplacement").zh_CN("企业入驻").need_login()
				.icon("form")
				.has_field("merchant_name").zh_CN("公司名称")
					.place_holder("请输入公司名称")
				.has_field("merchant_location").zh_CN("公司地址")
					.place_holder("请输入公司名称")
				.has_field("partner_type").zh_CN("类型")
					.place_holder("请选择类型")
					.which_model_of("partner_type").values_can_select_from_query_by(null)
				.has_field("service_location").zh_CN("地区")
					.place_holder("请选择服务区域")
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

			.change_request("apply personal emplacement").zh_CN("个人入驻")
				.icon("form")
					.has_field("name").zh_CN("姓名")
					.has_field("gender").zh_CN("性别").values_canbe("male","男").or("female","女")
					.has_field("address").zh_CN("住址")
					.has_field("career type").zh_CN("职业类型")
						.which_model_of(MODEL.careerType())
						.values_can_select_from_query_by("project id")
					.has_field("business type").zh_CN("业务类型")
						.which_model_of(MODEL.businessType())
						.values_can_select_from_query_by("project id")
					.has_field("service location").zh_CN("服务区域")
						.place_holder("请选择服务区域")
						.which_model_of("available_service_location").values_can_select_from_query_by(null)
					.has_field("home page").zh_CN("个人首页")
						.place_holder("请输入公司名称").optional().with_style(UIStyle.INPUT_URL)
					.has_field("description").zh_CN("个人描述")
					.has_field("phone").zh_CN("联系电话").which_type_of(FieldType.MOBILE)
					.has_field("avatar").zh_CN("个人头像").which_type_of(FieldType.IMAGE)



				.change_request("subcontract application").zh_CN("项目参与").need_login()
					.icon("form")
						.has_field("project").zh_CN("参与项目").which_model_of(MODEL.project()).values_can_select_from_query_by(null)
						.has_field("application type").zh_CN("参与类型").which_model_of(MODEL.careerType()).values_can_select_from_query_by("project id")
						.has_field("merchant type").zh_CN("商户类型").which_model_of(MODEL.merchantType()).values_can_select_from_query_by("project id")
						.has_field("application unit").zh_CN("申请单位").disabled()
						.has_field("applicant").zh_CN("申请个人").disabled()
						.has_field("work package type").zh_CN("分包申请").which_model_of(MODEL.workPackageType()).values_can_select_from_query_by("project id")
						.has_field("application reason").zh_CN("申请理由").which_type_of(FieldType.MULTI_TEXT)
						.has_field("phone").zh_CN("联系电话")
	;}
}
