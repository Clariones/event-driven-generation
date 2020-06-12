package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Artwork extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.artwork.Artwork";
	}
	// 枚举对象

	// 引用的对象

	public Artist author() {
		Artist member = new Artist();
		member.setModelTypeName("artist");
		member.setName("author");
		member.setMemberName("author");
		member.setReferDirection(true);
		member.setRelationName("author");
		append(member);
		return member;
	}

	public SurvivalStatus active() {
		SurvivalStatus member = new SurvivalStatus();
		member.setModelTypeName("survival_status");
		member.setName("active");
		member.setMemberName("active");
		member.setReferDirection(true);
		member.setRelationName("active");
		append(member);
		return member;
	}

	public MoyiUser postBy() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("post_by");
		member.setMemberName("postBy");
		member.setReferDirection(true);
		member.setRelationName("postBy");
		append(member);
		return member;
	}

	public MoyiUser recommendBy() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("recommend_by");
		member.setMemberName("recommendBy");
		member.setReferDirection(true);
		member.setRelationName("recommendBy");
		append(member);
		return member;
	}

	public ArtworkType artworkType() {
		ArtworkType member = new ArtworkType();
		member.setModelTypeName("artwork_type");
		member.setName("artwork_type");
		member.setMemberName("artworkType");
		member.setReferDirection(true);
		member.setRelationName("artworkType");
		append(member);
		return member;
	}

	public ArtworkMaterial artworkMaterial() {
		ArtworkMaterial member = new ArtworkMaterial();
		member.setModelTypeName("artwork_material");
		member.setName("artwork_material");
		member.setMemberName("artworkMaterial");
		member.setReferDirection(true);
		member.setRelationName("artworkMaterial");
		append(member);
		return member;
	}

	public ArtworkStyle artworkStyle() {
		ArtworkStyle member = new ArtworkStyle();
		member.setModelTypeName("artwork_style");
		member.setName("artwork_style");
		member.setMemberName("artworkStyle");
		member.setReferDirection(true);
		member.setRelationName("artworkStyle");
		append(member);
		return member;
	}

	public ArtworkSkill artworkSkill() {
		ArtworkSkill member = new ArtworkSkill();
		member.setModelTypeName("artwork_skill");
		member.setName("artwork_skill");
		member.setMemberName("artworkSkill");
		member.setReferDirection(true);
		member.setRelationName("artworkSkill");
		append(member);
		return member;
	}

	public ArtworkTopic artworkTopic() {
		ArtworkTopic member = new ArtworkTopic();
		member.setModelTypeName("artwork_topic");
		member.setName("artwork_topic");
		member.setMemberName("artworkTopic");
		member.setReferDirection(true);
		member.setRelationName("artworkTopic");
		append(member);
		return member;
	}

	public ArtworkCountry artworkCountry() {
		ArtworkCountry member = new ArtworkCountry();
		member.setModelTypeName("artwork_country");
		member.setName("artwork_country");
		member.setMemberName("artworkCountry");
		member.setReferDirection(true);
		member.setRelationName("artworkCountry");
		append(member);
		return member;
	}

	public ArtworkFigure artworkFigure() {
		ArtworkFigure member = new ArtworkFigure();
		member.setModelTypeName("artwork_figure");
		member.setName("artwork_figure");
		member.setMemberName("artworkFigure");
		member.setReferDirection(true);
		member.setRelationName("artworkFigure");
		append(member);
		return member;
	}

	public ArtworkFontStyle artworkFontStyle() {
		ArtworkFontStyle member = new ArtworkFontStyle();
		member.setModelTypeName("artwork_font_style");
		member.setName("artwork_font_style");
		member.setMemberName("artworkFontStyle");
		member.setReferDirection(true);
		member.setRelationName("artworkFontStyle");
		append(member);
		return member;
	}

	public ArtworkDynasty artworkDynasty() {
		ArtworkDynasty member = new ArtworkDynasty();
		member.setModelTypeName("artwork_dynasty");
		member.setName("artwork_dynasty");
		member.setMemberName("artworkDynasty");
		member.setReferDirection(true);
		member.setRelationName("artworkDynasty");
		append(member);
		return member;
	}

	public ArtworkCategory artworkCategory() {
		ArtworkCategory member = new ArtworkCategory();
		member.setModelTypeName("artwork_category");
		member.setName("artwork_category");
		member.setMemberName("artworkCategory");
		member.setReferDirection(true);
		member.setRelationName("artworkCategory");
		append(member);
		return member;
	}

	public ArtworkKind artworkKind() {
		ArtworkKind member = new ArtworkKind();
		member.setModelTypeName("artwork_kind");
		member.setName("artwork_kind");
		member.setMemberName("artworkKind");
		member.setReferDirection(true);
		member.setRelationName("artworkKind");
		append(member);
		return member;
	}

	public ArtworkDecade artworkDecade() {
		ArtworkDecade member = new ArtworkDecade();
		member.setModelTypeName("artwork_decade");
		member.setName("artwork_decade");
		member.setMemberName("artworkDecade");
		member.setReferDirection(true);
		member.setRelationName("artworkDecade");
		append(member);
		return member;
	}

	public Moyi moyi() {
		Moyi member = new Moyi();
		member.setModelTypeName("moyi");
		member.setName("moyi");
		member.setMemberName("moyi");
		member.setReferDirection(true);
		member.setRelationName("moyi");
		append(member);
		return member;
	}

	// 被引用的对象

	public Slide slideList() {
		Slide member = new Slide();
		member.setModelTypeName("slide");
		member.setName("linked_artwork");
		member.setMemberName("slideList");
		member.setRelationName("linkedArtwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public RewardDetailRecord rewardDetailRecordList() {
		RewardDetailRecord member = new RewardDetailRecord();
		member.setModelTypeName("reward_detail_record");
		member.setName("artwork");
		member.setMemberName("rewardDetailRecordList");
		member.setRelationName("artwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkImage artworkImageList() {
		ArtworkImage member = new ArtworkImage();
		member.setModelTypeName("artwork_image");
		member.setName("artwork");
		member.setMemberName("artworkImageList");
		member.setRelationName("artwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkLike artworkLikeList() {
		ArtworkLike member = new ArtworkLike();
		member.setModelTypeName("artwork_like");
		member.setName("artwork");
		member.setMemberName("artworkLikeList");
		member.setRelationName("artwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkFans artworkFansList() {
		ArtworkFans member = new ArtworkFans();
		member.setModelTypeName("artwork_fans");
		member.setName("artwork");
		member.setMemberName("artworkFansList");
		member.setRelationName("artwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkCertificate artworkCertificateList() {
		ArtworkCertificate member = new ArtworkCertificate();
		member.setModelTypeName("artwork_certificate");
		member.setName("artwork");
		member.setMemberName("artworkCertificateList");
		member.setRelationName("artwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Article articleList() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("related_artwork");
		member.setMemberName("articleList");
		member.setRelationName("relatedArtwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContentTag contentTagList() {
		ContentTag member = new ContentTag();
		member.setModelTypeName("content_tag");
		member.setName("artwork");
		member.setMemberName("contentTagList");
		member.setRelationName("artwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Review reviewList() {
		Review member = new Review();
		member.setModelTypeName("review");
		member.setName("artwork");
		member.setMemberName("reviewList");
		member.setRelationName("artwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkDailyInkValue artworkDailyInkValueList() {
		ArtworkDailyInkValue member = new ArtworkDailyInkValue();
		member.setModelTypeName("artwork_daily_ink_value");
		member.setName("artwork");
		member.setMemberName("artworkDailyInkValueList");
		member.setRelationName("artwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SpamReport spamReportList() {
		SpamReport member = new SpamReport();
		member.setModelTypeName("spam_report");
		member.setName("spam_artwork");
		member.setMemberName("spamReportList");
		member.setRelationName("spamArtwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkBlocking artworkBlockingList() {
		ArtworkBlocking member = new ArtworkBlocking();
		member.setModelTypeName("artwork_blocking");
		member.setName("blocked_artwork");
		member.setMemberName("artworkBlockingList");
		member.setRelationName("blockedArtwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public DeliverArticle deliverArticleList() {
		DeliverArticle member = new DeliverArticle();
		member.setModelTypeName("deliver_article");
		member.setName("related_artwork");
		member.setMemberName("deliverArticleList");
		member.setRelationName("relatedArtwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public TipArtwork tipArtworkList() {
		TipArtwork member = new TipArtwork();
		member.setModelTypeName("tip_artwork");
		member.setName("artwork");
		member.setMemberName("tipArtworkList");
		member.setRelationName("artwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkOwnershipCertificate artworkOwnershipCertificateList() {
		ArtworkOwnershipCertificate member = new ArtworkOwnershipCertificate();
		member.setModelTypeName("artwork_ownership_certificate");
		member.setName("artwork");
		member.setMemberName("artworkOwnershipCertificateList");
		member.setRelationName("artwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkCurrentOwner artworkCurrentOwnerList() {
		ArtworkCurrentOwner member = new ArtworkCurrentOwner();
		member.setModelTypeName("artwork_current_owner");
		member.setName("artwork");
		member.setMemberName("artworkCurrentOwnerList");
		member.setRelationName("artwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkAuction artworkAuctionList() {
		ArtworkAuction member = new ArtworkAuction();
		member.setModelTypeName("artwork_auction");
		member.setName("artwork");
		member.setMemberName("artworkAuctionList");
		member.setRelationName("artwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkTransactionTracking artworkTransactionTrackingList() {
		ArtworkTransactionTracking member = new ArtworkTransactionTracking();
		member.setModelTypeName("artwork_transaction_tracking");
		member.setName("artwork");
		member.setMemberName("artworkTransactionTrackingList");
		member.setRelationName("artwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public InkDeed inkDeedList() {
		InkDeed member = new InkDeed();
		member.setModelTypeName("ink_deed");
		member.setName("artwork");
		member.setMemberName("inkDeedList");
		member.setRelationName("artwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public InkDeedHoldingStatistic inkDeedHoldingStatisticList() {
		InkDeedHoldingStatistic member = new InkDeedHoldingStatistic();
		member.setModelTypeName("ink_deed_holding_statistic");
		member.setName("artwork");
		member.setMemberName("inkDeedHoldingStatisticList");
		member.setRelationName("artwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public InkDeedEntryOrder inkDeedEntryOrderList() {
		InkDeedEntryOrder member = new InkDeedEntryOrder();
		member.setModelTypeName("ink_deed_entry_order");
		member.setName("artwork");
		member.setMemberName("inkDeedEntryOrderList");
		member.setRelationName("artwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public InkDeedCashRecord inkDeedCashRecordList() {
		InkDeedCashRecord member = new InkDeedCashRecord();
		member.setModelTypeName("ink_deed_cash_record");
		member.setName("artwork");
		member.setMemberName("inkDeedCashRecordList");
		member.setRelationName("artwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PageSlide pageSlideList() {
		PageSlide member = new PageSlide();
		member.setModelTypeName("page_slide");
		member.setName("artwork");
		member.setMemberName("pageSlideList");
		member.setRelationName("artwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkRank artworkRankList() {
		ArtworkRank member = new ArtworkRank();
		member.setModelTypeName("artwork_rank");
		member.setName("artwork");
		member.setMemberName("artworkRankList");
		member.setRelationName("artwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkAuctionSortingItem artworkAuctionSortingItemList() {
		ArtworkAuctionSortingItem member = new ArtworkAuctionSortingItem();
		member.setModelTypeName("artwork_auction_sorting_item");
		member.setName("artwork");
		member.setMemberName("artworkAuctionSortingItemList");
		member.setRelationName("artwork");
		member.setReferDirection(false);
		append(member);
		return member;
	}


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute artworkName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("artworkName");
		member.setName("artwork_name");
		useMember(member);
		return member;
	}

	public StringAttribute artworkResume(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("artworkResume");
		member.setName("artwork_resume");
		useMember(member);
		return member;
	}

	public BooleanAttribute authorStatement(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("authorStatement");
		member.setName("author_statement");
		useMember(member);
		return member;
	}

	public BooleanAttribute holderStatement(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("holderStatement");
		member.setName("holder_statement");
		useMember(member);
		return member;
	}

	public DateTimeAttribute postTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("postTime");
		member.setName("post_time");
		useMember(member);
		return member;
	}

	public StringAttribute coverImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("coverImage");
		member.setName("cover_image");
		useMember(member);
		return member;
	}

	public NumberAttribute coverImageWidth(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("coverImageWidth");
		member.setName("cover_image_width");
		useMember(member);
		return member;
	}

	public NumberAttribute coverImageHeight(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("coverImageHeight");
		member.setName("cover_image_height");
		useMember(member);
		return member;
	}

	public StringAttribute artworkDimensionDescription(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("artworkDimensionDescription");
		member.setName("artwork_dimension_description");
		useMember(member);
		return member;
	}

	public NumberAttribute artworkInkValue(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		// member.setName("artworkInkValue");
		member.setName("artwork_ink_value");
		useMember(member);
		return member;
	}

	public NumberAttribute artworkReviewCount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("artworkReviewCount");
		member.setName("artwork_review_count");
		useMember(member);
		return member;
	}

	public NumberAttribute artworkLikeCount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("artworkLikeCount");
		member.setName("artwork_like_count");
		useMember(member);
		return member;
	}

	public NumberAttribute artworkPageViewCount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("artworkPageViewCount");
		member.setName("artwork_page_view_count");
		useMember(member);
		return member;
	}

	public NumberAttribute artworkWatchCount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("artworkWatchCount");
		member.setName("artwork_watch_count");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		// member.setName("lastUpdateTime");
		member.setName("last_update_time");
		useMember(member);
		return member;
	}

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

