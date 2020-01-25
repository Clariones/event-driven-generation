package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class PeopleFlow extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.peopleflow.PeopleFlow";
	}
	// 枚举对象

	// 引用的对象

	public ChangeRequest changeRequest() {
		ChangeRequest member = new ChangeRequest();
		member.setModelTypeName("change_request");
		member.setName("change_request");
		member.setMemberName("changeRequest");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public SampleRow sampleRowList() {
		SampleRow member = new SampleRow();
		member.setModelTypeName("sample_row");
		member.setName("people_flow");
		member.setMemberName("sampleRowList");
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

	public StringAttribute chainBrand(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("chainBrand");
		useMember(member);
		return member;
	}

	public StringAttribute clothingBrand(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("clothingBrand");
		useMember(member);
		return member;
	}

	public StringAttribute competitiveBrandsAndSalesPerformance(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("competitiveBrandsAndSalesPerformance");
		useMember(member);
		return member;
	}

	public StringAttribute ourStoreIn500m(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("ourStoreIn500m");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("createTime");
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

