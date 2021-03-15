package com.${orgName?lower_case}.${projectName?lower_case};

import com.terapico.changerequest.BaseCrConst;

public interface ${helper.NameAsThis(scopeName)}CR extends BaseCrConst {

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
			    String NAME = "${crSpec.shortName?lower_case}${helper.NameAsThis(scene.name)}_${helper.javaVar(group.name)}";
			<#list group.fieldList as field>
                String FIELD_${helper.NAME_AS_THIS(field.name)} = "${helper.javaVar(field.name)}";
			</#list>
			}
		</#list>
		}
	</#list>
	<#list crSpec.stepList as scene>
        <#list scene.eventList as group>
            <#list group.fieldList as field>
        String FIELD_${helper.NAME_AS_THIS(field.name)}_IN_${helper.JAVA_CONST(group.name)}_OF_${helper.JAVA_CONST(scene.name)} = "${crSpec.shortName?lower_case}${helper.NameAsThis(scene.name)}_${helper.javaVar(group.name)}_${helper.javaVar(field.name)}";
            </#list>
        </#list>
    </#list>
	}
	
</#list>
}
