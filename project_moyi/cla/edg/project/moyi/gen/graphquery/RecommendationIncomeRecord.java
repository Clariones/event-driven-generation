package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class RecommendationIncomeRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.recommendationincomerecord.RecommendationIncomeRecord";
  }
  // 枚举对象

  // 引用的对象

  public MoyiUser referee() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("referee");
    member.setMemberName("referee");
    member.setReferDirection(true);
    member.setRelationName("referee");
    append(member);
    return member;
  }

  public ArtworkAuction auction() {
    ArtworkAuction member = new ArtworkAuction();
    member.setModelTypeName("artwork_auction");
    member.setName("auction");
    member.setMemberName("auction");
    member.setReferDirection(true);
    member.setRelationName("auction");
    append(member);
    return member;
  }

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

  // 普通属性

  public StringAttribute id() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("id");
    member.setName("id");
    useMember(member);
    return member;
  }

  public NumberAttribute income() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("income");
    member.setName("income");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
