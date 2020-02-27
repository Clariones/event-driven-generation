package com.terapico.changerequest.spec;

import java.util.HashMap;
import java.util.Map;

public class ProjectChangeRequestSpec extends CommonSpec<ProjectChangeRequestSpec>{
	protected Map<String, EventSpec> allEventSpecs;
	protected Map<String, ChangeRequestSpec> changeRequestSpecs;

	public Map<String, EventSpec> getAllEventSpecs() {
		return allEventSpecs;
	}
	public void setAllEventSpecs(Map<String, EventSpec> allEventSpecs) {
		this.allEventSpecs = allEventSpecs;
	}
	public Map<String, ChangeRequestSpec> getChangeRequestSpecs() {
		return changeRequestSpecs;
	}
	public void setChangeRequestSpecs(Map<String, ChangeRequestSpec> changeRequestSpecs) {
		this.changeRequestSpecs = changeRequestSpecs;
	}
	
	
	protected Map<String, ChangeRequestSpec> ensureChangeRequestSpecs() {
		if (changeRequestSpecs != null) {
			return changeRequestSpecs;
		}
		changeRequestSpecs = new HashMap<>();
		return changeRequestSpecs;
	}
	protected Map<String, EventSpec> ensureAllEventSpecs() {
		if (allEventSpecs != null) {
			return allEventSpecs;
		}
		allEventSpecs = new HashMap<>();
		return allEventSpecs;
	}
	
	
	public void addChangeRequestSpec(ChangeRequestSpec crSpec) {
		ensureChangeRequestSpecs().put(crSpec.getName(), crSpec);
	}
	public void addEvent(EventSpec eventSpec) {
		ensureAllEventSpecs().put(eventSpec.getType(), eventSpec);
	}
	
	
}
