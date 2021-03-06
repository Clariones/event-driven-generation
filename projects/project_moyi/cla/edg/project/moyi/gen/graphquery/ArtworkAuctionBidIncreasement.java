package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ArtworkAuctionBidIncreasement extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.artworkauctionbidincreasement.ArtworkAuctionBidIncreasement";
  }
  // 枚举对象

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

  // 普通属性

  public StringAttribute id() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("id");
    member.setName("id");
    useMember(member);
    return member;
  }

  public NumberAttribute priceVolume() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("priceVolume");
    member.setName("price_volume");
    useMember(member);
    return member;
  }

  public NumberAttribute increasement() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("increasement");
    member.setName("increasement");
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
