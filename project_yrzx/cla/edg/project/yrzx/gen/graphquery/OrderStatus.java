package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class OrderStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.orderstatus.OrderStatus";
	}
	// 枚举对象

	// 引用的对象

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public MainOrder mainOrderList() {
		MainOrder member = new MainOrder();
		member.setModelTypeName("main_order");
		member.setName("status");
		member.setMemberName("mainOrderList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MainOrderProcessingRecord mainOrderProcessingRecordList() {
		MainOrderProcessingRecord member = new MainOrderProcessingRecord();
		member.setModelTypeName("main_order_processing_record");
		member.setName("status");
		member.setMemberName("mainOrderProcessingRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TaskOrder taskOrderList() {
		TaskOrder member = new TaskOrder();
		member.setModelTypeName("task_order");
		member.setName("status");
		member.setMemberName("taskOrderList");
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

