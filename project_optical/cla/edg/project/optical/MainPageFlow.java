package cla.edg.project.optical;

import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.project.optical.query.HomepageQuery;
import cla.edg.project.optical.pageflow.HomePageFlow;
import cla.edg.project.optical.pageflow.UserProfilePageFlow;

public class MainPageFlow extends BasePageFlowDescriptionScript {
    private static final PageFlowScript SCRIPT = $("pc client").need_login()
            .base_on()
            .base_package_name("com.doublechaintech.optical")
            .project_name("optical")
            .parent_class_name("WxappService")
            .parent_class_package("com.doublechaintech.optical.wxappservice")
            .bean_name("wxappService")
            .addTag("change_request", "false");


    @Override
    public PageFlowScript getScript() {
        return SCRIPT.request("heart beat").comments("服务器心跳检查")
                .got_toast_page()
                .import_from(new HomePageFlow())
                .import_from(new UserProfilePageFlow())

                .import_from(new HomepageQuery())
            ;
    }
}
