<#import "tools.ftl" as T/>
package ${package}pageview;

import com.terapico.caf.viewpage.SerializeScope;
import ${base_package}.BaseViewPage;
import ${base_package}.${NAMING.toCamelCase(project_name)}ViewScope;

public class ${class_name}Page extends BaseViewPage{
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
		this.set("displayMode", "${page.listOfTemplate}");
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
}
