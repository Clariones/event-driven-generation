package cla.edg.project.yrzx.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class ClientCRPageFlowPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
				.request_with_changerequest("apply decoration").with_string("user id")
					.comments("申请装修项目").no_login()
					.got_page("application list")
				
				.request_with_changerequest("apply recommendation")
					.comments("进行推荐").need_login()
					.got_page("recommendation list")

				.request_with_changerequest("apply emplacement")
					.comments("申请入驻").no_login()
					.got_page("emplacement list")

				.request_with_changerequest("review contract").with_string("item id").with_string("scene_code")
					.comments("合同审核").need_login()
					.when("return to list")
						.got_page("project contract list")
					.when_others()
						.got_page("project contract detail")

				.request_with_changerequest("comments on contract").with_string("item id").with_string("scene_code")
					.comments("合同批注").need_login()
					.got_page("project contract detail")

				.request_with_changerequest("review materials").with_string("item id").with_string("scene_code")
					.comments("资料审核").need_login()
					.when("return to list")
						.got_page("document list by daily task")
					.when_others()
						.got_page("project material detail")

				.request_with_changerequest("comments on materials").with_string("item id").with_string("scene_code")
					.comments("资料批注").need_login()
					.got_page("project material detail")

				.request_with_changerequest("acceptance application").with_string("item id").with_string("project id")
					.comments("工程验收申请")
					.got_page("project acceptance detail")

				.request_with_changerequest("after sales").with_string("project id").with_string("item id")
					.comments("售后单")
					.got_page("after sales service detail")

				.request_with_changerequest("project penalties").with_string("project id").with_string("item id")
					.comments("违约处罚")
					.got_page("penalties detail")

			;
	}
}
