package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class FinancialBusinessConfiguration extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.financialbusinessconfiguration.FinancialBusinessConfiguration";
	}
	// 枚举对象

	// 引用的对象

	public PlatformConfiguration platformConfiguration() {
		PlatformConfiguration member = new PlatformConfiguration();
		member.setModelTypeName("platform_configuration");
		member.setName("platform_configuration");
		member.setMemberName("platformConfiguration");
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

	public NumberAttribute withdrawRatio(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("withdrawRatio");
		useMember(member);
		return member;
	}

	public NumberAttribute monthlyLendingRatio(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("monthlyLendingRatio");
		useMember(member);
		return member;
	}

	public NumberAttribute lendingAmountPercentage(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("lendingAmountPercentage");
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

