package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class StoreMonthlyOperationData extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.storemonthlyoperationdata.StoreMonthlyOperationData";
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

	// 被引用的对象

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public NumberAttribute months(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("months");
		useMember(member);
		return member;
	}

	public DateTimeAttribute calculateDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		member.setName("calculateDate");
		useMember(member);
		return member;
	}

	public NumberAttribute rent(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("rent");
		useMember(member);
		return member;
	}

	public NumberAttribute income(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("income");
		useMember(member);
		return member;
	}

	public NumberAttribute monthlyOtherCost(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("monthlyOtherCost");
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

