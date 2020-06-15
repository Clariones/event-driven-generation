package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import com.terapico.generator.Utils;

import cla.edg.modelbean.*;

public class StoreInformation extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.storeinformation.StoreInformation";
	}
	// 枚举对象

	// 引用的对象

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

	public ChangeRequest changeRequest() {
		ChangeRequest member = new ChangeRequest();
		member.setModelTypeName("change_request");
		member.setName("change_request");
		member.setMemberName("changeRequest");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

