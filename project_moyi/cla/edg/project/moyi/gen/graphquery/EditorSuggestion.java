package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class EditorSuggestion extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.editorsuggestion.EditorSuggestion";
	}
	// 枚举对象

	// 引用的对象

	public Article article() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("article");
		member.setMemberName("article");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public DisplayMode displayMode() {
		DisplayMode member = new DisplayMode();
		member.setModelTypeName("display_mode");
		member.setName("display_mode");
		member.setMemberName("displayMode");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MoyiUser editor() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("editor");
		member.setMemberName("editor");
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

	public StringAttribute editorTitle(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("editor_title");
		useMember(member);
		return member;
	}

	public StringAttribute editorCoverImage1(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("editor_cover_image1");
		useMember(member);
		return member;
	}

	public StringAttribute editorCoverImage2(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("editor_cover_image2");
		useMember(member);
		return member;
	}

	public StringAttribute editorCoverImage3(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("editor_cover_image3");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		member.setName("last_update_time");
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

