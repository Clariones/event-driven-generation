package cla.edg.pageflow;

import java.util.ArrayList;
import java.util.List;

public class Page extends BasePageFlowElement {
	protected List<String> possibleRequests;
	protected String listOfTemplate;
	protected boolean refreshAction = false;
	protected String pageTitle;
	
	
	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}
	
	public boolean isRefreshAction() {
		return refreshAction;
	}

	public void setRefreshAction(boolean refreshAction) {
		this.refreshAction = refreshAction;
	}

	public String getListOfTemplate() {
		return listOfTemplate;
	}

	public void setListOfTemplate(String listOfTemplate) {
		this.listOfTemplate = listOfTemplate;
	}

	public List<String> getPossibleRequests() {
		return possibleRequests;
	}

	public void setPossibleRequests(List<String> possibleRequests) {
		this.possibleRequests = possibleRequests;
	}

	public void addPossibleRequest(String requestName) {
		ensurePossibleRequests();
		possibleRequests.add(requestName);
	}

	private void ensurePossibleRequests() {
		if (possibleRequests == null) {
			possibleRequests = new ArrayList<>();
		}
	}

}
