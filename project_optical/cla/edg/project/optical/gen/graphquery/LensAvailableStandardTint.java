package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LensAvailableStandardTint extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.lensavailablestandardtint.LensAvailableStandardTint";
	}
	// 枚举对象

	// 引用的对象

	public Lens lens() {
		Lens member = new Lens();
		member.setModelTypeName("lens");
		member.setName("lens");
		member.setMemberName("lens");
		member.setReferDirection(true);
		member.setRelationName("lens");
		append(member);
		return member;
	}

	public StandardLensTint standardLensTint() {
		StandardLensTint member = new StandardLensTint();
		member.setModelTypeName("standard_lens_tint");
		member.setName("standard_lens_tint");
		member.setMemberName("standardLensTint");
		member.setReferDirection(true);
		member.setRelationName("standardLensTint");
		append(member);
		return member;
	}

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

