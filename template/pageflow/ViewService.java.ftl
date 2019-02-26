<#import "tools.ftl" as T/>
package ${package};

import ${base_package}.${context_name};
import ${base_package}.${custom_context_name};
import ${base_package}.BaseViewPage;

import java.math.BigDecimal;

<#list helper.getAllForms(script) as form>
	<#if form.customized>
import ${base_package}.${NAMING.toCamelCase(form.formName)?lower_case}.${helper.getBaseFormClassName(form)};
	</#if>
import ${base_package}.${NAMING.toCamelCase(form.formName)?lower_case}.${helper.getFormClassName(form)};
</#list>


/**
 * 此类负责：所有的页面入口。 以及页面的组装
 * @author clariones
 *
 */
public abstract class ${class_name}ViewService extends Base${class_name}ViewService{
<#list script.requests as request>
	// ${request.comments!}(${request.name})
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
		ctx.addFootprint(this);
	</#if>
	<#if request.parameters?has_content>
		<#list request.parameters as param>
		ctx.set${NAMING.toCamelCase(param.paramName)}(${NAMING.toCamelCase(param.paramName)?uncap_first});
		</#list>
	</#if>
	<@requestProcessAndReturn request>
	</@>
	}
</#macro>

<#macro formPostHanlingMethod request>
	public Object ${T.getRequestProcessingMethodName(request)}(${context_name} userContext<@T.getRequestProcessingMethodParameters request/>) throws Exception {
		${custom_context_name} ctx = (${custom_context_name}) userContext;
		try{
			<@getRequestUser request "	"/>
	<#if request.hasFootprint>
			ctx.addFootPrint(this);
	</#if>
		<#assign formName = request.parameters[0].formName />
			${helper.getBaseFormClassName(request.parameters[0])} form = new ${helper.getFormClassName(request.parameters[0])}().initByRequest(ctx, formData);
			form.verifyInputs();
			ctx.setInputFormData(form);
		<@requestProcessAndReturn request "	">
		</@>
		}finally {
			ctx.clearFormResubmitFlag();
		}
	}
</#macro>



<#macro getRequestUser request prefix="">
	<#if request.needLogin>
		${prefix}ensureCurrentUser(ctx);
	<#else>
		${prefix}getCurrentUser(ctx);
	</#if>
</#macro>


<#macro requestProcessAndReturn request prefix="">
	<#if helper.isRequestHasBranch(request)>
		<#assign otherBranches=helper.getAllOtherBranches(request)/>
		${prefix}int resultCode = processRequest${T.getRequestProcessingMethodName(request)?cap_first}(ctx);
		${prefix}if ($PRC_RESULT_OBJECT_WAS_SET == resultCode){
		${prefix}	return ctx.getResultObject();
		${prefix}}
		${prefix}BaseViewPage page = null;
		${prefix}switch(resultCode){
		<#list otherBranches as branch>
			${prefix}case PRC_${NAMING.toJavaConstStyle(branch.name)}:{
				${prefix}// ${branch.comments!}
				${prefix}page = assembler${NAMING.toCamelCase(branch.page)}Page(ctx, "${T.getRequestProcessingMethodName(request)}");
				${prefix}break;
			${prefix}}
		</#list>
			<#assign branch=helper.getDefaultBranch(request)/>
			${prefix}default: { // ${NAMING.toJavaConstStyle(branch.name)} ${branch.comments!}
				${prefix}page = assembler${NAMING.toCamelCase(branch.page)}Page(ctx, "${T.getRequestProcessingMethodName(request)}");
				${prefix}break;
			${prefix}}
		${prefix}}
		${prefix}return page.doRender(ctx);
	<#else>
		<#assign branch=helper.getDefaultBranch(request)/>
		${prefix}int resultCode = processRequest${T.getRequestProcessingMethodName(request)?cap_first}(ctx);
		${prefix}if ($PRC_RESULT_OBJECT_WAS_SET == resultCode){
		${prefix}	return ctx.getResultObject();
		${prefix}}
		${prefix}BaseViewPage page = assembler${NAMING.toCamelCase(branch.page)}Page(ctx, "${T.getRequestProcessingMethodName(request)}");
		${prefix}return page.doRender(ctx);
	</#if>
</#macro>