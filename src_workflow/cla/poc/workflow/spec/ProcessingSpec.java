package cla.poc.workflow.spec;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProcessingSpec extends BaseSpec {
    protected Map<String, NodeSpec> allNodeSpecMap;

    public Map<String, NodeSpec> getAllNodeSpecMap() {
        if (allNodeSpecMap == null){
            allNodeSpecMap = new HashMap<>();
        }
        return allNodeSpecMap;
    }

    public void setAllNodeSpecMap(Map<String, NodeSpec> allNodeSpecMap) {
        this.allNodeSpecMap = allNodeSpecMap;
    }

    public NodeSpec createStatusNode(String statusCode) {
        if (allNodeSpecMap == null) {
            allNodeSpecMap = new LinkedHashMap<>();
        }
        NodeSpec spec = new NodeSpec();
        spec.setName(statusCode);
        allNodeSpecMap.put(statusCode, spec);
        return spec;
    }
}
