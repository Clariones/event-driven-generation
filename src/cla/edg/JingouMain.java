package cla.edg;

import java.net.URLEncoder;

import cla.edg.eventscript.BaseEventDescriptionScript;
import cla.edg.eventscript.EventScript;
import cla.edg.generator.EventScriptGenerator;
import cla.edg.generator.PageFlowGenerator;
import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.BasePageFlowScript;
import cla.edg.project.jingou.JobOrder;
import cla.edg.project.jingou.WxappService;

public class JingouMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		test_auction();
		testEventService(new JobOrder());
//		testEventService(new ShopDeposit());
//		testEventService(new Auction());
//		testEventService(new InkDeed());
//		testEventService(new Affiliate());
		
		testPageFlow(new WxappService());
	}

	private static void testPageFlow(BasePageFlowDescriptionScript test) throws Exception {
		BasePageFlowScript script = test.getScript();
		String jsonStr = Utils.toJson(script, true);

		System.out.println(jsonStr);
		
		PageFlowGenerator generator = new PageFlowGenerator();
		
//		generator.setBaseOutputFolder("./output");
		generator.setBaseOutputFolder("/works/jobs/jingou_v1/workspace/jingou-biz-suite/bizcore/WEB-INF/jingou_custom_src");
		generator.setBaseTempalteFolder("./template");
		generator.setBasePackageName("com.recyclesupplychain.jingou");
		generator.setProjectName("jingou");
		generator.setParentClassName("WxappServiceBase");
		generator.setParentClassPackage("com.recyclesupplychain.jingou.wxappservice");
		
		generator.generateWithScript(script);
	}
	
	private static void testEventService(BaseEventDescriptionScript testScript) throws Exception {
		BaseEventDescriptionScript  test = testScript;
		EventScript script = test.getScript();
		String jsonStr = Utils.toJson(script, true);
		
		System.out.println(jsonStr);
		
		EventScriptGenerator generator = new EventScriptGenerator();
		generator.setBaseOutputFolder("/works/jobs/jingou_v1/workspace/jingou-biz-suite/bizcore/WEB-INF/jingou_custom_src");
		generator.setBaseTempalteFolder("./template");
		generator.setBasePackageName("com.recyclesupplychain.jingou");
		generator.setProjectName("jingou");
		
		generator.generateWithScript(script);
	}
}
