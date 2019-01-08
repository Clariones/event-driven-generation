package cla.edg;

import cla.edg.project.moyi.Auction;
import cla.edg.script.EventScript;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Auction  test = new Auction();
		EventScript script = test.getScript();
		String jsonStr = Utils.toJson(script, true);
		
		System.out.println(jsonStr);
		
		Generator generator = new Generator();
		generator.setBaseOutputFolder("./output");
		generator.setBaseTempalteFolder("./template");
		generator.setBasePackageName("com.terapico.moyi");
		generator.setProjectName("moyi");
		
		generator.generateWithScript(script);
		
	}

}
