package cla.edg.pageflow;

public abstract class BasePageFlowDescriptionScript {
	protected static PageFlowScript $(String name) {
		PageFlowScript result = new PageFlowScript();
		result.setName(name);
		return result;
	}

	public abstract PageFlowScript getScript();
}
