<#if query.queryActionInfo?has_content && query.queryActionInfo.counting>
	${''}<@compress single_line=true>
    public int
		count${typeClass}Which${NAMING.toCamelCase(query.name)}(
		${custom_context_name} ctx
		<@T.getRequestProcessingUrlMethodParameters query/>
		) throws Exception {
	</@>${''}
		List<Object> params = new ArrayList<>();
		String sql = prepareSqlAndParamsForCount${typeClass}Which${NAMING.toCamelCase(query.name)}(ctx, params<@T.getRequestProcessingMethodParameterNames query/>);
		Integer cnt = ctx.dao().queryForObject(sql, params.toArray(), Integer.class);
		return cnt == null ? 0 : cnt;
	}
	
	${''}<@compress single_line=true>
	protected String prepareSqlAndParamsForCount${typeClass}Which${NAMING.toCamelCase(query.name)}(
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
		enhance${typeClass}(ctx, data, queryName);
	}
	
	<#if helper.record('singleClass', typeClass)>
	protected void enhance${typeClass}(${custom_context_name} ctx, ${typeClass} data, String queryName) throws Exception {
		// 默认什么都不增强. 需要额外增强请重载此函数
	}
	</#if>
</#if>