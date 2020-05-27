package cla.edg.project.sds.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PageElement extends BaseModelBean{
	public String getFullClassName() {
		return "com.cla.sds.pageelement.PageElement";
	}
	// 枚举对象

	// 引用的对象

	public PageFlowSpec spec() {
		PageFlowSpec member = new PageFlowSpec();
		member.setModelTypeName("page_flow_spec");
		member.setName("spec");
		member.setMemberName("spec");
		member.setReferDirection(true);
		member.setRelationName("spec");
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

	public StringAttribute chineseName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("chineseName");
		member.setName("chinese_name");
		useMember(member);
		return member;
	}

	public StringAttribute englishName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("englishName");
		member.setName("english_name");
		useMember(member);
		return member;
	}

	public NumberAttribute positionX(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("positionX");
		member.setName("position_x");
		useMember(member);
		return member;
	}

	public NumberAttribute positionY(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("positionY");
		member.setName("position_y");
		useMember(member);
		return member;
	}

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("description");
		member.setName("description");
		useMember(member);
		return member;
	}

	public NumberAttribute cacheSeconds(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("cacheSeconds");
		member.setName("cache_seconds");
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

