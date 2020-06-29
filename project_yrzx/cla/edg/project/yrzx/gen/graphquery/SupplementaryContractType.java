package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SupplementaryContractType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.supplementarycontracttype.SupplementaryContractType";
	}
	// 枚举对象
	public static EnumAttribute SUPPLEMENTARY = new EnumAttribute("com.yrdec.yrzx.supplementarycontracttype.SupplementaryContractType", "SUPPLEMENTARY");
	public static EnumAttribute PROJECT_VISA = new EnumAttribute("com.yrdec.yrzx.supplementarycontracttype.SupplementaryContractType", "PROJECT_VISA");

	// 引用的对象

	// 被引用的对象

	public SupplementaryContract supplementaryContractList() {
		SupplementaryContract member = new SupplementaryContract();
		member.setModelTypeName("supplementary_contract");
		member.setName("type");
		member.setMemberName("supplementaryContractList");
		member.setRelationName("type");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventAdditionalContractBasicInfo eventAdditionalContractBasicInfoList() {
		EventAdditionalContractBasicInfo member = new EventAdditionalContractBasicInfo();
		member.setModelTypeName("event_additional_contract_basic_info");
		member.setName("contract_type");
		member.setMemberName("eventAdditionalContractBasicInfoList");
		member.setRelationName("contractType");
		member.setReferDirection(false);
		append(member);
		return member;
	}


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("name");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("code");
		member.setName("code");
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

