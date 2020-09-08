package cla.edg.project.yrzx.changerequest;


import cla.edg.project.yrzx.gen.graphquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;


/**
 * 
员工相关CR
 * 
 * @author Jarry Zhou
 *
 */
public class EmployeeChangeRequest implements ChangeRequestSpecFactory {

	@Override
	public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
		return builder
			.change_request("fill personal detail").zh_CN("完善个人资料")
				.icon("form")
				.has_field("merchant id").hidden()
				.has_field("avatar").zh_CN("头像").which_type_of(FieldType.IMAGE)
				.has_field("merchant name").zh_CN("姓名").disabled()
				.has_field("phone").zh_CN("电话").disabled()
				.has_field("gender").zh_CN("性别")
					.values_canbe("male","男").or("female","女")
				.has_field("id number").zh_CN("身份证号")
				.has_field("address").zh_CN("家庭住址")
				.has_field("industry type").zh_CN("行业分类")
					.which_model_of(MODEL.industryType())
					.values_can_select_from_query_by("project id")
				.has_field("engineering type").zh_CN("工程类型")
					.which_model_of(MODEL.engineeringType())
					.values_can_select_from_query_by("project id")
				.has_field("career type").zh_CN("职业分类")
					.which_model_of(MODEL.careerType())
					.values_can_select_from_query_by("project id")
				.has_field("working years").zh_CN("工作年限").which_type_of(FieldType.INTEGER).range(0,100)

			.change_request("add debit card").zh_CN("添加银行卡")
				.icon("form")
				.has_field("bank").zh_CN("开户银行").values_canbe("中国银行","中国银行").
						or("中国工商银行","中国工商银行").
						or("招商银行","招商银行").
						or("中国农业银行","中国农业银行").
						or("中国建设银行 ","中国建设银行 ").
						or("中国民生银行","中国民生银行").
						or("中国光大银行","中国光大银行").
						or("中信银行","中信银行").
						or("交通银行","交通银行").
						or("兴业银行","兴业银行")
//						or("上海浦东发展银行","上海浦东发展银行").
//						or("华夏银行","华夏银行").
//						or("汇丰中国银行","汇丰中国银行").
//						or("渣打中国银行","渣打中国银行").
//						or("香港汇丰银行 ","香港汇丰银行 ").
//						or("渣打(香港)银行","渣打(香港)银行").
//						or("中国建设银行(亚洲)","中国建设银行(亚洲)").
//						or("东亚银行","东亚银行").
//						or("恒生银行 ","恒生银行 ").
//						or("花旗(台湾)银行","花旗(台湾)银行").
//						or("荷兰银行","荷兰银行").
//						or("欧力士银行","欧力士银行").
//						or("巴黎银行","巴黎银行").
//						or("美国运通银行","美国运通银行").
//						or("蒙特利尔银行","蒙特利尔银行").
//						or("满地可银行","满地可银行").
//						or("瑞士银行 ","瑞士银行 ").
//						or("德意志银行","德意志银行")
				.has_field("account name").zh_CN("开户名称")
				.has_field("bank address").zh_CN("开户地址").range(1,500).place_holder("例: 四川省成都市高新区世纪城路1132号附1号招商银行世纪城支行")
				.has_field("number").zh_CN("银行账号")

















				;
	}
}
