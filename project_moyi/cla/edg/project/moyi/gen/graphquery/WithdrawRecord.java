package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class WithdrawRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.withdrawrecord.WithdrawRecord";
  }
  // 枚举对象

  // 引用的对象

  public WithdrawStatus status() {
    WithdrawStatus member = new WithdrawStatus();
    member.setModelTypeName("withdraw_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
    append(member);
    return member;
  }

  public MoyiUser moyiUser() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("moyi_user");
    member.setMemberName("moyiUser");
    member.setReferDirection(true);
    member.setRelationName("moyiUser");
    append(member);
    return member;
  }

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

  public NumberAttribute amount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("amount");
    member.setName("amount");
    useMember(member);
    return member;
  }

  public NumberAttribute estimateFee() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("estimateFee");
    member.setName("estimate_fee");
    useMember(member);
    return member;
  }

  public NumberAttribute estimatePaidAmount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("estimatePaidAmount");
    member.setName("estimate_paid_amount");
    useMember(member);
    return member;
  }

  public StringAttribute receivingAccount() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("receivingAccount");
    member.setName("receiving_account");
    useMember(member);
    return member;
  }

  public StringAttribute receivingBankSiteName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("receivingBankSiteName");
    member.setName("receiving_bank_site_name");
    useMember(member);
    return member;
  }

  public StringAttribute receivingAccountName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("receivingAccountName");
    member.setName("receiving_account_name");
    useMember(member);
    return member;
  }

  public StringAttribute receivingAccountMobile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_china_mobile_phone");
    // member.setName("receivingAccountMobile");
    member.setName("receiving_account_mobile");
    useMember(member);
    return member;
  }

  public StringAttribute postscript() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("postscript");
    member.setName("postscript");
    useMember(member);
    return member;
  }

  public StringAttribute comments() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("comments");
    member.setName("comments");
    useMember(member);
    return member;
  }

  public StringAttribute paymentMethod() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("paymentMethod");
    member.setName("payment_method");
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

  public DateTimeAttribute acceptTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("acceptTime");
    member.setName("accept_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute finishTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("finishTime");
    member.setName("finish_time");
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
