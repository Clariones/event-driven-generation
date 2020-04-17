package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventShowAllType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.eventshowalltype.EventShowAllType";
	}
	// 枚举对象

	// 引用的对象

	public Merchant fieldBizCandidate() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("field_biz_candidate");
		member.setMemberName("fieldBizCandidate");
		member.setReferDirection(true);
		append(member);
		return member;
	}

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

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute fieldText(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("fieldText");
		useMember(member);
		return member;
	}

	public StringAttribute fieldIdNumber(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("fieldIdNumber");
		useMember(member);
		return member;
	}

	public StringAttribute fieldEmail(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_email");
		member.setName("fieldEmail");
		useMember(member);
		return member;
	}

	public StringAttribute fieldUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("fieldUrl");
		useMember(member);
		return member;
	}

	public StringAttribute fieldOneOf(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("fieldOneOf");
		useMember(member);
		return member;
	}

	public StringAttribute fieldSomeOf(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("fieldSomeOf");
		useMember(member);
		return member;
	}

	public StringAttribute fieldLongtext(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("fieldLongtext");
		useMember(member);
		return member;
	}

	public BooleanAttribute fieldBoolean(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("fieldBoolean");
		useMember(member);
		return member;
	}

	public StringAttribute fieldImages(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("images");
		member.setName("fieldImages");
		useMember(member);
		return member;
	}

	public StringAttribute fieldImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("fieldImage");
		useMember(member);
		return member;
	}

	public DateTimeAttribute fieldDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		member.setName("fieldDate");
		useMember(member);
		return member;
	}

	public DateTimeAttribute fieldDatetime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("fieldDatetime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute fieldTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("time");
		member.setName("fieldTime");
		useMember(member);
		return member;
	}

	public NumberAttribute fieldInteger(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("fieldInteger");
		useMember(member);
		return member;
	}

	public NumberAttribute fieldDecimal(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("fieldDecimal");
		useMember(member);
		return member;
	}

	public NumberAttribute fieldMoney(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("fieldMoney");
		useMember(member);
		return member;
	}

	public StringAttribute fieldGroup(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("fieldGroup");
		useMember(member);
		return member;
	}

	public StringAttribute eventInitiatorType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("eventInitiatorType");
		useMember(member);
		return member;
	}

	public StringAttribute eventInitiatorId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("eventInitiatorId");
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

