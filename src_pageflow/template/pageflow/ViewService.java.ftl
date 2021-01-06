<#import "tools.ftl" as T/>
package ${package};

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
<#if helper.support("change_request")>
import com.terapico.caf.appview.ChangeRequestPostData;
import com.terapico.caf.appview.ChangeRequestProcessResult;
import com.terapico.caf.viewcomponent.GenericFormPage;
</#if>

import ${base_package}.${context_name};
import ${base_package}.${custom_context_name};
import ${base_package}.BaseViewPage;
<#if helper.support("change_request")>
import ${base_package}.CR;
import ${base_package}.ChangeRequestHelper;
</#if>
import com.terapico.utils.DebugUtil;
import org.springframework.transaction.annotation.Transactional;


<#list helper.getAllForms(script) as form>
    <#if form.formName == "free form">
        <#continue/>
    </#if>
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
	@Transactional
	<#if request.changeRequestName?has_content>
		<@changeRequestHanlingMethod request />
	<#elseif request.handleForm>
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
		commonLog(ctx, "${T.getRequestProcessingMethodName(request)}", "${request.comments!request.name}", ctx.getRemoteIP(), ctx.tokenId(), makeUrlF("${T.getRequestProcessingMethodName(request)}", false<@T.getRequestProcessingUrlMethodParametersWithoutType request/>), requestDetail(ctx));
	<@requestProcessAndReturn request>
	</@>
	}
</#macro>

<#macro formPostHanlingMethod request>
	public Object ${T.getRequestProcessingMethodName(request)}(${context_name} userContext<@T.getRequestProcessingMethodParameters request/>) throws Exception {
		${custom_context_name} ctx = (${custom_context_name}) userContext;
		if (hasFormResubmitFlag(ctx)) {
			throwExceptionWithMessage(ctx, "请不要重复提交");
		}
		try{
			String accessUrl = makeUrlF("${T.getRequestProcessingMethodName(request)}", false, "formData");
			ctx.setAccessUrl(accessUrl);
			<@getRequestUser request "	"/>
	<#if request.hasFootprint>
			ctx.addFootprint(this);
	</#if>
		<#assign formName = request.parameters[0].formName />
		<#if formName == "free form">
		    ctx.setFormData(ctx.getRequestParameters());
		    String formData = DebugUtil.dumpAsJson(ctx.getFormData(), true);
		<#else>
			${helper.getBaseFormClassName(request.parameters[0])} form = new ${helper.getFormClassName(request.parameters[0])}().initByRequest(ctx, formData);
			form.verifyInputs();
			ctx.setInputFormData(form);
		</#if>
			commonLog(ctx, "${T.getRequestProcessingMethodName(request)}", "${request.comments!request.name}", ctx.getRemoteIP(), ctx.tokenId(), formData, requestDetail(ctx));
		<@requestProcessAndReturn request "	">
		</@>
		}finally {
			ctx.clearFormResubmitFlag();
		}
	}
</#macro>

<#macro changeRequestHanlingMethod request>
	<#if request.needLogin>
		<#assign methodName = "customerStartCr"+NAMING.toCamelCase(request.changeRequestName) />
	<#else>
		<#assign methodName = "startCr"+NAMING.toCamelCase(request.changeRequestName) />
	</#if>
	public Object ${methodName}(${context_name} userContext<@T.getRequestProcessingMethodParameters request/>) throws Exception {
		${custom_context_name} ctx = (${custom_context_name}) userContext;
		String accessUrl = makeUrlF("${methodName}", false<@T.getRequestProcessingUrlMethodParametersWithoutType request/>);
		ctx.setAccessUrl(accessUrl);
    <#if request.parameters?has_content>
        <#list request.parameters as param>
        ctx.set${NAMING.toCamelCase(param.paramName)}(${NAMING.toCamelCase(param.paramName)?uncap_first});
        </#list>
    </#if>
		<@getRequestUser request ""/>
		commonLog(ctx, "${methodName}", "开始:${request.comments!}", ctx.getRemoteIP(), ctx.tokenId(), accessUrl, requestDetail(ctx));
		int resultCode = processRequest${methodName?cap_first}(ctx);
		if (returnRightNow(resultCode)){
			return ctx.getResultObject();
		}
		return ctx.getChangeRequestResponse();
	}
	
	public Object ${T.getRequestProcessingMethodName(request)}(${context_name} userContext) throws Exception {
		${custom_context_name} ctx = (${custom_context_name}) userContext;
		if (hasFormResubmitFlag(ctx)) {
			throwExceptionWithMessage(ctx, "请不要重复提交");
		}
		try{
			String accessUrl = makeUrlF("${T.getRequestProcessingMethodName(request)}", false);
			ctx.setAccessUrl(accessUrl);
			<@getRequestUser request "	"/>
		<#assign crName = request.changeRequestName/>
			commonLog(ctx, "${T.getRequestProcessingMethodName(request)}", "${request.comments!request.name}", ctx.getRemoteIP(), ctx.tokenId(), null, ctx.getRequestParameters());
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
		${prefix}if (returnRightNow(resultCode)){
		${prefix}	return ctx.getResultObject();
		${prefix}}
		${prefix}BaseViewPage page = null;
		${prefix}switch(resultCode){
		<#list otherBranches as branch>
			${prefix}case PRC_${NAMING.toJavaConstStyle(branch.name)}:{
				${prefix}// ${branch.comments!}
			<#if branch.page=="general_cr_page">
				${prefix}return ctx.getChangeRequestResponse();
			<#elseif branch.page?starts_with("form:")>
			    <@startCR prefix, branch/>
            <#else>
				${prefix}page = assembler${NAMING.toCamelCase(branch.page)}Page(ctx, "${T.getRequestProcessingMethodName(request)}");
				${prefix}break;
			</#if>
			${prefix}}
		</#list>
			<#assign branch=helper.getDefaultBranch(request)/>
			${prefix}case PRC_${NAMING.toJavaConstStyle(branch.name)}:<#if branch.name != 'by default'>
			${prefix}case PRC_BY_DEFAULT:</#if> {
			<#if branch.page=="general_cr_page">
				${prefix}return ctx.getChangeRequestResponse();
			<#elseif branch.page?starts_with("form:")>
			    <@startCR prefix, branch/>
			<#else>
				${prefix}page = assembler${NAMING.toCamelCase(branch.page)}Page(ctx, "${T.getRequestProcessingMethodName(request)}");
				${prefix}break;
			</#if>
			${prefix}}
			${prefix}default: {
				${prefix}throwExceptionWithMessage(ctx, "未定义的分支代码"+resultCode);
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
		${prefix}if (returnRightNow(resultCode)){
		${prefix}	return ctx.getResultObject();
		${prefix}}
		<#if branch.page=="general_cr_page">
		${prefix}return ctx.getChangeRequestResponse();
		<#else>
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
	</#if>
</#macro>

<#macro startCR prefix, branch>
<#assign formName=branch.page?substring(6)/>
                <#assign crReq=helper.getCrRequestByName(formName)/>
                <#if crReq.needLogin>
                    <#assign methodName = "customerStartCr"+helper.NameAsThis(crReq.changeRequestName) />
                <#else>
                    <#assign methodName = "startCr"+helper.NameAsThis(crReq.changeRequestName) />
                </#if>
                ${prefix}return ${methodName}(ctx<@T.getRequestRequestMethodParameterNames crReq/>);
</#macro>