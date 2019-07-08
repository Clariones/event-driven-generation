package cla.edg.objlifescript;

import java.util.ArrayList;
import java.util.List;

public class ExploreElement {
	public static final int SUB_DONE = 1;
	public static final int STILL_IN_SAME_PARENT = 2;
	
	protected List<String> commentSegments;
	public String name;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	private void ensureCommentSegments() {
		if (commentSegments != null) {
			return;
		}
		commentSegments = new ArrayList<>();
	}
	
	
	public void addComments(String comments) {
		ensureCommentSegments();
		commentSegments.add(comments);
	}


	public List<String> getCommentSegments() {
		return commentSegments;
	}


	public void setCommentSegments(List<String> commentSegments) {
		this.commentSegments = commentSegments;
	}

	

}
