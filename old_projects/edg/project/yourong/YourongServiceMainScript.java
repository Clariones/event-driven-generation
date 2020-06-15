package cla.edg.project.yourong;

import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.project.yourong.pageflow.S0_Query;
import cla.edg.project.yourong.pageflow.S1_LoginAndMe;
import cla.edg.project.yourong.pageflow.S2_HomePage;
import cla.edg.project.yourong.pageflow.S3_ProjectForPropertyOwner;
import cla.edg.project.yourong.pageflow.S4_OrderForPropertyOwner;
import cla.edg.project.yourong.pageflow.S5_Article;
import cla.edg.project.yourong.pageflow.S99_Common;

public class YourongServiceMainScript extends BasePageFlowDescriptionScript {
	private static final PageFlowScript SCRIPT = $("unify client service").need_login().has_footprint()
			.base_on()
				.base_package_name("com.yrdec.yourong")
				.project_name("yourong")
				.parent_class_name("BaseUnifyClientServiceImpl")
				.parent_class_package("com.yrdec.yourong.unifyclientservice")
			.import_from(new S0_Query())
//			.import_from(new S0_GraphQuery())
			.import_from(new S1_LoginAndMe())
			.import_from(new S2_HomePage())
			.import_from(new S3_ProjectForPropertyOwner())
			.import_from(new S4_OrderForPropertyOwner())
			.import_from(new S5_Article())
			.import_from(new S99_Common())
			;
	

	@Override
	public PageFlowScript getScript() {
		return SCRIPT;
	}
}
