package cla.edg.project.frontendpoc.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class TreeNode extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.frontendpoc.treenode.TreeNode";
	}
	// 枚举对象

	// 引用的对象

	// 被引用的对象

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute nodeId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("nodeId");
		useMember(member);
		return member;
	}

	public StringAttribute nodeType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("nodeType");
		useMember(member);
		return member;
	}

	public NumberAttribute leftValue(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("leftValue");
		useMember(member);
		return member;
	}

	public NumberAttribute rightValue(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("rightValue");
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

