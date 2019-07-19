package cla.edg.project.yourong.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S0_Query extends PieceOfScript{
	

	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
			/** 项目相关查询 */
			.query("project").which("user by phase").pagination().with_string("filter").with_string("owner type").with_integer("top n")
				.comments("根据当前用户的任职情况,按项目状态,查询项目")
				.rule_comments("topN不为空的时候, 覆盖limit参数")
				.rule_comments("owner type是业主时, 只看 我是业主 的项目")
				.rule_comments("owner type是品牌方时, 只看 业主是我介绍的 的项目")
				.rule_comments("owner type是门店/中心时, 只看 项目是我建立 的项目")
				.rule_comments("owner type是服务商时, 要根据角色来判断")
				.rule_comments("--是 经理/财务, 我所在的公司是服务商的项目都可以看")
				.rule_comments("--是 工人, 指派给我的Task所在的项目才可以看")
			/** 首页展示相关查询 */
			.query("homepage_slide").which("different client").no_pagination().with_string("filter").with_integer("top n")
				.comments("用filter查询对应的首页幻灯片")
				.rule_comments("filter是homepage_show_type中定义的值")
				.rule_comments("top n 默认值是20")
			.query("homepage_marketing_block").which("different client").no_pagination().with_string("filter").with_integer("top n")
				.comments("用filter查询对应的首页营销板块列表")
				.rule_comments("filter是homepage_show_type中定义的值")
				.rule_comments("top n 默认值是20")
			.query("homepage_article_group").which("different client").no_pagination().with_string("filter").with_integer("top n")
				.comments("用filter查询对应的首页配置的文章组列表")
				.rule_comments("filter是homepage_show_type中定义的值")
				.rule_comments("top n 默认值是20")
			/** 任务处理大厅相关查询 */
			.query("property_owner_mission").which("property owner").no_pagination()
				.comments("查询 业主 对应的任务处理大厅的入口列表")
			/** 项目文档查询 */
			.query("project_document").which("project within document tag").pagination().with_string("project id").with_string("document tag id")
				.comments("根据'项目'和'项目文档标签'来查询相关的项目文档")
				.rule_comments("先按项目文档标签的ID升序排序, 再按文档的最后更新时间降序")
				.rule_comments("可看的人群包括项目所在公司的所有雇员,以及项目组织中指定的人")
				.rule_comments("指定接收人的,无论什么角色都可以看")
				.rule_comments("此外除了服务商工人角色外, 都可以看")
			/** 项目组织查询 */
			.query("project_job_assignment").which("project").no_pagination().with_string("project id")
				.comments("加载项目的组织结构")
			/** 项目订单查询 */
			.query("yourong_bill").which("some type in project").no_pagination().with_string("project id").with_string("fee type")
				.comments("查询项目中的某类账单")
			.query("main_order").which("some type in project").no_pagination().with_string("project id").with_string("fee type")
				.comments("查询项目中的某类账单的'主订单'")
			
			/** 项目日报列表查询 */
			.query("project_daily_report").which("project").pagination().with_string("project id").with_string("owner type")
				.comments("查询项目的项目日报列表")
				.rule_comments("除 工人 外, 其他人都可以看到所有的项目日报")
				.rule_comments("工人 只能看到自己写的项目日报")
				
			/** 项目合同 */
			.query("project_running_contract").which("project").pagination().with_string("project id")
				.comments("查询项目的合同列表")
				
				
				
			/** 文章相关查询 */
			.query("article").which("article category").pagination().with_string("category id")
				.comments("查询某类文章的列表")
				;
	}

	

}
