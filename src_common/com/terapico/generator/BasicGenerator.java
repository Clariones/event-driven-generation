package com.terapico.generator;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import cla.edg.actionpattern.BaseAPGenerator;
import freemarker.cache.StringTemplateLoader;
import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

public abstract class BasicGenerator extends BaseAPGenerator{
	public abstract List<GenrationResult> runJob() throws Exception;
	
	public String toFileName(Map<String, Object> data, String fileNameTemplate) throws Exception {
		StringWriter out = renderStringTemplate(data, fileNameTemplate);
		return out.toString();
	}

	protected StringWriter renderStringTemplate(Map<String, Object> data, String strTemplate)
			throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException,
			TemplateException {
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_28);
		StringTemplateLoader stringLoader = new StringTemplateLoader();
		stringLoader.putTemplate("SimpleStringTemplate", strTemplate);
		cfg.setTemplateLoader(stringLoader);
		
		Template template = cfg.getTemplate("SimpleStringTemplate");
		StringWriter out = new StringWriter();
		template.process(data, out);
		return out;
	}

	protected GenrationResult doGeneration(Map<String, Object> data, String templatePath, String fileName) throws Exception{
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_28);
		cfg.setClassForTemplateLoading(this.getClass(), "/template");
		cfg.setDefaultEncoding("UTF-8");
		// cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		// cfg.setLogTemplateExceptions(false);
		// cfg.setWrapUncheckedExceptions(true);
		// cfg.setFallbackOnNullLoopVariable(false);
		Template template = cfg.getTemplate(templatePath);
		StringWriter out = new StringWriter();
		template.process(data, out);
		
		GenrationResult result = new GenrationResult();
		result.setFileName(fileName);
		result.setContent(out.toString());
		return result;
	}

	protected void saveFiles(Map<String, File> baseFolders, List<GenrationResult> list) {
		if (list == null || list.isEmpty()) {
			return;
		}
		list.forEach(it -> {
			try {
				File baseFolder = findBaseFolder(it.getContentCode(), baseFolders);
				File tgtFile = new File(baseFolder, it.getFileName());
				boolean fileExisted = tgtFile.exists();
				switch (it.getActionCode()) {
				case GenrationResult.ACTION_REPLACE:
					Utils.saveIntoFile(tgtFile, it.getContent());
					return;
				case GenrationResult.ACTION_CREATE_WHEN_NEED:
					if (fileExisted) {
						System.out.println(" : skip " + it.getFileName());
						return;
					}
					Utils.saveIntoFile(tgtFile, it.getContent());
					return;
				default:
					System.out.println(" : you need copy below content and handle it yourself\r\n " + it.getContent());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
	
	protected File findBaseFolder(String contentCode, Map<String, File> baseFolders) {
		// first, find by exactly name
		if (baseFolders.containsKey(contentCode)) {
			return baseFolders.get(contentCode);
		}
		// next, find by patter
		Iterator<Entry<String, File>> it = baseFolders.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, File> ent = it.next();
			String codePattern = ent.getKey();
			if (contentCode.matches(codePattern)) {
				return ent.getValue();
			}
		}
		// finally, return the only one, or the ALL one
		if (baseFolders.containsKey("ALL")) {
			return baseFolders.get("ALL");
		}
		return baseFolders.values().iterator().next();
	}

	public void saveToFiles(File baseFolder, List<GenrationResult> resultList) {
		saveFiles(Utils.put("ALL", baseFolder).into_map(File.class), resultList);
	}
	public void saveToFiles(Map<String, File> baseFolders, List<GenrationResult> resultList) {
		saveFiles(baseFolders, resultList);
	}

}
