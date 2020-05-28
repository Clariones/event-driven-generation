package cla.edg.project.yrzx.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;

public class MiscPageFlowPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script.request("test")
			.got_page("simple toast").title("提示")

		.request("view notification center").with_string("merchant id").comments("查看所有消息")
				.got_page("notification center")

		.request("view articles by page").no_login().with_string("page id")
				.comments("按页面查看文章分组,用于首页的设计师和服务商")
				.got_page("articles")


		.request("view employee nomination detail").need_login().with_string("employee nomination id")
			.comments("查看员工详情")
			.got_page("employee nomination detail")

		.request("popup page").with_string("message").with_string("next url")
			.got_page("popup")


			;
		return script;
	}

}
