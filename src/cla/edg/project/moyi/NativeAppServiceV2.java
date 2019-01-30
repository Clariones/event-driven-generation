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
				.comments("提交店铺认证信息,准备支付店铺保证金").no_footprint()
				.got_page("shop info form").comments("店铺基本信息表单")
					.may_request("submit shop info form")
			.request("submit shop info form").with_form("moyi_shop")
				.comments("提交店铺基本信息，准备支付店铺保证金").no_footprint()
				.got_page("pay shop deposit bill").comments("支付店铺保证金")
					.may_request("pay bill or order")
			
			.request("paid shop deposit bill").with_string("payment id")
				.comments("店铺入驻成功").no_footprint()
				.got_page("shop location success").comments("店铺入驻成功")
					.may_request("view my shop")
					
			/**
			 * 艺术品确权 
			 */
			.request("start ownership certificate").with_string("artwork id").with_string("from where")
				.comments("开始艺术品确权").no_footprint()
				.got_page("choose role of holder for ownership certificate").comments("选择确权者身份")
					.may_request("ownership certificate as author")
					.may_request("ownership certificate as owner")
			.request("ownership certificate as author").with_string("artwork id")
				.comments("作者+作品持有人对作品进行确权").no_footprint()
				.got_page("ownership certificate form for author").comments("作者+持有者确权信息表单")
					.may_request("submit ownership certificate application")
			.request("ownership certificate as owner").with_string("artwork id")
				.comments("作品持有人(不是作者)对作品进行确权").no_footprint()
				.got_page("ownership certificate form for owner").comments("持有者确权信息表单")
					.may_request("submit ownership certificate application")
			.request("submit ownership certificate application").with_form("artwork ownership certificate")
				.comments("提交确权表单").no_footprint()
				.when("no shop deposit charged").comments("没交过店铺保证金")
				.got_page("ownership certificate preview").comments("预览艺术品数字证书，费用")
					.may_request("pay ownership certificate bill")
			.request("pay ownership certificate bill").with_string("certificate id")
				.comments("支付确权服务费").no_footprint()
				.got_page("ownership certificate bill payment").comments("支付艺术品数字证书费用")
					.may_request("paid ownership certificate bill")
			.request("paid ownership certificate bill").with_string("payment id")
				.comments("支付完成，确权成功").no_footprint()
				.got_page("ownership certificate success").comments("数字证书成功")
					.may_request("view my shop")
					.may_request("put product on sale")
					
			/**
			 * 艺术品上架
			 */
			.request("put product on sale").with_string("artwork id")
				.comments("开始上架作品").no_footprint()
				.got_page("artwork auction application").comments("艺术品上架销售表单")
					.may_request("submit artwork auction application")
			.request("submit artwork auction application").with_form("artwork auction")
				.comments("提交上架信息表单").no_footprint()
				.when("no shop deposit").comments("没有店铺保证金")
					.got_page("pay shop deploist when AOC").comments("确权中触发的首次缴付店铺保证金")
						.may_request("pay bill or order")
				.when("lack of deposit").comments("店铺保证金不足")
					.got_page("recharge shop deposit").comments("确权中触发的店铺保证金充值")
						.may_request("pay bill or order")
				.when_others().comments("正常流程")
					.got_page("artwork auction detail").comments("艺术品拍卖详情")
					
						
			/**
			 * 支付页面。带各种回跳，处理混合支付
			 */
			.request("pay bill or order").with_form("payment detail")
				.comments("支付订单或账单")
				.when("need pay by ditital asset").comments("需要使用数字资产支付（墨贝，余额）")
					.got_page("confirm ditital asset pay").comments("短信验证数字资产（墨贝，余额）支付")
						.may_request("confirm ditial asset payment")
				.when("all by cash").comments("所有支付都使用现金支付")
					.got_page("ext payment").comments("外部支付集成")
						.may_request("paid success")
			.request("confirm ditial asset payment").with_form("confirm digital asset payment")
				.comments("确认数字资产支付")
				.when("need cash pay").comments("还需要现金支付其他部分")
					.got_page("pay by cash")
				.when("all done").comments("全部支付完成")
					.got_page("paid success")
			.request("pay by cash").with_string("payment id").with_string("scene code").with_string("object type").with_string("object id")
				.comments("使用现金支付")
				.got_page("ext payment")
			.request("paid success").with_string("payment id").with_string("scene code").with_string("object type").with_string("object id")
				.comments("支付成功")
				.got_page("paid success").comments("支付成功")
					.may_request("paid ownership certificate bill")
					.may_request("ink deed entry order fee paid")
					.may_request("paid shop deposit bill")
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
				.got_page("TBD").comments("待定")
				
			.request("view my shop").with_string("filter")
				.comments("查看我的店铺")
				.got_page("my shop").comments("店主的店铺管理")
					
			.request("view artwork product").with_string("artwork id")
				.comments("查看艺术品拍卖").has_footprint().no_login()
				.got_page("artwork auction detail").comments("艺术品拍卖详情")
			.in_page("TBD")
			;
		
//			

	@Override
	public PageFlowScript getScript() {
		return SCRIPT;
	}

}
