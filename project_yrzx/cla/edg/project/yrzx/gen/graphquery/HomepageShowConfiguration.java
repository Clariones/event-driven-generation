package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class HomepageShowConfiguration extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.homepageshowconfiguration.HomepageShowConfiguration";
	}
	// 枚举对象

	// 引用的对象

	public HomepageShowType showType() {
		HomepageShowType member = new HomepageShowType();
		member.setModelTypeName("homepage_show_type");
		member.setName("show_type");
		member.setMemberName("showType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public PlatformConfiguration platformConfiguration() {
		PlatformConfiguration member = new PlatformConfiguration();
		member.setModelTypeName("platform_configuration");
		member.setName("platform_configuration");
		member.setMemberName("platformConfiguration");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public HomepageSlide homepageSlideList() {
		HomepageSlide member = new HomepageSlide();
		member.setModelTypeName("homepage_slide");
		member.setName("show_in");
		member.setMemberName("homepageSlideList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WelcomeSlide welcomeSlideList() {
		WelcomeSlide member = new WelcomeSlide();
		member.setModelTypeName("welcome_slide");
		member.setName("show_in");
		member.setMemberName("welcomeSlideList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public HomepageMarketingBlock homepageMarketingBlockList() {
		HomepageMarketingBlock member = new HomepageMarketingBlock();
		member.setModelTypeName("homepage_marketing_block");
		member.setName("show_in");
		member.setMemberName("homepageMarketingBlockList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public HomepageArticleGroup homepageArticleGroupList() {
		HomepageArticleGroup member = new HomepageArticleGroup();
		member.setModelTypeName("homepage_article_group");
		member.setName("show_in");
		member.setMemberName("homepageArticleGroupList");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
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

