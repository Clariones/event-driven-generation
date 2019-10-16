package cla.edg.project.yourong.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S5_Article extends PieceOfScript{
	

	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
			.request("view article category").with_string("category id")
				.comments("查看文章分类").has_footprint().no_login().can_refresh()
				.got_page("article list in category").title("文章分类").list_of("article")
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
					
			// 设计师推荐表
			.request("open designer recommendation form")
				.comments("打开设计师推荐表,填写").no_footprint().need_login()
				.got_page("designer recommendation form").title("推荐设计师")
					.comments("设计师推荐表")
					.may_request("submit designer recommendation form")
			.request("submit designer recommendation form").with_form("DesignerRecommendation")
				.comments("提交设计师推荐表").need_login()
				.got_page_same_as_request("view golden designer")
			// 服务商推荐表
			.request("open service provider recommendation form")
				.comments("打开服务商推荐表,填写").no_footprint().need_login()
				.got_page("service provider recommendation form").title("推荐服务商")
					.comments("服务商推荐表")
					.may_request("submit service provider recommendation form")
			.request("submit service provider recommendation form").with_form("ServiceProviderRecommendation")
				.comments("提交服务商推荐表").need_login()
				.got_page_same_as_request("view golden service")
			
						
		
				;
	}

	

}
