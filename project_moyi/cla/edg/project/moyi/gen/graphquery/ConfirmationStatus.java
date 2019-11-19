package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class ConfirmationStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.confirmationstatus.ConfirmationStatus";
	}
	// 枚举对象
	public static EnumAttribute CONFIRMED = new EnumAttribute("com.terapico.moyi.confirmationstatus.ConfirmationStatus", "CONFIRMED");
	public static EnumAttribute OPEN = new EnumAttribute("com.terapico.moyi.confirmationstatus.ConfirmationStatus", "OPEN");
	public static EnumAttribute NEED_LOG = new EnumAttribute("com.terapico.moyi.confirmationstatus.ConfirmationStatus", "NEED_LOG");

	// 引用的对象

	public Moyi moyi() {
		Moyi member = new Moyi();
		member.setModelTypeName("moyi");
		member.setName("moyi");
		member.setMemberName("moyi");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public RewardDetailRecord rewardDetailRecordList() {
		RewardDetailRecord member = new RewardDetailRecord();
		member.setModelTypeName("reward_detail_record");
		member.setName("status");
		member.setMemberName("rewardDetailRecordList");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("code");
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

