package cla.edg.project.health;

import cla.edg.Utils;
import cla.edg.eventscript.EventScript;
import cla.edg.generator.EventScriptGenerator;
import cla.edg.generator.PageFlowGenerator;
import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.BasePageFlowScript;

public class Main {
	private static String OUTPUT_FOLDER = "/works/jobs/health_a/workspace/health-biz-suite/bizcore/WEB-INF/health_custom_src";
	
	public static void main(String[] args) throws Exception {
//		testPageFlow(new NativeAppServiceV2());
//		testV3EventService(new V3InkDeedService());
//		testV3EventService(new V3AuctionService());
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
	
	private static void testEventService(BaseEventScript testScript) throws Exception {
		BaseEventScript  test = testScript;
		EventScript script = test.getScript();
		String jsonStr = Utils.toJson(script, true);
		
		System.out.println(jsonStr);
		
		EventScriptGenerator generator = new EventScriptGenerator();
		generator.setBaseOutputFolder(OUTPUT_FOLDER);
		generator.setBaseTempalteFolder("./template");
		generator.generateWithScript(script);
	}
}
