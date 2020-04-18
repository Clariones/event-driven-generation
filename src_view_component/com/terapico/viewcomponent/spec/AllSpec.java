package com.terapico.viewcomponent.spec;

import java.util.Map;

public class AllSpec extends BaseSpec{
	static {
		with("action").$("code").$("title").$("image url").$("icon").$("disabled").booleanType().$("group");
		with("user").$("name").$("brief").$("avatar");
		with("slide").$("name").$("image url").$("video url");
		with("section").$("title").$("brief").$("icon").$("view group").$("display mode");
		with("card in section").$("title").$("brief").$("imageUrl");


		dump();
	}

	public static Map<String, ComponentInfo> getAllComponents() {
		return allComponents;
	}
}
