package com.terapico.changerequest.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import com.terapico.changerequest.builder.OutputName.CHANGE_REQUEST;
import com.terapico.changerequest.builder.OutputName.CHANGE_REQUEST.STEP;
import com.terapico.changerequest.builder.OutputName.CHANGE_REQUEST.STEP.EVENT;
import com.terapico.changerequest.builder.OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD;
import com.terapico.changerequest.spec.ChangeRequestSpec;
import com.terapico.changerequest.spec.EventSpec;
import com.terapico.changerequest.spec.FieldSpec;
import com.terapico.changerequest.spec.ProjectChangeRequestSpec;
import com.terapico.changerequest.spec.StepSpec;

import cla.edg.Utils;

public abstract class CRSBuildingServiceBaseLocalImpl implements ChangeRequestSpecBuildingService {
	protected ProjectChangeRequestSpec projectSpec;
	protected static final AtomicLong eventCount = new AtomicLong(0);

	protected void error(String message) {
		throw new RuntimeException(message);
	}
	
	public ProjectChangeRequestSpec getProjectSpec() {
		return projectSpec;
	}
	public void setProjectSpec(ProjectChangeRequestSpec projectSpec) {
		this.projectSpec = projectSpec;
	}
	public ProjectChangeRequestSpec root() {
		if (projectSpec == null) {
			error("还没建立项目");
		}
		return projectSpec;
	}

	protected ChangeRequestSpec getChangeRequest(String crName) {
		if (projectSpec == null) {
			error("还没建立项目");
		}
		Map<String, ChangeRequestSpec> specs = projectSpec.getChangeRequestSpecs();
		if (specs == null) {
			return null;
		}
		return specs.get(crName);
	}
	protected StepSpec getStep(String crName, String stepName) {
		ChangeRequestSpec crSpec = getChangeRequest(crName);
		if (crSpec == null || crSpec.getStepSpecs() == null) {
			return null;
		}
		return crSpec.getStepSpecs().stream().filter(it->it.getName().equals(stepName)).findFirst().orElse(null);
	}
	protected EventSpec getEvent(String crName, String stepName, String eventName) {
		StepSpec stepSpec = getStep(crName, stepName);
		if (stepSpec == null || stepSpec.getEventSpecs() == null) {
			return null;
		}
		return stepSpec.getEventSpecs().stream().filter(it->it.getName().equals(eventName)).findFirst().orElse(null);
	}
	protected EventSpec getEvent(String eventType) {
		if (root().getAllEventSpecs() == null) {
			return null;
		}
		return root().getAllEventSpecs().get(eventType);
	}
	protected FieldSpec getField(String crName, String stepName, String eventName, String fieldName) {
		EventSpec eventSpec = getEvent(crName, stepName, eventName);
		if (eventSpec == null || eventSpec.getFieldSpecs() == null) {
			return null;
		}
		return eventSpec.getFieldSpecs().stream().filter(it->it.getName().equals(fieldName)).findFirst().orElse(null);
	}

	protected boolean isGlobalNewEvent(String eventType) {
		if (root().getAllEventSpecs() == null) {
			return true;
		}
		if (root().getAllEventSpecs().containsKey(eventType)) {
			return false;
		}
		return true;
	}

	protected String getTempEventName(String eventType) {
		// 如果现有的events没有这个名字,默认用这个type作为名字
		if (root().getChangeRequestSpecs().values().stream()
				.flatMap(itStep->{
					if (itStep.getStepSpecs() == null) {
						return new ArrayList<StepSpec>().stream();
					}
					return itStep.getStepSpecs().stream();
				})
				.flatMap(itEvent->{
					if (itEvent.getEventSpecs() == null) {
						return new ArrayList<EventSpec>().stream();
					}
					return itEvent.getEventSpecs().stream();
				})
				.anyMatch(it->it.getName().equals(eventType))) {
			return String.format("evt_%s_%d", eventType, eventCount.incrementAndGet());
		}
		return eventType;
	}

	protected FieldSpec sureField(String crName, String stepName, String eventName, String fieldName) {
		EventSpec eventSpec = this.getEvent(crName, stepName, eventName);
		FieldSpec spec = eventSpec.findField(fieldName);
		if (spec != null) {
			return spec;
		}
		//if (spec == null) 
		spec = eventSpec.getPrototype().findField(fieldName);
		if (spec == null) {
			error("还没有创建Field " + crName +"/"+ stepName +"/"+ eventName +"/"+ fieldName);
		}
		FieldSpec newSpec = spec.copy();
		eventSpec.addField(newSpec);
		return newSpec;
	}
	protected FieldSpec prototypeField(String crName, String stepName, String eventName, String fieldName) {
		return getEvent(getEvent(crName, stepName, eventName).getType()).findField(fieldName);
	}
	protected EventSpec sureEvent(String crName, String stepName, String eventName) {
		EventSpec spec = this.getEvent(crName, stepName, eventName);
		if (spec == null) {
			error("还没有创建Event " + crName +"/"+ stepName +"/"+ eventName);
		}
		return spec;
	}
	protected StepSpec sureStep(String crName, String stepName) {
		StepSpec spec = this.getStep(crName, stepName);
		if (spec == null) {
			error("还没有创建Step " + crName +"/"+ stepName);
		}
		return spec;
	}
	protected ChangeRequestSpec sureCR(String crName) {
		ChangeRequestSpec spec = this.getChangeRequest(crName);
		if (spec == null) {
			error("还没有创建ChangeRequest " + crName );
		}
		return spec;
	}

	protected Map<String, Object> makeOutput() {
		Map<String, Object> result = new HashMap<>();
		result.put(OutputName.NAME, root().getName());
		result.put(OutputName.TITLE, root().getTitle());
		
		List<Object> crSpecs = new ArrayList<>();
		root().getChangeRequestSpecs().forEach((crName,crSpec)->{
			Map<String, Object> crSpecOutput = makeCROutput(crSpec);
			crSpecs.add(crSpecOutput);
		});
		result.put(OutputName.CHANGE_REQUEST_LIST, crSpecs);
		return result;
	}

	protected Map<String, Object> makeCROutput(ChangeRequestSpec spec) {
		Map<String, Object> result = new HashMap<>();
		result.put(CHANGE_REQUEST.TITLE, spec.getTitle());
		result.put(CHANGE_REQUEST.TYPE, spec.getName());
		result.put(CHANGE_REQUEST.REQUEST_PREFIX, spec.getRequestUrlPrefix());
		List<Object> stepSpecs = new ArrayList<>();
		spec.getStepSpecs().forEach(stepSpec->{
			Map<String, Object> stepSpecOutput = makeStepOutput(spec, stepSpec);
			stepSpecs.add(stepSpecOutput);
		});
		result.put(CHANGE_REQUEST.STEP_LIST, stepSpecs);
		return result;
	}

	protected Map<String, Object> makeStepOutput(ChangeRequestSpec crSpec, StepSpec stepSpec) {
		Map<String, Object> result = new HashMap<>();
		result.put(STEP.TITLE, stepSpec.getTitle());
		result.put(STEP.NAME, stepSpec.getName());
		result.put(STEP.INDEX, stepSpec.getIndex());
		result.put(STEP.SKIP, !stepSpec.getIsRequired());
		List<Object> eventSpecs = new ArrayList<>();
		stepSpec.getEventSpecs().forEach(eventSpec->{
			Map<String, Object> eventSpecOutput = makeEventOutput(crSpec, stepSpec, eventSpec);
			eventSpecs.add(eventSpecOutput);
		});
		result.put(STEP.EVENT_LIST, eventSpecs);
		return result;
	}

	protected Map<String, Object> makeEventOutput(ChangeRequestSpec crSpec, StepSpec stepSpec, EventSpec eventSpec) {
		Map<String, Object> result = new HashMap<>();
		result.put(EVENT.TITLE, eventSpec.getTitle());
		result.put(EVENT.NAME, eventSpec.getName());
		result.put(EVENT.TYPE, eventSpec.getType());
		result.put(EVENT.MUST, eventSpec.getIsRequired());
		result.put(EVENT.TYPE, eventSpec.getType());
		result.put(EVENT.MULTIPLE, eventSpec.getIsCollection());
		if (eventSpec.getIsCollection()) {
			if (eventSpec.getMinCollectionSize()==null) {
				result.put(EVENT.MIN, eventSpec.getIsRequired()?1:0);
			}else {
				result.put(EVENT.MIN, eventSpec.getMinCollectionSize());
			}
			result.put(EVENT.MAX, eventSpec.getMaxCollectionSize()==null?EVENT._DEFAULT_MAX:eventSpec.getMaxCollectionSize());
		}
		List<Object> fieldSpecs = new ArrayList<>();
		eventSpec.getFieldSpecs().forEach(fieldSpec->{
			Map<String, Object> fieldSpecOutput = makeFieldOutput(crSpec, stepSpec, eventSpec, fieldSpec);
			fieldSpecs.add(fieldSpecOutput);
		});
		result.put(EVENT.FIELD_LIST, fieldSpecs);
		return result;
	}

	protected Map<String, Object> makeFieldOutput(ChangeRequestSpec crSpec, StepSpec stepSpec, EventSpec eventSpec,
			FieldSpec fieldSpec) {
		Map<String, Object> result = new HashMap<>();
		result.put(FIELD.NAME, fieldSpec.getName());
		result.put(FIELD.TITLE, fieldSpec.getTitle());
		result.put(FIELD.INTER_ACTION_MODE,fieldSpec.getInteractionMode());
		if (fieldSpec.getSelectable() == null || fieldSpec.getSelectable().booleanValue() ==  false) {
			result.put(FIELD.SELECTABLE, FIELD.SELECTABLE_NOT);
		}else if(fieldSpec.getMultiSelection() == null || fieldSpec.getMultiSelection().booleanValue() == false){
			result.put(FIELD.SELECTABLE, FIELD.SELECTABLE_SINGLE);
		}else {
			result.put(FIELD.SELECTABLE, FIELD.SELECTABLE_MULTI);
		}
		result.put(FIELD.MUST, fieldSpec.getIsRequired());
		if (fieldSpec.getRangeArgs() != null) {
			putIfNotNull(result, FIELD.MIN, fieldSpec.getRangeArgs()[0]);
			putIfNotNull(result, FIELD.MAX, fieldSpec.getRangeArgs()[1]);
		}
		result.put(FIELD.TYPE, fieldSpec.getInputType().getSystemTypeName());
		putIfNotNull(result, FIELD.PLACE_HOLDER, fieldSpec.getPlaceholder());
		putIfNotNull(result, FIELD.TIPS_CONTENT, fieldSpec.getTipsContext());
		putIfNotNull(result, FIELD.TIPS_TITLE, fieldSpec.getTipsTitle());
		putIfNotNull(result, FIELD.FORCE_VALUE, fieldSpec.getForceValue());
		putIfNotNull(result, FIELD.DEFAULT_VALUE, fieldSpec.getDefaultValue());
		putIfNotNull(result, FIELD.VALUES, fieldSpec.getValuesMapping());
		putIfNotNull(result, FIELD.VALUES_RETRIEVE_API, fieldSpec.getDataRetrieveApiUrl());
		putIfNotNull(result, FIELD.SAMPLE_DATA, fieldSpec.getSampleData());
		return result;
	}

	@Override
	public void putIfNotNull(Map<String, Object> result, String key, Object value) {
		if (value == null) {
			return;
		}
		result.put(key, value);
	}
}
