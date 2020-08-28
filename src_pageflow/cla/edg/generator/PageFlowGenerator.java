package cla.edg.generator;

import cla.edg.pageflow.*;
import clariones.tool.builder.BaseGenerator;
import clariones.tool.builder.GenrationResult;
import clariones.tool.builder.Utils;

import java.io.File;
import java.util.*;

public class PageFlowGenerator extends BaseGenerator {
	public static final boolean force = false;
	
	protected String parentClassName;
	protected String parentClassPackage;
	protected BasePageFlowScript script;


	public String getParentClassName() {
		return parentClassName;
	}

	public void setParentClassName(String parentClassName) {
		this.parentClassName = parentClassName;
	}

	public String getParentClassPackage() {
		return parentClassPackage;
	}

	public void setParentClassPackage(String parentClassPackage) {
		this.parentClassPackage = parentClassPackage;
	}

	public BasePageFlowScript getScript() {
		return script;
	}

	public void setScript(BasePageFlowScript script) {
		this.script = script;
		this.setBasePackageName(script.base_package_name());
		this.setProjectName(script.project_name());
		this.setParentClassName(script.parent_class_name());
		this.setParentClassPackage(script.parent_class_package());

		verifyScriptWasFinished(script);
	}

	protected Map<String, Object> prepareData(Object script, String packageName, String className) {
		Map<String, Object> data = new HashMap<>();
		data.put("base_package", basePackageName);
		data.put("package", packageName);
		data.put("project_name", projectName);
		data.put("class_name", className);
		data.put("context_name", Utils.NameAsThis(projectName)+"UserContext");
		data.put("custom_context_name", "Custom"+ Utils.NameAsThis(projectName)+"UserContextImpl");
		data.put("script", script);
		data.put("NAMING", new Utils());
		return data;
	}

	private void verifyScriptWasFinished(BasePageFlowScript script) {
		// 1. 所有page 的 may_request都被声明了
		// 2. 所有的request，至少有一个返回结果
		// 3. 所有的请求，不能重复定义
		Set<String> mayRequestUrls = new HashSet<>();
		Set<String> allRequestUrls = new HashSet<>();
		Set<String> redundantRequestUrls = new HashSet<>();
		
		Set<String> anyRequestNoResponse = new HashSet<>();
		for(Request req : script.getRequests()) {
			if (!allRequestUrls.add(req.getName())) {
				redundantRequestUrls.add(req.getName());
			}
			if (req.getBranches() == null || req.getBranches().isEmpty()) {
				anyRequestNoResponse.add(req.getName());
				continue;
			}
			for(Branch bch : req.getBranches()) {
				if (bch.getPage() == null || bch.getPage().trim().isEmpty()){
					anyRequestNoResponse.add(req.getName());
					continue;
				}
			}
		}
		for(Page page: script.getPages().values()) {
			if (page.getPossibleRequests() == null) {
				continue;
			}
			mayRequestUrls.addAll(page.getPossibleRequests());
		}
		
		// 1. 所有page 的 may_request都被声明了
		Set<String> allUrls = new HashSet<>(mayRequestUrls);
		allUrls.removeAll(allRequestUrls);
		if (allUrls.size()>0) {
			throw new RuntimeException("以下页面请求未定义："+allUrls);
		}
		// 2. 所有的request，至少有一个返回结果
		if (anyRequestNoResponse.size() > 0){
			throw new RuntimeException("以下页面请求没有定义返回值："+anyRequestNoResponse);
		}
		// 3. 所有的请求，不能重复定义
		if (redundantRequestUrls.size() > 0){
			throw new RuntimeException("以下页面请求重复定义："+redundantRequestUrls);
		}
		// 4. 所有的query的名字必须是合法的
		if(script.getQueryInfoList() != null) {
			Set<String> allObjectParamTypes = new HashSet<>();
			for(QueryInfo query: script.getQueryInfoList()) {
				if (query.getObjectName().contains(" ")) {
					throw new RuntimeException("查询的对象名字不正常："+query.getObjectName());
				}

//				if (query.getQueryActionInfo() != null) {
//					// System.out.println("add " +Utils.toJson(query.getQueryActionInfo().getExternTypesNeedKnown(), true));
//					allObjectParamTypes.addAll(query.getQueryActionInfo().getExternTypesNeedKnown());
//				}else{
//					// System.out.println("skip " + query.getName());
//				}

				List<AccessParameter> params = query.getParameters();
				if (params == null || params.isEmpty()) {
					continue;
				}
				for(AccessParameter param : params) {
					if (param.isExtType()) {
						String typeName = param.getTypeName();
						if (allObjectParamTypes.contains(typeName)) {
							continue;
						} else {
							int pos = typeName.lastIndexOf('.');
							if (pos > 0) {
								allObjectParamTypes.add(typeName);
								param.setTypeName(typeName.substring(pos+1));
							}
						}
					}
				}
			}
			// System.out.println(Utils.toJson(allObjectParamTypes, true));
			if (allObjectParamTypes.size() > 0) {
				List<String> objTypeNames = new ArrayList<>(allObjectParamTypes);
				Collections.sort(objTypeNames);
				script.setObjectParamTypes(objTypeNames);
			}else {
				script.setObjectParamTypes(new ArrayList<>());
			}
		}
	}

	@Override
	public List<GenrationResult> runJob() throws Exception {
		List<GenrationResult> files = new ArrayList<>();
		files.add(generateBaseService());
		files.add(generateBasicBizService());
		files.add(generateBizService());
		files.add(generateViewService());
		files.add(generateCustomBaseViewPage());
		files.addAll(generateViewPage());
		if (script.getQueryInfoList() != null && script.getQueryInfoList().size() > 0){
			files.add(generateDbQueryV2());
		}
		if (script.getGraphQueryDescriptor() != null && script.getGraphQueryDescriptor().hasContent()) {
			files.add(generateGraphQueryBaseImpl());
		}
		return files;
	}
	private GenrationResult generateGraphQueryBaseImpl() throws Exception {
		// 第二个文件，XXXViewBizService
		Map<String, Object> data = makeData();
		data.put("queryInfo", script.getGraphQueryDescriptor());
		String className = Utils.NameAsThis(script.getName());
		data.put("class_name", className);
		String fileName = this.toFileName(data, "${package?replace('.','/')}/${helper.NameAsThis(script.name)}GraphQueryHelper.java");
		return doGeneration(data, "graphquery/BaseQueryImpl.java.ftl", fileName).when_not_exist().with_code("GraphQueryHelper.java");
	}
	private GenrationResult generateDbQueryV2() throws Exception {
		// 第二个文件，XXXViewBizService
		Map<String, Object> data = makeData();
		String className = Utils.NameAsThis(script.getName());
		data.put("class_name", className);
		String fileName = this.toFileName(data, "${package?replace('.','/')}/${helper.NameAsThis(script.name)}DBQueryHelper.java");
		return doGeneration(data, "pageflow/DbQueryV2.java.ftl", fileName).as_new_file().with_code("DbQueryV2.java");
	}
	private List<GenrationResult> generateViewPage() throws Exception {
		// 第二个文件，XXXViewBizService
		List<GenrationResult> files = new ArrayList<>();
		Map<String, Object> data = makeData("pageview");
		for(Page page: script.getPages().values()) {
			if ("general_cr_page".equals(page.getName())) {
				continue;
			}
			data.put("class_name", Utils.NameAsThis(page.getName()));
			data.put("page", page);
			String fileName = this.toFileName(data, "${package?replace('.','/')}/${helper.NameAsThis(page.name)}Page.java");
			files.add(doGeneration(data, "pageflow/ViewPage.java.ftl", fileName)
					.when_not_exist().with_code("CustomBaseViewPage.java"));
		}
		return files;
	}
	private GenrationResult generateCustomBaseViewPage() throws Exception {
		// 第二个文件，XXXViewBizService
		Map<String, Object> data = makeData("pageview");
		String fileName = this.toFileName(data, "${package?replace('.','/')}/CustomBaseViewPage.java");
		return doGeneration(data, "pageflow/CustomBaseViewPage.java.ftl", fileName).when_not_exist().with_code("CustomBaseViewPage.java");
	}
	private GenrationResult generateViewService() throws Exception {
		// 第二个文件，XXXViewBizService
		Map<String, Object> data = makeData();
		String fileName = this.toFileName(data, "${package?replace('.','/')}/${helper.NameAsThis(script.name)}ViewService.java");
		return doGeneration(data, "pageflow/ViewService.java.ftl", fileName).as_new_file().with_code("ViewService.java");
	}

	private GenrationResult generateBizService() throws Exception {
		// 第二个文件，XXXViewBizService
		Map<String, Object> data = makeData();
		String fileName = this.toFileName(data, "${package?replace('.','/')}/${helper.NameAsThis(script.name)}ViewBizService.java");
		return doGeneration(data, "pageflow/BizService.java.ftl", fileName).when_not_exist().with_code("BizService.java");
	}

	private GenrationResult generateBasicBizService() throws Exception {
		// 第二个文件，XXXViewBizService
		Map<String, Object> data = makeData();
		String fileName = this.toFileName(data, "${package?replace('.','/')}/Basic${helper.NameAsThis(script.name)}ViewBizService.java");
		return doGeneration(data, "pageflow/BasicBizService.java.ftl", fileName).when_not_exist().with_code("BasicBizService.java");
	}

	private GenrationResult generateBaseService() throws Exception {
		Map<String, Object> data = makeData();
		String fileName = this.toFileName(data, "${package?replace('.','/')}/Base${helper.NameAsThis(script.name)}ViewService.java");
		return doGeneration(data, "pageflow/BaseService.java.ftl", fileName).as_new_file().with_code("BaseService.java");
	}

	protected Map<String, Object> makeData() {
		return makeData("");
	}
	protected Map<String, Object> makeData(String packagePostfix) {
		String packageName = this.getBasePackageName()+"."+Utils.NameAsThis(script.getName()).toLowerCase()+packagePostfix;
		String fileNameEtyma = Utils.NameAsThis(script.getName());

		Map<String, Object> data = prepareData(script, packageName, fileNameEtyma);
		data.put("parent_class_name", getParentClassName());
		data.put("parent_class_package", getParentClassPackage());
		data.put("project_name", getProjectName());
		data.put("bean_name", script.bean_name());
		PageFlowGeneratorHelper helper = new PageFlowGeneratorHelper();
		helper.setScript(script);
		data.put("helper", helper);
		return data;
	}
}
