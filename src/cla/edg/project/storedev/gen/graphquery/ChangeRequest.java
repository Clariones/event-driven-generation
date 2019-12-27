package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class ChangeRequest extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.changerequest.ChangeRequest";
	}
	// 枚举对象

	// 引用的对象

	public ChangeRequestType requestType() {
		ChangeRequestType member = new ChangeRequestType();
		member.setModelTypeName("change_request_type");
		member.setName("request_type");
		member.setMemberName("requestType");
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

	public StoreDeveloper submitter() {
		StoreDeveloper member = new StoreDeveloper();
		member.setModelTypeName("store_developer");
		member.setName("submitter");
		member.setMemberName("submitter");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public RecommendedStoreHistory recommendedStoreHistoryList() {
		RecommendedStoreHistory member = new RecommendedStoreHistory();
		member.setModelTypeName("recommended_store_history");
		member.setName("change_request");
		member.setMemberName("recommendedStoreHistoryList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public BaseInformation baseInformationList() {
		BaseInformation member = new BaseInformation();
		member.setModelTypeName("base_information");
		member.setName("change_request");
		member.setMemberName("baseInformationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public StoreInformation storeInformationList() {
		StoreInformation member = new StoreInformation();
		member.setModelTypeName("store_information");
		member.setName("change_request");
		member.setMemberName("storeInformationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PeopleFlow peopleFlowList() {
		PeopleFlow member = new PeopleFlow();
		member.setModelTypeName("people_flow");
		member.setName("change_request");
		member.setMemberName("peopleFlowList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ExpenseInformation expenseInformationList() {
		ExpenseInformation member = new ExpenseInformation();
		member.setModelTypeName("expense_information");
		member.setName("change_request");
		member.setMemberName("expenseInformationList");
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

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("createTime");
		useMember(member);
		return member;
	}

	public StringAttribute remoteIp(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_client_ip");
		member.setName("remoteIp");
		useMember(member);
		return member;
	}

	public StringAttribute submitter1(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("submitter1");
		useMember(member);
		return member;
	}

	public BooleanAttribute requestCompleted(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("requestCompleted");
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

