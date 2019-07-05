package cla.edg.generator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import cla.edg.objlifescript.ExploreBranch;
import cla.edg.objlifescript.ExploreNode;
import cla.edg.objlifescript.ObjectLifeScript;

public class ExploreScriptGeneratorHelper {
	protected ObjectLifeScript script;
	
	public ObjectLifeScript getScript() {
		return script;
	}

	public void setScript(ObjectLifeScript script) {
		this.script = script;
	}

	public List<String> getAllConditionCodes() {
		Set<String> result = new HashSet<>();
		script.getAllNodes().forEach((key, node)->{
			if (node.branches == null) {
				return;
			}
			for(ExploreBranch b : node.branches) {
				result.add(b.getConditionCode());
			}
		});
		
		return new ArrayList<>(result);
	}
	
	public List<String> getAllTaskNames() {
		Set<String> result = new HashSet<>();
		script.getAllNodes().forEach((key, node)->{
			if (node.branches == null) {
				return;
			}
			for(ExploreBranch b : node.branches) {
				if (b.getTaskName().equals("nothing to do")) {
					continue;
				}
				result.add(b.getTaskName());
			}
		});
		
		return new ArrayList<>(result);
	}
}
