package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class PersonalAchievementMonthly extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.personalachievementmonthly.PersonalAchievementMonthly";
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

	// 被引用的对象

	
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

	public NumberAttribute numberOfRecommendStore(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("numberOfRecommendStore");
		useMember(member);
		return member;
	}

	public NumberAttribute numberOfNewStore(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("numberOfNewStore");
		useMember(member);
		return member;
	}

	public NumberAttribute newStorePerformance(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("newStorePerformance");
		useMember(member);
		return member;
	}

	public NumberAttribute averageRentalRate(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("averageRentalRate");
		useMember(member);
		return member;
	}

	public NumberAttribute commission(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("commission");
		useMember(member);
		return member;
	}

	public NumberAttribute agencyFee(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("agencyFee");
		useMember(member);
		return member;
	}

	public NumberAttribute score(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("score");
		useMember(member);
		return member;
	}

	public NumberAttribute commissionAgencyFeeRate(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("commissionAgencyFeeRate");
		useMember(member);
		return member;
	}

	public DateTimeAttribute settleDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		member.setName("settleDate");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

