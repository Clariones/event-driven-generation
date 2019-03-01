package cla.edg.project.moyi;

import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.BasePageFlowScript;

public class NativeAppServiceV2 extends BasePageFlowDescriptionScript {

	private static final BasePageFlowScript SCRIPT = $("native app v2").need_login()
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
				.comments("提交店铺认证信息,准备填写店铺信息").no_footprint()
				.got_page("shop info form").comments("店铺基本信息表单")
					.may_request("submit shop info form")
			.request("submit shop info form").with_form("moyi_shop")
				.comments("提交店铺基本信息，准备支付店铺保证金").no_footprint()
				.got_page("pay shop deposit bill").comments("支付店铺保证金")
					.may_request("pay bill or order")
//					.may_request("repricing shop deposit bill")
			
//			.request("repricing shop deposit bill").with_string("scene code").with_string("order id").with_boolean("use ib balance").with_boolean("use cash balance").with_float("amount")
//				.comments("根据用户的支付选项，计算订单的支付金额")
//				.got_page("pay shop deposit bill")
//				
//			.request("paid shop deposit bill").with_string("payment id")
//				.comments("店铺入驻提交成功").no_footprint()
//				.got_page("shop location success").comments("店铺入驻成功")
//					.may_request("view my shop")
					
			/**
			 * 艺术品确权 
			 */
			.request("start ownership certificate").with_string("artwork id").with_string("from where")
				.comments("确权并生成数字证书").no_footprint()
				.got_page("choose role of holder for ownership certificate").comments("确权并生成数字证书")
					.may_request("ownership certificate as author")
					.may_request("ownership certificate as owner")
			.request("ownership certificate as author").with_string("artwork id")
				.comments("我是作品持有人+我是作者").no_footprint()
				.got_page("ownership certificate form for author").comments("我是作品持有人+我是作者")
					.may_request("submit ownership certificate application")
			.request("ownership certificate as owner").with_string("artwork id")
				.comments("我是作品持有人+不是作者").no_footprint()
				.got_page("ownership certificate form for owner").comments("我是作品持有人+不是作者")
					.may_request("submit ownership certificate application")
			.request("submit ownership certificate application").with_form("artwork ownership certificate").customize()
				.comments("提交确权表单").no_footprint()
				.when_others()
					.got_page("preview ownership certificate").comments("预览所有权证书(待支付)")
						.may_request("pay bill or order")
					
			/**
			 * 艺术品上架
			 */
			.request("put product on sale").with_string("artwork id")
				.comments("开始上架作品").no_footprint()
				.got_page("artwork auction application").comments("艺术品上架销售表单")
					.may_request("submit artwork auction application")
			.request("submit artwork auction application").with_form("artwork auction").customize()
				.comments("提交上架信息表单").no_footprint()
				.when("lack of deposit").comments("保证金不足以支持该商品的起拍价")
					.got_page("adjust price or recharge deposit pop up").comments("选择‘调价’还是‘补保’的弹出页面")
						.may_request("pay artwork auction with deposit")
				.when_others().comments("保证金足够")
					.got_page("paid success")
			.request("pay artwork auction with deposit").with_string("artwork auction id")
				.comments("保证金不足的情况下，选择补足保证金并上架商品")
				.when("lack of deposit").comments("保证金确实不足")
					.got_page("ext payment").comments("支付商品上架销售费用")
				.when_others().comments("保证金通过其他渠道补足了，或者不需要验证了")
					.got_page("paid success")
						
			
			/**
			 * 查看拍卖
			 */
			.request("view trading zone").with_string("filter")
				.comments("查看交易区").has_footprint().no_login()
				.got_page("view trading list").comments("按分类以及/或者状态过滤的交易列表")
					.may_request("view trading zone").comments("点击tab时切换页面")
					.may_request("view trading list by type").comments("点击类别button时查看列表")
					.may_request("view next page trading list").comments("翻页")
					.may_request("view artwork product").comments("点击单个作品时去详情页")
			.request("view next page trading list").with_string("filter").with_string("artwork type id").with_string("artwork auction id")
				.comments("查看交易区 的翻页请求").no_login()
				.got_page("view trading list")
			.request("view trading list by type").with_string("filter").with_string("artwork type id")
				.comments("按照艺术品类型查看拍卖列表").has_footprint().no_login()
				.got_page("view trading list")
					
			/**
			 * 商家中台
			 * 大部分都没定
			 */
			.request("view my shop").with_string("filter")
				.comments("查看我的店铺")
				.got_page("my shop").comments("店主的店铺管理")
				
			.request("view auction list as seller").with_string("filter")
				.comments("卖家：我的拍品列表")
				.query("artwork_auction").which("mine filtered").pagination().with_string("user id").with_string("filter")
					.comments("按照filter来查询拍卖的列表")
					.rule_comments("公示中 和 竞拍中 直接搜索拍卖数据")
					.rule_comments("已截拍 和 已流拍 是搜索历史记录Log，然后拼出来的拍卖数据")
				.query("artwork_auction").which("mine filtered opening").pagination().with_string("user id").with_string("filter")
					.comments("按照filter来查询当前开放的拍卖的列表")
					.rule_comments("公示中")
					.rule_comments("竞拍中")
				.query("artwork_auction_record").which("mine filtered passed").pagination().with_string("user id").with_string("filter")
					.comments("按照filter来查询过去的拍卖的记录列表")
					.rule_comments("已截拍")
					.rule_comments("已流拍")
				.got_page("auction list")
					.may_request("view next page auction list as seller")
			.request("view next page auction list as seller").with_string("filter").with_string("last record id")
				.comments("卖家：我的拍品列表 翻页")
				.got_page("auction list")
				
			.request("view artwork need certificate list")
				.comments("查看待确权艺术品列表").need_login().has_footprint()
				.query("artwork").which("need certification").pagination().with_string("owner id")
					.comments("查找需要确权的艺术品列表")
				.got_page("artwork need certificate").comments("待确权的艺术品列表")
					.may_request("put product on sale")
			/**
			 * 拍卖订单 
			 * list页面，卖家和买家是不同的入口
			 */
			.request("view auction order list as buyer").with_string("filter")
				.comments("买家查看自己的（艺术品拍卖）订单列表").has_footprint()
				.got_page("auction order list").comments("买家（艺术品拍卖）订单列表")
					.may_request("view next page auction order list as buyer")
					.may_request("view auction order detail")
			.request("view auction order list as seller").with_string("filter")
				.comments("卖家查看自己的（艺术品拍卖）订单列表").has_footprint()
				.query("artwork_auction_order").which("mine filtered").pagination().with_string("buyer id").with_string("filter")
					.comments("根据filter的代码，查找卖家的订单列表")
					.rule_comments("待付款,还包括了付款中")
					.rule_comments("待发货")
					.rule_comments("待收货")
					.rule_comments("已完成")
					.rule_comments("已取消，包括卖家违约和买家违约")
					.rule_comments("售后中")
				.got_page("auction order list").comments("买家（艺术品拍卖）订单列表")
					.may_request("view next page auction order list as seller")
					.may_request("view auction order detail")
			.request("view next page auction order list as buyer").with_string("filter").with_string("last record id")
				.comments("买家查看自己的（艺术品拍卖）订单列表的翻页").no_footprint()
				.got_page("auction order list")
			.request("view next page auction order list as seller").with_string("filter").with_string("last record id")
				.comments("卖家查看自己的（艺术品拍卖）订单列表的翻页").no_footprint()
				.got_page("auction order list")
			.request("view auction order detail").with_string("order id")
				.comments("查看艺术品拍卖订单详情").has_footprint()
					.got_page("auction order detail").comments("订单详情页")
						.may_request("confirm auction order received")
						.may_request("complain auction order")
						.may_request("submit auction order address form")
						.may_request("submit auction order shipping form")
			.request("submit auction order address form").with_form("receiver address info")
				.comments("买家提交订单的收货人信息表单，然后去付款").no_footprint()
					.got_page("ext payment")
			.request("submit auction order shipping form").with_form("shipping info")
				.comments("卖家发货后提交订单的物流信息，然后买家等待收货").no_footprint()
				.got_page("auction order detail")
			.request("confirm auction order received").with_string("order id")
				.comments("买家确认收货").no_footprint()
				.got_page("auction order detail")
			.request("complain auction order").with_string("order id")
				.comments("买家申请售后。只能在确认收货前申请。").no_footprint()
				.got_page("need fill complain info").comments("填写投诉信息表")
					.may_request("submit auction order complain form")
			.request("submit auction order complain form").with_form("artwork auction complaint")
				.comments("买家提交申请售后表单")
				.got_page("auction order detail")
			
			/**
			 * 发行墨契
			 */
//			.request("put ink deed to sale").with_string("artwork auction id")
//				.comments("去发行墨契").no_footprint()
//				.when("usufruct ratio not set").comments("没有设置过作品的墨契收益权总比例")
//					.got_page("initialize ink deed")
//						.may_request("initialize ink deed")
//				.when_others().comments("可以发行墨契")
//					.got_page("publish ink deed")
//			.request("initialize ink deed").with_string("artwork auction id").with_float("usufruct ratio")
//				.comments("设置作品本次拍卖的墨契对应的收益权比率").no_footprint()
//				.got_page("publish ink deed")
//					.may_request("create ink deed initial order")
//			.request("create ink deed initial order").with_string("artwork auction id").with_integer("number")
//				.comments("将一定份数的墨契原始股挂单，准备销售").no_footprint()
//				.got_page("confirm ink deed entry order")
//					.may_request("cancel ink deed entry order")
//					.may_request("confirm ink deed entry order")
//			.request("cancel ink deed entry order").with_string("ink deed entry order id")
//				.comments("取消墨契挂单").no_footprint()
//				.go_back_previous_page()
//			.request("confirm ink deed entry order").with_string("ink deed entry order id")
//				.comments("确认墨契挂单").no_footprint()
//				.when("IB not enough")
//					.got_page("recharge IB")
//				.when("deposit is not enough")
//					.got_page("recharge shop deposit")
//				.when_others()
//					.got_page("review ink deed entry order")
//						.may_request("pay ink deed fee by IB")
//			.request("pay ink deed fee by IB").with_string("ink deed entry order id")
//				.comments("支付墨契发行费用")
//				.got_page("pay ink deed fee by IB")  // 支付相关的目前直接链接‘支付成功’
//					.may_request("ink deed entry order fee paid")
//			.request("ink deed entry order fee paid").with_string("payment id")
//				.comments("墨契发行的所有费用缴清，发行成功").no_footprint()
//				.got_page("ink deed list for artwork")
			
			/**
			 * 查看和购买墨契
			 */
//			.request("view all ink deed trade")
//				.comments("查看所有的墨契交易，按作品聚合").no_login()
//				.got_page("all ink deed trade")
//					.may_request("view ink deed entry order with artwork")
//					.may_request("next page of all ink deed trade")
//			.request("next page of all ink deed trade").with_string("last record id").with_boolean("continue to load")
//				.comments("翻页：查看所有的墨契交易，按作品聚合").no_login()
//				.got_page("all ink deed trade")
//			.request("view ink deed entry order with artwork").with_string("artwork auction id")
//				.comments("查看某场拍卖相关的在售墨契列表").no_login()
//				.got_page("ink deed in sale for artwork")
//					.may_request("ink deed entry order detail")
//			.request("next page of ink deed entry order with artwork").with_string("artwork auction id").with_string("last entry order id").with_boolean("continue to load")
//				.comments("翻页：查看某场拍卖相关的在售墨契列表").no_login()
//				.got_page("ink deed in sale for artwork")
//			.request("ink deed entry order detail").with_string("ink deed entry order id")
//				.comments("查看某条墨契挂单的详情").no_login()
//				.got_page("ink deed entry order detail")
//					.may_request("ink deed entry order detail")  // 可以在同一个作品的墨契单之间跳来跳去
//					.may_request("resale ink deed")
//					.may_request("more ink deed holding record")
//					.may_request("view ink deed entry order with artwork")
//			.request("more ink deed holding record").with_string("ink deed entry order id")
//				.comments("查看全部墨契持有情况")
//				.got_page("ink deed holding list")
//			.request("resale ink deed").with_string("artwork auction id")
//				.comments("转售墨契")
//				.got_page("resale ink deed form")
//					.may_request("submit resale ink deed form")
//			.request("submit resale ink deed form").with_form("resale ink deed")
//				.comments("提交墨契转售请求，墨契挂单")
//				.got_page("ink deed list for artwork")
//					
//			.request("view ink deed list for artwork").with_string("artwork auction id")
//				.comments("查看艺术品下的所有墨契列表").no_login()
//				.got_page("ink deed list for artwork")
//					.may_request("next page ink deed list for artwork")	//翻页
//					.may_request("put ink deed to sale") // 新发、增发墨契。 只有店主才有这个
//					.may_request("resale ink deed") // 转售持有的墨契
//					.may_request("buy ink deed")	// 买入挂单的墨契
//			.request("next page ink deed list for artwork").with_string("artwork auction id").with_string("filter").with_integer("page no").with_boolean("continue to load")
//				.comments("翻页:查看艺术品下的所有墨契列表")
//				.got_page("ink deed list for artwork")
//			.request("buy ink deed").with_string("ink deed entry order id")
//				.comments("购买墨契")
//				.got_page("pay ink deed entry order")
//					.may_request("ink deed entry order paid")
//			.request("ink deed entry order paid")
//				.comments("墨契交易支付完成")
//				.got_page("ink deed entry order detail")
				
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
//			.request("recharge IB").with_string("user id").with_float("minimum recommended value").with_string("call back url")
//				.comments("充值墨贝").no_footprint()
//				.got_page("recharge IB")
//					.may_request("TBD")
//			.request("recharge shop deposit").with_string("shop id").with_float("minimum recommended value").with_string("call back url")
//				.comments("增加店铺保证金").no_footprint()
//				.got_page("recharge shop deposit")
//					.may_request("TBD")
			/**
			 * 浏览
			 */
			.request("view store detail").with_string("shop id")
				.comments("游客浏览店铺").has_footprint().no_login()
				.got_page("store detail").comments("游客看到的店铺详情")
			.request("view artwork product").with_string("artwork auction id")
				.comments("查看艺术品拍卖详情").has_footprint().no_login()
				.query("artwork_auction").which("recommend for viewing auction").no_pagination().with_string("artwork auction id")
					.comments("为当前浏览的拍卖品搜索几个推荐的拍卖")
				.got_page("artwork auction detail").comments("艺术品拍卖详情")
					.may_request("partial refresh artwork auction")
					.may_request("bidding artwork auction")
					.may_request("view bidding history")
					.may_request("view auction recommendation")
			.request("partial refresh artwork auction").with_string("artwork auction id")
				.comments("刷新艺术品拍卖的部分信息").no_footprint().no_login()
				.got_page("artwork auction refresh result").comments("艺术品拍卖的刷新结果")
			.request("bidding artwork auction").with_string("artwork auction id").with_float("amount").variable()
				.comments("在艺术品拍卖中，出价一次。需要先调用查询接口，获得当前价格以及验证码").no_footprint()
				.when("lack of deposit").comments("预约这保证金不足")
//					.got_page("pay bidding deposit").comments("去支付保证金")
//						.may_request("pay bill or order")
					.got_page("ext payment")
				.when_others()
					.got_page("artwork auction refresh result")
			.request("view bidding history").with_string("artwork auction id")
				.comments("查看竞价记录").no_footprint().no_login()
				.got_page("artwork auciton bidding history")
			.request("view next page bidding history").with_string("artwork auction id").with_string("object id")
				.comments("查看竞价记录 翻页请求").no_footprint().no_login()
				.got_page("artwork auciton bidding history")
			.request("view auction recommendation").with_string("artwork auction id")
				.comments("根据当前竞拍，推荐最多8个相关商品").no_footprint().no_login()
				.got_page("artwork auction recommendation").comments("推荐的商品")
			.request("book artwork auction").with_string("artwork auction id")
				.comments("预约拍卖提醒").no_footprint().need_login()
//				.when("lack of deposit").comments("预约这保证金不足")
//					.got_page("pay bidding deposit").comments("去支付保证金")
//						.may_request("pay bill or order")
//				.when_others()
					.got_page("artwork auction detail")
			
			/**
			 * 支付页面。带各种回跳，处理混合支付
			 */
			.request("pay bill or order").with_form("payment detail")
				.comments("去支付订单或账单")
				.when("need cash pay").comments("还需要现金支付其他部分")
					.got_page("ext payment")
						.may_request("pay by balance")
						.may_request("pay by wechat")
						.may_request("pay by alipay")
				.when("all done").comments("全部支付完成")
					.got_page("paid success")
			.request("pay by balance").with_string("payment id").with_string("scene code").with_string("object type").with_string("object id").with_string("verify code").variable()
				.comments("使用余额支付。将接跳转到成功页面")
				.got_page("paid success")
			.request("pay by wechat").with_string("payment id").with_string("scene code").with_string("object type").with_string("object id")
				.comments("使用微信支付。返回微信支付信息")
				.got_page("wechat payment info")
					.may_request("wechat paid success")
			.request("wechat paid success").with_string("payment id").with_string("scene code").with_string("object type").with_string("object id")
				.comments("微信支付成功回调。将跳转到成功页面")
				.got_page("paid success")
			.request("pay by alipay").with_string("payment id").with_string("scene code").with_string("object type").with_string("object id")
				.comments("支付宝支付入口。暂时只是返回异常")
				.got_page("alipay payment info")
//			.request("pay success callback").with_string("payment id").with_string("scene code").with_string("object type").with_string("object id")
//				.comments("支付成功")
//				.got_page("paid success")
			.in_page("paid success").comments("支付成功")
				.may_request("put product on sale")
//				.may_request("ink deed entry order fee paid")
//				.may_request("paid shop deposit bill")
				
			/**
			 * 其他杂项
			 */
			.request("import contact book").with_form("import contact book")
				.comments("导入通讯录")
				.got_page("contact book import result").comments("导入结果")
			/**
			 * 各种临时声明
			 */
			;
		
//			

	@Override
	public BasePageFlowScript getScript() {
		return SCRIPT;
	}

}
