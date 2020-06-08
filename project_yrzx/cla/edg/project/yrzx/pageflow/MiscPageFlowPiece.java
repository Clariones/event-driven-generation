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


		.request("popup page").with_string("title").with_string("message").with_string("next url")
			.got_page("popup")

		.request("view terms").with_string("title").with_string("message").with_string("next url")
			.got_page("terms")

		.request("remove project nomination").with_string("project nomination id").with_string("project id").with_string("merchant id").with_string("type id")
			.got_page("project organization employee list")


				/**
				 * 菜单页，
				 * #1 给的ID作为树的根，加载出子树
				 * #2 渲染子树listOf
				 *
				 */
				.request("view menu").with_string("tree node id")
				.got_page("menu")
			;
		return script;
	}

}
