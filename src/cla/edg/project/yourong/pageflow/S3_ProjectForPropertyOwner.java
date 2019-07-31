package cla.edg.project.yourong.pageflow;

import cla.edg.Utils;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S3_ProjectForPropertyOwner extends PieceOfScript{
	

	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		PageFlowScript rst = script
			.request("view project list as owner").with_string("filter")
				.comments("从小程序打开我的项目列表. 如果只有一个, 那么直接打开项目详情. 此时只能是 业主 或者 品牌方 的角色").need_login().has_footprint()
				.when("only one").comments("当前用户只有一个项目可以看")
					.got_page("project detail for owner").title("项目详情")
						.comments("项目详情页")
						.may_request("view project books as owner").comments("以业主身份查看项目中的5书")
						.may_request("view project organization").comments("查看项目组织的信息")
						.may_request("view project contracts as owner").comments("查看项目的合同")
						.may_request("view project document list as owner").comments("查看以附件形式存在的, 只有读操作的文档")
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
				.got_page("attached project documents under tag in wxapp").list_of("project-attachment").title("项目资料")
					.comments("某个tag下的所有项目附件文档的列表")
			// 项目任务大厅 中的17个功能统一入口
			.request("open property owner mission").with_string("mission id").with_string("project id")
				.comments("打开某项业主任务的页面").need_login().has_footprint().can_refresh()
				.when("view project info")
					.got_page("project base info").title("项目信息")
				.when("view daily report")
					.got_page("daily report list for property owner").title("项目日报").list_of("daily-report-for-owner")
						.comments("项目日报列表页面")
						.may_request("view next page project daily report list as property owner")
				.when("view progress")
					.got_page("project progress").title("项目进度").list_of("project-progress")
				.when("view notify")
					.got_page("project notification list").title("项目通知").list_of("project-notification")
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
				.got_page("simple popup")
//				.got_page("document confirmation form for property owner").title("文档确认")
//					.comments("确认/同意文档内容的表单")
			.request("view next page project daily report list as property owner").with_string("project id").with_string("last record id")
				.comments("项目日报列表页面 翻页").need_login().no_footprint()
				.got_page("daily report list for property owner")
			/** 5书 */
			.request("view project books as owner").with_string("project id")
				.comments("以业主身份查看项目中的5书").need_login().has_footprint()
				.got_page("yourong book list for project").list_of("project-book").title("优容5书")
					.comments("项目中的五书")
					.may_request("open to yourong project book confirmation")
			.request("open to yourong project book confirmation").with_string("document id")
				.comments("准备以业主身份确认项目中的5书").need_login().no_footprint()
				.got_page("yourong book confirmation form").title("5书确认")
					.comments("确认优荣5书的表单")
					.may_request("confirm yourong project book")
					.may_request("reject yourong project book")
			.request("confirm yourong project book").with_string("document id").with_string("verify code")
				.comments("以业主身份确认项目中的5书").need_login().no_footprint()
				.got_page("yourong book list for project")
			.request("reject yourong project book").with_string("document id").with_string("verify code")
				.comments("以业主身份拒绝项目中的5书").need_login().no_footprint()
				.got_page("yourong book list for project")
			// 项目组织
			.request("view project organization").with_string("project id")
				.comments("查看项目组织的信息").need_login().has_footprint()
				.got_page("project organization").title("项目组织")
			// 项目日报
			.request("view project daily report as owner").with_string("report id")
				.comments("查看项目日报").need_login().has_footprint().can_refresh()
				.got_page("project daily report detail").title("日报详情")
			// 合同任务
			.request("view project contracts as owner").with_string("project id")
				.comments("查看项目合同").need_login().has_footprint().can_refresh()
				.got_page("project running contract list").title("合同任务")
					.may_request("view next page project contracts as owner")
					.may_request("feedback project contracts as owner")
			.request("view next page project contracts as owner").with_string("project id").with_last_record_id()
				.comments("查看项目合同: 翻页").need_login().no_footprint()
				.got_page("project running contract list")
			.request("feedback project contracts as owner").with_string("contract id")
				.comments("打开反馈项目合同的popup").need_login().no_footprint()
				.got_page("simple popup")
			.request("confirm project contracts as owner").with_string("contract id").with_string("verify code")
				.comments("确认项目合同").need_login().no_footprint()
				.got_page("project running contract list")
			.request("reject project contracts as owner").with_string("contract id").with_string("verify code")
				.comments("不同意项目合同").need_login().no_footprint()
				.got_page("project running contract list")
			// 项目进度
			.request("view project progress list in phase").with_string("project id").with_string("phase id")
				.comments("查看项目某个阶段中的详细的进度记录").need_login().no_footprint().can_refresh()
				.got_page("project progress list in phase")
					.comments("某个项目阶段中的项目进度列表")
					.may_request("view next page project progress list in phase")
			.request("view next page project progress list in phase").with_string("project id").with_string("phase id").with_string("last record id")
				.comments("查看项目某个阶段中的详细的进度记录").need_login().no_footprint()
				.got_page("project progress list in phase")
			.request("view next page maintainance task list").with_string("project id").with_last_record_id()
				.comments("查看维护任务 翻页").need_login().no_footprint()
				.got_page("maintainance for property owner").list_of("maintain-task").title("售后服务")
					.comments("为业主展示维护任务列表")
					.may_request("view maintainance application list")
			// 售后服务
			.request("view maintainance application list").with_string("task id").with_string("filter")
				.comments("查看维护任务下所属的维护请求").need_login().no_footprint()
				.got_page("maintainance application list").list_of("maintain-application").title("售后请求")
					.comments("为业主展示维护任务列表")
					.may_request("view next page maintainance application list")
					.may_request("view maintainance application detail")
			.request("view next page maintainance application list").with_string("task id").with_string("filter").with_last_record_id()
				.comments("查看维护任务下所属的维护请求 翻页").need_login().no_footprint()
				.got_page("maintainance application list")
			.request("view maintainance application detail").with_string("application id")
				.comments("查看售后请求的详情").need_login().no_footprint()
				.got_page("maintainance application detail").title("售后申请")
					.comments("售后请求")
			;
		
			// 项目通知
			rst = makeViewListScript(rst, "owner", "project_notification", "project_notification_type","项目通知", "通知类型");
			rst.request("view project notification detail").with_string("notification id")
				.comments("查看项目通知详情").need_login().has_footprint().can_refresh()
				.got_page("project notification detail")
					.comments("项目通知详情页面")
			.request("open project notification form as owner").with_string("project id").with_string("workpackage id").with_string("task id")
				.comments("以业主身份打开 项目通知表单, 准备写通知").need_login().no_footprint()
				.got_page("project notification form").title("写通知")
					.comments("写项目通知的表单页面")
					.may_request("submit project notification as owner")
			.request("submit project notification as owner").with_form("ProjectNotification")
				.comments("业主提交项目通知").need_login().no_footprint()
				.got_page("project notification detail")
				;
			
				
			return rst;
	}

	protected static PageFlowScript makeViewListScript(PageFlowScript script, String roleName, String tgtTypeName, String filterTypeName,
			String tgtTitle, String filterType) {
		String comments = String.format("根据%s, 查看%s列表", filterType, tgtTitle);
		String reqName = "view list of " + Utils.removeSeperator(tgtTypeName)+" as " + roleName;
		String reqNextName = "view next page list of " + Utils.removeSeperator(tgtTypeName)+" as " + roleName;
		String[] tmp1 = Utils.removeSeperator(filterTypeName).split("\\s+");
		String paramName = tmp1[tmp1.length-1] +" id";
		String pageName = Utils.removeSeperator(tgtTypeName)+" list";
		
		
		return script.request(reqName).with_string("project id").with_string("filter")
			.comments(comments).need_login().has_footprint().can_refresh()
				.got_page(pageName).comments(tgtTitle+"列表").title(tgtTitle).list_of(tgtTypeName)
			.request(reqNextName).with_string("project id").with_string("filter").with_last_record_id()
				.comments(comments+" 翻页").need_login().no_footprint()
				.got_page(pageName)
			.query(tgtTypeName).which(filterTypeName).pagination().with_string("project id").with_string(paramName);
	}

}
