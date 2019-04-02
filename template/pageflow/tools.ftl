<#macro getRequestProcessingMethodParameters request>
	<@compress single_line=true>
		<#if request.parameters?has_content>
			<#list request.parameters as param>
				,
				<#if param.typeName == "form">
				String formData
				<#else>
				${param.typeName} ${NAMING.toCamelCase(param.paramName)?uncap_first}
				</#if>
			</#list>
		</#if>
	</@>
</#macro>
<#macro getRequestProcessingUrlMethodParameters request>
	<@compress single_line=true>
		<#if request.parameters?has_content>
			<#list request.parameters as param>
				<#if param.typeName == "form">
				<#elseif param.asVariable>
				<#else>
				,
				${param.typeName} ${NAMING.toCamelCase(param.paramName)?uncap_first}
				</#if>
			</#list>
		</#if>
	</@>
</#macro>
<#macro getRequestProcessingUrlMethodParametersWithoutType request>
	<@compress single_line=true>
		<#if request.parameters?has_content>
			<#list request.parameters as param>
				<#if param.typeName == "form">
				<#elseif param.asVariable>
				<#else>
				,
				 ${NAMING.toCamelCase(param.paramName)?uncap_first}
				</#if>
			</#list>
		</#if>
	</@>
</#macro>
<#macro getRequestProcessingMethodParameterNames request>
	<@compress single_line=true>
		<#if request.parameters?has_content>
			<#list request.parameters as param>
				,
				<#if param.typeName == "form">
				"formData"
				<#elseif param.asVariable>
				":${NAMING.toCamelCase(param.paramName)?uncap_first}"
				<#else>
				${NAMING.toCamelCase(param.paramName)?uncap_first}
				</#if>
			</#list>
		</#if>
	</@>
</#macro>

<#function getRequestProcessingMethodName request>
	<#if request.needLogin>
		<#return "customer"+NAMING.toCamelCase(request.name) />
	<#else>
		<#return NAMING.toCamelCase(request.name)?uncap_first />
	</#if>
</#function>