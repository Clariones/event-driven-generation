package com.terapico.caf.viewcomponent;

public class ViewComponentBuilder<T extends BaseVC> {
	protected T vComponet;

<#list allSpec?values as component>	
	public static ViewComponentBuilder<VComponent${helper.NameAsThis(component.name)}> ${helper.nameAsThis(component.name)}() {
		ViewComponentBuilder<VComponent${helper.NameAsThis(component.name)}> me = new ViewComponentBuilder<VComponent${helper.NameAsThis(component.name)}>();
		me.vComponet = new VComponent${helper.NameAsThis(component.name)}();
		return me;
	}
</#list>
	
	public T build(){
		return vComponet;
	}

	public ViewComponentBuilder<T> withId(String id) {
		vComponet.setId(id);
		return this;
	}
	public ViewComponentBuilder<T> withLinkToUrl(String linkToUrl) {
		vComponet.setLinkToUrl(linkToUrl);
		return this;
	}
<#list helper.getAllAttributeNameList(allSpec) as attrInfo>
	public ViewComponentBuilder<T> with${helper.NameAsThis(attrInfo.name)}(${helper.JavaType(attrInfo.type)} ${helper.nameAsThis(attrInfo.name)}) {
		vComponet.setAttribute("${helper.nameAsThis(attrInfo.name)}", ${helper.nameAsThis(attrInfo.name)});
		return this;
	}
</#list>
}
