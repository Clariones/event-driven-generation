package cla.edg.pageflow;

import java.util.HashMap;

public class PageflowUtil {
    public static Page findPageByName(PageFlowScript script, String name) {
        if (script.getPages() == null){
            script.setPages(new HashMap<>());
            return null;
        }
        return script.getPages().get(name);
    }
}
