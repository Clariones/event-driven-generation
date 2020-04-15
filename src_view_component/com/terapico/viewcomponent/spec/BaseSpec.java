package com.terapico.viewcomponent.spec;

import java.util.HashMap;
import java.util.Map;

import com.terapico.generator.Utils;

public class BaseSpec {
	protected static Map<String, ComponentInfo> allComponents = new HashMap<>();
	
	protected static ComponentInfo with(String name) {
		String stdName = name.trim().toLowerCase();
		ComponentInfo cmpt = allComponents.get(stdName);
		if (cmpt == null) {
			cmpt = new ComponentInfo();
			allComponents.put(stdName, cmpt);
		}
		cmpt.setName(name);
		return cmpt;
	}

	protected static void dump() {
		System.out.println(Utils.toJson(allComponents, true));
	}


	
}
