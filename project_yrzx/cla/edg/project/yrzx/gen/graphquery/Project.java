package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Project extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.project.Project";
	}
	// 枚举对象

	// 引用的对象

	public Merchant projectOwner() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("project_owner");
		member.setMemberName("projectOwner");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant store() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("store");
		member.setMemberName("store");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant partner() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("partner");
		member.setMemberName("partner");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ProjectType projectType() {
		ProjectType member = new ProjectType();
		member.setModelTypeName("project_type");
		member.setName("project_type");
		member.setMemberName("projectType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ProjectServiceType projectServiceType() {
		ProjectServiceType member = new ProjectServiceType();
		member.setModelTypeName("project_service_type");
		member.setName("project_service_type");
		member.setMemberName("projectServiceType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ProjectPhase projectPhase() {
		ProjectPhase member = new ProjectPhase();
		member.setModelTypeName("project_phase");
		member.setName("project_phase");
		member.setMemberName("projectPhase");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public WorkingStatus designStatus() {
		WorkingStatus member = new WorkingStatus();
		member.setModelTypeName("working_status");
		member.setName("design_status");
		member.setMemberName("designStatus");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public WorkingStatus constructionStatus() {
		WorkingStatus member = new WorkingStatus();
		member.setModelTypeName("working_status");
		member.setName("construction_status");
		member.setMemberName("constructionStatus");
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
	
	public StandardContract standardContractList() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("project");
		member.setMemberName("standardContractList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectNomination projectNominationList() {
		ProjectNomination member = new ProjectNomination();
		member.setModelTypeName("project_nomination");
		member.setName("project");
		member.setMemberName("projectNominationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WorkPackage workPackageList() {
		WorkPackage member = new WorkPackage();
		member.setModelTypeName("work_package");
		member.setName("project");
		member.setMemberName("workPackageList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectOrganization projectOrganizationList() {
		ProjectOrganization member = new ProjectOrganization();
		member.setModelTypeName("project_organization");
		member.setName("project");
		member.setMemberName("projectOrganizationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectMaterial projectMaterialList() {
		ProjectMaterial member = new ProjectMaterial();
		member.setModelTypeName("project_material");
		member.setName("project");
		member.setMemberName("projectMaterialList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public YourongProjectBook yourongProjectBookList() {
		YourongProjectBook member = new YourongProjectBook();
		member.setModelTypeName("yourong_project_book");
		member.setName("project");
		member.setMemberName("yourongProjectBookList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EventAfterSales eventAfterSalesList() {
		EventAfterSales member = new EventAfterSales();
		member.setModelTypeName("event_after_sales");
		member.setName("project");
		member.setMemberName("eventAfterSalesList");
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

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("description");
		useMember(member);
		return member;
	}

	public StringAttribute location(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("location");
		useMember(member);
		return member;
	}

	public NumberAttribute projectArea(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("projectArea");
		useMember(member);
		return member;
	}

	public NumberAttribute projectRoughBudget(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("projectRoughBudget");
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

