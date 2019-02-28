<#import "tools.ftl" as T/>
package ${package};

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ${base_package}.${context_name};
import ${base_package}.SmartList;
import ${base_package}.${custom_context_name};
import ${parent_class_package}.${parent_class_name};
import ${package}pageview.*;

import com.terapico.utils.TextUtil;
<#list script.queryInfoList as query >
import ${base_package}.${NAMING.toCamelCase(query.objectName)?lower_case}.${NAMING.toCamelCase(query.objectName)};
</#list>

/**
 * 此类负责：声明所有{@link ${class_name}ViewService}中所使用的数据库搜索方法。 单独列出的目的是便于维护。
 * @author clariones
 *
 */
public abstract class ${class_name}DBQueryHelper{
	public static final Map<String, Object> EO = new HashMap<>();
	public static int getPageSize(String queryName) {
		return 20;
	}
<#list script.queryInfoList as query >
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
	<#assign typeClass=NAMING.toCamelCase(query.objectName)/>
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
		int pageSize = getPageSize("query${typeClass}ListOf${NAMING.toCamelCase(query.name)}");
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
	
	${''}<@compress single_line=true>
	protected String prepareSqlAndParamsForQuery${typeClass}ListOf${NAMING.toCamelCase(query.name)}(
		${custom_context_name} ctx
		<#if query.pagination>, ${typeClass} lastRecord, int limit</#if>
		, List<Object> params<@T.getRequestProcessingUrlMethodParameters query/>
		) throws Exception {
	</@>${''}
		// TODO: 你需要自己实现这个部分
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
	}
	
	protected void enhance${typeClass}ListOf${NAMING.toCamelCase(query.name)}(${custom_context_name} ctx, SmartList<${typeClass}> list, String queryName<@T.getRequestProcessingUrlMethodParameters query/>) throws Exception {
		// TODO: 你需要自己实现这个部分
	}

</#list>
}