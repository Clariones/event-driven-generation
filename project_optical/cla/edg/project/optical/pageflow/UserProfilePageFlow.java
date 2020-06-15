package cla.edg.project.optical.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class UserProfilePageFlow extends PieceOfScript {

    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .request("view desktop home page")
                    .comments("打开PC首页").no_login()
                    .got_page("pc home")

                .request("view dashboard")
                    .comments("个人信息").need_login()
                    .got_page("customer dashboard")
                ;
    }




}
