package cla.edg.actionpattern;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;

import com.terapico.generator.GenrationResult;
import com.terapico.generator.Utils;

import freemarker.cache.StringTemplateLoader;
import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

public abstract class BaseAPGenerator {
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

	public void saveToFiles(File baseFolder, List<GenrationResult> list) {
		if (list == null || list.isEmpty()) {
			return;
		}
		list.forEach(it -> {
			try {
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

}
