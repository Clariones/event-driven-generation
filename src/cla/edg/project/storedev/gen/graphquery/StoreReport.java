package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class StoreReport extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.storereport.StoreReport";
	}
	// 枚举对象

	// 引用的对象

	public RecommendedStore store() {
		RecommendedStore member = new RecommendedStore();
		member.setModelTypeName("recommended_store");
		member.setName("store");
		member.setMemberName("store");
		member.setReferDirection(true);
		append(member);
		return member;
	}

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

	public StringAttribute recommendationNumber(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("recommendationNumber");
		useMember(member);
		return member;
	}

	public StringAttribute relatedCounterNumber(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("relatedCounterNumber");
		useMember(member);
		return member;
	}

	public StringAttribute storeName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("storeName");
		useMember(member);
		return member;
	}

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute operationCompany(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("operationCompany");
		useMember(member);
		return member;
	}

	public StringAttribute giantArea(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("giantArea");
		useMember(member);
		return member;
	}

	public StringAttribute detailAddress(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("detailAddress");
		useMember(member);
		return member;
	}

	public NumberAttribute rentFee(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("rentFee");
		useMember(member);
		return member;
	}

	public NumberAttribute transferFee(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("transferFee");
		useMember(member);
		return member;
	}

	public NumberAttribute agencyFee(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("agencyFee");
		useMember(member);
		return member;
	}

	public NumberAttribute otherExpenses(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("otherExpenses");
		useMember(member);
		return member;
	}

	public StringAttribute auditStatus(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("auditStatus");
		useMember(member);
		return member;
	}

	public StringAttribute storeDeveloper(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("storeDeveloper");
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

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		member.setName("lastUpdateTime");
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

