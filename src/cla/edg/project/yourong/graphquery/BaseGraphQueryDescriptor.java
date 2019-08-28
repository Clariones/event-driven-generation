package cla.edg.project.yourong.graphquery;

import java.util.LinkedList;
import java.util.List;

import cla.edg.graphquery.terms.BaseQueryCondition;
import cla.edg.graphquery.terms.BooleanMemberInfo;
import cla.edg.graphquery.terms.GraphQueryInfo;
import cla.edg.graphquery.terms.MemberInfo;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.project.yourong.gen.graphquery.QueryPathDescripter;
import cla.edg.project.yourong.gen.graphquery.WantedNodeDescripter;
import cla.edg.project.yourong.graphquery.GraphQueryDescriptorInterface.*;

public class BaseGraphQueryDescriptor implements GraphQueryDescriptorInterface._gqi_fully_functional,
		QueryPathDescripter, _gqi_after_start_from, _gqi_after_search_by, WantedNodeDescripter, _gqi_after_through {
	
	protected static BaseQueryCondition not(BaseQueryCondition condition) {
		return condition.wrapWithNot();
	}

	protected PageFlowScript pageFlowScript;
	protected List<GraphQueryInfo> queryList;
	protected GraphQueryInfo curQuery;

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
	public _gqi_fully_functional query_graph(String name) {
		curQuery = new GraphQueryInfo();
		ensureQueryList();
		queryList.add(curQuery);
		return this;
	}

	@Override
	public QueryPathDescripter start_from() {
		return this;
	}

	@Override
	public _gqi_after_through through(MemberInfo... edges) {
		curQuery.addSearchEdges(edges);
		return this;
	}

	@Override
	public WantedNodeDescripter want() {
		return this;
	}

	@Override
	public _gqi_after_search_by search_by(BaseQueryCondition condition) {
		curQuery.setSearchCondition(condition);
		return this;
	}

	@Override
	public _gqi_after_start_from startPoint(String typeName, String paramName) {
		curQuery.addStartPoint(typeName, paramName);
		return this;
	}

	@Override
	public WantedNodeDescripter wantNode(String name) {
		curQuery.addWantType(name);
		return this;
	}

	@Override
	public _gqi_fully_functional order_by(MemberInfo... members) {
		curQuery.setOrderByMembers(members);
		return this;
	}

}
