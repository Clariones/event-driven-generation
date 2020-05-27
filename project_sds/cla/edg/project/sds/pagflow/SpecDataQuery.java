package cla.edg.project.sds.pagflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.sds.gen.graphquery.MODEL;

public class SpecDataQuery extends PieceOfScript {
    @Override
    public PageFlowScript makeSequel(PageFlowScript script) {
        script.find(MODEL.pageFlowSpec()).which("by id").with_string("scene id")
            .comments("加载页面流的某个场景的数据")
            .do_it_as()
                .where(MODEL.pageFlowSpec().id().eq("${scene id}"))
                .wants(MODEL.pageFlowSpec().project(),
                        MODEL.project().pageFlowSpecList().startWayElementList(),
                        MODEL.project().pageFlowSpecList().requestElementList(),
                        MODEL.project().pageFlowSpecList().pageElementList()
                        )
        ;
        return script;
    }
}
