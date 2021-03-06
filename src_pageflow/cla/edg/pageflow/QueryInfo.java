package cla.edg.pageflow;

import com.terapico.query.utils.QueryInfoUtil;

import java.util.ArrayList;
import java.util.List;

public class QueryInfo extends BasePageFlowElement {
	protected String objectName;
	protected List<String> ruleComments;
	protected List<AccessParameter> parameters;
	protected boolean pagination = false;
	protected boolean querySingleObject = false;
	protected QueryInfoUtil queryInfo;

	public QueryInfoUtil getQueryInfo() {
		return queryInfo;
	}

	public void setQueryInfo(QueryInfoUtil queryInfo) {
		this.queryInfo = queryInfo;
	}

	public boolean isQuerySingleObject() {
		return querySingleObject;
	}
	public void setQuerySingleObject(boolean querySingleObject) {
		this.querySingleObject = querySingleObject;
	}
	public String getObjectName() {
		return objectName;
	}
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}
	public List<String> getRuleComments() {
		return ruleComments;
	}
	public void setRuleComments(List<String> ruleComments) {
		this.ruleComments = ruleComments;
	}
	public List<AccessParameter> getParameters() {
		return parameters;
	}
	public void setParameters(List<AccessParameter> params) {
		this.parameters = params;
	}
	public boolean isPagination() {
		return pagination;
	}
	public void setPagination(boolean pagination) {
		this.pagination = pagination;
	}
	
	private AccessParameter newParam(String typeName, String paramName, String formName) {
		AccessParameter p = new AccessParameter();
		p.setTypeName(typeName);
		p.setParamName(paramName);
		p.setFormName(formName);
		ensureParams();
		parameters.add(p);
		return p;
	}
	private void ensureParams() {
		if(parameters == null) {
			parameters = new ArrayList<>();
		}
	}
	public AccessParameter addStringParameter(String paramName) {
		return newParam("String", paramName, null);
	}
	public AccessParameter addListParameter(String paramName) {
		return newParam("List<?>", paramName, null);
	}
	public AccessParameter addDateParameter(String paramName) {
		return newParam("Date", paramName, null);
	}
	
	public AccessParameter addObjectParameter(String paramName, String typeName) {
		AccessParameter rst = newParam(typeName, paramName, null);
		rst.setExtType(true);
		return rst;
	}
	public AccessParameter addIntegerParameter(String paramName) {
		return newParam("Integer", paramName, null);
	}
	public AccessParameter addFloatParameter(String paramName) {
		return newParam("BigDecimal", paramName, null);
	}
	public AccessParameter addBooleanParameter(String paramName) {
		return newParam("Boolean", paramName, null);
	}
	public void addRuleComments(String comment) {
		if (ruleComments == null) {
			ruleComments = new ArrayList<>();
		}
		ruleComments.add(comment);
	}
}
