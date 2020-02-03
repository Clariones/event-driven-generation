package cla.edg.project.health.gen.graphquery;

public class MODEL{
	public static String getBasePackageName() {
		return "com.doublechaintech.health";
	}

	public static Platform platform() {
		Platform rst = new Platform();
		rst.setModelTypeName("platform");
		return rst;
	}

	public static Province province() {
		Province rst = new Province();
		rst.setModelTypeName("province");
		return rst;
	}

	public static City city() {
		City rst = new City();
		rst.setModelTypeName("city");
		return rst;
	}

	public static District district() {
		District rst = new District();
		rst.setModelTypeName("district");
		return rst;
	}

	public static Location location() {
		Location rst = new Location();
		rst.setModelTypeName("location");
		return rst;
	}

	public static Teacher teacher() {
		Teacher rst = new Teacher();
		rst.setModelTypeName("teacher");
		return rst;
	}

	public static Student student() {
		Student rst = new Student();
		rst.setModelTypeName("student");
		return rst;
	}

	public static Question question() {
		Question rst = new Question();
		rst.setModelTypeName("question");
		return rst;
	}

	public static QuestionType questionType() {
		QuestionType rst = new QuestionType();
		rst.setModelTypeName("question_type");
		return rst;
	}

	public static ClassDailyHealthSurvey classDailyHealthSurvey() {
		ClassDailyHealthSurvey rst = new ClassDailyHealthSurvey();
		rst.setModelTypeName("class_daily_health_survey");
		return rst;
	}

	public static DailySurveyQuestion dailySurveyQuestion() {
		DailySurveyQuestion rst = new DailySurveyQuestion();
		rst.setModelTypeName("daily_survey_question");
		return rst;
	}

	public static StudentHealthSurvey studentHealthSurvey() {
		StudentHealthSurvey rst = new StudentHealthSurvey();
		rst.setModelTypeName("student_health_survey");
		return rst;
	}

	public static StudentDailyAnswer studentDailyAnswer() {
		StudentDailyAnswer rst = new StudentDailyAnswer();
		rst.setModelTypeName("student_daily_answer");
		return rst;
	}

	public static SurveyStatus surveyStatus() {
		SurveyStatus rst = new SurveyStatus();
		rst.setModelTypeName("survey_status");
		return rst;
	}

	public static HealthSurveyReport healthSurveyReport() {
		HealthSurveyReport rst = new HealthSurveyReport();
		rst.setModelTypeName("health_survey_report");
		return rst;
	}

	public static StudentAnswer studentAnswer() {
		StudentAnswer rst = new StudentAnswer();
		rst.setModelTypeName("student_answer");
		return rst;
	}

	public static User user() {
		User rst = new User();
		rst.setModelTypeName("user");
		return rst;
	}

	public static WechatLoginInfo wechatLoginInfo() {
		WechatLoginInfo rst = new WechatLoginInfo();
		rst.setModelTypeName("wechat_login_info");
		return rst;
	}

	public static ChangeRequest changeRequest() {
		ChangeRequest rst = new ChangeRequest();
		rst.setModelTypeName("change_request");
		return rst;
	}

	public static ChangeRequestType changeRequestType() {
		ChangeRequestType rst = new ChangeRequestType();
		rst.setModelTypeName("change_request_type");
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



