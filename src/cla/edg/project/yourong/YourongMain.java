package cla.edg.project.yourong;

import com.terapico.generator.Utils;

import cla.edg.eventscript.EventScript;
import cla.edg.generator.EventScriptGenerator;
import cla.edg.generator.ExploreGenerator;
import cla.edg.generator.PageFlowGenerator;
import cla.edg.objlifescript.BaseObjectLifeScriptFactory;
import cla.edg.objlifescript.ObjectLifeScript;
import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.BasePageFlowScript;
import cla.edg.project.yourong.events.BaseYourongEventScript;
import cla.edg.project.yourong.events.Contract;
import cla.edg.project.yourong.events.OwnerBills;
import cla.edg.project.yourong.events.Project;
import cla.edg.project.yourong.events.YourongProjectBook;
import cla.edg.project.yourong.objlife.ProjectLifeScriptFactory;

public class YourongMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		testPageFlow(new YourongServiceMainScript());
		testEventService(new Project());
		testEventService(new Contract());
		testEventService(new OwnerBills());
		testEventService(new YourongProjectBook());
		testExplore(new ProjectLifeScriptFactory());
	}

	private static void testExplore(BaseObjectLifeScriptFactory scriptFactory) throws Exception {
		ObjectLifeScript script = scriptFactory.getScript();
//		String json = Utils.toJson(script, true);
//		System.out.println(json);
		ExploreGenerator generator = new ExploreGenerator();
		
		generator.setBaseOutputFolder("/works/jobs/yourong_v2/workspace/yourong-biz-suite/bizcore/WEB-INF/yourong_custom_src");
		generator.setBaseTempalteFolder("./template");
		
		generator.generateWithScript(script);
	}

	private static void testPageFlow(BasePageFlowDescriptionScript test) throws Exception {
		BasePageFlowScript script = test.getScript();
//		String jsonStr = Utils.toJson(script, true);
//
//		System.out.println(jsonStr);
		
		PageFlowGenerator generator = new PageFlowGenerator();
		generator.setBaseOutputFolder("/works/jobs/yourong_v2/workspace/yourong-biz-suite/bizcore/WEB-INF/yourong_custom_src");
		generator.setBaseTempalteFolder("./template");
		
		generator.generateWithScript(script);
	}
	
	private static void testEventService(BaseYourongEventScript testScript) throws Exception {
		BaseYourongEventScript  test = testScript;
		EventScript script = test.getScript();
//		String jsonStr = Utils.toJson(script, true);
//		
//		System.out.println(jsonStr);
		
		EventScriptGenerator generator = new EventScriptGenerator();
//		generator.setBaseOutputFolder("/works/jobs/yourong_v2/workspace/yourong-biz-suite/bizcore/WEB-INF/yourong_custom_src");
//		generator.setBaseTempalteFolder("./template");
//		generator.setBasePackageName("com.yrdec.yourong");
//		generator.setProjectName("yourong");
		
		generator.generateWithScript(script);
	}
}
