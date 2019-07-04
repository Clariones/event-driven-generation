package cla.edg.project.yourong.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S5_Article extends PieceOfScript{
	

	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
			.request("view article group").with_string("category id")
				.comments("查看文章分类").has_footprint().no_login().can_refresh()
				.got_page("article category").title("文章分类")
					.comments("某个分类下的所有文件列表")
			.request("view golden designer")
				.comments("查看'精选设计师'文章分类").has_footprint().no_login().can_refresh()
				.got_page("article category").title("精选设计师")
					.comments("暂时按: 某个分类下的所有文件列表 处理")
			.request("view golden service")
				.comments("查看'优选服务商'文章分类").has_footprint().no_login().can_refresh()
				.got_page("article category").title("优选服务商")
					.comments("暂时按: 某个分类下的所有文件列表 处理")
			.request("view article").with_string("article id")
				.comments("查看文章").has_footprint().no_login().can_refresh()
				.got_page("article detail")
					.comments("文章内容")
						
		
				;
	}

	

}
