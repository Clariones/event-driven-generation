package cla.edg.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import cla.edg.Utils;
import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

public class BasicGenerator {

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

	protected void doGeneration(File outputFile, Map<String, Object> data, Template template) throws IOException, TemplateException {
		if (!outputFile.exists()) {
			outputFile.getParentFile().mkdirs();
			outputFile.createNewFile();
		}
		Writer out = new FileWriter(outputFile);
		template.process(data, out);
		out.flush();
		out.close();
	}

	protected Template getTemplate(String tmplFileName)
			throws IOException, TemplateNotFoundException, MalformedTemplateNameException, ParseException {
				Configuration cfg = new Configuration(Configuration.VERSION_2_3_25);
				cfg.setDefaultEncoding("utf-8");
				cfg.setDirectoryForTemplateLoading(new File(baseTempalteFolder));
				Template template = cfg.getTemplate(tmplFileName);
				return template;
			}

	protected Map<String, Object> prepareData(Object script, String packageName, String className) {
		Map<String, Object> data = new HashMap<>();
		data.put("base_package", basePackageName);
		data.put("package", packageName);
		data.put("project_name", projectName);
		data.put("class_name", className);
		data.put("context_name", Utils.toCamelCase(projectName)+"UserContext");
		data.put("script", script);
		return data;
	}

	protected File getBaseOutputFolderFile() {
		return new File(baseOutputFolder);
	}

}
