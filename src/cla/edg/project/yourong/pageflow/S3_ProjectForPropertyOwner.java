package cla.edg.project.yourong.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S3_ProjectForPropertyOwner extends PieceOfScript{
	

	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
			.request("view project list as owner").with_string("filter")
				.comments("从小程序打开我的项目列表. 如果只有一个, 那么直接打开项目详情. 此时只能是 业主 或者 品牌方 的角色").need_login().has_footprint()
				.when("only one").comments("当前用户只有一个项目可以看")
					.got_page("project detail for owner").title("项目详情")
						.comments("项目详情页")
						.may_request("view project books as owner").comments("以业主身份查看项目中的5书")
						.may_request("view project organization").comments("查看项目组织的信息")
						.may_request("view project contracts as owner").comments("查看项目的合同")
						.may_request("view project base info as owner").comments("查看项目的基本信息")
						.may_request("view project document list as owner").comments("查看以附件形式存在的, 只有读操作的文档")
						.may_request("view need confirmed project documents as owner").comments("查看以附件形式存在的, 有确认流程的文档")
						.may_request("view project daily report as owner").comments("查看项目日报")
						.may_request("open project notification as owner").comments("打开项目通知, 可读, 可新建")
						.may_request("open project maintain apply as owner").comments("打开售后服务页面")
				.when_others().comments("有多个项目可看")
					.got_page("wxapp project list").title("我的项目").list_of("project")
						.comments("小程序端的项目列表")
			.request("view next page project list as owner").with_string("filter").with_string("last record id")
				.comments("从小程序打开我的项目列表 翻页")
				.got_page("wxapp project list")
			.request("view project detail as owner").with_string("project id")
				.comments("查看项目详情").need_login().has_footprint().can_refresh()
				.got_page("project detail for owner").title("项目详情")
				
				
			.request("view project document list as owner").with_string("tag id")
				.comments("查看以附件形式存在的, 只有读操作的文档").need_login().has_footprint().can_refresh()
				.got_page("attached project documents under tag in wxapp").list_of("project_attachment").title("项目资料")
					.comments("某个tag下的所有项目附件文档的列表")
				
			.request("open property owner mission").with_string("mission id").with_string("project id")
				.comments("打开某项业主任务的页面").need_login().has_footprint().can_refresh()
				.when("view project info")
					.got_page("project base info").title("项目信息")
				.when("view daily report")
					.got_page("daily report for property owner").title("项目日报").list_of("daily_report_for_owner")
				.when("view progress")
					.got_page("project progress").title("项目进度").list_of("project_progress")
				.when("view notify")
					.got_page("project notification").title("项目通知").list_of("project_notify")
				.when("for acceptance")
					.got_page("acceptance for property owner").title("工程验收")
				.when("for maintain")
					.got_page("maintainance for property owner").title("售后服务")
				.when_others()
					.got_page("project attachment for property owner").title("项目文档")
			.request("view next page project document for property owner").with_string("project id").with_string("mission id").with_string("last record id")
				.comments("以业主身份查看项目文档列表的下一页").need_login().no_footprint()
				.got_page("project attachment for property owner").comments("普通的项目文档列表页")
			.request("view project document detail as owner").with_string("document id")
				.comments("查看项目的资料").need_login().has_footprint().can_refresh()
				.got_page("project document for property owner").title("文档详情")
					.comments("以业主身份查看项目文档详情")
			.request("open document confirmation form for property owner").with_string("document id")
				.comments("打开'确认文档'表单, 让业主可以确认文档").need_login().no_footprint()
				.got_page("document confirmation form for property owner").title("文档确认")
					.comments("确认/同意文档内容的表单")
			/** 5书 */
			.request("view project books as owner").with_string("project id")
				.comments("以业主身份查看项目中的5书").need_login().has_footprint()
				.got_page("yourong book list for project").list_of("project_book").title("优容5书")
					.comments("项目中的五书")
					.may_request("open yourong project book confirmation form")
			.request("open yourong project book confirmation form").with_string("document id")
				.comments("打开表单, 准备以业主身份确认项目中的5书").need_login().no_footprint()
				.got_page("yourong book confirmation form").title("5书确认")
					.comments("确认优荣5书的表单")
					.may_request("submit yourong project book confirmation form")
			.request("submit yourong project book confirmation form").with_form("document_confirmation")
				.comments("提交表单,以业主身份确认/拒绝项目中的5书").need_login().no_footprint()
				.got_page("yourong book list for project")
				
			.request("view project organization").with_string("project id")
				.comments("查看项目组织的信息").need_login().has_footprint()
				.got_page("project organization").title("项目组织")
		 // TODO
				.request("view project contracts as owner").comments("查看项目的合同").todo()
				.request("view project base info as owner").comments("查看项目的基本信息").todo()
				.request("view need confirmed project documents as owner").comments("查看以附件形式存在的, 有确认流程的文档").todo()
				.request("view project daily report as owner").comments("查看项目日报").todo()
				.request("open project notification as owner").comments("打开项目通知, 可读, 可新建").todo()
				.request("open project maintain apply as owner").comments("打开售后服务页面").todo()
				;
	}

	

}
