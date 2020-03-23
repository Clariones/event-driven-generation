package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import com.terapico.generator.Utils;

import cla.edg.modelbean.*;

public class BasicCalculationDataSetting extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.basiccalculationdatasetting.BasicCalculationDataSetting";
	}
	// 枚举对象

	// 引用的对象

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
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

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("code");
		useMember(member);
		return member;
	}

	public NumberAttribute baseScore(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("baseScore");
		useMember(member);
		return member;
	}

	public NumberAttribute changeThreshold(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("changeThreshold");
		useMember(member);
		return member;
	}

	public NumberAttribute changeRatio(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("changeRatio");
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

