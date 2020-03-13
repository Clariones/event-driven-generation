package com.terapico.changerequest;

import java.util.Map;

import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.FieldType;

import cla.edg.Utils;

public class Example {

	public Map<String, Map<String, Object>> scriptExampe() {

		return ChangeRequestSpecBuilder.for_project("example")
				.request_base("wxappService")
				.change_request("marriage registration").zh_CN("婚姻注册申请")
					.step("personal info").zh_CN("个人信息")							//默认 .cannot_skip()
						.contains_event("citizen").as("male").zh_CN("男方信息")
							.has_field("message1")
								.display()
								.value("请在下面输入申请婚姻登记的男方信息")
							.has_field("avatar").zh_CN("证件照").which_type_of(FieldType.IMAGES)
								.place_holder("请上传照片")
								.tips_title("注意事项").tips_content("正面免冠彩色2寸证件照")
							.has_field("name").zh_CN("姓名")							//默认 .which_type_of(FieldType.TEXT)
								.sample_data("张先生|李小姐")
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
					// .step("personal info 2").zh_CN("个人信息2")	
						.contains_event("citizen").as("female").zh_CN("女方信息").must_one()
							.for_field("message1")
								.display()
								.value("请在下面输入申请婚姻登记的女方信息")
							.for_field("name").place_holder("请输入女方姓名")
								.sample_data("张先生|王太太")
							.for_field("gender").value("female")
							.for_field("birthday").place_holder("请输入女方的生日")
					.step("premarital declaration").zh_CN("婚前财产及协议声明").can_skip()
						.contains_event("premaritial notarization").as("male").zh_CN("男方婚前财产声明")
							.has_field("need notarize").zh_CN("我要申请婚前财产公证")
								.defaule_value(false)
								.values_canbe(true, "我要申请婚前财产公证").or(false, "我放弃婚前财产公证")
							.has_field("delcared value").zh_CN("声明财产金额").which_type_of(FieldType.MONEY)
								.place_holder("请输入声明要公证的婚前财产金额")
								.tips_title("注意")
								.range(1000.0, 100000000.0)
								.tips_content("财产少于¥10000元,建议不要做婚前财产公证. 公证费用为¥300.00.")
								.defaule_value(0)
								.optional()
						.contains_event("premaritial notarization").as("female").zh_CN("女方婚前财产声明")
						.contains_event("additional terms").zh_CN("补充条款").many_times(0,200).optional()
							.has_field("content").zh_CN("内容")
								.range(1,500)
								.place_holder("请输入条款内容")
					.step("registration").zh_CN("注册信息")
						// 只有一个event,一次,必填,可以全部使用默认值: 名字和step一样,标题和step一样,cannot_skip
						// 同样的道理, 只有一个step可以向 changeRequest 取默认值
							.has_field("register date").zh_CN("申请注册日期").which_type_of(FieldType.DATE)
								.tips_title("?").tips_content("领取结婚证的日期")
								.place_holder("请选择申请注册的日期")
							.has_field("register province").zh_CN("注册地-省")
								.sample_data("四川|广东|上海")
								.tips_title("?").tips_content("前往领取结婚证的民政局所在地址")
								.values_can_get_from("getProvinces/")
								.range(1,40)
							.has_field("register city").zh_CN("注册地-市")
								.sample_data("成都|深圳|上海")
								.tips_title("?").tips_content("前往领取结婚证的民政局所在地址")
								.values_can_get_from("getCitiesByProvince/${register provice}/")
							.has_field("register office").zh_CN("注册地-民政局")
								.optional()
								.tips_title("?").tips_content("前往领取结婚证的民政局")
								.values_can_get_from("getOfficeByCity/${register city}/")
				.change_request("test").zh_CN("测试")
					.has_field("name").zh_CN("姓名")
					.has_field("birthtime").zh_CN("出生时间").which_type_of(FieldType.DATE_TIME)
						.place_holder("用来算生辰八字")
					.has_field("favorite").zh_CN("爱好")
						.values_canbe("1", "运动").and("2", "读书").and("3", "美食").and("4", "修炼")
					.has_field("self introduction").zh_CN("自我介绍").which_type_of(FieldType.MULTI_TEXT)
						.range(10, 500)
					.contains_event("premaritial notarization").as("madamada").zh_CN("财产声明")
				.getChangeRequestSpec();
	}
	
	
	public Object simpleExampe() {

		return ChangeRequestSpecBuilder.for_project("example")
				.change_request("marriage registration").zh_CN("婚姻注册申请")
					.has_field("message1")
						.display()
						.value("请在下面输入申请婚姻登记的男方信息")
						.sample_data("")
					.has_field("name").zh_CN("姓名")	
						.range(1,40)
						.place_holder("请输入男方姓名")
						.tips_title("注意事项").tips_content("请与身份证保持一致")
					.has_field("gender").zh_CN("性别")		
						.values_canbe("male","男").or("female","女")	
						.value("male")
						.disabled()
					.has_field("birthday").zh_CN("出生日期").which_type_of(FieldType.DATE)
						.must_have()
						.place_holder("请输入男方的生日")
						.tips_title("?").tips_content("请与身份证保持一致")
				.getChangeRequestSpec();
	}
	public static void main(String[] args) {
		Object rst = new Example().scriptExampe();
		System.out.println(Utils.toJson(rst, true));
		// test1();
//		List<EventSpec> X = rst.getChangeRequestSpecs().values().stream()
//				.flatMap(itStep->itStep.getStepSpecs().stream()
//						.flatMap(itEvent->itEvent.getEventSpecs().stream())
//				).collect(Collectors.toList());
//			System.out.println(Utils.toJson(X, true));
	}


	private static void test1() {
		for(int i=0;i<9;i++) {
			int n = (i%3+2)*(int)(Math.pow(2, i/3+1))+i/3;
			System.out.println("X"+i+"="+n);
		}
		
		
//		System.out.println("开始");
//		for(int i=1;i<575;i++) {
//			for(int j=1;j<575;j++) {
//				for(int k=1;k<575;k++) {
//					if (i+k+j != 575) {
//						continue;
//					}
//					if (i*j*k != 6750000) {
//						continue;
//					}
//					System.out.printf("%d,%d,%d\n",i,j,k);
//				}
//			}
//		}
//		System.out.println("收工");
	}
	
	
}
