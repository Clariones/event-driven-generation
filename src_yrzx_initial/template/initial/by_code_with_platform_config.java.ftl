            String platformCfgId = ROOT_PLATFORM_CONFIG;
            String sql = "select * from ${data.name}_data where name=?";
            ${helper.NameAsThis(data.name)} rcd = ctx.getDAOGroup().get${helper.NameAsThis(data.name)}DAO().queryList(sql, curName).first();
            if (rcd != null){
<#assign varNames=[]/>
<#list data.initialData?keys as attrName>
                rcd.update${helper.NameAsThis(attrName)}(cur${helper.NameAsThis(attrName)});
    <#assign varNames=varNames+["cur"+ helper.NameAsThis(attrName)]/>
</#list>
                rcd.updatePlatformConfiguration(PlatformConfiguration.withId(ROOT_PLATFORM_CONFIG));
                rcd = ctx.getManagerGroup().get${helper.NameAsThis(data.name)}Manager().internalSave${helper.NameAsThis(data.name)}(ctx, rcd, EO);
            }else{
                rcd = ctx.getManagerGroup().get${helper.NameAsThis(data.name)}Manager().create${helper.NameAsThis(data.name)}(ctx, ${varNames?join(", ","")}, platformCfgId);
            }
