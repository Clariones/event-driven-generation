package cla.poc.workflow.spec;

import java.util.*;

public class EventSpec extends BaseSpec{
    protected Map<String, ProcessResultSpec> allResultMap;
    protected Set<String> allowedRoles;
    protected boolean blocking;
    public Set<String> getAllowedRoles() {
        return allowedRoles;
    }

    public void setAllowedRoles(Set<String> allowedRoles) {
        this.allowedRoles = allowedRoles;
    }

    public boolean isBlocking() {
        return blocking;
    }

    public void setBlocking(boolean blocking) {
        this.blocking = blocking;
    }

    public Map<String, ProcessResultSpec> getAllResultMap() {
        if (allResultMap == null){
            allResultMap = new HashMap<>();
        }
        return allResultMap;
    }

    public void setAllResultMap(Map<String, ProcessResultSpec> allResultMap) {
        this.allResultMap = allResultMap;
    }

    public ProcessResultSpec defineResultCode(String resultCode) {
        if (allResultMap == null){
            allResultMap = new LinkedHashMap<>();
        }
        ProcessResultSpec spec = allResultMap.get(resultCode);
        if (spec == null){
            spec = new ProcessResultSpec();
            spec.setName(resultCode);
            allResultMap.put(resultCode, spec);
        }
        return spec;
    }
}
