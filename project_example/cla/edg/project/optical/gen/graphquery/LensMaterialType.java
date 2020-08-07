package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LensMaterialType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.lensmaterialtype.LensMaterialType";
  }
  // 枚举对象
  public static EnumAttribute PLASTIC =
      new EnumAttribute("com.doublechaintech.optical.lensmaterialtype.LensMaterialType", "PLASTIC");
  public static EnumAttribute GLASSES =
      new EnumAttribute("com.doublechaintech.optical.lensmaterialtype.LensMaterialType", "GLASSES");

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

  public Lens lensList() {
    Lens member = new Lens();
    member.setModelTypeName("lens");
    member.setName("lens_material_type");
    member.setMemberName("lensList");
    member.setRelationName("lensMaterialType");
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
