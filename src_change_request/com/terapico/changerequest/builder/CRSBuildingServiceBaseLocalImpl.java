package com.terapico.changerequest.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import com.terapico.changerequest.spec.ChangeRequestSpec;
import com.terapico.changerequest.spec.EventSpec;
import com.terapico.changerequest.spec.FieldSpec;
import com.terapico.changerequest.spec.ProjectChangeRequestSpec;
import com.terapico.changerequest.spec.StepSpec;

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
}
