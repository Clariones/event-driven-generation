package ${package};

import com.skynet.infrastructure.graphservice.BaseQuery;
import com.skynet.infrastructure.graphservice.ResultList;
import ${base_package}.BaseEntity;
import ${base_package}.SmartList;
import ${base_package}.${helper.toCamelCase(project_name)}Query;
import ${base_package}.${custom_context_name};

<#list helper.getReferencedTypes(queryInfo.queryList) as classNames>
import ${base_package}.${classNames};
</#list>

public class ${class_name}GraphQueryHelper {
	protected int getPageSize(${custom_context_name} ctx, String queryName) {
		return 20;
	}
	protected int defaultPaginationPreparation(BaseQuery query, int pageSize, Integer pageNo, Integer forceTopN) {
		if (forceTopN != null && forceTopN > 0) {
			query.limit(forceTopN);
			return forceTopN;
		}
		if (pageNo == null || pageNo <=1 ) {
			query.limit(pageSize+1);
			return pageSize+1;
		}
		query.limit(pageSize*(pageNo-1), pageSize+1);
		return pageSize*(pageNo);
	}
	protected <T extends BaseEntity> SmartList<T> wrapInSmartList(CustomYourongUserContextImpl ctx, String queryName,
			int pageSize, int nextPageOffset, ResultList<T> resultList) {
		SmartList<T> sList = new SmartList<>();
		if (resultList == null || resultList.isEmpty()) {
			return sList;
		}
		sList.addAll(resultList);
		sList.setTotalCount(resultList.getTotal());
		sList.setRowsPerPage(pageSize);
		if (sList.size() > pageSize) {
			ctx.setLastRecordId(String.valueOf(nextPageOffset));
		} else {
			ctx.setLastRecordId(null);
		}
		return sList;
	}
	
<#list queryInfo.queryList as query>
	/*
	${query.comments}(${query.name})
	*/
	<#assign q_name='query'+NAMING.toCamelCase( query.getName() ) />
	public SmartList<${query.targetTypeName}> ${q_name}(<@compress single_line=true>${custom_context_name} ctx
	<#list helper.getParamInfoListForMethodDeclaration(query) as param>
		,${param.typeName} ${param.varName}
	</#list>
	<#if query.pagination>, Integer pageNo, Integer forceTopN</#if>
	</@>) throws Exception {
		BaseQuery query = initQueryFor${q_name?cap_first}(${NAMING.toCamelCase( query.startPoint.paramName ) ? uncap_first});
		prepareWantedFor${q_name?cap_first}(query);
		prepareConditionFor${q_name?cap_first}(query);
		prepareParametersFor${q_name?cap_first}(<@compress single_line=true>query
	<#list helper.getParamInfoListForMethodDeclaration(query) as param>
		, ${param.varName}
	</#list></@>);
	<#if query.pagination>
		int pageSize = getPageSize(ctx, "${q_name}");
		int nextPageOffset = preparePaginationFor${q_name?cap_first}(query, pageSize, pageNo, forceTopN);
	</#if>
		prepareSortInfoFor${q_name?cap_first}(query);
			
	 	ResultList<${query.targetTypeName}> resultList = ctx.getGraphService().query(query, ${query.targetTypeName}.class);
        if (!ctx.isProductEnvironment()) {
	 		System.out.println(resultList);
	 	}
	 	<#if query.pagination>
	 	SmartList<${query.targetTypeName}> sList = wrapInSmartList(ctx, "${q_name}", pageSize, nextPageOffset, resultList);
	 	<#else>
	 	SmartList<${query.targetTypeName}> sList = wrapInSmartList(ctx, "${q_name}", Integer.MAX_VALUE, 0, resultList);
	 	</#if>
	 	enhance${q_name?cap_first}(ctx, sList);
		return sList;
	}
	protected void enhance${q_name?cap_first}(${custom_context_name} ctx, SmartList<${query.targetTypeName}> sList) {}
	protected BaseQuery initQueryFor${q_name?cap_first}(String ${NAMING.toCamelCase( query.startPoint.paramName ) ? uncap_first}) {
		return new ${helper.toCamelCase(project_name)}Query(${query.startPoint.typeName}.class, ${NAMING.toCamelCase( query.startPoint.paramName ) ? uncap_first})
	<#list query.searchEdges as edge>
			.relation("${edge.edgeName}")
	</#list>
			;
	}
	protected void prepareWantedFor${q_name?cap_first}(BaseQuery query) {
		query<@compress single_line=true>.want(
	<#list query.enhanceTypeName as typeName>
			${typeName}.class<#if typeName_has_next>,</#if>
	</#list>)</@>;
	}
	protected void prepareConditionFor${q_name?cap_first}(BaseQuery query) {
		query.filter("${query.queryConditionAsString}");
	}
	protected void prepareSortInfoFor${q_name?cap_first}(BaseQuery query) {
		<@compress single_line=true>query.sort("<#list query.sortMembers 
		as member>${member.className}.${member.memberName} ${member.sortDirection}<#if member_has_next>, </#if></#list>"
		)</@>;
	}
	protected void prepareParametersFor${q_name?cap_first}(<@compress single_line=true>BaseQuery query
	<#list helper.getParamInfoListForMethodDeclaration(query) as param>
		,${param.typeName} ${param.varName}
	</#list>
	</@>) {
		query
	<#list helper.getParamInfoListForQueryParameter(query) as param>
			.parameter("${param.varName}", ${param.varName})
	</#list>
			;
	}
	protected int preparePaginationFor${q_name?cap_first}(BaseQuery query, int pageSize, Integer pageNo, Integer forceTopN) {
		return defaultPaginationPreparation(query, pageSize, pageNo, forceTopN);
	}
</#list>

	
}
