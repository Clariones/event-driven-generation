package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CompensationResultStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.compensationresultstatus.CompensationResultStatus";
	}
	// 枚举对象
	public static EnumAttribute UNPAID = new EnumAttribute("com.yrdec.yrzx.compensationresultstatus.CompensationResultStatus", "UNPAID");
	public static EnumAttribute PAID = new EnumAttribute("com.yrdec.yrzx.compensationresultstatus.CompensationResultStatus", "PAID");

	// 引用的对象

	// 被引用的对象

	public CompensationResult compensationResultList() {
		CompensationResult member = new CompensationResult();
		member.setModelTypeName("compensation_result");
		member.setName("status");
		member.setMemberName("compensationResultList");
		member.setRelationName("status");
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

