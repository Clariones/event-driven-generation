package cla.edg;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import cla.edg.script.EventScript;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class Generator {
	protected String baseOutputFolder;
	protected String baseTempalteFolder;
	public String getBaseOutputFolder() {
		return baseOutputFolder;
	}
	public void setBaseOutputFolder(String baseOutputFolder) {
		this.baseOutputFolder = baseOutputFolder;
	}
	public String getBaseTempalteFolder() {
		return baseTempalteFolder;
	}
	public void setBaseTempalteFolder(String baseTempalteFolder) {
		this.baseTempalteFolder = baseTempalteFolder;
	}
	
	protected String basePackageName;
	protected String projectName;
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getBasePackageName() {
		return basePackageName;
	}
	public void setBasePackageName(String basePackageName) {
		this.basePackageName = basePackageName;
	}
	
	
	public void generateWithScript(EventScript script) throws Exception {
		String packageName = this.getBasePackageName()+"."+Utils.toCamelCase(script.getBussinessName()).toLowerCase();
		String outputFileName = Utils.toCamelCase(script.getBussinessName())+"Service.java";
		File outputFile = new File(getBaseOutputFolderFile(), Utils.packageNameToPath(packageName)+"/"+outputFileName);
		System.out.println("Write to " + outputFile.getCanonicalPath());
		Map<String, Object> data = new HashMap<>();
		data.put("base_package", basePackageName);
		data.put("package", packageName);
		data.put("project_name", projectName);
		data.put("class_name", Utils.toCamelCase(script.getBussinessName())+"Service");
		data.put("context_name", Utils.toCamelCase(projectName)+"UserContext");
		data.put("script", script);
		
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_25);
		cfg.setDefaultEncoding("utf-8");
		cfg.setDirectoryForTemplateLoading(new File(baseTempalteFolder));
		Template template = cfg.getTemplate("event/Service.java.ftl");
		
		if (!outputFile.exists()) {
			outputFile.getParentFile().mkdirs();
			outputFile.createNewFile();
		}
		Writer out = new FileWriter(outputFile);
		template.process(data, out);
		out.flush();
		out.close();
	}
	private File getBaseOutputFolderFile() {
		return new File(baseOutputFolder);
	}
	
}
