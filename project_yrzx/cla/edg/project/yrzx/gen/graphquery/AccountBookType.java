package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class AccountBookType extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.accountbooktype.AccountBookType";
  }
  // 枚举对象
  public static EnumAttribute CASH =
      new EnumAttribute("com.yrdec.yrzx.accountbooktype.AccountBookType", "CASH");
  public static EnumAttribute RECEIVABLE =
      new EnumAttribute("com.yrdec.yrzx.accountbooktype.AccountBookType", "RECEIVABLE");
  public static EnumAttribute PAYABLE =
      new EnumAttribute("com.yrdec.yrzx.accountbooktype.AccountBookType", "PAYABLE");
  public static EnumAttribute LOAN =
      new EnumAttribute("com.yrdec.yrzx.accountbooktype.AccountBookType", "LOAN");
  public static EnumAttribute FIXED =
      new EnumAttribute("com.yrdec.yrzx.accountbooktype.AccountBookType", "FIXED");

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

  public AccountBook accountBookList() {
    AccountBook member = new AccountBook();
    member.setModelTypeName("account_book");
    member.setName("type");
    member.setMemberName("accountBookList");
    member.setRelationName("type");
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

  public StringAttribute icon() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("icon");
    member.setName("icon");
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
