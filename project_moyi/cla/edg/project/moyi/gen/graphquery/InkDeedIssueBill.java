package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class InkDeedIssueBill extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.inkdeedissuebill.InkDeedIssueBill";
	}
	// 枚举对象

	// 引用的对象

	public MoyiUser seller() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("seller");
		member.setMemberName("seller");
		member.setReferDirection(true);
		member.setRelationName("seller");
		append(member);
		return member;
	}

	public ArtworkAuction auction() {
		ArtworkAuction member = new ArtworkAuction();
		member.setModelTypeName("artwork_auction");
		member.setName("auction");
		member.setMemberName("auction");
		member.setReferDirection(true);
		member.setRelationName("auction");
		append(member);
		return member;
	}

	public OrderStatus orderStatus() {
		OrderStatus member = new OrderStatus();
		member.setModelTypeName("order_status");
		member.setName("order_status");
		member.setMemberName("orderStatus");
		member.setReferDirection(true);
		member.setRelationName("orderStatus");
		append(member);
		return member;
	}

	public MainOrder mainOrder() {
		MainOrder member = new MainOrder();
		member.setModelTypeName("main_order");
		member.setName("main_order");
		member.setMemberName("mainOrder");
		member.setReferDirection(true);
		member.setRelationName("mainOrder");
		append(member);
		return member;
	}

	// 被引用的对象


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public NumberAttribute issueIbCost(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("issueIbCost");
		member.setName("issue_ib_cost");
		useMember(member);
		return member;
	}

	public NumberAttribute unitUsufructRatio(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		// member.setName("unitUsufructRatio");
		member.setName("unit_usufruct_ratio");
		useMember(member);
		return member;
	}

	public NumberAttribute unitPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("unitPrice");
		member.setName("unit_price");
		useMember(member);
		return member;
	}

	public NumberAttribute issueNumber(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("issueNumber");
		member.setName("issue_number");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("createTime");
		member.setName("create_time");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		// member.setName("lastUpdateTime");
		member.setName("last_update_time");
		useMember(member);
		return member;
	}

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

