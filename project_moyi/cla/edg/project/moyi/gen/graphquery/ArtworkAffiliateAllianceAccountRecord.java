package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ArtworkAffiliateAllianceAccountRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.artworkaffiliateallianceaccountrecord.ArtworkAffiliateAllianceAccountRecord";
  }
  // 枚举对象

  // 引用的对象

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

  public ArtworkAffiliateAllianceAccount account() {
    ArtworkAffiliateAllianceAccount member = new ArtworkAffiliateAllianceAccount();
    member.setModelTypeName("artwork_affiliate_alliance_account");
    member.setName("account");
    member.setMemberName("account");
    member.setReferDirection(true);
    member.setRelationName("account");
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

  public NumberAttribute balance() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("balance");
    member.setName("balance");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
