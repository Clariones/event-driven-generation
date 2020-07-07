package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MoyiExperienceRule extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.moyiexperiencerule.MoyiExperienceRule";
  }
  // 枚举对象
  public static EnumAttribute REGISTRATION =
      new EnumAttribute("com.terapico.moyi.moyiexperiencerule.MoyiExperienceRule", "REGISTRATION");
  public static EnumAttribute INVITATION =
      new EnumAttribute("com.terapico.moyi.moyiexperiencerule.MoyiExperienceRule", "INVITATION");
  public static EnumAttribute SIGN_IN =
      new EnumAttribute("com.terapico.moyi.moyiexperiencerule.MoyiExperienceRule", "SIGN_IN");
  public static EnumAttribute CHECK_IN =
      new EnumAttribute("com.terapico.moyi.moyiexperiencerule.MoyiExperienceRule", "CHECK_IN");
  public static EnumAttribute POST_ARTICLE =
      new EnumAttribute("com.terapico.moyi.moyiexperiencerule.MoyiExperienceRule", "POST_ARTICLE");
  public static EnumAttribute POST_ARTWORK =
      new EnumAttribute("com.terapico.moyi.moyiexperiencerule.MoyiExperienceRule", "POST_ARTWORK");
  public static EnumAttribute POST_ARTWORK_REVIEW =
      new EnumAttribute(
          "com.terapico.moyi.moyiexperiencerule.MoyiExperienceRule", "POST_ARTWORK_REVIEW");
  public static EnumAttribute POST_REVIEW =
      new EnumAttribute("com.terapico.moyi.moyiexperiencerule.MoyiExperienceRule", "POST_REVIEW");
  public static EnumAttribute ELITE_ARTICLE =
      new EnumAttribute("com.terapico.moyi.moyiexperiencerule.MoyiExperienceRule", "ELITE_ARTICLE");
  public static EnumAttribute POST_LIKED =
      new EnumAttribute("com.terapico.moyi.moyiexperiencerule.MoyiExperienceRule", "POST_LIKED");
  public static EnumAttribute RENDER_ARTWORK =
      new EnumAttribute(
          "com.terapico.moyi.moyiexperiencerule.MoyiExperienceRule", "RENDER_ARTWORK");
  public static EnumAttribute RENDER_ARTICLE =
      new EnumAttribute(
          "com.terapico.moyi.moyiexperiencerule.MoyiExperienceRule", "RENDER_ARTICLE");
  public static EnumAttribute SHARE_CONTENT =
      new EnumAttribute("com.terapico.moyi.moyiexperiencerule.MoyiExperienceRule", "SHARE_CONTENT");

  // 引用的对象

  public Moyi moyi() {
    Moyi member = new Moyi();
    member.setModelTypeName("moyi");
    member.setName("moyi");
    member.setMemberName("moyi");
    member.setReferDirection(true);
    member.setRelationName("moyi");
    append(member);
    return member;
  }

  // 被引用的对象

  public MoyiExperienceRecord moyiExperienceRecordList() {
    MoyiExperienceRecord member = new MoyiExperienceRecord();
    member.setModelTypeName("moyi_experience_record");
    member.setName("applied_rule");
    member.setMemberName("moyiExperienceRecordList");
    member.setRelationName("appliedRule");
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

  public StringAttribute description() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("description");
    member.setName("description");
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

  public NumberAttribute pointValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("pointValue");
    member.setName("point_value");
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
