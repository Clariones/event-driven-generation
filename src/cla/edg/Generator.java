package cla.edg;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import cla.edg.script.EventInfo;
import cla.edg.script.EventProcessResultBranch;
import cla.edg.script.EventRipple;
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
		verifyScriptWasFinished(script);
		
		String packageName = this.getBasePackageName()+"."+Utils.toCamelCase(script.getBussinessName()).toLowerCase();
		String outputFileName = Utils.toCamelCase(script.getBussinessName())+"Service.java";
		File outputFile = new File(getBaseOutputFolderFile(), Utils.packageNameToPath(packageName)+"/Base"+outputFileName);
		System.out.println("Write to " + outputFile.getCanonicalPath());
		Map<String, Object> data = new HashMap<>();
		data.put("base_package", basePackageName);
		data.put("package", packageName);
		data.put("project_name", projectName);
		data.put("class_name", "Base"+Utils.toCamelCase(script.getBussinessName())+"Service");
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
	
	private void verifyScriptWasFinished(EventScript script) {
		// 所有事件涟漪必须被处理
		// 所有 internal event 必须被触发
		Set<String> eventRippleSet = new HashSet<>();
		Set<String> publicEventSet = new HashSet<>();
		Set<String> internalEventSet = new HashSet<>();
		// 先收集所有数据
		for(EventInfo eventInfo : script.getEvents()) {
			if (eventInfo.isExternalEvent()) {
				publicEventSet.add(eventInfo.getName());
			}else {
				internalEventSet.add(eventInfo.getName());
			}
			if (eventInfo.getBranches() == null) {
				continue;
			}
			for(EventProcessResultBranch bch : eventInfo.getBranches().values()) {
				if (bch.getEventRipples() == null) {
					continue;
				}
				for(EventRipple evtRpl : bch.getEventRipples()) {
					eventRippleSet.add(evtRpl.getEventCode());
				}
			}
		}
		// 所有事件涟漪必须被处理
		Set<String> allEvtRpls = new HashSet<>(eventRippleSet);
		allEvtRpls.removeAll(publicEventSet);
		allEvtRpls.removeAll(internalEventSet);
		if (allEvtRpls.size() > 0) {
			throw new RuntimeException("以下事件未被处理："+allEvtRpls);
		}
		// 所有 internal event 必须被触发
		allEvtRpls = new HashSet<>(internalEventSet);
		allEvtRpls.removeAll(eventRippleSet);
		if (allEvtRpls.size() > 0) {
			throw new RuntimeException("以下内部事件从未被触发："+allEvtRpls);
		}
	}
	private File getBaseOutputFolderFile() {
		return new File(baseOutputFolder);
	}
	
}
