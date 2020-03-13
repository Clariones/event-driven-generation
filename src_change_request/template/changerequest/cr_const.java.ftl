package com.${orgName?lower_case}.${projectName?lower_case};

public interface CR {
	String GROUP_HIDDEN = "hidden_group";
	String FIELD_CR_ID = "crId";
	String FIELD_SCENE_CODE = "sceneCode";
	
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
			String GROUP_${helper.JAVA_CONST(group.name)} = "${helper.javaVar(scene.name)}_${helper.javaVar(group.name)}";
		</#list>
		}
	</#list>
	}
	
</#list>
}