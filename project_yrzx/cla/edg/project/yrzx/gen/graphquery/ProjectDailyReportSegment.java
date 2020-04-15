package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectDailyReportSegment extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectdailyreportsegment.ProjectDailyReportSegment";
	}
	// 枚举对象

	// 引用的对象

	public ReportSegmentType segmentType() {
		ReportSegmentType member = new ReportSegmentType();
		member.setModelTypeName("report_segment_type");
		member.setName("segment_type");
		member.setMemberName("segmentType");
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

	public StringAttribute segmentTitle(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("segmentTitle");
		useMember(member);
		return member;
	}

	public StringAttribute segmentEnglishTitle(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("segmentEnglishTitle");
		useMember(member);
		return member;
	}

	public StringAttribute content(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("content");
		useMember(member);
		return member;
	}

	public StringAttribute image1(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image1");
		useMember(member);
		return member;
	}

	public StringAttribute image2(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image2");
		useMember(member);
		return member;
	}

	public StringAttribute image3(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image3");
		useMember(member);
		return member;
	}

	public StringAttribute image4(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image4");
		useMember(member);
		return member;
	}

	public StringAttribute image5(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image5");
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

