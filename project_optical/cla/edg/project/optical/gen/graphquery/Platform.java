package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Platform extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.platform.Platform";
	}
	// 枚举对象

	// 引用的对象

	// 被引用的对象

	public DemoProduct demoProductList() {
		DemoProduct member = new DemoProduct();
		member.setModelTypeName("demo_product");
		member.setName("platform");
		member.setMemberName("demoProductList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public DemoSku demoSkuList() {
		DemoSku member = new DemoSku();
		member.setModelTypeName("demo_sku");
		member.setName("platform");
		member.setMemberName("demoSkuList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public User userList() {
		User member = new User();
		member.setModelTypeName("user");
		member.setName("platform");
		member.setMemberName("userList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Province provinceList() {
		Province member = new Province();
		member.setModelTypeName("province");
		member.setName("platform");
		member.setMemberName("provinceList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public UserTryOnAvatar userTryOnAvatarList() {
		UserTryOnAvatar member = new UserTryOnAvatar();
		member.setModelTypeName("user_try_on_avatar");
		member.setName("platform");
		member.setMemberName("userTryOnAvatarList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public User3dTryOnVideo user3dTryOnVideoList() {
		User3dTryOnVideo member = new User3dTryOnVideo();
		member.setModelTypeName("user_3d_try_on_video");
		member.setName("platform");
		member.setMemberName("user3dTryOnVideoList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Merchant merchantList() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("platform");
		member.setMemberName("merchantList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Lens lensList() {
		Lens member = new Lens();
		member.setModelTypeName("lens");
		member.setName("platform");
		member.setMemberName("lensList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LensInventory lensInventoryList() {
		LensInventory member = new LensInventory();
		member.setModelTypeName("lens_inventory");
		member.setName("platform");
		member.setMemberName("lensInventoryList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LensBrand lensBrandList() {
		LensBrand member = new LensBrand();
		member.setModelTypeName("lens_brand");
		member.setName("platform");
		member.setMemberName("lensBrandList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LensMaterialType lensMaterialTypeList() {
		LensMaterialType member = new LensMaterialType();
		member.setModelTypeName("lens_material_type");
		member.setName("platform");
		member.setMemberName("lensMaterialTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LensProcessType lensProcessTypeList() {
		LensProcessType member = new LensProcessType();
		member.setModelTypeName("lens_process_type");
		member.setName("platform");
		member.setMemberName("lensProcessTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LensAvailableStandardTint lensAvailableStandardTintList() {
		LensAvailableStandardTint member = new LensAvailableStandardTint();
		member.setModelTypeName("lens_available_standard_tint");
		member.setName("platform");
		member.setMemberName("lensAvailableStandardTintList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LensAvailableGradientTint lensAvailableGradientTintList() {
		LensAvailableGradientTint member = new LensAvailableGradientTint();
		member.setModelTypeName("lens_available_gradient_tint");
		member.setName("platform");
		member.setMemberName("lensAvailableGradientTintList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LensAvailableCoating lensAvailableCoatingList() {
		LensAvailableCoating member = new LensAvailableCoating();
		member.setModelTypeName("lens_available_coating");
		member.setName("platform");
		member.setMemberName("lensAvailableCoatingList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LensArCoating lensArCoatingList() {
		LensArCoating member = new LensArCoating();
		member.setModelTypeName("lens_ar_coating");
		member.setName("platform");
		member.setMemberName("lensArCoatingList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public StandardLensTint standardLensTintList() {
		StandardLensTint member = new StandardLensTint();
		member.setModelTypeName("standard_lens_tint");
		member.setName("platform");
		member.setMemberName("standardLensTintList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public GradientLensTint gradientLensTintList() {
		GradientLensTint member = new GradientLensTint();
		member.setModelTypeName("gradient_lens_tint");
		member.setName("platform");
		member.setMemberName("gradientLensTintList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public StandardTintColor standardTintColorList() {
		StandardTintColor member = new StandardTintColor();
		member.setModelTypeName("standard_tint_color");
		member.setName("platform");
		member.setMemberName("standardTintColorList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public CoatingType coatingTypeList() {
		CoatingType member = new CoatingType();
		member.setModelTypeName("coating_type");
		member.setName("platform");
		member.setMemberName("coatingTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public GradientTintColor gradientTintColorList() {
		GradientTintColor member = new GradientTintColor();
		member.setModelTypeName("gradient_tint_color");
		member.setName("platform");
		member.setMemberName("gradientTintColorList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LensPrescriptionType lensPrescriptionTypeList() {
		LensPrescriptionType member = new LensPrescriptionType();
		member.setModelTypeName("lens_prescription_type");
		member.setName("platform");
		member.setMemberName("lensPrescriptionTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LensColor lensColorList() {
		LensColor member = new LensColor();
		member.setModelTypeName("lens_color");
		member.setName("platform");
		member.setMemberName("lensColorList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LensBaseType lensBaseTypeList() {
		LensBaseType member = new LensBaseType();
		member.setModelTypeName("lens_base_type");
		member.setName("platform");
		member.setMemberName("lensBaseTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LensRestrictClipOn lensRestrictClipOnList() {
		LensRestrictClipOn member = new LensRestrictClipOn();
		member.setModelTypeName("lens_restrict_clip_on");
		member.setName("platform");
		member.setMemberName("lensRestrictClipOnList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FrameRelatedReplacement frameRelatedReplacementList() {
		FrameRelatedReplacement member = new FrameRelatedReplacement();
		member.setModelTypeName("frame_related_replacement");
		member.setName("platform");
		member.setMemberName("frameRelatedReplacementList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FrameInsideEngravingText frameInsideEngravingTextList() {
		FrameInsideEngravingText member = new FrameInsideEngravingText();
		member.setModelTypeName("frame_inside_engraving_text");
		member.setName("platform");
		member.setMemberName("frameInsideEngravingTextList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FrameOutsideEngravingText frameOutsideEngravingTextList() {
		FrameOutsideEngravingText member = new FrameOutsideEngravingText();
		member.setModelTypeName("frame_outside_engraving_text");
		member.setName("platform");
		member.setMemberName("frameOutsideEngravingTextList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FrameEngravingImage frameEngravingImageList() {
		FrameEngravingImage member = new FrameEngravingImage();
		member.setModelTypeName("frame_engraving_image");
		member.setName("platform");
		member.setMemberName("frameEngravingImageList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PersonalizationImage personalizationImageList() {
		PersonalizationImage member = new PersonalizationImage();
		member.setModelTypeName("personalization_image");
		member.setName("platform");
		member.setMemberName("personalizationImageList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FrameStyle frameStyleList() {
		FrameStyle member = new FrameStyle();
		member.setModelTypeName("frame_style");
		member.setName("platform");
		member.setMemberName("frameStyleList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Audience audienceList() {
		Audience member = new Audience();
		member.setModelTypeName("audience");
		member.setName("platform");
		member.setMemberName("audienceList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FrameBrand frameBrandList() {
		FrameBrand member = new FrameBrand();
		member.setModelTypeName("frame_brand");
		member.setName("platform");
		member.setMemberName("frameBrandList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FrameInventory frameInventoryList() {
		FrameInventory member = new FrameInventory();
		member.setModelTypeName("frame_inventory");
		member.setName("platform");
		member.setMemberName("frameInventoryList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FaceShape faceShapeList() {
		FaceShape member = new FaceShape();
		member.setModelTypeName("face_shape");
		member.setName("platform");
		member.setMemberName("faceShapeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FrameGender frameGenderList() {
		FrameGender member = new FrameGender();
		member.setModelTypeName("frame_gender");
		member.setName("platform");
		member.setMemberName("frameGenderList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FrameColor frameColorList() {
		FrameColor member = new FrameColor();
		member.setModelTypeName("frame_color");
		member.setName("platform");
		member.setMemberName("frameColorList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public RimType rimTypeList() {
		RimType member = new RimType();
		member.setModelTypeName("rim_type");
		member.setName("platform");
		member.setMemberName("rimTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FrameMaterialType frameMaterialTypeList() {
		FrameMaterialType member = new FrameMaterialType();
		member.setModelTypeName("frame_material_type");
		member.setName("platform");
		member.setMemberName("frameMaterialTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public RimlessFrameAvailableLensShape rimlessFrameAvailableLensShapeList() {
		RimlessFrameAvailableLensShape member = new RimlessFrameAvailableLensShape();
		member.setModelTypeName("rimless_frame_available_lens_shape");
		member.setName("platform");
		member.setMemberName("rimlessFrameAvailableLensShapeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public RimlessLensShape rimlessLensShapeList() {
		RimlessLensShape member = new RimlessLensShape();
		member.setModelTypeName("rimless_lens_shape");
		member.setName("platform");
		member.setMemberName("rimlessLensShapeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FrameAvailableClipOn frameAvailableClipOnList() {
		FrameAvailableClipOn member = new FrameAvailableClipOn();
		member.setModelTypeName("frame_available_clip_on");
		member.setName("platform");
		member.setMemberName("frameAvailableClipOnList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FrameAvailableClipOnType frameAvailableClipOnTypeList() {
		FrameAvailableClipOnType member = new FrameAvailableClipOnType();
		member.setModelTypeName("frame_available_clip_on_type");
		member.setName("platform");
		member.setMemberName("frameAvailableClipOnTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LineItemType lineItemTypeList() {
		LineItemType member = new LineItemType();
		member.setModelTypeName("line_item_type");
		member.setName("platform");
		member.setMemberName("lineItemTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SphereRange sphereRangeList() {
		SphereRange member = new SphereRange();
		member.setModelTypeName("sphere_range");
		member.setName("platform");
		member.setMemberName("sphereRangeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public CylinderRange cylinderRangeList() {
		CylinderRange member = new CylinderRange();
		member.setModelTypeName("cylinder_range");
		member.setName("platform");
		member.setMemberName("cylinderRangeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PupilDistanceRange pupilDistanceRangeList() {
		PupilDistanceRange member = new PupilDistanceRange();
		member.setModelTypeName("pupil_distance_range");
		member.setName("platform");
		member.setMemberName("pupilDistanceRangeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public NearVisionAdditionRange nearVisionAdditionRangeList() {
		NearVisionAdditionRange member = new NearVisionAdditionRange();
		member.setModelTypeName("near_vision_addition_range");
		member.setName("platform");
		member.setMemberName("nearVisionAdditionRangeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PrescriptionRange prescriptionRangeList() {
		PrescriptionRange member = new PrescriptionRange();
		member.setModelTypeName("prescription_range");
		member.setName("platform");
		member.setMemberName("prescriptionRangeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PrismRangeAndDirection prismRangeAndDirectionList() {
		PrismRangeAndDirection member = new PrismRangeAndDirection();
		member.setModelTypeName("prism_range_and_direction");
		member.setName("platform");
		member.setMemberName("prismRangeAndDirectionList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LensIdx lensIdxList() {
		LensIdx member = new LensIdx();
		member.setModelTypeName("lens_idx");
		member.setName("platform");
		member.setMemberName("lensIdxList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public HorizontalBaseDirection horizontalBaseDirectionList() {
		HorizontalBaseDirection member = new HorizontalBaseDirection();
		member.setModelTypeName("horizontal_base_direction");
		member.setName("platform");
		member.setMemberName("horizontalBaseDirectionList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public VerticalBaseDirection verticalBaseDirectionList() {
		VerticalBaseDirection member = new VerticalBaseDirection();
		member.setModelTypeName("vertical_base_direction");
		member.setName("platform");
		member.setMemberName("verticalBaseDirectionList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PrescriptionPdType prescriptionPdTypeList() {
		PrescriptionPdType member = new PrescriptionPdType();
		member.setModelTypeName("prescription_pd_type");
		member.setName("platform");
		member.setMemberName("prescriptionPdTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ReminderFrequencyType reminderFrequencyTypeList() {
		ReminderFrequencyType member = new ReminderFrequencyType();
		member.setModelTypeName("reminder_frequency_type");
		member.setName("platform");
		member.setMemberName("reminderFrequencyTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public AgeRange ageRangeList() {
		AgeRange member = new AgeRange();
		member.setModelTypeName("age_range");
		member.setName("platform");
		member.setMemberName("ageRangeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MainOrder mainOrderList() {
		MainOrder member = new MainOrder();
		member.setModelTypeName("main_order");
		member.setName("platform");
		member.setMemberName("mainOrderList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PaymentStatus paymentStatusList() {
		PaymentStatus member = new PaymentStatus();
		member.setModelTypeName("payment_status");
		member.setName("platform");
		member.setMemberName("paymentStatusList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PaymentOption paymentOptionList() {
		PaymentOption member = new PaymentOption();
		member.setModelTypeName("payment_option");
		member.setName("platform");
		member.setMemberName("paymentOptionList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public OrderStatus orderStatusList() {
		OrderStatus member = new OrderStatus();
		member.setModelTypeName("order_status");
		member.setName("platform");
		member.setMemberName("orderStatusList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ShoppingCart shoppingCartList() {
		ShoppingCart member = new ShoppingCart();
		member.setModelTypeName("shopping_cart");
		member.setName("platform");
		member.setMemberName("shoppingCartList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Catalog catalogList() {
		Catalog member = new Catalog();
		member.setModelTypeName("catalog");
		member.setName("platform");
		member.setMemberName("catalogList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Category categoryList() {
		Category member = new Category();
		member.setModelTypeName("category");
		member.setName("platform");
		member.setMemberName("categoryList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Product productList() {
		Product member = new Product();
		member.setModelTypeName("product");
		member.setName("platform");
		member.setMemberName("productList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Sku skuList() {
		Sku member = new Sku();
		member.setModelTypeName("sku");
		member.setName("platform");
		member.setMemberName("skuList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PrescriptionSku prescriptionSkuList() {
		PrescriptionSku member = new PrescriptionSku();
		member.setModelTypeName("prescription_sku");
		member.setName("platform");
		member.setMemberName("prescriptionSkuList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public StandardSku standardSkuList() {
		StandardSku member = new StandardSku();
		member.setModelTypeName("standard_sku");
		member.setName("platform");
		member.setMemberName("standardSkuList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ClipOn clipOnList() {
		ClipOn member = new ClipOn();
		member.setModelTypeName("clip_on");
		member.setName("platform");
		member.setMemberName("clipOnList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProductCategory productCategoryList() {
		ProductCategory member = new ProductCategory();
		member.setModelTypeName("product_category");
		member.setName("platform");
		member.setMemberName("productCategoryList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProductType productTypeList() {
		ProductType member = new ProductType();
		member.setModelTypeName("product_type");
		member.setName("platform");
		member.setMemberName("productTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ClipOnType clipOnTypeList() {
		ClipOnType member = new ClipOnType();
		member.setModelTypeName("clip_on_type");
		member.setName("platform");
		member.setMemberName("clipOnTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SkuInventory skuInventoryList() {
		SkuInventory member = new SkuInventory();
		member.setModelTypeName("sku_inventory");
		member.setName("platform");
		member.setMemberName("skuInventoryList");
		member.setRelationName("platform");
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

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("createTime");
		member.setName("create_time");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		// member.setName("lastUpdateTime");
		member.setName("last_update_time");
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

