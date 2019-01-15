package cla.edg.pageflow;

import java.util.ArrayList;
import java.util.List;

public class Request extends BasePageFlowElement{
	protected boolean needLogin = false;
	protected boolean hasFootprint = false;
	protected boolean handleForm = false;
	protected List<Branch> branches;
	
	
	public boolean isHandleForm() {
		return handleForm;
	}
	public void setHandleForm(boolean handleForm) {
		this.handleForm = handleForm;
	}
	public List<Branch> getBranches() {
		return branches;
	}
	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}
	public boolean isNeedLogin() {
		return needLogin;
	}
	public void setNeedLogin(boolean need_login) {
		this.needLogin = need_login;
	}
	public boolean isHasFootprint() {
		return hasFootprint;
	}
	public void setHasFootprint(boolean hasFootprint) {
		this.hasFootprint = hasFootprint;
	}
	public Branch addBranch(String code) {
		ensureBranches();
		Branch bch = new Branch();
		bch.setName(code);
		branches.add(bch);
		return bch;
	}
	private void ensureBranches() {
		if (branches == null) {
			branches = new ArrayList<>();
		}
	}
	
	protected List<AccessParameter> parameters;

	public Request() {
		parameters = new ArrayList<>();
	}
	public List<AccessParameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<AccessParameter> parameters) {
		this.parameters = parameters;
	}

	public AccessParameter addFormParameter(String formName) {
		if (!parameters.isEmpty()) {
			throw new RuntimeException("请求的参数要么是form，要么是其它。不能既有form又有普通参数");
		}
		this.setHandleForm(true);
		return newParam("form", "formData", formName);
	}
	private AccessParameter newParam(String typeName, String paramName, String formName) {
		AccessParameter p = new AccessParameter();
		p.setTypeName(typeName);
		p.setParamName(paramName);
		p.setFormName(formName);
		parameters.add(p);
		return p;
	}
	public AccessParameter addStringParameter(String paramName) {
		if(this.isHandleForm()) {
			throw new RuntimeException("请求的参数要么是form，要么是其它。不能既有form又有普通参数");
		}
		return newParam("String", paramName, null);
	}
	public AccessParameter addIntegerParameter(String paramName) {
		if(this.isHandleForm()) {
			throw new RuntimeException("请求的参数要么是form，要么是其它。不能既有form又有普通参数");
		}
		return newParam("Integer", paramName, null);
	}
	public AccessParameter addBooleanParameter(String paramName) {
		if(this.isHandleForm()) {
			throw new RuntimeException("请求的参数要么是form，要么是其它。不能既有form又有普通参数");
		}
		return newParam("Boolean", paramName, null);
	}
	
}
