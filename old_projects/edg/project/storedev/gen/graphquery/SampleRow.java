package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import com.terapico.generator.Utils;

import cla.edg.modelbean.*;

public class SampleRow extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.samplerow.SampleRow";
	}
	// 枚举对象

	// 引用的对象

	public RecommendedStore recommendedStore() {
		RecommendedStore member = new RecommendedStore();
		member.setModelTypeName("recommended_store");
		member.setName("recommended_store");
		member.setMemberName("recommendedStore");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public PeopleFlow peopleFlow() {
		PeopleFlow member = new PeopleFlow();
		member.setModelTypeName("people_flow");
		member.setName("people_flow");
		member.setMemberName("peopleFlow");
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

	public StringAttribute time(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("time");
		useMember(member);
		return member;
	}

	public StringAttribute time12To13Pm(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("time12To13Pm");
		useMember(member);
		return member;
	}

	public StringAttribute time15To16Pm(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("time15To16Pm");
		useMember(member);
		return member;
	}

	public StringAttribute time18To20Pm(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("time18To20Pm");
		useMember(member);
		return member;
	}

	public StringAttribute weather(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("weather");
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

