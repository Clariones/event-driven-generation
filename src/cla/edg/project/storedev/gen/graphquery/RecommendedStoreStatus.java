package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class RecommendedStoreStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.recommendedstorestatus.RecommendedStoreStatus";
	}
	// 枚举对象
	public static EnumAttribute PENDING_ON_AUDIT = new EnumAttribute("com.doublechain.storedev.recommendedstorestatus.RecommendedStoreStatus", "PENDING_ON_AUDIT");
	public static EnumAttribute APPROVED = new EnumAttribute("com.doublechain.storedev.recommendedstorestatus.RecommendedStoreStatus", "APPROVED");
	public static EnumAttribute REJECTED = new EnumAttribute("com.doublechain.storedev.recommendedstorestatus.RecommendedStoreStatus", "REJECTED");
	public static EnumAttribute OPENED = new EnumAttribute("com.doublechain.storedev.recommendedstorestatus.RecommendedStoreStatus", "OPENED");
	public static EnumAttribute REVERTED = new EnumAttribute("com.doublechain.storedev.recommendedstorestatus.RecommendedStoreStatus", "REVERTED");
	public static EnumAttribute UNAPPROVED = new EnumAttribute("com.doublechain.storedev.recommendedstorestatus.RecommendedStoreStatus", "UNAPPROVED");

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
	
	public RecommendedStore recommendedStoreList() {
		RecommendedStore member = new RecommendedStore();
		member.setModelTypeName("recommended_store");
		member.setName("status");
		member.setMemberName("recommendedStoreList");
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

