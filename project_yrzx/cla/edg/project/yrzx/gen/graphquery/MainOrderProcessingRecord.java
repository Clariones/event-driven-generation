package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MainOrderProcessingRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.mainorderprocessingrecord.MainOrderProcessingRecord";
	}
	// 枚举对象

	// 引用的对象

	public OrderStatus status() {
		OrderStatus member = new OrderStatus();
		member.setModelTypeName("order_status");
		member.setName("status");
		member.setMemberName("status");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant operatorMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("operator_merchant");
		member.setMemberName("operatorMerchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public EmployeeNomination operatorEmployee() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("operator_employee");
		member.setMemberName("operatorEmployee");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public CommonEventRecord eventSource() {
		CommonEventRecord member = new CommonEventRecord();
		member.setModelTypeName("common_event_record");
		member.setName("event_source");
		member.setMemberName("eventSource");
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

	public StringAttribute brief(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("brief");
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

	public StringAttribute mainOrder(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("mainOrder");
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

