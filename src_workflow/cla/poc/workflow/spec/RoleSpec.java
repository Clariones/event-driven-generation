package cla.poc.workflow.spec;

import java.util.HashSet;
import java.util.Set;

public class RoleSpec extends BaseSpec{
    protected Set<String> actions;

    public Set<String> getActions() {
        return actions;
    }

    public void setActions(Set<String> actions) {
        this.actions = actions;
    }
}
