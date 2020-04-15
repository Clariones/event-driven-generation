package com.terapico.viewcomponent.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.terapico.generator.BaseHelper;
import com.terapico.generator.Utils;
import com.terapico.viewcomponent.spec.AttributeInfo;
import com.terapico.viewcomponent.spec.ComponentInfo;

@SuppressWarnings("unchecked")
public class VCGenerationHelper extends BaseHelper {
	public String JavaType(String name) {
		switch (name) {
		case "string":
			return "String";
		case "boolean":
			return "Boolean";
		default:
			throw new RuntimeException("还没处理"+name+"转成java类型");
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
}
