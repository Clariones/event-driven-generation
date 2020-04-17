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
	
	public EventTaskReportBasicInfo eventTaskReportBasicInfoList() {
		EventTaskReportBasicInfo member = new EventTaskReportBasicInfo();
		member.setModelTypeName("event_task_report_basic_info");
		member.setName("change_request");
		member.setMemberName("eventTaskReportBasicInfoList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EventCommonReport eventCommonReportList() {
		EventCommonReport member = new EventCommonReport();
		member.setModelTypeName("event_common_report");
		member.setName("change_request");
		member.setMemberName("eventCommonReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EventReportCheckItem eventReportCheckItemList() {
		EventReportCheckItem member = new EventReportCheckItem();
		member.setModelTypeName("event_report_check_item");
		member.setName("change_request");
		member.setMemberName("eventReportCheckItemList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EventProjectSupervisorReportBasicInfo eventProjectSupervisorReportBasicInfoList() {
		EventProjectSupervisorReportBasicInfo member = new EventProjectSupervisorReportBasicInfo();
		member.setModelTypeName("event_project_supervisor_report_basic_info");
		member.setName("change_request");
		member.setMemberName("eventProjectSupervisorReportBasicInfoList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EventApplyRecommendation eventApplyRecommendationList() {
		EventApplyRecommendation member = new EventApplyRecommendation();
		member.setModelTypeName("event_apply_recommendation");
		member.setName("change_request");
		member.setMemberName("eventApplyRecommendationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EventShowAllType eventShowAllTypeList() {
		EventShowAllType member = new EventShowAllType();
		member.setModelTypeName("event_show_all_type");
		member.setName("change_request");
		member.setMemberName("eventShowAllTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EventApplyEmplacement eventApplyEmplacementList() {
		EventApplyEmplacement member = new EventApplyEmplacement();
		member.setModelTypeName("event_apply_emplacement");
		member.setName("change_request");
		member.setMemberName("eventApplyEmplacementList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EventProjectCommand eventProjectCommandList() {
		EventProjectCommand member = new EventProjectCommand();
		member.setModelTypeName("event_project_command");
		member.setName("change_request");
		member.setMemberName("eventProjectCommandList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EventProjectManagerReportBasicInfo eventProjectManagerReportBasicInfoList() {
		EventProjectManagerReportBasicInfo member = new EventProjectManagerReportBasicInfo();
		member.setModelTypeName("event_project_manager_report_basic_info");
		member.setName("change_request");
		member.setMemberName("eventProjectManagerReportBasicInfoList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EventAcceptanceApplication eventAcceptanceApplicationList() {
		EventAcceptanceApplication member = new EventAcceptanceApplication();
		member.setModelTypeName("event_acceptance_application");
		member.setName("change_request");
		member.setMemberName("eventAcceptanceApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EventAfterSales eventAfterSalesList() {
		EventAfterSales member = new EventAfterSales();
		member.setModelTypeName("event_after_sales");
		member.setName("change_request");
		member.setMemberName("eventAfterSalesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EventApplyDecoration eventApplyDecorationList() {
		EventApplyDecoration member = new EventApplyDecoration();
		member.setModelTypeName("event_apply_decoration");
		member.setName("change_request");
		member.setMemberName("eventApplyDecorationList");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
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

	public StringAttribute remoteIp(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_client_ip");
		member.setName("remoteIp");
		useMember(member);
		return member;
	}

	public BooleanAttribute commited(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("commited");
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

