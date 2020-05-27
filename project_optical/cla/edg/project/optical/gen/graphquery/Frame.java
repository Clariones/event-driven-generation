package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Frame extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.frame.Frame";
	}
	// 枚举对象

	// 引用的对象

	public FrameColor frameColor() {
		FrameColor member = new FrameColor();
		member.setModelTypeName("frame_color");
		member.setName("frame_color");
		member.setMemberName("frameColor");
		member.setReferDirection(true);
		member.setRelationName("frameColor");
		append(member);
		return member;
	}

	public PupilDistanceRange pupilDistanceRange() {
		PupilDistanceRange member = new PupilDistanceRange();
		member.setModelTypeName("pupil_distance_range");
		member.setName("pupil_distance_range");
		member.setMemberName("pupilDistanceRange");
		member.setReferDirection(true);
		member.setRelationName("pupilDistanceRange");
		append(member);
		return member;
	}

	public PrescriptionRange prescriptionRange() {
		PrescriptionRange member = new PrescriptionRange();
		member.setModelTypeName("prescription_range");
		member.setName("prescription_range");
		member.setMemberName("prescriptionRange");
		member.setReferDirection(true);
		member.setRelationName("prescriptionRange");
		append(member);
		return member;
	}

	public FrameStyle frameStyle() {
		FrameStyle member = new FrameStyle();
		member.setModelTypeName("frame_style");
		member.setName("frame_style");
		member.setMemberName("frameStyle");
		member.setReferDirection(true);
		member.setRelationName("frameStyle");
		append(member);
		return member;
	}

	public RimType rimType() {
		RimType member = new RimType();
		member.setModelTypeName("rim_type");
		member.setName("rim_type");
		member.setMemberName("rimType");
		member.setReferDirection(true);
		member.setRelationName("rimType");
		append(member);
		return member;
	}

	public FrameMaterialType frameMaterialType() {
		FrameMaterialType member = new FrameMaterialType();
		member.setModelTypeName("frame_material_type");
		member.setName("frame_material_type");
		member.setMemberName("frameMaterialType");
		member.setReferDirection(true);
		member.setRelationName("frameMaterialType");
		append(member);
		return member;
	}

	public ClipOnType clipOnType() {
		ClipOnType member = new ClipOnType();
		member.setModelTypeName("clip_on_type");
		member.setName("clip_on_type");
		member.setMemberName("clipOnType");
		member.setReferDirection(true);
		member.setRelationName("clipOnType");
		append(member);
		return member;
	}

	public Audience audience() {
		Audience member = new Audience();
		member.setModelTypeName("audience");
		member.setName("audience");
		member.setMemberName("audience");
		member.setReferDirection(true);
		member.setRelationName("audience");
		append(member);
		return member;
	}

	public FrameGender frameGender() {
		FrameGender member = new FrameGender();
		member.setModelTypeName("frame_gender");
		member.setName("frame_gender");
		member.setMemberName("frameGender");
		member.setReferDirection(true);
		member.setRelationName("frameGender");
		append(member);
		return member;
	}

	public FrameBrand frameBrand() {
		FrameBrand member = new FrameBrand();
		member.setModelTypeName("frame_brand");
		member.setName("frame_brand");
		member.setMemberName("frameBrand");
		member.setReferDirection(true);
		member.setRelationName("frameBrand");
		append(member);
		return member;
	}

	// 被引用的对象

	public FrameRelatedReplacement frameRelatedReplacementListAsFrame() {
		FrameRelatedReplacement member = new FrameRelatedReplacement();
		member.setModelTypeName("frame_related_replacement");
		member.setName("frame");
		member.setMemberName("frameRelatedReplacementListAsFrame");
		member.setRelationName("frame");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FrameRelatedReplacement frameRelatedReplacementListAsReplacementFrame() {
		FrameRelatedReplacement member = new FrameRelatedReplacement();
		member.setModelTypeName("frame_related_replacement");
		member.setName("replacement_frame");
		member.setMemberName("frameRelatedReplacementListAsReplacementFrame");
		member.setRelationName("frame");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FrameAvailableEngravingPersonalization frameAvailableEngravingPersonalizationList() {
		FrameAvailableEngravingPersonalization member = new FrameAvailableEngravingPersonalization();
		member.setModelTypeName("frame_available_engraving_personalization");
		member.setName("frame");
		member.setMemberName("frameAvailableEngravingPersonalizationList");
		member.setRelationName("frame");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FrameInventory frameInventoryList() {
		FrameInventory member = new FrameInventory();
		member.setModelTypeName("frame_inventory");
		member.setName("frame");
		member.setMemberName("frameInventoryList");
		member.setRelationName("frame");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public RimlessFrameAvailableLensShape rimlessFrameAvailableLensShapeList() {
		RimlessFrameAvailableLensShape member = new RimlessFrameAvailableLensShape();
		member.setModelTypeName("rimless_frame_available_lens_shape");
		member.setName("frame");
		member.setMemberName("rimlessFrameAvailableLensShapeList");
		member.setRelationName("frame");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FrameAvailableClipOn frameAvailableClipOnList() {
		FrameAvailableClipOn member = new FrameAvailableClipOn();
		member.setModelTypeName("frame_available_clip_on");
		member.setName("frame");
		member.setMemberName("frameAvailableClipOnList");
		member.setRelationName("frame");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FrameAvailableClipOnType frameAvailableClipOnTypeList() {
		FrameAvailableClipOnType member = new FrameAvailableClipOnType();
		member.setModelTypeName("frame_available_clip_on_type");
		member.setName("frame");
		member.setMemberName("frameAvailableClipOnTypeList");
		member.setRelationName("frame");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PrescriptionSku prescriptionSkuList() {
		PrescriptionSku member = new PrescriptionSku();
		member.setModelTypeName("prescription_sku");
		member.setName("frame");
		member.setMemberName("prescriptionSkuList");
		member.setRelationName("frame");
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

	public StringAttribute externalCode(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("externalCode");
		member.setName("external_code");
		useMember(member);
		return member;
	}

	public NumberAttribute frameWidth(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("frameWidth");
		member.setName("frame_width");
		useMember(member);
		return member;
	}

	public NumberAttribute templeLength(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("templeLength");
		member.setName("temple_length");
		useMember(member);
		return member;
	}

	public NumberAttribute lensWidth(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("lensWidth");
		member.setName("lens_width");
		useMember(member);
		return member;
	}

	public NumberAttribute lensHeight(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("lensHeight");
		member.setName("lens_height");
		useMember(member);
		return member;
	}

	public NumberAttribute bridge(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("bridge");
		member.setName("bridge");
		useMember(member);
		return member;
	}

	public NumberAttribute frameWeight(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("frameWeight");
		member.setName("frame_weight");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

