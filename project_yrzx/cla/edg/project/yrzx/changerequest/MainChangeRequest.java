package cla.edg.project.yrzx.changerequest;

import java.util.Map;

import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

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
			.import_from(new ExampleChangeRequest())
			.import_from(new ProjectCommandChangeRequest())
			.import_from(new ProjectReportChangeRequest())
			.import_from(new ApplyEmplacementAndRecommendationChangeRequest())
			
			.getChangeRequestSpec();
	}
}
