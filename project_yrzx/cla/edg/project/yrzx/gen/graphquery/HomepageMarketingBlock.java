package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class HomepageMarketingBlock extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.homepagemarketingblock.HomepageMarketingBlock";
	}
	// 枚举对象

	// 引用的对象

	public HomepageShowType homepageShowType() {
		HomepageShowType member = new HomepageShowType();
		member.setModelTypeName("homepage_show_type");
		member.setName("homepage_show_type");
		member.setMemberName("homepageShowType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public HomepageShowConfiguration showIn() {
		HomepageShowConfiguration member = new HomepageShowConfiguration();
		member.setModelTypeName("homepage_show_configuration");
		member.setName("show_in");
		member.setMemberName("showIn");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("code");
		useMember(member);
		return member;
	}

	public StringAttribute coverImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("coverImage");
		useMember(member);
		return member;
	}

	public NumberAttribute displayOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("displayOrder");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("createTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		member.setName("lastUpdateTime");
		useMember(member);
		return member;
	}

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

