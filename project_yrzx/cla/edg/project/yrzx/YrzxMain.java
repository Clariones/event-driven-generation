package cla.edg.project.yrzx;

import cla.edg.generator.PageFlowGenerator;
import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.BasePageFlowScript;
import cla.edg.project.yrzx.changerequest.MainChangeRequest;
import cla.edg.project.yrzx.pageflow.MainPageFlow;
import com.terapico.changerequest.generator.ChangeRequestGenerator;
import com.terapico.generator.GenrationResult;
import com.terapico.generator.Utils;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class YrzxMain {
//	private static String OUTPUT_FOLDER = "/works/jobs/yrzx_v3/workspace/yrzx-biz-suite/bizcore/WEB-INF/yrzx_custom_src";
	private static String OUTPUT_FOLDER = "/Users/jarryzhou/codebase/yrzx-biz-suite/bizcore/WEB-INF/yrzx_custom_src";
	public static void main(String[] args) throws Exception {
		testChagneRequest(new MainChangeRequest().getSpec());
		testPageFlow(new MainPageFlow());
//		testV3EventService(new V3InkDeedService());
//		testV3EventService(new V3AuctionService());

		System.out.println("finished at " + LocalDateTime.now());
	}

	private static void testPageFlow(BasePageFlowDescriptionScript test) throws Exception {
		BasePageFlowScript script = test.getScript();
		String jsonStr = Utils.toJson(script, true);

		// System.out.println(jsonStr);
		
		PageFlowGenerator generator = new PageFlowGenerator();
		generator.setBaseOutputFolder(OUTPUT_FOLDER);
		generator.setBaseTempalteFolder("./template");
		generator.generateWithScript(script);
	}
	
	private static void testChagneRequest(Map<String, Map<String, Object>> script) throws Exception  {
		ChangeRequestGenerator generator = new ChangeRequestGenerator();
		generator.setChangeRequestSpec(script);
		generator.setProjectName("yrzx");
		generator.setOrgName("yrdec");
		List<GenrationResult> files = generator.runJob();
		
		String outputFolder = "/Users/jarryzhou/codebase/yrzx-biz-suite/bizcore/WEB-INF";
		String crXmlOutputFolder = "/Users/jarryzhou/codebase/web-code-generator/sky";
		generator.saveToFiles( Utils.put("ALL", new File(outputFolder))
				.put("changeRequest.xml", new File(crXmlOutputFolder)).into_map(File.class), files); // "changeRequest.xml"
	}
	
//	private static void testEventService(BaseEventScript testScript) throws Exception {
//		BaseEventScript  test = testScript;
//		EventScript script = test.getScript();
//		String jsonStr = Utils.toJson(script, true);
//		
//		System.out.println(jsonStr);
//		
//		EventScriptGenerator generator = new EventScriptGenerator();
//		generator.setBaseOutputFolder(OUTPUT_FOLDER);
//		generator.setBaseTempalteFolder("./template");
//		generator.generateWithScript(script);
//	}
}
