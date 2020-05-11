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
		member.setRelationName("projectOwner");
		append(member);
		return member;
	}

	public Merchant store() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("store");
		member.setMemberName("store");
		member.setReferDirection(true);
		member.setRelationName("store");
		append(member);
		return member;
	}

	public Merchant partner() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("partner");
		member.setMemberName("partner");
		member.setReferDirection(true);
		member.setRelationName("partner");
		append(member);
		return member;
	}

	public ProjectType projectType() {
		ProjectType member = new ProjectType();
		member.setModelTypeName("project_type");
		member.setName("project_type");
		member.setMemberName("projectType");
		member.setReferDirection(true);
		member.setRelationName("projectType");
		append(member);
		return member;
	}

	public ProjectServiceType projectServiceType() {
		ProjectServiceType member = new ProjectServiceType();
		member.setModelTypeName("project_service_type");
		member.setName("project_service_type");
		member.setMemberName("projectServiceType");
		member.setReferDirection(true);
		member.setRelationName("projectServiceType");
		append(member);
		return member;
	}

	public ProjectPhase projectPhase() {
		ProjectPhase member = new ProjectPhase();
		member.setModelTypeName("project_phase");
		member.setName("project_phase");
		member.setMemberName("projectPhase");
		member.setReferDirection(true);
		member.setRelationName("projectPhase");
		append(member);
		return member;
	}

	public WorkingStatus designStatus() {
		WorkingStatus member = new WorkingStatus();
		member.setModelTypeName("working_status");
		member.setName("design_status");
		member.setMemberName("designStatus");
		member.setReferDirection(true);
		member.setRelationName("designStatus");
		append(member);
		return member;
	}

	public WorkingStatus constructionStatus() {
		WorkingStatus member = new WorkingStatus();
		member.setModelTypeName("working_status");
		member.setName("construction_status");
		member.setMemberName("constructionStatus");
		member.setReferDirection(true);
		member.setRelationName("constructionStatus");
		append(member);
		return member;
	}

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		member.setRelationName("platform");
		append(member);
		return member;
	}

	// 被引用的对象

	public StandardContract standardContractList() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("project");
		member.setMemberName("standardContractList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public WorkPackage workPackageList() {
		WorkPackage member = new WorkPackage();
		member.setModelTypeName("work_package");
		member.setName("project");
		member.setMemberName("workPackageList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectImage projectImageList() {
		ProjectImage member = new ProjectImage();
		member.setModelTypeName("project_image");
		member.setName("project");
		member.setMemberName("projectImageList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectNomination projectNominationList() {
		ProjectNomination member = new ProjectNomination();
		member.setModelTypeName("project_nomination");
		member.setName("project");
		member.setMemberName("projectNominationList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectProgress projectProgressList() {
		ProjectProgress member = new ProjectProgress();
		member.setModelTypeName("project_progress");
		member.setName("project");
		member.setMemberName("projectProgressList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectMaterial projectMaterialList() {
		ProjectMaterial member = new ProjectMaterial();
		member.setModelTypeName("project_material");
		member.setName("project");
		member.setMemberName("projectMaterialList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public YourongProjectBook yourongProjectBookList() {
		YourongProjectBook member = new YourongProjectBook();
		member.setModelTypeName("yourong_project_book");
		member.setName("project");
		member.setMemberName("yourongProjectBookList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectAcceptance projectAcceptanceList() {
		ProjectAcceptance member = new ProjectAcceptance();
		member.setModelTypeName("project_acceptance");
		member.setName("project");
		member.setMemberName("projectAcceptanceList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public AfterSales afterSalesList() {
		AfterSales member = new AfterSales();
		member.setModelTypeName("after_sales");
		member.setName("project");
		member.setMemberName("afterSalesList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectPenalties projectPenaltiesList() {
		ProjectPenalties member = new ProjectPenalties();
		member.setModelTypeName("project_penalties");
		member.setName("project");
		member.setMemberName("projectPenaltiesList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LaborWageManagementSheet laborWageManagementSheetList() {
		LaborWageManagementSheet member = new LaborWageManagementSheet();
		member.setModelTypeName("labor_wage_management_sheet");
		member.setName("project");
		member.setMemberName("laborWageManagementSheetList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectReport projectReportList() {
		ProjectReport member = new ProjectReport();
		member.setModelTypeName("project_report");
		member.setName("project");
		member.setMemberName("projectReportList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectCommand projectCommandList() {
		ProjectCommand member = new ProjectCommand();
		member.setModelTypeName("project_command");
		member.setName("project");
		member.setMemberName("projectCommandList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LoanApplication loanApplicationList() {
		LoanApplication member = new LoanApplication();
		member.setModelTypeName("loan_application");
		member.setName("loan_project");
		member.setMemberName("loanApplicationList");
		member.setRelationName("loanProject");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectStatisticReport projectStatisticReportList() {
		ProjectStatisticReport member = new ProjectStatisticReport();
		member.setModelTypeName("project_statistic_report");
		member.setName("project");
		member.setMemberName("projectStatisticReportList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectAttractInvestment projectAttractInvestmentList() {
		ProjectAttractInvestment member = new ProjectAttractInvestment();
		member.setModelTypeName("project_attract_investment");
		member.setName("project");
		member.setMemberName("projectAttractInvestmentList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectSettlement projectSettlementList() {
		ProjectSettlement member = new ProjectSettlement();
		member.setModelTypeName("project_settlement");
		member.setName("project");
		member.setMemberName("projectSettlementList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectDailyReport projectDailyReportList() {
		ProjectDailyReport member = new ProjectDailyReport();
		member.setModelTypeName("project_daily_report");
		member.setName("project");
		member.setMemberName("projectDailyReportList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectProgressReport projectProgressReportList() {
		ProjectProgressReport member = new ProjectProgressReport();
		member.setModelTypeName("project_progress_report");
		member.setName("project");
		member.setMemberName("projectProgressReportList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Design designList() {
		Design member = new Design();
		member.setModelTypeName("design");
		member.setName("project");
		member.setMemberName("designList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ConstructionSchema constructionSchemaList() {
		ConstructionSchema member = new ConstructionSchema();
		member.setModelTypeName("construction_schema");
		member.setName("project");
		member.setMemberName("constructionSchemaList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public DesignChange designChangeList() {
		DesignChange member = new DesignChange();
		member.setModelTypeName("design_change");
		member.setName("project");
		member.setMemberName("designChangeList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Violation violationList() {
		Violation member = new Violation();
		member.setModelTypeName("violation");
		member.setName("project");
		member.setMemberName("violationList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectFunding projectFundingList() {
		ProjectFunding member = new ProjectFunding();
		member.setModelTypeName("project_funding");
		member.setName("project");
		member.setMemberName("projectFundingList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ConstructionStartWorkingFiles constructionStartWorkingFilesList() {
		ConstructionStartWorkingFiles member = new ConstructionStartWorkingFiles();
		member.setModelTypeName("construction_start_working_files");
		member.setName("project");
		member.setMemberName("constructionStartWorkingFilesList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public QualitiyAcceptanceFiles qualitiyAcceptanceFilesList() {
		QualitiyAcceptanceFiles member = new QualitiyAcceptanceFiles();
		member.setModelTypeName("qualitiy_acceptance_files");
		member.setName("project");
		member.setMemberName("qualitiyAcceptanceFilesList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EngineeringExperimentFiles engineeringExperimentFilesList() {
		EngineeringExperimentFiles member = new EngineeringExperimentFiles();
		member.setModelTypeName("engineering_experiment_files");
		member.setName("project");
		member.setMemberName("engineeringExperimentFilesList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ConstructionProcessFiles constructionProcessFilesList() {
		ConstructionProcessFiles member = new ConstructionProcessFiles();
		member.setModelTypeName("construction_process_files");
		member.setName("project");
		member.setMemberName("constructionProcessFilesList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public NecessarySupplementFiles necessarySupplementFilesList() {
		NecessarySupplementFiles member = new NecessarySupplementFiles();
		member.setModelTypeName("necessary_supplement_files");
		member.setName("project");
		member.setMemberName("necessarySupplementFilesList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ConstructionCompletionFiles constructionCompletionFilesList() {
		ConstructionCompletionFiles member = new ConstructionCompletionFiles();
		member.setModelTypeName("construction_completion_files");
		member.setName("project");
		member.setMemberName("constructionCompletionFilesList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EngineeringQualitySupervisionFiles engineeringQualitySupervisionFilesList() {
		EngineeringQualitySupervisionFiles member = new EngineeringQualitySupervisionFiles();
		member.setModelTypeName("engineering_quality_supervision_files");
		member.setName("project");
		member.setMemberName("engineeringQualitySupervisionFilesList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectFilesArchive projectFilesArchiveList() {
		ProjectFilesArchive member = new ProjectFilesArchive();
		member.setModelTypeName("project_files_archive");
		member.setName("project");
		member.setMemberName("projectFilesArchiveList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EngineeringQualitySupervisionArchive engineeringQualitySupervisionArchiveList() {
		EngineeringQualitySupervisionArchive member = new EngineeringQualitySupervisionArchive();
		member.setModelTypeName("engineering_quality_supervision_archive");
		member.setName("project");
		member.setMemberName("engineeringQualitySupervisionArchiveList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectObjective projectObjectiveList() {
		ProjectObjective member = new ProjectObjective();
		member.setModelTypeName("project_objective");
		member.setName("project");
		member.setMemberName("projectObjectiveList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectProgressFundingTrusteeshipPlan projectProgressFundingTrusteeshipPlanList() {
		ProjectProgressFundingTrusteeshipPlan member = new ProjectProgressFundingTrusteeshipPlan();
		member.setModelTypeName("project_progress_funding_trusteeship_plan");
		member.setName("project");
		member.setMemberName("projectProgressFundingTrusteeshipPlanList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectCloseTrusteeshipContract projectCloseTrusteeshipContractList() {
		ProjectCloseTrusteeshipContract member = new ProjectCloseTrusteeshipContract();
		member.setModelTypeName("project_close_trusteeship_contract");
		member.setName("project");
		member.setMemberName("projectCloseTrusteeshipContractList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectAcceptanceSettlement projectAcceptanceSettlementList() {
		ProjectAcceptanceSettlement member = new ProjectAcceptanceSettlement();
		member.setModelTypeName("project_acceptance_settlement");
		member.setName("project");
		member.setMemberName("projectAcceptanceSettlementList");
		member.setRelationName("project");
		member.setReferDirection(false);
		append(member);
		return member;
	}


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("title");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("description");
		member.setName("description");
		useMember(member);
		return member;
	}

	public StringAttribute location(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("location");
		member.setName("location");
		useMember(member);
		return member;
	}

	public NumberAttribute projectArea(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		// member.setName("projectArea");
		member.setName("project_area");
		useMember(member);
		return member;
	}

	public NumberAttribute projectRoughBudget(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("projectRoughBudget");
		member.setName("project_rough_budget");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("createTime");
		member.setName("create_time");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		// member.setName("lastUpdateTime");
		member.setName("last_update_time");
		useMember(member);
		return member;
	}

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

