package cla.edg.project.sds.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CandidateContainer extends BaseModelBean{
	public String getFullClassName() {
		return "com.cla.sds.candidatecontainer.CandidateContainer";
	}
	// 枚举对象

	// 引用的对象

	// 被引用的对象

	public CandidateElement candidateElementList() {
		CandidateElement member = new CandidateElement();
		member.setModelTypeName("candidate_element");
		member.setName("container");
		member.setMemberName("candidateElementList");
		member.setRelationName("container");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

