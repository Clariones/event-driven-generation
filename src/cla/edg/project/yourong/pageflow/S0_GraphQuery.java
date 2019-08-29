package cla.edg.project.yourong.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
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
		return script
			.graph_query_with(descriptor)
			.query_graph("projects in app for current user").pagination().with_string("employee id").with_string("filter")
				.comments("查询APP上,当前用户应该看到的项目列表")
				.want().project().project_phase().project_image()
				.start_from().employee_nomination_with("employee id")
				.through(	// 当前用户->任职公司->项目所在门店 或者 任职公司->工作包->项目
						EmployeeNomination.getEmployer(),
						Merchant.getProjectListAsStore(),
						Merchant.getWorkPackageList(),
						WorkPackage.getProject()
						)
				.search_by(Project.getProjectPhaseId().eq("filter"))
				.order_by(Project.getCreateTime().desc(), Project.getId().desc())
			
			.continue_to_next()
			;
	}

	

}
