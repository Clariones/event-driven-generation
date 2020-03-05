package com.terapico.changerequest.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.terapico.changerequest.builder.OutputName;

import cla.edg.Utils;

public class GenerationHelper {
	public String getCRName(Map<String, Object> crSpec) {
		return Utils.toJavaConstStyle((String) crSpec.get(OutputName.CHANGE_REQUEST.TYPE)).toLowerCase();
	}
	
	public String getNavName(String name) {
		return Utils.toJavaConstStyle(name).toLowerCase();
	}
	
	public String getLowerCaseName(String ... names) {
		return String.join("_", names).toLowerCase();
	}
	public static List<String> findAllMatched(String source, Pattern pattern) {
		Matcher matcher = pattern.matcher(source);
		List<String> list = new ArrayList<>();
		while (matcher.find()) {
			list.add(matcher.group());
		}
		return list;

	}
}
