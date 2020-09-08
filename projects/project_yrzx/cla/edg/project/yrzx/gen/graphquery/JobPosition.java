package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class JobPosition extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.jobposition.JobPosition";
	}
	// 枚举对象

	// 引用的对象

	public RecruitmentRequirement recruitmentRequirement() {
		RecruitmentRequirement member = new RecruitmentRequirement();
		member.setModelTypeName("recruitment_requirement");
		member.setName("recruitment_requirement");
		member.setMemberName("recruitmentRequirement");
		member.setReferDirection(true);
		member.setRelationName("recruitmentRequirement");
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

	public CandidateTalent candidateTalentList() {
		CandidateTalent member = new CandidateTalent();
		member.setModelTypeName("candidate_talent");
		member.setName("job_position");
		member.setMemberName("candidateTalentList");
		member.setRelationName("jobPosition");
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

	public StringAttribute jobDescription(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("jobDescription");
		member.setName("job_description");
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

