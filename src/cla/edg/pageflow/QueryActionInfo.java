package cla.edg.pageflow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.Gson;

import cla.edg.Utils;
import cla.edg.modelbean.BaseAttribute;
import cla.edg.modelbean.BaseModelBean;
import cla.edg.modelbean.CorperationPathNode;
import cla.edg.modelbean.EnumAttribute;
import cla.edg.modelbean.LogicalOperator;
import cla.edg.modelbean.LogicalOperator.Operator;
import cla.edg.routemap.RouteUtil;
import cla.edg.modelbean.ModelBeanRoute;

public class QueryActionInfo {
	// ========================== 公共部分 ===========================
	protected Set<String> externTypesNeedKnown;
	protected LogicalOperator searchWhere;
	protected String targetModelTypeName;
	protected boolean querySingle;
	protected boolean pagination;
	public String getTargetModelTypeName() {
		return targetModelTypeName;
	}
	public void setTargetModelTypeName(String targetModelTypeName) {
		this.targetModelTypeName = targetModelTypeName;
	}
	public boolean isQuerySingle() {
		return querySingle;
	}
	public void setQuerySingle(boolean querySingle) {
		this.querySingle = querySingle;
	}
	public boolean isPagination() {
		return pagination;
	}
	public void setPagination(boolean pagination) {
		this.pagination = pagination;
	}
	public LogicalOperator getSearchWhere() {
		return searchWhere;
	}
	public void setSearchWhere(LogicalOperator searchWhere) {
		this.searchWhere = searchWhere;
	}
	public Set<String> getExternTypesNeedKnown() {
		if (externTypesNeedKnown == null) {
			externTypesNeedKnown = new HashSet<>();
		}
		return externTypesNeedKnown;
	}
	public void setExternTypesNeedKnown(Set<String> externTypesNeedKnown) {
		this.externTypesNeedKnown = externTypesNeedKnown;
	}
	public String getSql() {
		if (this.getBeanRoute() != null) {
			return this.getSqlFromSearchClause();
		}else {
			return this.getDbSql();
		}
	}
	public List<Object> getParams() {
		if (this.getBeanRoute() != null) {
			return this.getParamsFromSearchClause();
		}else {
			return this.getParamPrepareQueue();
		}
	}
	// ========================== 写法1: 直接写SQL ===========================
	protected String sqlTemplate;
	protected List<Object> paramDefinitions;
	protected List<CorperationPathNode> searchAlongPath;
	public List<CorperationPathNode> getSearchAlongPath() {
		return searchAlongPath;
	}
	public void setSearchAlongPath(List<CorperationPathNode> searchAlongPath) {
		this.searchAlongPath = searchAlongPath;
	}
	public List<Object> getParamDefinitions() {
		if (paramDefinitions == null) {
			paramDefinitions = new ArrayList<>();
		}
		return paramDefinitions;
	}
	public void setParamDefinitions(List<Object> paramDefinitions) {
		this.paramDefinitions = paramDefinitions;
	}
	public String getSqlTemplate() {
		return sqlTemplate;
	}

	public void setSqlTemplate(String sql) {
		sqlTemplate = sql;
	}
	public void addParam(Object param) {
		getParamDefinitions().add(String.valueOf(param));
	}
	public void addParamString(Object param) {
		getParamDefinitions().add(new Gson().toJson(param));
	}
	
	public String getDbSql() {
		return this.getSqlTemplate().replaceAll("\\?\\{[^\\}]+\\}", "?").replace("\n", "\" +\n\t\t\t\" ");
	}
	
	Pattern ptnSqlParam = Pattern.compile("(\\?(\\{[^\\}]+\\})?)");
	public List<Object> getParamPrepareQueue() {
		List<Object> result = new ArrayList<>();
		List<String> segs = Utils.findAllMatched( this.getSqlTemplate(), ptnSqlParam);
		int curAdditionalParamIdx = 0;
		for(String seg : segs) {
//			System.out.println(seg);
			if (seg.equals("?")) {
				result.add(getParamDefinitions().get(curAdditionalParamIdx++));
				continue;
			}
			String name = seg.substring(2, seg.length()-1);
			result.add(Utils.toJavaVariableName(name));
		}
		return result;
	}
	
	// ========================== 写法2: 用route map组装SQL ===========================
	protected List<Object> params;
	protected ModelBeanRoute beanRoute;
	
	public ModelBeanRoute getBeanRoute() {
		return beanRoute;
	}
	public void setBeanRoute(ModelBeanRoute beanRoute) {
		this.beanRoute = beanRoute;
	}
	public List<Object> getParamsFromSearchClause() {
		return params;
	}
	public String getSqlFromSearchClause() {
		StringBuilder sb =  new StringBuilder();
		String selectStr = beanRoute.getSelectClause(this.getTargetModelTypeName());
		sb.append(selectStr);
		
		params = new ArrayList<>();
		String whereClause = RouteUtil.getWhereClause(params, this.getSearchWhere());
		sb.append(whereClause);
		// create order by 
		makeSortClause(params, sb, null);
		// create limit
		makeLimitClause(params, sb, null);
		return sb.toString().replaceAll("[\r\n]+", "\" +\r\n\t\t\t\"");
	}
	private void makeSortClause(List<Object> paramValueExpList, StringBuilder sb, LogicalOperator whereClauses) {
		sb.append("\n    ORDER BY ").append(beanRoute.getTargetModelAlias()).append(".id DESC ");
	}
	private void makeLimitClause(List<Object> paramValueExpList, StringBuilder sb, LogicalOperator whereClauses) {
		sb.append("\n    LIMIT ? ");
		paramValueExpList.add("1");
	}
	
	
}
