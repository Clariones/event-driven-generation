<#import "tools.ftl" as T/>
package ${package};

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ${base_package}.${context_name};
import ${base_package}.SmartList;
import ${base_package}.${NAMING.toCamelCase(project_name)}BaseUtils;
import ${base_package}.${custom_context_name};
import ${parent_class_package}.${parent_class_name};
import ${package}pageview.*;

import com.terapico.utils.TextUtil;
<#assign imported = []>
<#list script.queryInfoList as query >
	<#if imported?seq_contains(query.objectName)>
	<#else>
import ${base_package}.${NAMING.toCamelCase(query.objectName)?lower_case}.${NAMING.toCamelCase(query.objectName)};
	<#assign imported = imported + [query.objectName] />
	</#if>
</#list>
<#list script.objectParamTypes as typeName>
import ${typeName};
</#list>

/**
 * 此类负责：声明所有{@link ${class_name}ViewService}中所使用的数据库搜索方法。 单独列出的目的是便于维护。
 * @author clariones
 *
 */
public abstract class ${class_name}DBQueryHelper{
	public static final Map<String, Object> EO = new HashMap<>();
	public int getPageSize(${custom_context_name} ctx, String queryName) {
		return 20;
	}
<#list script.queryInfoList as query >
	/**
	 * ${query.comments!}.
	 */
	<#assign typeClass=NAMING.toCamelCase(query.objectName)/>
  <#if query.querySingleObject>
  	<#include "DbQuerySingle.java.ftl">
  <#else>
	${''}<@compress single_line=true>
	public SmartList<${typeClass}> 
		query${typeClass}ListOf${NAMING.toCamelCase(query.name)}(
		${custom_context_name} ctx
		<@T.getRequestProcessingUrlMethodParameters query/>
		<#if query.pagination>, String lastRecordId</#if>
		) throws Exception {
	</@>${''}
	<#if query.pagination>
		${typeClass} lastRecord = null;
		if (!TextUtil.isBlank(lastRecordId)) {
			lastRecord = ctx.getDAOGroup().get${typeClass}DAO().load(lastRecordId, EO);
		}
	</#if>
		List<Object> params = new ArrayList<>();
	<#if query.pagination>
		int pageSize = getPageSize(ctx, "query${typeClass}ListOf${NAMING.toCamelCase(query.name)}");
		String sql = prepareSqlAndParamsForQuery${typeClass}ListOf${NAMING.toCamelCase(query.name)}(ctx, lastRecord, pageSize+1, params<@T.getRequestProcessingMethodParameterNames query/>);
	<#else>
		String sql = prepareSqlAndParamsForQuery${typeClass}ListOf${NAMING.toCamelCase(query.name)}(ctx, params<@T.getRequestProcessingMethodParameterNames query/>);
	</#if>
		SmartList<${typeClass}> list = ctx.getDAOGroup().get${typeClass}DAO().queryList(sql, params.toArray());
	<#if query.pagination>
		list.setRowsPerPage(pageSize);
	<#else>
		list.setRowsPerPage(Integer.MAX_VALUE);
	</#if>
		if (list == null || list.isEmpty()){
			return list;
		}
	<#if query.pagination>
		if (list.size() > pageSize){
			ctx.setLastRecordId(list.last().getId());
		}else{
			ctx.setLastRecordId(null);
		}
	<#else>
		ctx.setLastRecordId(null);
	</#if>
		enhance${typeClass}ListOf${NAMING.toCamelCase(query.name)}(ctx, list, "query${typeClass}ListOf${NAMING.toCamelCase(query.name)}"<@T.getRequestProcessingMethodParameterNames query/>);
		return list;
	}
	
	/**
	 * ${query.comments!}.
	<#if query.ruleComments?has_content>
	 * <p/>
	 * 规则：<br/>
		<#list query.ruleComments as comments>
	 * ${comments_index+1}. ${comments}<br/>
		</#list>
	</#if>
	 */
	${''}<@compress single_line=true>
	protected String prepareSqlAndParamsForQuery${typeClass}ListOf${NAMING.toCamelCase(query.name)}(
		${custom_context_name} ctx
		<#if query.pagination>, ${typeClass} lastRecord, int limit</#if>
		, List<Object> params<@T.getRequestProcessingUrlMethodParameters query/>
		) throws Exception {
	</@>${''}
	
	<#if query.queryActionInfo?has_content>
		String sql = "${query.queryActionInfo.sql}";
			<#list query.queryActionInfo.params as param>
		params.add(${param});
			</#list>
		<#if query.pagination>
		// 加入分页所需的参数
		if (lastRecord != null) {
			fillPaginationParamsForQuery${typeClass}ListOf${NAMING.toCamelCase(query.name)}(ctx, lastRecord, limit, params<@T.getRequestProcessingMethodParameterNames query/>);
		}
		params.add(limit);
		</#if>
		return sql;
	<#else>
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
	</#if>
	}
	<#if query.pagination && query.queryActionInfo?has_content>
	${''}<@compress single_line=true>
	protected void fillPaginationParamsForQuery${typeClass}ListOf${NAMING.toCamelCase(query.name)}(${custom_context_name} ctx, 
	${typeClass} lastRecord, int limit, List<Object> params<@T.getRequestProcessingUrlMethodParameters query/>
		) throws Exception {
	</@>${''}
		<#if query.queryActionInfo.notGeneratePaginationParams>
		// 你要自己填好分页的参数, 不然jdbc的参数个数不对
		<#else>
		// 首先增强对象
			<#list query.queryActionInfo.lastRecordEnhancePathList as enhanceInfo>
				<#if enhanceInfo.methodType == 'enhance'>
		List<${enhanceInfo.enhancedTypeName}> ${enhanceInfo.enhancedListVarName} = ${NAMING.toCamelCase(project_name)}BaseUtils.collectReferencedObjectWithType(ctx, ${enhanceInfo.standOnVarName}, ${enhanceInfo.enhancedTypeName}.class);
		ctx.getDAOGroup().enhanceList(${enhanceInfo.enhancedListVarName}, ${enhanceInfo.enhancedTypeName}.class);
				<#else>
		List<${enhanceInfo.enhancedTypeName}> ${enhanceInfo.enhancedListVarName} = ctx.getDAOGroup().get${NAMING.toCamelCase(enhanceInfo.ownerType)}DAO().${enhanceInfo.methodName}(ctx,${enhanceInfo.standOnVarName}, EO);
				</#if>
			</#list>
			<#list query.queryActionInfo.paginationParamsExp as param>
		params.add(${param});
			</#list>
		</#if>
	}
	</#if>
	protected void enhance${typeClass}ListOf${NAMING.toCamelCase(query.name)}(${custom_context_name} ctx, SmartList<${typeClass}> list, String queryName<@T.getRequestProcessingUrlMethodParameters query/>) throws Exception {
	<#if query.queryActionInfo?has_content>
		if (list == null || list.isEmpty()) {
			return;
		}
		<#list query.queryActionInfo.listEnhancePathList as enhanceInfo>
			<#if enhanceInfo.methodType == 'enhance'>
		List<${enhanceInfo.enhancedTypeName}> ${enhanceInfo.enhancedListVarName} = ${NAMING.toCamelCase(project_name)}BaseUtils.collectReferencedObjectWithType(ctx, ${enhanceInfo.standOnVarName}, ${enhanceInfo.enhancedTypeName}.class);
		ctx.getDAOGroup().enhanceList(${enhanceInfo.enhancedListVarName}, ${enhanceInfo.enhancedTypeName}.class);
			<#else>
		List<${enhanceInfo.enhancedTypeName}> ${enhanceInfo.enhancedListVarName} = ctx.getDAOGroup().get${NAMING.toCamelCase(enhanceInfo.ownerType)}DAO().${enhanceInfo.methodName}(ctx,${enhanceInfo.standOnVarName}, EO);
			</#if>
		</#list>
	</#if>
	}
  </#if>
</#list>
}
