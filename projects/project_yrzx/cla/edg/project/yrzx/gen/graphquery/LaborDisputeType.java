package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LaborDisputeType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.labordisputetype.LaborDisputeType";
	}
	// 枚举对象
	public static EnumAttribute ONE = new EnumAttribute("com.yrdec.yrzx.labordisputetype.LaborDisputeType", "ONE");
	public static EnumAttribute TWO = new EnumAttribute("com.yrdec.yrzx.labordisputetype.LaborDisputeType", "TWO");
	public static EnumAttribute THREE = new EnumAttribute("com.yrdec.yrzx.labordisputetype.LaborDisputeType", "THREE");

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

	public LaborDispute laborDisputeList() {
		LaborDispute member = new LaborDispute();
		member.setModelTypeName("labor_dispute");
		member.setName("type");
		member.setMemberName("laborDisputeList");
		member.setRelationName("type");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventLaborDispute eventLaborDisputeList() {
		EventLaborDispute member = new EventLaborDispute();
		member.setModelTypeName("event_labor_dispute");
		member.setName("type");
		member.setMemberName("eventLaborDisputeList");
		member.setRelationName("type");
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

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("code");
		member.setName("code");
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

