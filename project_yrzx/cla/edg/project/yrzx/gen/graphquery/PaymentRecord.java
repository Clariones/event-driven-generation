package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PaymentRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.paymentrecord.PaymentRecord";
	}
	// 枚举对象

	// 引用的对象

	public CommonEventRecord sourceEvent() {
		CommonEventRecord member = new CommonEventRecord();
		member.setModelTypeName("common_event_record");
		member.setName("source_event");
		member.setMemberName("sourceEvent");
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
	
	public PaymentItemRecord paymentItemRecordList() {
		PaymentItemRecord member = new PaymentItemRecord();
		member.setModelTypeName("payment_item_record");
		member.setName("payment_record");
		member.setMemberName("paymentItemRecordList");
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

	public StringAttribute summary(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("summary");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

