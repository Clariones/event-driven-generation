package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MaintainanceRequirement extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.maintainancerequirement.MaintainanceRequirement";
	}
	// 枚举对象

	// 引用的对象

	public CustomerApplicationStatus status() {
		CustomerApplicationStatus member = new CustomerApplicationStatus();
		member.setModelTypeName("customer_application_status");
		member.setName("status");
		member.setMemberName("status");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant applicantMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("applicant_merchant");
		member.setMemberName("applicantMerchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public EmployeeNomination applicantEmployee() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("applicant_employee");
		member.setMemberName("applicantEmployee");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Project project() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project");
		member.setMemberName("project");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public WorkPackage workPackage() {
		WorkPackage member = new WorkPackage();
		member.setModelTypeName("work_package");
		member.setName("work_package");
		member.setMemberName("workPackage");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Task task() {
		Task member = new Task();
		member.setModelTypeName("task");
		member.setName("task");
		member.setMemberName("task");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public MaintainanceProcessRecord maintainanceProcessRecordList() {
		MaintainanceProcessRecord member = new MaintainanceProcessRecord();
		member.setModelTypeName("maintainance_process_record");
		member.setName("maintainance_requirement");
		member.setMemberName("maintainanceProcessRecordList");
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

	public StringAttribute content(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("content");
		useMember(member);
		return member;
	}

	public StringAttribute image1(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image1");
		useMember(member);
		return member;
	}

	public StringAttribute image2(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image2");
		useMember(member);
		return member;
	}

	public StringAttribute image3(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image3");
		useMember(member);
		return member;
	}

	public StringAttribute image4(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image4");
		useMember(member);
		return member;
	}

	public StringAttribute image5(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image5");
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

