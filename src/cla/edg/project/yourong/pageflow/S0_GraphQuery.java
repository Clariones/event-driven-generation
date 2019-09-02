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
			.query_graph("projects in app for current user").pagination().with_string("employee id").with_string("filter")
//				.want().project()
				.comments("查询APP上,当前用户应该看到的项目列表")
				.want(
						Project.projectPhase(),
						Project.store(),
						Project.projectOwner().genericAccountBookList()
				)
				.start_from().employee_nomination_with("employee id")
				.path(
						EmployeeNomination.employer(
								Merchant.projectListAsProjectOwner(),
								Merchant.projectListAsStore(),
								Merchant.workPackageList().project()
								)
						.then(
								Project.projectPhase(),
								Project.store(),
								Project.projectOwner()//.genericAccountBookList()
						)
					)
//				.path(
//						EmployeeNomination.employer().projectListAsProjectOwner().projectPhase(),
//						EmployeeNomination.employer().projectListAsStore(Project.projectPhase(), Project.store()),
//						EmployeeNomination.employer().workPackageList().project().projectPhase()
//					)
//				.path(
//						EmployeeNomination.employer().merchantLicenseList(),
//						EmployeeNomination.employer().customerProjectApplicationList(),
//						WorkPackage.responsibleServiceCompany().customerProjectApplicationList(),
//						CustomerProjectApplication.applicantMerchant().employeeNominationListAsEmployer()
//					)
				.search_by(Project.getProjectPhaseId().eq("filter"))
				.order_by(Project.getCreateTime().desc(), Project.getId().desc())
			
				
				.query_graph("projects in app for current user2").pagination().with_string("id")
//				.want().merchant()
				.comments("查询APP上,当前用户应该看到的项目列表")
				.want(
						Merchant.projectListAsProjectOwner(),
						Merchant.projectListAsStore()
				)
				.start_from().merchant_with("id")
				.path(
						Merchant.projectListAsProjectOwner(),
						Merchant.projectListAsStore()
					)
				.search_by(Merchant.getId().eq("id"))
			
			.continue_to_next()
			;
		return script;
	}

	

}
