package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MoyiUser extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.moyiuser.MoyiUser";
	}
	// 枚举对象

	// 引用的对象

	public UserLevel userLevel() {
		UserLevel member = new UserLevel();
		member.setModelTypeName("user_level");
		member.setName("user_level");
		member.setMemberName("userLevel");
		member.setReferDirection(true);
		member.setRelationName("userLevel");
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

	public MasterColumn masterColumnList() {
		MasterColumn member = new MasterColumn();
		member.setModelTypeName("master_column");
		member.setName("column_author");
		member.setMemberName("masterColumnList");
		member.setRelationName("columnAuthor");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SectionFans sectionFansList() {
		SectionFans member = new SectionFans();
		member.setModelTypeName("section_fans");
		member.setName("fans");
		member.setMemberName("sectionFansList");
		member.setRelationName("fans");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Moderator moderatorList() {
		Moderator member = new Moderator();
		member.setModelTypeName("moderator");
		member.setName("responsible_user");
		member.setMemberName("moderatorList");
		member.setRelationName("responsibleUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ModeratorPunishment moderatorPunishmentListAsPunisher() {
		ModeratorPunishment member = new ModeratorPunishment();
		member.setModelTypeName("moderator_punishment");
		member.setName("punisher");
		member.setMemberName("moderatorPunishmentListAsPunisher");
		member.setRelationName("punisher");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ModeratorPunishment moderatorPunishmentListAsPunishedUser() {
		ModeratorPunishment member = new ModeratorPunishment();
		member.setModelTypeName("moderator_punishment");
		member.setName("punished_user");
		member.setMemberName("moderatorPunishmentListAsPunishedUser");
		member.setRelationName("punisher");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ModeratorBonus moderatorBonusList() {
		ModeratorBonus member = new ModeratorBonus();
		member.setModelTypeName("moderator_bonus");
		member.setName("moderator");
		member.setMemberName("moderatorBonusList");
		member.setRelationName("moderator");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EliteArticle eliteArticleList() {
		EliteArticle member = new EliteArticle();
		member.setModelTypeName("elite_article");
		member.setName("moderator");
		member.setMemberName("eliteArticleList");
		member.setRelationName("moderator");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SectionTopArticle sectionTopArticleList() {
		SectionTopArticle member = new SectionTopArticle();
		member.setModelTypeName("section_top_article");
		member.setName("moderator");
		member.setMemberName("sectionTopArticleList");
		member.setRelationName("moderator");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SectionBroadcastArticle sectionBroadcastArticleList() {
		SectionBroadcastArticle member = new SectionBroadcastArticle();
		member.setModelTypeName("section_broadcast_article");
		member.setName("moderator");
		member.setMemberName("sectionBroadcastArticleList");
		member.setRelationName("moderator");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArticleBonus articleBonusList() {
		ArticleBonus member = new ArticleBonus();
		member.setModelTypeName("article_bonus");
		member.setName("moderator");
		member.setMemberName("articleBonusList");
		member.setRelationName("moderator");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Artist artistListAsMoyiUser() {
		Artist member = new Artist();
		member.setModelTypeName("artist");
		member.setName("moyi_user");
		member.setMemberName("artistListAsMoyiUser");
		member.setRelationName("moyiUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Artist artistListAsCreator() {
		Artist member = new Artist();
		member.setModelTypeName("artist");
		member.setName("creator");
		member.setMemberName("artistListAsCreator");
		member.setRelationName("moyiUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtistFans artistFansList() {
		ArtistFans member = new ArtistFans();
		member.setModelTypeName("artist_fans");
		member.setName("fans");
		member.setMemberName("artistFansList");
		member.setRelationName("fans");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public UserInviteCode userInviteCodeList() {
		UserInviteCode member = new UserInviteCode();
		member.setModelTypeName("user_invite_code");
		member.setName("moyi_user");
		member.setMemberName("userInviteCodeList");
		member.setRelationName("moyiUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public UserInviteRegistrationInfo userInviteRegistrationInfoListAsInviter() {
		UserInviteRegistrationInfo member = new UserInviteRegistrationInfo();
		member.setModelTypeName("user_invite_registration_info");
		member.setName("inviter");
		member.setMemberName("userInviteRegistrationInfoListAsInviter");
		member.setRelationName("inviter");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public UserInviteRegistrationInfo userInviteRegistrationInfoListAsInvitee() {
		UserInviteRegistrationInfo member = new UserInviteRegistrationInfo();
		member.setModelTypeName("user_invite_registration_info");
		member.setName("invitee");
		member.setMemberName("userInviteRegistrationInfoListAsInvitee");
		member.setRelationName("inviter");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Organization organizationList() {
		Organization member = new Organization();
		member.setModelTypeName("organization");
		member.setName("moyi_user");
		member.setMemberName("organizationList");
		member.setRelationName("moyiUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MoyiUserFans moyiUserFansListAsMoyiUser() {
		MoyiUserFans member = new MoyiUserFans();
		member.setModelTypeName("moyi_user_fans");
		member.setName("moyi_user");
		member.setMemberName("moyiUserFansListAsMoyiUser");
		member.setRelationName("moyiUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MoyiUserFans moyiUserFansListAsFans() {
		MoyiUserFans member = new MoyiUserFans();
		member.setModelTypeName("moyi_user_fans");
		member.setName("fans");
		member.setMemberName("moyiUserFansListAsFans");
		member.setRelationName("moyiUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MoyiUserCheckinRecord moyiUserCheckinRecordList() {
		MoyiUserCheckinRecord member = new MoyiUserCheckinRecord();
		member.setModelTypeName("moyi_user_checkin_record");
		member.setName("moyi_user");
		member.setMemberName("moyiUserCheckinRecordList");
		member.setRelationName("moyiUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public RewardDetailRecord rewardDetailRecordListAsMoyiUser() {
		RewardDetailRecord member = new RewardDetailRecord();
		member.setModelTypeName("reward_detail_record");
		member.setName("moyi_user");
		member.setMemberName("rewardDetailRecordListAsMoyiUser");
		member.setRelationName("moyiUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public RewardDetailRecord rewardDetailRecordListAsPayer() {
		RewardDetailRecord member = new RewardDetailRecord();
		member.setModelTypeName("reward_detail_record");
		member.setName("payer");
		member.setMemberName("rewardDetailRecordListAsPayer");
		member.setRelationName("moyiUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Artwork artworkListAsPostBy() {
		Artwork member = new Artwork();
		member.setModelTypeName("artwork");
		member.setName("post_by");
		member.setMemberName("artworkListAsPostBy");
		member.setRelationName("postBy");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Artwork artworkListAsRecommendBy() {
		Artwork member = new Artwork();
		member.setModelTypeName("artwork");
		member.setName("recommend_by");
		member.setMemberName("artworkListAsRecommendBy");
		member.setRelationName("postBy");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkLike artworkLikeList() {
		ArtworkLike member = new ArtworkLike();
		member.setModelTypeName("artwork_like");
		member.setName("moyi_user");
		member.setMemberName("artworkLikeList");
		member.setRelationName("moyiUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkFans artworkFansList() {
		ArtworkFans member = new ArtworkFans();
		member.setModelTypeName("artwork_fans");
		member.setName("fans");
		member.setMemberName("artworkFansList");
		member.setRelationName("fans");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Article articleList() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("post_by");
		member.setMemberName("articleList");
		member.setRelationName("postBy");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EditorSuggestion editorSuggestionList() {
		EditorSuggestion member = new EditorSuggestion();
		member.setModelTypeName("editor_suggestion");
		member.setName("editor");
		member.setMemberName("editorSuggestionList");
		member.setRelationName("editor");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArticleLike articleLikeList() {
		ArticleLike member = new ArticleLike();
		member.setModelTypeName("article_like");
		member.setName("replier");
		member.setMemberName("articleLikeList");
		member.setRelationName("replier");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContentTag contentTagList() {
		ContentTag member = new ContentTag();
		member.setModelTypeName("content_tag");
		member.setName("moyi_user");
		member.setMemberName("contentTagList");
		member.setRelationName("moyiUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Review reviewList() {
		Review member = new Review();
		member.setModelTypeName("review");
		member.setName("reviewer");
		member.setMemberName("reviewList");
		member.setRelationName("reviewer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ReviewLike reviewLikeList() {
		ReviewLike member = new ReviewLike();
		member.setModelTypeName("review_like");
		member.setName("moyi_user");
		member.setMemberName("reviewLikeList");
		member.setRelationName("moyiUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SuperNodeUser superNodeUserList() {
		SuperNodeUser member = new SuperNodeUser();
		member.setModelTypeName("super_node_user");
		member.setName("user");
		member.setMemberName("superNodeUserList");
		member.setRelationName("user");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SuperPartnerUser superPartnerUserList() {
		SuperPartnerUser member = new SuperPartnerUser();
		member.setModelTypeName("super_partner_user");
		member.setName("user");
		member.setMemberName("superPartnerUserList");
		member.setRelationName("user");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MoyiEditorUser moyiEditorUserList() {
		MoyiEditorUser member = new MoyiEditorUser();
		member.setModelTypeName("moyi_editor_user");
		member.setName("user");
		member.setMemberName("moyiEditorUserList");
		member.setRelationName("user");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MoyiColumnAuthor moyiColumnAuthorList() {
		MoyiColumnAuthor member = new MoyiColumnAuthor();
		member.setModelTypeName("moyi_column_author");
		member.setName("user");
		member.setMemberName("moyiColumnAuthorList");
		member.setRelationName("user");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MoyiArtworkReviewAuthor moyiArtworkReviewAuthorList() {
		MoyiArtworkReviewAuthor member = new MoyiArtworkReviewAuthor();
		member.setModelTypeName("moyi_artwork_review_author");
		member.setName("user");
		member.setMemberName("moyiArtworkReviewAuthorList");
		member.setRelationName("user");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MoyiMasterOpinionAuthor moyiMasterOpinionAuthorList() {
		MoyiMasterOpinionAuthor member = new MoyiMasterOpinionAuthor();
		member.setModelTypeName("moyi_master_opinion_author");
		member.setName("user");
		member.setMemberName("moyiMasterOpinionAuthorList");
		member.setRelationName("user");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MoyiUserDailyInkValue moyiUserDailyInkValueList() {
		MoyiUserDailyInkValue member = new MoyiUserDailyInkValue();
		member.setModelTypeName("moyi_user_daily_ink_value");
		member.setName("user");
		member.setMemberName("moyiUserDailyInkValueList");
		member.setRelationName("user");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SpamReport spamReportList() {
		SpamReport member = new SpamReport();
		member.setModelTypeName("spam_report");
		member.setName("report_user");
		member.setMemberName("spamReportList");
		member.setRelationName("reportUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SystemMessage systemMessageListAsMoyiUser() {
		SystemMessage member = new SystemMessage();
		member.setModelTypeName("system_message");
		member.setName("moyi_user");
		member.setMemberName("systemMessageListAsMoyiUser");
		member.setRelationName("moyiUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SystemMessage systemMessageListAsActUser() {
		SystemMessage member = new SystemMessage();
		member.setModelTypeName("system_message");
		member.setName("act_user");
		member.setMemberName("systemMessageListAsActUser");
		member.setRelationName("moyiUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PrivateMessage privateMessageListAsSender() {
		PrivateMessage member = new PrivateMessage();
		member.setModelTypeName("private_message");
		member.setName("sender");
		member.setMemberName("privateMessageListAsSender");
		member.setRelationName("sender");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PrivateMessage privateMessageListAsReceiver() {
		PrivateMessage member = new PrivateMessage();
		member.setModelTypeName("private_message");
		member.setName("receiver");
		member.setMemberName("privateMessageListAsReceiver");
		member.setRelationName("sender");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MoyiExperienceRecord moyiExperienceRecordList() {
		MoyiExperienceRecord member = new MoyiExperienceRecord();
		member.setModelTypeName("moyi_experience_record");
		member.setName("moyi_user");
		member.setMemberName("moyiExperienceRecordList");
		member.setRelationName("moyiUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public UserBlocking userBlockingListAsBlockedUser() {
		UserBlocking member = new UserBlocking();
		member.setModelTypeName("user_blocking");
		member.setName("blocked_user");
		member.setMemberName("userBlockingListAsBlockedUser");
		member.setRelationName("blockedUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public UserBlocking userBlockingListAsSponsor() {
		UserBlocking member = new UserBlocking();
		member.setModelTypeName("user_blocking");
		member.setName("sponsor");
		member.setMemberName("userBlockingListAsSponsor");
		member.setRelationName("blockedUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ReviewBlocking reviewBlockingListAsBlockedUser() {
		ReviewBlocking member = new ReviewBlocking();
		member.setModelTypeName("review_blocking");
		member.setName("blocked_user");
		member.setMemberName("reviewBlockingListAsBlockedUser");
		member.setRelationName("blockedUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ReviewBlocking reviewBlockingListAsSponsor() {
		ReviewBlocking member = new ReviewBlocking();
		member.setModelTypeName("review_blocking");
		member.setName("sponsor");
		member.setMemberName("reviewBlockingListAsSponsor");
		member.setRelationName("blockedUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArticleBlocking articleBlockingList() {
		ArticleBlocking member = new ArticleBlocking();
		member.setModelTypeName("article_blocking");
		member.setName("sponsor");
		member.setMemberName("articleBlockingList");
		member.setRelationName("sponsor");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkBlocking artworkBlockingList() {
		ArtworkBlocking member = new ArtworkBlocking();
		member.setModelTypeName("artwork_blocking");
		member.setName("sponsor");
		member.setMemberName("artworkBlockingList");
		member.setRelationName("sponsor");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PaymentDetail paymentDetailList() {
		PaymentDetail member = new PaymentDetail();
		member.setModelTypeName("payment_detail");
		member.setName("payer");
		member.setMemberName("paymentDetailList");
		member.setRelationName("payer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MoyiShop moyiShopList() {
		MoyiShop member = new MoyiShop();
		member.setModelTypeName("moyi_shop");
		member.setName("shopkeeper");
		member.setMemberName("moyiShopList");
		member.setRelationName("shopkeeper");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MoyiShopCertification moyiShopCertificationList() {
		MoyiShopCertification member = new MoyiShopCertification();
		member.setModelTypeName("moyi_shop_certification");
		member.setName("shopkeeper");
		member.setMemberName("moyiShopCertificationList");
		member.setRelationName("shopkeeper");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MoyiUserAddress moyiUserAddressList() {
		MoyiUserAddress member = new MoyiUserAddress();
		member.setModelTypeName("moyi_user_address");
		member.setName("moyi_user");
		member.setMemberName("moyiUserAddressList");
		member.setRelationName("moyiUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MoyiUserAccount moyiUserAccountList() {
		MoyiUserAccount member = new MoyiUserAccount();
		member.setModelTypeName("moyi_user_account");
		member.setName("user");
		member.setMemberName("moyiUserAccountList");
		member.setRelationName("user");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MoyiUserIbOrder moyiUserIbOrderList() {
		MoyiUserIbOrder member = new MoyiUserIbOrder();
		member.setModelTypeName("moyi_user_ib_order");
		member.setName("moyi_user");
		member.setMemberName("moyiUserIbOrderList");
		member.setRelationName("moyiUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContactImporting contactImportingList() {
		ContactImporting member = new ContactImporting();
		member.setModelTypeName("contact_importing");
		member.setName("user");
		member.setMemberName("contactImportingList");
		member.setRelationName("user");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public WithdrawRecord withdrawRecordList() {
		WithdrawRecord member = new WithdrawRecord();
		member.setModelTypeName("withdraw_record");
		member.setName("moyi_user");
		member.setMemberName("withdrawRecordList");
		member.setRelationName("moyiUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkOwnershipCertificate artworkOwnershipCertificateList() {
		ArtworkOwnershipCertificate member = new ArtworkOwnershipCertificate();
		member.setModelTypeName("artwork_ownership_certificate");
		member.setName("owner");
		member.setMemberName("artworkOwnershipCertificateList");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkCurrentOwner artworkCurrentOwnerList() {
		ArtworkCurrentOwner member = new ArtworkCurrentOwner();
		member.setModelTypeName("artwork_current_owner");
		member.setName("owner");
		member.setMemberName("artworkCurrentOwnerList");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkAuction artworkAuctionListAsSeller() {
		ArtworkAuction member = new ArtworkAuction();
		member.setModelTypeName("artwork_auction");
		member.setName("seller");
		member.setMemberName("artworkAuctionListAsSeller");
		member.setRelationName("seller");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkAuction artworkAuctionListAsBuyer() {
		ArtworkAuction member = new ArtworkAuction();
		member.setModelTypeName("artwork_auction");
		member.setName("buyer");
		member.setMemberName("artworkAuctionListAsBuyer");
		member.setRelationName("seller");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkAuctionBiddingPriceRecord artworkAuctionBiddingPriceRecordList() {
		ArtworkAuctionBiddingPriceRecord member = new ArtworkAuctionBiddingPriceRecord();
		member.setModelTypeName("artwork_auction_bidding_price_record");
		member.setName("bidder");
		member.setMemberName("artworkAuctionBiddingPriceRecordList");
		member.setRelationName("bidder");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkAuctionOrder artworkAuctionOrderListAsSeller() {
		ArtworkAuctionOrder member = new ArtworkAuctionOrder();
		member.setModelTypeName("artwork_auction_order");
		member.setName("seller");
		member.setMemberName("artworkAuctionOrderListAsSeller");
		member.setRelationName("seller");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkAuctionOrder artworkAuctionOrderListAsBuyer() {
		ArtworkAuctionOrder member = new ArtworkAuctionOrder();
		member.setModelTypeName("artwork_auction_order");
		member.setName("buyer");
		member.setMemberName("artworkAuctionOrderListAsBuyer");
		member.setRelationName("seller");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkAuctionOrder artworkAuctionOrderListAsReferee() {
		ArtworkAuctionOrder member = new ArtworkAuctionOrder();
		member.setModelTypeName("artwork_auction_order");
		member.setName("referee");
		member.setMemberName("artworkAuctionOrderListAsReferee");
		member.setRelationName("seller");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkTransactionTracking artworkTransactionTrackingListAsOriginalOwner() {
		ArtworkTransactionTracking member = new ArtworkTransactionTracking();
		member.setModelTypeName("artwork_transaction_tracking");
		member.setName("original_owner");
		member.setMemberName("artworkTransactionTrackingListAsOriginalOwner");
		member.setRelationName("originalOwner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkTransactionTracking artworkTransactionTrackingListAsNewOwner() {
		ArtworkTransactionTracking member = new ArtworkTransactionTracking();
		member.setModelTypeName("artwork_transaction_tracking");
		member.setName("new_owner");
		member.setMemberName("artworkTransactionTrackingListAsNewOwner");
		member.setRelationName("originalOwner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkAuctionComplaint artworkAuctionComplaintList() {
		ArtworkAuctionComplaint member = new ArtworkAuctionComplaint();
		member.setModelTypeName("artwork_auction_complaint");
		member.setName("complainant");
		member.setMemberName("artworkAuctionComplaintList");
		member.setRelationName("complainant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkAuctionComplaintReply artworkAuctionComplaintReplyList() {
		ArtworkAuctionComplaintReply member = new ArtworkAuctionComplaintReply();
		member.setModelTypeName("artwork_auction_complaint_reply");
		member.setName("author");
		member.setMemberName("artworkAuctionComplaintReplyList");
		member.setRelationName("author");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EfficientRecommendation efficientRecommendationListAsReferee() {
		EfficientRecommendation member = new EfficientRecommendation();
		member.setModelTypeName("efficient_recommendation");
		member.setName("referee");
		member.setMemberName("efficientRecommendationListAsReferee");
		member.setRelationName("referee");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EfficientRecommendation efficientRecommendationListAsBidder() {
		EfficientRecommendation member = new EfficientRecommendation();
		member.setModelTypeName("efficient_recommendation");
		member.setName("bidder");
		member.setMemberName("efficientRecommendationListAsBidder");
		member.setRelationName("referee");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public RecommendationIncomeRecord recommendationIncomeRecordList() {
		RecommendationIncomeRecord member = new RecommendationIncomeRecord();
		member.setModelTypeName("recommendation_income_record");
		member.setName("referee");
		member.setMemberName("recommendationIncomeRecordList");
		member.setRelationName("referee");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public AuctionStartNotification auctionStartNotificationList() {
		AuctionStartNotification member = new AuctionStartNotification();
		member.setModelTypeName("auction_start_notification");
		member.setName("bidder");
		member.setMemberName("auctionStartNotificationList");
		member.setRelationName("bidder");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public AuctionBiddingDepositBill auctionBiddingDepositBillList() {
		AuctionBiddingDepositBill member = new AuctionBiddingDepositBill();
		member.setModelTypeName("auction_bidding_deposit_bill");
		member.setName("bidder");
		member.setMemberName("auctionBiddingDepositBillList");
		member.setRelationName("bidder");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public AuctionBiddingDeposit auctionBiddingDepositList() {
		AuctionBiddingDeposit member = new AuctionBiddingDeposit();
		member.setModelTypeName("auction_bidding_deposit");
		member.setName("bidder");
		member.setMemberName("auctionBiddingDepositList");
		member.setRelationName("bidder");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public AuctionBiddingDepositRecord auctionBiddingDepositRecordList() {
		AuctionBiddingDepositRecord member = new AuctionBiddingDepositRecord();
		member.setModelTypeName("auction_bidding_deposit_record");
		member.setName("bidder");
		member.setMemberName("auctionBiddingDepositRecordList");
		member.setRelationName("bidder");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public InkDeed inkDeedListAsHolder() {
		InkDeed member = new InkDeed();
		member.setModelTypeName("ink_deed");
		member.setName("holder");
		member.setMemberName("inkDeedListAsHolder");
		member.setRelationName("holder");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public InkDeed inkDeedListAsSeller() {
		InkDeed member = new InkDeed();
		member.setModelTypeName("ink_deed");
		member.setName("seller");
		member.setMemberName("inkDeedListAsSeller");
		member.setRelationName("holder");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public InkDeed inkDeedListAsBuyer() {
		InkDeed member = new InkDeed();
		member.setModelTypeName("ink_deed");
		member.setName("buyer");
		member.setMemberName("inkDeedListAsBuyer");
		member.setRelationName("holder");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public InkDeedIssueBill inkDeedIssueBillList() {
		InkDeedIssueBill member = new InkDeedIssueBill();
		member.setModelTypeName("ink_deed_issue_bill");
		member.setName("seller");
		member.setMemberName("inkDeedIssueBillList");
		member.setRelationName("seller");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public InkDeedHoldingStatistic inkDeedHoldingStatisticList() {
		InkDeedHoldingStatistic member = new InkDeedHoldingStatistic();
		member.setModelTypeName("ink_deed_holding_statistic");
		member.setName("holder");
		member.setMemberName("inkDeedHoldingStatisticList");
		member.setRelationName("holder");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public InkDeedEntryOrder inkDeedEntryOrderList() {
		InkDeedEntryOrder member = new InkDeedEntryOrder();
		member.setModelTypeName("ink_deed_entry_order");
		member.setName("seller");
		member.setMemberName("inkDeedEntryOrderList");
		member.setRelationName("seller");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public InkDeedOrder inkDeedOrderList() {
		InkDeedOrder member = new InkDeedOrder();
		member.setModelTypeName("ink_deed_order");
		member.setName("buyer");
		member.setMemberName("inkDeedOrderList");
		member.setRelationName("buyer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public InkDeedCashRecord inkDeedCashRecordList() {
		InkDeedCashRecord member = new InkDeedCashRecord();
		member.setModelTypeName("ink_deed_cash_record");
		member.setName("holder");
		member.setMemberName("inkDeedCashRecordList");
		member.setRelationName("holder");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public InkDeedTradeRecord inkDeedTradeRecordListAsSeller() {
		InkDeedTradeRecord member = new InkDeedTradeRecord();
		member.setModelTypeName("ink_deed_trade_record");
		member.setName("seller");
		member.setMemberName("inkDeedTradeRecordListAsSeller");
		member.setRelationName("seller");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public InkDeedTradeRecord inkDeedTradeRecordListAsBuyer() {
		InkDeedTradeRecord member = new InkDeedTradeRecord();
		member.setModelTypeName("ink_deed_trade_record");
		member.setName("buyer");
		member.setMemberName("inkDeedTradeRecordListAsBuyer");
		member.setRelationName("seller");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ShopReferralRecord shopReferralRecordListAsReferee() {
		ShopReferralRecord member = new ShopReferralRecord();
		member.setModelTypeName("shop_referral_record");
		member.setName("referee");
		member.setMemberName("shopReferralRecordListAsReferee");
		member.setRelationName("referee");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ShopReferralRecord shopReferralRecordListAsShopkeeper() {
		ShopReferralRecord member = new ShopReferralRecord();
		member.setModelTypeName("shop_referral_record");
		member.setName("shopkeeper");
		member.setMemberName("shopReferralRecordListAsShopkeeper");
		member.setRelationName("referee");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ShopOpeningRewardRecord shopOpeningRewardRecordList() {
		ShopOpeningRewardRecord member = new ShopOpeningRewardRecord();
		member.setModelTypeName("shop_opening_reward_record");
		member.setName("beneficiary");
		member.setMemberName("shopOpeningRewardRecordList");
		member.setRelationName("beneficiary");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FavoriteShopOfUser favoriteShopOfUserList() {
		FavoriteShopOfUser member = new FavoriteShopOfUser();
		member.setModelTypeName("favorite_shop_of_user");
		member.setName("actor_moyi_user");
		member.setMemberName("favoriteShopOfUserList");
		member.setRelationName("actorMoyiUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public UserFrozenAccountRecord userFrozenAccountRecordListAsOwner() {
		UserFrozenAccountRecord member = new UserFrozenAccountRecord();
		member.setModelTypeName("user_frozen_account_record");
		member.setName("owner");
		member.setMemberName("userFrozenAccountRecordListAsOwner");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public UserFrozenAccountRecord userFrozenAccountRecordListAsPayer() {
		UserFrozenAccountRecord member = new UserFrozenAccountRecord();
		member.setModelTypeName("user_frozen_account_record");
		member.setName("payer");
		member.setMemberName("userFrozenAccountRecordListAsPayer");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public InkDeedOrderLineItem inkDeedOrderLineItemListAsSeller() {
		InkDeedOrderLineItem member = new InkDeedOrderLineItem();
		member.setModelTypeName("ink_deed_order_line_item");
		member.setName("seller");
		member.setMemberName("inkDeedOrderLineItemListAsSeller");
		member.setRelationName("seller");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public InkDeedOrderLineItem inkDeedOrderLineItemListAsBuyer() {
		InkDeedOrderLineItem member = new InkDeedOrderLineItem();
		member.setModelTypeName("ink_deed_order_line_item");
		member.setName("buyer");
		member.setMemberName("inkDeedOrderLineItemListAsBuyer");
		member.setRelationName("seller");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("name");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute gender(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_gender");
		// member.setName("gender");
		member.setName("gender");
		useMember(member);
		return member;
	}

	public StringAttribute mobile(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_china_mobile_phone");
		// member.setName("mobile");
		member.setName("mobile");
		useMember(member);
		return member;
	}

	public StringAttribute avatarImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("avatarImage");
		member.setName("avatar_image");
		useMember(member);
		return member;
	}

	public StringAttribute selfIntroduction(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("selfIntroduction");
		member.setName("self_introduction");
		useMember(member);
		return member;
	}

	public BooleanAttribute isCommunityPartner(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("isCommunityPartner");
		member.setName("is_community_partner");
		useMember(member);
		return member;
	}

	public NumberAttribute personalInkCoinAccount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		// member.setName("personalInkCoinAccount");
		member.setName("personal_ink_coin_account");
		useMember(member);
		return member;
	}

	public NumberAttribute rewardInkCoinAccount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		// member.setName("rewardInkCoinAccount");
		member.setName("reward_ink_coin_account");
		useMember(member);
		return member;
	}

	public NumberAttribute userLevelPoints(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("userLevelPoints");
		member.setName("user_level_points");
		useMember(member);
		return member;
	}

	public StringAttribute city(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("city");
		member.setName("city");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("createTime");
		member.setName("create_time");
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

