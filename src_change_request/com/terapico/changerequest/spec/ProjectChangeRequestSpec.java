package com.terapico.changerequest.spec;

import java.util.HashMap;
import java.util.Map;

public class ProjectChangeRequestSpec extends CommonSpec<ProjectChangeRequestSpec>{
	protected Map<String, EventSpec> allEventSpecs;
	protected Map<String, ChangeRequestSpec> changeRequestSpecs;
	protected String requestUrlPrefix;

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
	
	
	public String getRequestUrlPrefix() {
		return requestUrlPrefix;
	}
	public void setRequestUrlPrefix(String requestUrlPrefix) {
		this.requestUrlPrefix = requestUrlPrefix;
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
	
	
	public ChangeRequestSpec addChangeRequestSpec(ChangeRequestSpec crSpec) {
		return ensureChangeRequestSpecs().put(crSpec.getName(), crSpec);
	}
	public EventSpec addEvent(EventSpec eventSpec) {
		return ensureAllEventSpecs().put(eventSpec.getType(), eventSpec);
	}
	
	@Override
	public String getSpecType() {
		return "Project";
	}
}
