package cla.edg.project.frontendpoc.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ExamUser extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.frontendpoc.examuser.ExamUser";
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
	
	public StartExam startExamList() {
		StartExam member = new StartExam();
		member.setModelTypeName("start_exam");
		member.setName("user");
		member.setMemberName("startExamList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public AnswerQuestion answerQuestionList() {
		AnswerQuestion member = new AnswerQuestion();
		member.setModelTypeName("answer_question");
		member.setName("user");
		member.setMemberName("answerQuestionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public SocialProduct socialProductList() {
		SocialProduct member = new SocialProduct();
		member.setModelTypeName("social_product");
		member.setName("user");
		member.setMemberName("socialProductList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WechatLoginInfo wechatLoginInfoList() {
		WechatLoginInfo member = new WechatLoginInfo();
		member.setModelTypeName("wechat_login_info");
		member.setName("exam_user");
		member.setMemberName("wechatLoginInfoList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Exam examList() {
		Exam member = new Exam();
		member.setModelTypeName("exam");
		member.setName("user");
		member.setMemberName("examList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public FaultAnswer faultAnswerList() {
		FaultAnswer member = new FaultAnswer();
		member.setModelTypeName("fault_answer");
		member.setName("user");
		member.setMemberName("faultAnswerList");
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

	public StringAttribute mobilePhone(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_china_mobile_phone");
		member.setName("mobilePhone");
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

	public StringAttribute userType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("userType");
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

