注: 因为目前XML文件的动态修改功能尚未支持,所以将和ChangeRequest相关的其他(需手工完成的)任务列于此文件中.

TODO-1:
请确保模型文件 ${projectName?lower_case}.xml 中包含以下定义:
>>> TODO-1 开始 <<<
<#list allEventSpec?keys as eventName>
<event_${helper.toModelStyleName(allEventSpec[eventName].type)}
	<#list allEventSpec[eventName].fieldSpecs as fieldSpec>
	${helper.toModelStyleName(fieldSpec.name)}="${helper.getExampleDataOfField(fieldSpec)}"
	</#list>
	event_location="cr_type/step_name/event_name/event_index|[5,100]"
	event_initiator="$(${userModelName})"
	change_request="$(${crModelName})"
	_features="event"
	_bind_with_cr_type="${helper.getAllCRTypeUsedEvent(allEventSpec[eventName].eventType, projectSpec)?join("|")}"
	/>
	
</#list>
>>> TODO-1 结束 <<<
