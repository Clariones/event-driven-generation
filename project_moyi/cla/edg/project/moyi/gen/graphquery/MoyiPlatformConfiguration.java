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
		member.setName("inviteUserImage");
		useMember(member);
		return member;
	}

	public StringAttribute communityDeclarationLink(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("communityDeclarationLink");
		useMember(member);
		return member;
	}

	public StringAttribute aboutUsLink(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("aboutUsLink");
		useMember(member);
		return member;
	}

	public StringAttribute appDownloadLink(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("appDownloadLink");
		useMember(member);
		return member;
	}

	public StringAttribute defaultUserLogo(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("defaultUserLogo");
		useMember(member);
		return member;
	}

	public StringAttribute defaultArtistLogo(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("defaultArtistLogo");
		useMember(member);
		return member;
	}

	public StringAttribute emptyImageWhenShare(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("emptyImageWhenShare");
		useMember(member);
		return member;
	}

	public NumberAttribute rewardSettleDays(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("rewardSettleDays");
		useMember(member);
		return member;
	}

	public StringAttribute userArtworkEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("userArtworkEmpty");
		useMember(member);
		return member;
	}

	public StringAttribute userArticleEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("userArticleEmpty");
		useMember(member);
		return member;
	}

	public StringAttribute userFansEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("userFansEmpty");
		useMember(member);
		return member;
	}

	public StringAttribute userWatchEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("userWatchEmpty");
		useMember(member);
		return member;
	}

	public StringAttribute userReviewEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("userReviewEmpty");
		useMember(member);
		return member;
	}

	public StringAttribute articleReviewEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("articleReviewEmpty");
		useMember(member);
		return member;
	}

	public StringAttribute artworkResumeEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("artworkResumeEmpty");
		useMember(member);
		return member;
	}

	public StringAttribute artworkReviewEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("artworkReviewEmpty");
		useMember(member);
		return member;
	}

	public StringAttribute artworkSuperReviewEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("artworkSuperReviewEmpty");
		useMember(member);
		return member;
	}

	public StringAttribute artworkRenderEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("artworkRenderEmpty");
		useMember(member);
		return member;
	}

	public StringAttribute userSettingBlockingEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("userSettingBlockingEmpty");
		useMember(member);
		return member;
	}

	public StringAttribute sectionModeratorEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("sectionModeratorEmpty");
		useMember(member);
		return member;
	}

	public StringAttribute sectionArticleEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("sectionArticleEmpty");
		useMember(member);
		return member;
	}

	public StringAttribute sectionEliteArticleEmpty(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("sectionEliteArticleEmpty");
		useMember(member);
		return member;
	}

	public StringAttribute sectionArtworkEmtpy(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("sectionArtworkEmtpy");
		useMember(member);
		return member;
	}

	public StringAttribute h5ServerPrefix(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("h5ServerPrefix");
		useMember(member);
		return member;
	}

	public StringAttribute testServerPrefix(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("testServerPrefix");
		useMember(member);
		return member;
	}

	public StringAttribute previewServerPrefix(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("previewServerPrefix");
		useMember(member);
		return member;
	}

	public StringAttribute appVersion(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("appVersion");
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

