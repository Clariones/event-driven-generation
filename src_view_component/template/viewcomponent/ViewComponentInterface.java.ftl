package com.terapico.caf.viewcomponent;

public interface VComponent {
	String getId();
	String getComponentType();
	String getLinkToUrl();
	
<#list allSpec?values as component>	
	String ${helper.NAME_AS_THIS(component.name)} = "${helper.name_as_this(component.name)}";
</#list>
}
