package cla.edg.project.yrzx.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import com.terapico.generator.Utils;

public class HomePageFlowPiece extends PieceOfScript {
    @Override
    public PageFlowScript makeSequel(PageFlowScript script) {
        script.request("view home page").no_login().has_footprint()
                .comments("打开首页")
                .got_page("home");

        // slide 下面的4个block
        request4MerketingBlock(script, new String[]{"REAL_ESTATE", "BIZ_CHAIN", "ASSOCIATION", "ORGNIZATION","JGDT"});
        // footer 的两个页面
        request4MerketingBlock(script, new String[]{"GOLDEN_SERVICE", "DESIGNER"});
        // article 的几个
        script.request("view article category").with_string("category id").with_last_record_id()
                .comments("按分类查看文章列表").no_login().has_footprint()
                .got_page("article category").title("文章列表").list_of("article")
            .request("view article").with_string("article id")
                .comments("查看文章").no_login().has_footprint()
                .got_page("article detail").title("文章内容")
            ;

        return script;
    }

    private void request4MerketingBlock(PageFlowScript script, String[] codes) {
        for(String code: codes) {
            String url = "view " + Utils.toWords(code)+" page";
            script.request(url).no_login().has_footprint()
                    .comments("查看code="+code+"的页面")
                    .got_page(Utils.toWords(code)+" home").title(code)
                    .comments(code+"的页面");
        }
    }
}
