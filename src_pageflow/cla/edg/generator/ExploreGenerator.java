package cla.edg.generator;

import java.io.File;
import java.io.IOException;
import java.util.Map;


import cla.edg.objlifescript.ObjectLifeScript;
import clariones.tool.builder.Utils;
import freemarker.template.Template;


public class ExploreGenerator extends BasicGenerator{
	public void generateWithScript(ObjectLifeScript script) throws Exception {
		
		verifyScriptWasCorrect(script);
		
		String targetObjectTypeName = script.getConfiguration().objectTypeName;
		String packageName = script.getConfiguration().packageName+"."+ Utils.toCamelCase(targetObjectTypeName).toLowerCase();
		this.setProjectName(script.getConfiguration().projectName);
		this.setBasePackageName(script.getConfiguration().packageName);
		
		generateBaseExploreFile(packageName, targetObjectTypeName, script);
		
	}

	private void generateBaseExploreFile(String packageName, String targetObjectTypeName, ObjectLifeScript script) throws Exception {
		String javaClassName = Utils.toCamelCase(targetObjectTypeName)+"BaseExploreTeam";
		File outputFile = new File(getBaseOutputFolderFile(), Utils.packageNameToPath(packageName)+"/"+javaClassName+".java");
		System.out.println("Write to " + outputFile.getCanonicalPath());
		Map<String, Object> data = prepareData(script, packageName, javaClassName);
		ExploreScriptGeneratorHelper helper = new ExploreScriptGeneratorHelper();
		helper.setScript(script);
		data.put("helper", helper);
		String tmplFileName = "explore/BaseExploreTeam.java.ftl";
		Template template = getTemplate(tmplFileName);
		doGeneration(outputFile, data, template);
	}

	private void verifyScriptWasCorrect(ObjectLifeScript script) {
		// TODO Auto-generated method stub
		
	}
}
