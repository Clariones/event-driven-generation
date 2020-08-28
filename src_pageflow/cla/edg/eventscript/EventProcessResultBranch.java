package cla.edg.eventscript;

import clariones.tool.builder.Utils;

import java.util.LinkedList;
import java.util.List;


public class EventProcessResultBranch extends BaseEventElement{
	protected String conditionCode;
	protected String comments;
	protected List<EventRipple> eventRipples;
	
	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getConditionCode() {
		return conditionCode;
	}

	public void setConditionCode(String conditionCode) {
		this.conditionCode = conditionCode;
	}

	public EventRipple addNewEventRipple(String eventName) {
		ensureEventRipples();
		EventRipple er = new EventRipple();
		er.setEventCode(eventName);
		eventRipples.add(er);
		return er;
	}

	private void ensureEventRipples() {
		if (eventRipples == null) {
			eventRipples = new LinkedList<>();
		}
	}
	
	public String getConditionCodeConst() {
		return Utils.toJavaConstStyle(conditionCode);
	}

	public List<EventRipple> getEventRipples() {
		return eventRipples;
	}

	public void setEventRipples(List<EventRipple> eventRipples) {
		this.eventRipples = eventRipples;
	}
	
}
