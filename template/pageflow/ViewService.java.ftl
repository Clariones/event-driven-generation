<#import "tools.ftl" as T/>
package ${package};

import ${base_package}.${context_name};
import ${base_package}.${custom_context_name};

/**
 * 此类负责：所有的页面入口。 以及页面的组装
 * @author clariones
 *
 */
public class ${class_name}ViewService extends ${class_name}ViewBizService{
<#list script.requests as request>
	// ${request.comments!}
	<#if request.handleForm>
		<@formPostHanlingMethod request />
	<#else>
		<@commonRequestHanlingMethod request />
	</#if>
	
</#list>
}

<#macro commonRequestHanlingMethod request>
	public Object ${T.getRequestProcessingMethodName(request)}(${context_name} userContext<@T.getRequestProcessingMethodParameters request/>) throws Exception {
		${custom_context_name} ctx = (${custom_context_name}) userContext;
		<@getRequestUser request />
	<#if request.hasFootprint>
		ctx.addFootPrint(this);
	</#if>
	<#if request.parameters?has_content>
		<#list request.parameters as param>
		ctx.set${NAMING.toCamelCase(param.paramName)}Param(${NAMING.toCamelCase(param.paramName)?uncap_first});
		</#list>
	</#if>
	<@requestProcessAndReturn request>
	</@>
	}
</#macro>

<#macro formPostHanlingMethod request>
	public Object ${T.getRequestProcessingMethodName(request)}(${context_name} userContext<@T.getRequestProcessingMethodParameters request/>) throws Exception {
		${custom_context_name} ctx = (${custom_context_name}) userContext;
		<@getRequestUser request />
	<#if request.hasFootprint>
		ctx.addFootPrint(this);
	</#if>
		<#assign formName = request.parameters[0].formName />
		${NAMING.toCamelCase(formName)}FormProcessor form = new ${NAMING.toCamelCase(formName)}FormProcessor().initByRequest(formData);
		form.verifyInput();
		ctx.setInputFormData(form);
	<@requestProcessAndReturn request>
	</@>
	}
</#macro>



<#macro getRequestUser request>
	<#if request.needLogin>
		ensureCurrentUser(ctx);
	<#else>
		getCurrentUser(ctx);
	</#if>
</#macro>


<#macro requestProcessAndReturn request>
	<#if helper.isRequestHasBranch(request)>
		<#assign otherBranches=helper.getAllOtherBranches(request)/>
		int resultCode = processRequest${T.getRequestProcessingMethodName(request)?cap_first}(ctx);
		BaseViewPage page = null;
		switch(resultCode){
		<#list otherBranches as branch>
			case PRC_${NAMING.toJavaConstStyle(branch.name)}:{
				// ${branch.comments!}
				page = assembler${NAMING.toCamelCase(branch.page)}Page(ctx, "${T.getRequestProcessingMethodName(request)}");
				break;
			}
		</#list>
			<#assign branch=helper.getDefaultBranch(request)/>
			default: { // ${NAMING.toJavaConstStyle(branch.name)} ${branch.comments!}
				page = assembler${NAMING.toCamelCase(branch.page)}Page(ctx, "${T.getRequestProcessingMethodName(request)}");
				break;
			}
		}
		return page.doRender(ctx);
	<#else>
		<#assign branch=helper.getDefaultBranch(request)/>
		processRequest${T.getRequestProcessingMethodName(request)?cap_first}(ctx);
		BaseViewPage page = assembler${NAMING.toCamelCase(branch.page)}Page(ctx, "${T.getRequestProcessingMethodName(request)}");
		return page.doRender(ctx);
	</#if>
</#macro>