package cla.edg.eventscript;

import java.util.LinkedList;
import java.util.List;

public class BasicEventScriptInfo {

	public List<EventInfo> getEvents() {
		return events;
	}

	public void setEvents(List<EventInfo> events) {
		this.events = events;
	}
	protected String bussinessName;
	protected List<EventInfo> events;
	protected transient EventInfo currentEventInfo;
	protected transient EventProcessResultBranch currentBranch;
	protected transient Object currentOperation;
	protected transient EventRipple currentEventRipple;
	protected boolean internalEvent = false;

	
	public boolean isInternalEvent() {
		return internalEvent;
	}

	public void setInternalEvent(boolean internalEvent) {
		this.internalEvent = internalEvent;
	}

	public String getBussinessName() {
		return bussinessName;
	}

	public void setBussinessName(String bussinessName) {
		this.bussinessName = bussinessName;
	}

	protected void ensureEventList() {
		if (events == null) {
			events = new LinkedList<>();
		}
		
	}

	protected void addEventInfo(EventInfo newEvent) {
		ensureEventList();
		this.events.add(newEvent);
	}

	protected void setCurrentOperation(EventInfo newEvent) {
		this.currentEventInfo = newEvent;
		this.currentOperation = newEvent;
		currentBranch = null;
		currentEventRipple = null;
	}
	protected void setCurrentOperation(EventProcessResultBranch bch) {
		currentBranch = bch;
		currentOperation = bch;
		currentEventRipple = null;
	}
	protected void setCurrentOperation(EventRipple er) {
		currentEventRipple = er;
		currentOperation = er;
	}
}
