package cla.poc.workflow.spec;

public class BaseSpecFactory extends BaseTreeStyleLaborDivisionFactory{
    protected static final String PATH_PROCESSING = "/process";
    protected static final String PATH_NODE = PATH_PROCESSING+"/node";
    protected static final String PATH_EVENT = PATH_NODE+"/event";
    protected static final String PATH_ENTER_CONDITION = PATH_NODE+"/enterCondition";
    protected static final String PATH_PROCESS_RESULT = PATH_EVENT+"/result";
    protected static final String PATH_ROLE = PATH_NODE+"/role";
    protected static final String PATH_CONDITION = PATH_NODE+"/condition";
    protected static final String PATH_TARGET_STATUS_BY_RESULT = PATH_PROCESS_RESULT+"/target";
    protected static final String PATH_TARGET_STATUS_BY_CONDITION = PATH_CONDITION+"/target";


    protected ProcessingSpec curProcessing;
    protected NodeSpec curNode;
    protected EventSpec curEvent;
    protected ProcessResultSpec curResult;
    protected RoleSpec curRole;
    protected ConditionSpec curCondition;
//    protected boolean bSettingTargetStatus = false;
    protected boolean bSettingEnterCondition = false;

    // WORKING ON
    ///////////////
    protected void workingOn(ProcessingSpec proc) {
        curProcessing = proc;
        workingOn(PATH_PROCESSING, proc);
    }
    protected void workingOn(NodeSpec spec) {
        curNode = spec;
        workingOn(PATH_NODE, spec);
    }
    protected void workingOn(EventSpec spec) {
        curEvent = spec;
        workingOn(PATH_EVENT, spec);
    }
    protected void workingOn(ProcessResultSpec spec) {
        curResult = spec;
        workingOn(PATH_PROCESS_RESULT, spec);
    }
    protected void workingOn(RoleSpec spec) {
        curRole = spec;
        workingOn(PATH_ROLE, spec);
    }
    protected void workingOnTargetStatus() {
        workingOn(PATH_TARGET_STATUS_BY_CONDITION, curCondition);
    }
    protected void workingOnTargetStatusByResult(){
        workingOn(PATH_TARGET_STATUS_BY_RESULT, curCondition);
    }
    protected void workingOnEnterCondition() {
        workingOn(PATH_ENTER_CONDITION, curNode);
    }
    // WORKING ON
    ///////////////
    protected boolean workingOnProcessingLevel() {
        return isWorkingOn(PATH_PROCESSING);
    }
    protected boolean workingOnNodeLevel() {
        return isWorkingOn(PATH_NODE);
    }
    protected boolean workingOnEventLevel() {
        return isWorkingOn(PATH_EVENT);
    }
    protected boolean workingOnResultLevel() {
        return isWorkingOn(PATH_PROCESS_RESULT);
    }
    protected boolean workingOnRoleLevel() {
        return isWorkingOn(PATH_ROLE);
    }
    protected boolean workingOnConditionLevel() {
        return isWorkingOn(PATH_CONDITION);
    }




    // RESET
    ///////////////

    // IS INSIDE
    ///////////////
    protected boolean isInsideProcessing() {
        return isWorkingUnder(PATH_PROCESSING);
    }
    protected boolean isInsideNode() {
        return isWorkingUnder(PATH_NODE);
    }
    protected boolean isInsideEvent() {
        return isWorkingUnder(PATH_EVENT);
    }
    protected boolean isInsideResult() {
        return isWorkingUnder(PATH_PROCESS_RESULT);
    }
    protected boolean isInsideRole() {
        return isWorkingUnder(PATH_ROLE);
    }



    // others
    ///////////////
    protected void error(String message) {
        throw new RuntimeException(message);
    }


}
