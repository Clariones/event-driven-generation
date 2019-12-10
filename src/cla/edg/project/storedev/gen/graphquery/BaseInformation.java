package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class BaseInformation extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.baseinformation.BaseInformation";
	}
	// 枚举对象

	// 引用的对象

	public OperationCompany operationCompany() {
		OperationCompany member = new OperationCompany();
		member.setModelTypeName("operation_company");
		member.setName("operation_company");
		member.setMemberName("operationCompany");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public GiantArea giantArea() {
		GiantArea member = new GiantArea();
		member.setModelTypeName("giant_area");
		member.setName("giant_area");
		member.setMemberName("giantArea");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MiddleArea middleArea() {
		MiddleArea member = new MiddleArea();
		member.setModelTypeName("middle_area");
		member.setName("middle_area");
		member.setMemberName("middleArea");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public SmallArea smallArea() {
		SmallArea member = new SmallArea();
		member.setModelTypeName("small_area");
		member.setName("small_area");
		member.setMemberName("smallArea");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Province province() {
		Province member = new Province();
		member.setModelTypeName("province");
		member.setName("province");
		member.setMemberName("province");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public City city() {
		City member = new City();
		member.setModelTypeName("city");
		member.setName("city");
		member.setMemberName("city");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public District district() {
		District member = new District();
		member.setModelTypeName("district");
		member.setName("district");
		member.setMemberName("district");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute detailedAddress(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("detailedAddress");
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

