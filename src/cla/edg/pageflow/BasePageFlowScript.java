package cla.edg.pageflow;

import java.util.ArrayList;
import java.util.List;

public class BasePageFlowScript extends BasePageFlowElement{

	protected List<Request> requests;
	protected List<Page> pages;
	protected transient BasePageFlowElement currentWork;
	protected transient Request currentRequest;
	protected transient Branch currentBranch;
	protected transient Page currentPage;
	protected transient boolean needLoginByDefault = false;
	protected transient boolean hasFootPrintDefault = false;
	
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
		if (pages == null) {
			pages = new ArrayList<>();
		}
		pages.add(page);
	}
}
