package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Article extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.article.Article";
	}
	// 枚举对象

	// 引用的对象

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

	public ArticleType articleType() {
		ArticleType member = new ArticleType();
		member.setModelTypeName("article_type");
		member.setName("article_type");
		member.setMemberName("articleType");
		member.setReferDirection(true);
		member.setRelationName("articleType");
		append(member);
		return member;
	}

	public MasterColumn masterColumn() {
		MasterColumn member = new MasterColumn();
		member.setModelTypeName("master_column");
		member.setName("master_column");
		member.setMemberName("masterColumn");
		member.setReferDirection(true);
		member.setRelationName("masterColumn");
		append(member);
		return member;
	}

	public Artwork relatedArtwork() {
		Artwork member = new Artwork();
		member.setModelTypeName("artwork");
		member.setName("related_artwork");
		member.setMemberName("relatedArtwork");
		member.setReferDirection(true);
		member.setRelationName("relatedArtwork");
		append(member);
		return member;
	}

	public Section section() {
		Section member = new Section();
		member.setModelTypeName("section");
		member.setName("section");
		member.setMemberName("section");
		member.setReferDirection(true);
		member.setRelationName("section");
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
		member.setName("linked_article");
		member.setMemberName("slideList");
		member.setRelationName("linkedArticle");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ChannelArticle channelArticleList() {
		ChannelArticle member = new ChannelArticle();
		member.setModelTypeName("channel_article");
		member.setName("article");
		member.setMemberName("channelArticleList");
		member.setRelationName("article");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ModeratorPunishment moderatorPunishmentList() {
		ModeratorPunishment member = new ModeratorPunishment();
		member.setModelTypeName("moderator_punishment");
		member.setName("violation_article");
		member.setMemberName("moderatorPunishmentList");
		member.setRelationName("violationArticle");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EliteArticle eliteArticleList() {
		EliteArticle member = new EliteArticle();
		member.setModelTypeName("elite_article");
		member.setName("article");
		member.setMemberName("eliteArticleList");
		member.setRelationName("article");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SectionTopArticle sectionTopArticleList() {
		SectionTopArticle member = new SectionTopArticle();
		member.setModelTypeName("section_top_article");
		member.setName("article");
		member.setMemberName("sectionTopArticleList");
		member.setRelationName("article");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SectionBroadcastArticle sectionBroadcastArticleList() {
		SectionBroadcastArticle member = new SectionBroadcastArticle();
		member.setModelTypeName("section_broadcast_article");
		member.setName("article");
		member.setMemberName("sectionBroadcastArticleList");
		member.setRelationName("article");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArticleBonus articleBonusList() {
		ArticleBonus member = new ArticleBonus();
		member.setModelTypeName("article_bonus");
		member.setName("article");
		member.setMemberName("articleBonusList");
		member.setRelationName("article");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public RewardDetailRecord rewardDetailRecordList() {
		RewardDetailRecord member = new RewardDetailRecord();
		member.setModelTypeName("reward_detail_record");
		member.setName("article");
		member.setMemberName("rewardDetailRecordList");
		member.setRelationName("article");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EditorSuggestion editorSuggestionList() {
		EditorSuggestion member = new EditorSuggestion();
		member.setModelTypeName("editor_suggestion");
		member.setName("article");
		member.setMemberName("editorSuggestionList");
		member.setRelationName("article");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArticleImage articleImageList() {
		ArticleImage member = new ArticleImage();
		member.setModelTypeName("article_image");
		member.setName("article");
		member.setMemberName("articleImageList");
		member.setRelationName("article");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArticleLike articleLikeList() {
		ArticleLike member = new ArticleLike();
		member.setModelTypeName("article_like");
		member.setName("article");
		member.setMemberName("articleLikeList");
		member.setRelationName("article");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContentTag contentTagList() {
		ContentTag member = new ContentTag();
		member.setModelTypeName("content_tag");
		member.setName("article");
		member.setMemberName("contentTagList");
		member.setRelationName("article");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Review reviewList() {
		Review member = new Review();
		member.setModelTypeName("review");
		member.setName("article");
		member.setMemberName("reviewList");
		member.setRelationName("article");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SpamReport spamReportList() {
		SpamReport member = new SpamReport();
		member.setModelTypeName("spam_report");
		member.setName("spam_article");
		member.setMemberName("spamReportList");
		member.setRelationName("spamArticle");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArticleBlocking articleBlockingList() {
		ArticleBlocking member = new ArticleBlocking();
		member.setModelTypeName("article_blocking");
		member.setName("blocked_article");
		member.setMemberName("articleBlockingList");
		member.setRelationName("blockedArticle");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public TipArticle tipArticleList() {
		TipArticle member = new TipArticle();
		member.setModelTypeName("tip_article");
		member.setName("article");
		member.setMemberName("tipArticleList");
		member.setRelationName("article");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PageSlide pageSlideList() {
		PageSlide member = new PageSlide();
		member.setModelTypeName("page_slide");
		member.setName("article");
		member.setMemberName("pageSlideList");
		member.setRelationName("article");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("title");
		member.setName("title");
		useMember(member);
		return member;
	}

	public DateTimeAttribute postDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		// member.setName("postDate");
		member.setName("post_date");
		useMember(member);
		return member;
	}

	public StringAttribute sourceInfo(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("sourceInfo");
		member.setName("source_info");
		useMember(member);
		return member;
	}

	public NumberAttribute articleReward(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		// member.setName("articleReward");
		member.setName("article_reward");
		useMember(member);
		return member;
	}

	public NumberAttribute articleLikeCount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("articleLikeCount");
		member.setName("article_like_count");
		useMember(member);
		return member;
	}

	public NumberAttribute articleReviewCount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("articleReviewCount");
		member.setName("article_review_count");
		useMember(member);
		return member;
	}

	public NumberAttribute articlePageViewCount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("articlePageViewCount");
		member.setName("article_page_view_count");
		useMember(member);
		return member;
	}

	public BooleanAttribute isEliteArticle(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("isEliteArticle");
		member.setName("is_elite_article");
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

