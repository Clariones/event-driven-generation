package cla.poc.workflow.spec;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RoleSpec extends BaseSpec{
    protected List<String> actions;

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        if (this.actions == null) {
            this.actions = actions;
            return;
        }
        this.actions.addAll(actions);
    }
}
