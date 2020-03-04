package com.terapico.changerequest;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.terapico.changerequest.builder.OutputName;
import com.terapico.changerequest.generator.GenerationHelper;

import cla.edg.generator.BasicGenerator;
import freemarker.template.Template;

public class TestSpecExample extends BasicGenerator{
	
	protected static final String tmplSpec2form = "changerequest/tools/spec2form.html.ftl";
	
	public void genFormHtml(Map<String, Object> spec, File baseOutputFolder) throws Exception {
		this.setBaseTempalteFolder("template");
		Template template = getTemplate(tmplSpec2form);
		File outputFile = new File(baseOutputFolder, spec.get(OutputName.NAME)+".html");
		
		Map<String, Object> data = new HashMap<>();
		data.put("projectSpec", spec);
		data.put("helper", new GenerationHelper());
		doGeneration(outputFile, data, template);
	}
	
	public static void main(String[] args) throws Exception {
		Object rst = new Example().scriptExampe();
		new TestSpecExample().genFormHtml((Map<String, Object>) rst, new File("output/cr/verify"));
	}
}
