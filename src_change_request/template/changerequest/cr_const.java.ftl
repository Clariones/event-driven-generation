package com.${orgName?lower_case}.${projectName?lower_case};

public interface CR {
<#list projectSpec.changeRequestList as crSpec>
	interface ${helper.JAVA_CONST(crSpec.changeRequestType)} {
		String NAME = "${helper.JAVA_CONST(crSpec.changeRequestType)}";
		String TITLE = "${crSpec.title}";
	<#list crSpec.stepList as scene>
		interface SCENE_${helper.JAVA_CONST(scene.name)} {
			String NAME = "${helper.javaVar(scene.name)}";
			String TITLE = "${scene.title}";
			boolean CAN_SKIP = ${scene.canSkip?c};
		<#list scene.eventList as group>
			interface GROUP_${helper.JAVA_CONST(group.name)} {
				String NAME = "${helper.javaVar(scene.name)}_${helper.javaVar(group.name)}";
				String TITLE = "${group.title}";
				boolean MULTIPLE = ${group.multiple?c};
			}
		</#list>
		}
	</#list>
	}
	
</#list>
}