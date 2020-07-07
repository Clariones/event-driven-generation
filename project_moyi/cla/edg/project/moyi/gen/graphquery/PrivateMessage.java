package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PrivateMessage extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.privatemessage.PrivateMessage";
  }
  // 枚举对象

  // 引用的对象

  public MoyiUser sender() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("sender");
    member.setMemberName("sender");
    member.setReferDirection(true);
    member.setRelationName("sender");
    append(member);
    return member;
  }

  public MoyiUser receiver() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("receiver");
    member.setMemberName("receiver");
    member.setReferDirection(true);
    member.setRelationName("receiver");
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

  // 普通属性

  public StringAttribute id() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("id");
    member.setName("id");
    useMember(member);
    return member;
  }

  public StringAttribute messageText() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("messageText");
    member.setName("message_text");
    useMember(member);
    return member;
  }

  public StringAttribute messageImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("messageImage");
    member.setName("message_image");
    useMember(member);
    return member;
  }

  public DateTimeAttribute sendTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("sendTime");
    member.setName("send_time");
    useMember(member);
    return member;
  }

  public BooleanAttribute alreadyRead() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("alreadyRead");
    member.setName("already_read");
    useMember(member);
    return member;
  }

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
