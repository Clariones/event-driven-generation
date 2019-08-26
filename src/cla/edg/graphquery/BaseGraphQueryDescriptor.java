package cla.edg.graphquery;

import cla.edg.graphquery.terms.BaseQueryCondition;
import cla.edg.graphquery.terms.GraphQueryDescriber;
import cla.edg.graphquery.terms.GraphQueryDescriptorInterface._gqi_after_search_by;
import cla.edg.graphquery.terms.GraphQueryDescriptorInterface._gqi_after_through;
import cla.edg.graphquery.terms.GraphQueryDescriptorInterface._gqi_fully_functional;
import cla.edg.graphquery.terms.MemberInfo;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.project.yourong.gen.graphquery.QueryPathDescripter;
import cla.edg.project.yourong.gen.graphquery.WantedNodeDescripter;

public class BaseGraphQueryDescriptor implements GraphQueryDescriber {

	@Override
	public _gqi_fully_functional with_string(String paramName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public _gqi_fully_functional with_integer(String paramName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public _gqi_fully_functional with_decimal(String paramName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public _gqi_fully_functional with_date(String paramName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public _gqi_fully_functional with_boolean(String paramName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public _gqi_fully_functional with_object(String typeClassName, String paramName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public _gqi_fully_functional pagination() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public _gqi_fully_functional no_pagination() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public _gqi_fully_functional comments(String comments) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageFlowScript request(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public _gqi_fully_functional query_graph(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QueryPathDescripter start_from() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public _gqi_after_through through(MemberInfo... edges) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WantedNodeDescripter want() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public _gqi_after_search_by search_by(BaseQueryCondition condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
