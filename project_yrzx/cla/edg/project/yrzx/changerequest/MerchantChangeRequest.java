package cla.edg.project.yrzx.changerequest;


import cla.edg.project.yrzx.gen.graphquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;


/**
* *
 * 商户change request
 * 
 * @author Jarry Zhou
 *
 */
public class MerchantChangeRequest implements ChangeRequestSpecFactory {




//	  <merchant
//	name="汪丁丁|成都双链科技有限责任公司|[1,100]"
//	merchant_type="$(merchant_type)"
//	merchant_base_type="$(merchant_base_type)"
//	merchant_status="$(merchant_status)"
//	contact_mobile="18012341234"
//	contact_address="成都市武侯区天府二街新希望天祥广场A座2511室|[0,200]"
//	avatar="avatar.jpg|logoImage.jpg"
//	create_time="createTime()"
//	last_update_time="updateTime()"
//	platform="$(platform)"
//	_features="merchant"
//	_vg4platform="人力资源"
//			/>

	@Override
	public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
		return builder

			.change_request("create enterprise merchant").zh_CN("创建企业商户")
				.icon("form")
				.step("basic info").step("基础信息")
				.contains_event("merchant basic info").step("基础信息")
					.has_field("phone number").zh_CN("联系电话").which_type_of(FieldType.MOBILE)

				.step("入驻申请")
					.has_field("project id").hidden()
					.has_field("pay item id").hidden()
					.has_field("comments").zh_CN("备注").which_type_of(FieldType.MULTI_TEXT)
					.has_field("document").zh_CN("上传资料")
					.has_field("images").zh_CN("见证图片").which_type_of(FieldType.IMAGES)


				;
	}
}
