package com.${orgName?lower_case}.${projectName?lower_case};

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.${orgName?lower_case}.${projectName?lower_case}.changerequest.ChangeRequest;
import com.${orgName?lower_case}.${projectName?lower_case}.changerequest.ChangeRequestTokens;
import com.terapico.caf.appview.CRFieldData;
import com.terapico.caf.appview.CRGroupData;
import com.terapico.caf.appview.CRSceneData;
import com.terapico.caf.appview.ChangeRequestData;
import com.terapico.caf.appview.ChangeRequestPostData;
import com.terapico.caf.appview.ChangeRequestProcessResult;
import com.terapico.changerequest.BaseChangeRequestHelper;
import com.terapico.changerequest.CRFieldSpec;
import com.terapico.changerequest.CRGroupSpec;
import com.terapico.changerequest.CRSpec;

import com.terapico.utils.DataTypeUtil;
import com.terapico.uccaf.CafEntity;
import com.terapico.caf.Images;
import com.terapico.caf.DateTime;

<#list allEventSpec?keys as eventName>
	<#assign event=allEventSpec[eventName]/>
import com.${orgName?lower_case}.${projectName?lower_case}.event${helper.CamelName(event.eventType)?lower_case}.Event${helper.CamelName(event.eventType)};
<#--
import com.${orgName?lower_case}.${projectName?lower_case}.event${helper.CamelName(event.eventType)?lower_case}.Event${helper.CamelName(event.eventType)}Table;
-->
</#list>

public class ${projectName?cap_first}ChangeRequestHelper extends BaseChangeRequestHelper{
	protected ${projectName?cap_first}UserContextImpl userContext;
	
	protected static String key(${projectName?cap_first}UserContextImpl ctx) {
		return "_key_for_thread_scope_ChangeRequestHelper";
	}

	public ${projectName?cap_first}UserContextImpl getUserContext() {
		return userContext;
	}
	public void setUserContext(${projectName?cap_first}UserContextImpl userContext) {
		this.userContext = userContext;
	}
	protected void loadCrSpec() throws Exception {
		loadCrSpecFromJar("/META_INF/${projectName?lower_case}_cr_spec.json");
	}

	protected Object toEventTableName(CRGroupSpec groupSpec) {
		return "event_" + (groupSpec.getModelName().trim().replace(' ', '_').toLowerCase())+"_data";
	}
	
	public ChangeRequestProcessResult processChangeRequest(ChangeRequestPostData postedData, BaseEntity currentUserInfo) throws Exception {
		ChangeRequestProcessResult processResult = new ChangeRequestProcessResult();
		processResult.setPostedData(postedData);
		
		savePostedData(postedData, currentUserInfo);
		String nextScene = calcSceneCode(postedData.getChangeRequestType(), postedData.getSceneCode(),
				postedData.getActionCode(), postedData.getActionIndex());
		if (nextScene.equals(CR.NEXT_COMMIT)) {
			processResult.setResultCode(ChangeRequestProcessResult.CODE_COMMITTED);
			processResult.setChangeRequest(loadWholeChangeRequest(postedData.getChangeRequestId()));
		}else {
			processResult.setResultCode(ChangeRequestProcessResult.CODE_NOT_COMMITTED);
			processResult.setNewChangeRequestType(postedData.getChangeRequestType());
			processResult.setNewSceneCode(nextScene);
		}
		
		return processResult;
	}
	
	public ChangeRequestData assemblerChangeRequstFirstStepResponse(BaseEntity currentUserInfo, String crType) throws Exception {
			CRSpec crSpec = CR(crType);
			return assemblerChangeRequstResponse(currentUserInfo, crType, crSpec.getSceneList().get(0).getName());
	}

	// 根据定位信息,组装一个 cr 的response
	public ChangeRequestData assemblerChangeRequstResponse(BaseEntity currentUserInfo, String crType, String sceneCode)
			throws Exception {
		// 先拿到CR spec
		CRSpec crSpec = CR(crType);
		// 再根据scene code, 找到有哪几个group的spec被需要
		List<CRGroupSpec> groupSpecList = GROUPS(crSpec, sceneCode);
		// 再用这些Group spec, 找到系统中相关的已经存在的cr和event数据
		ChangeRequest cr = loadCrDataByGroups(crType, currentUserInfo, groupSpecList);
		// 然后根据需要,补足fields,填充field的默认值
		ChangeRequestData crData = fulfillChangeRequestFields(cr, crSpec, sceneCode, groupSpecList);
		// 最后要交给业务模块,让业务模块有机会修正准备好的数据: 目前用返回值给业务模块来实现,没做回调
		// adjustChangeRequestResponse(cr, crSpec, sceneCode, groupSpecList);
		return crData;
	}
	// 根据 group spec list, 把这个cr装满
	protected ChangeRequestData fulfillChangeRequestFields(ChangeRequest InputCR, CRSpec crSpec, String sceneCode,
			List<CRGroupSpec> groupSpecList) throws Exception {
		final ChangeRequest cr = ensureChangeRequest(InputCR, crSpec);
		// 先建立一个CR
		ChangeRequestData reuestData = new ChangeRequestData();
		reuestData.setId(cr.getId());
		reuestData.setSceneCode(sceneCode);
		reuestData.setTitle(crSpec.getTitle());
		reuestData.setBrief(crSpec.getBrief());
		reuestData.setType(crSpec.getChangeRequestType());
		reuestData.setGroupList(new ArrayList<>(groupSpecList.size()+1));
		// 然后填 hidden 的基础信息 
		{
			CRGroupData hiddenGroup = new CRGroupData();
			hiddenGroup.setName(CR.GROUP_HIDDEN);
			hiddenGroup.setTitle("隐藏字段");
			hiddenGroup.setHidden(true);
			reuestData.getGroupList().add(hiddenGroup);
			addHiddenField(reuestData, CR.FIELD_CR_ID, cr.getId());
			addHiddenField(reuestData, CR.FIELD_SCENE_CODE, sceneCode);
		}
		// 接着填 scene 列表
		{
			reuestData.setSceneList(crSpec.getSceneList().stream().map(it->{
				CRSceneData sceneData = new CRSceneData();
				sceneData.setCode(it.getName());
				sceneData.setTitle(it.getTitle());
				return sceneData;
			}).collect(Collectors.toList()));
		}
		// 然后填所有的字段
		for(CRGroupSpec groupSpec: groupSpecList) {
			CRGroupData groupData = new CRGroupData();
			groupData.setName(groupSpec.getName());
			groupData.setTitle(groupSpec.getTitle());
			groupData.setHidden(false);
			reuestData.getGroupList().add(groupData);
			
			fulfillChangeRequestField(reuestData, cr, groupData, groupSpec, crSpec.getFieldList());
		}
		// 最后是CR级别的actions
		fulfillChangeRequestActions(reuestData, crSpec, sceneCode);
		return reuestData;
	}
	
	protected ChangeRequest loadCrDataByGroups(String crType, BaseEntity currentUserInfo, List<CRGroupSpec> groupSpecList) throws Exception {
		List<Object> params = new ArrayList<>();
		StringBuilder sb = new StringBuilder(
				"select * from change_request_data CR where CR.request_type=? and commited is false and (");
		params.add(crType);
		final int paramsLen = params.size();
		groupSpecList.forEach(group -> {
			if (params.size() > paramsLen) {
				// 不是循环第一次
				sb.append(" or ");
			}
			sb.append(" exists (select * from ").append(toEventTableName(group))
					.append(" E where E.change_request = CR.id and event_initiator_type=? and event_initiator_id=? and E.field_group=?) \n");
			params.add(currentUserInfo.getInternalType());
			params.add(currentUserInfo.getId());
			params.add(group.getName());
		});
		sb.append(" ) order by id desc limit ?");
		params.add(1);
		SmartList<ChangeRequest> qList = userContext.getDAOGroup().getChangeRequestDAO().queryList(sb.toString(),
				params.toArray());
		if (qList==null||qList.isEmpty()) {
			return null;
		}
		
		ChangeRequest cr = qList.first();
		enhanceChangeRequest(cr, groupSpecList);
		return cr;
	}

	protected void addHiddenField(ChangeRequestData reuestData, String fieldShortName, String value) {
		CRGroupData group = HIDDEN_GROUP(reuestData);
		CRFieldData fieldData = new CRFieldData();
		fieldData.setName(CR.GROUP_HIDDEN+"_"+fieldShortName);
		fieldData.setValue(value);
		group.addField(fieldData);
	}

	protected CRGroupData HIDDEN_GROUP(ChangeRequestData reuestData) {
		if (reuestData == null || reuestData.getGroupList() == null) {
			BUG("你不应该把未准备好的数据交给用户来添加隐藏字段");
		}
		if (reuestData.getGroupList().size() < 1
				|| !reuestData.getGroupList().get(0).getName().equals(CR.GROUP_HIDDEN)) {
			BUG("你应该先准备hidden group, 再交给用户来添加隐藏字段");
		}
		return reuestData.getGroupList().get(0);
	}

	protected ChangeRequest ensureChangeRequest(ChangeRequest cr, CRSpec crSpec) throws Exception {
		if (cr != null) {
			return cr;
		}
		ChangeRequest newCr = getUserContext().getManagerGroup().getChangeRequestManager()
				.createChangeRequest(userContext, crSpec.getTitle(), crSpec.getChangeRequestType(), false, "P000001");
		// 这个会导致 changeRequestManager 的 onNewInstanceCreated, 注意这个扩展点
		return newCr;
	}
	
	protected void enhanceChangeRequest(ChangeRequest cr, List<CRGroupSpec> groupSpecList) throws Exception{
		if (groupSpecList == null || groupSpecList.isEmpty()) {
			return;
		}
		switch(cr.getRequestType().getId()) {
<#list projectSpec.changeRequestList as crSpec>
		case CR.${helper.JAVA_CONST(crSpec.changeRequestType)}.NAME:
			enhance${helper.CamelName(crSpec.changeRequestType)}ChangeRequest(cr, groupSpecList);
			break;
</#list>
		default:
			BUG("不能增强"+cr.getRequestType().getId()+"类型的CR");
		}
	}

<#list projectSpec.changeRequestList as crSpec>
	protected void enhance${helper.CamelName(crSpec.changeRequestType)}ChangeRequest(ChangeRequest cr, List<CRGroupSpec> groupSpecList) throws Exception{
		groupSpecList.forEach(group->{
			Object[] params = new Object[] {cr.getId(), group.getName(), 1000};
			String sql = "select * from " + toEventTableName(group) + " E where E.change_request=? " + 
					" and E.field_group=? order by id asc limit ?";
			switch (group.getName()) {
		<#list crSpec.stepList as scene>
			<#list scene.eventList as group>
			case CR.${helper.JAVA_CONST(crSpec.changeRequestType)}.SCENE_${helper.JAVA_CONST(scene.name)}.GROUP_${helper.JAVA_CONST(group.name)}: {
				SmartList<Event${helper.CamelName(group.eventType)}> eventList = getUserContext().getDAOGroup().getEvent${helper.CamelName(group.eventType)}DAO().queryList(sql, params);
				cr.addEvent${helper.CamelName(group.eventType)}List(eventList);
				}
				break;
			</#list>
		</#list>
			default:
				BUG("不支持加载"+group.getName()+"类型的数据");
			}
		});
	}
	
</#list>
	protected void fulfillChangeRequestField(ChangeRequestData reuestData, ChangeRequest dbCrData, CRGroupData groupData, CRGroupSpec groupSpec,
			List<CRFieldSpec> fieldSpecList) throws Exception {
		switch (groupSpec.getName()) {
<#list projectSpec.changeRequestList as crSpec>
	<#list crSpec.stepList as scene>
		<#list scene.eventList as group>
		case CR.${helper.JAVA_CONST(crSpec.changeRequestType)}.SCENE_${helper.JAVA_CONST(scene.name)}.GROUP_${helper.JAVA_CONST(group.name)}: 
			fulfillChangeRequestFieldByGroup(reuestData, dbCrData, groupData, fieldSpecList, dbCrData.getEvent${helper.CamelName(group.eventType)}List());
			return;
		</#list>
	</#list>
</#list>
		default:
			error("不支持自动填充 "+groupSpec.getName()+":"+groupSpec.getTitle()+" 的数据");
		}
	}
	
	protected void fulfillChangeRequestFieldByGroup(ChangeRequestData reuestData, ChangeRequest dbCrData,
			CRGroupData groupData, List<CRFieldSpec> fieldSpecList, SmartList<? extends BaseEntity> eventList) {
		if (eventList == null || eventList.isEmpty()) {
			fullFillNewFields(groupData, fieldSpecList);
			return;
		}
		boolean foundAny = false;
		for(int i=0;i<eventList.size();i++) {
			BaseEntity evtData = eventList.get(i);
			List<KeyValuePair> kvList = evtData.keyValuePairOf();
			KeyValuePair fieldGroup = kvList.stream().filter(entry->entry.getKey().equals("fieldGroup")).findAny().orElse(null);
			if (fieldGroup == null || !fieldGroup.getValue().equals(groupData.getName())) {
				continue;
			}
			foundAny = true;
			for(CRFieldSpec fieldSpec: fieldSpecList) {
				if (!GROUP_NAME(fieldSpec).equals(groupData.getName())){
					continue;
				}
				
				CRFieldData fieldData = new CRFieldData();
				fieldData.setName(fieldSpec.getName()+"_"+evtData.getId());
				if (fieldSpec.getInteractionMode().equals("display")) {
					fieldData.setValue(TO_VALUE(fieldSpec.getValue()));
				}else {
					String memberName = FIELD_NAME(fieldSpec);
					KeyValuePair kv = kvList.stream().filter(entry->entry.getKey().equals(memberName)).findAny().orElse(null);
					if (kv == null || kv.getValue() == null) {
						fieldData.setValue(TO_VALUE(fieldSpec.getDefaultValue()));
					}else {
						fieldData.setValue(TO_VALUE(kv.getValue()));
					}
				}
				setFieldSpecInfo(fieldData, fieldSpec);
				groupData.addField(fieldData);
			}
		}
		if (!foundAny) {
			fullFillNewFields(groupData, fieldSpecList);
		}
	}

	protected void fullFillNewFields(CRGroupData groupData, List<CRFieldSpec> fieldSpecList) {
		for(CRFieldSpec fieldSpec: fieldSpecList) {
			if (!GROUP_NAME(fieldSpec).equals(groupData.getName())){
				continue;
			}
		
			CRFieldData fieldData = new CRFieldData();
			fieldData.setName(fieldSpec.getName()+"_new");
			if (fieldSpec.getValue() != null) {
				fieldData.setValue(TO_VALUE(fieldSpec.getValue()));
			}else {
				fieldData.setValue(TO_VALUE(fieldSpec.getDefaultValue()));
			}
			setFieldSpecInfo(fieldData, fieldSpec);
			groupData.addField(fieldData);
		}
	}
	
	protected void doFieldChecking(ChangeRequestPostData postedData, CRFieldSpec fieldSpec, String fieldName, Object value) {
		switch (fieldSpec.getName()) {
<#list projectSpec.changeRequestList as crSpec>
	<#list crSpec.stepList as scene>
		<#list scene.eventList as group>
			<#list group.fieldList as field>
				<#if field.interactionMode != 'display'>
		case "${helper.javaVar(scene.name)+"_"+helper.javaVar(group.name)+"_"+helper.javaVar(field.name)}": 
			doField${helper.CamelName(scene.name)+helper.CamelName(group.name)+helper.CamelName(field.name)}Checking(postedData, fieldSpec, fieldName, value);
			return;
				</#if>
			</#list>
		</#list>
	</#list>
</#list>
		default:
			BUG("不应该出现"+fieldSpec.getName());
			break;
		}
	}
	
<#list projectSpec.changeRequestList as crSpec>
	<#list crSpec.stepList as scene>
		<#list scene.eventList as group>
			<#list group.fieldList as field>
				<#if field.interactionMode != 'display'>
	protected void doField${helper.CamelName(scene.name)+helper.CamelName(group.name)+helper.CamelName(field.name)}Checking(ChangeRequestPostData postedData, CRFieldSpec fieldSpec, String fieldName, Object value) {
		if (!isFieldMissing(postedData, fieldSpec, fieldName, value)) {
			do${helper.CamelName(field.inputType)}FieldChecking(postedData, fieldSpec, fieldName, value);
		}
	}
	
				</#if>
			</#list>
		</#list>
	</#list>
</#list>

	protected ${projectName?cap_first}Exception wrapTo${projectName?cap_first}Exception(ChangeRequestPostData postedData, String msg) {
		${projectName?cap_first}Exception exception = new ${projectName?cap_first}Exception(msg);
		for(Map<String, Object> vmsg : postedData.getVerifyMessage()) {
			Message fmsg = new Message();
			fmsg.setBody((String) vmsg.get("message"));
			fmsg.setLevel("warning");
			fmsg.setSourcePosition((String) vmsg.get("fieldName"));
			exception.addErrorMessage(fmsg);
		}
		return exception;
	}
	
	protected void savePostedData(ChangeRequestPostData postedData, BaseEntity currentUserInfo) throws Exception {
		switch (postedData.getActionCode()) {
		case CR.ACTION_COMMIT:
		case CR.ACTION_NEXT_STEP:
		case CR.ACTION_NEXT_RECORD:
			break;
		case CR.ACTION_PREV_STEP:
		case CR.ACTION_DELETE_RECORD:
		case CR.ACTION_PREV_RECORD:
		default:
			// 这些情况不需要保存提交的数据
			return;
		}
		
		CRSpec crSpec = CR(postedData.getChangeRequestType());
		if (postedData.getVerifyMessage() != null && postedData.getVerifyMessage().size()>0) {
			String msg = SCENE(crSpec, postedData.getSceneCode()).getTitle()+"输入参数错误";
			${projectName?cap_first}Exception exception = wrapTo${projectName?cap_first}Exception(postedData, msg);
			throw exception;
		}
		// TODO: 保存已经提交的数据
		
		List<CRGroupSpec> groupSpecList = GROUPS(crSpec, postedData.getSceneCode());
		Iterator<Entry<String, List<Map<String, Object>>>> git = postedData.getFieldData().entrySet().iterator();
		while(git.hasNext()) {
			Entry<String, List<Map<String, Object>>> gEntity = git.next();
			String groupName = gEntity.getKey();
			List<Map<String, Object>> fieldValues = gEntity.getValue();
			CRGroupSpec groupSpec = groupSpecList.stream().filter(g->g.getName().equals(groupName)).findFirst().orElse(null);
			if (groupSpec == null) {
				error("无法处理提交的 "+groupName+" 的数据");
			}
			String crId = postedData.getChangeRequestId();
			switch (groupSpec.getName()) {
<#list projectSpec.changeRequestList as crSpec>
	<#list crSpec.stepList as scene>
		<#list scene.eventList as group>
			case CR.${helper.JAVA_CONST(crSpec.changeRequestType)}.SCENE_${helper.JAVA_CONST(scene.name)}.GROUP_${helper.JAVA_CONST(group.name)}:
				save${helper.CamelName(crSpec.changeRequestType)}${helper.CamelName(scene.name)}${helper.CamelName(group.name)}(crId, fieldValues,currentUserInfo);
				break;
		</#list>
	</#list>
</#list>
			default:
				BUG(groupName+"还没增加save功能");
			}
		}
	}

<#list projectSpec.changeRequestList as crSpec>
	<#list crSpec.stepList as scene>
		<#list scene.eventList as group>
	protected void save${helper.CamelName(crSpec.changeRequestType)}${helper.CamelName(scene.name)}${helper.CamelName(group.name)}(String crId, List<Map<String, Object>> fieldValues, BaseEntity currentUserInfo) throws Exception {
		if (fieldValues == null || fieldValues.isEmpty()) {
			return;
		}
		for(Map<String, Object> fieldValue: fieldValues) {
			String id = (String) fieldValue.get("id");
			if (id == null) {
			<#list group.fieldList as field>
				<#if field.interactionMode == "display">
					<#continue>
				</#if>
				${helper.getJavaType(field.inputType)} ${helper.javaVar(field.name)} = get${helper.CamelName(field.inputType)}Value(fieldValue.get("${helper.javaVar(field.name)}"));
			</#list>
				String fieldGroup = "${helper.javaVar(scene.name)}_${helper.javaVar(group.name)}";
				String eventInitiatorType = currentUserInfo.getInternalType();
				String eventInitiatorId = currentUserInfo.getId();
				String changeRequestId = crId;
				getUserContext().getManagerGroup().getEvent${helper.CamelName(group.eventType)}Manager()
					.createEvent${helper.CamelName(group.eventType)}(getUserContext(),<@compress single_line=true>
			<#list group.fieldList as field>
				<#if field.interactionMode == "display">
					<#continue>
				</#if>
				${helper.javaVar(field.name)},
			</#list>
			</@compress>${''}
						fieldGroup, eventInitiatorType, eventInitiatorId, changeRequestId);
			}else{
				Event${helper.CamelName(group.eventType)} event = getUserContext().getDAOGroup().getEvent${helper.CamelName(group.eventType)}DAO().load(id, EO);
			<#list group.fieldList as field>
				<#if field.interactionMode == "display">
					<#continue>
				</#if>
				event.update${helper.CamelName(field.name)}(get${helper.CamelName(field.inputType)}Value(fieldValue.get("${helper.javaVar(field.name)}")));
			</#list>
				getUserContext().getManagerGroup().getEvent${helper.CamelName(group.eventType)}Manager().internalSaveEvent${helper.CamelName(group.eventType)}(getUserContext(), event, EO);
			}
		}
	}
		</#list>
	</#list>
</#list>

	protected CafEntity loadWholeChangeRequest(String changeRequestId) throws Exception {
		return this.getUserContext().getDAOGroup().getChangeRequestDAO().load(changeRequestId, ChangeRequestTokens.all());
	}
}
