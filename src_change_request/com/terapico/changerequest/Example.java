package com.terapico.changerequest;

import java.util.List;
import java.util.stream.Collectors;

import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.spec.EventSpec;
import com.terapico.changerequest.spec.ProjectChangeRequestSpec;

import cla.edg.Utils;

public class Example {

	public ProjectChangeRequestSpec scriptExampe() {

		return ChangeRequestSpecBuilder.for_project("example")
				.change_request("marriage registration").zh_CN("婚姻注册申请")
					.step1("personal info").zh_CN("个人信息")							//默认 .cannot_skip()
						.contains_event("citizen").as("male").zh_CN("男方信息")
							.has_field("message1")
								.display()
								.value("请在下面输入申请婚姻登记的男方信息")
							.has_field("name").zh_CN("姓名")							//默认 .which_type_of(FieldType.TEXT)
								.range(1,40)
								.place_holder("请输入男方姓名")
								.tips_title("注意事项").tips_content("请与身份证保持一致")
							.has_field("gender").zh_CN("性别")		
								.values_canbe("male","男").or("female","女")			// 有 values_canbe(), 默认是 multi_selection, 后面跟 or 则变成 single_selection
								.value("male")
								.disabled()
							.has_field("birthday").zh_CN("出生日期").which_type_of(FieldType.DATE)
								.must_have()
								.place_holder("请输入男方的生日")
								.tips_title("?").tips_content("请与身份证保持一致")
						.contains_event("citizen").as("female").zh_CN("女方信息").must_one()
							.for_field("message1")
								.display()
								.value("请在下面输入申请婚姻登记的女方信息")
							.for_field("gender").value("female")
							.for_field("birthday").place_holder("请输入女方的生日")
					.step2("premarital declaration").zh_CN("婚前财产及协议声明").can_skip()
						.contains_event("premaritial notarization").as("male").zh_CN("男方婚前财产声明")
							.has_field("need notarize").zh_CN("我要申请婚前财产公证")
								.defaule_value(false)
								.values_canbe(true, "我要申请婚前财产公证").or(false, "我放弃婚前财产公证")
							.has_field("delcared value").zh_CN("声明财产金额").which_type_of(FieldType.MONEY)
								.place_holder("请输入声明要公证的婚前财产金额")
								.defaule_value(0)
								.optional()
						.contains_event("premaritial notarization").as("female").zh_CN("女方婚前财产声明")
						.contains_event("additional terms").zh_CN("补充条款").many_times(0,200)
							.has_field("content").zh_CN("内容")
								.range(1,500)
								.place_holder("请输入条款内容")
					.step3("registration").zh_CN("注册信息")
						// 只有一个event,一次,必填,可以全部使用默认值: 名字和step一样,标题和step一样,cannot_skip
						// 同样的道理, 只有一个step可以向 changeRequest 取默认值
							.has_field("register date").zh_CN("申请注册日期").which_type_of(FieldType.DATE)
								.tips_title("?").tips_content("领取结婚证的日期")
								.place_holder("请选择申请注册的日期")
							.has_field("register provice").zh_CN("注册地-省")
								.tips_title("?").tips_content("前往领取结婚证的民政局所在地址")
								.values_can_get_from("getProvinces/")
							.has_field("register city").zh_CN("注册地-市")
								.tips_title("?").tips_content("前往领取结婚证的民政局所在地址")
								.values_can_get_from("getCitiesByProvince/${register provice}/")
							.has_field("register office").zh_CN("注册地-民政局")
								.tips_title("?").tips_content("前往领取结婚证的民政局")
								.values_can_get_from("getOfficeByCity/${register city}/")
				.getChangeRequestSpec();
	}
	
	public static void main(String[] args) {
		ProjectChangeRequestSpec rst = new Example().scriptExampe();
		System.out.println(Utils.toJson(rst, true));
		
//		List<EventSpec> X = rst.getChangeRequestSpecs().values().stream()
//				.flatMap(itStep->itStep.getStepSpecs().stream()
//						.flatMap(itEvent->itEvent.getEventSpecs().stream())
//				).collect(Collectors.toList());
//			System.out.println(Utils.toJson(X, true));
	}
}
