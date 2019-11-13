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
		return list.first();
	}

	${''}<@compress single_line=true>
	protected String prepareSqlAndParamsForFind${typeClass}Which${NAMING.toCamelCase(query.name)}(
		${custom_context_name} ctx, List<Object> params<@T.getRequestProcessingUrlMethodParameters query/>
		) throws Exception {
	</@>${''}
	<#if query.queryActionInfo?has_content>
		String sql = "${query.queryActionInfo.dbSql}";
		<#list query.queryActionInfo.paramPrepareQueue as param>
		params.add(${param});
		</#list>
	<#else>
		String sql = "select D.* from ${query.objectName}_data D order by id desc limit 1";
	</#if>
		return sql;
	}
	