package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectDailyReport extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectdailyreport.ProjectDailyReport";
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

	public Project project() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project");
		member.setMemberName("project");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public WorkPackage workPackage() {
		WorkPackage member = new WorkPackage();
		member.setModelTypeName("work_package");
		member.setName("work_package");
		member.setMemberName("workPackage");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Task task() {
		Task member = new Task();
		member.setModelTypeName("task");
		member.setName("task");
		member.setMemberName("task");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public EmployeeNomination reporter() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("reporter");
		member.setMemberName("reporter");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public EmployeeNomination directManager() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("direct_manager");
		member.setMemberName("directManager");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public ProjectDailyReportCheck projectDailyReportCheckList() {
		ProjectDailyReportCheck member = new ProjectDailyReportCheck();
		member.setModelTypeName("project_daily_report_check");
		member.setName("daily_report");
		member.setMemberName("projectDailyReportCheckList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectDailyReportSegment projectDailyReportSegmentList() {
		ProjectDailyReportSegment member = new ProjectDailyReportSegment();
		member.setModelTypeName("project_daily_report_segment");
		member.setName("daily_report");
		member.setMemberName("projectDailyReportSegmentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectDailyReportReadRecord projectDailyReportReadRecordList() {
		ProjectDailyReportReadRecord member = new ProjectDailyReportReadRecord();
		member.setModelTypeName("project_daily_report_read_record");
		member.setName("daily_report");
		member.setMemberName("projectDailyReportReadRecordList");
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

	public StringAttribute brief(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("brief");
		useMember(member);
		return member;
	}

	public StringAttribute airTemperature(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("airTemperature");
		useMember(member);
		return member;
	}

	public StringAttribute weather(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("weather");
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

