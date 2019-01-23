package cla.edg;

import java.net.URLEncoder;

import cla.edg.eventscript.BaseEventDescriptionScript;
import cla.edg.eventscript.EventScript;
import cla.edg.generator.EventScriptGenerator;
import cla.edg.generator.PageFlowGenerator;
import cla.edg.pageflow.BasePageFlowScript;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.project.moyi.Auction;
import cla.edg.project.moyi.NativeAppServiceV2;
import cla.edg.project.moyi.ShopDeposit;
import cla.edg.project.moyi.ShopLocating;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		test_auction();
		testEventService(new ShopLocating());
		testEventService(new ShopDeposit());
		test_appServiceV2();
	}
	private static void test_appServiceV2() throws Exception {
		NativeAppServiceV2 test = new NativeAppServiceV2();
		PageFlowScript script = test.getScript();
		String jsonStr = Utils.toJson(script, true);

		System.out.println(jsonStr);
		
		PageFlowGenerator generator = new PageFlowGenerator();
		
//		generator.setBaseOutputFolder("./output");
		generator.setBaseOutputFolder("/works/jobs/moyi_v2/workspace/moyi-biz-suite/bizcore/WEB-INF/moyi_v2_src");
		generator.setBaseTempalteFolder("./template");
		generator.setBasePackageName("com.terapico.moyi");
		generator.setProjectName("moyi");
		generator.setParentClassName("NativeAppService");
		generator.setParentClassPackage("com.terapico.moyi.appservice");
		
		generator.generateWithScript(script);
	}
	private static void testEventService(BaseEventDescriptionScript testScript) throws Exception {
		BaseEventDescriptionScript  test = testScript;
		EventScript script = test.getScript();
		String jsonStr = Utils.toJson(script, true);
		
		System.out.println(jsonStr);
		
		EventScriptGenerator generator = new EventScriptGenerator();
		generator.setBaseOutputFolder("/works/jobs/moyi_v2/workspace/moyi-biz-suite/bizcore/WEB-INF/moyi_v2_src");
		generator.setBaseTempalteFolder("./template");
		generator.setBasePackageName("com.terapico.moyi");
		generator.setProjectName("moyi");
		
		generator.generateWithScript(script);
	}
}
