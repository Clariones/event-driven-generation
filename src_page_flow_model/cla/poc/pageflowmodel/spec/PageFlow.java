package cla.poc.pageflowmodel.spec;

import java.util.ArrayList;
import java.util.List;

public class PageFlow {
	public List<Page> pages;
	
	public static PageFlow start() {
		return new PageFlow();
	}

	public PageFlow add(Page newPage) {
		ensurePages().add(newPage);
		return this;
	}

	public List<Page> ensurePages() {
		if (pages != null) {
			return pages;
		}
		return pages = new ArrayList<>();
	}

}
