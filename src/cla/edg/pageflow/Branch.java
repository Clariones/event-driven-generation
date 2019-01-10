package cla.edg.pageflow;

public class Branch extends BasePageFlowElement{
	protected Page page;
	
	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public Page setPage(String pageName) {
		page = new Page();
		page.setName(pageName);
		return page;
	}

}
