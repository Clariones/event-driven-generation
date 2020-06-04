package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Moderator extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.moderator.Moderator";
	}
	// 枚举对象

	// 引用的对象

	public Section responsibleSection() {
		Section member = new Section();
		member.setModelTypeName("section");
		member.setName("responsible_section");
		member.setMemberName("responsibleSection");
		member.setReferDirection(true);
		member.setRelationName("responsibleSection");
		append(member);
		return member;
	}

	public MoyiUser responsibleUser() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("responsible_user");
		member.setMemberName("responsibleUser");
		member.setReferDirection(true);
		member.setRelationName("responsibleUser");
		append(member);
		return member;
	}

	public Moyi moyi() {
		Moyi member = new Moyi();
		member.setModelTypeName("moyi");
		member.setName("moyi");
		member.setMemberName("moyi");
		member.setReferDirection(true);
		member.setRelationName("moyi");
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

	public DateTimeAttribute startDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		// member.setName("startDate");
		member.setName("start_date");
		useMember(member);
		return member;
	}

	public DateTimeAttribute endDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		// member.setName("endDate");
		member.setName("end_date");
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

