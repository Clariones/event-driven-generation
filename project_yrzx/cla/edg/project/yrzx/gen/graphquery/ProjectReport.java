package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectReport extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectreport.ProjectReport";
	}
	// 枚举对象

	// 引用的对象

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

	public ProjectNomination submitter() {
		ProjectNomination member = new ProjectNomination();
		member.setModelTypeName("project_nomination");
		member.setName("submitter");
		member.setMemberName("submitter");
		member.setReferDirection(true);
		member.setRelationName("submitter");
		append(member);
		return member;
	}

	public DailyTaskType dailyTaskType() {
		DailyTaskType member = new DailyTaskType();
		member.setModelTypeName("daily_task_type");
		member.setName("daily_task_type");
		member.setMemberName("dailyTaskType");
		member.setReferDirection(true);
		member.setRelationName("dailyTaskType");
		append(member);
		return member;
	}

	// 被引用的对象

	public CommonReport commonReportList() {
		CommonReport member = new CommonReport();
		member.setModelTypeName("common_report");
		member.setName("project_report");
		member.setMemberName("commonReportList");
		member.setRelationName("projectReport");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectReportCheckItem projectReportCheckItemList() {
		ProjectReportCheckItem member = new ProjectReportCheckItem();
		member.setModelTypeName("project_report_check_item");
		member.setName("project_report");
		member.setMemberName("projectReportCheckItemList");
		member.setRelationName("projectReport");
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

	public StringAttribute contractMerchantName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("contractMerchantName");
		member.setName("contract_merchant_name");
		useMember(member);
		return member;
	}

	public StringAttribute responsibleMerchantNames(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("responsibleMerchantNames");
		member.setName("responsible_merchant_names");
		useMember(member);
		return member;
	}

	public NumberAttribute temperature(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		// member.setName("temperature");
		member.setName("temperature");
		useMember(member);
		return member;
	}

	public StringAttribute weather(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("weather");
		member.setName("weather");
		useMember(member);
		return member;
	}

	public StringAttribute content(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("content");
		member.setName("content");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

