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
			
			
				
			/**
			 * 发行墨契
			 */
			.request("put ink deed to sale").with_string("artwork auction id")
				.comments("去发行墨契").no_footprint()
				.when("usufruct ratio not set").comments("没有设置过作品的墨契收益权总比例")
					.got_page("initialize ink deed")
						.may_request("initialize ink deed")
				.when_others().comments("可以发行墨契")
					.got_page("publish ink deed")
			.request("initialize ink deed").with_string("artwork auction id").with_float("usufruct ratio")
				.comments("设置作品本次拍卖的墨契对应的收益权比率").no_footprint()
				.got_page("publish ink deed")
					.may_request("create ink deed initial order")
			.request("create ink deed initial order").with_string("artwork auction id").with_integer("number")
				.comments("将一定份数的墨契原始股挂单，准备销售").no_footprint()
				.got_page("confirm ink deed entry order")
					.may_request("cancel ink deed entry order")
					.may_request("confirm ink deed entry order")
			.request("cancel ink deed entry order").with_string("ink deed entry order id")
				.comments("取消墨契挂单").no_footprint()
				.go_back_previous_page()
			.request("confirm ink deed entry order").with_string("ink deed entry order id")
				.comments("确认墨契挂单").no_footprint()
				.when("IB not enough")
					.got_page("recharge IB")
				.when("deposit is not enough")
					.got_page("recharge shop deposit")
				.when_others()
					.got_page("review ink deed entry order")
						.may_request("pay ink deed fee by IB")
			.request("pay ink deed fee by IB").with_string("ink deed entry order id")
				.comments("支付墨契发行费用")
				.got_page("pay ink deed fee by IB")  // 支付相关的目前直接链接‘支付成功’
					.may_request("ink deed entry order fee paid")
			.request("ink deed entry order fee paid").with_string("payment id")
				.comments("墨契发行的所有费用缴清，发行成功").no_footprint()
				.got_page("ink deed list for artwork")
			
			/**
			 * 查看和购买墨契
			 */
			.request("view all ink deed trade")
				.comments("查看所有的墨契交易，按作品聚合").no_login()
				.got_page("all ink deed trade")
					.may_request("view ink deed entry order with artwork")
					.may_request("next page of all ink deed trade")
			.request("next page of all ink deed trade").with_string("last auction id").with_boolean("continue to load")
				.comments("翻页：查看所有的墨契交易，按作品聚合").no_login()
				.got_page("all ink deed trade")
			.request("view ink deed entry order with artwork").with_string("artwork auction id")
				.comments("查看某场拍卖相关的在售墨契列表").no_login()
				.got_page("ink deed in sale for artwork")
					.may_request("ink deed entry order detail")
			.request("next page of ink deed entry order with artwork").with_string("artwork auction id").with_string("last entry order id").with_boolean("continue to load")
				.comments("翻页：查看某场拍卖相关的在售墨契列表").no_login()
				.got_page("ink deed in sale for artwork")
			.request("ink deed entry order detail").with_string("ink deed entry order id")
				.comments("查看某条墨契挂单的详情").no_login()
				.got_page("ink deed entry order detail")
					.may_request("ink deed entry order detail")  // 可以在同一个作品的墨契单之间跳来跳去
					.may_request("resale ink deed")
					.may_request("more ink deed holding record")
					.may_request("view ink deed entry order with artwork")
			.request("more ink deed holding record").with_string("ink deed entry order id")
				.comments("查看全部墨契持有情况")
				.got_page("ink deed holding list")
			.request("resale ink deed").with_string("ink deed entry order id")
				.comments("转售墨契")
				.got_page("resale ink deed form")
					.may_request("submit resale ink deed form")
			.request("submit resale ink deed form").with_form("resale ink deed")
				.comments("提交墨契转售请求，墨契挂单")
				.got_page("ink deed list for artwork")
					
			.request("view ink deed list for artwork").with_string("artwork auction id")
				.comments("查看艺术品下的所有墨契列表").no_login()
				.got_page("ink deed list for artwork")
					.may_request("next page ink deed list for artwork")	//翻页
					.may_request("put ink deed to sale") // 新发、增发墨契。 只有店主才有这个
					.may_request("resale ink deed") // 转售持有的墨契
					.may_request("buy ink deed")	// 买入挂单的墨契
			.request("next page ink deed list for artwork").with_string("artwork auction id").with_string("filter").with_integer("page no").with_boolean("continue to load")
				.comments("翻页:查看艺术品下的所有墨契列表")
				.got_page("ink deed list for artwork")
			.request("buy ink deed").with_string("ink deed entry order id")
				.comments("购买墨契")
				.got_page("pay ink deed entry order")
					.may_request("ink deed entry order paid")
			.request("ink deed entry order paid")
				.comments("墨契交易支付完成")
				.got_page("ink deed entry order detail")
						
			/**
			 * 各种充值
			 */
			.request("recharge IB").with_string("user id").with_float("minimum recommended value").with_string("call back url")
				.comments("充值墨贝").no_footprint()
				.got_page("recharge IB")
					.may_request("TBD")
			.request("recharge shop deposit").with_string("shop id").with_float("minimum recommended value").with_string("call back url")
				.comments("增加店铺保证金").no_footprint()
				.got_page("recharge shop deposit")
					.may_request("TBD")
			/**
			 * 各种临时声明
			 */
			.request("view my shop")		// 店铺查看部分还没有弄
				.comments("查看我的店铺").has_footprint()
				.got_page("my shop")
			.request("TBD")		// 店铺查看部分还没有弄
				.comments("TBD").has_footprint()
				.got_page("TBD")
			;
		
//			

	@Override
	public PageFlowScript getScript() {
		return SCRIPT;
	}

}
