package cla.edg.graphquery;

import cla.edg.graphquery.terms.BaseQueryCondition;
import cla.edg.graphquery.terms.GraphQueryDescriber;
import cla.edg.project.yourong.gen.graphquery.QueryPathDescripter;
import cla.edg.project.yourong.gen.graphquery.WantedNodeDescripter;

public class BaseGraphQueryDescriptor implements GraphQueryDescriber{

	@Override
	public GraphQueryDescriber with_string(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GraphQueryDescriber with_integer(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GraphQueryDescriber with_decimal(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GraphQueryDescriber with_boolean(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QueryPathDescripter start_from() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WantedNodeDescripter want() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition search_by(BaseQueryCondition condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GraphQueryDescriber pagination() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
