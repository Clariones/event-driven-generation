package cla.edg.project.bcex;

import cla.edg.eventscript.EventScript;
import cla.edg.generator.EventScriptGenerator;
import cla.edg.generator.ExploreGenerator;
import cla.edg.generator.PageFlowGenerator;
import cla.edg.objlifescript.BaseObjectLifeScriptFactory;
import cla.edg.objlifescript.ObjectLifeScript;
import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.BasePageFlowScript;

public class BcexMain {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		testPageFlow(new MainScript());
	}

	private static void testExplore(BaseObjectLifeScriptFactory scriptFactory) throws Exception {
		ObjectLifeScript script = scriptFactory.getScript();
//		String json = Utils.toJson(script, true);
//		System.out.println(json);
		ExploreGenerator generator = new ExploreGenerator();
		
		generator.setBaseOutputFolder("/works/jobs/bcex_v1/workspace/bcex-biz-suite/bizcore/WEB-INF/bcex_custom_src");
		generator.setBaseTempalteFolder("./template");
		
		generator.generateWithScript(script);
	}

	private static void testPageFlow(BasePageFlowDescriptionScript test) throws Exception {
		BasePageFlowScript script = test.getScript();
//		String jsonStr = Utils.toJson(script, true);
//
//		System.out.println(jsonStr);
		
		PageFlowGenerator generator = new PageFlowGenerator();
		generator.setBaseOutputFolder("/works/jobs/bcex_v1/workspace/bcex-biz-suite/bizcore/WEB-INF/bcex_custom_src");
		generator.setBaseTempalteFolder("./template");
		generator.generateWithScript(script);
	}
	
	

}
