package cla.edg.project.moyi;

import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.BasePageFlowScript;

public class NativeAppServiceV2_bakcup extends BasePageFlowDescriptionScript {

	private static final BasePageFlowScript SCRIPT = $("native app v2").need_login()
			/**
			 * 店铺入驻
			 */
			.request("open shop locating application")
				.comments("打开店铺入驻申请页面").no_footprint()
				.got_page("shop locating application")
					.comments("店铺入驻申请表单")
					.may_request("submit shop locating application form")
			.request("submit shop locating application form").with_form("shop locating application") // FORM name TBD
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
			/**
			 * 店铺
			 */
			.request("view my shop")
				.comments("查看我的店铺").has_footprint()
				.got_page("my shop")
					.comments("我的店铺")
					.may_request("artwork list in shop")
					.may_request("ink deed list in shop")
					.may_request("order list in shop")
					.may_request("shop deposit detail")
			.request("artwork list in shop").with_string("shop id").with_string("filter name").with_integer("page no").with_boolean("continue to load")
				.comments("店铺的作品")
				.got_page("artwork list in shop")
					.comments("店铺-我的作品")
					.may_request("artwork detail in shop")
					.may_request("artwork list in shop")
					.may_request("start ownership certificate application")
					.may_request("put artwork to sale")
			.request("artwork detail in shop").with_string("artwork id")
				.comments("查看艺术品商品的详情").no_login().has_footprint()
				.when("referrer").comments("当前用户是荐宝人")
					.got_page("artwork detail for referrer")
				.when("owner").comments("当前用户是卖家")
					.got_page("artwork detail for seller")
				.when("buyer").comments("当前用户是买家")
					.got_page("artwork detail for buyer")
				.when_others().comments("当前用户是普通墨易用户")
					.got_page("artwork detail for common user")
			.request("ink deed list in shop").with_string("shop id").with_string("filter name").with_integer("page no").with_boolean("continue to load")
				.comments("店铺的所有墨契列表")
				.got_page("ink deed list in shop")
					.comments("店铺-我的墨契")
					.may_request("ink deed detail in shop")
					.may_request("ink_deed_transaction_detail")
					.may_request("put ink deed to sale")
					.may_request("buy ink deed")
			.request("ink deed detail in shop").with_string("artwork id")
				.comments("查看未进入流通的墨契持有情况详情")
				.got_page("ink deed detail with artwork")
					.comments("艺术品的墨契详情")
					.may_request("put ink deed to sale")
			.request("ink_deed_transaction_detail").with_string("transaction id")
				.comments("查看墨契交易单详情")
				.got_page("ink_deed_transaction_detail")
					.comments("墨契交易单详情")
					.may_request("buy ink deed")
			.request("order list in shop")
				.comments("店铺的所有艺术品交易列表")
				.got_page("order list in shop")
					.comments("店铺-我的订单")
			/**
			 * 艺术品上架
			 */
			.request("start ownership certificate application").with_string("artwork id")
				.comments("开始进行 确权并生成所有权证书")
				.got_page("ownership certificate application")
					.comments("确权并生成所有权证书 入口")
					.may_request("open ownership certificate application form for owner")
					.may_request("open ownership certificate application form for author")
					.may_request("not a holder for ownership certificate application")
			.request("open ownership certificate application form for owner").with_string("artwork id")
				.comments("持有人打开\"确权并生成所有权证书\"表单")
				.got_page("ownership certificate application for owner")
					.comments("持有人需要填写的 确权并生成所有权证书 表单")
					.may_request("submit ownership certificate application for owner")
			.request("submit ownership certificate application for owner").with_form("ownership certificate application for owner")
				.comments("提交持有人需要填写的 确权并生成所有权证书 表单")
				.got_page("pay ownership certificate fee")
					.comments("支付所有权证书费用")
					.may_request("ownership certificate fee paid")
			.request("ownership certificate fee paid").with_form("ownership certificate payment")
				.comments("确权及生成所有权证书费用完成支付")
				.got_page("artwork sale application")
					.comments("艺术品销售申请")
			.request("open ownership certificate application form for author").with_string("artwork id")
				.comments("作者兼持有人打开\"确权并生成所有权证书\"表单")
				.got_page("ownership certificate application for author")
					.comments("作者兼持有人需要填写的 确权并生成所有权证书 表单")
					.may_request("submit ownership certificate application for author")
			.request("submit ownership certificate application for author").with_form("ownership certificate application for author")
				.comments("提交作者兼持有人需要填写的 确权并生成所有权证书 表单")
				.got_page("artwork sale application").comments("艺术品销售申请")
			.request("not a holder for ownership certificate application").with_string("from").with_string("artwork id")
				.comments("不是持有人（对应：以上都不是）提交上架申请")
				.when("from shop").comments("从推荐页面打开的")
					.got_page("artwork list in shop")
				.when("from artwork detail").comments("从APP页面打开的")
					.got_page("artwork detail in shop")
			.request("put artwork to sale").with_string("artwork id")
				.comments("上架销售艺术品")
				.got_page("artwork sale application")
			.request("submit artwork sale application form").with_form("artwork sale application")
				.comments("提交作品交易信息表单")
				.got_page("artwork put to sale success")
			
			/**
			 * 墨契交易
			 */
			.request("buy ink deed").with_string("ink deed entry order id")
				.comments("购买挂单的墨契")
				.got_page("place ink deed order").comments("墨契购买")
					.may_request("pay ink deed order")
			.request("pay ink deed order")
				.comments("支付墨契订单")
				.got_page("ink deed detail")
			.request("put ink deed to sale")
				.comments("墨契挂单")
				.got_page("put ink deed to sale")
					.may_request("recharge shop deposit")
			.request("recharge shop deposit")
				.comments("待定")
				.got_page("recharge shop deposit")
			.request("shop deposit detail")
				.comments("待定")
				.got_page("shop deposit detail")
			;
		
//			

	@Override
	public BasePageFlowScript getScript() {
		return SCRIPT;
	}

}
