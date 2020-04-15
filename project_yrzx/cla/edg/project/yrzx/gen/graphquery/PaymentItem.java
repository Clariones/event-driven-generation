package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PaymentItem extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.paymentitem.PaymentItem";
	}
	// 枚举对象

	// 引用的对象

	public PaymentOption paymentOption() {
		PaymentOption member = new PaymentOption();
		member.setModelTypeName("payment_option");
		member.setName("payment_option");
		member.setMemberName("paymentOption");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public PaymentDetail paymentDetail() {
		PaymentDetail member = new PaymentDetail();
		member.setModelTypeName("payment_detail");
		member.setName("payment_detail");
		member.setMemberName("paymentDetail");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public OriginalEvidenceRecord originalEvidenceRecordList() {
		OriginalEvidenceRecord member = new OriginalEvidenceRecord();
		member.setModelTypeName("original_evidence_record");
		member.setName("payment_item");
		member.setMemberName("originalEvidenceRecordList");
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

	public NumberAttribute amount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("amount");
		useMember(member);
		return member;
	}

	public StringAttribute detail(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("detail");
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

