package cla.edg.project.sds.pagflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class WorkshopPageFlow extends PieceOfScript {

    @Override
    public PageFlowScript makeSequel(PageFlowScript script) {
        enters(script);
        return script;
    }

    private void enters(PageFlowScript script) {
        script.request("view page flow").with_string("page flow spec id")
                .comments("打开某个场景的page flow视图").need_login()
                .got_page("page flow workshop").title("页面流:xxx")

            .request("view work flow").with_string("work flow spec id")
                .comments("打开某个场景的work flow视图").need_login()
                .got_page("work flow workshop").title("工作流:xxx")

            .request("view change request").with_string("change request spec id")
                .comments("打开某个change request视图").need_login()
                .got_page("change request workshop").title("表单:xxx")

            .request("view page content").with_string("page content spec id")
                .comments("打开某个页面的内容视图").need_login()
                .got_page("page content workshop").title("页面:xxx")

            .request("load spec data").with_string("scene").with_string("scene id")
                .comments("加载某个场景下的数据").need_login()
                .got_ajax_page()
        ;
    }


}
