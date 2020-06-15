package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import com.terapico.generator.Utils;

import cla.edg.modelbean.*;

public class RecommendedStore extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.recommendedstore.RecommendedStore";
	}
	// 枚举对象

	// 引用的对象

	public StoreDeveloper initiator() {
		StoreDeveloper member = new StoreDeveloper();
		member.setModelTypeName("store_developer");
		member.setName("initiator");
		member.setMemberName("initiator");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public RecommendedStoreStatus status() {
		RecommendedStoreStatus member = new RecommendedStoreStatus();
		member.setModelTypeName("recommended_store_status");
		member.setName("status");
		member.setMemberName("status");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public OperationCompany operationCompany() {
		OperationCompany member = new OperationCompany();
		member.setModelTypeName("operation_company");
		member.setName("operation_company");
		member.setMemberName("operationCompany");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public GiantArea giantArea() {
		GiantArea member = new GiantArea();
		member.setModelTypeName("giant_area");
		member.setName("giant_area");
		member.setMemberName("giantArea");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MiddleArea middleArea() {
		MiddleArea member = new MiddleArea();
		member.setModelTypeName("middle_area");
		member.setName("middle_area");
		member.setMemberName("middleArea");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public SmallArea smallArea() {
		SmallArea member = new SmallArea();
		member.setModelTypeName("small_area");
		member.setName("small_area");
		member.setMemberName("smallArea");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Province province() {
		Province member = new Province();
		member.setModelTypeName("province");
		member.setName("province");
		member.setMemberName("province");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public City city() {
		City member = new City();
		member.setModelTypeName("city");
		member.setName("city");
		member.setMemberName("city");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public District district() {
		District member = new District();
		member.setModelTypeName("district");
		member.setName("district");
		member.setMemberName("district");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public StoreType storeType() {
		StoreType member = new StoreType();
		member.setModelTypeName("store_type");
		member.setName("store_type");
		member.setMemberName("storeType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Channel channel() {
		Channel member = new Channel();
		member.setModelTypeName("channel");
		member.setName("channel");
		member.setMemberName("channel");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public TradeAreaType tradeAreaType() {
		TradeAreaType member = new TradeAreaType();
		member.setModelTypeName("trade_area_type");
		member.setName("trade_area_type");
		member.setMemberName("tradeAreaType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public CityLevel cityLevel() {
		CityLevel member = new CityLevel();
		member.setModelTypeName("city_level");
		member.setName("city_level");
		member.setMemberName("cityLevel");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public SearchStoreMethod searchStore() {
		SearchStoreMethod member = new SearchStoreMethod();
		member.setModelTypeName("search_store_method");
		member.setName("search_store");
		member.setMemberName("searchStore");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public RecommendedStoreHistory recommendedStoreHistoryList() {
		RecommendedStoreHistory member = new RecommendedStoreHistory();
		member.setModelTypeName("recommended_store_history");
		member.setName("recommended_store");
		member.setMemberName("recommendedStoreHistoryList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public SampleRow sampleRowList() {
		SampleRow member = new SampleRow();
		member.setModelTypeName("sample_row");
		member.setName("recommended_store");
		member.setMemberName("sampleRowList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public RecommendedStoreActivityLog recommendedStoreActivityLogList() {
		RecommendedStoreActivityLog member = new RecommendedStoreActivityLog();
		member.setModelTypeName("recommended_store_activity_log");
		member.setName("recommended_store");
		member.setMemberName("recommendedStoreActivityLogList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public RecommendedStoreAuditTask recommendedStoreAuditTaskList() {
		RecommendedStoreAuditTask member = new RecommendedStoreAuditTask();
		member.setModelTypeName("recommended_store_audit_task");
		member.setName("recommended_store");
		member.setMemberName("recommendedStoreAuditTaskList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public StoreMonthlyOperationData storeMonthlyOperationDataList() {
		StoreMonthlyOperationData member = new StoreMonthlyOperationData();
		member.setModelTypeName("store_monthly_operation_data");
		member.setName("store");
		member.setMemberName("storeMonthlyOperationDataList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public StoreReport storeReportList() {
		StoreReport member = new StoreReport();
		member.setModelTypeName("store_report");
		member.setName("store");
		member.setMemberName("storeReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute detailedAddress(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("detailedAddress");
		useMember(member);
		return member;
	}

	public NumberAttribute firstSixMonthsEstimatedIncome(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("firstSixMonthsEstimatedIncome");
		useMember(member);
		return member;
	}

	public NumberAttribute laterSixMonthsEstimatedIncome(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("laterSixMonthsEstimatedIncome");
		useMember(member);
		return member;
	}

	public NumberAttribute area(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("area");
		useMember(member);
		return member;
	}

	public NumberAttribute storeWidth(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("storeWidth");
		useMember(member);
		return member;
	}

	public BooleanAttribute isTradeArea(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("isTradeArea");
		useMember(member);
		return member;
	}

	public DateTimeAttribute expectedOpeningTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("expectedOpeningTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute rentalStartTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("rentalStartTime");
		useMember(member);
		return member;
	}

	public StringAttribute environmentDescription(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("environmentDescription");
		useMember(member);
		return member;
	}

	public StringAttribute storeAtmosphereDetails(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("storeAtmosphereDetails");
		useMember(member);
		return member;
	}

	public StringAttribute storeLocation(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("storeLocation");
		useMember(member);
		return member;
	}

	public StringAttribute storePhotoOne(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("storePhotoOne");
		useMember(member);
		return member;
	}

	public StringAttribute storePhotoTwo(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("storePhotoTwo");
		useMember(member);
		return member;
	}

	public StringAttribute storePhotoThree(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("storePhotoThree");
		useMember(member);
		return member;
	}

	public StringAttribute storePhotoFour(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("storePhotoFour");
		useMember(member);
		return member;
	}

	public StringAttribute storePhotoFive(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("storePhotoFive");
		useMember(member);
		return member;
	}

	public StringAttribute storeAroundPhotoOne(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("storeAroundPhotoOne");
		useMember(member);
		return member;
	}

	public StringAttribute storeAroundPhotoTwo(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("storeAroundPhotoTwo");
		useMember(member);
		return member;
	}

	public StringAttribute storeAroundPhotoThree(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("storeAroundPhotoThree");
		useMember(member);
		return member;
	}

	public StringAttribute storeAroundPhotoFour(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("storeAroundPhotoFour");
		useMember(member);
		return member;
	}

	public StringAttribute storeAroundPhotoFive(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("storeAroundPhotoFive");
		useMember(member);
		return member;
	}

	public NumberAttribute rentExpense(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("rentExpense");
		useMember(member);
		return member;
	}

	public StringAttribute recommenderName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("recommenderName");
		useMember(member);
		return member;
	}

	public StringAttribute recommenderMobile(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_china_mobile_phone");
		member.setName("recommenderMobile");
		useMember(member);
		return member;
	}

	public StringAttribute chainBrand(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("chainBrand");
		useMember(member);
		return member;
	}

	public StringAttribute clothingBrand(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("clothingBrand");
		useMember(member);
		return member;
	}

	public StringAttribute competitiveBrandsAndSalesPerformance(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("competitiveBrandsAndSalesPerformance");
		useMember(member);
		return member;
	}

	public StringAttribute ourStoreIn500m(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("ourStoreIn500m");
		useMember(member);
		return member;
	}

	public StringAttribute propertyOwnerName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("propertyOwnerName");
		useMember(member);
		return member;
	}

	public StringAttribute propertyOwnerContactInfo(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("propertyOwnerContactInfo");
		useMember(member);
		return member;
	}

	public NumberAttribute brokerExpense(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("brokerExpense");
		useMember(member);
		return member;
	}

	public NumberAttribute transferExpense(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("transferExpense");
		useMember(member);
		return member;
	}

	public NumberAttribute otherExpense(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("otherExpense");
		useMember(member);
		return member;
	}

	public StringAttribute expenseDescription(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("expenseDescription");
		useMember(member);
		return member;
	}

	public StringAttribute witness(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("witness");
		useMember(member);
		return member;
	}

	public StringAttribute comments(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("comments");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("createTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		member.setName("lastUpdateTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute approvedTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		member.setName("approvedTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute openTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		member.setName("openTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute statusUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		member.setName("statusUpdateTime");
		useMember(member);
		return member;
	}

	public StringAttribute counterId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("counterId");
		useMember(member);
		return member;
	}

	public DateTimeAttribute businessStartTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		member.setName("businessStartTime");
		useMember(member);
		return member;
	}

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

