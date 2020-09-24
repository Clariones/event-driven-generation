package cla.edg.pageflow;

import cla.edg.modelbean.LogicalOperator;

public class PieceOfScript {

	protected LogicalOperator EXISTS(LogicalOperator condition) {
		return LogicalOperator.create(LogicalOperator.CollectionType.exists, condition);
	}

	protected LogicalOperator NOT_EXISTS(LogicalOperator condition) {
		return LogicalOperator.create(LogicalOperator.CollectionType.not_exists, condition);
	}
	public PageFlowScript makeSequel(PageFlowScript pageFlowScript) {
		return pageFlowScript;
	}

	/**
	 * 构造:
	 * <pre>
	 * <xmp> script.request(request).with_xxx(args1).with_xxx(args2).with_last_record_id()
	 * 		.comments(comments)
	 * 		.got_page(list-page)
	 * 			.comments(comments+的页面).list-of(display mode)
	 * </xmp>
	 * </pre>
	 */
	protected void viewList(PageFlowScript script, String request, String comments, String[] args, boolean needLogin, String displayMode) {
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
		script.got_page(request).comments(comments+"的页面").list_of(displayMode)
		;
	}

}
