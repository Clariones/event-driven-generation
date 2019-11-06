package cla.edg.project.storedev;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S0_Homepage extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
				.request("my next page recommended store").with_last_record_id().with_string("filter")
					.comments("翻页").no_footprint().need_login()
					.got_me_page()
				
				.request("my next page recommended store audit tasks").with_last_record_id().with_string("filter")
					.comments("翻页").no_footprint().need_login()
					.got_me_page()
					
				.request("view ranking details").need_login()
					.got_page("ranking details")
					
				.request("view recommended store detail").need_login().with_string("recommended store id")
					.got_page("recommended store detail")
			;
	}
}
