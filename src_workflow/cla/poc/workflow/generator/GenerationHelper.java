package cla.poc.workflow.generator;

import cla.poc.workflow.spec.EventSpec;
import cla.poc.workflow.spec.NodeSpec;
import cla.poc.workflow.spec.ProcessingSpec;
import clariones.tool.builder.BaseGeneratorHelper;
import clariones.tool.builder.Utils;

import java.util.*;
import java.util.stream.Collectors;

public class GenerationHelper extends BaseGeneratorHelper {

    public Map<String, String> allConstants(ProcessingSpec proSpec) {
        Map<String, String> result = new TreeMap<>();
        // 首先是所有的 satus
        Map<String, String> map = proSpec.getAllNodeSpecMap().values().stream()
                .collect(Collectors.toMap(n -> "status " + n.getName(), n ->
                        "\""+nameAsThis(n.getName())+"\"; // " + (n.getZhName() == null ? n.getName() : n.getZhName())));
        map.remove("status start");

        result.putAll(map);
        // 所有的event
        Set<String> eventNames = proSpec.getAllNodeSpecMap().values().stream().flatMap(n->n.getAllEventSpecMap().values().stream())
                .map(e->e.getName()).collect(Collectors.toSet());
        Set<String> resultCodes = proSpec.getAllNodeSpecMap().values().stream().flatMap(n->n.getAllEventSpecMap().values().stream())
                .flatMap(e->e.getAllResultMap().keySet().stream()).collect(Collectors.toSet());
        Map<String, Set<String>> map2 = new HashMap<>();
        Map<String, Set<String>> map3 = new HashMap<>();
        eventNames.forEach(name->map2.put(name, new HashSet<String>()));
        resultCodes.forEach(name->map3.put(name, new HashSet<String>()));
        for (NodeSpec nodeSpec : proSpec.getAllNodeSpecMap().values()) {
            for (EventSpec eventSpec : nodeSpec.getAllEventSpecMap().values()) {
                map2.get(eventSpec.getName()).add(eventSpec.getZhName()==null?eventSpec.getName():eventSpec.getZhName());
                eventSpec.getAllResultMap().values().forEach(r->{
                    map3.get(r.getName()).add(r.getZhName());
                });
            }
        }
        map2.remove("enter");
        map2.forEach((k,v)->result.put("event "+k, "\""+nameAsThis(k)+"\"; // " + String.join(",", v)));

        // 所有的 result_code
        map3.remove("ok");
        map3.remove("skip");
        map3.remove("fail");
        map3.forEach((k,v)->result.put("result code "+k, "\""+nameAsThis(k)+"\"; // " +String.join(",",v)));


        // 所有的role
        Set<String> roleNames = proSpec.getAllNodeSpecMap().values().stream().flatMap(n->n.getAllRoleSpecMap().values().stream())
                .map(r->r.getName()).collect(Collectors.toSet());
        roleNames.remove("system");
        roleNames.forEach(n->result.put("role "+n, "\""+nameAsThis(n)+"\"; // " + n));

        // 所有的action
        Set<String> actionNames = proSpec.getAllNodeSpecMap().values().stream().flatMap(n->n.getAllRoleSpecMap().values().stream())
                .filter(r->r.getActions() != null)
                .flatMap(r->r.getActions().stream()).collect(Collectors.toSet());
        actionNames.forEach(n->result.put("action "+n, "\""+nameAsThis(n)+"\"; // " +n));

        return result;
    }

    public boolean keyTypeChanged(String oldKey, String newKey){
        if (Utils.isBlank(oldKey)){
            return false;
        }

        oldKey = oldKey.split("[ _\\-]")[0];
        newKey = newKey.split("[ _\\-]")[0];
        boolean changed = !newKey.equals(oldKey);
//        System.out.println("[ DEBUG ]: " + oldKey +" VS " + newKey+"   " + (changed?"changed":"no change"));
        return changed;
    }
}
