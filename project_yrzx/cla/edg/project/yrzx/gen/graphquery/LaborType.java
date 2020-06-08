package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LaborType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.labortype.LaborType";
	}
	// 枚举对象
	public static EnumAttribute ONE = new EnumAttribute("com.yrdec.yrzx.labortype.LaborType", "ONE");
	public static EnumAttribute TWO = new EnumAttribute("com.yrdec.yrzx.labortype.LaborType", "TWO");
	public static EnumAttribute THREE = new EnumAttribute("com.yrdec.yrzx.labortype.LaborType", "THREE");

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

	public LaborRecord laborRecordList() {
		LaborRecord member = new LaborRecord();
		member.setModelTypeName("labor_record");
		member.setName("type");
		member.setMemberName("laborRecordList");
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

