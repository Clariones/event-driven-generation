	// ///////////////////////////// ${event.comments!} //////////////////////////////////
	/** ${event.comments!} */
	<#if event.externalEvent>public<#else>protected</#if> void on${event.javaName}(${custom_context_name} ctx) throws Exception{
		checkCanDo${event.javaName}(ctx);
<#if event.hasBranch>
		int processResult = process${event.javaName}(ctx);
		ctx.setEventResult(EVENT_${NAMING.toJavaConstStyle(event.name)}, processResult);
		switch(processResult) {
	<#list event.definedBranches as branch>
		case ${branch.conditionCodeConst}: {// ${branch.comments!}
			<@event_ripples branch false/>
			}
			break;
	</#list>
	<#assign branch = event.defaultBranch>
		default: // ${branch.comments!}
			<@event_ripples branch false/>
			break;
		}
<#else>
		int processResult = process${event.javaName}(ctx);
		ctx.setEventResult(EVENT_${NAMING.toJavaConstStyle(event.name)}, processResult);
	<#assign branch = event.defaultBranch>
	<@event_ripples branch />
</#if>
		writeLogsFor${event.javaName}(ctx);
		async().notifyRelevantPersonsWhen${event.javaName}(ctx);
	}
	
	/**
	 * 处理 ${event.comments!}
	 * 返回值：<#list helper.getAllBranch(event) as branch> ${branch.conditionCodeConst}:${branch.comments!}</#list>
	 */
	protected abstract int process${event.javaName}(${custom_context_name} ctx) throws Exception;
	protected void checkCanDo${event.javaName}(${custom_context_name} ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsFor${event.javaName}(${custom_context_name} ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhen${event.javaName}(${custom_context_name} ctx) throws Exception {
		// by default, nobody was notified
	}
	
<#macro event_ripples branch shortPrefix=true>
	<#if branch.eventRipples?has_content>
	<#list branch.eventRipples as ripple>
		<#if ripple.async>
			<#if ripple.comments?has_content>
		<#if !shortPrefix>	</#if>// ${ripple.comments}
			</#if>
		<#if !shortPrefix>	</#if><#if ripple.serviceName?has_content>get${NAMING.toCamelCase(ripple.serviceName)}Service().</#if>async().on${ripple.eventJavaName}(ctx);
		<#else>
			<#if ripple.comments?has_content>
		<#if !shortPrefix>	</#if>// ${ripple.comments}
			</#if>
		<#if !shortPrefix>	</#if><#if ripple.serviceName?has_content>get${NAMING.toCamelCase(ripple.serviceName)}Service().</#if>sync().on${ripple.eventJavaName}(ctx);
		</#if>
	</#list>
	</#if>
</#macro>
