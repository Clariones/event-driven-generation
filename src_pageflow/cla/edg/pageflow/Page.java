package cla.edg.pageflow;

import cla.edg.page.PageBuilder;

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
	protected PageBuilder pageBuilder;
	protected String pageTemplateType = "others";
	
	
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
		this.setPageTemplateType("list-of");
	}

	public List<String> getPossibleRequests() {
		return possibleRequests;
	}

	public void setPossibleRequests(List<String> possibleRequests) {
		this.possibleRequests = possibleRequests;
	}

	public void addPossibleRequest(String requestName) {
		ensurePossibleRequests();
		if (!possibleRequests.contains(requestName)) {
			possibleRequests.add(requestName);
		}
	}

	private void ensurePossibleRequests() {
		if (possibleRequests == null) {
			possibleRequests = new ArrayList<>();
		}
	}

	public void addField(String name, String scope) {
		// TODO Auto-generated method stub
		
	}

	public PageBuilder getPageBuilder() {
		return pageBuilder;
	}

	public void setPageBuilder(PageBuilder pageBuilder) {
		this.pageBuilder = pageBuilder;
	}

	public String getPageTemplateType() {
		return pageTemplateType;
	}

	public void setPageTemplateType(String pageTemplateType) {
		this.pageTemplateType = pageTemplateType;
	}
}
