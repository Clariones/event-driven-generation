package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class OriginalEvidenceRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.originalevidencerecord.OriginalEvidenceRecord";
	}
	// 枚举对象

	// 引用的对象

	public PaymentItem paymentItem() {
		PaymentItem member = new PaymentItem();
		member.setModelTypeName("payment_item");
		member.setName("payment_item");
		member.setMemberName("paymentItem");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public GenericAccountBook payerAccount() {
		GenericAccountBook member = new GenericAccountBook();
		member.setModelTypeName("generic_account_book");
		member.setName("payer_account");
		member.setMemberName("payerAccount");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public EmployeeNomination confirmerEmployee() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("confirmer_employee");
		member.setMemberName("confirmerEmployee");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant confirmerMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("confirmer_merchant");
		member.setMemberName("confirmerMerchant");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute summary(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("summary");
		useMember(member);
		return member;
	}

	public StringAttribute image1(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image1");
		useMember(member);
		return member;
	}

	public StringAttribute image2(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image2");
		useMember(member);
		return member;
	}

	public StringAttribute image3(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image3");
		useMember(member);
		return member;
	}

	public BooleanAttribute confirmed(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("confirmed");
		useMember(member);
		return member;
	}

	public NumberAttribute confirmedAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("confirmedAmount");
		useMember(member);
		return member;
	}

	public StringAttribute comments(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("comments");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("createTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		member.setName("lastUpdateTime");
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

