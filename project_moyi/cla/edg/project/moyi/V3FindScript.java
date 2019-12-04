package cla.edg.project.moyi;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.moyi.gen.graphquery.ArtworkAuctionStatus;
import cla.edg.project.moyi.gen.graphquery.CertificateStatus;
import cla.edg.project.moyi.gen.graphquery.InkDeedStatus;
import cla.edg.project.moyi.gen.graphquery.MODEL;
import cla.edg.project.moyi.gen.graphquery.OrderStatus;
import cla.edg.project.moyi.gen.graphquery.PaymentStatus;

public class V3FindScript extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
				// 写法1: 整个SQL手写,参数手写
				// 参数可以用名字引用, 写法为 ?{参数名}, 会自动在Params里正确位置追加. 
				// param(xxx) 中的xxx 会原样写入代码. 例如要写常量, 就写 param("MyConstant.X"), 生成代码就是 params.add(MyConstant.X), 也可以写变量
				// 例如 param("\"%\" + artworkId + \"%\""), 就会生成 params.add("%"+artworkId+"%"). 就是简单的填入.
				// param_string("xxx")是个简写, 会把写入的内容,最后包含在一个字符串中, 例如 param_string("甲说:\"你好\"") 就会生成params.add("甲说:\"你好\"");
				// 如果用 param("\"甲说:\\\"你好\\\"\"") 就太麻烦
				.find(MODEL.artworkOwnershipCertificate()).which("available for artwork").with_string("artwork id")
					.do_it_as()
						.sql_is("select AC.* from artwork_ownership_certificate_data AC left join certificate_status_data CS on AC.certificate_status=CS.id\n" + 
								"	where AC.artwork=?{artwork id} and CS.code = ?\n" + 
								"    order by AC.id desc \n" + 
								"    limit ? ")
						.param("CertificateStatus.CERTIFICATED").param(1)
						.need_know("com.terapico.moyi.certificatestatus.CertificateStatus")
				// 写法2(单个搜索,不带分页): 只描述搜索条件, 脚本自己分析sql,组装条件. 
				// param的写法: ${xxx} 会转成Java变量名; ${'xxx'} 会包在字符串里  直接写xxx,会直接输出到代码
				.find(MODEL.artworkAuction()).which("not finished").with_string("artwork id")
					.do_it_as()
						.where(MODEL.artworkAuction().artwork().eq("${artwork id}"),
							MODEL.artworkAuction().artworkAuctionStatus().code().not_in(ArtworkAuctionStatus.WAIT_FOR_DISPLAY, ArtworkAuctionStatus.CLOSED, ArtworkAuctionStatus.CANCELLED, ArtworkAuctionStatus.BOUGHT_IN)
							)
				.find(MODEL.artworkAuction()).which("not submitted").with_string("artwork id")
					.do_it_as()
						.where(MODEL.artworkAuction().artwork().eq("${artwork id}"),
								MODEL.artworkAuction().artworkAuctionStatus().code().eq(ArtworkAuctionStatus.WAIT_FOR_DISPLAY)
							)
				/*
				.find(MODEL.moyiUser()).which("is owner of artwork by main order").with_string("order id")
					.do_it_as()
						.where(
							MODEL.moyiUser().artworkOwnershipCertificateList().artworkAuctionList().artworkAuctionOrderList().mainOrder().eq("${order id}"),
							MODEL.moyiUser().articleList().not_null()
							)
				*/
				.find(MODEL.inkDeed()).which("already issued for auction").with_string("artwork auction id")
					.comments("统计拍品已经发行的有效墨契数量")
					.do_it_as().count()
						.where(MODEL.inkDeed().auction().eq("${artwork auction id}"),
								MODEL.inkDeed().status().not(InkDeedStatus.DESTROYED)
							)
				.find(MODEL.artworkAuctionBiddingPriceRecord()).which("for auction").with_string("artwork auction id")
					.comments("统计拍品的出价次数")
					.do_it_as().count()
						.where(MODEL.artworkAuctionBiddingPriceRecord().artworkAuction().eq("${artwork auction id}"))
				.find(MODEL.inkDeed()).which("user can buy").with_string("artwork auction id").with_string("user id")
					.comments("统计用户可以购买的某个拍品下的墨契数量")
					.rule_comments("1. 拍品在公示期")
					.rule_comments("2. 是上架销售的墨契,不包括已发行,未上架的墨契") // 注:为了防止定时任务不及时, 也包括状态为 锁定,但是时间超过锁定时间的
					.rule_comments("3. 持有人不是自己")
					.do_it_as().count()
						.where(MODEL.inkDeed().auction().id().eq("${artwork auction id}"),
								MODEL.artworkAuction().artworkAuctionStatus().code().eq(ArtworkAuctionStatus.DISPLAYING),
								MODEL.inkDeed().status().in(InkDeedStatus.AVALIABLE, InkDeedStatus.BOOKED, InkDeedStatus.BE_DRAWN),  // 已经锁定的, 还没购买的也算
								MODEL.inkDeed().holder().not("${user id}")
							)
						.order_by(MODEL.inkDeed().purchasePrice()).desc()
				.find("ink_deed").which("the one user can buy").with_string("artwork auction id").with_string("user id").with_integer("book minutes")
					.comments("找出用户可以购买的某个拍品下的墨契")
					.rule_comments("2. 是上架销售的墨契,不包括已发行,未上架的墨契") // 注:为了防止定时任务不及时, 也包括状态为 锁定,但是时间超过锁定时间的
					.rule_comments("3. 持有人不是自己")
					.do_it_as()
						.where(MODEL.inkDeed().auction().eq("${artwork auction id}"),
								MODEL.inkDeed().status().code().in(InkDeedStatus.AVALIABLE)  // 已经锁定的, 还没购买的也算
									.or(MODEL.inkDeed().status().code().eq(InkDeedStatus.BE_DRAWN)
											.and(MODEL.inkDeed().lastUpdateTime().less("DateTimeUtil.standOn(ctx.now()).addSeconds(-30).getDate()")),
										MODEL.inkDeed().status().code().eq(InkDeedStatus.BOOKED)
											.and(MODEL.inkDeed().lastUpdateTime().less("DateTimeUtil.standOn(ctx.now()).addMinutes(-bookMinutes).getDate()"))
									   ),
								MODEL.inkDeed().holder().not("${user id}")
							)
						.order_by(MODEL.inkDeed().purchasePrice()).asc().order_by(MODEL.inkDeed().id()).desc()
						.wants(MODEL.inkDeed().auction(), MODEL.inkDeed().holder())
						.need_know("com.terapico.utils.DateTimeUtil")
				.find(MODEL.auctionStartNotification()).which("user reserved").with_string("artwork auction id").with_string("user id")
					.comments("找出用户对某场拍卖的开拍提醒")
					.do_it_as()
//						.where(MODEL.artworkAuction().auctionStartNotificationList().bidder().eq("${user id}"),
//								MODEL.artworkAuction().id().eq("${artwork auction id}")
//							)
					.where(MODEL.auctionStartNotification().bidder().eq("${user id}"),
							MODEL.auctionStartNotification().auction().eq("${artwork auction id}")
						)
					.wants(MODEL.auctionStartNotification().auction(), MODEL.auctionStartNotification().bidder())
					.not_generate_pagination_params()
				.query(MODEL.paymentLineItem()).which("available in payment").with_string("payment id")
					.comments("查询支付详情相关的,目前有效的支付条目")
					.do_it_as()
						.where(MODEL.paymentLineItem().paymentDetail().eq("${payment id}"),
								MODEL.paymentLineItem().paymentStatus().code().not(PaymentStatus.CANCELLED)
							)
						.wants(MODEL.paymentLineItem().paymentStatus(), MODEL.paymentLineItem().paymentMethod())
				.find(MODEL.mainOrder()).which("used to issue ink deed and not paid").with_string("artwork auction id").with_string("user id")
					.comments("找出用户为某个拍品发行墨契的订单")
					.do_it_as()
						.where(MODEL.mainOrder().inkDeedIssueBillList().auction().eq("${artwork auction id}"),
								MODEL.inkDeedIssueBill().seller().eq("${user id}"),
								MODEL.mainOrder().orderStatus().code().in(OrderStatus.NEED_PAY, OrderStatus.PAYING)
							)
						.wants(MODEL.mainOrder().inkDeedIssueBillList(), MODEL.mainOrder().orderStatus(), MODEL.inkDeedIssueBill().orderStatus())
				.find(MODEL.paymentDetail()).which("available for main order").with_string("order id")
					.comments("找出订单的payment detail")
					.do_it_as()
						.where(MODEL.paymentDetail().mainOrder().eq("${order id}"),
								MODEL.paymentDetail().paymentStatus().not_in(PaymentStatus.CANCELLED)
							)
				.find(MODEL.moyiShopCertification()).which("already paid").with_string("shop id")
					.comments("找出店相关的, 未作废的店铺认证")
					.do_it_as()
						.where(MODEL.moyiShopCertification().moyiShopList().id().eq("${shop id}"), 
								MODEL.moyiShopCertification().certificateStatus().in(CertificateStatus.CERTIFICATED, CertificateStatus.PROCESSING))
						.wants(MODEL.moyiShopCertification().certificateStatus(), MODEL.moyiShopCertification().moyiShopList().shopkeeper())
				.find(MODEL.auctionBiddingDeposit()).which("paid by user").with_string("artwork auction id").with_string("user id")
					.comments("找出用户为拍卖缴纳的竞拍保证金")
					.do_it_as()
						.where(MODEL.auctionBiddingDeposit().bidder().eq("${user id}"),
								MODEL.auctionBiddingDeposit().auction().eq("${artwork auction id}"))
						.order_by(MODEL.auctionBiddingDeposit().id()).desc()
						.wants(MODEL.auctionBiddingDeposit().status())
				.find(MODEL.mainOrder()).which("opening for bidding deposit").with_string("artwork auction id").with_string("user id")
					.comments("找出当前用户的未关闭的 竞拍保证金 订单")
					.do_it_as()
						.where(MODEL.mainOrder().auctionBiddingDepositBillList().bidder().eq("${user id}"),
								MODEL.mainOrder().auctionBiddingDepositBillList().auction().eq("${artwork auction id}"),
								MODEL.mainOrder().orderStatus().code().in(OrderStatus.NEED_PAY, OrderStatus.PAYING))
						.wants(MODEL.mainOrder().auctionBiddingDepositBillList(), MODEL.mainOrder().orderStatus())
						.order_by(MODEL.mainOrder()).desc()
				;
	}

	
			
}
