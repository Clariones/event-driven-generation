package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class HorizontalBaseDirection extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.horizontalbasedirection.HorizontalBaseDirection";
	}
	// 枚举对象
	public static EnumAttribute IN = new EnumAttribute("com.doublechaintech.optical.horizontalbasedirection.HorizontalBaseDirection", "IN");
	public static EnumAttribute OUT = new EnumAttribute("com.doublechaintech.optical.horizontalbasedirection.HorizontalBaseDirection", "OUT");

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

	public Prescription prescriptionListAsRightPrismHorizontalBaseDirection() {
		Prescription member = new Prescription();
		member.setModelTypeName("prescription");
		member.setName("right_prism_horizontal_base_direction");
		member.setMemberName("prescriptionListAsRightPrismHorizontalBaseDirection");
		member.setRelationName("rightPrismHorizontalBaseDirection");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Prescription prescriptionListAsLeftPrismHorizontalBaseDirection() {
		Prescription member = new Prescription();
		member.setModelTypeName("prescription");
		member.setName("left_prism_horizontal_base_direction");
		member.setMemberName("prescriptionListAsLeftPrismHorizontalBaseDirection");
		member.setRelationName("rightPrismHorizontalBaseDirection");
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

