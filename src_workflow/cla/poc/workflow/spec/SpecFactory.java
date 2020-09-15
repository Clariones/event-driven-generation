package cla.poc.workflow.spec;

import clariones.tool.builder.Utils;

import java.util.*;

public class SpecFactory extends BaseSpecFactory{
    protected Map<String, ProcessingSpec> allProcessing = new HashMap<>();


    public Map<String, ProcessingSpec> getAllProcessing() {
        return allProcessing;
    }

    public void setAllProcessing(Map<String, ProcessingSpec> allProcessing) {
        this.allProcessing = allProcessing;
    }

    public void ensureProcessing(String processingName) {
        if (allProcessing == null){
            allProcessing = new HashMap<>();
        }
        ProcessingSpec proc = allProcessing.get(processingName);
        if (proc == null) {
            proc = new ProcessingSpec();
            proc.setName(processingName);
            allProcessing.put(processingName, proc);
        }
        workingOn(proc);
    }


    public void setI18N(String localeName, String text) {
        if (workingOnProcessingLevel()){
            curProcessing.setZhName(text);
            return;
        }
        if (workingOnNodeLevel()){
            curNode.setZhName(text);
        }
        if (workingOnEventLevel()){
            curEvent.setZhName(text);
        }
        if (workingOnResultLevel()){
            curResult.setZhName(text);
        }
        if (curCondition != null){
            curCondition.setZhName(text);
        }
    }

    public void setComments(String comments) {
        if (workingOnProcessingLevel()){
            curProcessing.setComments(comments);
            return;
        }
        if (workingOnNodeLevel()){
            curNode.setComments(comments);
        }
        if (workingOnEventLevel()){
            curEvent.setComments(comments);
        }
        if (workingOnResultLevel()){
            curResult.setComments(comments);
        }
        if (curCondition != null){
            curCondition.setComments(comments);
        }
    }

    public void defineStatus(String statusCode) {
        NodeSpec spec = curProcessing.createStatusNode(statusCode);
        workingOn(spec);
    }


    public void defineEvent(String eventName) {
        if (curNode == null){
            error("定义 事件 必须在 in_status() 之后");
        }
        EventSpec event = curNode.createEvent(eventName);
        workingOn(event);
    }

    public void defineProcessResultCode(String resultCode) {
        if (curNode == null){
            error("split_to(), go_to() 和 copy_to() 必须在 in_status() 之后");
        }
        if (curEvent == null){
            this.defineEvent("enter");
            this.setI18N("zh_CN","进入");
        }
        ProcessResultSpec spec = curEvent.defineResultCode(resultCode);
        workingOn(spec);
    }


    public void defineRole(String roleName) {
        if (curNode == null){
            error("as_role() 必须在 in_status() 之后");
        }
        RoleSpec spec = curNode.defineRole(roleName);
        workingOn(spec);
    }

    public void defineActions(String[] actionArray) {
        if (curRole == null){
            error("can_do() 必须在 as_role() 之后");
        }
        curRole.setActions(new HashSet<>(Arrays.asList(actionArray)));
    }

    public void setAllowedRole(String[] roleNameArray) {
        if (curEvent == null){
            error("by_role() 必须在 in_status() 之后");
        }
        curEvent.setAllowedRoles(new HashSet<>(Arrays.asList(roleNameArray)));
        curEvent.setBlocking(false);
    }
    public void setBlockedRole(String[] roleNameArray) {
        if (curEvent == null){
            error("not_by_role() 必须在 on_event() 之后");
        }
        curEvent.setAllowedRoles(new HashSet<>(Arrays.asList(roleNameArray)));
        curEvent.setBlocking(true);
    }


    public void setEnterCondition() {
        if (curNode == null){
            error("as_role() 必须在 in_status() 之后");
        }
        workingOnEnterCondition();
    }

    public void enterMustHave(String statusCode) {
        if (curNode == null){
            error("must_have() 必须在 in_status() 之后");
        }
        curNode.getEnterChecking().put(statusCode, "must_all");
    }
    public void enterIfHave(String statusCode) {
        if (curNode == null){
            error("if_have() 必须在 in_status() 之后");
        }
        curNode.getEnterChecking().put(statusCode, "option_all");
    }

    public void enterNeedCheckAll(String statusCode) {
        if (curNode == null){
            error("all_success() 必须在 in_status() 之后");
        }
        String type = curNode.getEnterChecking().get(statusCode);
        if (type.startsWith("must_")){
            curNode.getEnterChecking().put(statusCode, "must_all");
            return;
        }

        if (type.startsWith("option_")){
            curNode.getEnterChecking().put(statusCode, "option_all");
            return;
        }
        throw new RuntimeException("只支持 must_all 或者 option_all");
    }
    public void enterNeedCheckAny(String statusCode) {
        if (curNode == null){
            error("any_success() 必须在 in_status() 之后");
        }
        String type = curNode.getEnterChecking().get(statusCode);
        if (type.startsWith("must_")){
            curNode.getEnterChecking().put(statusCode, "must_any");
            return;
        }

        if (type.startsWith("option_")){
            curNode.getEnterChecking().put(statusCode, "option_any");
            return;
        }
        throw new RuntimeException("只支持 must_any 或者 option_any");
    }

    public void resultCondition(String condition) {
        if (curNode == null){
            error("reach_condition() 必须在 in_status() 之后");
        }
        if (curEvent == null){
            error("reach_condition() 必须在 on_event() 之后");
        }
        if (curResult == null) {
            error("reach_condition() 必须在 when() 之后");
        }
        curResult.setResultCondition(condition);
        defineCondition(condition);
        workingOnTargetCondition();
        curCondition = null;
    }

    public void setTargetStatus(String type, String[] tgtStatusArray) {
        if (curNode == null){
            error("split_to(), go_to() 和 copy_to() 必须在 in_status() 之后");
        }
        if (curEvent == null){
            this.defineEvent("enter");
            this.setI18N("zh_CN","进入");
        }
        if (curResult == null) {
            this.defineProcessResultCode("ok");
            this.setI18N("zh_CN","成功");
        }

        if (curCondition == null) {
            curResult.setResultCondition(curResult.getName());
            defineCondition(curResult.getName());
            workingOnTargetStatusByResult();
        }else{
            workingOnTargetStatus();
        }
        curCondition.setTransferType(type);
        curCondition.setTargetStatusCode(new ArrayList<>(Arrays.asList(tgtStatusArray)));

        curCondition = null;
    }

    private void defineCondition(String condition) {
        curCondition = curNode.defineCondition(condition);
    }

    protected void workingOnTargetCondition() {
        // nothing do now
    }

    public void forCondition(String condition) {
        curCondition = curNode.getAllConditionMap().get(condition);
        if(curCondition == null){
            Utils.error("条件"+condition+"未定义");
        }
    }
}
