package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ArtworkOwnershipCertificate extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.artworkownershipcertificate.ArtworkOwnershipCertificate";
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

	public MoyiUser owner() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("owner");
		member.setMemberName("owner");
		member.setReferDirection(true);
		member.setRelationName("owner");
		append(member);
		return member;
	}

	public CertificateStatus certificateStatus() {
		CertificateStatus member = new CertificateStatus();
		member.setModelTypeName("certificate_status");
		member.setName("certificate_status");
		member.setMemberName("certificateStatus");
		member.setReferDirection(true);
		member.setRelationName("certificateStatus");
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

	public ArtworkOwnershipCertificateImage artworkOwnershipCertificateImageList() {
		ArtworkOwnershipCertificateImage member = new ArtworkOwnershipCertificateImage();
		member.setModelTypeName("artwork_ownership_certificate_image");
		member.setName("artwork_ownership_certificate");
		member.setMemberName("artworkOwnershipCertificateImageList");
		member.setRelationName("artworkOwnershipCertificate");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkOwnershipCertificateBill artworkOwnershipCertificateBillList() {
		ArtworkOwnershipCertificateBill member = new ArtworkOwnershipCertificateBill();
		member.setModelTypeName("artwork_ownership_certificate_bill");
		member.setName("certificate");
		member.setMemberName("artworkOwnershipCertificateBillList");
		member.setRelationName("certificate");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkAuction artworkAuctionList() {
		ArtworkAuction member = new ArtworkAuction();
		member.setModelTypeName("artwork_auction");
		member.setName("artwork_ownership_certificate");
		member.setMemberName("artworkAuctionList");
		member.setRelationName("artworkOwnershipCertificate");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkAuctionOrder artworkAuctionOrderList() {
		ArtworkAuctionOrder member = new ArtworkAuctionOrder();
		member.setModelTypeName("artwork_auction_order");
		member.setName("artwork_ownership_certificate");
		member.setMemberName("artworkAuctionOrderList");
		member.setRelationName("artworkOwnershipCertificate");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkTransactionTracking artworkTransactionTrackingList() {
		ArtworkTransactionTracking member = new ArtworkTransactionTracking();
		member.setModelTypeName("artwork_transaction_tracking");
		member.setName("certificate");
		member.setMemberName("artworkTransactionTrackingList");
		member.setRelationName("certificate");
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

	public BooleanAttribute applyByAuthor(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("applyByAuthor");
		member.setName("apply_by_author");
		useMember(member);
		return member;
	}

	public StringAttribute ownershipCertificateImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("ownershipCertificateImage");
		member.setName("ownership_certificate_image");
		useMember(member);
		return member;
	}

	public StringAttribute artworkSize(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("artworkSize");
		member.setName("artwork_size");
		useMember(member);
		return member;
	}

	public StringAttribute artworkMaterial(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("artworkMaterial");
		member.setName("artwork_material");
		useMember(member);
		return member;
	}

	public StringAttribute artworkDecade(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("artworkDecade");
		member.setName("artwork_decade");
		useMember(member);
		return member;
	}

	public BooleanAttribute framed(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("framed");
		member.setName("framed");
		useMember(member);
		return member;
	}

	public StringAttribute certificateImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("certificateImage");
		member.setName("certificate_image");
		useMember(member);
		return member;
	}

	public StringAttribute signatureImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("signatureImage");
		member.setName("signature_image");
		useMember(member);
		return member;
	}

	public StringAttribute authorName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("authorName");
		member.setName("author_name");
		useMember(member);
		return member;
	}

	public StringAttribute ownershipProofImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("ownershipProofImage");
		member.setName("ownership_proof_image");
		useMember(member);
		return member;
	}

	public BooleanAttribute promised(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("promised");
		member.setName("promised");
		useMember(member);
		return member;
	}

	public BooleanAttribute fakeACompensableThree(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("fakeACompensableThree");
		member.setName("fake_acompensable_three");
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

	public DateTimeAttribute inChainTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		// member.setName("inChainTime");
		member.setName("in_chain_time");
		useMember(member);
		return member;
	}

	public StringAttribute bumoTransaction(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("bumoTransaction");
		member.setName("bumo_transaction");
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

