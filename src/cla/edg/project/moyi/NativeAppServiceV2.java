package cla.edg.project.moyi;

import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.BasePageFlowScript;
import cla.edg.pageflow.PageFlowScript;

public class NativeAppServiceV2 extends BasePageFlowDescriptionScript {

	private static final PageFlowScript SCRIPT = $("native app v2").need_login()
			/**
			 * 店铺入驻
			 */
			.request("open shop locating application")
				.comments("打开店铺入驻申请页面").no_footprint()
				.got_page("shop locating application")
					.comments("店铺入驻申请表单")
					.may_request("submit shop locating application form")
			.request("submit shop locating application form").with_form("moyi shop") // FORM name TBD
				.comments("提交入驻基本信息form")
				.got_page("shop deposit selection")
					.comments("选择店铺保证金等级表单")
					.may_request("submit shop deposit selection form")
			.request("submit shop deposit selection form").with_form("deposit selection")
				.comments("提交保证金档次选择结果")
				.got_page("pay shop deposite bill")
					.comments("选择店铺保证金等级表单")
					.may_request("shop deposit paid")
			.request("shop deposit paid").with_form("shop deposit payment")
				.comments("店铺保证金支付完成")
				.got_page("shop locating success")	// 是单独页面还是店铺首页，TBD
					.comments("店铺入驻成功")
					.may_request("view my shop")
			
			.request("view my shop")
				.comments("查看我的店铺").has_footprint()
				.got_page("my shop")
			;
		
//			

	@Override
	public PageFlowScript getScript() {
		return SCRIPT;
	}

}
