package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class RecommendationType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.recommendationtype.RecommendationType";
	}
	// 枚举对象
	public static EnumAttribute PROJECT = new EnumAttribute("com.yrdec.yrzx.recommendationtype.RecommendationType", "PROJECT");
	public static EnumAttribute VENDOR = new EnumAttribute("com.yrdec.yrzx.recommendationtype.RecommendationType", "VENDOR");
	public static EnumAttribute DESINER = new EnumAttribute("com.yrdec.yrzx.recommendationtype.RecommendationType", "DESINER");
	public static EnumAttribute PRODUCT = new EnumAttribute("com.yrdec.yrzx.recommendationtype.RecommendationType", "PRODUCT");
	public static EnumAttribute IP = new EnumAttribute("com.yrdec.yrzx.recommendationtype.RecommendationType", "IP");
	public static EnumAttribute TECH = new EnumAttribute("com.yrdec.yrzx.recommendationtype.RecommendationType", "TECH");
	public static EnumAttribute PARTNER = new EnumAttribute("com.yrdec.yrzx.recommendationtype.RecommendationType", "PARTNER");
	public static EnumAttribute OTHER = new EnumAttribute("com.yrdec.yrzx.recommendationtype.RecommendationType", "OTHER");

	// 引用的对象

	public PlatformConfiguration platformConfiguration() {
		PlatformConfiguration member = new PlatformConfiguration();
		member.setModelTypeName("platform_configuration");
		member.setName("platform_configuration");
		member.setMemberName("platformConfiguration");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public Recommendation recommendationListAsType() {
		Recommendation member = new Recommendation();
		member.setModelTypeName("recommendation");
		member.setName("type");
		member.setMemberName("recommendationListAsType");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Recommendation recommendationListAsRecommendationType() {
		Recommendation member = new Recommendation();
		member.setModelTypeName("recommendation");
		member.setName("recommendation_type");
		member.setMemberName("recommendationListAsRecommendationType");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EventApplyRecommendation eventApplyRecommendationList() {
		EventApplyRecommendation member = new EventApplyRecommendation();
		member.setModelTypeName("event_apply_recommendation");
		member.setName("recommendation_type");
		member.setMemberName("eventApplyRecommendationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("name");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("code");
		member.setName("code");
		useMember(member);
		return member;
	}

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

