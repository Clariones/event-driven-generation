package cla.edg.generator;

import java.util.*;
import java.util.stream.Collectors;

import cla.edg.pageflow.*;
import cla.edg.pageflow.spec.Request;
import clariones.tool.builder.BaseGeneratorHelper;

import cla.edg.graphquery.terms.BasePathInfo;
import cla.edg.graphquery.terms.GraphQueryInfo;
import cla.edg.graphquery.terms.ParameterInfo;
import cla.edg.graphquery.terms.PathInfoV2;
import clariones.tool.builder.Utils;

public class PageFlowGeneratorHelper extends BaseGeneratorHelper {
	protected BasePageFlowScript script;
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
//			System.out.printf("request [%s] has only one branch\n", req.getName());
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
//			System.out.printf("request [%s] has %d branch(es) besides default\n", req.getName(), result.size());
			return result;
		}
//		System.out.printf("request [%s] has %d branch(es), will return %d\n", req.getName(), result.size(), result.size()-1);
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
//			HashMap<String, BasePathInfo> allENodes = new HashMap<String, BasePathInfo>();
//			edges.forEach(it->{
//				allENodes.putAll(it.getAllPaths());
//			});
			for(BasePathInfo eNode: edges) {
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
				all.put(p.getEdge().getEdgeName(), p.getEdge());
			}
		}
		return new ArrayList<>(all.values());
	}
	
//	public List<Map<String, String>> getAllPathPaires(GraphQueryInfo query) {
//		List<BasePathInfo> pathList = query.getPathInfoList();
//		Map<String, BasePathInfo> all = new HashMap<>();
//		for(BasePathInfo p : pathList) {
//			all.putAll(p.getAllPaths());
//		}
//		pathList = query.getWantList();
//		for(BasePathInfo p : pathList) {
//			all.putAll(p.getAllPaths());
//		}
//		
////		System.out.println(all.keySet());
//		
//		List<Map<String, String>> result = new ArrayList<>();
//		Set<String> allNodeNames = all.values().stream().map(it->it.getFromClass()).collect(Collectors.toSet());
//		Set<String> pathKey = new HashSet<>();
//		allNodeNames.addAll(all.values().stream().map(it->it.getToClass()).collect(Collectors.toSet()));
//		for(String nodeName: allNodeNames) {
//			List<BasePathInfo> fromMePath = all.values().stream().filter(it->it.getFromClass().equals(nodeName)).collect(Collectors.toList());
//			if (fromMePath == null || fromMePath.isEmpty()) {
//				continue;
//			}
//			List<BasePathInfo> toMePath = all.values().stream().filter(it->it.getToClass().equals(nodeName)).collect(Collectors.toList());
//			if (toMePath == null || toMePath.isEmpty()) {
//				continue;
//			}
//			for(BasePathInfo f : fromMePath) {
//				for(BasePathInfo t : toMePath) {
//					if (f.getEdgeName().equals(t.getEdgeName())) {
//						continue;
//					}
//					boolean existed = isPathExisted(pathKey, f, t);
//					if (existed) {
//						continue;
//					}
//					result.add(Utils.put("prePath", t.getEdgeName()).put("curPath", f.getEdgeName()).into_map(String.class));
////					System.out.printf("%s(%s) <%s> %s(%s)\r\n", 
////							t.getEdgeName(), t.getPathKey(),
////							nodeName,
////							f.getEdgeName(), f.getPathKey()
////							);
//				}
//			}
//		}
//		Collections.sort(result, getPathComparator());
//		return result;
//	}
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
		if (f.getEdgeName().equals("null$$")) {
			existed = true;
		}
		pathKey.add(pathKeyStr);
		return existed;
	}
	
	
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
	
	public boolean hasPathInfoFromLinkedPaths(GraphQueryInfo query) {
		List<BasePathInfo> list1 = query.getPathInfoList();
		 List<BasePathInfo> list2 = query.getWantList();
		if (list1 != null && list1.size() > 0) {
			return true;
		}
//		if (list2 != null && list2.size() > 0) {
//			return true;
//		}
		return false;
	}
	public Set<String> getStartEdgeNameInQuery(GraphQueryInfo query) {
		List<BasePathInfo> list = query.getPathInfoList();
		Set<String> result = new HashSet<>();
		if (list != null && list.size() > 0) {
			for(BasePathInfo p : list) {
				BasePathInfo edge = p.getStartEdge();
				if (edge != null) {
					result.add(edge.getEdgeName());
				}
			}
		}
		if (!result.isEmpty()) {
			return result;
		}
		list = query.getWantList();
		if (list != null && list.size() > 0) {
			for(BasePathInfo p : list) {
				BasePathInfo edge = p.getStartEdge();
				if (edge != null) {
					result.add(edge.getEdgeName());
				}
			}
		}
		return result;
	}
	public List<Map<String, String>> getAllPathInfoFromLinkedPaths(GraphQueryInfo query) {
		List<BasePathInfo> endPoints = new LinkedList<>();
		if (query.getWantList() != null && query.getWantList().size() > 0) {
			if (query.getPathInfoList() == null || query.getPathInfoList().isEmpty()) {
				BasePathInfo vPath = new BasePathInfo();
				vPath.setFromClass(null);
				vPath.setToClass(query.getTargetTypeName());
				vPath.setMemberName("$");
				vPath.setRelationType(BasePathInfo.HAS_A);
				vPath.appendPaths(query.getWantList());
				endPoints.add(query.getWantList().get(0));
			} else {
				for (BasePathInfo path : query.getPathInfoList()) {
					path.appendPaths(query.getWantList());
					endPoints.add(query.getWantList().get(0));
				}
			}
		} else {
			endPoints.addAll(query.getPathInfoList());
		}
		
		List<Map<String, String>> result = new ArrayList<>();
		Set<String> pathKey = new HashSet<>();
		for(BasePathInfo path: endPoints) {
			List<PathInfoV2> paths = path.getPathOfMine();
			System.out.println("==========" + paths);
			
			for(PathInfoV2 pInfo: paths){
				BasePathInfo cPath = pInfo.getEdge();
				List<PathInfoV2> toPaths = path.findNextPath(pInfo);
				if (toPaths == null || toPaths.isEmpty()) {
					continue;
				}
				for(PathInfoV2 tPath: toPaths) {
					if (this.isPathExisted(pathKey, cPath, tPath.getEdge())) {
						continue;
					}
					result.add(Utils.put("prePath", cPath.getEdgeName())
							.put("curPath", tPath.getEdge().getEdgeName())
							.into_map(String.class));
				}
			}
		}
		Collections.sort(result, getPathComparator());
		return result;
	}
	
	public boolean record(String groupName, Object data) {
		return Utils.record(groupName, data);
	}
	
	// 原则: 除非特别声明,否则默认都支持
	public boolean support(String featureName) {
		if (script == null) {
			return true;
		}
		if (script.getConfiguration().isEmpty()) {
			return true;
		}
		String value = (String) script.getConfiguration().get(featureName);
		if (value == null) {
			return true;
		}
		if (value.toLowerCase().equals("true")) {
			return true;
		}
		return false;
	}
	public void setScript(BasePageFlowScript script) {
		this.script = script;
	}

	public List<String> collectImported(){
		Set<String> beanNames = new TreeSet<>();
		for (QueryInfo queryInfo : this.script.getQueryInfoList()) {
			if (queryInfo.getQueryInfo() == null) {
				String str = Utils.toJson(queryInfo, false);
				System.out.println("现在统计import: " + str);
				continue;
			}
			beanNames.addAll(queryInfo.getQueryInfo().getRefferedBeanNames());
		}
		return new ArrayList<>(beanNames);
	}

	public Request getCrRequestByName(String formName) {
		String tgtRequestName = "submit cr " + formName;
		Request req = getRequestByName(tgtRequestName);
		if (req == null){
			Utils.error_on(1, "找不到提交表单 " + formName+" 的请求");
		}
		return req;
//		if (req.isNeedLogin()){
//			return "customerStartCr" + Utils.NameAsThis(formName);
//		}else{
//			return "startCr" + Utils.NameAsThis(formName);
//		}
	}

	private Request getRequestByName(String tgtRequestName) {
		Request req = script.getRequests().stream().filter(r -> r.getName().equals(tgtRequestName)).findFirst().orElse(null);
		return req;
	}

	public String calcRequestDummyUrl(String beanName, String reqName){
		Request req = getRequestByName(reqName);
		StringBuilder rst = new StringBuilder(req.getComments()==null?req.getName():req.getComments()).append(":");
		if (!Utils.isBlank(beanName)){
			rst.append(beanName).append("/");
		}
		if (req.isNeedLogin() && !req.getName().equalsIgnoreCase("view me page")){
			if (req.getChangeRequestName() != null){
				rst.append("customerStartCr").append(NameAsThis(req.getChangeRequestName())).append("/");
			}else{
				rst.append("customer").append(NameAsThis(req.getName())).append("/");
			}
		}else{
			if (req.getChangeRequestName() != null){
				rst.append("startCr").append(NameAsThis(req.getChangeRequestName())).append("/");
			}else{
				rst.append(nameAsThis(req.getName())).append("/");
			}
		}
		if (req.getParameters() != null){
			for (AccessParameter parameter : req.getParameters()) {
				rst.append("+/");
			}
		}
		return rst.toString();
	}
}
