package cla.edg.project.moyi;

import cla.edg.eventscript.EventScript;
import cla.edg.generator.EventScriptGenerator;
import cla.edg.generator.PageFlowGenerator;
import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.BasePageFlowScript;
import clariones.tool.builder.GenrationResult;
import clariones.tool.builder.Utils;

import java.io.File;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		test_auction();
//		testEventService(new ShopLocating());
//		testEventService(new ShopDeposit());
//		testEventService(new Auction());
//		testEventService(new InkDeed());
//		testEventService(new Affiliate());
		
		testPageFlow(new NativeAppServiceV2());
		testV3EventService(new V3InkDeedService());
		testV3EventService(new V3AuctionService());
	}

	private static void testPageFlow(BasePageFlowDescriptionScript test) throws Exception {
		BasePageFlowScript script = test.getScript();
		String jsonStr = Utils.toJson(script, true);

		// System.out.println(jsonStr);
		
		PageFlowGenerator generator = new PageFlowGenerator();
		generator.setScript(script);
		List<GenrationResult> list = generator.runJob();
		generator.saveToFiles(new File("/works/jobs/moyi_v4/workspace/moyi-biz-suite/bizcore/WEB-INF/moyi_v2_src"), list);
	}
	private static void testV3EventService(BaseMoyiEventScript testScript) throws Exception {
		EventScript script = testScript.getScript();
		String jsonStr = Utils.toJson(script, true);
		
		// System.out.println(jsonStr);
		
		EventScriptGenerator generator = new EventScriptGenerator();
		generator.setBaseOutputFolder("");
		generator.setScript(script);
		List<GenrationResult> list = generator.runJob();
		generator.saveToFiles(new File("/works/jobs/moyi_v4/workspace/moyi-biz-suite/bizcore/WEB-INF/moyi_v3_src"), list);
	}
	
	private static void testEventService(BaseMoyiEventScript testScript) throws Exception {
//		BaseMoyiEventScript  test = testScript;
//		EventScript script = test.getScript();
//		String jsonStr = Utils.toJson(script, true);
//
//		System.out.println(jsonStr);
//
//		EventScriptGenerator generator = new EventScriptGenerator();
//		generator.setBaseOutputFolder("/works/jobs/moyi_v4/workspace/moyi-biz-suite/bizcore/WEB-INF/moyi_v2_src");
//		generator.setBaseTempalteFolder("./template");
//		generator.generateWithScript(script);
	}
}
