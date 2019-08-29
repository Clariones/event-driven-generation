package cla.edg.project.moyi;

import cla.edg.Utils;
import cla.edg.eventscript.BasicEventScriptInfo;
import cla.edg.eventscript.EventScript;
import cla.edg.generator.EventScriptGenerator;
import cla.edg.generator.PageFlowGenerator;
import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.BasePageFlowScript;
import cla.edg.project.yourong.events.BaseYourongEventScript;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		test_auction();
		testEventService(new ShopLocating());
		testEventService(new ShopDeposit());
		testEventService(new Auction());
		testEventService(new InkDeed());
		testEventService(new Affiliate());
		
		testPageFlow(new NativeAppServiceV2());
	}

	private static void testPageFlow(BasePageFlowDescriptionScript test) throws Exception {
		BasePageFlowScript script = test.getScript();
		String jsonStr = Utils.toJson(script, true);

		System.out.println(jsonStr);
		
		PageFlowGenerator generator = new PageFlowGenerator();
		generator.generateWithScript(script);
	}
	
	private static void testEventService(BaseMoyiEventScript testScript) throws Exception {
		BaseMoyiEventScript  test = testScript;
		EventScript script = test.getScript();
		String jsonStr = Utils.toJson(script, true);
		
		System.out.println(jsonStr);
		
		EventScriptGenerator generator = new EventScriptGenerator();
		generator.generateWithScript(script);
	}
}
