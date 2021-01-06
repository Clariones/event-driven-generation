package ${packageName!'com.terapico.caf.viewcomponent'};

import com.terapico.caf.viewcomponent.*;
import java.util.*;

public class VComponent${helper.NameAsThis(component.name)} extends BaseVC{
<#list component.attributes as attribute>
	protected ${helper.JavaType(attribute.type)} ${helper.nameAsThis(attribute.name)};
</#list>
	
	
	
	public VComponent${helper.NameAsThis(component.name)}() {
		super();
		this.setComponentType("${helper.NameAsThis(component.name)}");
	}
	public VComponent${helper.NameAsThis(component.name)} id(String id) {
        this.setId(id);
        return this;
    }
    public VComponent${helper.NameAsThis(component.name)} linkToUrl(String linkToUrl) {
        this.setLinkToUrl(linkToUrl);
        return this;
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
    <#if helper.isListType(attribute.type) >
    public VComponent${helper.NameAsThis(component.name)} ${helper.nameAsThis(attribute.name)}(${helper.JavaType(attribute.itemType)} value) {
        ensure${helper.NameAsThis(attribute.name)}().add(value);
        return this;
    }
    protected ${helper.JavaType(attribute.type)} ensure${helper.NameAsThis(attribute.name)}(){
        if (this.${helper.nameAsThis(attribute.name)} != null) {
            return this.${helper.nameAsThis(attribute.name)};
        }
        this.${helper.nameAsThis(attribute.name)} = new ArrayList<>();
        return this.${helper.nameAsThis(attribute.name)};
    }
    </#if>
</#list>

	public VComponent${helper.NameAsThis(component.name)} setAttribute(String attrName, Object value) {
		String stdAttrName = toStandardAttributeName(attrName);
		if (handledByBaseAttribute(stdAttrName, value)) {
			return this;
		}
		switch  (attrName) {
<#list component.attributes as attribute>
		case "${helper.nameAsThis(attribute.name)}":
	<#if helper.isListType(attribute.type) >
	        if (checkAttributeValueAssignableFromList(value, ${helper.getListItemType(attribute.type)}.class, "${helper.name_as_this(component.name)}的${helper.nameAsThis(attribute.name)}必须是${helper.JavaType(attribute.type)}类型")){
	<#else>
			if (checkAttributeValueAssignable(value, ${helper.JavaType(attribute.type)}.class, "${helper.name_as_this(component.name)}的${helper.nameAsThis(attribute.name)}必须是${helper.JavaType(attribute.type)}类型")){
	</#if>
				set${helper.NameAsThis(attribute.name)}((${helper.JavaType(attribute.type)})value);
			}
			return this;
</#list>
		default:
			throw new RuntimeException("${helper.name_as_this(component.name)} 不支持设置属性 " + stdAttrName);
		}
		
	}
	
}
