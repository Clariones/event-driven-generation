<#import "tools.ftl" as T/>
package ${package};

import com.terapico.caf.viewpage.SerializeScope;
import ${package}.CustomBaseViewPage;
import ${base_package}.${context_name};
import ${base_package}.${custom_context_name};
import ${base_package}.${NAMING.toCamelCase(project_name)}ViewScope;

public class ${class_name}Page extends <#if page.listOfTemplate?has_content>BaseListOfViewPage<#else>BaseDetailViewPage</#if>{
<#--
	private static final long serialVersionUID = -1L;
	private static ${NAMING.toCamelCase(project_name)}ViewScope ViewScope = ${NAMING.toCamelCase(project_name)}ViewScope.getInstance();
-->
	protected static final SerializeScope SCOPE = SerializeScope.EXCLUDE();
<#--
			.field("title")
			.field("popup")
			.field("toast", SerializeScope.EXCLUDE())
			.field("refreshAction")
			.field("actions", SerializeScope.EXCLUDE())
			.field("actionList")
<#if page.listOfTemplate??>
			.field("displayMode")
			.field("emptyMessage")
			.field("list")
			.field("tabs")
</#if>
			;
-->
	@Override
	protected SerializeScope getSerializeScope() {
		return SCOPE;
	}

<#if page.pageTitle??>
	public String getPageTitle() {
		if (pageTitle == null) {
			return "${page.pageTitle}";
		}
		return pageTitle;
	}
</#if>
<#if page.listOfTemplate?has_content>
	@Override
	protected void beforeDoRendering() {
		super.beforeDoRendering();
		if (!hasDisplayMode()) {
		    this.set("displayMode", "${page.listOfTemplate}");
		}
	}
</#if>
	@Override
	public void assemblerContent(${context_name} userContext, String requestName)throws Exception {
	    this.userContext = userContext;
		${custom_context_name} ctx = (${custom_context_name})userContext;
	<#if class_name=="SimpleToast">
	    set("toast", ctx.getToast());
	<#else>
		// TODO: 需要实现
		setPageTitle("尚未实现");
	    <#if page.pageBuilder?has_content>
	    // boolean isEnterPage = TextUtil.isBlank(ctx.getLastRecordId());
            <#if page.pageBuilder.tabInfos?has_content>
		// String tabName = ctx.getTabName("${page.pageBuilder.defaultTabCode}");
		        <#list page.pageBuilder.tabInfos as tab>
        // makeTab("${tab.key}", "${tab.value}", isEnterPage, tabName,
        //        ${helper.NameAsThis(script.name)}ViewService.make${helper.NameAsThis(page.name)}Url(ctx, arg1, arg2 ...),
        //        ()->assemble${helper.NameAsThis(tab.key)}List("${tab.key}", "${tab.value}"));
        	    </#list>
        	<#else>
        // SmartList<${helper.NameAsThis(page.pageBuilder.queryTargetBean.modelTypeName)}> list = Q.${page.pageBuilder.targetQueryName}(ctx, "AB000001");
        // assembleList("list", list, it->new VComponentCardInList()
        //          .id(it.getId()),
        //          .title(it.getDisplayName())
        //          .mode("round")
        //          .linkToUrl(${helper.NameAsThis(script.name)}ViewService.make${helper.NameAsThis(page.pageBuilder.itemRequestName)}Url(ctx, it.getId(), arg2 ...),
        //          "没有合适的记录",
        //           ${helper.NameAsThis(script.name)}ViewService.make${helper.NameAsThis(page.pageBuilder.nextPageRequestName)}Url(ctx, null, null)
        //    );
        	</#if>
        </#if>
	</#if>
	}
<#if page.pageBuilder?has_content>
    <#if page.pageBuilder.tabInfos?has_content>
        <#list page.pageBuilder.tabInfos as tab>
    /*
    private void assemble${helper.NameAsThis(tab.key)}List(String tabCode, String tabName) {
        ${custom_context_name} ctx = (${custom_context_name})userContext;
        try{
            SmartList<${helper.NameAsThis(page.pageBuilder.queryTargetBean.modelTypeName)}> list = Q.${page.pageBuilder.targetQueryName}(ctx, "AB000001");
            assembleList("list", list, it->new VComponentCardInList()
                    .id(it.getId()),
                    .title(it.getDisplayName())
                    .mode("round")
                    .linkToUrl(${helper.NameAsThis(script.name)}ViewService.make${helper.NameAsThis(page.pageBuilder.itemRequestName)}Url(ctx, it.getId(), arg2 ...),
                    "没有" + tabName+"的记录",
                    ${helper.NameAsThis(script.name)}ViewService.make${helper.NameAsThis(page.pageBuilder.nextPageRequestName)}Url(ctx, null, null)
            );
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    */
        </#list>
    </#if>
</#if>
}
