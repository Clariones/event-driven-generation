package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ChangeRequest extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.changerequest.ChangeRequest";
	}
	// 枚举对象

	// 引用的对象

	public ChangeRequestType requestType() {
		ChangeRequestType member = new ChangeRequestType();
		member.setModelTypeName("change_request_type");
		member.setName("request_type");
		member.setMemberName("requestType");
		member.setReferDirection(true);
		member.setRelationName("requestType");
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

	public EventShowAllTypeStepTwo eventShowAllTypeStepTwoList() {
		EventShowAllTypeStepTwo member = new EventShowAllTypeStepTwo();
		member.setModelTypeName("event_show_all_type_step_two");
		member.setName("change_request");
		member.setMemberName("eventShowAllTypeStepTwoList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventAdditionalContractPaymentPhase eventAdditionalContractPaymentPhaseList() {
		EventAdditionalContractPaymentPhase member = new EventAdditionalContractPaymentPhase();
		member.setModelTypeName("event_additional_contract_payment_phase");
		member.setName("change_request");
		member.setMemberName("eventAdditionalContractPaymentPhaseList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventResolveAfterSales eventResolveAfterSalesList() {
		EventResolveAfterSales member = new EventResolveAfterSales();
		member.setModelTypeName("event_resolve_after_sales");
		member.setName("change_request");
		member.setMemberName("eventResolveAfterSalesList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventApplyRecommendation eventApplyRecommendationList() {
		EventApplyRecommendation member = new EventApplyRecommendation();
		member.setModelTypeName("event_apply_recommendation");
		member.setName("change_request");
		member.setMemberName("eventApplyRecommendationList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventAddDebitCard eventAddDebitCardList() {
		EventAddDebitCard member = new EventAddDebitCard();
		member.setModelTypeName("event_add_debit_card");
		member.setName("change_request");
		member.setMemberName("eventAddDebitCardList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventMaterialAcceptanceImage eventMaterialAcceptanceImageList() {
		EventMaterialAcceptanceImage member = new EventMaterialAcceptanceImage();
		member.setModelTypeName("event_material_acceptance_image");
		member.setName("change_request");
		member.setMemberName("eventMaterialAcceptanceImageList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventAdditionalContractBasicInfo eventAdditionalContractBasicInfoList() {
		EventAdditionalContractBasicInfo member = new EventAdditionalContractBasicInfo();
		member.setModelTypeName("event_additional_contract_basic_info");
		member.setName("change_request");
		member.setMemberName("eventAdditionalContractBasicInfoList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventMaterialCheck eventMaterialCheckList() {
		EventMaterialCheck member = new EventMaterialCheck();
		member.setModelTypeName("event_material_check");
		member.setName("change_request");
		member.setMemberName("eventMaterialCheckList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventProjectCommand eventProjectCommandList() {
		EventProjectCommand member = new EventProjectCommand();
		member.setModelTypeName("event_project_command");
		member.setName("change_request");
		member.setMemberName("eventProjectCommandList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventAddEmployee eventAddEmployeeList() {
		EventAddEmployee member = new EventAddEmployee();
		member.setModelTypeName("event_add_employee");
		member.setName("change_request");
		member.setMemberName("eventAddEmployeeList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventAcceptanceApplication eventAcceptanceApplicationList() {
		EventAcceptanceApplication member = new EventAcceptanceApplication();
		member.setModelTypeName("event_acceptance_application");
		member.setName("change_request");
		member.setMemberName("eventAcceptanceApplicationList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventCommonReport eventCommonReportList() {
		EventCommonReport member = new EventCommonReport();
		member.setModelTypeName("event_common_report");
		member.setName("change_request");
		member.setMemberName("eventCommonReportList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventApplyPersonalEmplacement eventApplyPersonalEmplacementList() {
		EventApplyPersonalEmplacement member = new EventApplyPersonalEmplacement();
		member.setModelTypeName("event_apply_personal_emplacement");
		member.setName("change_request");
		member.setMemberName("eventApplyPersonalEmplacementList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventMaterialChangeInfo eventMaterialChangeInfoList() {
		EventMaterialChangeInfo member = new EventMaterialChangeInfo();
		member.setModelTypeName("event_material_change_info");
		member.setName("change_request");
		member.setMemberName("eventMaterialChangeInfoList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventContractBasicInfo eventContractBasicInfoList() {
		EventContractBasicInfo member = new EventContractBasicInfo();
		member.setModelTypeName("event_contract_basic_info");
		member.setName("change_request");
		member.setMemberName("eventContractBasicInfoList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventMaterialAcceptanceBasicInfo eventMaterialAcceptanceBasicInfoList() {
		EventMaterialAcceptanceBasicInfo member = new EventMaterialAcceptanceBasicInfo();
		member.setModelTypeName("event_material_acceptance_basic_info");
		member.setName("change_request");
		member.setMemberName("eventMaterialAcceptanceBasicInfoList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventMaterialReview eventMaterialReviewList() {
		EventMaterialReview member = new EventMaterialReview();
		member.setModelTypeName("event_material_review");
		member.setName("change_request");
		member.setMemberName("eventMaterialReviewList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventMaterialPreservedInfo eventMaterialPreservedInfoList() {
		EventMaterialPreservedInfo member = new EventMaterialPreservedInfo();
		member.setModelTypeName("event_material_preserved_info");
		member.setName("change_request");
		member.setMemberName("eventMaterialPreservedInfoList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventMaterialChangeContractInfo eventMaterialChangeContractInfoList() {
		EventMaterialChangeContractInfo member = new EventMaterialChangeContractInfo();
		member.setModelTypeName("event_material_change_contract_info");
		member.setName("change_request");
		member.setMemberName("eventMaterialChangeContractInfoList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventReview eventReviewList() {
		EventReview member = new EventReview();
		member.setModelTypeName("event_review");
		member.setName("change_request");
		member.setMemberName("eventReviewList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventMaterialChangeDataUpload eventMaterialChangeDataUploadList() {
		EventMaterialChangeDataUpload member = new EventMaterialChangeDataUpload();
		member.setModelTypeName("event_material_change_data_upload");
		member.setName("change_request");
		member.setMemberName("eventMaterialChangeDataUploadList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventFillPersonalDetail eventFillPersonalDetailList() {
		EventFillPersonalDetail member = new EventFillPersonalDetail();
		member.setModelTypeName("event_fill_personal_detail");
		member.setName("change_request");
		member.setMemberName("eventFillPersonalDetailList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventProjectWorkPosition eventProjectWorkPositionList() {
		EventProjectWorkPosition member = new EventProjectWorkPosition();
		member.setModelTypeName("event_project_work_position");
		member.setName("change_request");
		member.setMemberName("eventProjectWorkPositionList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventProjectSupervisorReportBasicInfo eventProjectSupervisorReportBasicInfoList() {
		EventProjectSupervisorReportBasicInfo member = new EventProjectSupervisorReportBasicInfo();
		member.setModelTypeName("event_project_supervisor_report_basic_info");
		member.setName("change_request");
		member.setMemberName("eventProjectSupervisorReportBasicInfoList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventComments eventCommentsList() {
		EventComments member = new EventComments();
		member.setModelTypeName("event_comments");
		member.setName("change_request");
		member.setMemberName("eventCommentsList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventSubcontractApplication eventSubcontractApplicationList() {
		EventSubcontractApplication member = new EventSubcontractApplication();
		member.setModelTypeName("event_subcontract_application");
		member.setName("change_request");
		member.setMemberName("eventSubcontractApplicationList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventMaterialPreservedBasicInfo eventMaterialPreservedBasicInfoList() {
		EventMaterialPreservedBasicInfo member = new EventMaterialPreservedBasicInfo();
		member.setModelTypeName("event_material_preserved_basic_info");
		member.setName("change_request");
		member.setMemberName("eventMaterialPreservedBasicInfoList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventContractPaymentPhase eventContractPaymentPhaseList() {
		EventContractPaymentPhase member = new EventContractPaymentPhase();
		member.setModelTypeName("event_contract_payment_phase");
		member.setName("change_request");
		member.setMemberName("eventContractPaymentPhaseList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventShowAllTypeStepOne eventShowAllTypeStepOneList() {
		EventShowAllTypeStepOne member = new EventShowAllTypeStepOne();
		member.setModelTypeName("event_show_all_type_step_one");
		member.setName("change_request");
		member.setMemberName("eventShowAllTypeStepOneList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventLaborDispute eventLaborDisputeList() {
		EventLaborDispute member = new EventLaborDispute();
		member.setModelTypeName("event_labor_dispute");
		member.setName("change_request");
		member.setMemberName("eventLaborDisputeList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventProjectManagerReportBasicInfo eventProjectManagerReportBasicInfoList() {
		EventProjectManagerReportBasicInfo member = new EventProjectManagerReportBasicInfo();
		member.setModelTypeName("event_project_manager_report_basic_info");
		member.setName("change_request");
		member.setMemberName("eventProjectManagerReportBasicInfoList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventAfterSales eventAfterSalesList() {
		EventAfterSales member = new EventAfterSales();
		member.setModelTypeName("event_after_sales");
		member.setName("change_request");
		member.setMemberName("eventAfterSalesList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventApplyDecoration eventApplyDecorationList() {
		EventApplyDecoration member = new EventApplyDecoration();
		member.setModelTypeName("event_apply_decoration");
		member.setName("change_request");
		member.setMemberName("eventApplyDecorationList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventTaskReportBasicInfo eventTaskReportBasicInfoList() {
		EventTaskReportBasicInfo member = new EventTaskReportBasicInfo();
		member.setModelTypeName("event_task_report_basic_info");
		member.setName("change_request");
		member.setMemberName("eventTaskReportBasicInfoList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventMaterialComment eventMaterialCommentList() {
		EventMaterialComment member = new EventMaterialComment();
		member.setModelTypeName("event_material_comment");
		member.setName("change_request");
		member.setMemberName("eventMaterialCommentList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventReportCheckItem eventReportCheckItemList() {
		EventReportCheckItem member = new EventReportCheckItem();
		member.setModelTypeName("event_report_check_item");
		member.setName("change_request");
		member.setMemberName("eventReportCheckItemList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventExpectedPayItemComments eventExpectedPayItemCommentsList() {
		EventExpectedPayItemComments member = new EventExpectedPayItemComments();
		member.setModelTypeName("event_expected_pay_item_comments");
		member.setName("change_request");
		member.setMemberName("eventExpectedPayItemCommentsList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventLaborSupervisor eventLaborSupervisorList() {
		EventLaborSupervisor member = new EventLaborSupervisor();
		member.setModelTypeName("event_labor_supervisor");
		member.setName("change_request");
		member.setMemberName("eventLaborSupervisorList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventProjectPenalties eventProjectPenaltiesList() {
		EventProjectPenalties member = new EventProjectPenalties();
		member.setModelTypeName("event_project_penalties");
		member.setName("change_request");
		member.setMemberName("eventProjectPenaltiesList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventApplyEmplacement eventApplyEmplacementList() {
		EventApplyEmplacement member = new EventApplyEmplacement();
		member.setModelTypeName("event_apply_emplacement");
		member.setName("change_request");
		member.setMemberName("eventApplyEmplacementList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventMaterialChangeAudit eventMaterialChangeAuditList() {
		EventMaterialChangeAudit member = new EventMaterialChangeAudit();
		member.setModelTypeName("event_material_change_audit");
		member.setName("change_request");
		member.setMemberName("eventMaterialChangeAuditList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventProjectProgress eventProjectProgressList() {
		EventProjectProgress member = new EventProjectProgress();
		member.setModelTypeName("event_project_progress");
		member.setName("change_request");
		member.setMemberName("eventProjectProgressList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventContractReview eventContractReviewList() {
		EventContractReview member = new EventContractReview();
		member.setModelTypeName("event_contract_review");
		member.setName("change_request");
		member.setMemberName("eventContractReviewList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventApplyForAdvanceCompensation eventApplyForAdvanceCompensationList() {
		EventApplyForAdvanceCompensation member = new EventApplyForAdvanceCompensation();
		member.setModelTypeName("event_apply_for_advance_compensation");
		member.setName("change_request");
		member.setMemberName("eventApplyForAdvanceCompensationList");
		member.setRelationName("changeRequest");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventContractComment eventContractCommentList() {
		EventContractComment member = new EventContractComment();
		member.setModelTypeName("event_contract_comment");
		member.setName("change_request");
		member.setMemberName("eventContractCommentList");
		member.setRelationName("changeRequest");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("name");
		member.setName("name");
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

	public StringAttribute remoteIp(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_client_ip");
		// member.setName("remoteIp");
		member.setName("remote_ip");
		useMember(member);
		return member;
	}

	public BooleanAttribute commited(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("commited");
		member.setName("commited");
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

