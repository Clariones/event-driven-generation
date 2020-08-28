package com.terapico.viewcomponent.generator;

import clariones.tool.builder.BaseGeneratorHelper;
import clariones.tool.builder.Utils;
import com.terapico.viewcomponent.spec.AttributeInfo;
import com.terapico.viewcomponent.spec.ComponentInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class VCGenerationHelper extends BaseGeneratorHelper {
	public String JavaType(String name) {
		switch (name) {
		case "string":
			return "String";
		case "boolean":
			return "Boolean";
		case "datetime":
			return "Date";
		default:
			if (name.matches("^List<.*>$")) {
				return name;
			}
			// throw new RuntimeException("还没处理"+name+"转成java类型");
			return name;
		}
	}
	
	public List<AttributeInfo> getAllAttributeNameList(Map<String, ComponentInfo> allspec) {
		List<AttributeInfo> result = new ArrayList<>();
		allspec.forEach((name, component)->{
			component.getAttributes().forEach(attr->{
				String stdName = Utils.toCamelCase(attr.getName());
				AttributeInfo existed = result.stream().filter(it -> Utils.toCamelCase(it.getName()).equals(stdName)).findAny()
						.orElse(null);
				if (existed == null) {
					existed = new AttributeInfo();
					existed.setName(attr.getName());
					existed.setType(attr.getType());
					result.add(existed);
					return;
				}
				
				if (existed.getType().equals(attr.getType())) {
					return;
				}
				
				existed.setType("object");
			});
		});
		return result;
	}

	public boolean isListType(String typeName){
		return typeName.matches("^List<.*>$");
	}
	public String getListItemType(String typeName){
		return typeName.substring(5, typeName.length()-1);
	}
}
