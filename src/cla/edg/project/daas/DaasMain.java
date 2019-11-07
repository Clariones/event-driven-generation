package cla.edg.project.daas;

import cla.edg.eventscript.EventScript;
import cla.edg.generator.EventScriptGenerator;
import cla.edg.generator.ExploreGenerator;
import cla.edg.generator.PageFlowGenerator;
import cla.edg.objlifescript.BaseObjectLifeScriptFactory;
import cla.edg.objlifescript.ObjectLifeScript;
import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.BasePageFlowScript;

public class DaasMain {


	public static void main(String[] args) throws Exception {
		testPageFlow(new MainScript());
	}

	private static void testExplore(BaseObjectLifeScriptFactory scriptFactory) throws Exception {
		ObjectLifeScript script = scriptFactory.getScript();
		ExploreGenerator generator = new ExploreGenerator();
		
		generator.setBaseOutputFolder("/Users/jarryzhou/codebase/daas-biz-suite/bizcore/WEB-INF/daas_custom_src");
		generator.setBaseTempalteFolder("./template");
		
		generator.generateWithScript(script);
	}

	private static void testPageFlow(BasePageFlowDescriptionScript test) throws Exception {
		BasePageFlowScript script = test.getScript();
		PageFlowGenerator generator = new PageFlowGenerator();
		generator.setBaseOutputFolder("/Users/jarryzhou/codebase/daas-biz-suite/bizcore/WEB-INF/daas_custom_src");
		generator.setBaseTempalteFolder("./template");
		generator.generateWithScript(script);
	}
	
	

}
