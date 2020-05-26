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
				.has_field("merchant name").zh_CN("姓名").disabled()
				.has_field("gender").zh_CN("性别")
					.values_canbe("male","男").or("female","女")
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
				.has_field("working years").zh_CN("工作年限").which_type_of(FieldType.INTEGER).range(0,100);


	}
}
