package com.terapico.changerequest.builder;

public class WorkingBoard {
	public static final int PROJECT = 0;
	public static final int CHANGE_REQUEST = 1;
	public static final int STEP = 3;
	public static final int EVENT = 7;
	public static final int FIELD = 15;
	
	public static final String INTERACTION_MODE = "interaction_mode";
	public static final String REQUIRED = "required";
	public static final String FORCE_VALUE = "force_value";
	public static final String RANGE = "range";
	public static final String PLACEHOLDER = "placeholder";
	public static final String TIPS_TITLE = "tips_title";
	public static final String TIPS_CONTENT = "tips_content";
	public static final String SET_VALUE_MAPPING = "value_mapping";
	public static final String MORE_VALUE_MAPPING = "more_value_mapping";
	public static final String INPUT_TYPE = "input_type";
	public static final String DEFAULT_VALUE = "default_value";
	public static final String VALUES_API = "values_api";
	public static final String SAMPLE_DATA = "sample_data";
	
	protected String currentProjectName;
	protected String currentChangeRequestName;
	protected String currentStepName;
	protected String currentEventName;
	protected String currentFieldName;
	protected String currentJobName;
	
	
	public String getCurrentProjectName() {
		return currentProjectName;
	}
	public void setCurrentProjectName(String currentProjectName) {
		this.currentProjectName = currentProjectName;
	}
	public String getCurrentChangeRequestName() {
		return currentChangeRequestName;
	}
	public void setCurrentChangeRequestName(String currentChangeRequestName) {
		this.currentChangeRequestName = currentChangeRequestName;
	}
	public String getCurrentStepName() {
		return currentStepName;
	}
	public void setCurrentStepName(String currentStepName) {
		this.currentStepName = currentStepName;
	}
	public String getCurrentEventName() {
		return currentEventName;
	}
	public void setCurrentEventName(String currentEventName) {
		this.currentEventName = currentEventName;
	}
	public String getCurrentFieldName() {
		return currentFieldName;
	}
	public void setCurrentFieldName(String currentFieldName) {
		this.currentFieldName = currentFieldName;
	}
	public String getCurrentJobName() {
		return currentJobName;
	}
	public void setCurrentJobName(String currentJobName) {
		this.currentJobName = currentJobName;
	}
	// //
	// //
	// //
	// //
	// //
	public void onProject(String name) {
		this.setCurrentProjectName(name);
		resetChangeRequest();
	}
	public void onChangeRequest(String name) {
		this.setCurrentChangeRequestName(name);
		resetStep();
	}
	public void onStep(String name) {
		this.setCurrentStepName(name);
		resetEvent();
	}
	public void onEvent(String name) {
		this.setCurrentEventName(name);
		resetField();
	}
	public void onField(String name) {
		this.setCurrentFieldName(name);
		resetJob();
	}
	public void onJob(String name) {
		this.setCurrentJobName(name);
	}
	
	protected void resetChangeRequest() {
		this.setCurrentChangeRequestName(null);
		resetStep();
	}
	protected void resetStep() {
		this.setCurrentStepName(null);
		resetEvent();
	}
	protected void resetEvent() {
		this.setCurrentEventName(null);
		resetField();
	}
	protected void resetField() {
		setCurrentFieldName(null);
		resetJob();
	}
	protected void resetJob() {
		setCurrentJobName(null);
	}
	
	public boolean isBuildingChangeRequest() {
		return this.getCurrentChangeRequestName() != null && this.getCurrentStepName() == null;
	}
	public boolean isBuildingStep() {
		return this.getCurrentStepName() != null && this.getCurrentEventName() == null;
	}
	public boolean isBuildingEvent() {
		return this.getCurrentEventName() != null && this.getCurrentFieldName() == null;
	}
	public boolean isBuildingField() {
		return this.getCurrentFieldName() != null;
	}
	
	public int currentWorkingLevel() {
		if (isBuildingField()) {
			return FIELD;
		}
		if (isBuildingEvent()) {
			return EVENT;
		}
		if (isBuildingStep()) {
			return STEP;
		}
		if (isBuildingChangeRequest()) {
			return CHANGE_REQUEST;
		}
		return PROJECT;
	}
	
}
