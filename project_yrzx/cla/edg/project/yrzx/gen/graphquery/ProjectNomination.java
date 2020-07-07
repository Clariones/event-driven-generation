package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectNomination extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.projectnomination.ProjectNomination";
  }
  // 枚举对象

  // 引用的对象

  public ProjectOrganizationType type() {
    ProjectOrganizationType member = new ProjectOrganizationType();
    member.setModelTypeName("project_organization_type");
    member.setName("type");
    member.setMemberName("type");
    member.setReferDirection(true);
    member.setRelationName("type");
    append(member);
    return member;
  }

  public EmployeeNomination worker() {
    EmployeeNomination member = new EmployeeNomination();
    member.setModelTypeName("employee_nomination");
    member.setName("worker");
    member.setMemberName("worker");
    member.setReferDirection(true);
    member.setRelationName("worker");
    append(member);
    return member;
  }

  public ProjectRole projectRole() {
    ProjectRole member = new ProjectRole();
    member.setModelTypeName("project_role");
    member.setName("project_role");
    member.setMemberName("projectRole");
    member.setReferDirection(true);
    member.setRelationName("projectRole");
    append(member);
    return member;
  }

  public Project project() {
    Project member = new Project();
    member.setModelTypeName("project");
    member.setName("project");
    member.setMemberName("project");
    member.setReferDirection(true);
    member.setRelationName("project");
    append(member);
    return member;
  }

  public WorkPackage workPackage() {
    WorkPackage member = new WorkPackage();
    member.setModelTypeName("work_package");
    member.setName("work_package");
    member.setMemberName("workPackage");
    member.setReferDirection(true);
    member.setRelationName("workPackage");
    append(member);
    return member;
  }

  // 被引用的对象

  public ContractReviewRecord contractReviewRecordList() {
    ContractReviewRecord member = new ContractReviewRecord();
    member.setModelTypeName("contract_review_record");
    member.setName("reviewer");
    member.setMemberName("contractReviewRecordList");
    member.setRelationName("reviewer");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ContractCommentsRecord contractCommentsRecordList() {
    ContractCommentsRecord member = new ContractCommentsRecord();
    member.setModelTypeName("contract_comments_record");
    member.setName("submitter");
    member.setMemberName("contractCommentsRecordList");
    member.setRelationName("submitter");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ProjectMaterialReviewRecord projectMaterialReviewRecordList() {
    ProjectMaterialReviewRecord member = new ProjectMaterialReviewRecord();
    member.setModelTypeName("project_material_review_record");
    member.setName("reviewer");
    member.setMemberName("projectMaterialReviewRecordList");
    member.setRelationName("reviewer");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ProjectMaterialCommentsRecord projectMaterialCommentsRecordList() {
    ProjectMaterialCommentsRecord member = new ProjectMaterialCommentsRecord();
    member.setModelTypeName("project_material_comments_record");
    member.setName("submitter");
    member.setMemberName("projectMaterialCommentsRecordList");
    member.setRelationName("submitter");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ProjectAcceptance projectAcceptanceList() {
    ProjectAcceptance member = new ProjectAcceptance();
    member.setModelTypeName("project_acceptance");
    member.setName("application_unit");
    member.setMemberName("projectAcceptanceList");
    member.setRelationName("applicationUnit");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public AfterSales afterSalesList() {
    AfterSales member = new AfterSales();
    member.setModelTypeName("after_sales");
    member.setName("solver");
    member.setMemberName("afterSalesList");
    member.setRelationName("solver");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public LaborWageManagementSheet laborWageManagementSheetListAsContractPaymentManager() {
    LaborWageManagementSheet member = new LaborWageManagementSheet();
    member.setModelTypeName("labor_wage_management_sheet");
    member.setName("contract_payment_manager");
    member.setMemberName("laborWageManagementSheetListAsContractPaymentManager");
    member.setRelationName("contractPaymentManager");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public LaborWageManagementSheet laborWageManagementSheetListAsPlatformLaborManager() {
    LaborWageManagementSheet member = new LaborWageManagementSheet();
    member.setModelTypeName("labor_wage_management_sheet");
    member.setName("platform_labor_manager");
    member.setMemberName("laborWageManagementSheetListAsPlatformLaborManager");
    member.setRelationName("contractPaymentManager");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public LaborWageManagementSheet laborWageManagementSheetListAsPaymentManager() {
    LaborWageManagementSheet member = new LaborWageManagementSheet();
    member.setModelTypeName("labor_wage_management_sheet");
    member.setName("payment_manager");
    member.setMemberName("laborWageManagementSheetListAsPaymentManager");
    member.setRelationName("contractPaymentManager");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public LaborDispute laborDisputeList() {
    LaborDispute member = new LaborDispute();
    member.setModelTypeName("labor_dispute");
    member.setName("applicant");
    member.setMemberName("laborDisputeList");
    member.setRelationName("applicant");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ProjectReport projectReportList() {
    ProjectReport member = new ProjectReport();
    member.setModelTypeName("project_report");
    member.setName("submitter");
    member.setMemberName("projectReportList");
    member.setRelationName("submitter");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ProjectCommandAssignment projectCommandAssignmentList() {
    ProjectCommandAssignment member = new ProjectCommandAssignment();
    member.setModelTypeName("project_command_assignment");
    member.setName("reciever");
    member.setMemberName("projectCommandAssignmentList");
    member.setRelationName("reciever");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaterialPreservedSample materialPreservedSampleList() {
    MaterialPreservedSample member = new MaterialPreservedSample();
    member.setModelTypeName("material_preserved_sample");
    member.setName("material_manager");
    member.setMemberName("materialPreservedSampleList");
    member.setRelationName("materialManager");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaterialBidSample materialBidSampleList() {
    MaterialBidSample member = new MaterialBidSample();
    member.setModelTypeName("material_bid_sample");
    member.setName("material_manager");
    member.setMemberName("materialBidSampleList");
    member.setRelationName("materialManager");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaterialChange materialChangeList() {
    MaterialChange member = new MaterialChange();
    member.setModelTypeName("material_change");
    member.setName("applicant");
    member.setMemberName("materialChangeList");
    member.setRelationName("applicant");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaterialAcceptanceApplication materialAcceptanceApplicationList() {
    MaterialAcceptanceApplication member = new MaterialAcceptanceApplication();
    member.setModelTypeName("material_acceptance_application");
    member.setName("auditor");
    member.setMemberName("materialAcceptanceApplicationList");
    member.setRelationName("auditor");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventMaterialChangeInfo eventMaterialChangeInfoList() {
    EventMaterialChangeInfo member = new EventMaterialChangeInfo();
    member.setModelTypeName("event_material_change_info");
    member.setName("applicant");
    member.setMemberName("eventMaterialChangeInfoList");
    member.setRelationName("applicant");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventMaterialAcceptanceBasicInfo eventMaterialAcceptanceBasicInfoList() {
    EventMaterialAcceptanceBasicInfo member = new EventMaterialAcceptanceBasicInfo();
    member.setModelTypeName("event_material_acceptance_basic_info");
    member.setName("auditor");
    member.setMemberName("eventMaterialAcceptanceBasicInfoList");
    member.setRelationName("auditor");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventMaterialPreservedInfo eventMaterialPreservedInfoList() {
    EventMaterialPreservedInfo member = new EventMaterialPreservedInfo();
    member.setModelTypeName("event_material_preserved_info");
    member.setName("material_manager");
    member.setMemberName("eventMaterialPreservedInfoList");
    member.setRelationName("materialManager");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventLaborDispute eventLaborDisputeList() {
    EventLaborDispute member = new EventLaborDispute();
    member.setModelTypeName("event_labor_dispute");
    member.setName("applicant");
    member.setMemberName("eventLaborDisputeList");
    member.setRelationName("applicant");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  // 普通属性

  public StringAttribute id() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("id");
    member.setName("id");
    useMember(member);
    return member;
  }

  public StringAttribute title() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("title");
    member.setName("title");
    useMember(member);
    return member;
  }

  public BooleanAttribute active() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("active");
    member.setName("active");
    useMember(member);
    return member;
  }

  public StringAttribute description() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("description");
    member.setName("description");
    useMember(member);
    return member;
  }

  public DateTimeAttribute createTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("createTime");
    member.setName("create_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute lastUpdateTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_update");
    // member.setName("lastUpdateTime");
    member.setName("last_update_time");
    useMember(member);
    return member;
  }

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
