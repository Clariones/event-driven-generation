package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class OperationCompanyReport extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.operationcompanyreport.OperationCompanyReport";
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

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public NumberAttribute scoreRanking(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("scoreRanking");
		useMember(member);
		return member;
	}

	public StringAttribute operationCompany(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("operationCompany");
		useMember(member);
		return member;
	}

	public StringAttribute giantArea(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("giantArea");
		useMember(member);
		return member;
	}

	public NumberAttribute openedStoreCount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("openedStoreCount");
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

	public NumberAttribute recommendedStoreCount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("recommendedStoreCount");
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

