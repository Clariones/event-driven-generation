<#import "tools.ftl" as T/>
<#assign has_cr_need_process=false />
<#list script.requests as request>
	<#if request.changeRequestName?has_content>
		<#assign has_cr_need_process=true />
	</#if>
</#list>
package ${package};

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.Cookie;
import com.auth0.jwt.interfaces.DecodedJWT;

import ${base_package}.${context_name};
import ${base_package}.${custom_context_name};
import ${base_package}.FootprintProducer;
import ${base_package}.MultipleAccessKey;
import ${base_package}.${NAMING.toCamelCase(project_name)}BaseConstants;
import ${base_package}.${NAMING.toCamelCase(project_name)}BaseUtils;
import ${base_package}.SmartList;
import ${base_package}.secuser.SecUser;
import ${base_package}.userapp.UserApp;
import ${base_package}.userapp.UserAppTokens;
import ${base_package}.${NAMING.toCamelCase(project_name)}Exception;
<#if script.userLoginInfo?has_content>
	<#assign loginInfo=script.userLoginInfo />
import ${base_package}.${NAMING.toCamelCase(loginInfo.userModelName)?lower_case}.${NAMING.toCamelCase(loginInfo.userModelName)};
	<#if loginInfo.canLoginBy("wechat_work_app")>
import ${base_package}.wechatworklogininfo.WechatWorkLoginInfo;
import me.chanjar.weixin.cp.api.WxCpService;
import me.chanjar.weixin.cp.bean.WxCpMaJsCode2SessionResult;
	</#if>
	<#if loginInfo.canLoginBy("wechat_app")>
import ${base_package}.wechatlogininfo.WechatLoginInfo;
import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
	</#if>
</#if>

import ${parent_class_package}.${parent_class_name};
import ${package}pageview.*;
import com.terapico.utils.DateTimeUtil;
import com.terapico.utils.JWTUtil;
import com.terapico.utils.MapUtil;
import com.terapico.utils.DebugUtil;
import com.terapico.utils.RandomUtil;
import com.terapico.utils.TextUtil;

import com.terapico.uccaf.BaseUserContext;
import com.terapico.caf.baseelement.LoginParam;
<#if helper.support("change_request")>
import com.terapico.caf.appview.ChangeRequestPostData;
import com.terapico.caf.appview.ChangeRequestProcessResult;
import com.terapico.caf.viewcomponent.GenericFormPage;
import ${base_package}.ChangeRequestHelper;
import ${base_package}.CR;
import ${base_package}.ChangeRequestHelper;
	<#if has_cr_need_process>
import com.terapico.uccaf.CafEntity;
import ${base_package}.changerequest.ChangeRequest;
import ${base_package}.changerequest.ChangeRequestService;
	</#if>
</#if>
/**
 * 此类负责：声明所有${class_name}ViewService中所使用的方法和常量。 单独列出的目的是便于维护。
 * @author clariones
 *
 */
public abstract class Base${class_name}ViewService extends ${parent_class_name} implements FootprintProducer{
<#if script.userLoginInfo?has_content>
	protected static interface BaseLoginHandler {
		String DEBUG = "debug";  // 调试时使用的简单登录接口，生产环境不可用
		String WECHAT_WORK_APP = "wechat_work_app";  // 前端使用小程序，用企业微信登录
		String WECHAT_APP = "wechat_app";  // 前端使用小程序, 做微信登录
		String MOBILE_AND_VCODE = "mobile_vcode";	// 前端使用手机号和验证码登录

		/**
		 * 用输入的信息，做登录的动作。
		 * @return 如果输入的信息错误，抛异常；如果输入的信息，不能登陆，抛异常；如果输入的信息允许登录，但是找不到对应的'登录目标'， 不抛异常，返回null；如果登录正常，返回登录成功的对象。
		 */
		public ${NAMING.toCamelCase(loginInfo.userModelName)} doLogin(${custom_context_name} ctx, LoginParam loginParam) throws Exception;
		
		/** 
		 * 获取处理后的登录相关信息
		 */
		public Map<String, Object> getProcessedLoginInfo(${custom_context_name} ctx);
		
		/**
		 * 新用户登录后,创建与之关联的登录信息
		 */
		public void createLoginInfoForNewTarget(${custom_context_name} ctx, ${NAMING.toCamelCase(loginInfo.userModelName)} loginTarget);
	}
</#if>
	public static final int $PRC_RESULT_OBJECT_WAS_SET = -1;
<#list helper.getAllBrachNames(script) as branchName>
	public static final int PRC_${NAMING.toJavaConstStyle(branchName)} = ${branchName?index};
</#list>
	protected boolean returnRightNow(int resultCode) {
		return $PRC_RESULT_OBJECT_WAS_SET == resultCode;
	}
	protected void getCurrentUserInfo(${custom_context_name} ctx) {
		// 从redis的数据中获得当前用户. 默认已经在checkAccess/loginXXX中完成, 如果有特别处理,可以在此完成
	}
	protected void ensureCurrentUserInfo(${custom_context_name} ctx) throws Exception{
		getCurrentUserInfo(ctx);
		if (ctx.getCurrentUserInfo() == null){
			throw new Exception("请先登录");
		}
	}
	protected void commonLog(${custom_context_name} ctx, String eventCode, String title, String key1, String key2,
			String key3, Object detailInfo) {
		// by default, only print log
		try {
			System.out.println("[  ${class_name}ViewBizService]: " + DebugUtil.dumpAsJson(MapUtil.putIf("eventCode", eventCode)
					.putIf("title", title).putIf("key1", key1).putIf("key2", key2).putIf("key3", key3)
					.putIf("detailInfo", detailInfo).into_map()	, true));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void onAccess(BaseUserContext baseUserContext, String methodName, Object[] parameters) {
		super.onAccess(baseUserContext, methodName, parameters);
		${custom_context_name} ctx = (${custom_context_name}) baseUserContext;
		ctx.saveAccessInfo(getBeanName(), methodName, parameters);
	}
	
	protected boolean hasFormResubmitFlag(${custom_context_name}  ctx) {
		Object flag = ctx.getFromContextLocalStorage(${NAMING.toCamelCase(project_name)}BaseConstants.KEY_RE_SUBMIT);
		if (flag == null) {
			return false;
		}
		if (flag instanceof Boolean) {
			return ((Boolean) flag).booleanValue();
		}
		return false;
	}
	protected Map<String, Object> makeToast(String content, int duration, String type) {
		HashMap<String, Object> toast = new HashMap<String, Object>();
		toast.put("text", content);
		toast.put("duration", duration * 1000);
		toast.put("icon", type);
		toast.put("position", "center");
		return toast;
	}
	protected static String makeUrl(String methodName, Object ... params) {
		return makeUrlF(methodName, true, params);
	}
	protected static String makeUrlF(String methodName, boolean encode, Object ... params) {
	<#if bean_name?has_content>
		StringBuilder sb = new StringBuilder("${bean_name}").append("/").append(methodName).append("/");
	<#else>
		StringBuilder sb = new StringBuilder(methodName).append("/");
	</#if>
		if (params != null) {
			for(Object param : params) {
				if (param == null || ((param instanceof String) && TextUtil.isBlank((String) param))) {
					sb.append('+').append('/');
					continue;
				}
				if (param instanceof Date) {
					sb.append(DateTimeUtil.formatDate((Date)param, "yyyy-MM-dd'T'HH:mm:ss")).append('/');
					continue;
				}
				boolean isVariable = false;
				if (param instanceof String && ((String) param).length() > 0) {
					isVariable = ((String) param).charAt(0) == ':';
				}
				if (encode && !isVariable) {
					try {
						sb.append(URLEncoder.encode(String.valueOf(param), "utf-8"));
					} catch (UnsupportedEncodingException e) {
						sb.append(URLEncoder.encode(String.valueOf(param)));
					}
				} else {
					sb.append(String.valueOf(param));
				}
				sb.append('/');
			}
		}
		return sb.toString();
	}
	<#include "/actions/sms/sendSms.java.ftl">
<#if script.userLoginInfo?has_content>
	<#include "/actions/login/login.java.ftl">
	<#include "/actions/login/checkAccess.java.ftl">
</#if>
	<#include "/actions/changerequest/process.java.ftl">

<#list script.requests as request>
	// 处理请求：${request.comments!} (${request.name})
	<#if request.changeRequestName?has_content>
		<#if request.needLogin>
			<#assign methodName = "customerStartCr"+NAMING.toCamelCase(request.changeRequestName) />
		<#else>
			<#assign methodName = "startCr"+NAMING.toCamelCase(request.changeRequestName) />
		</#if>
	public static String makeStartCr${NAMING.toCamelCase(request.changeRequestName)}Url(${custom_context_name} ctx<@T.getRequestProcessingUrlMethodParameters request/>){
		return makeUrl("${methodName}"<@T.getRequestProcessingMethodParameterNames request/>);
	}
	public static String make${NAMING.toCamelCase(request.name)}Url(${custom_context_name} ctx){
		return makeUrl("${T.getRequestProcessingMethodName(request)}");
	}
	<#else>
	public static String make${NAMING.toCamelCase(request.name)}Url(${custom_context_name} ctx<@T.getRequestProcessingUrlMethodParameters request/>){
		return makeUrl("${T.getRequestProcessingMethodName(request)}"<@T.getRequestProcessingMethodParameterNames request/>);
	}
	</#if>
</#list>

<#list script.requests as request>
	<#if request.changeRequestName?has_content>
		<#if request.needLogin>
			<#assign methodName = "customerStartCr"+NAMING.toCamelCase(request.changeRequestName) />
		<#else>
			<#assign methodName = "startCr"+NAMING.toCamelCase(request.changeRequestName) />
		</#if>
		<#assign crName = request.changeRequestName/>
	/** 处理请求：开始:${request.comments!}. */
	protected int processRequest${methodName?cap_first}(${custom_context_name} ctx) throws Exception {
		ChangeRequestHelper crHelper = ChangeRequestHelper.of(ctx);
		GenericFormPage response = crHelper.assemblerChangeRequstFirstStepResponse(ctx.getCurrentUserInfo(),
					CR.${helper.NAME_AS_THIS(crName)}.NAME, make${NAMING.toCamelCase(request.name)}Url(ctx));
		ctx.setChangeRequestResponse(response);
		return PRC_BY_DEFAULT;
	}
	</#if>
	/** 处理请求：<#if request.changeRequestName?has_content>提交:</#if>${request.comments!}. 返回值：<#list request.branches as branch>PRC_${NAMING.toJavaConstStyle(branch.name)}: ${branch.comments!}; </#list> */
	protected int processRequest${T.getRequestProcessingMethodName(request)?cap_first}(${custom_context_name} ctx) throws Exception { <#if !request.changeRequestName?has_content>return PRC_BY_DEFAULT;}
	<#else>

		ChangeRequestHelper crHelper = ChangeRequestHelper.of(ctx);
		ChangeRequestPostData postedData = crHelper.parsePostedData(ctx.getRequestParameters());
		ChangeRequestProcessResult crResult = crHelper.processChangeRequest(postedData, ctx.getCurrentUserInfo());
		ctx.setChangeRequestProcessResult(crResult);
		if (crResult.getResultCode().equals(ChangeRequestProcessResult.CODE_NOT_COMMITTED)) {
			Object response = crHelper.assemblerChangeRequstResponse(ctx.getCurrentUserInfo(), crResult.getNewChangeRequestType(),
					crResult.getNewSceneCode(), crResult.getNewGroupIds(), make${NAMING.toCamelCase(request.name)}Url(ctx));
			ctx.setResultObject(response);
			return $PRC_RESULT_OBJECT_WAS_SET;	
		}
		processChangeRequest(ctx, crResult.getChangeRequest());
		return PRC_BY_DEFAULT;
	}
	</#if>
</#list>

<#list script.pages as name,page>
	<#if page.name == "general_cr_page">
		<#continue>
	</#if>
	protected ${NAMING.toCamelCase(page.name)}Page assembler${NAMING.toCamelCase(page.name)}Page(${custom_context_name} ctx, String requestName)throws Exception {
		${NAMING.toCamelCase(page.name)}Page page = new ${NAMING.toCamelCase(page.name)}Page();
		page.assemblerContent(ctx, requestName);
		return page;
	}
</#list>
}
