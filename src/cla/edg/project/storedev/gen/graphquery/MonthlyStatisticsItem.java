package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class MonthlyStatisticsItem extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.monthlystatisticsitem.MonthlyStatisticsItem";
	}
	// 枚举对象

	// 引用的对象

	public StoreDeveloper storeDeveloper() {
		StoreDeveloper member = new StoreDeveloper();
		member.setModelTypeName("store_developer");
		member.setName("store_developer");
		member.setMemberName("storeDeveloper");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MonthlyStatistics monthlyStatistics() {
		MonthlyStatistics member = new MonthlyStatistics();
		member.setModelTypeName("monthly_statistics");
		member.setName("monthly_statistics");
		member.setMemberName("monthlyStatistics");
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

	public NumberAttribute rank(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("rank");
		useMember(member);
		return member;
	}

	public NumberAttribute rentRatio(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("rentRatio");
		useMember(member);
		return member;
	}

	public NumberAttribute rentRatioScore(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("rentRatioScore");
		useMember(member);
		return member;
	}

	public NumberAttribute costRatio(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("costRatio");
		useMember(member);
		return member;
	}

	public NumberAttribute costRatioScore(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("costRatioScore");
		useMember(member);
		return member;
	}

	public NumberAttribute recommendedStoresCount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("recommendedStoresCount");
		useMember(member);
		return member;
	}

	public NumberAttribute recommendedStoresCountScore(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("recommendedStoresCountScore");
		useMember(member);
		return member;
	}

	public NumberAttribute openedStoresCount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("openedStoresCount");
		useMember(member);
		return member;
	}

	public NumberAttribute openedStoresCountScore(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("openedStoresCountScore");
		useMember(member);
		return member;
	}

	public DateTimeAttribute time(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		member.setName("time");
		useMember(member);
		return member;
	}

	public BooleanAttribute calculationCompleted(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("calculationCompleted");
		useMember(member);
		return member;
	}

	public NumberAttribute totalScore(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("totalScore");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

