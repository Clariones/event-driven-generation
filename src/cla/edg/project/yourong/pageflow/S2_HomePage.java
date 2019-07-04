package cla.edg.project.yourong.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S2_HomePage extends PieceOfScript{
	

	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
			.request("home page")
				.comments("打开首页.").has_footprint().no_login().can_refresh()
				.when("property owner wxapp").comments("是业主从微信小程序打开首页")
					.got_page("property owner wxapp home").title("优荣业主")
						.comments("业主看到的微信小程序首页")
						.may_request("view marketing block as property owner").comments("以业主身份查看某个营销板块")
						.may_request("open partner apply").comments("打开'品牌合作'页面,填写'品牌合作登记表'")
						.may_request("open project apply").comments("打开项目申请页面, 填写项目申请表")
						.may_request("view project list as owner").comments("打开我的项目列表. 如果只有一个, 那么直接打开项目详情")
						.may_request("view article category").comments("按照文章分类, 查看该分类下的所有文章")
						.may_request("view article detail").comments("查看文章内容")
						// footer 咱们先不写
				.when_others().comments("其他情况暂时不处理")
					.got_page("implements later nomination").title("即将登场")
						.comments("声明某项功能后续规划实现")
			.request("view marketing block as property owner").with_string("marketing block id")
				.comments("以业主身份查看某个营销板块").has_footprint().no_login().can_refresh()
				.got_page("marketing block home").title("市场营销")
					.comments("营销板块的入口页")
			.request("open partner apply")
				.comments("打开'品牌合作'页面,填写'品牌合作登记表'")
				.got_page("partner application").title("品牌合作等级表")
					.comments("品牌合作等级表")
						
		// TODO
			.request("open project apply").comments("打开项目申请页面, 填写项目申请表").todo()
			.request("view article category").comments("按照文章分类, 查看该分类下的所有文章").todo()
			.request("view article detail").comments("查看文章内容").todo()
				;
	}

	

}
