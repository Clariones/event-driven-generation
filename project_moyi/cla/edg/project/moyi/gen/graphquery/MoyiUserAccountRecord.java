package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MoyiUserAccountRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.moyiuseraccountrecord.MoyiUserAccountRecord";
  }
  // 枚举对象

  // 引用的对象

  public MoyiUserAccount moyiUserAccount() {
    MoyiUserAccount member = new MoyiUserAccount();
    member.setModelTypeName("moyi_user_account");
    member.setName("moyi_user_account");
    member.setMemberName("moyiUserAccount");
    member.setReferDirection(true);
    member.setRelationName("moyiUserAccount");
    append(member);
    return member;
  }

  public FundsVariationType variationType() {
    FundsVariationType member = new FundsVariationType();
    member.setModelTypeName("funds_variation_type");
    member.setName("variation_type");
    member.setMemberName("variationType");
    member.setReferDirection(true);
    member.setRelationName("variationType");
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

  public StringAttribute summary() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("summary");
    member.setName("summary");
    useMember(member);
    return member;
  }

  public NumberAttribute amount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("amount");
    member.setName("amount");
    useMember(member);
    return member;
  }

  public NumberAttribute availableBalance() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("availableBalance");
    member.setName("available_balance");
    useMember(member);
    return member;
  }

  public NumberAttribute frozenBalance() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("frozenBalance");
    member.setName("frozen_balance");
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
