package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Lens extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.lens.Lens";
	}
	// 枚举对象

	// 引用的对象

	public LensBrand brand() {
		LensBrand member = new LensBrand();
		member.setModelTypeName("lens_brand");
		member.setName("brand");
		member.setMemberName("brand");
		member.setReferDirection(true);
		member.setRelationName("brand");
		append(member);
		return member;
	}

	public LensIdx lensIdx() {
		LensIdx member = new LensIdx();
		member.setModelTypeName("lens_idx");
		member.setName("lens_idx");
		member.setMemberName("lensIdx");
		member.setReferDirection(true);
		member.setRelationName("lensIdx");
		append(member);
		return member;
	}

	public LensPrescriptionType lensPrescriptionType() {
		LensPrescriptionType member = new LensPrescriptionType();
		member.setModelTypeName("lens_prescription_type");
		member.setName("lens_prescription_type");
		member.setMemberName("lensPrescriptionType");
		member.setReferDirection(true);
		member.setRelationName("lensPrescriptionType");
		append(member);
		return member;
	}

	public SphereRange sphereRange() {
		SphereRange member = new SphereRange();
		member.setModelTypeName("sphere_range");
		member.setName("sphere_range");
		member.setMemberName("sphereRange");
		member.setReferDirection(true);
		member.setRelationName("sphereRange");
		append(member);
		return member;
	}

	public CylinderRange cylinderRange() {
		CylinderRange member = new CylinderRange();
		member.setModelTypeName("cylinder_range");
		member.setName("cylinder_range");
		member.setMemberName("cylinderRange");
		member.setReferDirection(true);
		member.setRelationName("cylinderRange");
		append(member);
		return member;
	}

	public PrismRangeAndDirection prismRangeAndDirection() {
		PrismRangeAndDirection member = new PrismRangeAndDirection();
		member.setModelTypeName("prism_range_and_direction");
		member.setName("prism_range_and_direction");
		member.setMemberName("prismRangeAndDirection");
		member.setReferDirection(true);
		member.setRelationName("prismRangeAndDirection");
		append(member);
		return member;
	}

	public NearVisionAdditionRange nearVisionAdditionRange() {
		NearVisionAdditionRange member = new NearVisionAdditionRange();
		member.setModelTypeName("near_vision_addition_range");
		member.setName("near_vision_addition_range");
		member.setMemberName("nearVisionAdditionRange");
		member.setReferDirection(true);
		member.setRelationName("nearVisionAdditionRange");
		append(member);
		return member;
	}

	public LensProcessType lensProcessType() {
		LensProcessType member = new LensProcessType();
		member.setModelTypeName("lens_process_type");
		member.setName("lens_process_type");
		member.setMemberName("lensProcessType");
		member.setReferDirection(true);
		member.setRelationName("lensProcessType");
		append(member);
		return member;
	}

	public LensMaterialType lensMaterialType() {
		LensMaterialType member = new LensMaterialType();
		member.setModelTypeName("lens_material_type");
		member.setName("lens_material_type");
		member.setMemberName("lensMaterialType");
		member.setReferDirection(true);
		member.setRelationName("lensMaterialType");
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

	public LensInventory lensInventoryList() {
		LensInventory member = new LensInventory();
		member.setModelTypeName("lens_inventory");
		member.setName("lens");
		member.setMemberName("lensInventoryList");
		member.setRelationName("lens");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LensAvailableStandardTint lensAvailableStandardTintList() {
		LensAvailableStandardTint member = new LensAvailableStandardTint();
		member.setModelTypeName("lens_available_standard_tint");
		member.setName("lens");
		member.setMemberName("lensAvailableStandardTintList");
		member.setRelationName("lens");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LensAvailableGradientTint lensAvailableGradientTintList() {
		LensAvailableGradientTint member = new LensAvailableGradientTint();
		member.setModelTypeName("lens_available_gradient_tint");
		member.setName("lens");
		member.setMemberName("lensAvailableGradientTintList");
		member.setRelationName("lens");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LensAvailableCoating lensAvailableCoatingList() {
		LensAvailableCoating member = new LensAvailableCoating();
		member.setModelTypeName("lens_available_coating");
		member.setName("lens");
		member.setMemberName("lensAvailableCoatingList");
		member.setRelationName("lens");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LensRestrictClipOn lensRestrictClipOnList() {
		LensRestrictClipOn member = new LensRestrictClipOn();
		member.setModelTypeName("lens_restrict_clip_on");
		member.setName("lens");
		member.setMemberName("lensRestrictClipOnList");
		member.setRelationName("lens");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PrescriptionSku prescriptionSkuList() {
		PrescriptionSku member = new PrescriptionSku();
		member.setModelTypeName("prescription_sku");
		member.setName("lens");
		member.setMemberName("prescriptionSkuList");
		member.setRelationName("lens");
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

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("description");
		member.setName("description");
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

