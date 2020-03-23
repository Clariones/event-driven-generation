package cla.edg.project.yourong.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
/*
import cla.edg.project.yourong.gen.graphquery.EmployeeNomination;
import cla.edg.project.yourong.gen.graphquery.Merchant;
import cla.edg.project.yourong.gen.graphquery.Project;
*/
public class S0_GraphQuery extends PieceOfScript{
	
/*
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script.graph_query_with()
			.query(Project.which_are("in app for current user")).pagination().with_string_list("employee id").with_string_list("filter code")
				.comments("查询APP上,当前用户应该看到的项目列表")
				.start_from(EmployeeNomination.identified_by("employee id"))
				.path(
						EmployeeNomination.employer(
								Merchant.projectListAsProjectOwner(),
								Merchant.projectListAsStore(),
								Merchant.workPackageList().project()
								)
//						EmployeeNomination.projectJobAssignmentList().project()
					)
//				.want(
//						Project.projectPhase(),
//						Project.store(),
//						Project.projectOwner()
//						)
				.search_by(Project.getProjectPhaseId().in("filter code"))
				.order_by(Project.getCreateTime().desc(), Project.getId().desc())
			
			.query(Project.which_are("in id list")).pagination().with_string_list("id")
				.comments("试试")
				.start_from(Project.identified_by("id"))
				.want(
						Project.projectPhase(),
						Project.store(),
						Project.projectOwner(),
						Project.constructionStatus(),
						Project.designStatus(),
						Project.partner(),
						Project.projectType()
				)
			
				
			.query(Project.which_are("in app for current user in once")).pagination().with_string_list("employee id").with_string_list("filter code")
				.comments("查询APP上,当前用户应该看到的项目列表")
				.start_from(EmployeeNomination.identified_by("employee id"))
				.path(
						EmployeeNomination.employer(
								Merchant.projectListAsProjectOwner(),
								Merchant.projectListAsStore(),
								Merchant.workPackageList().project()
								)
//						EmployeeNomination.projectJobAssignmentList().project()
					)
				.want(
						Project.projectPhase(),
						Project.store(),
						Project.projectOwner(),
						Project.constructionStatus(),
						Project.designStatus(),
						Project.partner(),
						Project.projectType()
						)
				.search_by(Project.getProjectPhaseId().in("filter code"))
				.order_by(Project.getCreateTime().desc(), Project.getId().desc())
			.continue_to_next()
			;
	}

	
*/
}
