package com.terapico.changerequest.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.OutputName;
import com.terapico.changerequest.builder.UIStyle;
import com.terapico.generator.BaseHelper;
import com.terapico.generator.Utils;

@SuppressWarnings("unchecked")
public class GenerationHelper extends BaseHelper {
	public String getCRName(Map<String, Object> crSpec) {
		return Utils.toJavaConstStyle((String) crSpec.get(OutputName.CHANGE_REQUEST.TYPE)).toLowerCase();
	}

	public String getNavName(String name) {
		return Utils.toJavaConstStyle(name).toLowerCase();
	}

	public String getLowerCaseName(String... names) {
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
		return Utils.toModelName(name);
	}

	public String toJavaVariableName(String name) {
		return Utils.toJavaVariableName(name);
	}

	@SuppressWarnings("unchecked")
	public List<String> getAllCRTypeUsedEvent(String eventTypeName, Map<String, Object> projectSpec) {
		List<String> result = new ArrayList<>();
		List<Map<String, Object>> allCRs = (List<Map<String, Object>>) projectSpec.get(OutputName.CHANGE_REQUEST_LIST);
		allCRs.forEach(crSpec -> {
			String crType = (String) crSpec.get(OutputName.CHANGE_REQUEST.TYPE);
			List<Map<String, Object>> stepList = (List<Map<String, Object>>) crSpec
					.get(OutputName.CHANGE_REQUEST.STEP_LIST);
			stepList.forEach(stepEvent -> {
				List<Map<String, Object>> eventList = (List<Map<String, Object>>) stepEvent
						.get(OutputName.CHANGE_REQUEST.STEP.EVENT_LIST);
				if (eventList.stream().anyMatch(
						evetSpec -> evetSpec.get(OutputName.CHANGE_REQUEST.STEP.EVENT.TYPE).equals(eventTypeName))) {
					result.add(Utils.toJavaConstStyle(crType));
				}
			});
		});
		return result;
	}

	public String getExampleDataOfField(Map<String, Object> fieldSpec) {
		String inputType = (String) fieldSpec.get(OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD.TYPE);
		String value = (String) fieldSpec.get(OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD.SAMPLE_DATA);
		if (value == null) {
			String modelName = (String) fieldSpec.get(OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD.MODEL_NAME);
			if (modelName != null) {
				inputType = "$modelName"; // will cause to skip all bellow
				value = "$(" + Utils.toModelName(modelName) +"?)";
			}
			if (FieldType.TEXT.isEquals(inputType)) {
				String uiStyle = (String) fieldSpec.get(OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD.UI_STYLE);
				if (uiStyle.equals(UIStyle.INPUT_EMAIL.getName())) {
					value = "someone@some.company.com|people@company.com";
				}else if (uiStyle.equals(UIStyle.INPUT_URL.getName())) {
					value = "https://www.baidu.com|https://www.doublechaintech.com";
				}else {
					value = "string1|string2";
					if (fieldSpec.get(OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD.MIN) == null) {
						fieldSpec.put(OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD.MIN, 1);
					}
					if (fieldSpec.get(OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD.MAX) == null) {
						fieldSpec.put(OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD.MAX, 30);
					}
				}
			}
			if (FieldType.DATE.isEquals(inputType)) {
				value = "2999-12-31|2020-12-25";
			}
			if (FieldType.DATE_TIME.isEquals(inputType)) {
				value = "2999-12-31T12:34:56|2020-12-25T12:34:56";
			}
			if (FieldType.TIME.isEquals(inputType)) {
				value = "23:59:59|12:34:56";
			}
			if (FieldType.BOOLEAN.isEquals(inputType)) {
				value = "true|false";
			}
			if (FieldType.MONEY.isEquals(inputType)) {
				value = "$99999999.999|$88888888.000";
			}
			if (FieldType.MULTI_TEXT.isEquals(inputType)) {
				value = "text()";
			}
			if (FieldType.INTEGER.isEquals(inputType)) {
				value = "999999999|123456789";
			}
			if (FieldType.IMAGE.isEquals(inputType)) {
				value = "product.jpg";
			}
			if (FieldType.IMAGES.isEquals(inputType)) {
				value = "images()";
			}
			if (FieldType.DECIMAL.isEquals(inputType)) {
				value = "99999999.999|88888888.000";
			}
		}
		if (value != null) {
			Boolean must = (Boolean) fieldSpec.get(OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD.MUST);
			if (!must) {
				value = value + "?";
			}
			if (fieldSpec.get(OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD.MIN) != null
					&& fieldSpec.get(OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD.MAX) != null) {
				value = value + "|[" + fieldSpec.get(OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD.MIN) + ","
						+ fieldSpec.get(OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD.MAX) + "]";
			}
			return value;
		}
		return inputType + "对应的例子数据还没准备好";
	}

	public String CamelName(String name) {
		return Utils.toCamelCase(name);
	}

	public String JAVA_CONST(String name) {
		return Utils.toJavaConstStyle(name);
	}

	public String javaVar(String name) {
		return Utils.toJavaVariableName(name);
	}

	public String model_name(String name) {
		return Utils.toModelName(name);
	}
	
	public String getJavaType(String typeName) {
		return FieldType.of(typeName).getJavaTypeName();
	}

	public String makeBackendFieldSpec(Map<String, Object> fieldSpec, String groupName) {
		Map<String, Object> result = new HashMap<>();
		String modelName = (String) fieldSpec.get("modelName");
		fieldSpec.forEach((name, value) -> {
			switch (name) {
			case "name":
				result.put(name, groupName + "_" + javaVar((String) value));
				break;
			case "mustHave":
				result.put("required", value);
				break;
			case "inputType":
				result.put("type", value);
				break;
			case "valuesMapping":
				result.put("candidateValues", value);
				break;
			case "title":
				result.put("label", value);
				break;
			case "minimal":
				result.put("minimum", wrapValueToString(value));
				break;
			case "maximum":
				result.put("maximum", wrapValueToString(value));
				break;
			default:
				result.put(name, value);
			}
		});
		return Utils.toJson(result, true).replace("\n", "\n				");
	}

	private Object wrapValueToString(Object value) {
		if (value instanceof String) {
			return value;
		}
		return String.valueOf(value);
	}

	public String dump(Object obj) {
		if (((Map<String, Object>) obj).get("title") == null) {
			return Utils.toJson(obj, true);
		} else {
			return "OK";
		}
	}
	
	@SuppressWarnings("unchecked")
	public Set<String> getAllModelNamesNeedCandidates(Map<String, Object> projectSpec) {
		Set<String> result = new HashSet<>();
		List<Map<String, Object>> allCRs = (List<Map<String, Object>>) projectSpec.get(OutputName.CHANGE_REQUEST_LIST);
		allCRs.forEach(crSpec -> {
			String crType = (String) crSpec.get(OutputName.CHANGE_REQUEST.TYPE);
			List<Map<String, Object>> stepList = (List<Map<String, Object>>) crSpec
					.get(OutputName.CHANGE_REQUEST.STEP_LIST);
			stepList.forEach(stepEvent -> {
				List<Map<String, Object>> eventList = (List<Map<String, Object>>) stepEvent
						.get(OutputName.CHANGE_REQUEST.STEP.EVENT_LIST);
				eventList.forEach(eventSepc->{
					List<Map<String, Object>> fieldList = (List<Map<String, Object>>) eventSepc
							.get(OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD_LIST);
					fieldList.forEach(fieldSpec->{
						String mName = (String) fieldSpec.get(OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD.MODEL_NAME);
						if (Utils.isBlank(mName)) {
							return;
						}
						result.add(mName);
					});
				});
			});
		});
		return result;
	}
	
}
