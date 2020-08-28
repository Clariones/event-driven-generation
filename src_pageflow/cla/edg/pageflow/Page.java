package cla.edg.pageflow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Page extends BasePageFlowElement {
	protected List<String> possibleRequests;
	protected String listOfTemplate;
	protected boolean refreshAction = false;
	protected String pageTitle;
	protected String renderClassName;
	protected Map<String, String> additionalField;
	
	
	public Map<String, String> getAdditionalField() {
		return additionalField;
	}

	public void setAdditionalField(Map<String, String> additionalField) {
		this.additionalField = additionalField;
	}

	public String getRenderClassName() {
		return renderClassName;
	}

	public void setRenderClassName(String renderClassName) {
		this.renderClassName = renderClassName;
	}

	public String getPageTitle() {
		if (pageTitle == null) {
			return this.getName(); // 老是忘了写page title, 给个默认值
		}
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

	public void addField(String name, String scope) {
		// TODO Auto-generated method stub
		
	}


}
