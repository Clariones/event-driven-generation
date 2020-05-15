package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class PaymentMethod extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.paymentmethod.PaymentMethod";
	}
	// 枚举对象
	public static EnumAttribute WECHAT_PAY = new EnumAttribute("com.terapico.moyi.paymentmethod.PaymentMethod", "WECHAT_PAY");
	public static EnumAttribute WECHAT_AGENCY = new EnumAttribute("com.terapico.moyi.paymentmethod.PaymentMethod", "WECHAT_AGENCY");
	public static EnumAttribute IB = new EnumAttribute("com.terapico.moyi.paymentmethod.PaymentMethod", "IB");
	public static EnumAttribute BALANCE = new EnumAttribute("com.terapico.moyi.paymentmethod.PaymentMethod", "BALANCE");
	public static EnumAttribute CITIC_EBUTLER = new EnumAttribute("com.terapico.moyi.paymentmethod.PaymentMethod", "CITIC_EBUTLER");
	public static EnumAttribute BUY_IB_AUTO = new EnumAttribute("com.terapico.moyi.paymentmethod.PaymentMethod", "BUY_IB_AUTO");
	public static EnumAttribute PAY_IB_AUTO = new EnumAttribute("com.terapico.moyi.paymentmethod.PaymentMethod", "PAY_IB_AUTO");
	public static EnumAttribute ALI_PAY = new EnumAttribute("com.terapico.moyi.paymentmethod.PaymentMethod", "ALI_PAY");

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
	
	public PaymentLineItem paymentLineItemList() {
		PaymentLineItem member = new PaymentLineItem();
		member.setModelTypeName("payment_line_item");
		member.setName("payment_method");
		member.setMemberName("paymentLineItemList");
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

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("code");
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

