package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ReportCheckItem extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.reportcheckitem.ReportCheckItem";
	}
	// 枚举对象

	// 引用的对象

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
		member.setName("report_check_item");
		member.setMemberName("projectDailyReportTemplateItemList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectDailyReportCheck projectDailyReportCheckList() {
		ProjectDailyReportCheck member = new ProjectDailyReportCheck();
		member.setModelTypeName("project_daily_report_check");
		member.setName("check_item");
		member.setMemberName("projectDailyReportCheckList");
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

	public StringAttribute englishTitle(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("englishTitle");
		useMember(member);
		return member;
	}

	public StringAttribute normalMessage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("normalMessage");
		useMember(member);
		return member;
	}

	public StringAttribute errorMessage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("errorMessage");
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

