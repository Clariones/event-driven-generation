package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class WechatWorkLoginInfo extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.wechatworklogininfo.WechatWorkLoginInfo";
	}
	// 枚举对象

	// 引用的对象

	public StoreDeveloper storeDeveloper() {
		StoreDeveloper member = new StoreDeveloper();
		member.setModelTypeName("store_developer");
		member.setName("store_developer");
		member.setMemberName("storeDeveloper");
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

	public StringAttribute corpId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("corpId");
		useMember(member);
		return member;
	}

	public StringAttribute userId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("userId");
		useMember(member);
		return member;
	}

	public StringAttribute sessionKey(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("sessionKey");
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

