package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class SectionFans extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.sectionfans.SectionFans";
	}
	// 枚举对象

	// 引用的对象

	public Section section() {
		Section member = new Section();
		member.setModelTypeName("section");
		member.setName("section");
		member.setMemberName("section");
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
		member.setName("watch_time");
		useMember(member);
		return member;
	}

	public NumberAttribute sectionDisplayOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("section_display_order");
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

