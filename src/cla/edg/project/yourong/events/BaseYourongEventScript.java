package cla.edg.project.yourong.events;

import cla.edg.eventscript.EventScript;

public abstract class BaseYourongEventScript {

	protected static EventScript $(String name) {
		EventScript result = new EventScript();
		result.setBussinessName(name);
		return result.base_on()
				.output_base_folder("/works/jobs/yourong_v2/workspace/yourong-biz-suite/bizcore/WEB-INF/yourong_custom_src")
				.template_base_folder("./template")
				.base_package_name("com.yrdec.yourong")
				.project_name("yourong")
		;
	}

	public abstract EventScript getScript();
}
