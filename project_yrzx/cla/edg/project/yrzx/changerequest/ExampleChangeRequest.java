package cla.edg.project.yrzx.changerequest;

import java.util.Map;



import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

public class ExampleChangeRequest implements ChangeRequestSpecFactory {

	@Override
	public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
		return builder 
				.change_request("show all type").zh_CN("数据类型展示")
				.icon("table")
				.has_field("field_display").value("只是显示").display()
				.has_field("field_text").zh_CN("短文本").which_type_of(FieldType.TEXT).with_style(UIStyle.INPUT_TEXT)
				.has_field("field_id_number").zh_CN("身份证").which_type_of(FieldType.TEXT)
					.range(15,18)
				.has_field("field_email").zh_CN("电子邮件").with_style(UIStyle.INPUT_EMAIL)
					.match("^(\\w)+(\\.\\w+)*@(\\w)+((\\.\\w+)+)$")
				.has_field("field_url").zh_CN("链接").with_style(UIStyle.INPUT_URL)
				.has_field("field_one_of").zh_CN("单选")
					.values_canbe("sport", "运动").or("sleep", "睡觉")
				.has_field("field_some_of").zh_CN("多选")
					.values_canbe("sport", "运动").and("reading", "阅读").and("music", "音乐").and("movie", "电影").and("game", "游戏")
				.has_field("field_longtext").zh_CN("长文本").which_type_of(FieldType.MULTI_TEXT)
				.has_field("field_boolean").zh_CN("布尔").which_type_of(FieldType.BOOLEAN)
				.has_field("field_images").zh_CN("多图").which_type_of(FieldType.IMAGES)
				.has_field("field_image").zh_CN("单图").which_type_of(FieldType.IMAGE)
				.has_field("field_date").zh_CN("日期").which_type_of(FieldType.DATE)
				.has_field("field_datetime").zh_CN("日期时间").which_type_of(FieldType.DATE_TIME)
				.has_field("field_time").zh_CN("时间").which_type_of(FieldType.TIME).with_style(UIStyle.INPUT_TEXT)
				.has_field("field_integer").zh_CN("整数").which_type_of(FieldType.INTEGER)
				.has_field("field_decimal").zh_CN("小数").which_type_of(FieldType.DECIMAL)
				.has_field("field_money").zh_CN("金融").which_type_of(FieldType.MONEY).range(100,10000)
				.has_field("field_biz_candidate").zh_CN("单选的对象").which_model_of("merchant")
					.values_can_select_from_query_by("field_integer")
			;
	}
}
