package cla.edg.project.yrzx.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.pageflow.Request;
import cla.edg.project.yrzx.gen.graphquery.MODEL;

public class MiscPageFlowPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script
//				request("test")
//			.got_page("simple toast").title("提示")

		.request("view notification center").with_string("merchant id").comments("查看所有消息")
				.got_page("notification center")

		.request("view notification detail").with_string("item id").comments("消息详情").got_page("notification detail")

		.request("view articles by page").no_login().with_string("page id")
				.comments("按页面查看文章分组,用于首页的设计师和服务商")
				.got_page("articles")


		.request("popup page").with_string("title").with_string("message").with_string("next url")
			.got_page("popup")

		.request("view terms").with_string("title").with_string("message").with_string("next url")
			.got_page("terms")

		.request("remove project nomination").with_string("project nomination id").with_string("project id").with_string("merchant id").with_string("type id")
			.got_page("project organization employee list")



		.request("confirm create contract order").with_string("item id")

			.comments("创建合同收付款订单")
			.got_page("contract pay item detail")


		.request("test").got_page("test")



		.request("view project notifications of platform").no_login().with_last_record_id().got_page("project notifications of platform")



		.request("view notifications of platform").no_login().with_last_record_id().got_page("notifications of platform")


		.request("work record").with_string("project id")
				.got_page("work record")

		.request("record work").with_string("project id").with_string("item type")
				.got_page("work record")

		.request("overtime record").with_string("project id").got_page("overtime record")
		.request("record overtime").with_string("project id").with_string("item type")
				.got_page("overtime record")



		.request("manage")
		.got_page("manage")



		;



		return script;
	}

}
