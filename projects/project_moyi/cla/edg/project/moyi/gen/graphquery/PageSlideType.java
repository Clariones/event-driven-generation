package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PageSlideType extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.pageslidetype.PageSlideType";
  }
  // 枚举对象
  public static EnumAttribute ARTWORK =
      new EnumAttribute("com.terapico.moyi.pageslidetype.PageSlideType", "ARTWORK");
  public static EnumAttribute ARTICLE =
      new EnumAttribute("com.terapico.moyi.pageslidetype.PageSlideType", "ARTICLE");
  public static EnumAttribute AUCTION =
      new EnumAttribute("com.terapico.moyi.pageslidetype.PageSlideType", "AUCTION");
  public static EnumAttribute SHOP =
      new EnumAttribute("com.terapico.moyi.pageslidetype.PageSlideType", "SHOP");
  public static EnumAttribute ARTIST =
      new EnumAttribute("com.terapico.moyi.pageslidetype.PageSlideType", "ARTIST");
  public static EnumAttribute H5 =
      new EnumAttribute("com.terapico.moyi.pageslidetype.PageSlideType", "H5");
  public static EnumAttribute IMAGE =
      new EnumAttribute("com.terapico.moyi.pageslidetype.PageSlideType", "IMAGE");
  public static EnumAttribute VIDEO =
      new EnumAttribute("com.terapico.moyi.pageslidetype.PageSlideType", "VIDEO");

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

  public PageSlide pageSlideList() {
    PageSlide member = new PageSlide();
    member.setModelTypeName("page_slide");
    member.setName("slide_type");
    member.setMemberName("pageSlideList");
    member.setRelationName("slideType");
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
