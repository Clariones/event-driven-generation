package cla.edg.project.storedev;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S0_Homepage extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
				.request("my recommended store").with_last_record_id()
					.comments("Demo首页").has_footprint().can_refresh().need_login()
					.got_page("my recommended store").title("新店推荐").list_of("recommended-store")
				.request("my next page recommended store").with_last_record_id()
					.comments("翻页").no_footprint().need_login()
					.got_page("my recommended store")
				
			;
	}
}
