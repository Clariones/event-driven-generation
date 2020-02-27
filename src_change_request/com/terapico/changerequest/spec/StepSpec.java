package com.terapico.changerequest.spec;

import java.util.LinkedList;
import java.util.List;

public class StepSpec extends CommonSpec<StepSpec>{
	protected List<EventSpec> eventSpecs;
	protected int index;
	
	public List<EventSpec> getEventSpecs() {
		return eventSpecs;
	}
	public void setEventSpecs(List<EventSpec> eventSpecs) {
		this.eventSpecs = eventSpecs;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	public StepSpec withIndex(int index) {
		this.setIndex(index);
		return this;
	}
	
	protected List<EventSpec> ensureEventSpecs() {
		if (eventSpecs != null) {
			return eventSpecs;
		}
		return eventSpecs = new LinkedList<>();
	}
	
	
	public void addEvent(EventSpec eventSpec) {
		ensureEventSpecs().add(eventSpec);
	}
	
}
