package com.terapico.changerequest.builder;

public interface OutputName {
	String NAME = "name";
	String TITLE = "title";
	String CHANGE_REQUEST_LIST = "changeRequestList";

	interface CHANGE_REQUEST {
		String NAME = "name";
		String TITLE = "title";
		String TYPE = "changeRequestType";
		String STEP_LIST = "stepList";

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
				String MIN = "minimalNumber";
				String MAX = "maximumNumber";
				String FIELD_LIST = "fieldList";
				int _DEFAULT_MAX = 500;
				
				interface FIELD {
					String NAME = "name";
					String TITLE = "title";
					String INTER_ACTION_MODE = "interactionMode";
					String TYPE = "inputType";
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
					String VALUES = "valuesMapping";
					String VALUES_RETRIEVE_API = "valuesRetrieveApi";
					String SAMPLE_DATA = "sampleData";
				}
			}
		}
	}

}
