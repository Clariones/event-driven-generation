<root>
  	
  <change_request_type
	name="value()|[1,100]"
	code="value()|[1,100]"
    icon="value()|[1,100]"
    display_order="1|2|3|4|5|6"
    bind_types="text()"
    step_configuration="text()"
    platform="$(platform)"
    _features="cr_type"
    _identified_by="code"
  >
<#list projectSpec.changeRequestList as crSpec>
    <${'#'}value name="${crSpec.title}" code="${helper.NAME_AS_THIS(crSpec.changeRequestType!"what?")}" icon="${crSpec.icon}"/>
</#list>
  </change_request_type>
  <change_request
	    name="注册|开始考试|答题|[1,50]"
	    create_time="createTime()"
	    remote_ip="remoteIp()"
	    request_type="$(change_request_type)"
	    commited="false"
	    platform="$(platform)"
	    _features="change_request"
  	/>
<#list allEventSpec?keys as eventName>
<event_${helper.toModelStyleName(allEventSpec[eventName].eventType)}
	<#list allEventSpec[eventName].fieldList as fieldSpec>
		<#if fieldSpec.interactionMode != 'display'>
	${helper.toModelStyleName(fieldSpec.name)}="${helper.getExampleDataOfField(fieldSpec)}"
		</#if>
	</#list>
	field_group="cr_type/step_name/event_name/event_index|[5,100]"
	event_initiator_type="SecUser|Merchant|[1,64]"
	event_initiator_id="SU000001|M0000001|[1,64]"
	change_request="$(${crModelName})"
	_features="event"
	_bind_with_cr_type="${helper.getAllCRTypeUsedEvent(allEventSpec[eventName].eventType, projectSpec)?join("|")}"
	/>
	
</#list>
</root>
