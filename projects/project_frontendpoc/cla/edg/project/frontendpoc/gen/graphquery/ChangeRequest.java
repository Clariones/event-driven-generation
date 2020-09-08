package cla.edg.project.frontendpoc.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ChangeRequest extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.frontendpoc.changerequest.ChangeRequest";
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
	
	public Registration registrationList() {
		Registration member = new Registration();
		member.setModelTypeName("registration");
		member.setName("change_request");
		member.setMemberName("registrationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public AnswerQuestion answerQuestionList() {
		AnswerQuestion member = new AnswerQuestion();
		member.setModelTypeName("answer_question");
		member.setName("change_request");
		member.setMemberName("answerQuestionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
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
	
	public EventShowAllType eventShowAllTypeList() {
		EventShowAllType member = new EventShowAllType();
		member.setModelTypeName("event_show_all_type");
		member.setName("change_request");
		member.setMemberName("eventShowAllTypeList");
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

