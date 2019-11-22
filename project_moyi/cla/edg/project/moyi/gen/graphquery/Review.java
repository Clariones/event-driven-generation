package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class Review extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.review.Review";
	}
	// 枚举对象

	// 引用的对象

	public Article article() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("article");
		member.setMemberName("article");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Artwork artwork() {
		Artwork member = new Artwork();
		member.setModelTypeName("artwork");
		member.setName("artwork");
		member.setMemberName("artwork");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MoyiUser reviewer() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("reviewer");
		member.setMemberName("reviewer");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public SurvivalStatus active() {
		SurvivalStatus member = new SurvivalStatus();
		member.setModelTypeName("survival_status");
		member.setName("active");
		member.setMemberName("active");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public ModeratorPunishment moderatorPunishmentList() {
		ModeratorPunishment member = new ModeratorPunishment();
		member.setModelTypeName("moderator_punishment");
		member.setName("violation_review");
		member.setMemberName("moderatorPunishmentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public RewardDetailRecord rewardDetailRecordList() {
		RewardDetailRecord member = new RewardDetailRecord();
		member.setModelTypeName("reward_detail_record");
		member.setName("review");
		member.setMemberName("rewardDetailRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ReviewLike reviewLikeList() {
		ReviewLike member = new ReviewLike();
		member.setModelTypeName("review_like");
		member.setName("review");
		member.setMemberName("reviewLikeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public SpamReport spamReportList() {
		SpamReport member = new SpamReport();
		member.setModelTypeName("spam_report");
		member.setName("spam_review");
		member.setMemberName("spamReportList");
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

	public StringAttribute reviewContent(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("reviewContent");
		useMember(member);
		return member;
	}

	public StringAttribute quoteReviewId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("quoteReviewId");
		useMember(member);
		return member;
	}

	public NumberAttribute inkCoinValue(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("inkCoinValue");
		useMember(member);
		return member;
	}

	public DateTimeAttribute reviewTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		member.setName("reviewTime");
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

