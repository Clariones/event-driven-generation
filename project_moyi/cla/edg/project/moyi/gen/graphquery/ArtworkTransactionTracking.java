package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ArtworkTransactionTracking extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.artworktransactiontracking.ArtworkTransactionTracking";
	}
	// 枚举对象

	// 引用的对象

	public Artwork artwork() {
		Artwork member = new Artwork();
		member.setModelTypeName("artwork");
		member.setName("artwork");
		member.setMemberName("artwork");
		member.setReferDirection(true);
		member.setRelationName("artwork");
		append(member);
		return member;
	}

	public ArtworkOwnershipCertificate certificate() {
		ArtworkOwnershipCertificate member = new ArtworkOwnershipCertificate();
		member.setModelTypeName("artwork_ownership_certificate");
		member.setName("certificate");
		member.setMemberName("certificate");
		member.setReferDirection(true);
		member.setRelationName("certificate");
		append(member);
		return member;
	}

	public MainOrder mainOrder() {
		MainOrder member = new MainOrder();
		member.setModelTypeName("main_order");
		member.setName("main_order");
		member.setMemberName("mainOrder");
		member.setReferDirection(true);
		member.setRelationName("mainOrder");
		append(member);
		return member;
	}

	public MoyiUser originalOwner() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("original_owner");
		member.setMemberName("originalOwner");
		member.setReferDirection(true);
		member.setRelationName("originalOwner");
		append(member);
		return member;
	}

	public MoyiUser newOwner() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("new_owner");
		member.setMemberName("newOwner");
		member.setReferDirection(true);
		member.setRelationName("newOwner");
		append(member);
		return member;
	}

	// 被引用的对象


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

	public StringAttribute detail(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("detail");
		member.setName("detail");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

