package cla.edg.project.iscm.gen.graphquery;

public class MODEL{
	public static String getBasePackageName() {
		return "com.terapico.iscm";
	}

	public static Platform platform() {
		Platform rst = new Platform();
		rst.setModelTypeName("platform");
		return rst;
	}

	public static SystemConfiguration systemConfiguration() {
		SystemConfiguration rst = new SystemConfiguration();
		rst.setModelTypeName("system_configuration");
		return rst;
	}

	public static ConfigurationItem configurationItem() {
		ConfigurationItem rst = new ConfigurationItem();
		rst.setModelTypeName("configuration_item");
		return rst;
	}

	public static SalesPerson salesPerson() {
		SalesPerson rst = new SalesPerson();
		rst.setModelTypeName("sales_person");
		return rst;
	}

	public static UserDomain userDomain() {
		UserDomain rst = new UserDomain();
		rst.setModelTypeName("user_domain");
		return rst;
	}

	public static UserWhiteList userWhiteList() {
		UserWhiteList rst = new UserWhiteList();
		rst.setModelTypeName("user_white_list");
		return rst;
	}

	public static SecUser secUser() {
		SecUser rst = new SecUser();
		rst.setModelTypeName("sec_user");
		return rst;
	}

	public static UserApp userApp() {
		UserApp rst = new UserApp();
		rst.setModelTypeName("user_app");
		return rst;
	}

	public static QuickLink quickLink() {
		QuickLink rst = new QuickLink();
		rst.setModelTypeName("quick_link");
		return rst;
	}

	public static ListAccess listAccess() {
		ListAccess rst = new ListAccess();
		rst.setModelTypeName("list_access");
		return rst;
	}

	public static ObjectAccess objectAccess() {
		ObjectAccess rst = new ObjectAccess();
		rst.setModelTypeName("object_access");
		return rst;
	}

	public static LoginHistory loginHistory() {
		LoginHistory rst = new LoginHistory();
		rst.setModelTypeName("login_history");
		return rst;
	}

	public static GenericForm genericForm() {
		GenericForm rst = new GenericForm();
		rst.setModelTypeName("generic_form");
		return rst;
	}

	public static FormMessage formMessage() {
		FormMessage rst = new FormMessage();
		rst.setModelTypeName("form_message");
		return rst;
	}

	public static FormFieldMessage formFieldMessage() {
		FormFieldMessage rst = new FormFieldMessage();
		rst.setModelTypeName("form_field_message");
		return rst;
	}

	public static FormField formField() {
		FormField rst = new FormField();
		rst.setModelTypeName("form_field");
		return rst;
	}

	public static FormAction formAction() {
		FormAction rst = new FormAction();
		rst.setModelTypeName("form_action");
		return rst;
	}

	public static CandidateContainer candidateContainer() {
		CandidateContainer rst = new CandidateContainer();
		rst.setModelTypeName("candidate_container");
		return rst;
	}

	public static CandidateElement candidateElement() {
		CandidateElement rst = new CandidateElement();
		rst.setModelTypeName("candidate_element");
		return rst;
	}

	public static WechatWorkappIdentify wechatWorkappIdentify() {
		WechatWorkappIdentify rst = new WechatWorkappIdentify();
		rst.setModelTypeName("wechat_workapp_identify");
		return rst;
	}

	public static WechatMiniappIdentify wechatMiniappIdentify() {
		WechatMiniappIdentify rst = new WechatMiniappIdentify();
		rst.setModelTypeName("wechat_miniapp_identify");
		return rst;
	}

	
}



