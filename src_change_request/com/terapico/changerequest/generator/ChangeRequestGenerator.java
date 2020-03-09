package com.terapico.changerequest.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.terapico.generator.NewBasicGenerator;

import cla.edg.Utils;
import cla.edg.actionpattern.GenrationResult;

public class ChangeRequestGenerator extends NewBasicGenerator {
	protected String projectName;
	protected String orgName;
	protected String changeRequestModelName = "change_request";
	protected String userModelName = "merchant";
	protected Map<String, Map<String, Object>> changeRequestSpec;

	public String getUserModelName() {
		return userModelName;
	}

	public void setUserModelName(String userModelName) {
		this.userModelName = userModelName;
	}

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

	public String getChangeRequestModelName() {
		return changeRequestModelName;
	}

	public void setChangeRequestModelName(String changeRequestModelName) {
		this.changeRequestModelName = changeRequestModelName;
	}

	@Override
	public List<GenrationResult> runJob() throws Exception {
		List<GenrationResult> resultList = new ArrayList<>();
		resultList.add(generateSpecFile());
		resultList.add(generateTodoFile());
		return resultList;
	}

	protected GenrationResult generateSpecFile() throws Exception {
		String fileName = this.toFileName(Utils.put("projectName", this.getProjectName()).into_map(),
				"${projectName?lower_case}_custom_src/META_INF/${projectName?lower_case}_cr_spec.json");
		GenrationResult result = new GenrationResult().as_new_file();
		result.setFileName(fileName);
		Map<String, Object> specJsonData = makeJavaStyleData(this.getChangeRequestSpec().get("projectSpec"));
		System.out.println("1============\n\n\n" + Utils.toJson(specJsonData, true));
		result.setContent(Utils.toJson(specJsonData, true));
		return result;
	}

	protected GenrationResult generateTodoFile() throws Exception {
		Map<String, Object> data = Utils.put("projectSpec", this.getChangeRequestSpec().get("projectSpec"))
				.put("projectName", this.getProjectName())
				.put("crModelName", this.getChangeRequestModelName())
				.put("userModelName", this.getUserModelName())
				.put("helper", new GenerationHelper())
				.put("allEventSpec", this.getChangeRequestSpec().get("allEventSpec"))
				.into_map();
		String templatePath = "/changerequest/todo.txt.ftl";
		String fileName = this.toFileName(Utils.put("projectName", this.getProjectName()).into_map(),
				"${projectName?lower_case}_custom_src/META_INF/TODO_changeReqeust.txt");
		return this.doGeneration(data, templatePath, fileName).as_new_file();
	}

	private Map<String, Object> makeJavaStyleData(Map<String, Object> projectSpec) {
		Map<String, Object> result = new HashMap<>();
		projectSpec.forEach((name, value) -> {
			switch (name) {
			case "changeRequestList":
				result.put(name, makeJavaStyleCRData((List<Map<String, Object>>) value));
				break;
			default:
				result.put(name, value);
			}
		});
		return result;
	}

	private List<Map<String, Object>> makeJavaStyleCRData(List<Map<String, Object>> crList) {
		List<Map<String, Object>> resultList = new ArrayList<>();
		crList.forEach(step -> {
			Map<String, Object> result = new HashMap<>();
			step.forEach((name, value) -> {
				switch (name) {
				case "name":
					result.put(name, Utils.toJavaVariableName((String) value));
					break;
				case "stepList":
					result.put(name, makeJavaStyleStepData((List<Map<String, Object>>) value));
					break;
				default:
					result.put(name, value);
				}
			});
			resultList.add(result);
		});
		return resultList;
	}
	
	private List<Map<String, Object>> makeJavaStyleStepData(List<Map<String, Object>> stepList) {
		List<Map<String, Object>> resultList = new ArrayList<>();
		stepList.forEach(step -> {
			Map<String, Object> result = new HashMap<>();
			step.forEach((name, value) -> {
				switch (name) {
				case "name":
					result.put(name, Utils.toJavaVariableName((String) value));
					break;
				case "eventList":
					result.put(name, makeJavaStyleEventData((List<Map<String, Object>>) value));
					break;
				default:
					result.put(name, value);
				}
			});
			resultList.add(result);
		});
		return resultList;
	}

	private List<Map<String, Object>> makeJavaStyleEventData(List<Map<String, Object>> eventList) {
		List<Map<String, Object>> resultList = new ArrayList<>();
		eventList.forEach(step -> {
			Map<String, Object> result = new HashMap<>();
			step.forEach((name, value) -> {
				switch (name) {
				case "name":
					result.put(name, Utils.toJavaVariableName((String) value));
					break;
				case "eventType":
					result.put(name, Utils.toJavaConstStyle((String) value));
					break;
				case "fieldList":
					result.put(name, makeJavaStyleFieldData((List<Map<String, Object>>) value));
					break;
				default:
					result.put(name, value);
				}
			});
			resultList.add(result);
		});
		return resultList;
	}

	private List<Map<String, Object>> makeJavaStyleFieldData(List<Map<String, Object>> stepList) {
		List<Map<String, Object>> resultList = new ArrayList<>();
		stepList.forEach(step -> {
			Map<String, Object> result = new HashMap<>();
			step.forEach((name, value) -> {
				switch (name) {
				case "name":
					result.put(name, Utils.toJavaVariableName((String) value));
					break;
				default:
					result.put(name, value);
				}
			});
			resultList.add(result);
		});
		return resultList;
	}
}
