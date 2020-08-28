<#assign typeClass=NAMING.toCamelCase(query.objectName)/>
<#assign queryName="query" + typeClass + "ListOf" +  helper.NameAsThis(query.name) />
<#assign prepareSQLName="prepareSqlAndParamsForQuery" + typeClass + "ListOf" +  helper.NameAsThis(query.name) />
<#assign executeName="executeQuery" + typeClass + "ListOf" +  helper.NameAsThis(query.name) />
<#assign enhanceName="enhance" + typeClass + "ListOf" +  helper.NameAsThis(query.name) />
<#assign pagingParamName="fillPaginationParamsForQuery" + typeClass + "ListOf" +  helper.NameAsThis(query.name) />

    public SmartList<${typeClass}> ${queryName}(${custom_context_name} ctx <@T.getRequestProcessingUrlMethodParameters query/><#if query.pagination>, String lastRecordId</#if>) throws Exception {
    <#if query.pagination>
        ${typeClass} lastRecord = null;
        if (!isEmpty(lastRecordId)) {
            lastRecord = ctx.getDAOGroup().get${typeClass}DAO().load(lastRecordId, EO);
        }
    </#if>
        List<Object> params = new ArrayList<>();
    <#if query.pagination>
        int pageSize = getPageSize(ctx, "${queryName}");
        String sql = ${prepareSQLName}(ctx, lastRecord, pageSize+1, params<@T.getRequestProcessingMethodParameterNames query/>);
    <#else>
        String sql = ${prepareSQLName}(ctx, params<@T.getRequestProcessingMethodParameterNames query/>);
    </#if>

        SmartList<${typeClass}> list = ${executeName}(ctx, sql, params);
        if (list == null || list.isEmpty()){
            return list;
        }
    <#if query.pagination>
        list.setRowsPerPage(pageSize);
    <#else>
        list.setRowsPerPage(Integer.MAX_VALUE);
    </#if>
    <#if query.pagination>
        if (list.size() > pageSize){
            ctx.setLastRecordId(list.last().getId());
        }else{
            ctx.setLastRecordId(null);
        }
    <#else>
        ctx.setLastRecordId(null);
    </#if>
        ${enhanceName}(ctx, list, "${queryName}"<@T.getRequestProcessingMethodParameterNames query/>);
        return list;
    }

    protected SmartList<${typeClass}> ${executeName}(${custom_context_name} ctx, String sql, List<Object> params) throws Exception {
        return ctx.getDAOGroup().get${typeClass}DAO().queryList(sql, params.toArray());
    }

    /**
     * ${query.comments!query.name}.
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

<#if query.pagination>
    protected void ${pagingParamName}(${custom_context_name} ctx, ${typeClass} lastRecord, int limit, List<Object> params<@T.getRequestProcessingUrlMethodParameters query/>) throws Exception {
		// 加入分页所需的参数
		if (lastRecord == null) {
			return;
		}
  <#if query.queryInfo?has_content>
	<#assign enhanceConnectorList = query.queryInfo.getPaginationEnhanceNodes("lastRecord") />
    <#if enhanceConnectorList?has_content>
        <#assign lastVarName = "lastRecord"/>
        <#list enhanceConnectorList as c>
            <#if !(c.pathType?has_content) && helper.NameAsThis(c.footHolderName) == typeClass>
            <#else>
                <#if c.pathType == "upstream">
        ${helper.NameAsThis(c.footHolderName)} ${helper.nameAsThis(c.aliasName)} = getUpStreamBean(ctx, ${lastVarName}.get${helper.NameAsThis(c.pathName)}());
                <#else>
        ${helper.NameAsThis(c.footHolderName)} ${helper.nameAsThis(c.aliasName)} = getDownStreamBean(ctx, ${lastVarName}, ${helper.NameAsThis(c.footHolderName)}.class, it->it.get${helper.NameAsThis(c.extraData.attrName)}());
                </#if>
                <#assign lastVarName = helper.nameAsThis(c.aliasName)/>
            </#if>
        </#list>
    <#else>
        addParam(params,lastRecord.getId());
    </#if>
    <#list query.queryInfo.orderByGetters as getter>
        params.add(${getter});
    </#list>
  <#else>
    // 你需要重载这个函数,来填写分页参数
  </#if>
	}
</#if>


    protected void ${enhanceName}(${custom_context_name} ctx, SmartList<${typeClass}> list, String queryName<@T.getRequestProcessingUrlMethodParameters query/>) throws Exception {
    <#if !query.queryInfo?has_content>
        // 重载此函数, 根据查询的结果, 加载更多的相关数据
    <#elseif !query.queryInfo.getWantsEnhanceConnectors("list")?has_content>
        // 重载此函数, 根据查询的结果, 加载更多的相关数据
    <#else>
        if (list == null || list.isEmpty()){
            return;
        }
        <#assign lastVarName = "list"/>
        <#assign lastClassName = typeClass/>
        <#list query.queryInfo.getWantsEnhanceConnectors(lastVarName) as c>
            <#if !(c.pathType?has_content) && helper.NameAsThis(c.footHolderName) == typeClass>
            <#else>
                <#if c.pathType == "upstream">
        List<${helper.NameAsThis(c.footHolderName)}> ${helper.nameAsThis(c.aliasName)}List = ctx.enhanceUpStream(${c.extraData.srcVar}, ${helper.NameAsThis(c.footHolderName)}.class);
                <#else>
        List<${helper.NameAsThis(c.footHolderName)}> ${helper.nameAsThis(c.aliasName)}List = ctx.getDAOGroup().get${helper.NameAsThis(c.upstream.footHolderName)}DAO().loadOur${c.extraData.methodName?cap_first}(ctx, ${c.extraData.srcVar}, EO);
                </#if>
            </#if>
        </#list>
    </#if>
    }
<#macro sqlWithQueryInfo query>

        String sql = ${query.queryInfo.sql};
        ${query.queryInfo.paramSetters}
    <#if query.pagination>
		// 加入分页所需的参数
		if (lastRecord != null) {
			${pagingParamName}(ctx, lastRecord, limit, params<@T.getRequestProcessingMethodParameterNames query/>);
		}
    </#if>
    <#if query.pagination>
        addParam(params,limit);
    </#if>
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