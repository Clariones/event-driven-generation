package cla.edg.objlifescript;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ObjectLifeScript {
	
	protected Configuration curConfig;
	protected transient ExploreNode curNode;
	protected transient Object curWorker;
	protected transient Map<String, ExploreNode> allNodes = new HashMap<>();
	protected List<ExploreNode> nodeList = new ArrayList<>();
	protected transient Stack<ExploreNode> parentNodes = new Stack<>();
	
	public List<ExploreNode> getNodeList() {
		return nodeList;
	}
	public void setNodeList(List<ExploreNode> nodeList) {
		this.nodeList = nodeList;
	}



	protected String name;
	protected Configuration config;
	private void ensureNode(String nodeName) {
		String namePrefix = "";
		if (!parentNodes.isEmpty() && allNodes.containsKey(nodeName)) {
			ExploreNode parentNode = parentNodes.peek();
			namePrefix = parentNode.getPath();
		}
		nodeName += namePrefix;
		if (allNodes.containsKey(nodeName)) {
			throw new RuntimeException(nodeName+"已存在");
		}
		if (curNode != null) {
			if (curNode.needChildren && !curNode.childrenDone) {
				parentNodes.push(curNode);
			}
		}
		curNode = new ExploreNode();
		curNode.name = nodeName;
		curWorker = curNode;
		allNodes.put(nodeName, curNode);
		
		if (!parentNodes.isEmpty()) {
			ExploreNode parentNode = parentNodes.peek();
			if (parentNode != null) {
				curNode.parentNode = parentNode;
				parentNode.addSubNode(curNode);
				return;
			}
		}
		nodeList.add(curNode);
	}
	private void ensureWorkerType(String errMessage, Class<?> ...classes ) {
		for(Class<?> clazz:classes) {
			if (curWorker.getClass().getCanonicalName().equals(clazz.getCanonicalName())) {
				return;
			}
		}
		throw new RuntimeException("当前的类型是"+curWorker.getClass().getSimpleName()+", " + errMessage);
	}
	
	public Map<String, ExploreNode> getAllNodes() {
		return allNodes;
	}
	public void setAllNodes(Map<String, ExploreNode> allNodes) {
		this.allNodes = allNodes;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ObjectLifeScript configure() {
		if (config == null) {
			config = new Configuration();
		}
		curConfig = config;
		curWorker = config;
		return this;
	}

	public ObjectLifeScript package_name(String pkgName) {
		ensureWorkerType("不能指定生成代码的包名",Configuration.class);
		curConfig.packageName = pkgName;
		return this;
	}
	public ObjectLifeScript explore_object(String objName) {
		ensureWorkerType("不能指定探索的目标对象",Configuration.class);
		curConfig.objectTypeName = objName;
		return this;
	}
	public ObjectLifeScript project_name(String prjName) {
		ensureWorkerType("不能指定项目名称",Configuration.class);
		curConfig.projectName = prjName;
		return this;
	}
	public ObjectLifeScript start_from(String nodeName) {
		ensureNode(nodeName);
		if (parentNodes.isEmpty()) {
			return this;
		}
		ExploreNode parentNode = parentNodes.peek();
		if (parentNode != null) {
			parentNode.setSubStartName(curNode.name);
		}
		return this;
	}
	public ObjectLifeScript then(String jobName) {
		ensureNode(jobName);
		return this;
	}
	public ObjectLifeScript when_not() {
		return when("not");
	}
	public ObjectLifeScript stop_with(String taskName) {
		ensureWorkerType("不能描述任务", ExploreNode.class);
		curNode.addTask(true, taskName);
		return this;
	}
	public ObjectLifeScript when(String conditionCode) {
		ensureWorkerType("不能描述条件", ExploreNode.class);
		curNode.addConditionCode(conditionCode);
		return this;
	}
	public ObjectLifeScript comments(String comments) {
		ensureWorkerType("不能加注释", ExploreNode.class, ExploreBranch.class);
		if (curWorker instanceof ExploreElement) {
			((ExploreElement) curWorker).addComments(comments);
		}
		return this;
	}
	public ObjectLifeScript jump_to(String jobName) {
		ensureWorkerType("不能描述跳转", ExploreNode.class);
		curNode.addJumpTask(jobName);
		return this;
	}
	public ObjectLifeScript continue_with(String taskName) {
		ensureWorkerType("不能描述任务", ExploreNode.class);
		curNode.addTask(false, taskName);
		return this;
	}
	public ObjectLifeScript for_each(String tagName) {
		ensureWorkerType("不能指定循环", ExploreNode.class);
		curNode.setLoopTagName(tagName);
		return this;
	}
	public ObjectLifeScript when_has_no() {
		return when("has_no");
	}
	public ObjectLifeScript done_for_each(String string) {
		// TODO Auto-generated method stub
		return this;
	}
	public ObjectLifeScript finally_result(String string) {
		ensureWorkerType("不能指定阶段标志", ExploreNode.class);
		int rst = curNode.onFinishTag(string);
		if (rst ==  ExploreElement.SUB_DONE && !parentNodes.isEmpty()) {
			curNode = this.parentNodes.pop();
			curWorker = curNode;
			rst = curNode.onFinishTag(string);
		}
		return this;
	}
	public ObjectLifeScript stop() {
		return stop_with("nothing_to_do");
	}
	public ObjectLifeScript set_portal(String nodeName) {
		ensureNode(nodeName);
		return this;
	}
	
	public ObjectLifeScript do_all_of(String tagName) {
		ensureWorkerType("不能指定选择方式", ExploreNode.class);
		curNode.setChooseFlag("all_of");
		curNode.setChooseTagName(tagName);
		curNode.needChildren = true;
		return this;
	}
	public ObjectLifeScript one_is(String string) {
		ensureWorkerType("不能指定选择方式", ExploreNode.class);
		curNode.curSubGroupName = string;
		return this;
	}
	public ObjectLifeScript do_one_of(String tagName) {
		ensureWorkerType("不能指定选择方式", ExploreNode.class);
		curNode.setChooseFlag("one_of");
		curNode.setChooseTagName(tagName);
		curNode.needChildren = true;
		return this;
	}
	public ObjectLifeScript decided_by(String chooserName) {
		ensureWorkerType("不能指定选择函数", ExploreNode.class);
		curNode.setChooseTaskName(chooserName);
		return this;
	}
	
	

	 ////////////////////////////////////////////////////////////////////////////////
	public Configuration getConfiguration() {
		return this.curConfig;
	}
	
	
	
}
