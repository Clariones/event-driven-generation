<root>
  	
  <change_request_type
	name="名称:value()|[1,100]"
	code="代码:value()|[1,100]"
    icon="图标:value()|[1,100]"
    display_order="显示顺序:1|2|3|4|5|6"
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
	    name="名称:注册|开始考试|答题|[1,50]"
	    create_time="创建时间:createTime()"
	    remote_ip="remoteIp()"
	    request_type="类型:$(change_request_type)"
	    commited="已提交:false"
	    platform="$(platform)"
	    _features="change_request"
  	/>
<#list assist.allEventNames as eventName>
<event_${helper.toModelStyleName(allEventSpec[eventName].eventType)}
	<#list allEventSpec[eventName].fieldList as fieldSpec>
		<#if fieldSpec.interactionMode != 'display'>
	${helper.toModelStyleName(fieldSpec.name)}="<#if fieldSpec.title?has_content>${fieldSpec.title}:</#if>${helper.getExampleDataOfField(fieldSpec)}"
		</#if>
	</#list>
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
    change_request="CR-ID:$(change_request)"
    change_request_type="CR类型:$(change_request_type)"
    status="OPENING|COMMITTED|PRESET"
    initiator_type="发起者类型:SecUser|Merchant|[1,64]"
    initiator_id="发起者ID:SU000001|M0000001|[1,64]"
    events_info="事件详情:text()"
    last_update_time="updateTime()"
    _max_count="1000000000"
    />
</root>
