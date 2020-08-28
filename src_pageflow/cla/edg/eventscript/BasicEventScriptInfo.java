package cla.edg.eventscript;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
	protected Map<String, Object> configuration;
	
	
	public Map<String, Object> getConfiguration() {
		if (configuration == null) {
			configuration = new HashMap<>();
		}
		return configuration;
	}

	public void setConfiguration(Map<String, Object> configuration) {
		this.configuration = configuration;
	}
	
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

	
	protected EventScript addConfiuration(String key, Object value) {
		if (currentOperation != this.getConfiguration()) {
			throw new RuntimeException("当前任务是"+currentOperation.getClass().getSimpleName()+",不能设置"+key);
		}
		this.getConfiguration().put(key, value);
		return (EventScript) this;
	}
	protected String getConfigureValue(String key) {
		return (String) this.getConfiguration().get(key);
	}
	
	public EventScript output_base_folder(String value) {
		return addConfiuration("output_base_folder", value);
	}
	public String output_base_folder() {
		return getConfigureValue("output_base_folder");
	}

	public EventScript template_base_folder(String value) {
		return addConfiuration("template_base_folder", value);
	}
	public String template_base_folder() {
		return getConfigureValue("template_base_folder");
	}

	public EventScript base_package_name(String value) {
		return addConfiuration("base_package_name", value);
	}
	public String base_package_name() {
		return getConfigureValue("base_package_name");
	}
	
	public EventScript project_name(String value) {
		return addConfiuration("project_name", value);
	}
	public String project_name() {
		return getConfigureValue("project_name");
	}
	
	public EventScript parent_class_name(String value) {
		return addConfiuration("parent_class_name", value);
	}
	public String parent_class_name() {
		return getConfigureValue("parent_class_name");
	}
	
	public EventScript parent_class_package(String value) {
		return addConfiuration("parent_class_package", value);
	}
	public String parent_class_package() {
		return getConfigureValue("parent_class_package");
	}
}
