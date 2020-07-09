<#import "tools.ftl" as T/>
package ${package}pageview;

import com.terapico.caf.viewpage.SerializeScope;
import ${package}pageview.CustomBaseViewPage;
import ${base_package}.${context_name};
import ${base_package}.${custom_context_name};
import ${base_package}.${NAMING.toCamelCase(project_name)}ViewScope;

public class ${class_name}Page extends CustomBaseViewPage{
	private static final long serialVersionUID = 1L;
	private static ${NAMING.toCamelCase(project_name)}ViewScope ViewScope = ${NAMING.toCamelCase(project_name)}ViewScope.getInstance();
	protected static final SerializeScope SCOPE = SerializeScope.INCLUDE()
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
<#if page.listOfTemplate?has_content || page.renderClassName?has_content>
	@Override
	protected void afterDoRendering() {
		super.afterDoRendering();
	<#if page.listOfTemplate?has_content>
		forceResponseAsListOfPage();
	</#if>
	<#if page.renderClassName?has_content>
		userContext.forceResponseXClassHeader("${page.renderClassName}");
	</#if>
	}
</#if>
	@Override
	public void assemblerContent(${context_name} userContext, String requestName)throws Exception {
		${custom_context_name} ctx = (${custom_context_name})userContext;
	<#if class_name=="SimpleToast">
	    set("toast", ctx.getToast());
	<#else>
		// TODO: 需要实现
		setPageTitle("尚未实现");
	</#if>
	}
}
