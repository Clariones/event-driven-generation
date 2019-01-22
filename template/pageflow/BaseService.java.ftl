<#import "tools.ftl" as T/>
package ${package};

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;

import ${base_package}.${context_name};
import ${base_package}.${custom_context_name};
import ${parent_class_package}.${parent_class_name};
import ${package}pageview.*;

/**
 * 此类负责：声明所有${class_name}ViewService中所使用的方法和常量。 单独列出的目的是便于维护。
 * @author clariones
 *
 */
public abstract class Base${class_name}ViewService extends ${parent_class_name}{
<#list helper.getAllBrachNames(script) as branchName>
	public static final int PRC_${NAMING.toJavaConstStyle(branchName)} = ${branchName?index};
</#list>


	protected String makeUrl(String methodName, Object ... params) {
		StringBuilder sb = new StringBuilder(methodName).append("/");
		if (params != null) {
			for(Object param : params) {
				if (param == null) {
					sb.append('+').append('/');
					continue;
				}
				try {
					sb.append(URLEncoder.encode(String.valueOf(param), "utf-8"));
				} catch (UnsupportedEncodingException e) {
					sb.append(URLEncoder.encode(String.valueOf(param)));
				}
				sb.append('/');
			}
		}
		return sb.toString();
	}
<#list script.requests as request>
	// 处理请求：${request.comments!}
	protected String make${T.getRequestProcessingMethodName(request)?cap_first}Url(${custom_context_name} ctx<@T.getRequestProcessingUrlMethodParameters request/>){
		return makeUrl("${T.getRequestProcessingMethodName(request)}"<@T.getRequestProcessingMethodParameterNames request/>);
	}
</#list>

<#list script.requests as request>
	/** 处理请求：${request.comments!}. 返回值：<#list request.branches as branch>PRC_${NAMING.toJavaConstStyle(branch.name)}: ${branch.comments!}; </#list> */
	protected abstract int processRequest${T.getRequestProcessingMethodName(request)?cap_first}(${custom_context_name} ctx) throws Exception;
</#list>

<#list script.pages as name,page>
	protected abstract ${NAMING.toCamelCase(page.name)}Page assembler${NAMING.toCamelCase(page.name)}Page(${custom_context_name} ctx, String requestName)throws Exception;
</#list>
}