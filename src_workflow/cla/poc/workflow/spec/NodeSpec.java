package cla.poc.workflow.spec;

import java.awt.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class NodeSpec extends BaseSpec {
    protected Map<String, EventSpec> allEventSpecMap;
    protected Map<String, RoleSpec> allRoleSpecMap;
    protected Map<String, String> enterChecking = new HashMap<>();

    public Map<String, String> getEnterChecking() {
        return enterChecking;
    }

    public void setEnterChecking(Map<String, String> enterChecking) {
        this.enterChecking = enterChecking;
    }

    public Map<String, EventSpec> getAllEventSpecMap() {
        if (allEventSpecMap == null){
            allEventSpecMap = new HashMap<>();
        }
        return allEventSpecMap;
    }

    public void setAllEventSpecMap(Map<String, EventSpec> allEventSpecMap) {
        this.allEventSpecMap = allEventSpecMap;
    }

    public Map<String, RoleSpec> getAllRoleSpecMap() {
        if (allRoleSpecMap == null){
            allRoleSpecMap = new HashMap<>();
        }
        return allRoleSpecMap;
    }

    public void setAllRoleSpecMap(Map<String, RoleSpec> allRoleSpecMap) {
        this.allRoleSpecMap = allRoleSpecMap;
    }

    public EventSpec createEvent(String eventName) {
        if (allEventSpecMap == null){
            allEventSpecMap = new LinkedHashMap<>();
        }
        EventSpec spec = allEventSpecMap.get(eventName);
        if (spec == null){
            spec = new EventSpec();
            spec.setName(eventName);
            allEventSpecMap.put(eventName, spec);
        }
        return spec;
    }

    public RoleSpec defineRole(String roleName) {
        if (allRoleSpecMap == null){
            allRoleSpecMap = new LinkedHashMap<>();
        }
        RoleSpec spec = allRoleSpecMap.get(roleName);
        if (spec == null){
            spec = new RoleSpec();
            spec.setName(roleName);
            allRoleSpecMap.put(roleName, spec);
        }
        return spec;
    }
}
