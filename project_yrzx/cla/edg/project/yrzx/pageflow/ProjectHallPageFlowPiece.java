package cla.edg.project.yrzx.pageflow;

import com.terapico.generator.Utils;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class ProjectHallPageFlowPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script.request("view project hall").with_string("project id")
			.comments("查看项目大厅").need_login()
			.got_page("project hall").title("项目大厅")
			;
		// 纯文本类的page flow
		viewPureDocumentPages(script, "项目指令", "PROJECT_INSTRUMENT");
		viewPureDocumentPages(script, "项目通知", "PROJECT_NOTIFICATION");
		viewPureDocumentPages(script, "质量管理", "QUALITY_MANAGEMENT");
		viewPureDocumentPages(script, "业务往来", "BUSINESS_DEALINGS");
		viewPureDocumentPages(script, "技术交底", "TECHNICAL_DISCLOSURE");
		viewPureDocumentPages(script, "施工方案", "CONSTRUCTION_PLAN");
		viewPureDocumentPages(script, "造价咨询", "COST_CONSULTING");
		viewPureDocumentPages(script, "项目招标", "PROJECT_TENDERING");
		viewPureDocumentPages(script, "安全文明", "SAFE_AND_CIVILISE");
		viewPureDocumentPages(script, "设计变更", "DESIGN_CHANGES");
		viewPureDocumentPages(script, "设计管理", "DESIGN_MANAGMENT");
		viewPureDocumentPages(script, "材料管理", "MATERIALS_MANAGEMENT");
		// 纯文档的2级页面
//		viewList(script, "document list by category", "按照文档的类目查看当前项目的文档列表",
//				new String[] { "string:project id", "string:document category id" },
//				true, "user");
        viewList(script, "document list by daily task", "按照文档查所属的日常工作类型，看当前项目的文档列表",
                new String[] { "string:project id", "string:label", "string:filter" },
                true, "card");
        script.request("view project material detail").with_string("item id")
                .comments("查看项目资料详情").need_login().has_footprint()
                .got_page("project material detail").comments("项目资料的详情")
                ;
		// 需要case by case写的
		viewProjectInfo(script, "项目信息", "PROJECT_INFO");
		viewProjectElementIn3Levels(script, "项目报告", "PROJECT_REPORT");
		viewProjectProgress(script, "项目进度", "PROJECT_PROGRESS");
		viewProjectElementIn3Levels(script, "项目验收", "PROJECT_ACCEPTANCE");
		viewProjectLaborSupervision(script, "劳务监督", "LABOR_SUPERVISION");
		viewProjectElementIn3Levels(script, "售后服务", "AFTER_SALES_SERVICE");
		viewProjectElementIn3Levels(script, "先行赔付", "COMPENSATION_IN_ADVANCE");
		viewProjectElementIn3Levels(script, "违约处罚", "PENALTIES");
		viewProjectOrgnization(script, "项目组织", "PROJECT_ORGNIZATION");
		viewProject5Book(script, "五书详情", "YOURONG_5BOOK");
		viewProjectElementIn3Levels(script, "合同任务", "PROJECT_CONTRACT");
		viewProjectElementIn3Levels(script, "项目资料", "PROJECT_DOCS");

		script.request("view project material review list").with_string("item id").with_last_record_id()
				.comments("查看项目资料的所有审批记录列表").need_login().no_footprint()
				.got_page("review record list").title("审核记录").list_of("card")
			.request("view project material comments list").with_string("item id").with_last_record_id()
				.comments("查看项目资料的所有批注列表").need_login().no_footprint()
				.got_page("comments record list").title("批注列表").list_of("card")

			.request("view contract review list").with_string("item id").with_last_record_id()
				.comments("查看合同的所有审批记录列表").need_login().no_footprint()
				.got_page("contract review record list").title("审核记录").list_of("card")
			.request("view contract comments list").with_string("item id").with_last_record_id()
				.comments("查看合同的所有批注列表").need_login().no_footprint()
				.got_page("contract comments record list").title("批注列表").list_of("card")

			.request("view contract pay item list").with_string("contract id").with_string("filter").with_last_record_id()
				.comments("查看合同的普通支付项").need_login().has_footprint()
				.got_page("contract pay item list").title("支付项列表").list_of("card")
					.may_request("view contract pay item detail")
			.request("view contract pay item detail").with_string("item id")
				.comments("合同支付项详情").need_login().has_footprint()
				.got_page("contact pay item detail").title("合同支付项")
			.request("view commission pay item list").with_string("contract id").with_string("filter").with_last_record_id()
				.comments("查看合同的抽成支付项").need_login().has_footprint()
				.got_page("commission pay item list").title("支付项列表").list_of("card")
				.may_request("view commission pay item detail")
			.request("view commission pay item detail").with_string("item id")
				.comments("合同抽成支付项详情").need_login().has_footprint()
				.got_page("commission pay item detail").title("合同提成")
			;
		return script;
	}

	protected void viewProject5Book(PageFlowScript script, String title, String code) {
		script.request("view " + Utils.toWords(code)).with_string("project id")
		.comments("查看 " + title).need_login()
		.got_page("project book").title(title).list_of(code);
	}

	protected void viewProjectOrgnization(PageFlowScript script, String title, String code) {
		script.request("view " + Utils.toWords(code)).with_string("project id")
		.comments("查看 " + title).need_login()
		.got_page("project organization").title(title).list_of(code);
	}
	
	protected void viewProjectLaborSupervision(PageFlowScript script, String title, String code) {
		script.request("view "+Utils.toWords(code)+" pannel").with_string("project id")
			.comments("查看项目劳务监督面板").need_login().has_footprint()
			.got_page(Utils.toWords(code) +" pannel").title(title)
				.comments("项目劳务监督面板")
			
		.request("view labor supervision list").with_string("project id").with_last_record_id()
			.comments("查看劳务监督管理").need_login().has_footprint()
			.got_page("labor supervision").title("劳务监督管理")
				.comments("平台台账. 与平台账户相关的所有往来台账明细")
				
		.request("view labor wages list").with_string("project id").with_last_record_id()
			.comments("查看工资发放记录列表").need_login().has_footprint()
			.got_page("labor wages list").title("劳务工资发放").list_of("labor-wages")
				.comments("工资发放列表. 可查看. 无详情")
				
		;
	}

	protected void viewProjectInfo(PageFlowScript script, String title, String code) {
		script.request("view " + Utils.toWords(code)).with_string("project id")
			.comments("查看 " + title).need_login()
			.got_page("project info").title(title).list_of(code);
		
	}
	protected void viewProjectProgress(PageFlowScript script, String title, String code) {
		String reqPannel = "view " + Utils.toWords(code) +" pannel";
		String pagePannel = Utils.toWords(code) +" pannel";
		String reqList = "view " + Utils.toWords(code) +" list";
		String pageList = Utils.toWords(code) +" list";
		// 一级页面: 大阶段列表
		script.request(reqPannel).with_string("project id")
			.comments("查看 " + title +" 概况").need_login().has_footprint()
			.got_page(pagePannel).title(title+"概况").list_of(code+" pannel")
				.may_request(reqList)
		// 二级页面: 某个子类的,带tab的列表页面
		.request(reqList).with_string("project id").with_string("label").with_last_record_id()
			.comments("查看" + title +" 各阶段进度").need_login().has_footprint()
			.got_page(pageList).title(title).list_of(code)
		;
		
	}
	protected void viewProjectElementIn3Levels(PageFlowScript script, String title, String code) {
		String reqPannel = "view " + Utils.toWords(code) +" pannel";
		String pagePannel = Utils.toWords(code) +" pannel";
		String reqList = "view " + Utils.toWords(code) +" list";
		String pageList = Utils.toWords(code) +" list";
		String reqDetail = "view " + Utils.toWords(code) +" detail";
		String pageDetail = Utils.toWords(code) +" detail";
		// 一级页面: 面板
		script.request(reqPannel).with_string("project id")
			.comments("查看 " + title +" 面板").need_login().has_footprint()
			.got_page(pagePannel).title(title+"分类列表面板").list_of(code+" pannel")
				.may_request(reqList)
		// 二级页面: 某个子类的,带tab的列表页面
		.request(reqList).with_string("project id").with_string("label").with_string("filter").with_last_record_id()
			.comments("查看" + title +" 子类目的分状态列表").need_login().has_footprint()
			.got_page(pageList).title(title+"列表").list_of(code)
				.may_request(reqDetail)
		// 三级页面: 某个元素的详情页		
		.request(reqDetail).with_string("project id").with_string("label").with_string("item id")
			.comments("查看" + title +" 内容详情").need_login().has_footprint()
			.got_page(pageDetail).title(title+"内容详情").as_class(code)
		;
		
	}

	// 构造访问纯文档页面的一系列页面
	// 纯文档第一层叫"分类列表":
	protected void viewPureDocumentPages(PageFlowScript script, String title, String documentCode) {
		String reqViewCategoryList = "view " + Utils.toWords(documentCode) +" documents";
		script.request(reqViewCategoryList).with_string("project id")
			.comments("查看 " + title +" 的分类列表").need_login()
			.got_page("project document category list").title("分类列表").list_of("document category")
				.may_request("view document list by daily task")
				
		;
	}
}
