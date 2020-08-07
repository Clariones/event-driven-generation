package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Sku extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.sku.Sku";
  }
  // 枚举对象

  // 引用的对象

  public FrameColor color() {
    FrameColor member = new FrameColor();
    member.setModelTypeName("frame_color");
    member.setName("color");
    member.setMemberName("color");
    member.setReferDirection(true);
    member.setRelationName("color");
    append(member);
    return member;
  }

  public ProductType productType() {
    ProductType member = new ProductType();
    member.setModelTypeName("product_type");
    member.setName("product_type");
    member.setMemberName("productType");
    member.setReferDirection(true);
    member.setRelationName("productType");
    append(member);
    return member;
  }

  public PrescriptionSku prescriptionSku() {
    PrescriptionSku member = new PrescriptionSku();
    member.setModelTypeName("prescription_sku");
    member.setName("prescription_sku");
    member.setMemberName("prescriptionSku");
    member.setReferDirection(true);
    member.setRelationName("prescriptionSku");
    append(member);
    return member;
  }

  public StandardSku standardSku() {
    StandardSku member = new StandardSku();
    member.setModelTypeName("standard_sku");
    member.setName("standard_sku");
    member.setMemberName("standardSku");
    member.setReferDirection(true);
    member.setRelationName("standardSku");
    append(member);
    return member;
  }

  public ClipOn clipOnSku() {
    ClipOn member = new ClipOn();
    member.setModelTypeName("clip_on");
    member.setName("clip_on_sku");
    member.setMemberName("clipOnSku");
    member.setReferDirection(true);
    member.setRelationName("clipOnSku");
    append(member);
    return member;
  }

  public Product product() {
    Product member = new Product();
    member.setModelTypeName("product");
    member.setName("product");
    member.setMemberName("product");
    member.setReferDirection(true);
    member.setRelationName("product");
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

  public UserTryOnAvatar userTryOnAvatarList() {
    UserTryOnAvatar member = new UserTryOnAvatar();
    member.setModelTypeName("user_try_on_avatar");
    member.setName("try_on_glasses");
    member.setMemberName("userTryOnAvatarList");
    member.setRelationName("tryOnGlasses");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public User3dTryOnVideo user3dTryOnVideoList() {
    User3dTryOnVideo member = new User3dTryOnVideo();
    member.setModelTypeName("user_3d_try_on_video");
    member.setName("try_on_glasses");
    member.setMemberName("user3dTryOnVideoList");
    member.setRelationName("tryOnGlasses");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SkuInventory skuInventoryList() {
    SkuInventory member = new SkuInventory();
    member.setModelTypeName("sku_inventory");
    member.setName("sku");
    member.setMemberName("skuInventoryList");
    member.setRelationName("sku");
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

  public StringAttribute description() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("description");
    member.setName("description");
    useMember(member);
    return member;
  }

  public StringAttribute image1() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("image1");
    member.setName("image1");
    useMember(member);
    return member;
  }

  public StringAttribute image2() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("image2");
    member.setName("image2");
    useMember(member);
    return member;
  }

  public StringAttribute image3() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("image3");
    member.setName("image3");
    useMember(member);
    return member;
  }

  public StringAttribute image4() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("image4");
    member.setName("image4");
    useMember(member);
    return member;
  }

  public StringAttribute image5() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("image5");
    member.setName("image5");
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
