package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventSelectLoanApplication extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventselectloanapplication.EventSelectLoanApplication";
  }
  // 枚举对象

  // 引用的对象

  public HelpApplication loanApplication() {
    HelpApplication member = new HelpApplication();
    member.setModelTypeName("help_application");
    member.setName("loan_application");
    member.setMemberName("loanApplication");
    member.setReferDirection(true);
    member.setRelationName("loanApplication");
    append(member);
    return member;
  }

  public ChangeRequest changeRequest() {
    ChangeRequest member = new ChangeRequest();
    member.setModelTypeName("change_request");
    member.setName("change_request");
    member.setMemberName("changeRequest");
    member.setReferDirection(true);
    member.setRelationName("changeRequest");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
