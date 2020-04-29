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

	public EventShowAllType eventShowAllTypeList() {
		EventShowAllType member = new EventShowAllType();
		member.setModelTypeName("event_show_all_type");
		member.setName("change_request");
		member.setMemberName("eventShowAllTypeList");
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

