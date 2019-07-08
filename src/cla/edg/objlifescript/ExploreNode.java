package cla.edg.objlifescript;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ExploreNode extends ExploreElement{
	public transient boolean needChildren = false;
	public transient boolean childrenDone = false;
	public transient String curSubGroupName = null;
	public List<ExploreBranch> branches = null;
	protected transient ExploreBranch curBranch = null;
	public String loopTagName = null;
	public transient boolean loopFlag = false;
	public String chooseTagName = null;
	public String chooseTaskName = null;
	public transient String chooseFlag = null;
	public transient ExploreNode parentNode = null;
	protected Map<String, List<ExploreNode>> subNodeGroups;
	protected Map<String, String> subNodeStartNode;
	
	public boolean isNeedChildren() {
		return needChildren;
	}

	public void setNeedChildren(boolean needChildren) {
		this.needChildren = needChildren;
	}

	public List<ExploreBranch> getBranches() {
		return branches;
	}

	public void setBranches(List<ExploreBranch> branches) {
		this.branches = branches;
	}

	public ExploreNode getParentNode() {
		return parentNode;
	}

	public void setParentNode(ExploreNode parentNode) {
		this.parentNode = parentNode;
	}

	public Map<String, List<ExploreNode>> getSubNodeGroups() {
		return subNodeGroups;
	}

	public void setSubNodeGroups(Map<String, List<ExploreNode>> subNodeGroups) {
		this.subNodeGroups = subNodeGroups;
	}

	public Map<String, String> getSubNodeStartNode() {
		return subNodeStartNode;
	}

	public void setSubNodeStartNode(Map<String, String> subNodeStartNode) {
		this.subNodeStartNode = subNodeStartNode;
	}

	
	public String getChooseTaskName() {
		return chooseTaskName;
	}

	public void setChooseTaskName(String chooseTaskName) {
		this.chooseTaskName = chooseTaskName;
	}

	public boolean isLoopFlag() {
		return loopFlag;
	}

	public void setLoopFlag(boolean loopFlag) {
		this.loopFlag = loopFlag;
	}

	public String getChooseTagName() {
		return chooseTagName;
	}

	public void setChooseTagName(String chooseTagName) {
		this.chooseTagName = chooseTagName;
	}

	public String getChooseFlag() {
		return chooseFlag;
	}

	public void setChooseFlag(String chooseFlag) {
		this.chooseFlag = chooseFlag;
	}

	public String getLoopTagName() {
		return loopTagName;
	}

	public void addSubNode(ExploreNode subNode) {
		ensureSubNodeGroups();
		if (curSubGroupName == null) {
			throw new RuntimeException("节点"+subNode.getName()+"不能加入未命名子组");
		}
		subNodeGroups.get(curSubGroupName).add(subNode);
	}

	private void ensureSubNodeGroups() {
		if (subNodeGroups == null) {
			subNodeGroups = new HashMap<>();
			subNodeStartNode = new HashMap<>();
		}
		if (subNodeGroups.get(curSubGroupName) == null) {
			subNodeGroups.put(curSubGroupName, new ArrayList<>());
		}
	}
	private void ensureBranches() {
		if (branches == null) {
			branches = new ArrayList<>();
		}
	}

	public void addConditionCode(String conditionCode) {
		ensureBranches();
		// 条件不能重复
		checkConditionCode(conditionCode);
		if (curBranch == null) {
			curBranch = new ExploreBranch();
			branches.add(curBranch);
			curBranch.setConditionCode(conditionCode);
			return;
		}
		if(curBranch.getConditionCode() == null) {
			curBranch.setConditionCode(conditionCode);
			return;
		}
		// 已经有条件了, 又来,可能是新的, 也可能是重复写了
		if (curBranch.getTaskName() == null) {
			// 重复写了 when 语句
			throw new RuntimeException("不要连着写两条when()啊");
		}
		curBranch = new ExploreBranch();
		branches.add(curBranch);
		curBranch.setConditionCode(conditionCode);
	}
	
	private void checkConditionCode(String conditionCode) {
		for(ExploreBranch b: this.branches) {
			if (b.getConditionCode().equalsIgnoreCase(conditionCode)) {
				throw new RuntimeException("条件"+conditionCode+"已经写过了");
			}
		}
	}

	public void addTask(boolean stopFlag, String taskName) {
		ensureBranches();
		if (curBranch == null) {
			curBranch = new ExploreBranch();
			branches.add(curBranch);
			curBranch.setTaskName(taskName);
			curBranch.setStopFlag(stopFlag);
			return;
		}
		if(curBranch.getTaskName() == null) {
			curBranch.setTaskName(taskName);
			curBranch.setStopFlag(stopFlag);
			return;
		}
		// 已经有任务了, 又来,可能是新的, 也可能是重复写了
		if (curBranch.getConditionCode() == null) {
			// 重复写了 when 语句
			throw new RuntimeException("不要连着写两条stop_with/continue_with()啊");
		}
		curBranch = new ExploreBranch();
		branches.add(curBranch);
		curBranch.setTaskName(taskName);
		curBranch.setStopFlag(stopFlag);
		return;
	}

	public void addJumpTask(String jobName) {
		addTask(true, jobName);
		curBranch.setJumpFlag(true);
	}

	public void setLoopTagName(String tagName) {
		loopTagName = tagName;
		loopFlag = true;
		this.needChildren = true;
		curSubGroupName = "loop";
	}

	public void setSubStartName(String nodeName) {
		if (curSubGroupName == null) {
			throw new RuntimeException("节点"+nodeName+"不能加入未命名子组");
		}
		subNodeStartNode.put(curSubGroupName, nodeName);
	}

	public int onFinishTag(String tagName) {
		if (!this.needChildren) {
			return SUB_DONE;
		}
		if (this.curSubGroupName!= null) {
			if (this.loopFlag && this.curSubGroupName.equals("loop")) {
				if (tagName.equals(this.loopTagName)) {
					// 我自己的loop 描述写完了
					childrenDone = true;
					return SUB_DONE;
				}
			}
			if (this.curSubGroupName.equals(tagName)) {
				// 某个组的子节点描述完了
				this.curSubGroupName = null;
				return STILL_IN_SAME_PARENT;
			}
			// throw new RuntimeException("当前子组有名称, 又不是loop, 又不是one-of的一支");
		}
		// 可能是 one_of/all_of自身
		if (this.chooseFlag != null) {
			if (this.chooseTagName.equals(tagName)) {
				// 是退出 one-of/all-of. 
				if (this.loopFlag) {
					return STILL_IN_SAME_PARENT;
				}
			}
		}
//		if (this.loopFlag) {
//			return SUB_DONE;
//		}
		childrenDone = true;
		return SUB_DONE;
//		throw new RuntimeException("当前子组有名称, 又不是loop, 又不是one-of");
	}

	public String getPath() {
		String path = String.format(" in %s of %s", this.curSubGroupName, this.name);
		return path;
	}

}
