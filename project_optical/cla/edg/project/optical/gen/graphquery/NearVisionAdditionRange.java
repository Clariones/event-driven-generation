package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class NearVisionAdditionRange extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.nearvisionadditionrange.NearVisionAdditionRange";
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
		member.setName("near_vision_addition_range");
		member.setMemberName("lensList");
		member.setRelationName("nearVisionAdditionRange");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

