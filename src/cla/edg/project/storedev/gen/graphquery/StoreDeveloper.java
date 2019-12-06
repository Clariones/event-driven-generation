package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class StoreDeveloper extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.storedeveloper.StoreDeveloper";
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
	
	public OperationCompanyRoleAssignment operationCompanyRoleAssignmentList() {
		OperationCompanyRoleAssignment member = new OperationCompanyRoleAssignment();
		member.setModelTypeName("operation_company_role_assignment");
		member.setName("assignee");
		member.setMemberName("operationCompanyRoleAssignmentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ChangeRequest changeRequestList() {
		ChangeRequest member = new ChangeRequest();
		member.setModelTypeName("change_request");
		member.setName("submitter");
		member.setMemberName("changeRequestList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public RecommendedStore recommendedStoreList() {
		RecommendedStore member = new RecommendedStore();
		member.setModelTypeName("recommended_store");
		member.setName("initiator");
		member.setMemberName("recommendedStoreList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public RecommendedStoreActivityLog recommendedStoreActivityLogList() {
		RecommendedStoreActivityLog member = new RecommendedStoreActivityLog();
		member.setModelTypeName("recommended_store_activity_log");
		member.setName("who");
		member.setMemberName("recommendedStoreActivityLogList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Store storeList() {
		Store member = new Store();
		member.setModelTypeName("store");
		member.setName("developer");
		member.setMemberName("storeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public RecommendedStoreAuditTask recommendedStoreAuditTaskList() {
		RecommendedStoreAuditTask member = new RecommendedStoreAuditTask();
		member.setModelTypeName("recommended_store_audit_task");
		member.setName("responsible_store_developer");
		member.setMemberName("recommendedStoreAuditTaskList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WechatWorkLoginInfo wechatWorkLoginInfoList() {
		WechatWorkLoginInfo member = new WechatWorkLoginInfo();
		member.setModelTypeName("wechat_work_login_info");
		member.setName("store_developer");
		member.setMemberName("wechatWorkLoginInfoList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WechatLoginInfo wechatLoginInfoList() {
		WechatLoginInfo member = new WechatLoginInfo();
		member.setModelTypeName("wechat_login_info");
		member.setName("store_developer");
		member.setMemberName("wechatLoginInfoList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MonthlyStatisticsItem monthlyStatisticsItemList() {
		MonthlyStatisticsItem member = new MonthlyStatisticsItem();
		member.setModelTypeName("monthly_statistics_item");
		member.setName("store_developer");
		member.setMemberName("monthlyStatisticsItemList");
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

	public StringAttribute avatar(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("avatar");
		useMember(member);
		return member;
	}

	public StringAttribute detailedAddress(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("detailedAddress");
		useMember(member);
		return member;
	}

	public StringAttribute department(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("department");
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

