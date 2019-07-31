<#import "tools.ftl" as T/>
package ${package};

import ${base_package}.${context_name};
import ${base_package}.${custom_context_name};
import ${base_package}.BaseViewPage;

import java.math.BigDecimal;
import java.util.Map;

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
	<#-- 缓存功能 -->
		String accessUrl = makeUrlF("${T.getRequestProcessingMethodName(request)}", false<@T.getRequestProcessingUrlMethodParametersWithoutType request/><#if request.needLogin></#if>);
		
	<#if request.cacheTimeInSeconds gt 0>
		Map<String, Object> existedResult = (Map<String, Object>) userContext.getCachedObject(accessUrl, Map.class);
		if (!(existedResult == null || existedResult.isEmpty())) {
			return existedResult;
		}
	</#if>
		${custom_context_name} ctx = (${custom_context_name}) userContext;
		ctx.setAccessUrl(accessUrl);
		<@getRequestUser request />
	<#if request.hasFootprint>
		ctx.addFootprint(this);
	</#if>
	<#if request.parameters?has_content>
		<#list request.parameters as param>
		ctx.set${NAMING.toCamelCase(param.paramName)}(${NAMING.toCamelCase(param.paramName)?uncap_first});
		</#list>
	</#if>
		commonLog(ctx, "${T.getRequestProcessingMethodName(request)}", "${request.comments!}", ctx.getRemoteIP(), ctx.tokenId(), makeUrlF("", false<@T.getRequestProcessingUrlMethodParametersWithoutType request/>), null);
	<@requestProcessAndReturn request>
	</@>
	}
</#macro>

<#macro formPostHanlingMethod request>
	public Object ${T.getRequestProcessingMethodName(request)}(${context_name} userContext<@T.getRequestProcessingMethodParameters request/>) throws Exception {
		${custom_context_name} ctx = (${custom_context_name}) userContext;
		try{
			if (hasFormResubmitFlag(ctx)) {
				throwExceptionWithMessage(ctx, "请不要重复提交");
			}
			String accessUrl = makeUrlF("${T.getRequestProcessingMethodName(request)}", false, "formData");
			ctx.setAccessUrl(accessUrl);
			<@getRequestUser request "	"/>
	<#if request.hasFootprint>
			ctx.addFootprint(this);
	</#if>
		<#assign formName = request.parameters[0].formName />
			${helper.getBaseFormClassName(request.parameters[0])} form = new ${helper.getFormClassName(request.parameters[0])}().initByRequest(ctx, formData);
			form.verifyInputs();
			ctx.setInputFormData(form);
			commonLog(ctx, "${T.getRequestProcessingMethodName(request)}", "${request.comments!}", ctx.getRemoteIP(), ctx.tokenId(), formData, null);
		<@requestProcessAndReturn request "	">
		</@>
		}finally {
			ctx.clearFormResubmitFlag();
		}
	}
</#macro>



<#macro getRequestUser request prefix="">
	<#if request.needLogin>
		${prefix}ensureCurrentUserInfo(ctx);
	<#else>
		${prefix}getCurrentUserInfo(ctx);
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
			${prefix}case PRC_${NAMING.toJavaConstStyle(branch.name)}:
			${prefix}default: { //  ${branch.comments!}
				${prefix}page = assembler${NAMING.toCamelCase(branch.page)}Page(ctx, "${T.getRequestProcessingMethodName(request)}");
				${prefix}break;
			${prefix}}
		${prefix}}
		<#if request.canRefresh>
		${prefix}page.setLinkToUrl(accessUrl);
		</#if>
		<#if request.cacheTimeInSeconds gt 0>
		${prefix}existedResult = page.doRender(ctx);
		${prefix}userContext.putToCache(accessUrl, existedResult, ${request.cacheTimeInSeconds});
		${prefix}return existedResult;
		<#else>
		${prefix}return page.doRender(ctx);
		</#if>
	<#else>
		<#assign branch=helper.getDefaultBranch(request)/>
		${prefix}int resultCode = processRequest${T.getRequestProcessingMethodName(request)?cap_first}(ctx);
		${prefix}if ($PRC_RESULT_OBJECT_WAS_SET == resultCode){
		${prefix}	return ctx.getResultObject();
		${prefix}}
		${prefix}BaseViewPage page = assembler${NAMING.toCamelCase(branch.page)}Page(ctx, "${T.getRequestProcessingMethodName(request)}");
		<#if request.canRefresh>
		${prefix}page.setLinkToUrl(accessUrl);
		</#if>
		<#if request.cacheTimeInSeconds gt 0>
		${prefix}existedResult = page.doRender(ctx);
		${prefix}userContext.putToCache(accessUrl, existedResult, ${request.cacheTimeInSeconds});
		${prefix}return existedResult;
		<#else>
		${prefix}return page.doRender(ctx);
		</#if>
	</#if>
</#macro>