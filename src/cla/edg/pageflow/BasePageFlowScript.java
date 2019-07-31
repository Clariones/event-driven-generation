package cla.edg.pageflow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class BasePageFlowScript extends BasePageFlowElement{

	protected List<Request> requests;
	protected Map<String, Page> pages;
	protected transient BasePageFlowElement currentWork;
	protected transient Request currentRequest;
	protected transient Branch currentBranch;
	protected transient Page currentPage;
	protected transient boolean needLoginByDefault = false;
	protected transient boolean hasFootPrintDefault = true;
	protected List<QueryInfo> queryInfoList;
	protected transient QueryInfo currentQuery;
	protected List<String> objectParamTypes;
	

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

	protected Page findPageByName(String pageName) {
		ensurePages();
		return pages.get(pageName);
	}

	protected void addQueryInfo(QueryInfo qInfo) {
		if (queryInfoList == null) {
			queryInfoList = new ArrayList<>();
		}
		queryInfoList.add(qInfo);
	}

	protected Request findRequestByName(String requestName) {
		ensureRequests();
		Optional<Request> rst = requests.stream().filter(it->it.getName().equals(requestName)).findFirst();
		if (rst.isPresent()) {
			return rst.get();
		}
		return null;
	}
}
