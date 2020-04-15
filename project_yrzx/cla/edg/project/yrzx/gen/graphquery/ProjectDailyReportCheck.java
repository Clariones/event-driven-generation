package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectDailyReportCheck extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectdailyreportcheck.ProjectDailyReportCheck";
	}
	// 枚举对象

	// 引用的对象

	public ReportCheckItem checkItem() {
		ReportCheckItem member = new ReportCheckItem();
		member.setModelTypeName("report_check_item");
		member.setName("check_item");
		member.setMemberName("checkItem");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ProjectDailyReport dailyReport() {
		ProjectDailyReport member = new ProjectDailyReport();
		member.setModelTypeName("project_daily_report");
		member.setName("daily_report");
		member.setMemberName("dailyReport");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute checkItemTitle(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("checkItemTitle");
		useMember(member);
		return member;
	}

	public StringAttribute checkItemEnglishTitle(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("checkItemEnglishTitle");
		useMember(member);
		return member;
	}

	public BooleanAttribute checkResult(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("checkResult");
		useMember(member);
		return member;
	}

	public StringAttribute checkResultText(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("checkResultText");
		useMember(member);
		return member;
	}

	public BooleanAttribute workComplete(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("workComplete");
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

