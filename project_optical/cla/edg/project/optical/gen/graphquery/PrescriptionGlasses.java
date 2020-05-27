package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PrescriptionGlasses extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.prescriptionglasses.PrescriptionGlasses";
	}
	// 枚举对象

	// 引用的对象

	// 被引用的对象

	public LineItem lineItemList() {
		LineItem member = new LineItem();
		member.setModelTypeName("line_item");
		member.setName("prescription_glasses");
		member.setMemberName("lineItemList");
		member.setRelationName("prescriptionGlasses");
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

	public StringAttribute frameName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("frameName");
		member.setName("frame_name");
		useMember(member);
		return member;
	}

	public StringAttribute frameId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("frameId");
		member.setName("frame_id");
		useMember(member);
		return member;
	}

	public NumberAttribute framePrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("framePrice");
		member.setName("frame_price");
		useMember(member);
		return member;
	}

	public NumberAttribute frameExternalCode(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("frameExternalCode");
		member.setName("frame_external_code");
		useMember(member);
		return member;
	}

	public StringAttribute lensName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("lensName");
		member.setName("lens_name");
		useMember(member);
		return member;
	}

	public StringAttribute lensId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("lensId");
		member.setName("lens_id");
		useMember(member);
		return member;
	}

	public NumberAttribute lensPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("lensPrice");
		member.setName("lens_price");
		useMember(member);
		return member;
	}

	public StringAttribute lensExternalCode(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("lensExternalCode");
		member.setName("lens_external_code");
		useMember(member);
		return member;
	}

	public NumberAttribute lensShapeCode(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("lensShapeCode");
		member.setName("lens_shape_code");
		useMember(member);
		return member;
	}

	public NumberAttribute lensPrismPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("lensPrismPrice");
		member.setName("lens_prism_price");
		useMember(member);
		return member;
	}

	public NumberAttribute lensExtraPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("lensExtraPrice");
		member.setName("lens_extra_price");
		useMember(member);
		return member;
	}

	public NumberAttribute frameExtraPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		// member.setName("frameExtraPrice");
		member.setName("frame_extra_price");
		useMember(member);
		return member;
	}

	public BooleanAttribute frameTempleEngravingInsideArm(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("frameTempleEngravingInsideArm");
		member.setName("frame_temple_engraving_inside_arm");
		useMember(member);
		return member;
	}

	public StringAttribute frameTempleEngravingInsideArmText(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("frameTempleEngravingInsideArmText");
		member.setName("frame_temple_engraving_inside_arm_text");
		useMember(member);
		return member;
	}

	public NumberAttribute frameTempleEngravingInsideArmPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("frameTempleEngravingInsideArmPrice");
		member.setName("frame_temple_engraving_inside_arm_price");
		useMember(member);
		return member;
	}

	public BooleanAttribute frameTempleEngravingOutsideArm(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("frameTempleEngravingOutsideArm");
		member.setName("frame_temple_engraving_outside_arm");
		useMember(member);
		return member;
	}

	public StringAttribute frameTempleEngravingOutsideText(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("frameTempleEngravingOutsideText");
		member.setName("frame_temple_engraving_outside_text");
		useMember(member);
		return member;
	}

	public StringAttribute frameTempleEngravingOutsideTextFontStyle(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("frameTempleEngravingOutsideTextFontStyle");
		member.setName("frame_temple_engraving_outside_text_font_style");
		useMember(member);
		return member;
	}

	public StringAttribute frameTempleEngravingOutsideTextFontColor(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("frameTempleEngravingOutsideTextFontColor");
		member.setName("frame_temple_engraving_outside_text_font_color");
		useMember(member);
		return member;
	}

	public NumberAttribute frameTempleEngravingOutsideArmPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("frameTempleEngravingOutsideArmPrice");
		member.setName("frame_temple_engraving_outside_arm_price");
		useMember(member);
		return member;
	}

	public BooleanAttribute frameTempleImage(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("frameTempleImage");
		member.setName("frame_temple_image");
		useMember(member);
		return member;
	}

	public StringAttribute frameTempleImageUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("frameTempleImageUrl");
		member.setName("frame_temple_image_url");
		useMember(member);
		return member;
	}

	public StringAttribute frameTempleImageAssetId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("frameTempleImageAssetId");
		member.setName("frame_temple_image_asset_id");
		useMember(member);
		return member;
	}

	public NumberAttribute frameTempleImagePrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("frameTempleImagePrice");
		member.setName("frame_temple_image_price");
		useMember(member);
		return member;
	}

	public StringAttribute clipOnName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("clipOnName");
		member.setName("clip_on_name");
		useMember(member);
		return member;
	}

	public StringAttribute clipOnId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("clipOnId");
		member.setName("clip_on_id");
		useMember(member);
		return member;
	}

	public StringAttribute clipOnExternalCode(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("clipOnExternalCode");
		member.setName("clip_on_external_code");
		useMember(member);
		return member;
	}

	public NumberAttribute clipOnQuantity(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("clipOnQuantity");
		member.setName("clip_on_quantity");
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

