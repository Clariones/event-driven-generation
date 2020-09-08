package cla.edg.project.sds.pagflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.sds.gen.graphquery.MODEL;

public class DashboardQuery extends PieceOfScript {

    @Override
    public PageFlowScript makeSequel(PageFlowScript script) {
        script.find(MODEL.user()).which("by id for dashboard").with_string("user id")
                .comments("按ID查询用户,用于dashboard")
                .do_it_as()
                .where(MODEL.user().id().eq("${user id}"))
                .wants(MODEL.user().userProjectList().project().pageFlowSpecList(),
                        MODEL.project().changeRequestSpecList(),
                        MODEL.project().workFlowSpecList(),
                        MODEL.project().pageContentSpecList())
            ;
        return script;
    }


}
