package com.terapico.changerequest.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import com.terapico.generator.BasicGenerator;
import com.terapico.generator.GenrationResult;
import com.terapico.generator.Utils;

@SuppressWarnings("unchecked")
public class ChangeRequestGenerator extends BasicGenerator {
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

	public List<GenrationResult> runJob() throws Exception {
		List<GenrationResult> resultList = new ArrayList<>();
		resultList.add(generateFullySpecFile());
		resultList.add(generateBackendSpecFile());
		resultList.add(generateCRConstClass());
		resultList.add(generateCRHelperClass());
		resultList.add(generateCustomCRHelperClass());
		resultList.add(generateChangeRequestXml());
		resultList.add(generateTodoFile());
		return resultList;
	}

	protected GenrationResult generateFullySpecFile() throws Exception {
		String fileName = this.toFileName(Utils.put("projectName", this.getProjectName()).into_map(),
				"${projectName?lower_case}_custom_src/META_INF/${projectName?lower_case}_fully_cr_spec.json");
		GenrationResult result = new GenrationResult().as_new_file();
		result.setFileName(fileName);
		result.setContent(Utils.toJson(this.getChangeRequestSpec().get("projectSpec"), true));
		result.setContentCode("fully_cr_spec.json");
		return result;
	}
	
	protected GenrationResult generateChangeRequestXml() throws Exception {
		Map<String, Object> data = Utils.put("projectSpec", this.getChangeRequestSpec().get("projectSpec"))
				.put("projectName", this.getProjectName())
				.put("crModelName", this.getChangeRequestModelName())
				.put("userModelName", this.getUserModelName())
				.put("helper", new GenerationHelper())
				.put("allEventSpec", this.getChangeRequestSpec().get("allEventSpec"))
				.into_map();
		String templatePath = "/changerequest/changeRequest.xml.ftl";
		String fileName = this.toFileName(data,
				"modeling/project_${helper.name_as_this(projectName)}/change_request.xml");
		return this.doGeneration(data, templatePath, fileName).as_new_file().with_code("changeRequest.xml");
	}
	
	protected GenrationResult generateBackendSpecFile() throws Exception {
		Map<String, Object> data = Utils.put("projectSpec", this.getChangeRequestSpec().get("projectSpec"))
				.put("helper", new GenerationHelper())
				.into_map();
		String templatePath = "/changerequest/backend_spec.json.ftl";
		String fileName = this.toFileName(Utils.put("projectName", this.getProjectName()).into_map(),
				"${projectName?lower_case}_custom_src/META_INF/${projectName?lower_case}_cr_spec.json");
		return this.doGeneration(data, templatePath, fileName).as_new_file().with_code("backend_spec.json");
	}

	protected GenrationResult generateCRConstClass() throws Exception {
		Map<String, Object> data = Utils.put("projectSpec", this.getChangeRequestSpec().get("projectSpec"))
				.put("projectName", this.getProjectName())
				.put("orgName", this.getOrgName())
				.put("helper", new GenerationHelper())
				.into_map();
		String templatePath = "/changerequest/cr_const.java.ftl";
		String fileName = this.toFileName(data,
				"${projectName?lower_case}_custom_src/com/${orgName?lower_case}/${projectName?lower_case}/CR.java");
		return this.doGeneration(data, templatePath, fileName).as_new_file().with_code("cr_const.java");
	}
	
	protected GenrationResult generateCRHelperClass() throws Exception {
		Map<String, Object> data = Utils.put("projectSpec", this.getChangeRequestSpec().get("projectSpec"))
				.put("projectName", this.getProjectName())
				.put("orgName", this.getOrgName())
				.put("helper", new GenerationHelper())
				.put("allEventSpec", this.getChangeRequestSpec().get("allEventSpec"))
				.into_map();
		String templatePath = "/changerequest/prj_cr_helper.java.ftl";
		String fileName = this.toFileName(data,
				"${projectName?lower_case}_custom_src/com/${orgName?lower_case}/${projectName?lower_case}/${projectName?cap_first}ChangeRequestHelper.java");
		return this.doGeneration(data, templatePath, fileName).as_new_file().with_code("prj_cr_helper.java");
	}
	
	protected GenrationResult generateCustomCRHelperClass() throws Exception {
		Map<String, Object> data = Utils.put("projectSpec", this.getChangeRequestSpec().get("projectSpec"))
				.put("projectName", this.getProjectName())
				.put("orgName", this.getOrgName())
				.put("helper", new GenerationHelper())
				.put("allEventSpec", this.getChangeRequestSpec().get("allEventSpec"))
				.into_map();
		String templatePath = "/changerequest/custom_cr_helper.java.ftl";
		String fileName = this.toFileName(data,
				"${projectName?lower_case}_custom_src/com/${orgName?lower_case}/${projectName?lower_case}/ChangeRequestHelper.java");
		return this.doGeneration(data, templatePath, fileName).when_not_exist().with_code("custom_cr_helper.java");
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
		return this.doGeneration(data, templatePath, fileName).as_new_file().with_code("todo.txt");
	}

	
	protected Map<String, Object> processProjectSpec(Map<String, Object> projectSpec,
			TrFunction<Map<String,Object>, String, Object, Object> projectSpecFunction, 
			TrFunction<Map<String,Object>, String, Object, Object> crSpecFunction, 
			TrFunction<Map<String,Object>, String, Object, Object> stepSpecFunction,
			TrFunction<Map<String,Object>, String, Object, Object> eventSpecFunction,
			TrFunction<Map<String,Object>, String, Object, Object> FieldSpecFunction) {
		Map<String, Object> result = new HashMap<>();
		projectSpec.forEach((name, value) -> {
			switch (name) {
			case "changeRequestList":
				result.put(name, 
						processSpecList((List<Map<String, Object>>) value, crSpecFunction, "stepList", (stepList)->{
							return processSpecList(stepList, stepSpecFunction, "eventList", (eventList)->{
								return processSpecList(eventList, eventSpecFunction, "fieldList", (fieldList)->{
									return processSpecList(fieldList, FieldSpecFunction, "", a->null);
								});
							});
						}));
				break;
			default:
				if (projectSpecFunction == null) {
					result.put(name, value);
				}else {
					result.put(name, projectSpecFunction.apply(result, name, value));
				}
				break;
			}
		});
		
		return result;
	}
	
	private Object processSpecList(List<Map<String, Object>> specList, 
			TrFunction<Map<String,Object>, String, Object, Object> specHandlerFunction,
			String listName, Function<List<Map<String, Object>>, Object> listFunc
			) {
		List<Map<String, Object>> resultList = new ArrayList<>();
		specList.forEach(cr -> {
			Map<String, Object> result = new HashMap<>();
			cr.forEach((name, value) -> {
				if (name.equals(listName)) {
					putIfNotNull(result, name, listFunc.apply((List<Map<String, Object>>) value));
				}else {
					if (specHandlerFunction == null) {
						putIfNotNull(result, name, value);
					}else {
						putIfNotNull(result, name, specHandlerFunction.apply(result, name, value));
					}
				}
			});
			resultList.add(result);
		});
		return resultList;
	}
	
	private void putIfNotNull(Map<String, Object> result, String name, Object value) {
		if (value == null) {
			return;
		}
		Objects.requireNonNull(result, "你代码有问题,result没初始化");
		result.put(name, value);
	}
/**
	 * 这个是个例子,演示如何处理各层数据来做定制化
	 * @param projectSpec
	 * @return
	 */
	public Map<String, Object> makeJavaStyleData(Map<String, Object> projectSpec) {
		return processProjectSpec(projectSpec, (resultMap, name, value) -> {
			// project
			System.out.println("project." + name + "=" + value);
			return value;
		}, (resultMap, name, value) -> {
			// CR
			System.out.println("\tcr." + name + "=" + value);
			return value;
		}, (resultMap, name, value) -> {
			// step
			System.out.println("\t\tstep." + name + "=" + value);
			return value;
		}, (resultMap, name, value) -> {
			// event
			System.out.println("\t\t\tevent." + name + "=" + value);
			return value;
		}, (resultMap, name, value) -> {
			// field
			// System.out.println("\t\t\t\tfield."+ name+"="+value);
			if (name.equals("name")) {
				return "name->" + value;
			}
			return value;
		});
	}


	

}
