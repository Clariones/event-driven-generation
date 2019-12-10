package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class MoyiPlatformConfiguration extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.moyiplatformconfiguration.MoyiPlatformConfiguration";
	}
	// 枚举对象

	// 引用的对象

	public Moyi moyi() {
		Moyi member = new Moyi();
		member.setModelTypeName("moyi");
		member.setName("moyi");
		member.setMemberName("moyi");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public RewardValueOption rewardValueOptionList() {
		RewardValueOption member = new RewardValueOption();
		member.setModelTypeName("reward_value_option");
		member.setName("config");
		member.setMemberName("rewardValueOptionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public OperationPage operationPageList() {
		OperationPage member = new OperationPage();
		member.setModelTypeName("operation_page");
		member.setName("config");
		member.setMemberName("operationPageList");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute inviteUserImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("invite_user_image");
		useMember(member);
		return member;
	}

	public StringAttribute communityDeclarationLink(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("community_declaration_link");
		useMember(member);
		return member;
	}

	public StringAttribute aboutUsLink(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("about_us_link");
		useMember(member);
		return member;
	}

	public StringAttribute appDownloadLink(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("app_download_link");
		useMember(member);
		return member;
	}

	public StringAttribute defaultUserLogo(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("default_user_logo");
		useMember(member);
		return member;
	}

	public StringAttribute defaultArtistLogo(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("default_artist_logo");
		useMember(member);
		return member;
	}

	public StringAttribute emptyImageWhenShare(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("empty_image_when_share");
		useMember(member);
		return member;
	}

	public NumberAttribute rewardSettleDays(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("reward_settle_days");
		useMember(member);
		return member;
	}

	public StringAttribute userArtworkEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("user_artwork_empty");
		useMember(member);
		return member;
	}

	public StringAttribute userArticleEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("user_article_empty");
		useMember(member);
		return member;
	}

	public StringAttribute userFansEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("user_fans_empty");
		useMember(member);
		return member;
	}

	public StringAttribute userWatchEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("user_watch_empty");
		useMember(member);
		return member;
	}

	public StringAttribute userReviewEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("user_review_empty");
		useMember(member);
		return member;
	}

	public StringAttribute articleReviewEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("article_review_empty");
		useMember(member);
		return member;
	}

	public StringAttribute artworkResumeEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("artwork_resume_empty");
		useMember(member);
		return member;
	}

	public StringAttribute artworkReviewEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("artwork_review_empty");
		useMember(member);
		return member;
	}

	public StringAttribute artworkSuperReviewEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("artwork_super_review_empty");
		useMember(member);
		return member;
	}

	public StringAttribute artworkRenderEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("artwork_render_empty");
		useMember(member);
		return member;
	}

	public StringAttribute userSettingBlockingEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("user_setting_blocking_empty");
		useMember(member);
		return member;
	}

	public StringAttribute sectionModeratorEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("section_moderator_empty");
		useMember(member);
		return member;
	}

	public StringAttribute sectionArticleEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("section_article_empty");
		useMember(member);
		return member;
	}

	public StringAttribute sectionEliteArticleEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("section_elite_article_empty");
		useMember(member);
		return member;
	}

	public StringAttribute sectionArtworkEmtpy(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("section_artwork_emtpy");
		useMember(member);
		return member;
	}

	public StringAttribute h5ServerPrefix(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("h5_server_prefix");
		useMember(member);
		return member;
	}

	public StringAttribute testServerPrefix(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("test_server_prefix");
		useMember(member);
		return member;
	}

	public StringAttribute previewServerPrefix(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("preview_server_prefix");
		useMember(member);
		return member;
	}

	public StringAttribute appVersion(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("app_version");
		useMember(member);
		return member;
	}

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

