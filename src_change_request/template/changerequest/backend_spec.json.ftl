{	
	"name":"${projectSpec.name}",
	"title":"${projectSpec.name}",
	"crSpecs":{ 
<#list projectSpec.changeRequestList as crSpec>
		"${helper.JAVA_CONST(crSpec.changeRequestType)}" :{
			"name":"${crSpec.changeRequestType}",
			"title":"${crSpec.title}",
			"brief":null,
			"changeRequestType":"${helper.JAVA_CONST(crSpec.changeRequestType)}",
			"requestPrefix": "${crSpec.requestPrefix}",
			"sceneList":[
	<#list crSpec.stepList as scene>
				{
					"name":"${helper.javaVar(scene.name)}",
					"title":"${scene.title}",
					"index":${scene.index},
					"canSkip":${scene.canSkip?c},
					"groups":[
		<#list scene.eventList as group>
						{
							"name":"${crSpec.shortName?lower_case}${helper.NameAsThis(scene.name)}_${helper.javaVar(group.name)}",
							"title":"${group.title}",
							"modelName":"${group.eventType}",
							"multiple": ${group.multiple?c},
							"showPrevious": ${group.showPrevious?c},
			<#if group.minimalNumber??>
							"minimalNumber": ${group.minimalNumber?c},
			</#if>
			<#if group.maximumNumber??>
							"maximumNumber": ${group.maximumNumber?c},
			</#if>
              				"mustHave": ${group.mustHave?c}
						}<#if !group?is_last>,</#if>
		</#list>
					]
				}<#if !scene?is_last>,</#if>
	</#list>
			],
			"fieldList":[
	<#list crSpec.stepList as scene>
		<#list scene.eventList as group>
			<#list group.fieldList as field>
				${helper.makeBackendFieldSpec(field, crSpec.shortName?lower_case+helper.NameAsThis(scene.name)+"_"+helper.javaVar(group.name))}<#if !(scene?is_last && group?is_last && field?is_last)>,</#if>
			</#list>
		</#list>
	</#list>
			]
		}<#if !crSpec?is_last>,</#if>
</#list>
	}
}
