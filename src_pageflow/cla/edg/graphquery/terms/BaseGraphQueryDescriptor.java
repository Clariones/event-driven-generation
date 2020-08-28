package cla.edg.graphquery.terms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import cla.edg.graphquery.terms.GraphQueryDescriptorInterface._gqi_after_search_by;
import cla.edg.graphquery.terms.GraphQueryDescriptorInterface._gqi_after_start_from;
import cla.edg.graphquery.terms.GraphQueryDescriptorInterface._gqi_after_through;
import cla.edg.graphquery.terms.GraphQueryDescriptorInterface._gqi_after_want;
import cla.edg.graphquery.terms.GraphQueryDescriptorInterface._gqi_fully_functional;
import cla.edg.pageflow.PageFlowScript;

public class BaseGraphQueryDescriptor implements GraphQueryScript, GraphQueryDescriptorInterface._gqi_fully_functional,
		 _gqi_after_start_from, _gqi_after_search_by, _gqi_after_through, _gqi_after_want {
	public boolean hasContent() {
		return queryList != null && queryList.size() > 0;
	}
	
	protected static BaseQueryCondition not(BaseQueryCondition condition) {
		return condition.wrapWithNot();
	}

	protected PageFlowScript pageFlowScript;
	protected List<GraphQueryInfo> queryList;
	protected GraphQueryInfo curQuery;

	public PageFlowScript getPageFlowScript() {
		return pageFlowScript;
	}

	public void setPageFlowScript(PageFlowScript pageFlowScript) {
		this.pageFlowScript = pageFlowScript;
	}

	public List<GraphQueryInfo> getQueryList() {
		ensureQueryList();
		return queryList;
	}

	protected void ensureQueryList() {
		if (queryList == null) {
			queryList = new LinkedList<>();
		}
	}

	public void setQueryList(List<GraphQueryInfo> queryList) {
		this.queryList = queryList;
	}

	@Override
	public _gqi_fully_functional with_simple_param(String typeClassName, String paramName) {
		curQuery.addParam(false, typeClassName, paramName);
		return this;
	}

	@Override
	public _gqi_fully_functional with_object(String typeClassName, String paramName) {
		curQuery.addParam(true, typeClassName, paramName);
		return this;
	}

	@Override
	public _gqi_fully_functional pagination() {
		curQuery.setPagination(true);
		return this;
	}

	@Override
	public _gqi_fully_functional no_pagination() {
		curQuery.setPagination(false);
		return this;
	}

	@Override
	public _gqi_fully_functional comments(String comments) {
		curQuery.setComments(comments);
		return this;
	}

	@Override
	public PageFlowScript continue_to_next() {
		return pageFlowScript;
	}

	@Override
	public _gqi_fully_functional query(Map<String, String> name) {
		curQuery = new GraphQueryInfo();
		curQuery.setName(name.get("queryName"));
		curQuery.setTargetTypeName(name.get("typeName"));
		ensureQueryList();
		queryList.add(curQuery);
		return this;
	}

	@Override
	public _gqi_after_start_from start_from(Map<String, String> names) {
		curQuery.addStartPoint(names.get("typeName"), names.get("paramName"));
		return this;
	}

	@Override
	public _gqi_after_through path(BasePathInfo... paths) {
		curQuery.addPaths(paths);
		return this;
	}
	
	@Override
	public _gqi_after_want want(BasePathInfo ... paths) {
		BasePathInfo ps = paths[0];
		curQuery.getWantList().addAll(Arrays.asList(paths));	
		return this;
	}

	@Override
	public _gqi_after_search_by search_by(BaseQueryCondition condition) {
		curQuery.setSearchCondition(condition);
		return this;
	}

//	@Override
//	public _gqi_after_start_from startPoint(String typeName, String paramName) {
//		curQuery.addStartPoint(typeName, paramName);
//		return this;
//	}

	@Override
	public _gqi_fully_functional order_by(MemberInfo... members) {
		curQuery.setOrderByMembers(members);
		return this;
	}

	@Override
	public _gqi_fully_functional with_list_param(String typeClassName, String paramName) {
		curQuery.addListParam(false, typeClassName, paramName);
		return this;
	}

	@Override
	public _gqi_fully_functional with_object_list(String typeClassName, String paramName) {
		curQuery.addListParam(true, typeClassName, paramName);
		return this;
	}

}









