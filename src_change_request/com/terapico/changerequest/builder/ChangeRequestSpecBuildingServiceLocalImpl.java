package com.terapico.changerequest.builder;

import java.io.Serializable;

import com.terapico.changerequest.spec.ChangeRequestSpec;
import com.terapico.changerequest.spec.EventSpec;
import com.terapico.changerequest.spec.FieldSpec;
import com.terapico.changerequest.spec.ProjectChangeRequestSpec;
import com.terapico.changerequest.spec.StepSpec;

public class ChangeRequestSpecBuildingServiceLocalImpl extends CRSBuildingServiceBaseLocalImpl {

	@Override
	public void createNewProject(String projectName) {
		setProjectSpec(new ProjectChangeRequestSpec());
		getProjectSpec().setName(projectName);
	}

	@Override
	public ProjectChangeRequestSpec getProjectChangeRequestSpec() {
		return getProjectSpec();
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
			root().addEvent(new EventSpec().withType(eventType));
		}
		String tmpName = getTempEventName(eventType);
		stepSpec.addEvent(new EventSpec().withName(tmpName).withPrototype(getEvent(eventType)));
		return tmpName;
	}

	@Override
	public void createNewField(String crName, String stepName, String eventName, String fieldName) {
		EventSpec evtSpec = this.getEvent(crName, stepName, eventName);
		if (evtSpec == null) {
			error("还没有创建Event "+crName+"/"+stepName+"/"+eventName);
		}
		EventSpec prototypeEventSpec = evtSpec.getPrototype();
		if (prototypeEventSpec == null) {
			error("某次创建Event没有创建它的原型");
		}
		prototypeEventSpec.addField(new FieldSpec().withName(fieldName));
	}

	@Override
	public void addFieldI18n(String crName, String stepName, String eventName, String fieldName, String localeCode,
			String text) {
		FieldSpec fSpec = this.getField(crName, stepName, eventName, fieldName);
		if (fSpec == null) {
			error("还没有创建Field " + crName +"/"+ stepName +"/"+ eventName +"/"+ fieldName);
		}
		fSpec.addI18n(localeCode, text);
	}

	@Override
	public void addEventI18n(String crName, String stepName, String eventName, String localeCode, String text) {
		EventSpec spec = this.getEvent(crName, stepName, eventName);
		if (spec == null) {
			error("还没有创建Field " + crName +"/"+ stepName +"/"+ eventName);
		}
		spec.addI18n(localeCode, text);
	}

	@Override
	public void addStepI18n(String crName, String stepName, String localeCode, String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addChangeRequestI18n(String crName, String localeCode, String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String createDefaultStepByChangeRequest(String crName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void renameEvent(String crName, String stepName, String eventName, String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFieldInteractionMode(String crName, String stepName, String eventName, String fieldName,
			String mode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFieldRequired(String crName, String stepName, String eventName, String fieldName, boolean required) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEventRequired(String crName, String stepName, String eventName, boolean required) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStepRequired(String crName, String stepName, boolean required) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void forceFieldValue(String crName, String stepName, String eventName, String fieldName,
			Serializable forceValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFieldRange(String crName, String stepName, String eventName, String fieldName,
			Serializable[] rangeArgs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFieldPlaceholder(String crName, String stepName, String eventName, String fieldName, String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFieldTipsTitle(String crName, String stepName, String eventName, String fieldName, String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFieldTipsContent(String crName, String stepName, String eventName, String fieldName, String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFieldValueMapping(String crName, String stepName, String eventName, String fieldName, String key,
			Serializable value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFieldInputType(String crName, String stepName, String eventName, String fieldName,
			FieldType fieldType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFieldSelectable(String crName, String stepName, String eventName, String fieldName,
			boolean selectable, boolean multiSelection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FieldType getFieldInputType(String crName, String stepName, String eventName, String fieldName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFieldMultiSelectable(String crName, String stepName, String eventName, String fieldName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFieldSelectable(String crName, String stepName, String eventName, String fieldName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFieldSingleSelectable(String crName, String stepName, String eventName, String fieldName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setFieldDefaultValue(String crName, String stepName, String eventName, String fieldName,
			Serializable defaultValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEventRepeatTimes(String crName, String stepName, String eventName, int min, int max) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFieldValuesRetrieveApi(String crName, String stepName, String eventName, String fieldName,
			String apiUrl) {
		// TODO Auto-generated method stub
		
	}

	
}
