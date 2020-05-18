package cla.edg.project.moyi;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.moyi.gen.graphquery.ArtworkAuctionStatus;
import cla.edg.project.moyi.gen.graphquery.MODEL;
import cla.edg.project.moyi.gen.graphquery.SurvivalStatus;

public class V4FindScript extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
		
			.query(MODEL.pageSlide()).list_of("page type").with_string("page type").with_integer("top n")
				.comments("查询对应页面类型的slide")
				.do_it_as()
					.where(MODEL.pageSlide().pageType().eq("${page type}"))
					.top("${top n}")
					.order_by(MODEL.pageSlide().displayOrder()).asc()
				
		// 2020新首页所需的查询
			.query(MODEL.artworkAuction()).list_of("opening").pagination()
				.comments("查询当前进行中的拍卖")
				.do_it_as()
					.where(MODEL.artworkAuction().artworkAuctionStatus().in(ArtworkAuctionStatus.DISPLAYING, ArtworkAuctionStatus.BIDDING))
					.order_by(MODEL.artworkAuction().artworkAuctionStatus()).desc()
					.order_by(MODEL.artworkAuction().auctionStartTime()).desc()
					.order_by(MODEL.artworkAuction().auctionEndTime()).desc()
					.wants(MODEL.artworkAuction().artwork(), MODEL.artworkAuction().artworkAuctionStatus())
					
			.query(MODEL.artworkAuction()).list_of("not opening").with_integer("top n")
				.comments("查询当前并没有进行中的拍卖")
				.do_it_as()
					.where(MODEL.artworkAuction().artworkAuctionStatus().not_in(ArtworkAuctionStatus.DISPLAYING, ArtworkAuctionStatus.BIDDING))
					.top("${top n}")
					.order_by(MODEL.artworkAuction().auctionEndTime()).desc()
					.wants(MODEL.artworkAuction().artwork(), MODEL.artworkAuction().artworkAuctionStatus())
				
		// 按拍品统计的艺术品类型
			.find(MODEL.artworkAuction()).which("by artwork type")
				.comments("按艺术品类型统计在售的艺术品")
				.do_it_as().count_by(MODEL.artworkAuction().artwork().artworkType())
				.where(MODEL.artworkAuction().moyiShop().not_null())
		// 按艺术家统计的艺术品类型
			.find(MODEL.artist()).which("by artwork type")
				.comments("按艺术品类型统计艺术家")
				.do_it_as().count_by(MODEL.artist().artworkList().artworkType())
				.where(MODEL.artist().moyi().not_null())
				
		// 聚好店所需的查询
			.query(MODEL.hotShopRank()).list_of("all").pagination()
				.comments("按照热度查询所有的店铺")
				.do_it_as()
					.where(MODEL.hotShopRank().moyiShop().not_null(), MODEL.hotShopRank().moyiShop().moyi().not_null())
					.order_by(MODEL.hotShopRank().rankPoint()).desc()
						.order_by(MODEL.hotShopRank().runningDays()).desc()
						.order_by(MODEL.hotShopRank().moyiShop()).desc()
					.wants(MODEL.hotShopRank().moyiShop().shopkeeper(), MODEL.moyiShop().certificate().moyiShopType())
				
			.query(MODEL.hotShopRank()).list_of("artwork type").pagination().with_string("artwork type id")
				.comments("按照热度查询所有的店铺")
				.do_it_as()
					.where(MODEL.hotShopRank().moyiShop().artworkAuctionList().artwork().artworkType().eq("${artwork type id}"))
					.order_by(MODEL.hotShopRank().rankPoint()).desc()
						.order_by(MODEL.hotShopRank().runningDays()).desc()
						.order_by(MODEL.hotShopRank().moyiShop()).desc()
					.wants(MODEL.hotShopRank().moyiShop().shopkeeper(), MODEL.moyiShop().certificate().moyiShopType())
					
			.find(MODEL.artworkAuction()).which("by shop").with_string("shop id")
				.comments("统计店铺的拍品数量")
				.do_it_as().count()
				.where(MODEL.artworkAuction().moyiShop().eq("${shop id}"))
				
			.find(MODEL.artworkAuction()).which("sold by shop").with_string("shop id")
				.comments("统计店铺的成交拍品数量")
				.do_it_as().count()
				.where(MODEL.artworkAuction().moyiShop().eq("${shop id}"),
						MODEL.artworkAuction().artworkAuctionStatus().in(ArtworkAuctionStatus.DEAL, ArtworkAuctionStatus.DEAL_WAIT_PROCESS, ArtworkAuctionStatus.CLOSED))
			
			.find(MODEL.favoriteShopOfUser()).which("by shop").with_string("shop id")
				.comments("统计店铺的被收藏数量")
				.do_it_as().count()
				.where(MODEL.favoriteShopOfUser().targetMoyiShop().eq("${shop id}"))
				
			.query(MODEL.artworkAuction()).list_of("hot in shop").with_string("shop id")
				.comments("查询店铺中最 hot 的几个作品")
				.do_it_as()
				.where(MODEL.artworkAuction().moyiShop().eq("${shop id}"))
				.top_3()
				.order_by(MODEL.artworkAuction().artworkAuctionStatus()).asc()
					.order_by(MODEL.artworkAuction().auctionEndTime()).desc()
					
					
					
		// 2020年定义的新艺术家列表页面相关的查询
			.query(MODEL.hotArtistRank()).list_of("all").pagination()
				.comments("按照热度查询所有的艺术家")
				.do_it_as()
					.where(MODEL.hotArtistRank().artist().moyi().not_null())
					.order_by(MODEL.hotArtistRank().rankPoint()).desc()
						.order_by(MODEL.hotArtistRank().totalWatched()).desc()
						.order_by(MODEL.hotArtistRank().artist()).desc()
					.wants(MODEL.hotArtistRank().artist())
					
			.query(MODEL.hotArtistRank()).list_of("artwork type").pagination().with_string("artwork type id")
				.comments("按照热度查询,有某个艺术品类型的对应作品的,所有的艺术家")
				.do_it_as()
					.where(MODEL.hotArtistRank().artist().moyi().not_null(),
							MODEL.hotArtistRank().artist().artworkList().artworkType().eq("${artwork type id}"))
					.order_by(MODEL.hotArtistRank().rankPoint()).desc()
						.order_by(MODEL.hotArtistRank().totalWatched()).desc()
						.order_by(MODEL.hotArtistRank().artist()).desc()
					.wants(MODEL.hotArtistRank().artist())
				
			.find(MODEL.artwork()).which("by artist").with_string("artist")
				.comments("统计某个作家名下所有作品的数量")
				.do_it_as().count()
				.where(MODEL.artwork().author().eq("${artist}"))
			.find(MODEL.artworkAuction()).which("by artist").with_string("artist")
				.comments("统计某个作家名下所有 拍品 数量")
				.do_it_as().count()
				.where(MODEL.artworkAuction().artwork().author().eq("${artist}"))
			.find(MODEL.artworkAuction()).which("sold from artist").with_string("artist")
				.comments("统计某个作家名下所有 已成交拍品 数量")
				.do_it_as().count()
				.where(MODEL.artworkAuction().artwork().author().eq("${artist}"),
						MODEL.artworkAuction().artworkAuctionStatus().in(ArtworkAuctionStatus.DEAL, ArtworkAuctionStatus.DEAL_WAIT_PROCESS, ArtworkAuctionStatus.CLOSED))
			.find(MODEL.artistFans()).which("for artist").with_string("artist")
				.comments("统计某个作家的 watch 的数量")
				.do_it_as().count()
				.where(MODEL.artistFans().artist().eq("${artist}"))
				
				
		// H5 艺术家分享简历页面相关查询
			.query(MODEL.artwork()).list_of("recommend in h5 artist resume").with_string("artist")
				.comments("H5 艺术家分享简历页面上的 作品推荐 列表")
				.do_it_as()
					.where(MODEL.artwork().active().code().eq(SurvivalStatus.NORMAL),
							MODEL.artwork().author().eq("${artist}").or(MODEL.artwork().postBy().artistListAsMoyiUser().id().eq("${artist}")))
					.top("2")
					.order_by("rand()")
					.wants(MODEL.artwork().artworkImageList(), MODEL.artwork().author())
			.query(MODEL.artwork()).list_of("other recommend in h5 artist resume").with_string("artist")
				.comments("H5 艺术家分享简历页面上的 相关推荐 列表")
				.do_it_as()
					.where(MODEL.artwork().active().code().eq(SurvivalStatus.NORMAL),
							MODEL.artwork().author().not("${artist}"),
							MODEL.artwork().postBy().artistListAsMoyiUser().id().not("${artist}"))
					.top("2")
					.order_by("rand()")
					.wants(MODEL.artwork().artworkImageList(), MODEL.artwork().author())
			.query(MODEL.artworkAuction()).list_of("recommend in h5 artist resume").with_string("artist")
				.comments("H5 艺术家分享简历页面上的 拍品推荐 列表")
				.do_it_as()
					.where(MODEL.artworkAuction().artworkAuctionStatus().code().in(ArtworkAuctionStatus.DISPLAYING, ArtworkAuctionStatus.BIDDING),
							MODEL.artworkAuction().artwork().author().eq("${artist}").or(MODEL.artworkAuction().artwork().postBy().artistListAsMoyiUser().id().eq("${artist}")))
					.top("2")
					.order_by("rand()")
			.find(MODEL.moyiShop()).which("opended by artist").with_string("artist")
				.comments("查找艺术家开的店铺")
				.do_it_as()
					.where(MODEL.moyiShop().shopkeeper().artistListAsMoyiUser().id().eq("${artist}"))
					
					
		;
	}
}
