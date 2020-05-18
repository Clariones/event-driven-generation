package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class PromotionConfiguration extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.promotionconfiguration.PromotionConfiguration";
	}
	// 枚举对象

	// 引用的对象

	public Moyi moyi() {
		Moyi member = new Moyi();
		member.setModelTypeName("moyi");
		member.setName("moyi");
		member.setMemberName("moyi");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public DiscountByVolumePromotion discountByVolumePromotionList() {
		DiscountByVolumePromotion member = new DiscountByVolumePromotion();
		member.setModelTypeName("discount_by_volume_promotion");
		member.setName("promotion_configuration");
		member.setMemberName("discountByVolumePromotionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public SpecialOfferPromotion specialOfferPromotionList() {
		SpecialOfferPromotion member = new SpecialOfferPromotion();
		member.setModelTypeName("special_offer_promotion");
		member.setName("promotion_configuration");
		member.setMemberName("specialOfferPromotionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
		useMember(member);
		return member;
	}

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

