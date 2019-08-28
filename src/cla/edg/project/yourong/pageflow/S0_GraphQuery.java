package cla.edg.project.yourong.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yourong.graphquery.YourongGraphQueryDescripter;

public class S0_GraphQuery extends PieceOfScript{
	

	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		YourongGraphQueryDescripter descriptor = new YourongGraphQueryDescripter();
		descriptor.setPageFlowScript(script);
		return script
			.graph_query_with(descriptor)
			.start_from().employee_nomination_record_with("")
			.continue_to_next()
			;
	}

	

}
