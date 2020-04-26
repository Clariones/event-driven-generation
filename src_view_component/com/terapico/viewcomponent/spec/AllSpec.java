package com.terapico.viewcomponent.spec;

import java.util.Map;

public class AllSpec extends BaseSpec{
	static {
		with("action").$("code").$("title").$("image url").$("icon").$("disabled").booleanType().$("group");
		with("user").$("name").$("brief").$("avatar");
		with("slide").$("name").$("image url").$("video url");
		with("section").$("title").$("brief").$("icon").$("view group").$("display mode");
		with("card in section").$("title").$("brief").$("image url").$("status");
		with("card in list").$("title").$("brief").$("image url").$("status").$("display mode").$("document url").$("create time").datetimeType().$("action list").listType("VComponentAction");



		dump();
	}

	public static Map<String, ComponentInfo> getAllComponents() {
		return allComponents;
	}
}
