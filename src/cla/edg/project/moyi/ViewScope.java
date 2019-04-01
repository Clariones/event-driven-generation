package cla.edg.project.moyi;

import cla.edg.viewscope.BaseViewScopeScript;
import cla.edg.viewscope.ViewScopeScript;

public class ViewScope extends BaseViewScopeScript{
	protected static ViewScopeScript SCRIPT = $("")
		.when_view("artwork_auction")
			.detail()
				.saw_all_simple_member()
				.saw("shop").summary()
				.saw("artwork_certification").summary()
			
			;
}
