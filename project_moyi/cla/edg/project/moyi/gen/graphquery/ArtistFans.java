package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
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
		append(member);
		return member;
	}

	public MoyiUser fans() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("fans");
		member.setMemberName("fans");
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

	public DateTimeAttribute watchTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("watchTime");
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

