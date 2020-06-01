package cla.edg.project.yrzx.changerequest;

import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;

import java.util.Map;

public class MainChangeRequest implements ChangeRequestSpecFactory {

	@Override
	public Map<String, Map<String, Object>> getSpec() {
		return getScript();
	}

	private Map<String, Map<String, Object>> getScript() {
		return ChangeRequestSpecBuilder.for_project("frontendpoc")
				.request_base("wxappService/handleCR/")
				
			.import_from(new AcceptanceChangeRequest())
			.import_from(new AfterSalesAndDisputeChangeRequest())
//			.import_from(new ExampleChangeRequest())
			.import_from(new ProjectCommandChangeRequest())
			.import_from(new ProjectReportChangeRequest())
			.import_from(new ApplyEmplacementAndRecommendationChangeRequest())
			.import_from(new ProjectMaterialChangeRequest())
			.import_from(new ClaMiscChangeRequest())
			.import_from(new ProjectProgressChangeRequest())
			.import_from(new ProjectLaborChangeRequest())
			.import_from(new EmployeeChangeRequest())
				.import_from(new AdvanceCompensationChangeRequest())
			.getChangeRequestSpec();
	}
}
