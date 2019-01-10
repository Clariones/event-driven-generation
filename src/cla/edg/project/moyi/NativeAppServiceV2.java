package cla.edg.project.moyi;

import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.BasePageFlowScript;
import cla.edg.pageflow.PageFlowScript;

public class NativeAppServiceV2 extends BasePageFlowDescriptionScript {

	private static final PageFlowScript SCRIPT = $("NativeAppServiceV2").need_login()
			/**
			 * 店铺入驻
			 */
			.request("open shop locating application")
				.comments("打开店铺入驻申请页面").no_footprint()
				.got_page("shop locating application")
					.comments("店铺入驻申请表单")
					.may_request("submit shop locating application form")
			.request("submit shop locating application form").with_form("shop locating application")
				.comments("提交入驻基本信息form")
				.got_page("shop deposit selection")
					.comments("选择店铺保证金等级表单")
					.may_request("submit shop deposit selection form")
			.request("submit shop deposit selection form").with_form("deposit selection")
				.comments("提交保证金档次选择结果")
				.got_page("pay shop deposite order")
					.comments("选择店铺保证金等级表单")
					.may_request("shop deposit paid")
			.request("shop deposit paid").with_form("shop deposit payment")
				.comments("完成店铺保证金的支付")
				.got_page("shop locating success")
					.comments("店铺入驻成功")
					.may_request("my shop")
			/**
			 * 店铺
			 */
			.request("my shop")
				.comments("查看我的店铺")
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
					.may_request("open ownership certificate application form")
					.may_request("put artwork to sale")
			.request("artwork detail in shop").with_string("artwork id")
				.comments("查看艺术品商品的详情")
				.when("referee").comments("当前用户是荐宝人")
					.got_page("artwork detail for referee")
				.when("owner").comments("当前用户是卖家")
					.got_page("artwork detail for seller")
				.when("buyer").comments("当前用户是买家")
					.got_page("artwork detail for buyer")
				.when_others()
					.got_page("artwork detail for common user")
			.request("ink deed list in shop").with_string("shop id").with_string("filter name").with_integer("page no").with_boolean("continue to load")
				.comments("店铺的墨契")
				.got_page("ink deed list in shop")
					.comments("店铺-我的墨契")
					.may_request("ink deed detail in shop")
					.may_request("ink deed transaction detail")
					.may_request("put ink deed to sale")
					.may_request("buy ink deed")
			.request("ink deed detail in shop").with_string("artwork id")
				.comments("查看未进入流通的墨契持有情况详情")
				.got_page("ink deed detail with artwork")
					.comments("艺术品的墨契详情")
					.may_request("put ink deed to sale")
			.request("ink deed transaction detail").with_string("transaction id")
				.comments("查看墨契交易单详情")
				.got_page("ink deed transaction detail")
					.comments("墨契交易单详情")
					.may_request("buy ink deed")
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
			.request("not a holder").with_string("artwork id")
				.comments("不是持有人（对应：以上都不是）")
				.when("from shop")
					.got_page("artwork list in shop")
				.when("from artwork detail")
					.got_page("artwork detail in shop")
			.request("put artwork to sale").with_string("artwork id")
				.comments("上架销售艺术品")
				.got_page("artwork sale application")
			.request("submit artwork sale application form").with_form("artwork sale application")
				.comments("提交作品交易信息表单")
				.got_page("artwork put to sale success")
			
				
			
			
			;
		
//			

	@Override
	public PageFlowScript getScript() {
		return SCRIPT;
	}

}
