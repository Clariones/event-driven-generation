package cla.edg.project.yrcms.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PlatformConfiguration extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrcms.platformconfiguration.PlatformConfiguration";
  }
  // 枚举对象

  // 引用的对象

  public Platform platform() {
    Platform member = new Platform();
    member.setModelTypeName("platform");
    member.setName("platform");
    member.setMemberName("platform");
    member.setReferDirection(true);
    member.setRelationName("platform");
    append(member);
    return member;
  }

  // 被引用的对象

  public IconConfiguration iconConfigurationList() {
    IconConfiguration member = new IconConfiguration();
    member.setModelTypeName("icon_configuration");
    member.setName("platform_configuration");
    member.setMemberName("iconConfigurationList");
    member.setRelationName("platformConfiguration");
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

  public StringAttribute homepageActionBackground() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("homepageActionBackground");
    member.setName("homepage_action_background");
    useMember(member);
    return member;
  }

  public StringAttribute defaultServiceFeeImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("defaultServiceFeeImage");
    member.setName("default_service_fee_image");
    useMember(member);
    return member;
  }

  public StringAttribute defaultProjectFeeImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("defaultProjectFeeImage");
    member.setName("default_project_fee_image");
    useMember(member);
    return member;
  }

  public StringAttribute defaultTaskFeeImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("defaultTaskFeeImage");
    member.setName("default_task_fee_image");
    useMember(member);
    return member;
  }

  public StringAttribute defaultFineImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("defaultFineImage");
    member.setName("default_fine_image");
    useMember(member);
    return member;
  }

  public StringAttribute defaultMerchantImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("defaultMerchantImage");
    member.setName("default_merchant_image");
    useMember(member);
    return member;
  }

  public StringAttribute defaultLogoImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("defaultLogoImage");
    member.setName("default_logo_image");
    useMember(member);
    return member;
  }

  public DateTimeAttribute createTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("createTime");
    member.setName("create_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute lastUpdateTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_update");
    // member.setName("lastUpdateTime");
    member.setName("last_update_time");
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
