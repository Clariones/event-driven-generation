package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class ArtworkCurrentOwner extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.artworkcurrentowner.ArtworkCurrentOwner";
	}
	// 枚举对象

	// 引用的对象

	public Artwork artwork() {
		Artwork member = new Artwork();
		member.setModelTypeName("artwork");
		member.setName("artwork");
		member.setMemberName("artwork");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MoyiUser owner() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("owner");
		member.setMemberName("owner");
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

	public StringAttribute comment(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("comment");
		useMember(member);
		return member;
	}

	public StringAttribute proofRecordType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("proofRecordType");
		useMember(member);
		return member;
	}

	public StringAttribute proofRecordId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("proofRecordId");
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

