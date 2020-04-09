package cla.edg.project.yrzx;

import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.PageFlowScript;

public class MainPageFlow extends BasePageFlowDescriptionScript {

	// 基础信息
	private static final PageFlowScript SCRIPT = $("wxapp v3").need_login()
			.base_on()
				.base_package_name("com.yrdec.yrzx")
				.project_name("yrzx")
				.parent_class_package("com.yrdec.yrzx.wxapp")
				.parent_class_name("CustomWxappService")
			;
		
//			

	@Override
	public PageFlowScript getScript() {
		return SCRIPT.import_from(new HighLevelMePageFlowPiece())
				.import_from(new ProjectHallPageFlowPiece())
				;
	}

}