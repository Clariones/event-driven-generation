<#if query.queryActionInfo?has_content && (query.queryActionInfo.counting || query.queryActionInfo.sum)>
	${''}<@compress single_line=true>
    public ${query.queryActionInfo.sumDataType}
		${getSingleMethodPrefix(query.queryActionInfo)}${typeClass}Which${NAMING.toCamelCase(query.name)}(
		${custom_context_name} ctx
		<@T.getRequestProcessingUrlMethodParameters query/>
		) throws Exception {
	</@>${''}
		List<Object> params = new ArrayList<>();
		String sql = prepareSqlAndParamsFor${getSingleMethodPrefix(query.queryActionInfo)?cap_first}${typeClass}Which${NAMING.toCamelCase(query.name)}(ctx, params<@T.getRequestProcessingMethodParameterNames query/>);
		<#if query.queryActionInfo.counting && ! (query.queryActionInfo.sunDataType?has_content)>
		    <#if query.queryActionInfo.sumAttribute?has_content>
		return ctx.dao().countBySql(sql, params.toArray());
		    <#else>
		Integer cnt = ctx.dao().queryForObject(sql, params.toArray(), Integer.class);
		return cnt == null ? 0 : cnt;
		    </#if>
		<#else>
		${query.queryActionInfo.sumDataType} cnt = ctx.dao().queryForObject(sql, params.toArray(), ${query.queryActionInfo.sumDataType}.class);
		return cnt;
		</#if>
	}
	
	${''}<@compress single_line=true>
	protected String prepareSqlAndParamsFor${getSingleMethodPrefix(query.queryActionInfo)?cap_first}${typeClass}Which${NAMING.toCamelCase(query.name)}(
		${custom_context_name} ctx, List<Object> params<@T.getRequestProcessingUrlMethodParameters query/>
		) throws Exception {
	</@>${''}
		String sql = "${query.queryActionInfo.sql}";
	<#list query.queryActionInfo.params as param>
		params.add(${param});
	</#list>
		return sql;
	}

<#else>
    ${''}<@compress single_line=true>
    public ${typeClass}
		find${typeClass}Which${NAMING.toCamelCase(query.name)}(
		${custom_context_name} ctx
		<@T.getRequestProcessingUrlMethodParameters query/>
		) throws Exception {
	</@>${''}
		List<Object> params = new ArrayList<>();
		String sql = prepareSqlAndParamsForFind${typeClass}Which${NAMING.toCamelCase(query.name)}(ctx, params<@T.getRequestProcessingMethodParameterNames query/>);
		SmartList<${typeClass}> list = ctx.getDAOGroup().get${typeClass}DAO().queryList(sql, params.toArray());
		if (list == null) {
			return null;
		}
		${typeClass} result = list.first();
		enhance${typeClass}Which${NAMING.toCamelCase(query.name)}(ctx, result, "find${typeClass}Which${NAMING.toCamelCase(query.name)}"<@T.getRequestProcessingMethodParameterNames query/>);
		return result;
	}

	${''}<@compress single_line=true>
	protected String prepareSqlAndParamsForFind${typeClass}Which${NAMING.toCamelCase(query.name)}(
		${custom_context_name} ctx, List<Object> params<@T.getRequestProcessingUrlMethodParameters query/>
		) throws Exception {
	</@>${''}
	<#if query.queryActionInfo?has_content>
		String sql = "${query.queryActionInfo.sql}";
		<#list query.queryActionInfo.params as param>
		params.add(${param});
		</#list>
	<#else>
		String sql = "select D.* from ${query.objectName}_data D order by id desc limit 1";
	</#if>
		return sql;
	}
	
	${''}<@compress single_line=true>
	protected void enhance${typeClass}Which${NAMING.toCamelCase(query.name)}(${custom_context_name} ctx, ${typeClass} data, 
		String queryName<@T.getRequestProcessingUrlMethodParameters query/>
		) throws Exception {
	</@>${''}
	<#if query.queryActionInfo.wantedMap?has_content>
		if (data == null) {
			return;
		}
		<#list query.queryActionInfo.singleObjectEnhancePathList as enhanceInfo>
			<#if enhanceInfo.methodType == 'enhance'>
		List<${enhanceInfo.enhancedTypeName}> ${enhanceInfo.enhancedListVarName} = ${NAMING.toCamelCase(project_name)}BaseUtils.collectReferencedObjectWithType(ctx, ${enhanceInfo.standOnVarName}, ${enhanceInfo.enhancedTypeName}.class);
		ctx.getDAOGroup().enhanceList(${enhanceInfo.enhancedListVarName}, ${enhanceInfo.enhancedTypeName}.class);
			<#else>
		List<${enhanceInfo.enhancedTypeName}> ${enhanceInfo.enhancedListVarName} = ctx.getDAOGroup().get${NAMING.toCamelCase(enhanceInfo.ownerType)}DAO().${enhanceInfo.methodName}(ctx,${enhanceInfo.standOnVarName}, EO);
			</#if>
		</#list>
	<#else>
		enhance${typeClass}(ctx, data, queryName);
	</#if>
	}
	
	<#if helper.record('singleClass', typeClass)>
	protected void enhance${typeClass}(${custom_context_name} ctx, ${typeClass} data, String queryName) throws Exception {
		// 默认什么都不增强. 需要额外增强请重载此函数
	}
	</#if>
</#if>

<#function getSingleMethodPrefix queryActionInfo>
	<#if queryActionInfo.counting>
		<#return "count">
	<#else>
		<#assign rst = NAMING.toJavaVariableName(queryActionInfo.sumAttribute.name)>
		<#return "sum${rst?cap_first}Of">
	</#if>
</#function>
