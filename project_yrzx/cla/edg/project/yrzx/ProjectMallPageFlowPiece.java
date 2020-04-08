package cla.edg.project.yrzx;

import com.terapico.generator.Utils;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class ProjectMallPageFlowPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script.request("view project mall").with_string("proejct id")
			.comments("查看项目大厅").need_login()
			.got_page("project mall").title("项目大厅")
			;
		
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
		viewPureDocumentPages(script, "材料管理", "MATERIALS_MANAGEMENT");
		
		viewList(script, "document list by category", "按照文档的类目查看当前项目的文档列表",
				new String[] { "string:project id", "string:document category id" },
				true, "project-document");
		return script;
	}

	/**
	 * 构造:
	 * <pre>
	 * <xmp> script.request(request).with_xxx(args).with_last_record_id()
	 * 		.comments(comments)
	 * 		.got_page(list-page)
	 * 			.comments(comments+的页面).list-of(display mode)
	 * </xmp>
	 * </pre>
	 */
	private void viewList(PageFlowScript script, String request, String comments, String[] args, boolean needLogin, String displayMode) {
		script.request("view " + request);
		for(String argExp : args) {
			String type = "string";
			String name = argExp;
			int pos = argExp.indexOf(':');
			if (pos > 0) {
				type = argExp.substring(0, pos).trim();
				name = argExp.substring(pos+1).trim();
			}
			switch (type) {
			case "string":
				script.with_string(name);
				break;
			default:
				throw new RuntimeException("来加代码处理:" + type);
			}
		}
		script.with_last_record_id();
		script.comments(comments).has_footprint();
		if (needLogin) {
			script.need_login();
		}else {
			script.no_login();
		}
		script.got_page(request).comments(comments+"的页面").list_of(displayMode);
	}

	// 构造访问纯文档页面的一系列页面
	// 纯文档第一层叫"分类列表":
	protected void viewPureDocumentPages(PageFlowScript script, String title, String documentCode) {
		String reqViewCategoryList = "view " + Utils.toWords(documentCode) +" documents";
		script.request(reqViewCategoryList).with_string("project id")
			.comments("查看 " + title +" 的分类列表").need_login()
			.got_page("project document category list").title("分类列表").list_of("document category")
				.may_request("view document list by category")
				
		;
	}
}
