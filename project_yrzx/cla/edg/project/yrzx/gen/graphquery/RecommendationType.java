package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class RecommendationType extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.recommendationtype.RecommendationType";
  }
  // 枚举对象

  // 引用的对象

  public PlatformConfiguration platformConfiguration() {
    PlatformConfiguration member = new PlatformConfiguration();
    member.setModelTypeName("platform_configuration");
    member.setName("platform_configuration");
    member.setMemberName("platformConfiguration");
    member.setReferDirection(true);
    member.setRelationName("platformConfiguration");
    append(member);
    return member;
  }

  // 被引用的对象

  public Recommendation recommendationList() {
    Recommendation member = new Recommendation();
    member.setModelTypeName("recommendation");
    member.setName("type");
    member.setMemberName("recommendationList");
    member.setRelationName("type");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventApplyRecommendation eventApplyRecommendationList() {
    EventApplyRecommendation member = new EventApplyRecommendation();
    member.setModelTypeName("event_apply_recommendation");
    member.setName("recommendation_type");
    member.setMemberName("eventApplyRecommendationList");
    member.setRelationName("recommendationType");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  // 普通属性

  public StringAttribute id() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("id");
    member.setName("id");
    useMember(member);
    return member;
  }

  public StringAttribute name() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("name");
    member.setName("name");
    useMember(member);
    return member;
  }

  public StringAttribute code() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("code");
    member.setName("code");
    useMember(member);
    return member;
  }

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
