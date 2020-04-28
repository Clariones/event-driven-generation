package cla.edg.project.yrzx.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;


public class MoneyRelatedQueryPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script
		// 账本相关
			.query(MODEL.accountBook()).which("merchant").with_string("merchant id")
				.comments("查询公司的账户")
				.do_it_as()
				.where(MODEL.accountBook().owner().eq("${merchant id}"))
				.wants(MODEL.accountBook().owner(), MODEL.accountBook().type())
			.query(MODEL.accountBookItem()).which("account book").pagination().with_string("account book id").with_string("status")
				.comments("查询当前账户的条目")
				.do_it_as()
				.where(MODEL.accountBookItem().accountBook().eq("${account book id}"),
						MODEL.accountBookItem().status().eq("${status}")
				)
			.query(MODEL.accountBookRecord()).which("account book").pagination().with_string("account book id")
				.comments("查询当前账户的流水记录")
				.do_it_as()
				.where(MODEL.accountBookRecord().payeeAccount().eq("${account book id}").or(MODEL.accountBookRecord().payerAccount().eq("${account book id}")))


		;

		return script;
	}

}
