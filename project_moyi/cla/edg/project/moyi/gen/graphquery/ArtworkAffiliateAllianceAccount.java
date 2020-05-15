package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class ArtworkAffiliateAllianceAccount extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.artworkaffiliateallianceaccount.ArtworkAffiliateAllianceAccount";
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
	
	public ArtworkAffiliateAllianceAccountRecord artworkAffiliateAllianceAccountRecordList() {
		ArtworkAffiliateAllianceAccountRecord member = new ArtworkAffiliateAllianceAccountRecord();
		member.setModelTypeName("artwork_affiliate_alliance_account_record");
		member.setName("account");
		member.setMemberName("artworkAffiliateAllianceAccountRecordList");
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

	public NumberAttribute balance(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("balance");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		member.setName("last_update_time");
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

