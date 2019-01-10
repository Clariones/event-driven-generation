package cla.edg.eventscript;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cla.edg.Utils;

public class EventInfo extends BaseEventElement{
	protected String name;
	protected String comments;
	protected Map<String, EventProcessResultBranch> branches;
	protected boolean externalEvent = true;
	

	public Map<String, EventProcessResultBranch> getBranches() {
		return branches;
	}

	public void setBranches(Map<String, EventProcessResultBranch> branches) {
		this.branches = branches;
	}

	public boolean isExternalEvent() {
		return externalEvent;
	}

	public void setExternalEvent(boolean externalEvent) {
		this.externalEvent = externalEvent;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public EventProcessResultBranch addNewBranch(String conditionCode) {
		EventProcessResultBranch  bch = new EventProcessResultBranch();
		bch.setConditionCode(conditionCode);
		ensureBranchMap();
		branches.put(conditionCode, bch);
		return bch;
	}

	private void ensureBranchMap() {
		if (branches == null) {
			branches = new HashMap<>();
		}
	}
	
	public String getJavaName() {
		return Utils.toCamelCase(name);
	}
	public boolean isHasBranch() {
		if (branches == null) {
			return false;
		}
		return branches.size() > 1;
	}
	public List<EventProcessResultBranch> getDefinedBranches(){
		List<EventProcessResultBranch> bchs = new ArrayList<>();
		Set<String> keys = branches.keySet();
		List<String> keyList = new ArrayList<>(keys);
		Collections.sort(keyList);
		keyList.remove("by default");
		if (keyList.size() == keys.size()) {
			keyList.remove(0);
		}
		
		for(String key: keyList) {
			bchs.add(branches.get(key));
		}
		return bchs;
	}
	public EventProcessResultBranch getDefaultBranch() {
		if (branches == null || branches.isEmpty()) {
			return new EventProcessResultBranch();
		}
		if (branches.size() == 1) {
			return branches.values().iterator().next();
		}
		EventProcessResultBranch bch = branches.get("by default");
		if (bch != null) {
			return bch;
		}
		Set<String> keys = branches.keySet();
		List<String> keyList = new ArrayList<>(keys);
		Collections.sort(keyList);
		String key = keyList.get(0);
		return branches.get(key);
	}
	
}
