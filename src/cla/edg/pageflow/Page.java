package cla.edg.pageflow;

import java.util.ArrayList;
import java.util.List;

public class Page extends BasePageFlowElement {
	protected List<String> possibleRequests;
	
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
