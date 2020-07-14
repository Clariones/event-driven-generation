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
                .request_with_changerequest("test cr").with_string("catalog id")
                    .comments("打开CR测试form页面").no_login()
                    .got_page("customer dashboard")
                .request_with_changerequest("demo all field")
                    .comments("打开demo form页面").no_login()
                    .got_page("customer dashboard")
                ;
    }




}
