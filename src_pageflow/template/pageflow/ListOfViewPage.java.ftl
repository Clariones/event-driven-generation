<#import "tools.ftl" as T/>
package ${package};

import ${base_package}.${custom_context_name};

public abstract class BaseListOfViewPage extends CustomBaseViewPage{
    @Override
    protected void afterDoRendering() {
        super.afterDoRendering();
        forceResponseAsListOfPage();
    }

    protected void makeTab(String code, String title, boolean isEnterPage, String activeTabCode, String linkToUrl, Runnable tabContentMaker) {
       ${custom_context_name} ctx = (${custom_context_name}) userContext;
        boolean active = code.equals(activeTabCode);
        if (isEnterPage) {
            addTab(code, title, linkToUrl, active);
        }
        if (active) {
            tabContentMaker.run();
        }
    }
}
