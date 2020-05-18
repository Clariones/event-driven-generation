package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class SpecialOfferPromotion extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.specialofferpromotion.SpecialOfferPromotion";
	}
	// 枚举对象
	public static EnumAttribute SHOP_ANNUAL_FEE = new EnumAttribute("com.terapico.moyi.specialofferpromotion.SpecialOfferPromotion", "SHOP_ANNUAL_FEE");

	// 引用的对象

	public PromotionConfiguration promotionConfiguration() {
		PromotionConfiguration member = new PromotionConfiguration();
		member.setModelTypeName("promotion_configuration");
		member.setName("promotion_configuration");
		member.setMemberName("promotionConfiguration");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象

	
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

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("code");
		useMember(member);
		return member;
	}

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("description");
		useMember(member);
		return member;
	}

	public NumberAttribute promotionAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("promotion_amount");
		useMember(member);
		return member;
	}

	public DateTimeAttribute startDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		member.setName("start_date");
		useMember(member);
		return member;
	}

	public DateTimeAttribute endDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		member.setName("end_date");
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

