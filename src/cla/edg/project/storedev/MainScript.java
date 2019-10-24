package cla.edg.project.storedev;

import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.PageFlowScript;


public class MainScript extends BasePageFlowDescriptionScript {
	private static final PageFlowScript SCRIPT = $("wxappservice").need_login().has_footprint()
			.base_on()
				.base_package_name("com.doublechain.storedev")
				.project_name("storedev")
				.parent_class_name("BasicWxappService")
				.parent_class_package("com.doublechain.storedev.wxappservice")
			.import_from(new S0_Homepage())
			.import_from(new S1_Query())

			;
	

	@Override
	public PageFlowScript getScript() {
		return SCRIPT;
	}
}
