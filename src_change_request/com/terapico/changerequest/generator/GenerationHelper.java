package com.terapico.changerequest.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.terapico.changerequest.builder.FieldType;
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
	public String toModelStyleName(String name) {
		return name.trim().replace(' ', '_');
	}
	
	@SuppressWarnings("unchecked")
	public List<String> getAllCRTypeUsedEvent(String eventTypeName, Map<String, Object> projectSpec) {
		List<String> result = new ArrayList<>();
		List<Map<String, Object>> allCRs = (List<Map<String, Object>>) projectSpec.get(OutputName.CHANGE_REQUEST_LIST);
		allCRs.forEach(crSpec->{
			String crType = (String) crSpec.get(OutputName.CHANGE_REQUEST.TYPE);
			List<Map<String, Object>> stepList = (List<Map<String, Object>>) crSpec.get(OutputName.CHANGE_REQUEST.STEP_LIST);
			stepList.forEach(stepEvent->{
				List<Map<String, Object>> eventList = (List<Map<String, Object>>) stepEvent.get(OutputName.CHANGE_REQUEST.STEP.EVENT_LIST);
				if (eventList.stream().anyMatch(evetSpec->evetSpec.get(OutputName.CHANGE_REQUEST.STEP.EVENT.TYPE).equals(eventTypeName))) {
					result.add(Utils.toJavaConstStyle(crType));
				}
			});
		});
		return result;
	}
	public String getExampleDataOfField(Map<String, Object> fieldSpec) {
		FieldType inputType = (FieldType) fieldSpec.get(OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD.TYPE);
		String value = null;
		if (FieldType.TEXT.equals(inputType)) {
			 value = "string1|string2";
		}
		if (FieldType.DATE.equals(inputType)) {
			 value = "2999-12-31|2020-12-25";
		}
		if (FieldType.DATE_TIME.equals(inputType)) {
			 value = "2999-12-31T12:34:56|2020-12-25T12:34:56";
		}
		if (FieldType.TIME.equals(inputType)) {
			 value = "23:59:59|12:34:56";
		}
		if (FieldType.BOOLEAN.equals(inputType)) {
			 value = "true|false";
		}
		if (FieldType.MONEY.equals(inputType)) {
			 value = "$99999999.999|$88888888.000";
		}
		if (FieldType.MULTI_TEXT.equals(inputType)) {
			 value = "text()";
		}
		if (value != null) {
			Boolean must = (Boolean) fieldSpec.get("isRequired");
			if (!must) {
				value = value + "?";
			}
			if (fieldSpec.get(OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD.MIN) != null
					&& fieldSpec.get(OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD.MAX) != null) {
				value = value +"|[" + fieldSpec.get(OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD.MIN)+","
					+fieldSpec.get(OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD.MAX)+"]";
			}
			return value;
		}
		return inputType+"对应的例子数据还没准备好";
	}
}
