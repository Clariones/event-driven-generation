package cla.poc.workflow;

import cla.poc.workflow.spec.ProcessingSpec;
import cla.poc.workflow.spec.SpecFactory;

import java.util.Map;

public class BasicBuilder<T extends BasicBuilder<T>> {
    protected SpecFactory factory = new SpecFactory();
    private String statusCode;

    public T processing(String processingName) {
        factory.ensureProcessing(processingName);
        return (T) this;
    }

    public T zh_CN(String text) {
        factory.setI18N("zh_CN", text);
        return (T) this;
    }

    public T in_status(String statusCode) {
        factory.defineStatus(statusCode);
        return (T) this;
    }

    public T on_event(String eventName) {
        factory.defineEvent(eventName);
        return (T) this;
    }

    public T when(String resultCode) {
        factory.defineProcessResultCode(resultCode);
        return (T) this;
    }

    public T go_to(String tgtStatus) {
        factory.setTargetStatus("go_to", new String[] {tgtStatus});
        return (T) this;
    }

    public T split_to(String ... tgtStatusArray) {
        factory.setTargetStatus("split_to", tgtStatusArray);
        return (T) this;
    }

    public T copy_to(String ... tgtStatusArray) {
        factory.setTargetStatus("copy_to", tgtStatusArray);
        return (T) this;
    }

    public T by_role(String ... roleNameArray) {
        factory.setAllowedRole(roleNameArray);
        return (T) this;
    }

    public T not_by_role(String ... roleNameArray) {
        factory.setBlockedRole(roleNameArray);
        return (T) this;
    }

    public T can_enter_when() {
        factory.setEnterCondition();
        return (T) this;
    }

    public T can_do(String ... actionArray) {
        factory.defineActions(actionArray);
        return (T) this;
    }

    public T as_role(String roleName) {
        factory.defineRole(roleName);
        return (T)this;
    }



    public T must_have(String statusCode) {
        factory.enterMustHave(statusCode);
        this.statusCode = statusCode;
        return (T)this;
    }
    public T if_have(String statusCode) {
        factory.enterIfHave(statusCode);
        this.statusCode = statusCode;
        return (T)this;
    }

    public T all_success() {
        factory.enterNeedCheckAll(statusCode);
        return (T)this;
    }
    public T any_success() {
        factory.enterNeedCheckAny(statusCode);
        return (T)this;
    }


    public Map<String, ProcessingSpec> build() {
        return factory.getAllProcessing();
    }

}
