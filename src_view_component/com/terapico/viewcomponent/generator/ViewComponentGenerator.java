package com.terapico.viewcomponent.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import clariones.tool.builder.BaseGenerator;
import clariones.tool.builder.GenrationResult;
import clariones.tool.builder.Utils;
import com.terapico.viewcomponent.spec.AllSpec;
import com.terapico.viewcomponent.spec.ComponentInfo;

public class ViewComponentGenerator extends BaseGenerator {

	protected static String FILE_NAME_PREFIX;
	protected static String PACKAGE_NAME;

	public List<GenrationResult> runJob() throws Exception {
		List<GenrationResult> resultList = new ArrayList<>();
		resultList.addAll(generateComponentFile());
//		resultList.add(generateBuilderFile());
//		resultList.add(generateInterfaceFile());
		return resultList;
	}
	
	protected GenrationResult generateBuilderFile() throws Exception {
		Map<String, ComponentInfo> components = AllSpec.getAllComponents();
		Map<String, Object> data = Utils.put("allSpec", components).put("helper", new VCGenerationHelper()).into_map();
		String fileName = this.toFileName(data,
				"caf_custom_src/com/terapico/caf/viewcomponent/ViewComponentBuilder.java");

		String templatePath = "/viewcomponent/ViewComponentBuilder.java.ftl";
		return this.doGeneration(data, templatePath, fileName).as_new_file().with_code("builder");
	}
	
	protected GenrationResult generateInterfaceFile() throws Exception {
		Map<String, ComponentInfo> components = AllSpec.getAllComponents();
		Map<String, Object> data = Utils.put("allSpec", components).put("helper", new VCGenerationHelper()).into_map();
		String fileName = this.toFileName(data,
				"caf_custom_src/com/terapico/caf/viewcomponent/VComponent.java");

		String templatePath = "/viewcomponent/ViewComponentInterface.java.ftl";
		return this.doGeneration(data, templatePath, fileName).as_new_file().with_code("builder");
	}

	protected List<GenrationResult> generateComponentFile() throws Exception {
		Map<String, ComponentInfo> components = AllSpec.getAllComponents();
		String templatePath = "/viewcomponent/ViewComponent.java.ftl";
		List<GenrationResult> resultList = new ArrayList<>();
		for (ComponentInfo info : components.values()) {

			Map<String, Object> data = Utils.put("allSpec", components).put("component", info)
					.put("packageName", PACKAGE_NAME)
					.put("helper", new VCGenerationHelper()).into_map();
			String fileName = this.toFileName(data,
					FILE_NAME_PREFIX+"/VComponent${helper.NameAsThis(component.name)}.java");
			GenrationResult gr = doGeneration(data, templatePath, fileName).as_new_file().with_code("component");
			resultList.add(gr);
		}

		return resultList;
	}

	public static void main(String[] args) throws Exception {
		String tgtFolder = "/works/jobs/xt20_v1/workspace/xt20-biz-suite/bizcore/WEB-INF/xt20_client_src/com/doublechaintech/xt20/viewcomponent";
		FILE_NAME_PREFIX = "";
		PACKAGE_NAME = "com.doublechaintech.xt20.viewcomponent";

		ViewComponentGenerator generator = new ViewComponentGenerator();
		List<GenrationResult> results = generator.runJob();


		generator.saveToFiles(new File(tgtFolder), results);
	}
}
