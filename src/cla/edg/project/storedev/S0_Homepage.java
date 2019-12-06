package cla.edg.project.storedev;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S0_Homepage extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
//				.request("my next page recommended store").with_last_record_id().with_string("filter")
//					.comments("翻页").no_footprint().need_login()
//					.got_me_page()
//
//				.request("my next page recommended store audit tasks").with_last_record_id().with_string("filter")
//					.comments("翻页").no_footprint().need_login()
//					.got_me_page()


				//我发起的/待我审批/我审批的/抄送我的
				.request("view audit task list").with_last_record_id().with_string("filter")
					.got_page("audit task list").list_of("recommended_store_audit_task").comments("我发起的/待我审批/我审批的/抄送我的")

				.request("view next page of audit task list").with_last_record_id().with_string("filter").comments("我发起的/待我审批/我审批的/抄送我的")
					.got_page("audit task list").list_of("recommended_store_audit_task")

				//查看排名
				.request("view ranking details").with_string("start date").with_string("end date").need_login().comments("查看排名")
					.got_page("ranking details")

				.request("view recommended store detail").need_login().with_string("recommended store id")
					.got_page("recommended store detail")

				.request("update application").need_login().with_string("recommended store id")
					.got_page("base information form")

				.request("start application").need_login().comments("发起申请")
					.got_page("base information form")

			;
	}
}
