package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class ArtworkImage extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.artworkimage.ArtworkImage";
	}
	// 枚举对象

	// 引用的对象

	public Artwork artwork() {
		Artwork member = new Artwork();
		member.setModelTypeName("artwork");
		member.setName("artwork");
		member.setMemberName("artwork");
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

	public StringAttribute image(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image");
		useMember(member);
		return member;
	}

	public NumberAttribute imageWidth(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("image_width");
		useMember(member);
		return member;
	}

	public NumberAttribute imageHeight(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("image_height");
		useMember(member);
		return member;
	}

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("description");
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

