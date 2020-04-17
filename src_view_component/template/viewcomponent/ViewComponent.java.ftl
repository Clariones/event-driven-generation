package com.terapico.caf.viewcomponent;

public class VComponent${helper.NameAsThis(component.name)} extends BaseVC{
<#list component.attributes as attribute>
	protected ${helper.JavaType(attribute.type)} ${helper.nameAsThis(attribute.name)};
</#list>
	
	
	
	public VComponent${helper.NameAsThis(component.name)}() {
		super();
		this.setComponentType(VComponent.${helper.NAME_AS_THIS(component.name)});
	}
	
<#list component.attributes as attribute>
	public ${helper.JavaType(attribute.type)} get${helper.NameAsThis(attribute.name)}() {
    	return this.${helper.nameAsThis(attribute.name)};
    }
	public void set${helper.NameAsThis(attribute.name)}(${helper.JavaType(attribute.type)} value) {
		this.${helper.nameAsThis(attribute.name)} =  value;
	}
	public VComponent${helper.NameAsThis(component.name)} ${helper.nameAsThis(attribute.name)}(${helper.JavaType(attribute.type)} value) {
    	this.${helper.nameAsThis(attribute.name)} =  value;
    	return this;
    }
</#list>

	public VComponent${helper.NameAsThis(component.name)} setAttribute(String attrName, Object value) {
		String stdAttrName = toStandardAttributeName(attrName);
		if (handledByBaseAttribute(stdAttrName, value)) {
			return this;
		}
		switch  (attrName) {
<#list component.attributes as attribute>
		case "${helper.nameAsThis(attribute.name)}":
			if (checkAttributeValueAssignable(value, ${helper.JavaType(attribute.type)}.class, "${helper.name_as_this(component.name)}的${helper.nameAsThis(attribute.name)}必须是${helper.JavaType(attribute.type)}类型")){
				set${helper.NameAsThis(attribute.name)}((${helper.JavaType(attribute.type)})value);
			}
			return this;
</#list>
		default:
			throw new RuntimeException("${helper.name_as_this(component.name)} 不支持设置属性 " + stdAttrName);
		}
		
	}
	
}
