package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ArtistFans extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.artistfans.ArtistFans";
	}
	// 枚举对象

	// 引用的对象

	public Artist artist() {
		Artist member = new Artist();
		member.setModelTypeName("artist");
		member.setName("artist");
		member.setMemberName("artist");
		member.setReferDirection(true);
		member.setRelationName("artist");
		append(member);
		return member;
	}

	public MoyiUser fans() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("fans");
		member.setMemberName("fans");
		member.setReferDirection(true);
		member.setRelationName("fans");
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

	public DateTimeAttribute watchTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("watchTime");
		member.setName("watch_time");
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

