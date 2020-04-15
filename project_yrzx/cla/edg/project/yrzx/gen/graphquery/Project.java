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
	
	public ProjectImage projectImageList() {
		ProjectImage member = new ProjectImage();
		member.setModelTypeName("project_image");
		member.setName("project");
		member.setMemberName("projectImageList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectParticipatorContract projectParticipatorContractList() {
		ProjectParticipatorContract member = new ProjectParticipatorContract();
		member.setModelTypeName("project_participator_contract");
		member.setName("project");
		member.setMemberName("projectParticipatorContractList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectRunningContract projectRunningContractList() {
		ProjectRunningContract member = new ProjectRunningContract();
		member.setModelTypeName("project_running_contract");
		member.setName("project");
		member.setMemberName("projectRunningContractList");
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
	
	public ProjectDocument projectDocumentList() {
		ProjectDocument member = new ProjectDocument();
		member.setModelTypeName("project_document");
		member.setName("project");
		member.setMemberName("projectDocumentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectJobAssignment projectJobAssignmentList() {
		ProjectJobAssignment member = new ProjectJobAssignment();
		member.setModelTypeName("project_job_assignment");
		member.setName("project");
		member.setMemberName("projectJobAssignmentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectJobAssignmentRecord projectJobAssignmentRecordList() {
		ProjectJobAssignmentRecord member = new ProjectJobAssignmentRecord();
		member.setModelTypeName("project_job_assignment_record");
		member.setName("project");
		member.setMemberName("projectJobAssignmentRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectSubcontractAssignment projectSubcontractAssignmentList() {
		ProjectSubcontractAssignment member = new ProjectSubcontractAssignment();
		member.setModelTypeName("project_subcontract_assignment");
		member.setName("project");
		member.setMemberName("projectSubcontractAssignmentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectProgress projectProgressList() {
		ProjectProgress member = new ProjectProgress();
		member.setModelTypeName("project_progress");
		member.setName("project");
		member.setMemberName("projectProgressList");
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
	
	public ProjectDailyReport projectDailyReportList() {
		ProjectDailyReport member = new ProjectDailyReport();
		member.setModelTypeName("project_daily_report");
		member.setName("project");
		member.setMemberName("projectDailyReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectNotification projectNotificationList() {
		ProjectNotification member = new ProjectNotification();
		member.setModelTypeName("project_notification");
		member.setName("project");
		member.setMemberName("projectNotificationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ViolationItem violationItemList() {
		ViolationItem member = new ViolationItem();
		member.setModelTypeName("violation_item");
		member.setName("project");
		member.setMemberName("violationItemList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public YourongBill yourongBillList() {
		YourongBill member = new YourongBill();
		member.setModelTypeName("yourong_bill");
		member.setName("project");
		member.setMemberName("yourongBillList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MaintainanceRequirement maintainanceRequirementList() {
		MaintainanceRequirement member = new MaintainanceRequirement();
		member.setModelTypeName("maintainance_requirement");
		member.setName("project");
		member.setMemberName("maintainanceRequirementList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public LoanApplication loanApplicationList() {
		LoanApplication member = new LoanApplication();
		member.setModelTypeName("loan_application");
		member.setName("loan_project");
		member.setMemberName("loanApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectStatisticReport projectStatisticReportList() {
		ProjectStatisticReport member = new ProjectStatisticReport();
		member.setModelTypeName("project_statistic_report");
		member.setName("project");
		member.setMemberName("projectStatisticReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectAttractInvestment projectAttractInvestmentList() {
		ProjectAttractInvestment member = new ProjectAttractInvestment();
		member.setModelTypeName("project_attract_investment");
		member.setName("project");
		member.setMemberName("projectAttractInvestmentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectSettlement projectSettlementList() {
		ProjectSettlement member = new ProjectSettlement();
		member.setModelTypeName("project_settlement");
		member.setName("project");
		member.setMemberName("projectSettlementList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectReport projectReportList() {
		ProjectReport member = new ProjectReport();
		member.setModelTypeName("project_report");
		member.setName("project");
		member.setMemberName("projectReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Design designList() {
		Design member = new Design();
		member.setModelTypeName("design");
		member.setName("project");
		member.setMemberName("designList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ConstructionSchema constructionSchemaList() {
		ConstructionSchema member = new ConstructionSchema();
		member.setModelTypeName("construction_schema");
		member.setName("project");
		member.setMemberName("constructionSchemaList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public DesignChange designChangeList() {
		DesignChange member = new DesignChange();
		member.setModelTypeName("design_change");
		member.setName("project");
		member.setMemberName("designChangeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Violation violationList() {
		Violation member = new Violation();
		member.setModelTypeName("violation");
		member.setName("project");
		member.setMemberName("violationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectFunding projectFundingList() {
		ProjectFunding member = new ProjectFunding();
		member.setModelTypeName("project_funding");
		member.setName("project");
		member.setMemberName("projectFundingList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ConstructionStartWorkingFiles constructionStartWorkingFilesList() {
		ConstructionStartWorkingFiles member = new ConstructionStartWorkingFiles();
		member.setModelTypeName("construction_start_working_files");
		member.setName("project");
		member.setMemberName("constructionStartWorkingFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public QualitiyAcceptanceFiles qualitiyAcceptanceFilesList() {
		QualitiyAcceptanceFiles member = new QualitiyAcceptanceFiles();
		member.setModelTypeName("qualitiy_acceptance_files");
		member.setName("project");
		member.setMemberName("qualitiyAcceptanceFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EngineeringExperimentFiles engineeringExperimentFilesList() {
		EngineeringExperimentFiles member = new EngineeringExperimentFiles();
		member.setModelTypeName("engineering_experiment_files");
		member.setName("project");
		member.setMemberName("engineeringExperimentFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ConstructionProcessFiles constructionProcessFilesList() {
		ConstructionProcessFiles member = new ConstructionProcessFiles();
		member.setModelTypeName("construction_process_files");
		member.setName("project");
		member.setMemberName("constructionProcessFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public NecessarySupplementFiles necessarySupplementFilesList() {
		NecessarySupplementFiles member = new NecessarySupplementFiles();
		member.setModelTypeName("necessary_supplement_files");
		member.setName("project");
		member.setMemberName("necessarySupplementFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ConstructionCompletionFiles constructionCompletionFilesList() {
		ConstructionCompletionFiles member = new ConstructionCompletionFiles();
		member.setModelTypeName("construction_completion_files");
		member.setName("project");
		member.setMemberName("constructionCompletionFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EngineeringQualitySupervisionFiles engineeringQualitySupervisionFilesList() {
		EngineeringQualitySupervisionFiles member = new EngineeringQualitySupervisionFiles();
		member.setModelTypeName("engineering_quality_supervision_files");
		member.setName("project");
		member.setMemberName("engineeringQualitySupervisionFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectFilesArchive projectFilesArchiveList() {
		ProjectFilesArchive member = new ProjectFilesArchive();
		member.setModelTypeName("project_files_archive");
		member.setName("project");
		member.setMemberName("projectFilesArchiveList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EngineeringQualitySupervisionArchive engineeringQualitySupervisionArchiveList() {
		EngineeringQualitySupervisionArchive member = new EngineeringQualitySupervisionArchive();
		member.setModelTypeName("engineering_quality_supervision_archive");
		member.setName("project");
		member.setMemberName("engineeringQualitySupervisionArchiveList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectObjective projectObjectiveList() {
		ProjectObjective member = new ProjectObjective();
		member.setModelTypeName("project_objective");
		member.setName("project");
		member.setMemberName("projectObjectiveList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectProgressFundingTrusteeshipPlan projectProgressFundingTrusteeshipPlanList() {
		ProjectProgressFundingTrusteeshipPlan member = new ProjectProgressFundingTrusteeshipPlan();
		member.setModelTypeName("project_progress_funding_trusteeship_plan");
		member.setName("project");
		member.setMemberName("projectProgressFundingTrusteeshipPlanList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectCloseTrusteeshipContract projectCloseTrusteeshipContractList() {
		ProjectCloseTrusteeshipContract member = new ProjectCloseTrusteeshipContract();
		member.setModelTypeName("project_close_trusteeship_contract");
		member.setName("project");
		member.setMemberName("projectCloseTrusteeshipContractList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectAcceptanceSettlement projectAcceptanceSettlementList() {
		ProjectAcceptanceSettlement member = new ProjectAcceptanceSettlement();
		member.setModelTypeName("project_acceptance_settlement");
		member.setName("project");
		member.setMemberName("projectAcceptanceSettlementList");
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

