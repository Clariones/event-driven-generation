package com.terapico.changerequest.builder;

import java.io.Serializable;
import java.util.Map;

import com.terapico.changerequest.spec.ProjectChangeRequestSpec;

public interface ChangeRequestSpecBuildingService {

	public void createNewProject(String projectName);

	public Map<String, Object> getProjectChangeRequestSpec();

	/** 判断指定type的CR是否存在. 如果不是existed指定的,则抛出异常 */
	public boolean checkChangeRequestExists(String crTypeName);
	public boolean checkStepExists(String scrName, String stepName);
	public boolean checkEventExists(String scrName, String stepName, String eventName);
	public boolean checkFieldExists(String scrName, String stepName, String eventName, String fieldName);

	public void createNewChangeRequest(String crTypeName);
	public void createNewStep(String crName, int stepIdx, String stepName);
	// 返回值是event的name,没有的话,就临时生成一个
	public String addEventIntoStep(String crName, String stepName, String eventType);
	public void createNewField(String crName, String stepName, String eventName, String fieldName);

	public void addFieldI18n(String crName, String stepName, String eventName, String fieldName, String localeCode,
			String text);

	public void addEventI18n(String crName, String stepName, String eventName, String localeCode, String text);

	public void addStepI18n(String crName, String stepName, String localeCode, String text);

	public void addChangeRequestI18n(String crName, String localeCode, String text);

	

	public String createDefaultStepByChangeRequest(String crName);

	
	// 给event重新命名
	public void renameEvent(String crName, String stepName, String eventName, String name);

	public void setFieldInteractionMode(String crName, String stepName, String eventName, String fieldName, String mode);

	public void setFieldRequired(String crName, String stepName, String eventName, String fieldName, boolean required);

	public void setEventRequired(String crName, String stepName, String eventName, boolean required);

	public void setStepRequired(String crName, String stepName, boolean required);

	public void forceFieldValue(String crName, String stepName, String eventName, String fieldName, Serializable forceValue);

	public void setFieldRange(String crName, String stepName, String eventName, String fieldName, Serializable[] rangeArgs);

	public void setFieldPlaceholder(String crName, String stepName, String eventName, String fieldName, String text);

	public void setFieldTipsTitle(String crName, String stepName, String eventName, String fieldName, String text);

	public void setFieldTipsContent(String crName, String stepName, String eventName, String fieldName, String text);

	public void addFieldValueMapping(String crName, String stepName, String eventName, String fieldName, String key, Serializable value);

	public void setFieldInputType(String crName, String stepName, String eventName, String fieldName, FieldType fieldType);
	public void setFieldSelectable(String crName, String stepName, String eventName, String fieldName, boolean selectable, boolean multiSelection);

	public FieldType getFieldInputType(String crName, String stepName, String eventName, String fieldName);
	public boolean isFieldMultiSelectable(String crName, String stepName, String eventName, String fieldName);
	public boolean isFieldSelectable(String crName, String stepName, String eventName, String fieldName);
	public boolean isFieldSingleSelectable(String crName, String stepName, String eventName, String fieldName);

	public void setFieldDefaultValue(String crName, String stepName, String eventName, String fieldName, Serializable defaultValue);

	public void setEventRepeatTimes(String crName, String stepName, String eventName, int min, int max);

	public void setFieldValuesRetrieveApi(String crName, String stepName, String eventName, String fieldName, String apiUrl);

	public void clearPrototypeEventSetTag(String crName, String stepName, String eventName, String fieldName, String nameOfSetTag);

	public void setEventOnlyonce(String crName, String stepName, String eventName);

	void putIfNotNull(Map<String, Object> result, String key, Object value);

	public boolean checkFieldExistsInPrototype(String crName, String stepName, String eventName, String fieldName);

	public void cloneFieldFromPrototype(String crName, String stepName, String eventName, String fieldName);




	

	

}
