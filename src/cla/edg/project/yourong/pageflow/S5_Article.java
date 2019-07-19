package cla.edg.project.yourong.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S5_Article extends PieceOfScript{
	

	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
			.request("view article category").with_string("category id")
				.comments("查看文章分类").has_footprint().no_login().can_refresh()
				.got_page("article list in category").title("文章分类").list_of("article_small")
					.comments("某个分类下的所有文件列表")
					.may_request("view article detail")
					.may_request("view next page article in category")
			.request("view next page article in category").with_string("category id").with_last_record_id()
				.comments("查看文章分类").has_footprint().no_login()
				.got_page("article list in category")
			.request("view article detail").with_string("article id")
				.comments("查看文章").has_footprint().no_login().can_refresh()
				.got_page("article detail")
				.comments("文章内容")
				
			.request("view golden designer")
				.comments("查看'精选设计师'文章分类").has_footprint().no_login().can_refresh()
				.got_page("article group").title("精选设计师")
					.comments("暂时按: 某个分类下的所有文件列表 处理")
			.request("view golden service")
				.comments("查看'优选服务商'文章分类").has_footprint().no_login().can_refresh()
				.got_page("article group").title("优选服务商")
					.comments("暂时按: 某个分类下的所有文件列表 处理")
					
					
						
		
				;
	}

	

}
