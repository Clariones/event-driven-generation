package cla.edg.project.optical.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.optical.gen.graphquery.MODEL;

public class HomepageQuery extends PieceOfScript {
    @Override
    public PageFlowScript makeSequel(PageFlowScript script) {
        script.query(MODEL.demoProduct()).which("in homepage").with_string("id")
                .comments("查询首页上的 demo product")
                .do_it_as()
                    .where(MODEL.demoProduct().platform().eq("${'P000001'}"))
                    .top("10")
                    .wants(MODEL.demoProduct().category().catalog(),
                            MODEL.demoProduct().demoSkuList()
                        )
            ;
        return script;
    }
}
