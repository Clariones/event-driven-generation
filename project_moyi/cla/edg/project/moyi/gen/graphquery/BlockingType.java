package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class BlockingType extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.blockingtype.BlockingType";
	}
	// 枚举对象
	public static EnumAttribute USER_LEVEL = new EnumAttribute("com.terapico.moyi.blockingtype.BlockingType", "USER_LEVEL");
	public static EnumAttribute SYSTEM_LEVEL = new EnumAttribute("com.terapico.moyi.blockingtype.BlockingType", "SYSTEM_LEVEL");

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
	
	public UserBlocking userBlockingList() {
		UserBlocking member = new UserBlocking();
		member.setModelTypeName("user_blocking");
		member.setName("blocking_type");
		member.setMemberName("userBlockingList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ReviewBlocking reviewBlockingList() {
		ReviewBlocking member = new ReviewBlocking();
		member.setModelTypeName("review_blocking");
		member.setName("blocking_type");
		member.setMemberName("reviewBlockingList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ArticleBlocking articleBlockingList() {
		ArticleBlocking member = new ArticleBlocking();
		member.setModelTypeName("article_blocking");
		member.setName("blocking_type");
		member.setMemberName("articleBlockingList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ArtworkBlocking artworkBlockingList() {
		ArtworkBlocking member = new ArtworkBlocking();
		member.setModelTypeName("artwork_blocking");
		member.setName("blocking_type");
		member.setMemberName("artworkBlockingList");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("code");
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

