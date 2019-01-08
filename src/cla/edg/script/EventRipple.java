package cla.edg.script;

import cla.edg.Utils;

public class EventRipple extends BaseEventElement{
	protected String eventCode;
	protected String comments;
	protected boolean isAsync = false;
	public String getEventCode() {
		return eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}
	public boolean isAsync() {
		return isAsync;
	}
	public void setAsync(boolean isAsync) {
		this.isAsync = isAsync;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public String getEventJavaName() {
		return Utils.toCamelCase(eventCode);
	}
	
}
