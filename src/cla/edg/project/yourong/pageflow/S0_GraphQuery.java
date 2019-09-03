package cla.edg.project.yourong.pageflow;

import cla.edg.graphquery.terms.BasePathInfo;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yourong.gen.graphquery.CustomerProjectApplication;
import cla.edg.project.yourong.gen.graphquery.EmployeeNomination;
import cla.edg.project.yourong.gen.graphquery.Merchant;
import cla.edg.project.yourong.gen.graphquery.Project;
import cla.edg.project.yourong.gen.graphquery.WorkPackage;
import cla.edg.project.yourong.graphquery.YourongGraphQueryDescripter;

public class S0_GraphQuery extends PieceOfScript{
	

	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		YourongGraphQueryDescripter descriptor = new YourongGraphQueryDescripter();
		descriptor.setPageFlowScript(script);
		script
			.graph_query_with(descriptor)
			.query_graph(Project.which_are("in app for current user")).pagination().with_string_list("employee id").with_string_list("filter")
				.comments("查询APP上,当前用户应该看到的项目列表")
				.want(
						Project.projectPhase(),
						Project.store(),
						Project.projectOwner()
				)
				.start_from().employee_nomination_with("employee id")
				.path(
						EmployeeNomination.employer(
								Merchant.projectListAsProjectOwner(),
								Merchant.projectListAsStore(),
								Merchant.workPackageList().project()
								)
					)
				.search_by(Project.getProjectPhaseId().in("filter"))
				.order_by(Project.getCreateTime().desc(), Project.getId().desc())
				
			
			.continue_to_next()
			;
		return script;
	}

	

}
