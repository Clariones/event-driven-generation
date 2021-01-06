package cla.edg.pageflow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import cla.edg.graphquery.terms.BaseGraphQueryDescriptor;
import cla.edg.page.PageBuilder;
import cla.edg.pageflow.spec.BasePageFlowSpecElement;
import cla.edg.pageflow.spec.Request;
import clariones.tool.builder.BaseSpecElement;
import clariones.tool.builder.Utils;
import clariones.tool.builder.utils.InternalNaming;

public class BasePageFlowScript extends BasePageFlowElement{

	protected List<Request> requests;
	protected Map<String, Page> pages;
	protected transient Object currentWork;
	protected transient Request currentRequest;
	protected transient Branch currentBranch;
	protected transient Page currentPage;
	protected transient boolean needLoginByDefault = false;
	protected transient boolean hasFootPrintDefault = true;
	protected List<QueryInfo> queryInfoList;
	protected transient QueryInfo currentQuery;
	protected List<String> objectParamTypes;
	protected Map<String, Object> configuration;
	protected transient BaseGraphQueryDescriptor graphQueryDescriptor;
	protected UserLoginInfo userLoginInfo;
	protected PageBuilder pageBuilder;
	
	
	public UserLoginInfo getUserLoginInfo() {
		return userLoginInfo;
	}

	public void setUserLoginInfo(UserLoginInfo userLoginInfo) {
		this.userLoginInfo = userLoginInfo;
	}

	public BaseGraphQueryDescriptor getGraphQueryDescriptor() {
		return graphQueryDescriptor;
	}

	public void setGraphQueryDescriptor(BaseGraphQueryDescriptor graphQueryDescriptor) {
		this.graphQueryDescriptor = graphQueryDescriptor;
	}

	public Map<String, Object> getConfiguration() {
		if (configuration == null) {
			configuration = new HashMap<>();
		}
		return configuration;
	}

	public void setConfiguration(Map<String, Object> configuration) {
		this.configuration = configuration;
	}

	public List<String> getObjectParamTypes() {
		return objectParamTypes;
	}

	public void setObjectParamTypes(List<String> objectParamTypes) {
		this.objectParamTypes = objectParamTypes;
	}

	public List<QueryInfo> getQueryInfoList() {
		return queryInfoList;
	}

	public void setQueryInfoList(List<QueryInfo> queryInfoList) {
		this.queryInfoList = queryInfoList;
	}

	public QueryInfo getCurrentQuery() {
		return currentQuery;
	}

	public void setCurrentQuery(QueryInfo currentQuery) {
		this.currentQuery = currentQuery;
	}

	public List<Request> getRequests() {
		return requests;
	}

	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}

	public Map<String, Page> getPages() {
		return pages;
	}

	public void setPages(Map<String, Page> pages) {
		this.pages = pages;
	}

	protected void addNewRequest(Request page) {
		ensureRequests();
		requests.add(page);
	}

	protected void ensureRequests() {
		if (requests == null) {
			requests = new ArrayList<>();
		}
		
	}

	protected void setCurrentWork(Request work) {
		currentWork = work;
		currentRequest = work;
		currentBranch = null;
		currentPage = null;
		currentQuery = null;
	}
	protected void setCurrentWork(Branch work) {
		currentWork = work;
		currentBranch = work;
		currentPage = null;
		currentQuery = null;
	}
	protected void setCurrentWork(Page work) {
		currentWork = work;
		currentPage = work;
		currentQuery = null;
	}
	protected void setCurrentWork(QueryInfo work) {
		currentWork = work;
		currentQuery = work;
	}
	
	protected void addNewPage(Page page) {
		ensurePages();
		pages.put(page.getName(), page);
	}

	protected void ensurePages() {
		if (pages == null) {
			pages = new HashMap<>();
		}
	}

	protected void addQueryInfo(QueryInfo qInfo) {
		if (queryInfoList == null) {
			queryInfoList = new ArrayList<>();
		}
		queryInfoList.add(qInfo);
	}

	public Request findRequestByName(String requestName) {
		ensureRequests();
		Optional<Request> rst = requests.stream().filter(it->Utils.nameEquals(it.getName(), requestName)).findFirst();
		if (rst.isPresent()) {
			return rst.get();
		}
		return null;
	}

	public PageFlowScript addConfiguration(String key, Object value) {
		if (currentWork != this.getConfiguration()) {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+",不能设置"+key);
		}
		this.getConfiguration().put(key, value);
		return (PageFlowScript) this;
	}
	protected String getConfigureValue(String key) {
		return (String) this.getConfiguration().get(key);
	}
	
	public String template_base_folder() {
		return getConfigureValue("template_base_folder");
	}

	public PageFlowScript base_package_name(String value) {
		return addConfiguration("base_package_name", value);
	}
	public String base_package_name() {
		return getConfigureValue("base_package_name");
	}
	
	public PageFlowScript project_name(String value) {
		return addConfiguration("project_name", value);
	}
	public String project_name() {
		return getConfigureValue("project_name");
	}
	
	public PageFlowScript parent_class_name(String value) {
		return addConfiguration("parent_class_name", value);
	}
	public PageFlowScript bean_name(String value) {
		return addConfiguration("bean_name", value);
	}
	public String parent_class_name() {
		return getConfigureValue("parent_class_name");
	}
	
	public PageFlowScript parent_class_package(String value) {
		return addConfiguration("parent_class_package", value);
	}

	public PageFlowScript addTag(String key, String value) {
		return addConfiguration(key, value);
	}
	
	public String parent_class_package() {
		return getConfigureValue("parent_class_package");
	}
	public String bean_name() {
		return getConfigureValue("bean_name");
	}

    public PageBuilder assemble_page_as() {
		if (!(currentWork instanceof Page)) {
			throw new RuntimeException("只能在Page中使用assemble_page_as()");
		}
		pageBuilder = new PageBuilder();
		pageBuilder.recordLocation();
		pageBuilder.setParentScript((PageFlowScript) this);
		currentPage.setPageBuilder(pageBuilder);
		return pageBuilder;
    }

	public QueryInfo findQueryByName(String targetQueryName) {
		if(getQueryInfoList() == null) {
			return null;
		}
		for (QueryInfo queryInfo : getQueryInfoList()) {
			if (queryInfo.getQueryInfo() == null){
				continue;
			}
			if (queryInfo.isQuerySingleObject()){
				continue;
			}
			String qName = InternalNaming.makeQueryName(queryInfo.getQueryInfo().getTargetModelTypeName(), queryInfo.getName());
			if (qName.equals(targetQueryName)){
				return queryInfo;
			}
		}
		return null;
	}

	public PageFlowScript request(String pathName) {
		Request request = new Request();
		request.setName(pathName.trim());
		request.setNeedLogin(needLoginByDefault);
		request.setHasFootprint(hasFootPrintDefault);
		addNewRequest(request);
		setCurrentWork(request);
		return this.comments("这个程序员很懒,什么也没留下");
	}

	public PageFlowScript comments(String string) {
		if (currentWork instanceof BasePageFlowElement) {
			((BasePageFlowElement) currentWork).setComments(string);
		}else if(currentWork instanceof BasePageFlowSpecElement){
			((BasePageFlowSpecElement) currentWork).setComments(string);
		}
		return (PageFlowScript) this;
	}

    public PageFlowScript for_request(String name) {
		Request req = findRequestByName(name);
		if (req != null){
			this.setCurrentWork(req);
			return (PageFlowScript) this;
		}
		return request(name);
    }

	public PageFlowScript for_change_request(String name) {
		String reqName = "submit cr " + name;
		Request req = findRequestByName(reqName);
		if (req != null){
			this.setCurrentWork(req);
			return (PageFlowScript) this;
		}
		throw new RuntimeException("找不到CR: " + name);
	}

	public PageFlowScript resource_base_folder(String value) {
		return addConfiguration("resource_base_folder", value);
	}
}
