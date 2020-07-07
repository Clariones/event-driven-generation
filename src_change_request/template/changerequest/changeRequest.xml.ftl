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
<#--
	field_group="cr_type/step_name/event_name/event_index|[5,100]"
	event_initiator_type="SecUser|Merchant|[1,64]"
	event_initiator_id="SU000001|M0000001|[1,64]"
-->
	change_request="$(${crModelName})"
	<#if allEventSpec[eventName].multiple >
	_features="n*event"
	<#else>
	_features="event"
	</#if>
	_bind_with_cr_type="${helper.getAllCRTypeUsedEvent(allEventSpec[eventName].eventType, projectSpec)?join("|")}"
	/>
	
</#list>

  <!--
   按照 ChangeRequest 来保存数据, 此表内部使用.
   events_info内部是个map,等价于
    event_type="EventInvitor|EventAnother|[1,64]"
    event_id="EI000001|EA0000001|[1,64]"
    field_group="cr_type/step_name/event_name/event_index|[1,100]"

   status 有3个:
    OPENING: 还在填写中. 包括 撤销 也算在这个状态.
    COMMITTED: 已经提交,并且以后要重新填写;
    PRESET: 已经提交,并且以后用这里的值做预填充值.
  -->
  <event_info_in_cr
    change_request="$(change_request)"
    change_request_type="$(change_request_type)"
    status="OPENING|COMMITTED|PRESET"
    initiator_type="SecUser|Merchant|[1,64]"
    initiator_id="SU000001|M0000001|[1,64]"
    events_info="text()"
    last_update_time="updateTime()"
    _max_count="1000000000"
    />
</root>
