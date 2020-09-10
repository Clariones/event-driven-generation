package ${base_package}.${helper.nameAsThis(spec.name)?lower_case};

import com.terapico.workflow.*;

public class ${helper.NameAsThis(spec.name)}ProcessSpec extends ProcessSpec {
<#assign curKey=""/>
<#list helper.allConstants(spec) as key,value>
    <#if helper.keyTypeChanged(curKey, key)><#-- 需要一个空行 -->

    </#if>
    <#assign curKey=key/>
    public static final String ${helper.NAME_AS_THIS(key)} = ${value}
</#list>


    protected static ${helper.NameAsThis(spec.name)}ProcessSpec spec = new ${helper.NameAsThis(spec.name)}ProcessSpec();
    static {
        spec.setName("${helper.NameAsThis(spec.name)}");
        spec.setTitle("${spec.zhName}");
        NodeSpec status = null;
        EventSpec event = null;



<#list spec.allNodeSpecMap?keys as statusCode>
    <#assign nodeSpec = spec.allNodeSpecMap[statusCode]/>
        // 状态: ${nodeSpec.zhName!nodeSpec.name}
        status = spec.addStatus(STATUS_${helper.NAME_AS_THIS(statusCode)}, "${nodeSpec.zhName!nodeSpec.name}");
    <#list nodeSpec.allRoleSpecMap?keys as roleName>
        <#assign roleSpec=nodeSpec.allRoleSpecMap[roleName]/>
        <#if roleSpec.actions?has_content>
        status.addActions(ROLE_${helper.NAME_AS_THIS(roleName)}, <#list roleSpec.actions as action>ACTION_${helper.NAME_AS_THIS(action)}<#if action?has_next>,</#if></#list>);
        </#if>
    <#else>
    </#list>
    <#if nodeSpec.allRoleSpecMap?has_content>

    </#if>
    <#list nodeSpec.enterChecking?keys as statusCode>
        status.getEnterCheckingNodes().put(STATUS_${helper.NAME_AS_THIS(statusCode)}, ${helper.NAME_AS_THIS(nodeSpec.enterChecking[statusCode])});
    <#else>
    </#list>
    <#if nodeSpec.enterChecking?has_content>

    </#if>
    <#list nodeSpec.allEventSpecMap?keys as eventName>
        <#assign eventSpec = nodeSpec.allEventSpecMap[eventName]/>
        event = status.addEvent(EVENT_${helper.NAME_AS_THIS(eventSpec.name)},"${eventSpec.zhName!eventSpec.name}");
        <#if eventSpec.allowedRoles?has_content>
        event.setAllowedRoles(${eventSpec.blocking?c}, <#list eventSpec.allowedRoles as role>ROLE_${helper.NAME_AS_THIS(role)}<#if role?has_next>,</#if></#list>);
        </#if>
        <#list eventSpec.allResultMap?keys as resultCode>
            <#assign resultSpec = eventSpec.allResultMap[resultCode] />
        event.addResult(RESULT_CODE_${helper.NAME_AS_THIS(resultCode)}, "${resultSpec.zhName!resultSpec.name}",
            ${helper.NAME_AS_THIS(resultSpec.transferType)}, new String[]{<#list resultSpec.targetStatusCode as code>STATUS_${helper.NAME_AS_THIS(code)}<#if code?has_next>,</#if></#list>});
        </#list>
    <#else>
        // 没有任何事件需要处理
    </#list>



</#list>
    }

    public static ${helper.NameAsThis(spec.name)}ProcessSpec getSpec() {
        return spec;
    }

}