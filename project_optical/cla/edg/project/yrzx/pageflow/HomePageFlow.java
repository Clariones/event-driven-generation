package cla.edg.project.yrzx.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class HomePageFlow extends PieceOfScript {
    @Override
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script.request_homepage()
                .got_home_page()
                ;
    }
}
