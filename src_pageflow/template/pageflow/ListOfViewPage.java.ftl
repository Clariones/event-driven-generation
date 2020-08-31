<#import "tools.ftl" as T/>
package ${package};

import ${base_package}.${custom_context_name};

public abstract class BaseListOfViewPage extends CustomBaseViewPage{

    protected void makeTab(String code, String title, boolean isEnterPage, String activeTabCode, String nextPageUrl, Runnable tabContentMaker) {
       ${custom_context_name} ctx = (${custom_context_name}) userContext;
        boolean active = code.equals(activeTabCode);
        if (isEnterPage) {
            addTab(code, title, nextPageUrl, active);
        }
        if (active) {
            tabContentMaker.run();
        }
    }
}
