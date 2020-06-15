package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import com.terapico.generator.Utils;

import cla.edg.modelbean.*;

public class MonthlyStatistics extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.monthlystatistics.MonthlyStatistics";
	}
	// 枚举对象

	// 引用的对象

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
	
	public MonthlyStatisticsItem monthlyStatisticsItemList() {
		MonthlyStatisticsItem member = new MonthlyStatisticsItem();
		member.setModelTypeName("monthly_statistics_item");
		member.setName("monthly_statistics");
		member.setMemberName("monthlyStatisticsItemList");
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

	public DateTimeAttribute time(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		member.setName("time");
		useMember(member);
		return member;
	}

	public NumberAttribute averageRentRatio(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("averageRentRatio");
		useMember(member);
		return member;
	}

	public NumberAttribute averageCostRatio(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("averageCostRatio");
		useMember(member);
		return member;
	}

	public NumberAttribute averageRecommendedStoresCount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("averageRecommendedStoresCount");
		useMember(member);
		return member;
	}

	public NumberAttribute averageOpenedStoresCount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("averageOpenedStoresCount");
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

