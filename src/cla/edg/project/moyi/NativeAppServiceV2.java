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
					.may_request("view shop deposit")
			.request("view shop deposit")
				.comments("管理店铺保证金")
				.got_page("shop deposit").comments("店铺保证金管理")
					.may_request("view shop deposit record list")
					.may_request("recharge shop deposit")
			.request("recharge shop deposit")
				.comments("店铺保证金充值")
				.got_page("pay shop deposit bill")
			.request("view shop deposit record list")
				.comments("店铺保证金明细列表")
				.query("moyi_shop_deposit_record").which("my shop").pagination().with_string("shop id")
					.comments("查询我的店铺的保证金明细")
				.got_page("shop deposit record list")
					.may_request("view next page shop deposit record list")
			.request("view next page shop deposit record list").with_string("last record id")
				.comments("店铺保证金明细列表 翻页")
				.got_page("shop deposit record list")
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
				.query("artwork").which("can put on sale").pagination().with_string("owner id")
					.comments("查找可售的艺术品列表")
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
			.request("start issue ink deed").with_string("artwork auction id")
				.comments("艺术品卖家发行墨契").no_footprint()
				.when("first time to issue").comments("首次发行墨契")
					.got_page("ink deed issue").comments("发行墨契")
						.may_request("to set ink deed share number")
				.when("further issue").comments("增发墨契")
					.got_page("ink deed share number setting")
			.request("to set ink deed usufruct ratio").with_string("artwork auction id").with_boolean("agreed").variable()
				.comments("设置墨契收益权比例").no_footprint()
				.got_page("ink deed usufruct ratio setting").comments("设置墨契收益权比例")
					.may_request("to set ink deed share number")
			.request("to set ink deed share number").with_string("artwork auction id").with_float("usufruct ratio").variable()
				.comments("填写了收益权比例后，去设置墨契发行份额").no_footprint()
					.got_page("ink deed share number setting").comments("设置墨契发行份额")
						.may_request("submit ink deed issue")
			.request("submit ink deed issue").with_string("artwork auction id").with_float("usufruct ratio").with_integer("number").variable()
				.comments("填写了本次墨契发行份额后，提交整个墨契发行申请，准备缴费")
					.got_page("pay ink deed issue fee").comments("墨契发行费用支付页面")
						.may_request("pay bill or order")
			/**
			 * 购买墨契
			 */
			.request("preview of buy ink deed order").with_string("order id")
				.comments("预览要购买的墨契的信息")
				.got_page("buy ink deed preview")
					.may_request("buy ink deed entry order")
			.request("buy ink deed entry order").with_string("order id")
				.comments("购买墨契")
				.got_page("ext payment")
			.request("modify ink deed order price").with_string("order id").with_float("amount").variable()
				.comments("修改墨契订单总价")
				.got_page("ink deed order detail")
			.request("pay ink deed order").with_string("order id")
				.comments("从墨契订单列表/详情进入支付页面.")
				.got_page("ext payment")
			.request("cancel ink deed order").with_string("order id")
				.comments("买家取消购买墨契的订单")
				.got_page("simple popup").comments("只包含一个popup的页面")
					.may_request("do cancel ink deed order")
			.request("do cancel ink deed order").with_string("order id").with_string("verify code")
				.comments("买家确认取消墨契购买订单")
				.got_page("ink deed order list")
			
			/**
			 * 墨契订单列表
			 */
			.request("view my ink deed order list").with_string("filter")
				.comments("查看墨契订单列表")
				.query("ink_deed_order").which("my filtered by filter").with_string("user id").with_string("filter").pagination()
					.comments("根据订单状态，查看不同的墨契交易订单列表")
				.got_page("ink deed order list").comments("墨契订单列表")
					.may_request("view ink deed order detail")
					.may_request("view my next page ink deed order list")
					.may_request("view auction related ink deed entry order list")
			.request("view my next page ink deed order list").with_string("filter").with_string("last record id")
				.comments("查看墨契订单列表 翻页")
				.got_page("ink deed order list")
			.request("view ink deed order detail").with_string("order id")
				.comments("查看墨契订单详情")
				.got_page("ink deed order detail").comments("墨契交易订单详情")
					.may_request("pay ink deed order")
					.may_request("cancel ink deed order")
					.may_request("modify ink deed order price")
			
			/**
			 * 查看我的墨契
			 */
			.request("view my ink deed list").with_string("filter")
				.comments("墨契卖家（持有者）查看我的墨契列表").need_login().has_footprint()
				.query("ink_deed_holding_statistic").which("my holding").pagination().with_string("user id")
					.comments("查询我的可售墨契列表。可售状态")
				.query("ink_deed_entry_order").which("my in selling").pagination().with_string("user id")
					.comments("查询我的在售墨契挂单列表。")
				.query("ink_deed_cash_record").which("my cashed").pagination().with_string("user id")
					.comments("查询我的已兑付墨契列表")
				.query("ink_deed_holding_statistic").which("my wait to cash").pagination().with_string("user id")
					.comments("查询我的待兑付墨契列表")
				.got_page("my ink deed list").comments("根据不同状态，显示相应的墨契列表")
					.may_request("view my next page ink deed list")
					.may_request("view my ink deed info")
					.may_request("view ink deed entry order detail")
			.request("view my next page ink deed list").with_string("filter").with_string("last record id")
				.comments("查看我的墨契列表 翻页").no_footprint()
				.got_page("my ink deed list")
			.request("view my ink deed info").with_string("artwork auction id")
				.comments("以艺术品拍卖为基础,查看相关的墨契详情").has_footprint()
				.query("ink_deed_holding_statistic").which("hold by others").pagination().with_string("artwork auction id").with_string("user id")
					.comments("查询相同作品下，其他持有人的情况")
				.got_page("my holding ink deed detail").comments("我的墨契-可售 详情")
					.may_request("view artwork product")
					.may_request("start sell holding ink deed")
					.may_request("view all other ink deed holding statistics")
					.may_request("view ink deed ids")
			.request("view all other ink deed holding statistics").with_string("artwork auction id")
				.comments("查看其它人对当前艺术品拍卖的墨契的持有情况").no_footprint()
				.got_page("other ink deed holding statistics list")
					.may_request("view next page of all other ink deed holding statistics")
			.request("view next page of all other ink deed holding statistics").with_string("artwork auction id").with_string("last record id")
				.comments("查看其它人对当前艺术品拍卖的墨契的持有情况 翻页").no_footprint()
				.query("ink_deed_entry_order").which("hold by others").pagination().with_string("artwork auction id").with_string("user id")
					.comments("查询被其他人挂单的当前艺术品拍卖的墨契")
				.got_page("other ink deed holding statistics list")
//			.request("view all other ink deed entry order").with_string("artwork auction id")
//				.comments("查看其它人对当前拍卖的艺术品的墨契挂单").has_footprint()
//				.got_page("all other ink deed entry order list")
//					.may_request("view next page of all other ink deed entry order")
//					.may_request("view ink deed entry order detail")
//			.request("view next page of all other ink deed entry order").with_string("artwork auction id").with_string("last record id")
//				.comments("查看其它人对当前拍卖的艺术品的墨契挂单 翻页")
//				.got_page("all other ink deed entry order list")
			.request("view ink deed ids").with_string("object type").with_string("object id")
				.comments("查看某个对象下关联的墨契ID列表")
				.got_page("ink deed id set").comments("墨契ID驱动的墨契证书列表页面")
			/**
			 * 墨契挂单
			 */
			.request("start sell holding ink deed").with_string("artwork auction id")
				.comments("开始墨契挂单")
				.got_page("sell holding ink deed ").comments("挂单销售墨契表单")
					.may_request("submit ink deed entry order")
			.request("submit ink deed entry order").with_form("put ink deed entry order")
				.comments("提交墨契挂单")
				.got_page("ink deed entry order detail")
//			.request("view my wait for cashing ink deed detail").with_string("artwork auction id")
//				.comments("查看我的墨契-待兑付合计")
//				.got_page("wait for cashing ink deed detail")
//			.request("view my cashed ink deed detail").with_string("artwork auction id")
//				.comments("查看我的墨契-已兑付")
//				.got_page("cashed ink deed detail")
			.request("apply withdraw ink deed").with_string("artwork auction id")
				.comments("申请墨契退款")
				.got_page("apply withdraw ink deed result")
			

			/**
			 * 墨契交易区
			 */
			.request("view ink deed trading zone")
				.comments("以拍卖为单位,查看墨契交易挂单统计列表").no_login().has_footprint()
				.query("ink_deed_entry_order_statistic").which("searched").pagination().with_string("search key")
					.comments("根据搜索关键字,搜索并统计墨契交易挂单的信息")
					.rule_comments("只有可交易的才列出")
					.rule_comments("没有关键字,或者关键字为空表示搜索所有")
					.rule_comments("搜索的字段为 作品的名字")
				.got_page("ink deed entry order statistic list").comments("以拍卖为单位,查看墨契交易挂单统计列表")
					.may_request("view auction related ink deed entry order list")
					.may_request("view next page ink deed trading zone")
					.may_request("search ink deed entry order")
			.request("search ink deed entry order").with_string("search key").variable()
				.comments("用关键字搜索墨契交易挂单统计列表")
				.got_page("ink deed entry order statistic list")
			.request("view next page ink deed trading zone").with_string("search key").with_string("last record id")
				.comments("以拍卖为单位,查看墨契交易挂单统计列表 翻页").no_login().no_footprint()
				.got_page("ink deed entry order statistic list")
			.request("view auction related ink deed entry order list").with_string("artwork auction id")
				.comments("查看某拍卖下所有墨契挂单的列表").no_login().has_footprint()
				.query("ink_deed_entry_order").which("related to auction").pagination().with_string("artwork auction id")
					.comments("搜索某个拍卖下的所有墨契挂单")
					.rule_comments("只搜索可售的,已完成的挂单不在范围内")
				.when("only one").comments("只有一个挂单可售")
					.got_page("ink deed entry order detail")
				.when_others().comments("有多个列表")
					.got_page("auction ink deed order list").comments("某拍卖下所有墨契挂单的列表")
						.may_request("view auction next page related ink deed entry order list")
						.may_request("view ink deed entry order detail")
			.request("view auction next page related ink deed entry order list").with_string("artwork auction id").with_string("last record id")
				.comments("查看某拍卖下所有墨契挂单的列表 翻页").no_login().no_footprint()
				.got_page("auction ink deed order list")
				
			/**
			 * 墨契挂单的相关操作
			 */
			.request("view ink deed entry order detail").with_string("order id")
				.comments("查看我的墨契-在售订单详情").no_login().has_footprint()
				.got_page("ink deed entry order detail").comments("我的墨契-在售订单详情")
					.may_request("cancel ink deed entry order")
					.may_request("view artwork product")
					.may_request("buy ink deed entry order")
					.may_request("view ink deed ids")
			.request("cancel ink deed entry order").with_string("order id")
				.comments("墨契持有人取消所挂的墨契销售挂单").need_login().no_footprint()
				.got_page("confirm cancel ink deed entry order popup").comments("确认取消挂单的popup")
					.may_request("do cancel ink deed entry order")
			.request("do cancel ink deed entry order").with_string("order id").with_string("verify code")
				.comments("确认取消墨契挂单")
				.got_page("my holding ink deed detail")
//			.request("buy ink deed entry order").with_string("order id")
//				.comments("购买墨契挂单")
//				.got_page("pay ink deed entry order").comments("购买墨契挂单的支付页面")
//					.may_request("pay bill or order")
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
			.request("view store detail").with_string("shop id").with_string("filter")
				.comments("游客浏览店铺").has_footprint().no_login()
				.query("artwork_auction").which("opening in shop").pagination().with_string("shop id")
					.comments("查询店铺的在售拍卖")
					.rule_comments("公示中 和 拍卖中 的都有效")
					.rule_comments("以开始时间倒序")
				.query("ink_deed_entry_order").which("opening in shop").pagination().with_string("user id")
					.comments("查询店铺的在售墨契")
					.rule_comments("未开始的才有效")
					.rule_comments("已经被锁定的,不显示")
					.rule_comments("以开始时间倒序")
				.got_page("store detail").comments("游客看到的店铺详情")
					.may_request("view next page auction opening in shop")
					.may_request("view next page ink deed opening in shop")
					.may_request("view artwork product")
					.may_request("view ink deed entry order detail")
			.request("view next page auction opening in shop").with_string("shop id").with_string("last record id")
				.comments("游客浏览店铺 在售商品翻页")
				.got_page("store detail")
			.request("view next page ink deed opening in shop").with_string("user id").with_string("last record id")
				.comments("游客浏览店铺 在售墨契翻页")
				.got_page("store detail")
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
					.got_page("recharge bidding deposit popup").comments("补缴竞拍保证金的提示页面")
						.may_request("pay bidding deposit")
				.when_others()
					.got_page("artwork auction refresh result")
			.request("pay bidding deposit").with_string("artwork auction id")
				.comments("支付竞拍保证金")
//					.got_page("pay bidding deposit").comments("去支付保证金")
//						.may_request("pay bill or order")
					.got_page("ext payment")
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
			 * 我的 页面
			 */
			.request("view my account")
				.comments("查看 我的账户").need_login().has_footprint()
				.got_page("my account").comments("我的账户页面. 包括提现,明细,墨贝等")
					.may_request("view account balance")
			.request("view account balance")
				.comments("查看 我的账户余额")
				.got_page("my account balance detail")
					.may_request("start balance withdraw application")
					.may_request("view withdraw history")
					.may_request("view account record list")
			.request("view account record list")
				.comments("查看 我的账户明细列表")
				.query("moyi_user_account_record").which("my account").with_string("account id").pagination()
					.comments("查看账户明细")
				.got_page("my account record list").comments("我的账户余额")
					.may_request("view next page account record list")
					.may_request("view withdraw history")
			.request("start balance withdraw application")
				.comments("申请提现-第一步,打开form,准备填写").no_footprint()
				.when("in processing").comments("有未完成的提现申请")
					.got_page("simple popup")
				.when_others().comments("没有待处理提现申请")
					.got_page("balance withdraw application form").comments("提现申请表单")
						.may_request("preview balance withdraw application")
			.request("preview balance withdraw application").with_form("withdraw record")
				.comments("申请提现-第二步,预览提现申请,准备提交").no_footprint()
				.got_page("balance withdraw application preview").comments("提现申请预览")
					.may_request("submit balance withdraw application")
					.may_request("start balance withdraw application")
			.request("submit balance withdraw application").with_float("amount").with_string("from where").with_string("verify code").variable()
				.comments("申请提现-第三步,提交提现申请")
				.got_page("balance withdraw application submitted").comments("提现申请提交结果")
					.may_request("view my account")
			.request("view next page account record list").with_string("last record id")
				.comments("查看 我的账户明细列表 翻页").no_footprint()
				.got_page("my account record list")
			.request("view withdraw history")
				.comments("查看提现记录").no_footprint()
				.query("withdraw_record").which("my account").with_string("account id").pagination()
					.comments("查询提现记录")
				.got_page("widthdraw list").comments("提现记录列表")
					.may_request("view next page withdraw history")
			.request("view next page withdraw history").with_string("last record id")
				.comments("查看提现记录 翻页").no_footprint()
				.got_page("widthdraw list")
			/**
			 * 荐宝联盟
			 */
			.request("view affiliate alliance")
				.comments("查看荐宝联盟的H5页面").need_login().has_footprint()
				.got_page("affiliate home").comments("荐宝联盟-首页")
					.may_request("view affiliate auction list by artwork type")
					.may_request("view presenter dashboard")
					.may_request("view affiliate auction detail")
			.request("view affiliate auction list by artwork type").with_string("artwork type id")
				.comments("查看荐宝联盟-某个艺术品类型下的所有公示中或竞拍中的拍卖列表").need_login().has_footprint()
				.got_page("affiliate auction list in artwork type").comments("荐宝联盟-某个艺术品类型下的所有公示中或竞拍中的拍卖列表")
					.may_request("view next page affiliate auction list by artwork type")
					.may_request("view affiliate auction detail")
					.may_request("view presenter dashboard")
			.request("view next page affiliate auction list by artwork type").with_string("artwork type id").with_string("last record id")
				.comments("查看荐宝联盟-某个艺术品类型下的所有公示中或竞拍中的拍卖列表 翻页").need_login().has_footprint()
				.got_page("affiliate auction list in artwork type")
			.request("view affiliate auction detail").with_string("artwork auction id").with_string("user id")
				.comments("荐宝联盟-荐宝详情. 和拍卖详情很类似,但是actions不同").no_login().has_footprint()
				.got_page("affiliate auction detail").comments("荐宝详情. 主要作用是有一个分享按钮")
					.may_request("view artwork product")
					.may_request("refresh affiliate auction detail")
			.request("refresh affiliate auction detail").with_string("artwork auction id")
				.comments("刷新当前浏览的拍卖推荐页面").no_login().no_footprint()
				.got_page("affiliate auction detail")
			.request("view presenter dashboard")
				.comments("荐宝人在荐宝联盟上的简单个人主页").need_login().has_footprint()
				.got_page("presenter dashboard").comments("荐宝人在荐宝联盟上的简单个人主页")
					.may_request("view my bonus")
			.request("view my bonus")
				.comments("查看我的奖励金")
				.got_page("preseter bonus").comments("我的奖励金")
				
			/**
			 * 其他杂项
			 */
			.request("import contact book").with_form("import contact book")
				.comments("导入通讯录")
				.got_page("contact book import result").comments("导入结果")
			.request("notify ink deed buyer to pay").with_string("order id")
				.comments("提醒墨契买家付款")
				.got_page("simple popup")
			.request("one click to notify").with_string("user id").with_string("scene code").with_string("object type").with_string("object id")
				.comments("一键通知. 消息根据scene code来, 参数根据object type+id来").no_footprint().no_login()
				.got_page("simple popup")
			.request("start bidding immediately").with_string("artwork auction id")
				.comments("修改拍卖开始时间为当前时间")
				.got_page("simple popup")
			.request("close bidding immediately").with_string("artwork auction id")
				.comments("修改拍卖结束时间为当前时间")
				.got_page("simple popup")
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
