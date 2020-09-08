package cla.edg.project.sds;

import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.project.sds.pagflow.DashboardQuery;
import cla.edg.project.sds.pagflow.SpecDataQuery;
import cla.edg.project.sds.pagflow.UserProfilePageFlow;
import cla.edg.project.sds.pagflow.WorkshopPageFlow;

public class MainPageFlow extends BasePageFlowDescriptionScript {
    private static final PageFlowScript SCRIPT = $("pc client").need_login()
            .base_on()
            .base_package_name("com.cla.sds")
            .project_name("sds")
            .parent_class_name("ClientService")
            .parent_class_package("com.cla.sds.client")
            .bean_name("clientService");


    @Override
    public PageFlowScript getScript() {
        return SCRIPT.request("heart beat").comments("服务器心跳检查")
                .got_toast_page()
                .import_from(new UserProfilePageFlow())
                .import_from(new WorkshopPageFlow())

                .import_from(new DashboardQuery())
                .import_from(new SpecDataQuery())
            ;
    }
}
