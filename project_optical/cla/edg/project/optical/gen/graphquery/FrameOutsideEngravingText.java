package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class FrameOutsideEngravingText extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.frameoutsideengravingtext.FrameOutsideEngravingText";
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

	public FrameAvailableEngravingPersonalization frameAvailableEngravingPersonalizationList() {
		FrameAvailableEngravingPersonalization member = new FrameAvailableEngravingPersonalization();
		member.setModelTypeName("frame_available_engraving_personalization");
		member.setName("frame_outside_engraving_text");
		member.setMemberName("frameAvailableEngravingPersonalizationList");
		member.setRelationName("frameOutsideEngravingText");
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

	public NumberAttribute price(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("price");
		member.setName("price");
		useMember(member);
		return member;
	}

	public NumberAttribute maxLength(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("maxLength");
		member.setName("max_length");
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

