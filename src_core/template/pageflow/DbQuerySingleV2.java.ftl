<#--
single 查询的情况可能有这么几种:
1. findXXX: 查询一个特定对象, 结果是 Xxx Class
2. countXXX: 根据条件统计, 结果可能是一个 Integer, 也可能是一个 Map<String, Integer>
3. sumXXX: 根据条件求和, 结果可能是一个 Integer, 也可能是一个 BigDecimal, 可能是 Map<String, Integer>, 也可能是 Map<String, BigDecimal>
-->
<#assign typeClass=NAMING.toCamelCase(query.objectName)/>
<#assign methodPrefix="find"/>
<#if query.queryInfo?has_content>
    <#assign methodPrefix=query.queryInfo.methodPrefix/>
</#if>
<#assign queryName=methodPrefix + typeClass + "Which" +  helper.NameAsThis(query.name) />
<#assign prepareSQLName="prepareSqlAndParamsFor" + queryName?cap_first />
<#assign executeName="execute" + queryName?cap_first  />
<#assign enhanceName="enhance" + typeClass + "Which" +  helper.NameAsThis(query.name)  />
<#assign unifiedEnhanceName="enhance" + typeClass?cap_first  />

    public ${query.queryInfo.singleQueryResultType!typeClass} ${queryName}(${custom_context_name} ctx <@T.getRequestProcessingUrlMethodParameters query/><#if query.pagination>, String lastRecordId</#if>) throws Exception {
        List<Object> params = new ArrayList<>();
        String sql = ${prepareSQLName}(ctx, params<@T.getRequestProcessingMethodParameterNames query/>);
<#if methodPrefix == "find">
        SmartList<${typeClass}> list = ${executeName}(ctx, sql, params<@T.getRequestProcessingMethodParameterNames query/>);
        if (list == null || list.isEmpty()){
            return null;
        }
        ${typeClass} result = list.first();
        ${enhanceName}(ctx, result, "${queryName}"<@T.getRequestProcessingMethodParameterNames query/>);
        return result;
<#else>
        ${query.queryInfo.singleQueryResultType} result = ${executeName}(ctx, sql, params<@T.getRequestProcessingMethodParameterNames query/>);
        if (result != null){
            return result;
        }
    <#if query.queryInfo.singleQueryResultType?starts_with("Map")>
        return new HashMap<>();
    <#elseif query.queryInfo.singleQueryResultType == "Integer">
        return 0;
    <#else>
        return BigDecimal.ZERO;
    </#if>
</#if>
    }

    /**
     * 构建 ${query.comments!} 的SQL和查询参数
    <#if query.ruleComments?has_content>
     * <p/>
     * 规则：<br/>
        <#list query.ruleComments as comments>
     * ${comments_index+1}. ${comments}<br/>
        </#list>
    </#if>
     */
    protected String ${prepareSQLName}(${custom_context_name} ctx<#if query.pagination>, ${typeClass} lastRecord, int limit</#if>, List<Object> params<@T.getRequestProcessingUrlMethodParameters query/>) throws Exception {
    <#if query.queryInfo?has_content>
		<@sqlWithQueryInfo query/>
	<#else>
		<@sqlWithoutQueryInfo query/>
	</#if>
    }


    protected ${query.queryInfo.singleQueryResultType!("SmartList<"+typeClass+">")} ${executeName}(${custom_context_name} ctx, String sql, List<Object> params<@T.getRequestProcessingUrlMethodParameters query/>) throws Exception {
<#if !query.queryInfo?has_content || !query.queryInfo.singleQueryResultType?has_content>
        return ctx.getDAOGroup().get${typeClass}DAO().queryList(sql, params.toArray());
<#else>
    <#if methodPrefix == "count" >
        <#if query.queryInfo.singleQueryResultType == "Map<String, Integer>">
        return toCountMap(ctx.dao().queryAsMapList(sql, params.toArray()));
        <#else>
        return ctx.dao().queryForObject(sql, params.toArray(), Integer.class);
        </#if>
    <#else>
        <#if query.queryInfo.singleQueryResultType == "Map<String, Integer>">
            return toSumMap(ctx.dao().queryAsMapList(sql, params.toArray()), Integer.class);
        <#elseif query.queryInfo.singleQueryResultType == "Map<String, BigDecimal>">
            return toSumMap(ctx.dao().queryForList(sql, params.toArray()), BigDecimal.class);
        <#elseif query.queryInfo.singleQueryResultType == "Integer">
           return ctx.dao().queryForObject(sql, params.toArray(), Integer.class);
        <#else>
            return ctx.dao().queryForObject(sql, params.toArray(), BigDecimal.class);
        </#if>
    </#if>
</#if>
    }
    protected void ${enhanceName}(${custom_context_name} ctx, ${typeClass} data, String queryName<@T.getRequestProcessingUrlMethodParameters query/>) throws Exception {
	<#if query.queryInfo?has_content>
		if (data == null){
            return;
        }
        <#assign lastVarName = "data"/>
        <#assign lastClassName = typeClass/>
        <#list query.queryInfo.getWantsEnhanceConnectors(lastVarName) as c>
            <#if !(c.pathType?has_content) && helper.NameAsThis(c.footHolderName) == typeClass>
            <#else>
                <#if c.pathType == "upstream">
        List<${helper.NameAsThis(c.footHolderName)}> ${helper.nameAsThis(c.aliasName)}List = enhanceUpStream(ctx, ${c.extraData.srcVar}, ${helper.NameAsThis(c.footHolderName)}.class);
                <#else>
        List<${helper.NameAsThis(c.footHolderName)}> ${helper.nameAsThis(c.aliasName)}List = ctx.getDAOGroup().get${helper.NameAsThis(c.upstream.footHolderName)}DAO().loadOur${c.extraData.methodName?cap_first}(ctx, <#if c.extraData.srcVar=="data">asList(</#if>${c.extraData.srcVar}<#if c.extraData.srcVar=="data">)</#if>, EO);
                </#if>
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

<#macro sqlWithQueryInfo query>
        String sql = ${query.queryInfo.singleSql};
        ${query.queryInfo.paramSetters}
        return sql;
</#macro>

<#macro sqlWithoutQueryInfo query>
        String sql = "select D.* from ${query.objectName}_data D ";
    <#if query.pagination>
		if (lastRecord != null) {
			params.add(lastRecord.getId());
			sql += " where D.id <= ? ";
		}
		params.add(limit);
		return sql + " order by D.id desc limit ?";
    <#else>
		return sql + " order by D.id desc";
    </#if>
</#macro>