package cla.edg.project.yourong.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S4_OrderForPropertyOwner extends PieceOfScript{
	

	/**
	 * <pre>
	 * 脚本描述了: 先进'订单list表', 上拉'查看更多', 看到需要操作的订单后, 进入'详情'.
	 * 在详情页, 可以'支付', 可以'催付'
	 * 
	 * '订单'的各种权限为:
	 * A. 查看: 
	 * 	1. 业主的所有成员(业主,业主代表,财务); 2. 完成订单的商家经理和财务(工人不能); 3.项目组织中的所有项目级别人员
	 * B. 支付:
	 *  1. 业主. 业主代表审核->业主批准->财务支付
	 * C. 催付(催审核,催批准,催支付)
	 *  1. 完成订单的商家经理和财务; 2.项目组织中,所属公司为'门店'的员工.
	 * 
	 * </pre>
	 */
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
			.request("view main order list as owner").with_string("filter")
				.comments("以业主身份查看订单").need_login().has_footprint().can_refresh()
				.got_page("main order list for owner").list_of("main-order").title("我的订单")
					.comments("订单分类列表")
					.may_request("view next page main order list as owner")
					.may_request("view property owner main order detail")
			.request("view next page main order list as owner").with_string("filter").with_string("last record id")
				.comments("以业主身份查看订单: 翻页").need_login().no_footprint()
				.got_page("main order list for owner")
			.request("view property owner main order detail").with_string("order id")
				.comments("查看订单详情").need_login().has_footprint().can_refresh()
				.got_page("main order detail")
					.comments("主订单详情页")
					.may_request("remind for owner order")
					.may_request("to verify owner order")
					.may_request("to approve owner order")
					.may_request("to pay owner order")
			.request("remind for owner order").with_string("order id")
				.comments("给业主订单一键发送消息").need_login().no_footprint()
				.got_page("simple popup")
			.request("to verify owner order").with_string("order id")
				.comments("审核业主订单").need_login().no_footprint()
				.got_page("simple popup")
					.may_request("submit owner order verify result")
			.request("submit owner order verify result").with_string("order id").with_string("verify code").with_boolean("success")
				.comments("提交业主订单审核结果").need_login().no_footprint()
				.got_page("main order detail")
			.request("to approve owner order").with_string("order id")
				.comments("批准业主订单").need_login().no_footprint()
				.got_page("simple popup")
					.may_request("submit owner order approve result")
			.request("submit owner order approve result").with_string("order id").with_string("verify code").with_boolean("success")
				.comments("提交业主订单批准结果").need_login().no_footprint()
				.got_page("main order detail")
			.request("to pay owner order").with_string("order id")
				.comments("支付业主订单").need_login().no_footprint()
				.when("need pay").comments("需要进行支付流程")
					.got_page("select payment method")
						.comments("选择支付方式")
						.may_request("submit order payment options")
				.when("treat as paid").comments("可以认为支付已经成功的情况. 例如零元购")
					.got_page("order paid success")
					
			/** 支付相关 */
			.request("submit order payment options").with_form("PaymentOptionSelection")
				.comments("提交支付选项结果,启动支付").need_login().no_footprint()
				.when("need proof").comments("选择线下支付后, 需要上传支付凭证")
					.got_page("upload payment proof")
					.comments("支付凭证上传")
				.when("need wechat pay info").comments("选择微信支付,需要调起微信支付")
					.got_page("wechat pay info")
					.comments("微信支付调用的必要信息")
				.when("paid success").comments("直接支付成功,例如全用余额支付了")
					.got_page("order paid success")
					.comments("支付成功页面")
			.request("check need payment verify code").with_form("PaymentOptionSelection")
				.comments("检查当前支付选项是否需要支付验证码").need_login().no_footprint()
				.got_page("ajax response")
					.comments("本请求是AJAX请求")
			.request("send payment verify code").with_string("mobile").variable()
				.comments("发送支付验证码").need_login()
				.got_page("ajax response")
				;
	}

	

}
