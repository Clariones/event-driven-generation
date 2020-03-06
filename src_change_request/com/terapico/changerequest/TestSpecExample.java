package com.terapico.changerequest;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.terapico.changerequest.builder.OutputName;
import com.terapico.changerequest.generator.GenerationHelper;
import com.terapico.generator.NewBasicGenerator;

import cla.edg.actionpattern.GenrationResult;

public class TestSpecExample extends NewBasicGenerator{
	
	protected static final String tmplSpec2form = "changerequest/tools/spec2form.html.ftl";
	protected Map<String, Map<String, Object>> changrequestSpec;
	
	
	public Map<String, Map<String, Object>> getChangrequestSpec() {
		return changrequestSpec;
	}
	public void setChangrequestSpec(Map<String, Map<String, Object>> changrequestSpec) {
		this.changrequestSpec = changrequestSpec;
	}

	public GenrationResult genFormHtml(Map<String, Object> spec) throws Exception {
		Map<String, Object> data = new HashMap<>();
		data.put("projectSpec", spec);
		data.put("helper", new GenerationHelper());
		
		String fileName = String.format("output/cr/verify/%s.html", spec.get(OutputName.NAME));

		return doGeneration(data, tmplSpec2form, fileName).as_new_file();
	}
	
	public static void main(String[] args) throws Exception {
		Map<String, Map<String, Object>> rst = new Example().scriptExampe();
		TestSpecExample cheker = new TestSpecExample();
		cheker.setChangrequestSpec(rst);
		
		List<GenrationResult> genResult = cheker.runJob();
		cheker.saveToFiles(new File("."), genResult);
	}

	@Override
	public List<GenrationResult> runJob() throws Exception {
		List<GenrationResult> resultList = new ArrayList<>();
		resultList.add(genFormHtml(getChangrequestSpec().get("projectSpec")));
		
		return resultList;
	}
}
