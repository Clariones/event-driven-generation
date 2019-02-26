package cla.edg.generator;

import java.io.File;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import cla.edg.Utils;
import cla.edg.pageflow.BasePageFlowScript;
import cla.edg.pageflow.Branch;
import cla.edg.pageflow.Page;
import cla.edg.pageflow.Request;
import freemarker.template.Template;

public class PageFlowGenerator extends BasicGenerator {
	public static final boolean force = false;
	
	protected String parentClassName;
	protected String parentClassPackage;
	
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

	public void generateWithScript(BasePageFlowScript script) throws Exception {
		verifyScriptWasFinished(script);
		// 一共输出4个文件： 
		//	BaseXXXViewService 这个基类，声明所有生成的处理框架中用到的方法和常量。方便维护。
		// 	BasicXXXViewBizService 这个是基类，声明所有自动生成的方法，框架方法等
		//	XXXViewBizService 这个是用户自己去扩展的方法。 非虚。 这样可以让新生成的接口报错，方便添加新方法。
		//  XXXViewService 这个是组装页面流的地方。生成的。
		// 和一套 ViewPage文件
		
		String packageName = this.getBasePackageName()+"."+Utils.toCamelCase(script.getName()).toLowerCase();
		String fileNameEtyma = Utils.toCamelCase(script.getName());
		
		Map<String, Object> data = prepareData(script, packageName, fileNameEtyma);
		data.put("parent_class_name", getParentClassName());
		data.put("parent_class_package", getParentClassPackage());
		data.put("helper", new PageFlowGeneratorHelper());
		
		// 第一个文件, BaseXXXViewService
		String className = String.format("Base%sViewService", fileNameEtyma);
		String outputFileName = className+".java";
		File outputFile = new File(getBaseOutputFolderFile(), Utils.packageNameToPath(packageName)+"/"+outputFileName);
		System.out.println("Write to " + outputFile.getCanonicalPath());
		
		
		String tmplFileName = "pageflow/BaseService.java.ftl";
		Template template = getTemplate(tmplFileName);
		doGeneration(outputFile, data, template);
		
		// 第二个文件，XXXViewBizService
		className = String.format("Basic%sViewBizService", fileNameEtyma);
		outputFileName = className+".java";
		outputFile = new File(getBaseOutputFolderFile(), Utils.packageNameToPath(packageName)+"/"+outputFileName);
		if (!force && outputFile.exists()) {
			System.out.println(outputFile.getCanonicalPath()+" exists, skip.");
		} else {
			System.out.println("Write to " + outputFile.getCanonicalPath());
			tmplFileName = "pageflow/BasicBizService.java.ftl";
			template = getTemplate(tmplFileName);
			doGeneration(outputFile, data, template);
		}
		
		// 第三个文件，XXXViewBizService
		className = String.format("%sViewBizService", fileNameEtyma);
		outputFileName = className+".java";
		outputFile = new File(getBaseOutputFolderFile(), Utils.packageNameToPath(packageName)+"/"+outputFileName);
		if (!force && outputFile.exists()) {
			System.out.println(outputFile.getCanonicalPath()+" exists, skip.");
		} else {
			System.out.println("Write to " + outputFile.getCanonicalPath());
			tmplFileName = "pageflow/BizService.java.ftl";
			template = getTemplate(tmplFileName);
			doGeneration(outputFile, data, template);
		}
		
		// 第四个文件，XXXViewService
		className = String.format("%sViewService", fileNameEtyma);
		outputFileName = className+".java";
		outputFile = new File(getBaseOutputFolderFile(), Utils.packageNameToPath(packageName)+"/"+outputFileName);
		System.out.println("Write to " + outputFile.getCanonicalPath());
		tmplFileName = "pageflow/ViewService.java.ftl";
		template = getTemplate(tmplFileName);
		doGeneration(outputFile, data, template);
		
		// 和一套 ViewPage文件
		packageName += "pageview";
		for(Page page: script.getPages().values()) {
			className = Utils.toCamelCase(page.getName());
			data.put("class_name", className);
			outputFileName = className+"Page.java";
			outputFile = new File(getBaseOutputFolderFile(), Utils.packageNameToPath(packageName)+"/"+outputFileName);
			if (!force && outputFile.exists()) {
				System.out.println(outputFile.getCanonicalPath()+" exists, skip.");
			} else {
				System.out.println("Write to " + outputFile.getCanonicalPath());
				tmplFileName = "pageflow/ViewPage.java.ftl";
				template = getTemplate(tmplFileName);
				doGeneration(outputFile, data, template);
			}
		}
		
		if (script.getQueryInfoList() != null && script.getQueryInfoList().size() > 0) {
			// 第五个文件，XXXDBQueryHelper 和 ，XXXDBQueryHelperImpl（这个手动）
			packageName = this.getBasePackageName()+"."+Utils.toCamelCase(script.getName()).toLowerCase();
			fileNameEtyma = Utils.toCamelCase(script.getName());
			className = String.format("%s", fileNameEtyma);
			data.put("class_name", className);
			outputFileName = className + "DBQueryHelper.java";
			outputFile = new File(getBaseOutputFolderFile(),
					Utils.packageNameToPath(packageName) + "/" + outputFileName);
			System.out.println("Write to " + outputFile.getCanonicalPath());
			tmplFileName = "pageflow/DbQuery.java.ftl";
			template = getTemplate(tmplFileName);
			doGeneration(outputFile, data, template);
		}
				
		// 调试用：增加一个自动布局的JS数据文件
		outputFileName = "datanodes.js";
		File outputFolder = new File("/works/jobs/moyi_v2/workspace/agl");
		outputFile = new File(outputFolder, outputFileName);
		System.out.println("Write to " + outputFile.getCanonicalPath());
		tmplFileName = "pageflow/data.js.ftl";
		template = getTemplate(tmplFileName);
		doGeneration(outputFile, data, template);
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
	}
}
