package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class MiddleArea extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.middlearea.MiddleArea";
	}
	// 枚举对象

	// 引用的对象

	public GiantArea giantArea() {
		GiantArea member = new GiantArea();
		member.setModelTypeName("giant_area");
		member.setName("giant_area");
		member.setMemberName("giantArea");
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
	
	public SmallArea smallAreaList() {
		SmallArea member = new SmallArea();
		member.setModelTypeName("small_area");
		member.setName("middle_area");
		member.setMemberName("smallAreaList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public BaseInformation baseInformationList() {
		BaseInformation member = new BaseInformation();
		member.setModelTypeName("base_information");
		member.setName("middle_area");
		member.setMemberName("baseInformationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public RecommendedStore recommendedStoreList() {
		RecommendedStore member = new RecommendedStore();
		member.setModelTypeName("recommended_store");
		member.setName("middle_area");
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

	public StringAttribute originalId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("originalId");
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

