package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class RewardDetailRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.rewarddetailrecord.RewardDetailRecord";
	}
	// 枚举对象

	// 引用的对象

	public MoyiUser moyiUser() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("moyi_user");
		member.setMemberName("moyiUser");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MoyiUser payer() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("payer");
		member.setMemberName("payer");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public TransactionDirection transactionDirection() {
		TransactionDirection member = new TransactionDirection();
		member.setModelTypeName("transaction_direction");
		member.setName("transaction_direction");
		member.setMemberName("transactionDirection");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ConfirmationStatus status() {
		ConfirmationStatus member = new ConfirmationStatus();
		member.setModelTypeName("confirmation_status");
		member.setName("status");
		member.setMemberName("status");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Article article() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("article");
		member.setMemberName("article");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Artwork artwork() {
		Artwork member = new Artwork();
		member.setModelTypeName("artwork");
		member.setName("artwork");
		member.setMemberName("artwork");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Review review() {
		Review member = new Review();
		member.setModelTypeName("review");
		member.setName("review");
		member.setMemberName("review");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Moyi moyi() {
		Moyi member = new Moyi();
		member.setModelTypeName("moyi");
		member.setName("moyi");
		member.setMemberName("moyi");
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

	public StringAttribute summary(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("summary");
		useMember(member);
		return member;
	}

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("description");
		useMember(member);
		return member;
	}

	public StringAttribute ruleCode(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("rule_code");
		useMember(member);
		return member;
	}

	public NumberAttribute amount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("amount");
		useMember(member);
		return member;
	}

	public NumberAttribute balance(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("balance");
		useMember(member);
		return member;
	}

	public BooleanAttribute personalPay(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("personal_pay");
		useMember(member);
		return member;
	}

	public BooleanAttribute personalIncome(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("personal_income");
		useMember(member);
		return member;
	}

	public StringAttribute transactionAddress(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("transaction_address");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("create_time");
		useMember(member);
		return member;
	}

	public DateTimeAttribute settlementDeadLine(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("settlement_dead_line");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		member.setName("last_update_time");
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

