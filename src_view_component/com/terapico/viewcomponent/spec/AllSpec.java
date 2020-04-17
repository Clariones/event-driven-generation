package com.terapico.viewcomponent.spec;

import java.util.Map;

public class AllSpec extends BaseSpec{
	static {
		with("action").$("code").$("title").$("image url").$("icon").$("disabled").booleanType().$("group");
		with("user").$("name").$("brief").$("avatar");
		with("slide").$("name").$("image url").$("video url");

		dump();
	}

	public static Map<String, ComponentInfo> getAllComponents() {
		return allComponents;
	}
}
