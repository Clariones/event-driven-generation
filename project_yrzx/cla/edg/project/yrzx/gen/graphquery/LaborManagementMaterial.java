package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LaborManagementMaterial extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.labormanagementmaterial.LaborManagementMaterial";
	}
	// 枚举对象

	// 引用的对象

	public Project project() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project");
		member.setMemberName("project");
		member.setReferDirection(true);
		member.setRelationName("project");
		append(member);
		return member;
	}

	public DailyTaskType dailyTaskType() {
		DailyTaskType member = new DailyTaskType();
		member.setModelTypeName("daily_task_type");
		member.setName("daily_task_type");
		member.setMemberName("dailyTaskType");
		member.setReferDirection(true);
		member.setRelationName("dailyTaskType");
		append(member);
		return member;
	}

	public StandardContract contract() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("contract");
		member.setMemberName("contract");
		member.setReferDirection(true);
		member.setRelationName("contract");
		append(member);
		return member;
	}

	public ProjectMaterial bidPriceList() {
		ProjectMaterial member = new ProjectMaterial();
		member.setModelTypeName("project_material");
		member.setName("bid_price_list");
		member.setMemberName("bidPriceList");
		member.setReferDirection(true);
		member.setRelationName("bidPriceList");
		append(member);
		return member;
	}

	public ProjectProgress projectProgress() {
		ProjectProgress member = new ProjectProgress();
		member.setModelTypeName("project_progress");
		member.setName("project_progress");
		member.setMemberName("projectProgress");
		member.setReferDirection(true);
		member.setRelationName("projectProgress");
		append(member);
		return member;
	}

	public ProjectNomination contractPaymentManager() {
		ProjectNomination member = new ProjectNomination();
		member.setModelTypeName("project_nomination");
		member.setName("contract_payment_manager");
		member.setMemberName("contractPaymentManager");
		member.setReferDirection(true);
		member.setRelationName("contractPaymentManager");
		append(member);
		return member;
	}

	public ProjectNomination platformLaborManager() {
		ProjectNomination member = new ProjectNomination();
		member.setModelTypeName("project_nomination");
		member.setName("platform_labor_manager");
		member.setMemberName("platformLaborManager");
		member.setReferDirection(true);
		member.setRelationName("platformLaborManager");
		append(member);
		return member;
	}

	public ProjectNomination paymentManager() {
		ProjectNomination member = new ProjectNomination();
		member.setModelTypeName("project_nomination");
		member.setName("payment_manager");
		member.setMemberName("paymentManager");
		member.setReferDirection(true);
		member.setRelationName("paymentManager");
		append(member);
		return member;
	}

	public ProjectMaterial laborWage() {
		ProjectMaterial member = new ProjectMaterial();
		member.setModelTypeName("project_material");
		member.setName("labor_wage");
		member.setMemberName("laborWage");
		member.setReferDirection(true);
		member.setRelationName("laborWage");
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

	public NumberAttribute totalLaborCost(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("totalLaborCost");
		member.setName("total_labor_cost");
		useMember(member);
		return member;
	}

	public DateTimeAttribute planPayDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		// member.setName("planPayDate");
		member.setName("plan_pay_date");
		useMember(member);
		return member;
	}

	public NumberAttribute planPayAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("planPayAmount");
		member.setName("plan_pay_amount");
		useMember(member);
		return member;
	}

	public DateTimeAttribute actualPayDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		// member.setName("actualPayDate");
		member.setName("actual_pay_date");
		useMember(member);
		return member;
	}

	public NumberAttribute actualPayAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("actualPayAmount");
		member.setName("actual_pay_amount");
		useMember(member);
		return member;
	}

	public BooleanAttribute contractorCommitment(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("contractorCommitment");
		member.setName("contractor_commitment");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

