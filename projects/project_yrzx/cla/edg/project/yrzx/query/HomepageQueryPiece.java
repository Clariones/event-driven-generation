package cla.edg.project.yrzx.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;

public class HomepageQueryPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script
		.find(MODEL.page()).which("by code").with_string("page code")
			.do_it_as()
				.where(MODEL.page().code().eq("${page code}"))
				.wants(MODEL.page().sectionList().pageArticleList().article(),
						MODEL.page().slideList())
		.query(MODEL.article()).which("category").pagination().with_string("category id")
			.comments("查询分类中的文章")
			.do_it_as()
			.where(MODEL.article().category().eq("${category id}"))

			;
		script.import_from(new MiscQueryPiece());
		return script;
	}

}
