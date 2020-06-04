package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class InkDeedEntryOrderStatistic extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.inkdeedentryorderstatistic.InkDeedEntryOrderStatistic";
	}
	// 枚举对象

	// 引用的对象

	public ArtworkAuction auction() {
		ArtworkAuction member = new ArtworkAuction();
		member.setModelTypeName("artwork_auction");
		member.setName("auction");
		member.setMemberName("auction");
		member.setReferDirection(true);
		member.setRelationName("auction");
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

	public NumberAttribute totalIssuedQuantity(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("totalIssuedQuantity");
		member.setName("total_issued_quantity");
		useMember(member);
		return member;
	}

	public NumberAttribute minimalPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("minimalPrice");
		member.setName("minimal_price");
		useMember(member);
		return member;
	}

	public NumberAttribute maximumPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("maximumPrice");
		member.setName("maximum_price");
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

