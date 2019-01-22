package cla.edg.pageflow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasePageFlowScript extends BasePageFlowElement{

	protected List<Request> requests;
	protected Map<String, Page> pages;
	protected transient BasePageFlowElement currentWork;
	protected transient Request currentRequest;
	protected transient Branch currentBranch;
	protected transient Page currentPage;
	protected transient boolean needLoginByDefault = false;
	protected transient boolean hasFootPrintDefault = true;
	
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

	private void ensureRequests() {
		if (requests == null) {
			requests = new ArrayList<>();
		}
		
	}

	protected void setCurrentWork(Request work) {
		currentWork = work;
		currentRequest = work;
		currentBranch = null;
		currentPage = null;
	}
	protected void setCurrentWork(Branch work) {
		currentWork = work;
		currentBranch = work;
		currentPage = null;
	}
	protected void setCurrentWork(Page work) {
		currentWork = work;
		currentPage = work;
	}

	protected void addNewPage(Page page) {
		ensurePages();
		pages.put(page.getName(), page);
	}

	private void ensurePages() {
		if (pages == null) {
			pages = new HashMap<>();
		}
	}

	protected Page findPageByName(String pageName) {
		ensurePages();
		return pages.get(pageName);
	}
}
