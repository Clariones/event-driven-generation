<#import "tools.ftl" as T/>
package ${package};

import com.terapico.utils.DebugUtil;
import com.terapico.utils.MapUtil;
import ${base_package}.${context_name};
import ${base_package}.${custom_context_name};


/**
 * 此类负责：所有的业务逻辑，例如所有的过滤规则，计算规则
 * @author clariones
 *
 */
public class ${class_name}ViewBizService extends Basic${class_name}ViewBizService{
	@Override
	protected void commonLog(CustomYrzxUserContextImpl ctx, String eventCode, String title, String key1, String key2,
			String key3, Object detailInfo) {
		// by default, only print log
		try {
			System.out.println("[  WxappV3ViewBizService]: " + DebugUtil.dumpAsJson(MapUtil.putIf("eventCode", eventCode)
					.putIf("title", title).putIf("key1", key1).putIf("key2", key2).putIf("key3", key3)
					.putIf("detailInfo", detailInfo).into_map()	, true));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
<#list script.requests as request>
	// 处理请求：${request.comments!}. 返回值：<#list request.branches as branch>PRC_${NAMING.toJavaConstStyle(branch.name)}: ${branch.comments!}; </#list>
	@Override
	protected int processRequest${T.getRequestProcessingMethodName(request)?cap_first}(${custom_context_name} ctx) throws Exception {
		// TODO
		return PRC_BY_DEFAULT;
	}
	
</#list>

<#-- assembler pages 现在都不用生成了
<#list script.pages as name,page>
	// ${page.comments!}
	@Override
	protected ${NAMING.toCamelCase(page.name)}Page assembler${NAMING.toCamelCase(page.name)}Page(${custom_context_name} ctx, String requestName) throws Exception {
		// TODO
		return null;
	}
	
</#list>
 -->
}
