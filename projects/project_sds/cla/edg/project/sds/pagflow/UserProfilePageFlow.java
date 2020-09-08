package cla.edg.project.sds.pagflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class UserProfilePageFlow extends PieceOfScript {

    @Override
    public PageFlowScript makeSequel(PageFlowScript script) {
        loginAndLogout(script);
        profile(script);
        return script;
    }

    private void profile(PageFlowScript script) {
        script.request("view dashboard").need_login()
                .got_page("user dashboard").title("我的").comments("用户的首页")

        ;
    }

    private void loginAndLogout(PageFlowScript script) {
        script.request("login").with_string("login").with_string("password")
                .comments("登录页面").no_login()
                .got_page("user dashboard").title("登录").comments("PC端登录页面")

            .request("logout").comments("退出登录").no_login()
                .got_page("pc client login")

        ;
    }
}
