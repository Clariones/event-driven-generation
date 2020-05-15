package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class DeliverArtwork extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.deliverartwork.DeliverArtwork";
	}
	// 枚举对象

	// 引用的对象

	public ArtworkType artworkType() {
		ArtworkType member = new ArtworkType();
		member.setModelTypeName("artwork_type");
		member.setName("artwork_type");
		member.setMemberName("artworkType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public BooleanAttribute authorStatement(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("author_statement");
		useMember(member);
		return member;
	}

	public BooleanAttribute holderStatement(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("holder_statement");
		useMember(member);
		return member;
	}

	public StringAttribute artworkName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("artwork_name");
		useMember(member);
		return member;
	}

	public StringAttribute artworkImages(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("artwork_images");
		useMember(member);
		return member;
	}

	public StringAttribute artworkDescription(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("artwork_description");
		useMember(member);
		return member;
	}

	public StringAttribute artworkCertificates(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("artwork_certificates");
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

