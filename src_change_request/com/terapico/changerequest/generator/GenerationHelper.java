package com.terapico.changerequest.generator;

import java.util.Map;

import com.terapico.changerequest.builder.OutputName;

import cla.edg.Utils;

public class GenerationHelper {
	public String getCRName(Map<String, Object> crSpec) {
		return Utils.toJavaConstStyle((String) crSpec.get(OutputName.CHANGE_REQUEST.TYPE)).toLowerCase();
	}
	
	public String getNavName(String name) {
		return Utils.toJavaConstStyle(name).toLowerCase();
	}
}
