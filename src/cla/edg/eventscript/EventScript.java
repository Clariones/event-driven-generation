package cla.edg.eventscript;

import java.util.ArrayList;
import java.util.List;

public class EventScript extends BasicEventScriptInfo {
	public EventScript on_event(String eventName) {
		EventInfo newEvent = new EventInfo();
		newEvent.setName(eventName);
		newEvent.setExternalEvent(!internalEvent);
		addEventInfo(newEvent);
		setCurrentOperation(newEvent);
		return this;
	}

	public EventScript comments(String comments) {
		if (this.currentOperation instanceof EventInfo) {
			((EventInfo) currentOperation).setComments(comments);
		}else if (this.currentOperation instanceof EventProcessResultBranch) {
			((EventProcessResultBranch) currentOperation).setComments(comments);
		}else if (this.currentOperation instanceof EventRipple) {
			currentEventRipple.setComments(comments);
		} else {
			throw new RuntimeException("当前任务是"+currentOperation.getClass().getSimpleName()+",不能加注释");
		}
		return this;
	}

	public EventScript when(String conditionCode) {
		if (this.currentOperation instanceof EventInfo || currentOperation instanceof EventProcessResultBranch 
				|| currentOperation instanceof EventRipple) {
			EventInfo evt = currentEventInfo;
			EventProcessResultBranch bch = evt.addNewBranch(conditionCode);
			setCurrentOperation(bch);
		}else {
			throw new RuntimeException("当前任务是"+currentOperation.getClass().getSimpleName()+",不能加条件");
		}
		return this;
	}

	public EventScript event_ripple(String eventName) {
		if (currentOperation instanceof EventProcessResultBranch || currentOperation instanceof EventRipple) {
			EventProcessResultBranch bch = this.currentBranch;
			EventRipple er = bch.addNewEventRipple(eventName);
			setCurrentOperation(er);
		} else if (currentOperation instanceof EventInfo) {
			EventInfo evt = currentEventInfo;
			EventProcessResultBranch bch = evt.addNewBranch("by default");
			setCurrentOperation(bch);
			EventRipple er = bch.addNewEventRipple(eventName);
			setCurrentOperation(er);
		} else {
			throw new RuntimeException("当前任务是" + currentOperation.getClass().getSimpleName() + ",不能加触发事件");
		}
		return this;
	}

	public EventScript asyn() {
		if (currentOperation instanceof EventRipple) {
			EventRipple er = this.currentEventRipple;
			er.setAsync(true);
		} else {
			throw new RuntimeException("当前任务是" + currentOperation.getClass().getSimpleName() + ",不能指定异步模式");
		}
		return this;
	}

	public EventScript internal_only() {
		if (currentOperation instanceof EventInfo) {
			EventInfo evt = currentEventInfo;
			evt.setExternalEvent(false);
		} else {
			throw new RuntimeException("当前任务是" + currentOperation.getClass().getSimpleName() + ",不能限制是否内部消息");
		}
		return this;
	}

	
	public List<String> getAllBranchCode(){
		if (this.events == null) {
			return new ArrayList<>();
		}
		
		List<String> result = new ArrayList<>();
		result.add("by default");
		for(EventInfo event : this.events) {
			if (event.branches == null) {
				continue;
			}
			for(EventProcessResultBranch bch : event.branches.values()) {
				if (result.contains(bch.getConditionCode())) {
					continue;
				}
				result.add(bch.getConditionCode());
			}
		}
		return result;
	}

	public EventScript done() {
		setCurrentOperation((EventInfo)null);
		return this;
	}

	public EventScript when_others() {
		return when("by default");
	}

	public EventScript to(String serviceName) {
		if (currentOperation instanceof EventRipple) {
			EventRipple evtRp = currentEventRipple;
			evtRp.setServiceName(serviceName);
		} else {
			throw new RuntimeException("当前任务是" + currentOperation.getClass().getSimpleName() + ",不能指定消息处理者");
		}
		return this;
	}

	public EventScript internal_only_bydefault() {
		internalEvent = true;
		return this;
	}

	public EventScript rule_comments(String comments) {
		if (currentOperation instanceof EventInfo) {
			EventInfo evtInfo = currentEventInfo;
			evtInfo.addRuleComments(comments);
		} else {
			throw new RuntimeException("当前任务是" + currentOperation.getClass().getSimpleName() + ",不能添加详细注释");
		}
		return this;
	}

	public EventScript with(String actorName) {
		if (currentOperation instanceof EventInfo) {
			EventInfo evtInfo = currentEventInfo;
			evtInfo.addActor(actorName);
		} else {
			throw new RuntimeException("当前任务是" + currentOperation.getClass().getSimpleName() + ",不能添加详细注释");
		}
		return this;
	}
	

}
