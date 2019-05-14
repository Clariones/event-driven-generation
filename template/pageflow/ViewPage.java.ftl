<#import "tools.ftl" as T/>
package ${package}pageview;

import com.terapico.caf.viewpage.SerializeScope;
import ${base_package}.BaseViewPage;

public class ${class_name}Page extends BaseViewPage{
	private static final long serialVersionUID = 1L;
	protected static final SerializeScope SCOPE = SerializeScope.INCLUDE()
			.field("popup")
			.field("refreshAction")
			.field("actions", SerializeScope.EXCLUDE())
			.field("actionList")
<#if page.listOfTemplate??>
			.field("displayMode")
</#if>
			;
	@Override
	protected SerializeScope getSerializeScope() {
		return SCOPE;
	}

<#if page.listOfTemplate??>
	@Override
	protected void beforeDoRendering() {
		super.beforeDoRendering();
		this.set("displayMode", "${page.listOfTemplate}");
	}

	@Override
	protected void afterDoRendering() {
		super.afterDoRendering();
		userContext.forceResponseXClassHeader("com.terapico.moyi.appview.ListOfPage");
	}
</#if>
}
