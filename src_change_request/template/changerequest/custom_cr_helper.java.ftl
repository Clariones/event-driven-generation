package com.${orgName?lower_case}.${projectName?lower_case};

import com.terapico.utils.DebugUtil;
/**
 * 在这里定制项目的ChangeRequestHelper
 *
 */
@SuppressWarnings("unchecked")
public class ChangeRequestHelper extends ${projectName?cap_first}ChangeRequestHelper{
	private ChangeRequestHelper() {}
	
	public static ChangeRequestHelper of(${projectName?cap_first}UserContextImpl ctx) throws Exception {
		ChangeRequestHelper instance = (ChangeRequestHelper) ctx.getFromContextLocalStorage(key(ctx));
		if (instance != null) {
			return instance;
		}
		synchronized (ChangeRequestHelper.class) {
			instance = (ChangeRequestHelper) ctx.getFromContextLocalStorage(key(ctx));
			if (instance != null) {
				return instance;
			}
			
			instance = new ChangeRequestHelper();
			instance.setUserContext(ctx);
			instance.loadCrSpec();
			// System.out.println(DebugUtil.dumpAsJson(instance.getSpec(), true));
			return instance;
		}
	}
	
	
	
	
	
}
