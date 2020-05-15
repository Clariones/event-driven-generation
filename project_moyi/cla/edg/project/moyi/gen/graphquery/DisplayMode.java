package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class DisplayMode extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.displaymode.DisplayMode";
	}
	// 枚举对象
	public static EnumAttribute AUTO = new EnumAttribute("com.terapico.moyi.displaymode.DisplayMode", "AUTO");
	public static EnumAttribute NO_IMAGE = new EnumAttribute("com.terapico.moyi.displaymode.DisplayMode", "NO_IMAGE");
	public static EnumAttribute SINGLE_IMAGE = new EnumAttribute("com.terapico.moyi.displaymode.DisplayMode", "SINGLE_IMAGE");
	public static EnumAttribute DOUBLE_IMAGE = new EnumAttribute("com.terapico.moyi.displaymode.DisplayMode", "DOUBLE_IMAGE");
	public static EnumAttribute THREE_IMAGE = new EnumAttribute("com.terapico.moyi.displaymode.DisplayMode", "THREE_IMAGE");
	public static EnumAttribute IMAGE_ON_RIGHT = new EnumAttribute("com.terapico.moyi.displaymode.DisplayMode", "IMAGE_ON_RIGHT");

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
	
	public EditorSuggestion editorSuggestionList() {
		EditorSuggestion member = new EditorSuggestion();
		member.setModelTypeName("editor_suggestion");
		member.setName("display_mode");
		member.setMemberName("editorSuggestionList");
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

