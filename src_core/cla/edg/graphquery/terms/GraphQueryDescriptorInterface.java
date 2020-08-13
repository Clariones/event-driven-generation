package cla.edg.graphquery.terms;

import java.util.Map;

import cla.edg.pageflow.PageFlowScript;

public interface GraphQueryDescriptorInterface {
	// 描述'图查询'的参数
	interface _gqi_parameters {
		_gqi_fully_functional with_simple_param(String typeClassName, String paramName);
		_gqi_fully_functional with_list_param(String typeClassName, String paramName);
		default _gqi_fully_functional with_string(String paramName) {
			return with_simple_param("string", paramName);
		}
		default _gqi_fully_functional with_string_list(String paramName) {
			return with_list_param("string", paramName);
		}
		default _gqi_fully_functional with_integer(String paramName) {
			return with_simple_param("integer", paramName);
		}
		default _gqi_fully_functional with_integer_list(String paramName) {
			return with_list_param("integer", paramName);
		}
		default _gqi_fully_functional with_decimal(String paramName) {
			return with_simple_param("decimal", paramName);
		}
		default _gqi_fully_functional with_decimal_list(String paramName) {
			return with_list_param("decimal", paramName);
		}
		default _gqi_fully_functional with_date(String paramName) {
			return with_simple_param("datetime", paramName);
		}
		default _gqi_fully_functional with_date_list(String paramName) {
			return with_list_param("datetime", paramName);
		}
		default _gqi_fully_functional with_boolean(String paramName) {
			return with_simple_param("boolean", paramName);
		}
		default _gqi_fully_functional with_boolean_list(String paramName) {
			return with_list_param("boolean", paramName);
		}
		_gqi_fully_functional with_object(String typeClassName, String paramName);
		_gqi_fully_functional with_object_list(String typeClassName, String paramName);
		_gqi_fully_functional pagination();
		_gqi_fully_functional no_pagination();
		_gqi_fully_functional comments(String comments);
		_gqi_fully_functional order_by(MemberInfo ... members);
	}
	interface _gqi_out_of_graph_query {
		PageFlowScript continue_to_next();
		_gqi_fully_functional query(Map<String, String> name);
	}
	
	
	// 开始'图查询'的一个大段落
	interface _gqi_start_from {
		_gqi_after_start_from start_from(Map<String, String> names);
	}
	interface _gqi_through {
		_gqi_after_through path(BasePathInfo ... paths);
	}
	interface _gqi_want {
		_gqi_after_want want(BasePathInfo ... paths);
	}
	interface _gqi_search_by {
		_gqi_after_search_by search_by(BaseQueryCondition condition);
	}
	
	// 基本的'图查询'接口
	interface _gqi_basic_functional extends _gqi_parameters, _gqi_out_of_graph_query{
	}
	// 完整的'图查询'首层接口
	interface _gqi_fully_functional extends _gqi_basic_functional,_gqi_start_from,_gqi_through,_gqi_want,_gqi_search_by{
		
	}
	
	// 结束一个'图查询'的大段落
	interface _gqi_after_start_from extends _gqi_basic_functional, _gqi_through, _gqi_want, _gqi_search_by {
	}
	interface _gqi_after_through extends _gqi_basic_functional, _gqi_start_from, _gqi_want, _gqi_search_by {
	}
	interface _gqi_after_want extends _gqi_basic_functional, _gqi_start_from, _gqi_through, _gqi_search_by {
	}
	interface _gqi_after_search_by extends _gqi_basic_functional, _gqi_start_from, _gqi_through, _gqi_want {
	}
}











