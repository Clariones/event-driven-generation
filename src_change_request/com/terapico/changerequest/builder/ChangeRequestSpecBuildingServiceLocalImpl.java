package com.terapico.changerequest.builder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.terapico.changerequest.spec.ChangeRequestSpec;
import com.terapico.changerequest.spec.EventSpec;
import com.terapico.changerequest.spec.FieldSpec;
import com.terapico.changerequest.spec.ProjectChangeRequestSpec;
import com.terapico.changerequest.spec.StepSpec;

import cla.edg.Utils;

public class ChangeRequestSpecBuildingServiceLocalImpl extends CRSBuildingServiceBaseLocalImpl {

	@Override
	public void createNewProject(String projectName) {
		setProjectSpec(new ProjectChangeRequestSpec());
		getProjectSpec().setName(projectName);
	}

	@Override
	public Map<String, Object> getProjectChangeRequestSpec() {
		root().getChangeRequestSpecs().forEach((cName, cr)->{
			cr.getStepSpecs().forEach(step->{
				step.getEventSpecs().forEach(event->{
					event.mergeWithPrototype();
				});
			});
		});
		return makeOutput();
	}

	@Override
	public boolean checkChangeRequestExists(String crTypeName) {
		return this.getChangeRequest(crTypeName) != null;
	}

	@Override
	public boolean checkStepExists(String crName, String stepName) {
		return this.getStep(crName, stepName) != null;
	}

	@Override
	public boolean checkEventExists(String crName, String stepName, String eventName) {
		return this.getEvent(crName, stepName, eventName) != null;
	}

	@Override
	public boolean checkFieldExists(String crName, String stepName, String eventName, String fieldName) {
		return this.getField(crName, stepName, eventName, fieldName) != null;
	}

	@Override
	public void createNewChangeRequest(String crTypeName) {
		root().addChangeRequestSpec(new ChangeRequestSpec().withName(crTypeName));
	}

	@Override
	public void createNewStep(String crName, int stepIdx, String stepName) {
		ChangeRequestSpec crSpec = this.getChangeRequest(crName);
		if (crSpec == null) {
			error("还没有创建changeRequest "+crName);
		}
		crSpec.addStep(new StepSpec().withName(stepName).withIndex(stepIdx));
	}

	@Override
	public String addEventIntoStep(String crName, String stepName, String eventType) {
		StepSpec stepSpec = this.getStep(crName, stepName);
		if (stepSpec == null) {
			error("还没有创建Step "+crName+"/"+stepName);
		}
		if (isGlobalNewEvent(eventType)) {
			root().addEvent(new EventSpec().withType(eventType).withName(eventType+" prototype"));
		}
		String tmpName = getTempEventName(eventType);
		stepSpec.addEvent(new EventSpec().withName(tmpName).withPrototype(getEvent(eventType)).withType(eventType));
		return tmpName;
	}

	@Override
	public void createNewField(String crName, String stepName, String eventName, String fieldName) {
		EventSpec evtSpec = sureEvent(crName, stepName, eventName);
		EventSpec prototypeEventSpec = evtSpec.getPrototype();
		prototypeEventSpec.addField(new FieldSpec().withName(fieldName));
	}

	@Override
	public void addFieldI18n(String crName, String stepName, String eventName, String fieldName, String localeCode,
			String text) {
		sureField(crName, stepName, eventName, fieldName).addI18n(localeCode, text);
		prototypeField(crName, stepName, eventName, fieldName).addI18nIfNeed(localeCode, text);
	}

	@Override
	public void addEventI18n(String crName, String stepName, String eventName, String localeCode, String text) {
		EventSpec spec = sureEvent(crName, stepName, eventName);
		spec.addI18n(localeCode, text);
		spec.getPrototype().setI18nIfNotExists(localeCode, text);
	}

	@Override
	public void addStepI18n(String crName, String stepName, String localeCode, String text) {
		sureStep(crName, stepName).addI18n(localeCode, text);
	}

	@Override
	public void addChangeRequestI18n(String crName, String localeCode, String text) {
		this.sureCR(crName).addI18n(localeCode, text);
	}

	@Override
	public String createDefaultStepByChangeRequest(String crName) {
		ChangeRequestSpec crSpec = this.sureCR(crName);
		StepSpec stepSpec = new StepSpec().withName(crSpec.getName()).withIndex(1);
		stepSpec.addI18n("zh_CN", crSpec.getTitle());
		crSpec.addStep(stepSpec);
		return stepSpec.getName();
	}

	@Override
	public void renameEvent(String crName, String stepName, String eventName, String newName) {
		sureEvent(crName, stepName, eventName).rename(newName);
	}

	@Override
	public void setFieldInteractionMode(String crName, String stepName, String eventName, String fieldName,
			String mode) {
		sureField(crName, stepName, eventName, fieldName).setInteractionMode(mode);
		prototypeField(crName, stepName, eventName, fieldName).setInteractionModeIfNeed(mode);
	}

	@Override
	public void setFieldRequired(String crName, String stepName, String eventName, String fieldName, boolean required) {
		sureField(crName, stepName, eventName, fieldName).setIsRequired(required);
		sureField(crName, stepName, eventName, fieldName).setIsRequired(required);
	}

	@Override
	public void setEventRequired(String crName, String stepName, String eventName, boolean required) {
		sureEvent(crName, stepName, eventName).setIsRequired(required);
	}

	@Override
	public void setStepRequired(String crName, String stepName, boolean required) {
		sureStep(crName, stepName).setIsRequired(required);
	}

	@Override
	public void forceFieldValue(String crName, String stepName, String eventName, String fieldName,
			Serializable forceValue) {
		sureField(crName, stepName, eventName, fieldName).setForceValue(forceValue);
		prototypeField(crName, stepName, eventName, fieldName).setForceValueIfNeed(forceValue);
	}

	@Override
	public void setFieldRange(String crName, String stepName, String eventName, String fieldName,
			Serializable[] rangeArgs) {
		sureField(crName, stepName, eventName, fieldName).setRangeArgs(rangeArgs);
		prototypeField(crName, stepName, eventName, fieldName).setRangeArgsIfNeed(rangeArgs);
	}

	@Override
	public void setFieldPlaceholder(String crName, String stepName, String eventName, String fieldName, String text) {
		sureField(crName, stepName, eventName, fieldName).setPlaceholder(text);
		prototypeField(crName, stepName, eventName, fieldName).setPlaceholderIfNeed(text);
	}

	@Override
	public void setFieldTipsTitle(String crName, String stepName, String eventName, String fieldName, String text) {
		sureField(crName, stepName, eventName, fieldName).setTipsTitle(text);
		prototypeField(crName, stepName, eventName, fieldName).setTipsTitleIfNeed(text);
	}

	@Override
	public void setFieldTipsContent(String crName, String stepName, String eventName, String fieldName, String text) {
		sureField(crName, stepName, eventName, fieldName).setTipsContext(text);
		prototypeField(crName, stepName, eventName, fieldName).setTipsContextIfNeed(text);
	}

	@Override
	public void addFieldValueMapping(String crName, String stepName, String eventName, String fieldName, String key,
			Serializable value) {
		sureField(crName, stepName, eventName, fieldName).addValueMapping(key, value);
		prototypeField(crName, stepName, eventName, fieldName).addValueMappingIfNeed(key, value);
	}

	@Override
	public void setFieldInputType(String crName, String stepName, String eventName, String fieldName,
			FieldType fieldType) {
		sureField(crName, stepName, eventName, fieldName).setInputType(fieldType);
		prototypeField(crName, stepName, eventName, fieldName).setInputTypeIfNeed(fieldType);
	}

	@Override
	public void setFieldSelectable(String crName, String stepName, String eventName, String fieldName,
			boolean selectable, boolean multiSelection) {
		sureField(crName, stepName, eventName, fieldName).setSelectable(selectable);
		sureField(crName, stepName, eventName, fieldName).setMultiSelection(multiSelection);
	}

	@Override
	public FieldType getFieldInputType(String crName, String stepName, String eventName, String fieldName) {
		return sureField(crName, stepName, eventName, fieldName).getInputType();
	}

	@Override
	public boolean isFieldMultiSelectable(String crName, String stepName, String eventName, String fieldName) {
		Boolean B = sureField(crName, stepName, eventName, fieldName).getMultiSelection();
		return B == null ? false : B.booleanValue();
	}

	@Override
	public boolean isFieldSelectable(String crName, String stepName, String eventName, String fieldName) {
		Boolean B = sureField(crName, stepName, eventName, fieldName).getSelectable();
		return B == null ? false : B.booleanValue();
	}

	@Override
	public boolean isFieldSingleSelectable(String crName, String stepName, String eventName, String fieldName) {
		Boolean B = sureField(crName, stepName, eventName, fieldName).getMultiSelection();
		return B == null ? false : !B.booleanValue();
	}

	@Override
	public void setFieldDefaultValue(String crName, String stepName, String eventName, String fieldName,
			Serializable defaultValue) {
		sureField(crName, stepName, eventName, fieldName).setDefaultValue(defaultValue);
		prototypeField(crName, stepName, eventName, fieldName).setDefaultValueIfNeed(defaultValue);
	}

	@Override
	public void setEventRepeatTimes(String crName, String stepName, String eventName, int min, int max) {
		sureEvent(crName, stepName, eventName).setIsCollection(true);
		sureEvent(crName, stepName, eventName).setMinCollectionSize(min);
		sureEvent(crName, stepName, eventName).setMaxCollectionSize(max);
	}

	@Override
	public void setFieldValuesRetrieveApi(String crName, String stepName, String eventName, String fieldName,
			String apiUrl) {
		apiUrl = Utils.toCamelCase(apiUrl).replaceAll("\\$\\{(.+)\\}", ":$1");
		sureField(crName, stepName, eventName, fieldName).setDataRetrieveApiUrl(apiUrl);
	}

	@Override
	public void clearPrototypeEventSetTag(String crName, String stepName, String eventName, String fieldName,
			String nameOfSetTag) {
		prototypeField(crName, stepName, eventName, fieldName).clearSetTag(nameOfSetTag);
	}

	@Override
	public void setEventOnlyonce(String crName, String stepName, String eventName) {
		EventSpec event = sureEvent(crName, stepName, eventName);
		event.setIsCollection(false);
		event.setMaxCollectionSize(null);
		event.setMinCollectionSize(null);
	}

	
}
