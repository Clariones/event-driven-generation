package ${base_package}.${helper.nameAsThis(spec.name)?lower_case};

import ${base_package}.BaseProcessor;
import com.terapico.workflow.*;
import java.util.*;

public abstract class Base${helper.NameAsThis(spec.name)}Processor extends BaseProcessor {
    public Actor getSystemActor() {
        Actor actor = new Actor();
        actor.setRole("ADMIN");
        actor.setId("[from_"+userContext.tokenId()+"]");
        return actor;
    }

    @Override
    public String getType() {
        return "${helper.NameAsThis(spec.name)}";
    }

    @Override
    protected void onEnterStatus(ProcessInstance process, Node fromNode, String onCondition, Node newNode, Actor actor, Event event) throws Exception {
        switch (newNode.getStatusName()){
<#list spec.allNodeSpecMap?keys as statusCode>
        case ${helper.NameAsThis(spec.name)}ProcessSpec.STATUS_${helper.NAME_AS_THIS(statusCode)}:
            onEnter${helper.NameAsThis(statusCode)}Status(process, fromNode, onCondition, newNode, actor, event);
            return;
</#list>
        default:
            throw new Exception("未定义的状态"+event.getEventName());
        }
    }

<#list spec.allNodeSpecMap?keys as statusCode>
    <#assign nodeSpec=spec.allNodeSpecMap[statusCode]/>
    <#if nodeSpec.detailComments?has_content>
    /**
     * ${nodeSpec.comments!nodeSpec.name}
     *
        <#list nodeSpec.detailComments as cmts>
     * ${cmts}
        </#list>
     */
    <#else>
    /** ${nodeSpec.comments!nodeSpec.name} */
    </#if>
    protected abstract void onEnter${helper.NameAsThis(statusCode)}Status(ProcessInstance process, Node fromNode, String onCondition, Node newNode, Actor actor, Event event) throws Exception;
</#list>

    @Override
    protected void onLeaveStatus(ProcessInstance process, Node fromNode, String onCondition, Node newNode, Actor actor, Event event) throws Exception {
        // generale speaking, nothing to do when leave some status
        switch (newNode.getStatusName()){
<#list spec.allNodeSpecMap?keys as statusCode>
        case ${helper.NameAsThis(spec.name)}ProcessSpec.STATUS_${helper.NAME_AS_THIS(statusCode)}:
            onLeave${helper.NameAsThis(statusCode)}Status(process, fromNode, onCondition, newNode, actor, event);
            return;
</#list>
        default:
            throw new Exception("未定义的状态"+event.getEventName());
        }
    }
<#list spec.allNodeSpecMap?keys as statusCode>
    <#assign nodeSpec=spec.allNodeSpecMap[statusCode]/>
    protected void  onLeave${helper.NameAsThis(statusCode)}Status(ProcessInstance process, Node fromNode, String onCondition, Node newNode, Actor actor, Event event) throws Exception {};
</#list>

    @Override
    protected void onConditionMet(ProcessInstance process, Node node, String condition, Actor actor, Event event) throws Exception{
        // generale speaking, nothing special need to do when condition met
        switch (condition){
<#list spec.allConditionMap?keys as condCode>
        case ${helper.NameAsThis(spec.name)}ProcessSpec.CONDITION_${helper.NAME_AS_THIS(condCode)}:
            onCondition${helper.NameAsThis(condCode)}Met(process, node, actor, event);
            return;
</#list>
        default:
            throw new Exception("未定义的条件"+event.getEventName());
        }
    }
<#list spec.allConditionMap?keys as condCode>
    protected void onCondition${helper.NameAsThis(condCode)}Met (ProcessInstance process, Node node, Actor actor, Event event) throws Exception {}
</#list>

    @Override
    protected void eventProcessFailed(ProcessInstance process, Node node, Actor actor, Event event, String resultCode, Exception e) {
        debug("Event [%s] handling failed: %s",
                event.getEventName(),
                e==null?resultCode:e.getMessage());
        if (e != null){
            e.printStackTrace();
        }
    }

    @Override
    protected String handleEvent(ProcessInstance process, Node node, Actor actor, Event event) throws Exception {
        switch (event.getEventName()) {
<#list spec.allEventSpecMap?keys as eventName>
        case ${helper.NameAsThis(spec.name)}ProcessSpec.EVENT_${helper.NAME_AS_THIS(eventName)}:
            return handleEvent${helper.NameAsThis(eventName)}(process, node, actor, event);
</#list>
        }
        return RESULT_CODE_OK;
    }

<#list spec.allEventSpecMap?keys as eventName>
    protected String handleEvent${helper.NameAsThis(eventName)}(ProcessInstance process, Node node, Actor actor, Event event) throws Exception { return RESULT_CODE_OK;}
</#list>

    @Override
    protected boolean checkEventCanBeProcessed(ProcessInstance process, Node node, Actor actor, Event event) throws Exception {
        // if you have some special /complex rule to check some 'actor' can do some 'event', override here.
        return true;
    }

    @Override
    protected ProcessSpec getProcessingSpec() {
        return ${helper.NameAsThis(spec.name)}ProcessSpec.getSpec();
    }


}