package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class DemoSku extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.demosku.DemoSku";
	}
	// 枚举对象

	// 引用的对象

	public FrameColor color() {
		FrameColor member = new FrameColor();
		member.setModelTypeName("frame_color");
		member.setName("color");
		member.setMemberName("color");
		member.setReferDirection(true);
		member.setRelationName("color");
		append(member);
		return member;
	}

	public DemoProduct demoProduct() {
		DemoProduct member = new DemoProduct();
		member.setModelTypeName("demo_product");
		member.setName("demo_product");
		member.setMemberName("demoProduct");
		member.setReferDirection(true);
		member.setRelationName("demoProduct");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("name");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute subTitle(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("subTitle");
		member.setName("sub_title");
		useMember(member);
		return member;
	}

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("description");
		member.setName("description");
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

	public StringAttribute externalCode(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("externalCode");
		member.setName("external_code");
		useMember(member);
		return member;
	}

	public StringAttribute pupilDistanceRange(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("pupilDistanceRange");
		member.setName("pupil_distance_range");
		useMember(member);
		return member;
	}

	public StringAttribute prescriptionRange(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("prescriptionRange");
		member.setName("prescription_range");
		useMember(member);
		return member;
	}

	public BooleanAttribute progressiveAvailable(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("progressiveAvailable");
		member.setName("progressive_available");
		useMember(member);
		return member;
	}

	public BooleanAttribute bifocalAvailable(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("bifocalAvailable");
		member.setName("bifocal_available");
		useMember(member);
		return member;
	}

	public StringAttribute rim(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("rim");
		member.setName("rim");
		useMember(member);
		return member;
	}

	public StringAttribute shape(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("shape");
		member.setName("shape");
		useMember(member);
		return member;
	}

	public StringAttribute material(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("material");
		member.setName("material");
		useMember(member);
		return member;
	}

	public StringAttribute feature(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("feature");
		member.setName("feature");
		useMember(member);
		return member;
	}

	public StringAttribute tags(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("tags");
		member.setName("tags");
		useMember(member);
		return member;
	}

	public StringAttribute frameWidth(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("frameWidth");
		member.setName("frame_width");
		useMember(member);
		return member;
	}

	public StringAttribute templeLength(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("templeLength");
		member.setName("temple_length");
		useMember(member);
		return member;
	}

	public StringAttribute lensWidth(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("lensWidth");
		member.setName("lens_width");
		useMember(member);
		return member;
	}

	public StringAttribute lensHeight(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("lensHeight");
		member.setName("lens_height");
		useMember(member);
		return member;
	}

	public StringAttribute bridge(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("bridge");
		member.setName("bridge");
		useMember(member);
		return member;
	}

	public StringAttribute frameWeight(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("frameWeight");
		member.setName("frame_weight");
		useMember(member);
		return member;
	}

	public StringAttribute image1(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("image1");
		member.setName("image1");
		useMember(member);
		return member;
	}

	public StringAttribute image2(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("image2");
		member.setName("image2");
		useMember(member);
		return member;
	}

	public StringAttribute image3(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("image3");
		member.setName("image3");
		useMember(member);
		return member;
	}

	public StringAttribute image4(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("image4");
		member.setName("image4");
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

