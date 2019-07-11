package ${package};

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.terapico.uccaf.explorer.BaseExplorer;
import com.terapico.uccaf.explorer.ExplorationResults;
import com.terapico.uccaf.explorer.PathFinder;
import com.terapico.uccaf.explorer.TodoTask;
import ${base_package}.${custom_context_name};
import ${base_package}.${NAMING.toCamelCase(script.configuration.projectName)}BaseExplorer;

public abstract class ${class_name} extends ${NAMING.toCamelCase(script.configuration.projectName)}BaseExplorer<${custom_context_name}>{
	protected static final int CODE_XXXX = 100; //
<#list helper.allConditionCodes as code>
	protected static final int CODE_${NAMING.toJavaConstStyle(code)} = ${code?index+100};
</#list>

	protected static Map<Integer, String> codeNames = new HashMap<>();
	static {
		codeNames.put(CODE_CONTINUE, "continue");
		codeNames.put(CODE_JUMP, "jump");
<#list helper.allConditionCodes as code>
		codeNames.put(CODE_${NAMING.toJavaConstStyle(code)},"${code}");
</#list>
	}

<#list helper.allTaskNames as taskName>
	protected static final String TASK_${NAMING.toJavaConstStyle(taskName)} = "${taskName}";
</#list>

	@Override
	protected Map<Integer, String> getCodeNames() {
		return codeNames;
	}
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
			public void doSelfJob(${custom_context_name} ctx, ExplorationResults result, Object targetObject) throws Exception{
				adventurer${NAMING.toCamelCase(node.name)}DoHisJob(ctx, result, targetObject);
			}
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
	<#if node.needChildren>
			@Override
			protected ExplorationResults decideFinalResult(${custom_context_name} ctx, Object targetObject, String sceneCode, List<ExplorationResults> allResults) throws Exception{
				return decideFinalResultForAdventurer${NAMING.toCamelCase(node.name)}(ctx, targetObject, sceneCode, allResults);
			}
	</#if>
	<#if node.chooseFlag?has_content && "one_of" == node.chooseFlag>
			@Override
			protected String chooseOneSubTeam(${custom_context_name} ctx, Object targetObject) {
				return ${NAMING.toCamelCase(node.chooseTaskName)?uncap_first}(ctx, targetObject);
			}
			@Override
			public TeamType getTypeType() {return TeamType.DO_ONE_OF;};
	</#if>
	<#if node.chooseFlag?has_content && "all_of" == node.chooseFlag>
			@Override
			public TeamType getTypeType() {return TeamType.DO_ALL_OF;};
	</#if>
	<#if node.needChildren>
			@Override
			protected void buildSubTeam(Map<String, Map<String, PathFinder<CustomYourongUserContextImpl>>> teamMap, Map<String, String> teamStartMap) {
				Map<String, PathFinder<CustomYourongUserContextImpl>> subTeamMap = null;
		<#list node.subNodeGroups as subGroupName, subNodeList>
				teamStartMap.put("${subGroupName}", "${node.subNodeStartNode[subGroupName]}");
				subTeamMap = new HashMap<>();
				teamMap.put("${subGroupName}", subTeamMap);
			<#list subNodeList as subNode>
				${''}<@compress single_line=true>
					subTeamMap.put("${subNode.name}", 
						newAdventurer${NAMING.toCamelCase(subNode.name)}().next(
				<#if subNode?is_last>
						null
				<#else>
						"${subNodeList[subNode?index +1].name}"
				</#if>
						));
				</@compress>
				
			</#list>
		</#list>
		
			}
	</#if>
		};
	}
	
	<#if node.commentSegments?has_content>
		<#list node.commentSegments as comments>
	/* ${comments} */
		</#list>
	</#if>	
	protected void adventurer${NAMING.toCamelCase(node.name)}DoHisJob(${custom_context_name} ctx, ExplorationResults result, Object targetObject) throws Exception{
		int processResult = executeExplore${NAMING.toCamelCase(node.name)}(ctx, targetObject);
		log(ctx, "${node.name}",  processResult);
	<#if node.branches?has_content>
		switch (processResult) {
		<#list node.branches as branch>
		case CODE_${NAMING.toJavaConstStyle(branch.conditionCode)}:
			<#if branch.jumpFlag>
			result.setNextAdventurerName("${branch.taskName}");
			result.setStop(false);
			result.setJump(true);
			<#else>
				<#if branch.taskName != "nothing_to_do">
			result.addTask(makeTask${NAMING.toCamelCase(branch.taskName)}(ctx, targetObject));
				</#if>
			result.setStop(<#if branch.stopFlag>true<#else>false</#if>);
			</#if>
			return;
		</#list>
		case CODE_CONTINUE:
			result.setStop(false);
			return;
		default:
			throw new Exception(String.format("处理结果 %d(%s) 未定义,请检查代码和LifeScript")); 
		}
	<#else>
		result.setStop(false);
	</#if>
	}
	/** 执行操作 ${node.name}
	<#if node.branches?has_content>
	 * 返回值: <@compress single_line=true>
	    <#list node.branches as branch>
			CODE_${NAMING.toJavaConstStyle(branch.conditionCode)},
	    </#list>
	    CODE_CONTINUE
	 </@>
	</#if>${''}
	 */
	protected abstract int executeExplore${NAMING.toCamelCase(node.name)}(${custom_context_name} ctx, Object targetObject) throws Exception;
	<#if node.loopFlag>
	// 为操作 ${node.name} 找出需要遍历的对象, 放入list中
	protected abstract List<Object> prepareLoopingTargetListForAdventurer${NAMING.toCamelCase(node.name)}(${custom_context_name} ctx, Object targetObject) throws Exception;
	</#if>
	<#if node.needChildren>
	// 为操作 ${node.name} 的子操作合并结果,得出结论
	protected abstract ExplorationResults decideFinalResultForAdventurer${NAMING.toCamelCase(node.name)}(${custom_context_name} ctx, Object targetObject, String sceneCode, List<ExplorationResults> allResults) throws Exception;
	</#if>
	<#if node.chooseFlag?has_content && "one_of" == node.chooseFlag>
	// 为操作 ${node.name} 执行 ${node.chooseTaskName}, 选择其子任务中的一个分支
	protected abstract String ${NAMING.toCamelCase(node.chooseTaskName)?uncap_first}(${custom_context_name} ctx, Object targetObject);
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
	// 执行探索的结果中的任务 ${taskName}
	protected void executeTask${NAMING.toCamelCase(taskName)}(${custom_context_name} ctx, TodoTask task, Object targetObject) {
		addTaskNameIntoResultSet(ctx, task.getName());
	}
</#list>

}