package ${package};

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.terapico.uccaf.explorer.BaseExplorer;
import com.terapico.uccaf.explorer.ExplorationResults;
import com.terapico.uccaf.explorer.PathFinder;
import com.terapico.uccaf.explorer.TodoTask;
import ${base_package}.${custom_context_name};

public abstract class ${class_name} extends BaseExplorer<${custom_context_name}>{
	protected static final int CODE_XXXX = 100; //
<#list helper.allConditionCodes as code>
	protected static final int CODE_${NAMING.toJavaConstStyle(code)} = ${code?index+100};
</#list>
	@Override
	public String getStartFromName() {
		return "${script.nodeList[0].name}";
	}
	@Override
	public String getExploreName() {
		return "${NAMING.toCamelCase(script.configuration.objectTypeName)}";
	}
	protected void addTaskNameIntoResultSet(${custom_context_name} ctx, String taskName) {
		addTaskNameIntoExploreResultTaskSet(ctx, "${NAMING.toCamelCase(script.configuration.objectTypeName)}ExploreResultTaskSet", taskName);
	}
	@Override
	protected void buildTeam(Map<String, PathFinder<${custom_context_name}>> team) {
<#list script.nodeList as node>
		${''}<@compress single_line=true>
		team.put("${node.name}", 
			newAdventurer${NAMING.toCamelCase(node.name)}().next(
	<#if node?is_last>
			null
	<#else>
			"${script.nodeList[node?index +1].name}"
	</#if>
			));
	</@compress>
	
</#list>
	}
	
<#list script.allNodes as nodeName, node>
	// ////////////////////////////////////// ${node.name} ////////////////////////////////////// //
	protected PathFinder<${custom_context_name}> newAdventurer${NAMING.toCamelCase(node.name)}() {
		return new PathFinder<${custom_context_name}>() {
	<#if !node.needChildren>
			public void doSelfJob(${custom_context_name} ctx, ExplorationResults result, Object targetObject) throws Exception{
				adventurer${NAMING.toCamelCase(node.name)}DoHisJob(ctx, result, targetObject);
			}
	</#if>
	<#if node.loopFlag>
			@Override
			protected List<Object> prepareLoopingTargetList(${custom_context_name} ctx, Object targetObject) throws Exception {
				return prepareLoopingTargetListForAdventurer${NAMING.toCamelCase(node.name)}(ctx, targetObject);
			}
			@Override
			public boolean isLoopingAdventurer() {
				return true;
			};
	</#if>
	// TODO
		};
	}
	
	protected void adventurer${NAMING.toCamelCase(node.name)}DoHisJob(${custom_context_name} ctx, ExplorationResults result, Object targetObject) throws Exception{
		int processResult = executeExplore${NAMING.toCamelCase(node.name)}(ctx, targetObject);
	<#if node.branches?has_content>
		switch (processResult) {
		<#list node.branches as branch>
		case CODE_${NAMING.toJavaConstStyle(branch.conditionCode)}:
			<#if branch.taskName != "nothing_to_do">
			result.addTask(makeTask${NAMING.toCamelCase(branch.taskName)}(ctx, targetObject));
			</#if>
			result.setStop(<#if branch.stopFlag>true<#else>false</#if>);
			return;
		</#list>
		case CODE_CONTINUE:
		default:
			result.setStop(false);
			return;
		}
	<#else>
		result.setStop(false);
	</#if>
	}
	protected abstract int executeExplore${NAMING.toCamelCase(node.name)}(${custom_context_name} ctx, Object targetObject) throws Exception;
	<#if node.loopFlag>
	protected abstract List<Object> prepareLoopingTargetListForAdventurer${NAMING.toCamelCase(node.name)}(${custom_context_name} ctx, Object targetObject) throws Exception;
	</#if>
	
	
</#list>

<#list helper.allTaskNames as taskName>
	protected TodoTask makeTask${NAMING.toCamelCase(taskName)}(${custom_context_name} ctx, Object targetObject) {
		return new TodoTask() {
			public String getName() {return "${taskName}";}
			public Object getTargetObject() {return targetObject;}
			@Override
			public void execute(${custom_context_name} ctx) {
				executeTask${NAMING.toCamelCase(taskName)}(ctx, this, getTargetObject());
			}
		};
	}
	protected void executeTask${NAMING.toCamelCase(taskName)}(${custom_context_name} ctx, TodoTask task, Object targetObject) {
		addTaskNameIntoResultSet(ctx, task.getName());
	}
</#list>

}