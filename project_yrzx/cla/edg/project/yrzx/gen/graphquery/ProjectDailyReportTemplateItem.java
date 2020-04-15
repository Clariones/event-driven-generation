package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectDailyReportTemplateItem extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectdailyreporttemplateitem.ProjectDailyReportTemplateItem";
	}
	// 枚举对象

	// 引用的对象

	public ReportSegmentType reportSegmentType() {
		ReportSegmentType member = new ReportSegmentType();
		member.setModelTypeName("report_segment_type");
		member.setName("report_segment_type");
		member.setMemberName("reportSegmentType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ReportCheckItem reportCheckItem() {
		ReportCheckItem member = new ReportCheckItem();
		member.setModelTypeName("report_check_item");
		member.setName("report_check_item");
		member.setMemberName("reportCheckItem");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ProjectDailyReportTemplate template() {
		ProjectDailyReportTemplate member = new ProjectDailyReportTemplate();
		member.setModelTypeName("project_daily_report_template");
		member.setName("template");
		member.setMemberName("template");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
		useMember(member);
		return member;
	}

	public NumberAttribute displayOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("displayOrder");
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

