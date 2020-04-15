package com.terapico.viewcomponent.spec;

import java.util.Map;

public class AllSpec extends BaseSpec{
	static {
		with("action").$("code").$("title").$("image url").$("icon").$("disabled").booleanType();
		with("user").$("name").$("brief").$("avatar");
		dump();
	}

	public static Map<String, ComponentInfo> getAllComponents() {
		return allComponents;
	}
}
