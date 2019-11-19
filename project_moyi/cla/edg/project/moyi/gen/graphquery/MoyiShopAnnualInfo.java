package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class MoyiShopAnnualInfo extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.moyishopannualinfo.MoyiShopAnnualInfo";
	}
	// 枚举对象

	// 引用的对象

	public MoyiShop shop() {
		MoyiShop member = new MoyiShop();
		member.setModelTypeName("moyi_shop");
		member.setName("shop");
		member.setMemberName("shop");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute details(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("details");
		useMember(member);
		return member;
	}

	public DateTimeAttribute startDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		member.setName("startDate");
		useMember(member);
		return member;
	}

	public DateTimeAttribute expiryDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		member.setName("expiryDate");
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

