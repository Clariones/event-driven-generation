package com.terapico.changerequest.builder;

public interface OutputName {
	String NAME = "name";
	String TITLE = "title";
	String CHANGE_REQUEST_LIST = "changeRequestList";

	interface CHANGE_REQUEST {
		String NAME = "name";
		String TITLE = "title";
		String TYPE = "changeRequestType";
		String REQUEST_PREFIX = "requestPrefix";
		String STEP_LIST = "stepList";
		String ICON = "icon";
		String BIND_TYPES = "bindTypes";
		String NEED_LOGIN = "needLogin";

		interface STEP {
			String NAME = "name";
			String TITLE = "title";
			String INDEX = "index";
			String SKIP = "canSkip";
			String EVENT_LIST = "eventList";

			interface EVENT {
				String NAME = "name";
				String TITLE = "title";
				String TYPE = "eventType";
				String MUST = "mustHave";
				String MULTIPLE = "multiple";
				String SHOW_PREVIOUS = "showPrevious";
				String SHOW_NEXT = "showNext";
				String MIN = "minimalNumber";
				String MAX = "maximumNumber";
				String FIELD_LIST = "fieldList";
				int _DEFAULT_MAX = 500;
				
				interface FIELD {
					String NAME = "name";
					String TITLE = "title";
					String INTER_ACTION_MODE = "interactionMode";
					String INLINE = "inline";
					String TYPE = "inputType";
					String MODEL_NAME = "modelName";
					String SELECTABLE = "selectable";
					String MUST = "mustHave";
					String MIN = "minimal";
					String MAX = "maximum";
					String PLACE_HOLDER = "placeholder";
					String TIPS_TITLE = "tipsTitle";
					String TIPS_CONTENT = "tipsContent";
					String SELECTABLE_NOT = "not_selectable";
					String SELECTABLE_SINGLE = "single_selectable";
					String SELECTABLE_MULTI = "multi_selectable";
					String FORCE_VALUE = "value";
					String DEFAULT_VALUE = "defaultValue";
					String AUTO_FILL_EXPRESSION = "autoFillExpression";
					String VALUES = "valuesMapping";
					String VALUES_RETRIEVE_API = "valuesRetrieveApi";
					String SAMPLE_DATA = "sampleData";
					String REGULAR_EXPRESSION = "regExp";
					String UI_STYLE = "uiStyle";
					String ON_CHANGE = "onChange";
				}
			}
		}
	}

}
