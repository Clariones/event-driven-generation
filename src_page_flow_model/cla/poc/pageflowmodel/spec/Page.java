package cla.poc.pageflowmodel.spec;

import java.util.ArrayList;
import java.util.List;

public class Page {
	public String name;
	public String title;
	public List<Block> contentBlockList;
	public static Page start(String name, String title) {
		Page me = new Page();
		me.name = name;
		me.title = title;
		return me;
	}

	public Page add(Block block) {
		ensureContentBlockList().add(block);
		return this;
	}

	private List<Block> ensureContentBlockList() {
		if (contentBlockList != null) {
			return contentBlockList;
		}
		return contentBlockList = new ArrayList<>();
	}
}
