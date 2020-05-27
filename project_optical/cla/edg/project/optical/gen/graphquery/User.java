package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class User extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.user.User";
	}
	// 枚举对象

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

	public ShippingAddress shippingAddressList() {
		ShippingAddress member = new ShippingAddress();
		member.setModelTypeName("shipping_address");
		member.setName("user");
		member.setMemberName("shippingAddressList");
		member.setRelationName("user");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public UserTryOnAvatar userTryOnAvatarList() {
		UserTryOnAvatar member = new UserTryOnAvatar();
		member.setModelTypeName("user_try_on_avatar");
		member.setName("user");
		member.setMemberName("userTryOnAvatarList");
		member.setRelationName("user");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public User3dTryOnVideo user3dTryOnVideoList() {
		User3dTryOnVideo member = new User3dTryOnVideo();
		member.setModelTypeName("user_3d_try_on_video");
		member.setName("user");
		member.setMemberName("user3dTryOnVideoList");
		member.setRelationName("user");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MainOrder mainOrderList() {
		MainOrder member = new MainOrder();
		member.setModelTypeName("main_order");
		member.setName("buyer");
		member.setMemberName("mainOrderList");
		member.setRelationName("buyer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PaymentDetail paymentDetailList() {
		PaymentDetail member = new PaymentDetail();
		member.setModelTypeName("payment_detail");
		member.setName("payer");
		member.setMemberName("paymentDetailList");
		member.setRelationName("payer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ShoppingCart shoppingCartList() {
		ShoppingCart member = new ShoppingCart();
		member.setModelTypeName("shopping_cart");
		member.setName("owner");
		member.setMemberName("shoppingCartList");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("name");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute mobile(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_china_mobile_phone");
		// member.setName("mobile");
		member.setName("mobile");
		useMember(member);
		return member;
	}

	public StringAttribute avatar(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("avatar");
		member.setName("avatar");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("createTime");
		member.setName("create_time");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		// member.setName("lastUpdateTime");
		member.setName("last_update_time");
		useMember(member);
		return member;
	}

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

