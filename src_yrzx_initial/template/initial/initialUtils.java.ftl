<#assign ctxName="CustomYrzxUserContextImpl"/>
    protected void doAll(${ctxName} ctx) throws Exception {
<#list dataList as data>
        initiDataFor${helper.NameAsThis(data.name)}(ctx);
</#list>
    }
<#list dataList as data>
    <#assign varName=""/>
    protected void initiDataFor${helper.NameAsThis(data.name)}(${ctxName} ctx) throws Exception{
    <#list data.initialData?keys as attrName>
        <#if helper.isFunction(data.initialData[attrName])>
        // provided${helper.NameAsThis(attrName)} will be treated by ${data.initialData[attrName]}
        <#else>
        String[] provided${helper.NameAsThis(attrName)} = split("${data.initialData[attrName]}");
            <#if !varName?has_content>
                <#assign varName=attrName/>
            </#if>
        </#if>
    </#list>
        resetId(ctx, (YrzxBaseDAOImpl) ctx.getDAOGroup().get${helper.NameAsThis(data.name)}DAO());
        for(int i=0;i<provided${helper.NameAsThis(varName)}.length;i++){
    <#assign varNames=[]/>
    <#list data.initialData?keys as attrName>
        <#if helper.isFunction(data.initialData[attrName])>
        <#else>
            String cur${helper.NameAsThis(attrName)} = provided${helper.NameAsThis(attrName)}[i];
            <#assign varNames=varNames+["cur"+ helper.NameAsThis(attrName)]/>
        </#if>
    </#list>
    <#list data.initialData?keys as attrName>
        <#if helper.isFunction(data.initialData[attrName])>
            String cur${helper.NameAsThis(attrName)} = ${helper.getFunctionName(data.initialData[attrName])}(${varNames?join(", ","")});
        </#if>
    </#list>
    <#include "/initial/"+data.template+".java.ftl">
        }
    }
</#list>