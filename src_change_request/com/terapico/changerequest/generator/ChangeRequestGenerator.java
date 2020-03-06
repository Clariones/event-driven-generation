package com.terapico.changerequest.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.terapico.generator.NewBasicGenerator;

import cla.edg.Utils;
import cla.edg.actionpattern.GenrationResult;

public class ChangeRequestGenerator extends NewBasicGenerator{
	protected String projectName;
	protected String orgName;
	protected Map<String, Map<String, Object>> changeRequestSpec;
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public Map<String, Map<String, Object>> getChangeRequestSpec() {
		return changeRequestSpec;
	}
	public void setChangeRequestSpec(Map<String, Map<String, Object>> changeRequestSpec) {
		this.changeRequestSpec = changeRequestSpec;
	}
	
	protected GenrationResult generateTodoFile() throws Exception {
		Map<String, Object> data = Utils.put("projectSpec", this.getChangeRequestSpec().get("projectSpec"))
				.put("projectName",this.getProjectName())
				.put("helper", new GenerationHelper())
				.into_map();
		String templatePath = "/changerequest/todo.txt.ftl";
		String fileName = this.toFileName(Utils.put("projectName",this.getProjectName()).into_map(), "${projectName?lower_case}_custom_src/META_INF/TODO_changeReqeust.txt");
		return this.doGeneration(data, templatePath, fileName).as_new_file();
	}
	
	@Override
	public List<GenrationResult> runJob() throws Exception {
		List<GenrationResult> resultList = new ArrayList<>();
		resultList.add(generateTodoFile());
		return resultList;
	}
}
