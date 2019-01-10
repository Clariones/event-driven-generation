package cla.edg;

import cla.edg.eventscript.EventScript;
import cla.edg.generator.EventScriptGenerator;
import cla.edg.pageflow.BasePageFlowScript;
import cla.edg.project.moyi.Auction;
import cla.edg.project.moyi.NativeAppServiceV2;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		test_auction();

		NativeAppServiceV2 test = new NativeAppServiceV2();
		BasePageFlowScript script = test.getScript();
		String jsonStr = Utils.toJson(script, true);

		System.out.println(jsonStr);
	}

	private static void test_auction() throws Exception {
		Auction  test = new Auction();
		EventScript script = test.getScript();
		String jsonStr = Utils.toJson(script, true);
		
		System.out.println(jsonStr);
		
		EventScriptGenerator generator = new EventScriptGenerator();
		generator.setBaseOutputFolder("./output");
		generator.setBaseTempalteFolder("./template");
		generator.setBasePackageName("com.terapico.moyi");
		generator.setProjectName("moyi");
		
		generator.generateWithScript(script);
	}

}
