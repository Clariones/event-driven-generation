package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PrismRangeAndDirection extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.prismrangeanddirection.PrismRangeAndDirection";
	}
	// 枚举对象

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

	public Lens lensList() {
		Lens member = new Lens();
		member.setModelTypeName("lens");
		member.setName("prism_range_and_direction");
		member.setMemberName("lensList");
		member.setRelationName("prismRangeAndDirection");
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

	public NumberAttribute maxValue(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		// member.setName("maxValue");
		member.setName("max_value");
		useMember(member);
		return member;
	}

	public NumberAttribute minValue(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		// member.setName("minValue");
		member.setName("min_value");
		useMember(member);
		return member;
	}

	public BooleanAttribute prismBaseDirectionUp(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("prismBaseDirectionUp");
		member.setName("prism_base_direction_up");
		useMember(member);
		return member;
	}

	public BooleanAttribute prismBaseDirectionDown(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("prismBaseDirectionDown");
		member.setName("prism_base_direction_down");
		useMember(member);
		return member;
	}

	public BooleanAttribute prismBaseDirectionIn(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("prismBaseDirectionIn");
		member.setName("prism_base_direction_in");
		useMember(member);
		return member;
	}

	public BooleanAttribute prismBaseDirectionOut(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("prismBaseDirectionOut");
		member.setName("prism_base_direction_out");
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

