package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EmployeePerformance extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.employeeperformance.EmployeePerformance";
	}
	// 枚举对象

	// 引用的对象

	public Merchant employee() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("employee");
		member.setMemberName("employee");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant employer() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("employer");
		member.setMemberName("employer");
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

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute summary(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("summary");
		useMember(member);
		return member;
	}

	public NumberAttribute projectRating(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("projectRating");
		useMember(member);
		return member;
	}

	public NumberAttribute workPackageRating(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("workPackageRating");
		useMember(member);
		return member;
	}

	public NumberAttribute taskRating(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("taskRating");
		useMember(member);
		return member;
	}

	public NumberAttribute clientRating(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("clientRating");
		useMember(member);
		return member;
	}

	public StringAttribute ratingMonth(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("ratingMonth");
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

