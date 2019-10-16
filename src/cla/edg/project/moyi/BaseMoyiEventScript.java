package cla.edg.project.moyi;

import cla.edg.eventscript.EventScript;
import cla.edg.project.yourong.events.BaseYourongEventScript;

public abstract class BaseMoyiEventScript {
	protected static EventScript $(String name) {
		EventScript result = new EventScript();
		result.setBussinessName(name);
		result.base_on()
			.output_base_folder("/works/jobs/moyi_v2/workspace/moyi-biz-suite/bizcore/WEB-INF/moyi_v2_src")
			.template_base_folder("./template")
			.base_package_name("com.terapico.moyi")
			.project_name("moyi");
		return result;
	}
	public abstract EventScript getScript();
}
