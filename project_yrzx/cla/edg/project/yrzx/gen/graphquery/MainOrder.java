package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MainOrder extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.mainorder.MainOrder";
	}
	// 枚举对象

	// 引用的对象

	public Merchant buyerMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("buyer_merchant");
		member.setMemberName("buyerMerchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public EmployeeNomination buyerEmployee() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("buyer_employee");
		member.setMemberName("buyerEmployee");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public OrderStatus status() {
		OrderStatus member = new OrderStatus();
		member.setModelTypeName("order_status");
		member.setName("status");
		member.setMemberName("status");
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
	
	public MainOrderPriceInfo mainOrderPriceInfoList() {
		MainOrderPriceInfo member = new MainOrderPriceInfo();
		member.setModelTypeName("main_order_price_info");
		member.setName("main_order");
		member.setMemberName("mainOrderPriceInfoList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public LineItem lineItemList() {
		LineItem member = new LineItem();
		member.setModelTypeName("line_item");
		member.setName("main_order");
		member.setMemberName("lineItemList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PaymentDetail paymentDetailList() {
		PaymentDetail member = new PaymentDetail();
		member.setModelTypeName("payment_detail");
		member.setName("main_order");
		member.setMemberName("paymentDetailList");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute statusBrief(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("statusBrief");
		useMember(member);
		return member;
	}

	public StringAttribute sceneCode(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("sceneCode");
		useMember(member);
		return member;
	}

	public NumberAttribute finalAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("finalAmount");
		useMember(member);
		return member;
	}

	public StringAttribute businessServiceUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("businessServiceUrl");
		useMember(member);
		return member;
	}

	public DateTimeAttribute paidTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("paidTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute deliverTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("deliverTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute receiptTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("receiptTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute closedTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("closedTime");
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

