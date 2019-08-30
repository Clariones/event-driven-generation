package cla.edg.graphquery.terms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import cla.edg.Utils;

public class GraphQueryInfo {
	protected boolean pagination;
	protected String comments;
	protected List<String> moreComments;
	protected String name;
	protected List<ParameterInfo> parameters;
	protected Map<String, String> startPoint;
	protected BaseQueryCondition queryCondition;
	protected String targetTypeName;
	protected List<String> enhanceTypeName;
	protected List<MemberInfo> searchEdges;
	protected List<MemberInfo> sortMembers;
	protected List<BasePathInfo> pathInfoList;
	
	public List<BasePathInfo> getPathInfoList() {
		if (pathInfoList == null) {
			pathInfoList = new LinkedList<>();
		}
		return pathInfoList;
	}
	public void setPathInfoList(List<BasePathInfo> pathInfoList) {
		this.pathInfoList = pathInfoList;
	}
	public List<MemberInfo> getSortMembers() {
		if (sortMembers == null) {
			sortMembers = new LinkedList<>();
		}
		return sortMembers;
	}
	public void setSortMembers(List<MemberInfo> sortMembers) {
		this.sortMembers = sortMembers;
	}
	public List<MemberInfo> getSearchEdges() {
		if (searchEdges == null) {
			searchEdges = new LinkedList<>();
		}
		return searchEdges;
	}
	public void setSearchEdges(List<MemberInfo> searchEdges) {
		this.searchEdges = searchEdges;
	}
	public String getTargetTypeName() {
		return targetTypeName;
	}
	public void setTargetTypeName(String targetTypeName) {
		this.targetTypeName = targetTypeName;
	}
	public List<String> getEnhanceTypeName() {
		if (enhanceTypeName == null) {
			enhanceTypeName = new LinkedList<>();
		}
		return enhanceTypeName;
	}
	public void setEnhanceTypeName(List<String> enhanceTypeName) {
		this.enhanceTypeName = enhanceTypeName;
	}
	public BaseQueryCondition getQueryCondition() {
		return queryCondition;
	}
	public void setQueryCondition(BaseQueryCondition queryCondition) {
		this.queryCondition = queryCondition;
	}
	public Map<String, String> getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(Map<String, String> startPoint) {
		this.startPoint = startPoint;
	}
	public List<ParameterInfo> getParameters() {
		if (parameters == null) {
			parameters = new LinkedList<>();
		}
		return parameters;
	}
	public void setParameters(List<ParameterInfo> parameters) {
		this.parameters = parameters;
	}
	public boolean isPagination() {
		return pagination;
	}
	public void setPagination(boolean pagination) {
		this.pagination = pagination;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public List<String> getMoreComments() {
		return moreComments;
	}
	public void setMoreComments(List<String> moreComments) {
		this.moreComments = moreComments;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addParam(boolean isExtType, String typeClassName, String paramName) {
		ParameterInfo param = new ParameterInfo();
		param.setExtType(isExtType);
		param.setTypeClassName(typeClassName);
		param.setParamName(paramName);
		getParameters().add(param);
	}
	public void addStartPoint(String typeName, String paramName) {
		this.setStartPoint(Utils.put("typeName", typeName).put("paramName", paramName).into_map(String.class));
	}
	public void setSearchCondition(BaseQueryCondition condition) {
		this.setQueryCondition(condition);
	}
	public void addWantType(String name) {
		this.getEnhanceTypeName().add(name);
		if (this.getEnhanceTypeName().size() == 1) {
			this.setTargetTypeName(name);
		}
	}
	public void addSearchEdges(MemberInfo[] edges) {
		getSearchEdges().addAll(Arrays.asList(edges));
	}
	public void setOrderByMembers(MemberInfo[] members) {
		getSortMembers().addAll(Arrays.asList(members));
	}
	
	public String getQueryConditionAsString() {
		return this.getQueryCondition().toString();
	}
	
	public void addPaths(BasePathInfo[] paths) {
		this.getPathInfoList().addAll(Arrays.asList(paths));
		
//		Map<String, BasePathInfo> t = new HashMap<>();
//		for(BasePathInfo pathInfo: paths) {
//			Map<String, BasePathInfo> a = pathInfo.getAllPaths();
//			t.putAll(a);
//		}
//		System.out.println(t);
	}

	

}
