package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CandidateTalent extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.candidatetalent.CandidateTalent";
  }
  // 枚举对象

  // 引用的对象

  public JobPosition jobPosition() {
    JobPosition member = new JobPosition();
    member.setModelTypeName("job_position");
    member.setName("job_position");
    member.setMemberName("jobPosition");
    member.setReferDirection(true);
    member.setRelationName("jobPosition");
    append(member);
    return member;
  }

  public Merchant candidate() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("candidate");
    member.setMemberName("candidate");
    member.setReferDirection(true);
    member.setRelationName("candidate");
    append(member);
    return member;
  }

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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
