package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectDailyReportTemplate extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectdailyreporttemplate.ProjectDailyReportTemplate";
	}
	// 枚举对象

	// 引用的对象

	public ReportType reportType() {
		ReportType member = new ReportType();
		member.setModelTypeName("report_type");
		member.setName("report_type");
		member.setMemberName("reportType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public PlatformConfiguration platformConfiguration() {
		PlatformConfiguration member = new PlatformConfiguration();
		member.setModelTypeName("platform_configuration");
		member.setName("platform_configuration");
		member.setMemberName("platformConfiguration");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public ProjectDailyReportTemplateItem projectDailyReportTemplateItemList() {
		ProjectDailyReportTemplateItem member = new ProjectDailyReportTemplateItem();
		member.setModelTypeName("project_daily_report_template_item");
		member.setName("template");
		member.setMemberName("projectDailyReportTemplateItemList");
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

