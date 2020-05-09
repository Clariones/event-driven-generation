package com.terapico.viewcomponent.spec;

import java.util.Map;

public class AllSpec extends BaseSpec{
	static {
		with("action").$("code").$("title").$("image url").$("icon").$("disabled").booleanType().$("group").$("confirm");
		with("user").$("name").$("brief").$("avatar");
		with("slide").$("name").$("image url").$("video url");
		with("section").$("title").$("brief").$("icon").$("view group").$("display mode").$("horizontal").booleanType();
		with("action group").$("title").$("brief").$("icon").$("display mode").$("action list").listType("VComponentAction");
		with("card in section").$("title").$("brief").$("image url").$("status").$("flag").$("level").$("mode");
		with("card in list").$("title").$("brief").$("image url").$("status").$("display mode").$("document url").$("create time").datetimeType().$("action list").listType("VComponentAction").$("flag").$("level").$("mode");



		dump();
	}

	public static Map<String, ComponentInfo> getAllComponents() {
		return allComponents;
	}
}
