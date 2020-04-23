package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ContractReviewRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.contractreviewrecord.ContractReviewRecord";
	}
	// 枚举对象

	// 引用的对象

	public StandardContract contract() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("contract");
		member.setMemberName("contract");
		member.setReferDirection(true);
		member.setRelationName("contract");
		append(member);
		return member;
	}

	public ProjectNomination reviewer() {
		ProjectNomination member = new ProjectNomination();
		member.setModelTypeName("project_nomination");
		member.setName("reviewer");
		member.setMemberName("reviewer");
		member.setReferDirection(true);
		member.setRelationName("reviewer");
		append(member);
		return member;
	}

	// 被引用的对象


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute comments(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("comments");
		member.setName("comments");
		useMember(member);
		return member;
	}

	public BooleanAttribute reviewPassed(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("reviewPassed");
		member.setName("review_passed");
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

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		// member.setName("lastUpdateTime");
		member.setName("last_update_time");
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

