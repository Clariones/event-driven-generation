<#import "tools.ftl" as T/>
package ${package}pageview;

import com.terapico.caf.viewpage.SerializeScope;
import ${base_package}.BaseViewPage;

public class ${class_name}Page extends BaseViewPage{
	private static final long serialVersionUID = 1L;
	protected static final SerializeScope SCOPE = SerializeScope.INCLUDE()
			.field("id")
			;
	@Override
	protected SerializeScope getSerializeScope() {
		return SCOPE;
	}

}
