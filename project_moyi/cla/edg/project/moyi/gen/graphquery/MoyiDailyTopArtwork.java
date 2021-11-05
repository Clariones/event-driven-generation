package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class MoyiDailyTopArtwork extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.moyidailytopartwork.MoyiDailyTopArtwork";
	}
	// 枚举对象

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

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute artworkIdentification(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("artworkIdentification");
		useMember(member);
		return member;
	}

	public StringAttribute artworkName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("artworkName");
		useMember(member);
		return member;
	}

	public NumberAttribute artworkInkDeltaValue(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("artworkInkDeltaValue");
		useMember(member);
		return member;
	}

	public NumberAttribute artworkDailyRank(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("artworkDailyRank");
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

