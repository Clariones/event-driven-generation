package cla.edg.project.storedev;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S3_RecommendedStoreDetailPage extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script

				.request("reject application").need_login().with_string("recommended store id").got_page("recommended store detail").comments("审批人 退回申请")
				.request("revert application").need_login().with_string("recommended store id").got_page("recommended store detail").comments("发起人 撤销申请")
				.request("do audit").need_login().with_string("recommended store id").with_string("approve").with_string("comments").got_page("recommended store detail").comments("审批人 开启审批")
				.request("finish audit").need_login().with_string("recommended store id").with_string("witness").with_string("comments").got_page("recommended store detail").comments("发起人 完成审批，补充信息")
				;
	}
}
