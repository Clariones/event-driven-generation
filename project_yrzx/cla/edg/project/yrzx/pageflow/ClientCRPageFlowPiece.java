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
					.got_page("project contract detail")

				.request_with_changerequest("comments on contract").with_string("item id").with_string("scene_code")
					.comments("合同批注").need_login()
					.got_page("project contract detail")

				.request_with_changerequest("review materials").with_string("item id").with_string("scene_code")
					.comments("资料审核").need_login()
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

				.request_with_changerequest("add employee")
					.comments("添加员工")
					.got_page("employee list")

				.request_with_changerequest("project progress").with_string("project id").with_string("item id")
					.comments("创建项目进度")
					.got_page("project progress list")

				.request_with_changerequest("task report").with_string("project id").with_string("label")
					.comments("创建施工日志")
					.got_page("project report detail")

				.request_with_changerequest("project supervision report").with_string("project id").with_string("label")
					.comments("创建项目监理日志")
					.got_page("project report detail")

				.request_with_changerequest("project manager report").with_string("project id").with_string("label")
					.comments("创建项目经理日志")
					.got_page("project report detail")

				.request_with_changerequest("add project nomination").with_string("project id").with_string("merchant id")
					.comments("添加项目岗位")
					.got_page("project organization")

				.request_with_changerequest("project command").with_string("project id")
					.comments("创建项目指令")
					.got_page("project command detail")

				.request_with_changerequest("fill personal detail")
					.comments("修改个人资料")
					.got_page("personal detail")

				.request_with_changerequest("resolve after sales").with_string("item id")
					.comments("解决售后问题")
					.got_page("after sales service detail")

				.request_with_changerequest("apply for advance compensation").with_string("project id")
					.comments("发起赔付申请")
					.got_page("compensation in advance detail")

				.request_with_changerequest("add debit card")
					.comments("添加劳务资料(银行卡)")
					.got_page("personal detail")


				.request_with_changerequest("apply personal emplacement").no_login()
					.comments("申请个人入驻")
					.got_page("popup")

				.request_with_changerequest("labor dispute").need_login().with_string("project id")
					.comments("提出劳务纠纷申请")
					.got_page("labor dispute detail")

				.request_with_changerequest("create material preserved sample").need_login().with_string("project id")
					.comments("创建进场材料存样单")
					.got_page("material preserved sample detail")

				.request_with_changerequest("create material bid sample").need_login().with_string("project id")
					.comments("创建投标材料存样单")
					.got_page("material bid sample detail")

				.request_with_changerequest("subcontract application").need_login()
					.comments("分包申请")
					.got_page("home page")

				.request_with_changerequest("apply for material change").need_login().with_string("project id").with_string("type id")
					.comments("材料变更申请")
					.got_page("material change detail")



				;
	}
}
