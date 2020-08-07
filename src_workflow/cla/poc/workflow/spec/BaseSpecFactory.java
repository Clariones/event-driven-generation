package cla.poc.workflow.spec;

public class BaseSpecFactory {
    protected ProcessingSpec curProcessing;
    protected NodeSpec curNode;
    protected EventSpec curEvent;
    protected ProcessResultSpec curResult;
    protected RoleSpec curRole;
    protected boolean bSettingTargetStatus = false;
    protected boolean bSettingEnterCondition = false;

    // WORKING ON
    ///////////////
    protected void workingOn(ProcessingSpec proc) {
        curProcessing = proc;
        resetBelowProcess();
    }
    protected void workingOn(NodeSpec spec) {
        curNode = spec;
        resetBelowNode();
    }
    protected void workingOn(EventSpec spec) {
        curEvent = spec;
        resetBelowEvent();
    }
    protected void workingOn(ProcessResultSpec spec) {
        curResult = spec;
        resetBelowResult();
    }

    protected void workingOn(RoleSpec spec) {
        curRole = spec;
        resetBelowRole();
    }
    protected void workingOnTargetStatus() {
        bSettingTargetStatus = true;
    }
    protected void workingOnEnterCondition() {
        bSettingEnterCondition = true;
        resetBelowEnterCondtion();
    }
    // WORKING ON
    ///////////////
    protected boolean workingOnProcessingLevel() {
        return curProcessing != null && !isInsideProcessing();
    }
    protected boolean workingOnNodeLevel() {
        return curNode != null && !isInsideNode();
    }
    protected boolean workingOnEventLevel() {
        return curEvent != null && !isInsideEvent();
    }
    protected boolean workingOnResultLevel() {
        return curResult != null && !isInsideResult();
    }
    protected boolean workingOnRoleLevel() {
        return curRole != null && bSettingTargetStatus;
    }
    protected boolean workingOnConditionLevel() {
        return curRole != null && bSettingEnterCondition;
    }




    // RESET
    ///////////////
    protected void resetBelowProcess() {
        curNode = null;
        resetBelowNode();
    }
    protected void resetBelowNode() {
        curEvent = null;
        resetBelowEvent();
        curRole = null;
        resetBelowRole();
    }
    private void resetBelowEvent() {
        curResult = null;
        resetBelowResult();
    }
    private void resetBelowResult() {
        bSettingTargetStatus = false;
    }
    protected void resetBelowRole() {
        // TODO
    }
    protected void resetBelowEnterCondtion() {
        // TODO
    }

    // IS INSIDE
    ///////////////
    protected boolean isInsideProcessing() {
        return curNode != null;
    }
    protected boolean isInsideNode() {
        return curEvent != null;
    }
    protected boolean isInsideEvent() {
        return curResult != null;
    }
    protected boolean isInsideResult() {
        return bSettingTargetStatus;
    }
    protected boolean isInsideRole() {
        return true; // TODO
    }



    // others
    ///////////////
    protected void error(String message) {
        throw new RuntimeException(message);
    }
}
