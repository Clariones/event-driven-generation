package cla.edg.generator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import cla.edg.Utils;
import cla.edg.graphquery.terms.GraphQueryInfo;
import cla.edg.graphquery.terms.ParameterInfo;
import cla.edg.pageflow.AccessParameter;
import cla.edg.pageflow.BasePageFlowScript;
import cla.edg.pageflow.Branch;
import cla.edg.pageflow.Page;
import cla.edg.pageflow.Request;

public class PageFlowGeneratorHelper {
	public boolean isRequestHasBranch(Request req) {
		if (req.getBranches() == null || req.getBranches().size() <= 1) {
			return false;
		}
		return true;
	}
	public Branch getDefaultBranch(Request req) {
		if (req.getBranches().size() == 1) {
			return req.getBranches().get(0);
		}
		for(Branch bch : req.getBranches()) {
			if (bch.getName().equals("by default")) {
				return bch;
			}
		}
		return req.getBranches().get(0);
	}
	public List<Branch> getAllOtherBranches(Request req){
		if (req.getBranches().size() == 1) {
			System.out.printf("request [%s] has only one branch\n", req.getName());
			return new ArrayList<>();
		}
		boolean foundDefault = false;
		List<Branch> result = new ArrayList<>();
		for(Branch bch : req.getBranches()) {
			if (bch.getName().equals("by default")) {
				foundDefault = true;
				continue;
			}
			result.add(bch);
		}
		if (foundDefault) {
			System.out.printf("request [%s] has %d branch(es) besides default\n", req.getName(), result.size());
			return result;
		}
		System.out.printf("request [%s] has %d branch(es), will return %d\n", req.getName(), result.size(), result.size()-1);
		result.remove(0);
		return result;
	}
	public List<String> getAllBrachNames(BasePageFlowScript script){
		List<String> result = new ArrayList<>();
		result.add("by default");
		for(Request req : script.getRequests()) {
//			System.out.println("check request " + req.getName());
			for(Branch bch : req.getBranches()) {
				if (result.contains(bch.getName())) {
					continue;
				}
				result.add(bch.getName());
			}
		}
		return result;
	}
	public List<AccessParameter> getAllForms(BasePageFlowScript script){
		List<AccessParameter> result = new ArrayList<>();
		for(Request req : script.getRequests()) {
//			System.out.println("check request " + req.getName());
			if (req.getParameters() == null || req.getParameters().isEmpty()) {
				continue;
			}
			for(AccessParameter param : req.getParameters()) {
				if (!"form".equals(param.getTypeName())) {
					continue;
				}
				if (result.contains(param.getFormName())) {
					continue;
				}
				result.add(param);
			}
		}
		return result;
	}
	public String getFormClassName(AccessParameter param) {
		if (param.isCustomized()) {
			return Utils.toCamelCase(param.getFormName()) + "FormCustomProcessor";
		}
		return Utils.toCamelCase(param.getFormName()) + "FormProcessor";
	}
	public String getBaseFormClassName(AccessParameter param) {
		return Utils.toCamelCase(param.getFormName()) + "FormProcessor";
	}
	
	public Collection<Page> getAllPages(BasePageFlowScript script) {
		return script.getPages().values();
	}
	public List<Request> getAllRequestDispatchNode(BasePageFlowScript script) {
		return script.getRequests();
	}
	public List<Map<String, Object>> getAllPageOutRequest(BasePageFlowScript script) {
		List<Map<String, Object>> result = new ArrayList<>();
		script.getPages().forEach((name, page)->{
			if (page.getPossibleRequests() == null) {
				return;
			}
			for(String req : page.getPossibleRequests()) {
				Map<String, Object> edge = new HashMap<>();
				edge.put("page", page.getName());
				edge.put("request", req);
				edge.put("name", findRequestComments(script, req));
				result.add(edge);
			}
		});
		return result;
	}
	private Object findRequestComments(BasePageFlowScript script, String req) {
		return script.getRequests().stream().filter(it->it.getName().equals(req)).findFirst().get().getComments();
	}
	public List<Map<String, Object>> getAllRequestBranchPages(BasePageFlowScript script) {
		List<Map<String, Object>> result = new ArrayList<>();
		script.getRequests().forEach(req->{
			if (req.getBranches() == null) {
				return;
			}
			for(Branch bch : req.getBranches()) {
				
				Map<String, Object> edge = new HashMap<>();
				edge.put("request", req.getName());
				edge.put("branch", bch.getName());
				edge.put("page", bch.getPage());
				edge.put("name", bch.getComments());
				result.add(edge);
			}
			
		});
		return result;
	}
	public Set<Request> getRootPageRequest(BasePageFlowScript script) {
		Set<String> allReqNames = script.getRequests().stream().map(it->it.getName()).collect(Collectors.toSet());
		Set<String> reqNames = new HashSet<>();
		for(Page page : script.getPages().values()) {
			if (page.getPossibleRequests() == null) {
				continue;
			}
			reqNames.addAll(page.getPossibleRequests());
		}
		allReqNames.removeAll(reqNames);
		Set<Request> result = new HashSet<>();
		for(Request req : script.getRequests()) {
			if (allReqNames.contains(req.getName())) {
				result.add(req);
			}
		}
		return result;
	}
	public Map<String, Object> getAllRequestBranches(BasePageFlowScript script) {
		HashSet<String> allPageNames = new HashSet<>(script.getPages().keySet());
		List<Map<String, Object>> result = new ArrayList<>();
		for(Page page : script.getPages().values()) {
			if (page.getPossibleRequests() == null) {
				continue;
			}
			for(String reqName : page.getPossibleRequests()) {
				Request req = findRequestByName(script, reqName);
				if (req.getBranches() == null) {
					continue;
				}
				for(Branch bch : req.getBranches()) {
					Map<String, Object> edge = new HashMap<>();
					edge.put("from", page);
					edge.put("to", bch.getPage());
					allPageNames.remove(bch.getPage());
					
					if (bch.getComments() == null) {
						edge.put("path", req.getComments());
					}else {
						edge.put("path", req.getComments()+"/"+bch.getComments());
					}
					result.add(edge);
				}
			}
		}
		Map<String, Object> returnMap = new HashMap<>();
		returnMap.put("edges", result);
		
		List<Map<String, Object>> rootEdges = new ArrayList<>();
		for(Request req : script.getRequests()) {
			if (req.getBranches() == null) {
				continue;
			}
			for(Branch bch : req.getBranches()) {
				if (!allPageNames.contains(bch.getPage())) {
					continue;
				}
				Map<String, Object> edge = new HashMap<>();
				edge.put("request", req);
				edge.put("page", bch.getPage());
				rootEdges.add(edge);
			}
		}
		returnMap.put("rootPages", rootEdges);
		return returnMap;
	}
	private Request findRequestByName(BasePageFlowScript script, String req) {
		return script.getRequests().stream().filter(it->it.getName().equals(req)).findFirst().get();
	}
	
	
	public List<Map<String, String>> getParamInfoListForMethodDeclaration(GraphQueryInfo queryInfo) {
		List<ParameterInfo> parameters = queryInfo.getParameters();
		if (parameters == null || parameters.isEmpty()) {
			return new ArrayList<>();
		}
		List<Map<String, String>> result = new ArrayList<>();
		for(ParameterInfo p :  parameters) {
			if (p.isExtType()) {
				result.add(Utils.put("typeName", Utils.getClassNameFromFullName(p.getTypeClassName()))
						.put("varName", toJavaVarName(p.getParamName())).into_map(String.class));
				continue;
			}
			result.add(Utils.put("typeName", toGQParamTypeName(p.getTypeClassName()))
					.put("varName", toJavaVarName(p.getParamName())).into_map(String.class));
		}
		return result;
	}
	public  List<Map<String, String>> getParamInfoListForQueryParameter(GraphQueryInfo queryInfo) {
		List<Map<String, String>> result = getParamInfoListForMethodDeclaration(queryInfo);
		result.removeIf(data->{
			String name = data.get("varName");
			String startPointTypeName = queryInfo.getStartPoint().get("paramName");
			startPointTypeName = toJavaVarName(startPointTypeName);
			return name.equals(startPointTypeName);
		});
		return result;
	}
	private Object toGQParamTypeName(String typeClassName) {
		switch (typeClassName) {
		case "boolean":
			return "Boolean";
		case "integer":
			return "Long";
		case "decimal":
			return "BigDecimal";
		case "datetime":
			return "Date";
		case "string":
			return "String";
		default:
			throw new RuntimeException("toJavaVarName() cannot handle " + typeClassName);
		}
	}
	private String toJavaVarName(String varName) {
		return Utils.uncapFirst(Utils.toCamelCase(varName));
	}
	
	public String toCamelCase(String name) {
		return Utils.toCamelCase(name);
	}
	
	public List<String> getReferencedTypes(List<GraphQueryInfo> queryInfoList) {
		Set<String> cs = new HashSet<>();
		for(GraphQueryInfo q : queryInfoList) {
			// 先是wanted 里
			List<String> ns = q.getEnhanceTypeName();
			for(String n : ns) {
				cs.add(n.toLowerCase()+"."+n);
			}
			// 然后是 start
			String n = q.getStartPoint().get("typeName");
			cs.add(n.toLowerCase()+"."+n);
		}
		List<String> result = new ArrayList<>(cs);
		Collections.sort(result);
		return result;
	}
}
