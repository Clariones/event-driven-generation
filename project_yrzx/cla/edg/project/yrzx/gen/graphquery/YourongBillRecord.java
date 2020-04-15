package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class YourongBillRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.yourongbillrecord.YourongBillRecord";
	}
	// 枚举对象

	// 引用的对象

	public YourongBill bill() {
		YourongBill member = new YourongBill();
		member.setModelTypeName("yourong_bill");
		member.setName("bill");
		member.setMemberName("bill");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public BillStatus billStatus() {
		BillStatus member = new BillStatus();
		member.setModelTypeName("bill_status");
		member.setName("bill_status");
		member.setMemberName("billStatus");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public EmployeeNomination operationEmployee() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("operation_employee");
		member.setMemberName("operationEmployee");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public CommonEventRecord sourceEvent() {
		CommonEventRecord member = new CommonEventRecord();
		member.setModelTypeName("common_event_record");
		member.setName("source_event");
		member.setMemberName("sourceEvent");
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

	public StringAttribute detail(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("detail");
		useMember(member);
		return member;
	}

	public StringAttribute proofImage1(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("proofImage1");
		useMember(member);
		return member;
	}

	public StringAttribute proofImage2(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("proofImage2");
		useMember(member);
		return member;
	}

	public StringAttribute proofImage3(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("proofImage3");
		useMember(member);
		return member;
	}

	public StringAttribute proofImage4(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("proofImage4");
		useMember(member);
		return member;
	}

	public StringAttribute proofImage5(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("proofImage5");
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

