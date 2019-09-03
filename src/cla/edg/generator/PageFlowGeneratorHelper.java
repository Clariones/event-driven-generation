package cla.edg.generator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import cla.edg.Utils;
import cla.edg.graphquery.terms.BasePathInfo;
import cla.edg.graphquery.terms.GraphQueryInfo;
import cla.edg.graphquery.terms.ParameterInfo;
import cla.edg.graphquery.terms.PathInfoV2;
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
		for (ParameterInfo p : parameters) {
			if (p.isList()) {
				if (p.isExtType()) {
					result.add(
							Utils.put("typeName", "List<" + Utils.getClassNameFromFullName(p.getTypeClassName()) + ">")
									.put("varName", toJavaVarName(p.getParamName()) + "List")
									.put("paramName", toJavaVarName(p.getParamName())).into_map(String.class));
					continue;
				}
				result.add(Utils.put("typeName", "List<" + toGQParamTypeName(p.getTypeClassName()) + ">")
						.put("varName", toJavaVarName(p.getParamName()) + "List")
						.put("paramName", toJavaVarName(p.getParamName())).into_map(String.class));
			} else {
				if (p.isExtType()) {
					result.add(Utils.put("typeName", Utils.getClassNameFromFullName(p.getTypeClassName()))
							.put("varName", toJavaVarName(p.getParamName()))
							.put("paramName", toJavaVarName(p.getParamName())).into_map(String.class));
					continue;
				}
				result.add(Utils.put("typeName", toGQParamTypeName(p.getTypeClassName()))
						.put("varName", toJavaVarName(p.getParamName()))
						.put("paramName", toJavaVarName(p.getParamName())).into_map(String.class));
			}
		}
		return result;
	}
	
	public  List<Map<String, String>> getParamInfoListForQueryParameter(GraphQueryInfo queryInfo) {
		List<Map<String, String>> result = getParamInfoListForMethodDeclaration(queryInfo);
		result.removeIf(data->{
			String name = data.get("paramName");
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
			
			// 已经所有的 path
			List<BasePathInfo> edges = getAllEdeges(q);
			HashMap<String, BasePathInfo> allENodes = new HashMap<String, BasePathInfo>();
			edges.forEach(it->{
				allENodes.putAll(it.getAllPaths());
			});
			for(BasePathInfo eNode: allENodes.values()) {
				n = eNode.getFromClass();
				cs.add(n.toLowerCase()+"."+n);
				n = eNode.getToClass();
				cs.add(n.toLowerCase()+"."+n);
			}
		}
		List<String> result = new ArrayList<>(cs);
		Collections.sort(result);
		return result;
	}
	
	public List<BasePathInfo> getAllEdeges(GraphQueryInfo query) {
//		List<BasePathInfo> pathList = query.getPathInfoList();
//		Map<String, BasePathInfo> all = new HashMap<>();
//		for(BasePathInfo p : pathList) {
//			all.putAll(p.getAllPaths());
//		}
//		
//		for(BasePathInfo p : query.getWantList()) {
//			all.putAll(p.getAllPaths());
//		}
//		return new ArrayList<>(all.values());
		List<BasePathInfo> pathList = new LinkedList<>(query.getPathInfoList());
		pathList.addAll(query.getWantList());
		Map<String, BasePathInfo> all = new HashMap<>();
		for(BasePathInfo pth : pathList) {
			List<PathInfoV2> pathInfoList = pth.getPathOfMine();
			for(PathInfoV2 p : pathInfoList) {
				System.out.println(p.getEdge().getEdgeName()+" == " + p.getEdge());
				all.put(p.getEdge().getEdgeName(), p.getEdge());
			}
		}
		return new ArrayList<>(all.values());
	}
	
	public List<Map<String, String>> getAllPathPaires(GraphQueryInfo query) {
		List<BasePathInfo> pathList = query.getPathInfoList();
		Map<String, BasePathInfo> all = new HashMap<>();
		for(BasePathInfo p : pathList) {
			all.putAll(p.getAllPaths());
		}
		pathList = query.getWantList();
		for(BasePathInfo p : pathList) {
			all.putAll(p.getAllPaths());
		}
		
//		System.out.println(all.keySet());
		
		List<Map<String, String>> result = new ArrayList<>();
		Set<String> allNodeNames = all.values().stream().map(it->it.getFromClass()).collect(Collectors.toSet());
		Set<String> pathKey = new HashSet<>();
		allNodeNames.addAll(all.values().stream().map(it->it.getToClass()).collect(Collectors.toSet()));
		for(String nodeName: allNodeNames) {
			List<BasePathInfo> fromMePath = all.values().stream().filter(it->it.getFromClass().equals(nodeName)).collect(Collectors.toList());
			if (fromMePath == null || fromMePath.isEmpty()) {
				continue;
			}
			List<BasePathInfo> toMePath = all.values().stream().filter(it->it.getToClass().equals(nodeName)).collect(Collectors.toList());
			if (toMePath == null || toMePath.isEmpty()) {
				continue;
			}
			for(BasePathInfo f : fromMePath) {
				for(BasePathInfo t : toMePath) {
					if (f.getEdgeName().equals(t.getEdgeName())) {
						continue;
					}
					boolean existed = isPathExisted(pathKey, f, t);
					if (existed) {
						continue;
					}
					result.add(Utils.put("prePath", t.getEdgeName()).put("curPath", f.getEdgeName()).into_map(String.class));
//					System.out.printf("%s(%s) <%s> %s(%s)\r\n", 
//							t.getEdgeName(), t.getPathKey(),
//							nodeName,
//							f.getEdgeName(), f.getPathKey()
//							);
				}
			}
		}
		Collections.sort(result, getPathComparator());
		return result;
	}
	private Comparator<Map<String, String>> getPathComparator() {
		return new Comparator<Map<String, String>>() {

			@Override
			public int compare(Map<String, String> o1, Map<String, String> o2) {
				String c1 = o1.get("curPath");
				String c2 = o2.get("curPath");
				String p1 = o1.get("prePath");
				String p2 = o2.get("prePath");
				return p1.compareTo(p2);
			}
		};
	}
	private boolean isPathExisted(Set<String> pathKey, BasePathInfo f, BasePathInfo t) {
		boolean existed = false;
		String pathKeyStr = t.getEdgeName() + "=>" + f.getEdgeName() ;
		if (pathKey.contains(pathKeyStr)) {
			existed = true;
		}
		if (f.getEdgeName().equals(t.getEdgeName())) {
			existed = true;
		}
		pathKey.add(pathKeyStr);
		return existed;
	}
	
	
//	public List<Map<String, String>> getAllPathPairesFromLinkedPaths(GraphQueryInfo query) {
//		List<BasePathInfo> endPoints = new LinkedList<>();
//		
//		query.getPathInfoList().forEach(it->{
//			List<BasePathInfo> wantList = it.getActForPaths();
//			
//			endPoints.add(it);
//			
//			wantList.forEach(it2->{
//				endPoints.add(it2);
//			});
//		});
//		query.getWantList().forEach(it->{
//			List<BasePathInfo> wantList = it.getActForPaths();
//			endPoints.add(it);
//			wantList.forEach(it2->{
//				endPoints.add(it2);
//			});
//		});
//		
//		List<Map<String, String>> result = new ArrayList<>();
//		Set<String> pathKey = new HashSet<>();
//		for(BasePathInfo path: endPoints) {
//			addPriorPaths(result, path, pathKey);
//		}
//		Collections.sort(result, getPathComparator());
//		return result;
//	}
	
//	private void addPriorPaths(List<Map<String, String>> result, BasePathInfo path, Set<String> pathKey) {
//		List<BasePathInfo> priorList = path.getPriorPaths();
//		if (priorList == null || priorList.isEmpty()) {
//			return;
//		}
//		for(BasePathInfo cPath : priorList) {
//			boolean existed = isPathExisted(pathKey, cPath, path);
//			if (existed) {
//				continue;
//			}
//			result.add(Utils.put("prePath", cPath.getEdgeName()).put("curPath", path.getEdgeName()).into_map(String.class));
//			System.out.printf("link paths: %s(%s) <%s> %s(%s)\r\n", cPath.getEdgeName(), cPath.getPathKey(),
//					path.getFromClass(), path.getEdgeName(), path.getPathKey());
//			addPriorPaths(result, cPath, pathKey);
//		}
//	}
	public List<BasePathInfo> getWantedPaths(GraphQueryInfo query) {
		List<BasePathInfo> pathList = query.getWantList();
		Map<String, BasePathInfo> all = new HashMap<>();
		for(BasePathInfo p : pathList) {
			List<PathInfoV2> paths = p.getPathOfMine();
			for(PathInfoV2 pInfo: paths){
				BasePathInfo cPath = pInfo.getEdge();
				all.put(cPath.getEdgeName(), cPath);
			}
		}
		
		return new LinkedList<>(all.values());
	}
	
	
	public List<Map<String, String>> getAllPathInfoFromLinkedPaths(GraphQueryInfo query) {
		List<BasePathInfo> endPoints = new LinkedList<>(query.getPathInfoList());
		
		List<Map<String, String>> result = new ArrayList<>();
		Set<String> pathKey = new HashSet<>();
		for(BasePathInfo path: endPoints) {
			List<PathInfoV2> paths = path.getPathOfMine();
			for(PathInfoV2 pInfo: paths){
				BasePathInfo cPath = pInfo.getEdge();
				List<PathInfoV2> toPaths = path.findNextPath(pInfo);
				if (toPaths == null || toPaths.isEmpty()) {
					continue;
				}
				for(PathInfoV2 tPath: toPaths) {
					result.add(Utils.put("prePath", cPath.getEdgeName())
							.put("curPath", tPath.getEdge().getEdgeName())
							.into_map(String.class));
					System.out.printf("link paths: %s(%s) <%s> %s(%s)\r\n", cPath.getEdgeName(), cPath.getPathKey(),
							tPath.getEdge().getFromClass(), tPath.getEdge().getEdgeName(), tPath.getEdge().getPathKey());
				}
			}
		}
		Collections.sort(result, getPathComparator());
		return result;
	}
	
}
