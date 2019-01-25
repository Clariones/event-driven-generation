package cla.edg.project.moyi;

import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.BasePageFlowScript;
import cla.edg.pageflow.PageFlowScript;

public class NativeAppServiceV2 extends BasePageFlowDescriptionScript {

	private static final PageFlowScript SCRIPT = $("native app v2").need_login()
			/**
			 * 店铺入驻
			 */
			.request("start shop authentication")
				.comments("开始店铺入驻实名认证").no_footprint()
				.got_page("shop authentication starting").comments("选择个人还是企业店铺")
					.may_request("open personal certificate info form")
					.may_request("open enterprise certificate info form")
			.request("open personal certificate info form")
				.comments("填写个人店铺认证信息").no_footprint()
				.got_page("personal certificate form").comments("个人店铺认证信息表单")
					.may_request("submit shop certification form")
			.request("open enterprise certificate info form")
				.comments("填写企业店铺认证信息").no_footprint()
				.got_page("enterprise certificate form").comments("企业店铺认证信息表单")
					.may_request("submit shop certification form")
			.request("submit shop certification form").with_form("moyi shop certification").customize()
				.comments("提交店铺认证信息,准备填写店铺基本信息").no_footprint()
				.got_page("shop info form").comments("店铺基本信息表单")
					.may_request("submit shop info form")
			.request("submit shop info form").with_form("moyi_shop")
				.comments("提交店铺基本信息，准备选择保证金等级").no_footprint()
				.got_page("shop deposit selection form").comments("选择店铺保证金表单")
					.may_request("submit shop deposit selection form")
			.request("submit shop deposit selection form").with_form("shop deposit")
				.comments("提交保证金选择结果，准备支付保证金").no_footprint()
				.got_page("pay shop deposit bill").comments("支付店铺保证金")
					.may_request("pay bill or order")
			.request("pay bill or order").with_form("pay method selection")
				.comments("支付订单或账单")
				.got_page("pay result").comments("支付结果")
					.may_request("paid shop deposit bill")
					.may_request("TBD") // 更多支付结果，待处理
			.request("paid shop deposit bill").with_string("payment id")
				.comments("店铺入驻成功").no_footprint()
				.got_page("shop location success").comments("店铺入驻成功")
					.may_request("view my shop")
					
			/**
			 * 艺术品上架
			 */
			.request("start ownership certificate").with_string("artwork id").with_string("from where")
				.comments("开始艺术品确权").no_footprint()
				.got_page("start ownership certificate").comments("选择是作者确权还是持有者确权")
					.may_request("ownership certificate as author")
					.may_request("ownership certificate as owner")
			.request("ownership certificate as author").with_string("artwork id")
				.comments("作者+作品持有人对作品进行确权").no_footprint()
				.got_page("ownership certificate form author").comments("作者+持有者确权信息表单")
					.may_request("submit ownership certificate application")
			.request("ownership certificate as owner").with_string("artwork id")
				.comments("作品持有人(不是作者)对作品进行确权").no_footprint()
				.got_page("ownership certificate form owner").comments("持有者确权信息表单")
					.may_request("submit ownership certificate application")
			.request("submit ownership certificate application").with_form("artwork ownership certificate")
				.comments("提交确权表单").no_footprint()
				.got_page("ownership certificate preview").comments("预览艺术品数字证书，费用")
					.may_request("pay ownership certificate bill")
			.request("pay ownership certificate bill").with_string("certificate id")
				.comments("支付确权服务费").no_footprint()
				.got_page("ownership certificate bill payment").comments("支付艺术品数字证书费用")
					.may_request("paid ownership certificate bill")
			.request("paid ownership certificate bill").with_string("payment id")
				.comments("支付完成，确权成功").no_footprint()
				.got_page("ownership certificate success").comments("数字证书成功")
					.may_request("view artwork product")
					.may_request("put product on sale")
			.request("put product on sale").with_string("artwork id")
				.comments("开始上架作品").no_footprint()
				.got_page("artwork auction application").comments("艺术品上架销售表单")
					.may_request("submit artwork auction application")
			.request("submit artwork auction application").with_form("artwork auction")
				.comments("提交上架信息表单").no_footprint()
				.when("lack of deposit").comments("店铺保证金不足")
					.got_page("recharge shop deposit").comments("店铺保证金充值")
						.may_request("pay bill or order")
				.when_others().comments("正常流程")
					.got_page("artwork auction detail").comments("艺术品拍卖详情")
						
			
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
			.request("resale ink deed").with_string("auction id")
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
			 * 个人的墨契查看
			 */
//			.request("view my ink deed").with_string("filter")
//				.comments("查看‘我的墨契’")
//				.got_page("my ink deed")
//					.may_request("next page of my ink deed")
//					.may_request("view my ink deed")
//					.may_request("resale ink deed")
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
			.request("TBD")		// 店铺查看部分还没有弄
				.comments("TBD").has_footprint()
				.got_page("TBD")
			.request("view my shop").with_string("filter")
				.comments("查看我的店铺")
				.got_page("my shop")
					.may_request("TBD")
			.request("view artwork product").with_string("artwork id")
				.comments("TBD").has_footprint().no_login()
				.got_page("TBD")
			.in_page("TBD")
			;
		
//			

	@Override
	public PageFlowScript getScript() {
		return SCRIPT;
	}

}
