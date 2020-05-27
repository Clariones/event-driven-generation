package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class FrameAvailableEngravingPersonalization extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.frameavailableengravingpersonalization.FrameAvailableEngravingPersonalization";
	}
	// 枚举对象

	// 引用的对象

	public Frame frame() {
		Frame member = new Frame();
		member.setModelTypeName("frame");
		member.setName("frame");
		member.setMemberName("frame");
		member.setReferDirection(true);
		member.setRelationName("frame");
		append(member);
		return member;
	}

	public FrameInsideEngravingText frameInsideEngravingText() {
		FrameInsideEngravingText member = new FrameInsideEngravingText();
		member.setModelTypeName("frame_inside_engraving_text");
		member.setName("frame_inside_engraving_text");
		member.setMemberName("frameInsideEngravingText");
		member.setReferDirection(true);
		member.setRelationName("frameInsideEngravingText");
		append(member);
		return member;
	}

	public FrameOutsideEngravingText frameOutsideEngravingText() {
		FrameOutsideEngravingText member = new FrameOutsideEngravingText();
		member.setModelTypeName("frame_outside_engraving_text");
		member.setName("frame_outside_engraving_text");
		member.setMemberName("frameOutsideEngravingText");
		member.setReferDirection(true);
		member.setRelationName("frameOutsideEngravingText");
		append(member);
		return member;
	}

	public FrameEngravingImage frameEngravingImage() {
		FrameEngravingImage member = new FrameEngravingImage();
		member.setModelTypeName("frame_engraving_image");
		member.setName("frame_engraving_image");
		member.setMemberName("frameEngravingImage");
		member.setReferDirection(true);
		member.setRelationName("frameEngravingImage");
		append(member);
		return member;
	}

	// 被引用的对象


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
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

