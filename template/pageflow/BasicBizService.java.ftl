<#import "tools.ftl" as T/>
package ${package};

import ${base_package}.${context_name};
import ${base_package}.${custom_context_name};
import ${base_package}.Footprint;
import ${base_package}.FootprintProducer;

/**
 * 此类负责：所有的基础设施服务。 例如重复提交的基础方法，权限认证，异常包装，本服务内的通用工具方法等。
 * @author clariones
 *
 */
public abstract class Basic${class_name}ViewBizService extends Base${class_name}ViewService implements FootprintProducer {
	protected void getCurrentUser(CustomMoyiUserContextImpl ctx) {
		// TODO 从redis的数据中获得当前用户
	}
	protected void ensureCurrentUser(CustomMoyiUserContextImpl ctx) throws Exception{
		getCurrentUser(ctx);
		if (ctx.getCurrentUser() == null){
			throw new Exception("请先登录");
		}
	}
	@Override
	public boolean canReplaceFootPrint(Footprint fp1, Footprint fp2) {
		if (!fp1.getMethodName().equals(fp2.getMethodName())) {
			return false;
		}
		return true;
	}

	@Override
	public boolean clearTop() {
		return true;
	}
}