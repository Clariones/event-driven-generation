package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class NodeInstanceStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.nodeinstancestatus.NodeInstanceStatus";
	}
	// 枚举对象
	public static EnumAttribute COMPLETED = new EnumAttribute("com.yrdec.yrzx.nodeinstancestatus.NodeInstanceStatus", "COMPLETED");
	public static EnumAttribute WAITING = new EnumAttribute("com.yrdec.yrzx.nodeinstancestatus.NodeInstanceStatus", "WAITING");
	public static EnumAttribute NONE = new EnumAttribute("com.yrdec.yrzx.nodeinstancestatus.NodeInstanceStatus", "NONE");
	public static EnumAttribute INCOMPLETE = new EnumAttribute("com.yrdec.yrzx.nodeinstancestatus.NodeInstanceStatus", "INCOMPLETE");

	// 引用的对象

	// 被引用的对象

	public NodeInstance nodeInstanceList() {
		NodeInstance member = new NodeInstance();
		member.setModelTypeName("node_instance");
		member.setName("status");
		member.setMemberName("nodeInstanceList");
		member.setRelationName("status");
		member.setReferDirection(false);
		append(member);
		return member;
	}


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("name");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("code");
		member.setName("code");
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

