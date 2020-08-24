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
<#-- list script.queryInfoList as query >
	<#if imported?seq_contains(query.objectName)>
	<#else>
import ${base_package}.${NAMING.toCamelCase(query.objectName)?lower_case}.${NAMING.toCamelCase(query.objectName)};
	<#assign imported = imported + [query.objectName] />
	</#if>
</#list -->
<#list script.objectParamTypes as typeName>
import ${typeName};
</#list>

/**
 * 此类负责：声明所有{@link ${class_name}ViewService}中所使用的数据库搜索方法。 单独列出的目的是便于维护。
 * @author clariones
 *
 */
public abstract class ${class_name}DBQueryHelper{
<#-- 固定的部分 -->
	public static final Map<String, Object> EO = new HashMap<>();
	public int getPageSize(${custom_context_name} ctx, String queryName) {
		return 20;
	}
	protected Map<String, Integer> toCountMap(List<Map<String, Object>> mapList) {
        Map<String, Integer> countMap = new HashMap<>();
        for(Map<String, Object> mapData : mapList) {
            String key = null;
            int num = 0;
            for(Object val: mapData.values()) {
                if (val instanceof String) {
                    key = (String) val;
                    continue;
                }
                if (val instanceof Number) {
                    num = ((Number) val).intValue();
                }
            }
            countMap.put(key, num);
        }
        return countMap;
    }
    protected boolean isEmpty(Object input) {
        if (input == null){
            return true;
        }
        if (input instanceof String){
            return TextUtil.isBlank((String) input);
        }
        return true;
    }
	@SuppressWarnings("serial")
	public <T> List<T> asList(T object) {
		return new ArrayList<T>() {{add(object);}};
	}
    protected void addParam(List<Object> params, Object ... values){
	    if (values == null || values.length == 0){
	        return;
        }
	    if (values.length == 1){
	        params.add(values[0]);
	        return;
        }
	    params.addAll(Arrays.asList(values));
    }
<#-- 开始生成每一个查询 -->
<#list script.queryInfoList as query >
	/**
	 * ${query.comments!}.
	 */
	<#assign typeClass=helper.NameAsThis(query.objectName)/>
  <#if query.querySingleObject>
    <#if query.queryInfo?has_content>
  	    <#include "DbQuerySingleV2.java.ftl">
  	<#else>
  	    <#include "DbQuerySingleV0.java.ftl">
  	</#if>
  <#else>
    <#include "DbQueryListV2.java.ftl">
  </#if>
</#list>
}
