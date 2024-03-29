<root>
  	
  <change_request_type>
<#list projectSpec.changeRequestList as crSpec>
    <${'#'}value name="${crSpec.title}" code="${helper.NAME_AS_THIS(crSpec.changeRequestType!"what?")}" icon="${crSpec.icon}"/>
</#list>
  </change_request_type>
  <change_request
	    name="名称:注册|开始考试|答题|[1,50]"
	    create_time="创建时间:createTime()"
	    remote_ip="remoteIp()"
	    city_by_ip="访问地址:四川省成都市|新疆维吾尔自治区阿卡大礼县?"
	    request_type="类型:$(change_request_type)"
	    commited="已提交:false"
	    platform="$(platform)"
	    _features="change_request"
  	/>
<#list assist.allEventNames as eventName>
<event_${helper.toModelStyleName(allEventSpec[eventName].eventType)} _name="${allEventSpec[eventName].title}事件"
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
