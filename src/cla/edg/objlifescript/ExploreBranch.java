package cla.edg.objlifescript;

public class ExploreBranch extends ExploreElement {
	protected String conditionCode;
	protected String taskName;
	protected boolean stopFlag = false;
	protected boolean jumpFlag = false;
	
	public boolean isJumpFlag() {
		return jumpFlag;
	}
	public void setJumpFlag(boolean jumpFlag) {
		this.jumpFlag = jumpFlag;
	}
	public String getConditionCode() {
		return conditionCode;
	}
	public void setConditionCode(String conditionCode) {
		this.conditionCode = conditionCode;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public boolean isStopFlag() {
		return stopFlag;
	}
	public void setStopFlag(boolean stopFlag) {
		this.stopFlag = stopFlag;
	}
	
	
}
