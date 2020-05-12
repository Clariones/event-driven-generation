package com.${orgName?lower_case}.${projectName?lower_case};

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.terapico.utils.DataTypeUtil;
import com.${orgName?lower_case}.${projectName?lower_case}.changerequest.ChangeRequest;
import com.${orgName?lower_case}.${projectName?lower_case}.changerequest.ChangeRequestTokens;
import com.terapico.caf.appview.CRFieldData;
import com.terapico.caf.appview.CRGroupData;
import com.terapico.caf.appview.CRSceneData;
import com.terapico.caf.viewcomponent.GenericFormPage;
import com.terapico.caf.appview.ChangeRequestPostData;
import com.terapico.caf.appview.ChangeRequestProcessResult;
import com.terapico.changerequest.BaseChangeRequestHelper;
import com.terapico.changerequest.CRFieldSpec;
import com.terapico.changerequest.CRGroupSpec;
import com.terapico.changerequest.CRSpec;

import com.terapico.utils.TextUtil;
import com.terapico.uccaf.CafEntity;
import com.terapico.caf.baseelement.CandidateQuery;
import com.terapico.caf.Images;
import com.terapico.caf.DateTime;

<#assign modelNames=[]/>
<#list allEventSpec?keys as eventName>
	<#assign event=allEventSpec[eventName]/>
import com.${orgName?lower_case}.${projectName?lower_case}.event${helper.CamelName(event.eventType)?lower_case}.Event${helper.CamelName(event.eventType)};
<#--
import com.${orgName?lower_case}.${projectName?lower_case}.event${helper.CamelName(event.eventType)?lower_case}.Event${helper.CamelName(event.eventType)}Table;
-->
	<#list event.fieldList as field>
		<#if field.modelName??>
			<#if !modelNames?seq_contains(field.modelName)>
				<#assign modelNames = modelNames + [field.modelName]/>
			</#if>
		</#if>
	</#list>
</#list>
<#list modelNames as modelName>
import com.${orgName?lower_case}.${projectName?lower_case}.${helper.CamelName(modelName)?lower_case}.${helper.CamelName(modelName)};
</#list>

public class ${projectName?cap_first}ChangeRequestHelper extends BaseChangeRequestHelper{
    protected class AnonymousUser extends BaseEntity{
        public AnonymousUser(String id) {
            this.id = id;
        }
    }
    protected BaseEntity anonymousUser() {
        return new AnonymousUser(userContext.tokenId);
    }
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
		loadCrSpecFromJar("/META-INF/${projectName?lower_case}_cr_spec.json");
	}

	protected Object toEventTableName(CRGroupSpec groupSpec) {
		return "event_" + (groupSpec.getModelName().trim().replace(' ', '_').toLowerCase())+"_data";
	}

	public void markAsCommited(ChangeRequest cr) {
        cr.updateCommited(true);
        try {
            userContext.getManagerGroup().getChangeRequestManager().internalSaveChangeRequest(userContext, cr, EO);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	public ChangeRequestProcessResult processChangeRequest(ChangeRequestPostData postedData, BaseEntity currentUserInfo) throws Exception {
	    if (currentUserInfo == null) {
    		currentUserInfo = anonymousUser();
    	}
		ChangeRequestProcessResult processResult = new ChangeRequestProcessResult();
		processResult.setPostedData(postedData);
		
		savePostedData(postedData, currentUserInfo);
		String nextScene = calcSceneCode(postedData);
		if (nextScene.equals(CR.NEXT_COMMIT)) {
			processResult.setResultCode(ChangeRequestProcessResult.CODE_COMMITTED);
			processResult.setChangeRequest(loadWholeChangeRequest(postedData.getChangeRequestId()));
		}else {
			processResult.setResultCode(ChangeRequestProcessResult.CODE_NOT_COMMITTED);
			processResult.setNewChangeRequestType(postedData.getChangeRequestType());
			processResult.setNewSceneCode(nextScene);
			processResult.setNewGroupIds(calcNewGroupIds(postedData));
		}
		
		return processResult;
	}
	
	public GenericFormPage assemblerChangeRequstFirstStepResponse(BaseEntity currentUserInfo, String crType, String processUrl) throws Exception {
			CRSpec crSpec = CR(crType);
			return assemblerChangeRequstResponse(currentUserInfo, crType, crSpec.getSceneList().get(0).getName(), null, processUrl);
	}

	// 根据定位信息,组装一个 cr 的response
	public GenericFormPage assemblerChangeRequstResponse(BaseEntity currentUserInfo, String crType, String sceneCode,
			Map<String, Integer> recordIndexInfo, String processUrl) throws Exception {
		if (currentUserInfo == null) {
            currentUserInfo = anonymousUser();
        }
		// 先拿到CR spec
		CRSpec crSpec = CR(crType);
		// 再根据scene code, 找到有哪几个group的spec被需要
		List<CRGroupSpec> groupSpecList = GROUPS(crSpec, sceneCode);
		// 再用这些Group spec, 找到系统中相关的已经存在的cr和event数据
		ChangeRequest cr = loadCrDataByGroups(crType, currentUserInfo, groupSpecList);
		// 然后根据需要,补足fields,填充field的默认值
		GenericFormPage crData = fulfillChangeRequestFields(cr, crSpec, sceneCode, groupSpecList, recordIndexInfo, processUrl);
		// 最后要交给业务模块,让业务模块有机会修正准备好的数据: 目前用返回值给业务模块来实现,没做回调
		// adjustChangeRequestResponse(cr, crSpec, sceneCode, groupSpecList);
		return crData;
	}
	protected List<CRGroupSpec> ALL_GROUPS(CRSpec crSpec) {
        return crSpec.getSceneList().stream().flatMap(scSpec->scSpec.getGroups().stream()).collect(Collectors.toList());
    }
	// 根据 group spec list, 把这个cr装满
	protected GenericFormPage fulfillChangeRequestFields(ChangeRequest InputCR, CRSpec crSpec, String sceneCode,
			List<CRGroupSpec> groupSpecList, Map<String, Integer> recordIndexInfo, String processUrl) throws Exception {
		final ChangeRequest cr = ensureChangeRequest(InputCR, crSpec);
		// 先建立一个CR
		GenericFormPage requestData = new GenericFormPage();
		requestData.setId(cr.getId());
		requestData.setTitle(crSpec.getTitle());
		requestData.setBrief(crSpec.getBrief());
		requestData.setType(crSpec.getChangeRequestType());
		requestData.setGroupList(new ArrayList<>(groupSpecList.size()+1));
		// 然后填 hidden 的基础信息 
		{
			CRGroupData hiddenGroup = new CRGroupData();
			hiddenGroup.setName(CR.GROUP_HIDDEN);
			hiddenGroup.setTitle("隐藏字段");
			hiddenGroup.setHidden(true);
			requestData.getGroupList().add(hiddenGroup);
			addHiddenField(requestData, CR.FIELD_CR_ID, cr.getId());
			addHiddenField(requestData, CR.FIELD_SCENE_CODE, sceneCode);
			for(CRGroupSpec groupSpec: groupSpecList) {
				String gName = groupSpec.getName();
				if (recordIndexInfo != null && recordIndexInfo.containsKey(groupSpec.getName())) {
					addHiddenField(requestData, "indexof_"+ gName, String.valueOf(recordIndexInfo.get(gName)));
				}else {
					addHiddenField(requestData, "indexof_"+ gName, "1");
				}
			}
		}
		// 接着填 scene 列表
		{
			List<CRSceneData> stepList = prepareSceneList(crSpec, sceneCode);
			requestData.setSceneList(stepList);
		}
		// 然后填所有的字段
		for(CRGroupSpec groupSpec: groupSpecList) {
			CRGroupData groupData = new CRGroupData();
			groupData.setName(groupSpec.getName());
			groupData.setTitle(groupSpec.getTitle());
			groupData.setHidden(false);
			requestData.getGroupList().add(groupData);
			
			int groupRecordIndex = getIndexOfGroup(requestData, groupSpec);
			fulfillChangeRequestField(requestData, cr, crSpec, groupData, groupSpec, crSpec.getFieldList(), groupRecordIndex, processUrl);
		}
		// 最后是CR级别的actions
		fulfillChangeRequestActions(requestData, crSpec, sceneCode, processUrl);
		return requestData;
	}
	
	protected ChangeRequest loadCrDataByGroups(String crType, BaseEntity currentUserInfo, List<CRGroupSpec> groupSpecList) throws Exception {
		List<Object> params = new ArrayList<>();
		StringBuilder sb = new StringBuilder(
				"select * from change_request_data CR where CR.request_type=? and commited is false and (");
		params.add(crType);
		final int paramsLen = params.size();
		ALL_GROUPS(CR(crType)).forEach(group -> {
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

	protected void addHiddenField(GenericFormPage requestData, String fieldShortName, String value) {
		CRGroupData group = HIDDEN_GROUP(requestData);
		CRFieldData fieldData = new CRFieldData();
		fieldData.setName(CR.GROUP_HIDDEN+"_"+fieldShortName);
		fieldData.setValue(value);
		fieldData.setHidden(true);
		fieldData.setRules(hiddenFieldRules(fieldShortName));
		group.addField(fieldData);
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
			case CR.${helper.JAVA_CONST(crSpec.changeRequestType)}.SCENE_${helper.JAVA_CONST(scene.name)}.GROUP_${helper.JAVA_CONST(group.name)}.NAME: {
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
	protected void fulfillChangeRequestField(GenericFormPage requestData, ChangeRequest dbCrData, CRSpec crSpec, CRGroupData groupData, CRGroupSpec groupSpec,
			List<CRFieldSpec> fieldSpecList, int groupRecordIndex, String processUrl) throws Exception {
		int curRecordIdx = groupRecordIndex;
		switch (groupSpec.getName()) {
<#list projectSpec.changeRequestList as crSpec>
	<#list crSpec.stepList as scene>
		<#list scene.eventList as group>
		case CR.${helper.JAVA_CONST(crSpec.changeRequestType)}.SCENE_${helper.JAVA_CONST(scene.name)}.GROUP_${helper.JAVA_CONST(group.name)}.NAME:
			curRecordIdx = fulfillChangeRequestFieldByGroup(requestData, dbCrData, groupData, fieldSpecList, dbCrData.getEvent${helper.CamelName(group.eventType)}List(), groupRecordIndex);
			break;
		</#list>
	</#list>
</#list>
		default:
			error("不支持自动填充 "+groupSpec.getName()+":"+groupSpec.getTitle()+" 的数据");
		}
		if (groupSpec.isMultiple()) {
			groupData.setTitle(groupData.getTitle()+" "+curRecordIdx);
		}
		fulfillGroupActions(crSpec, groupData, groupSpec, curRecordIdx, processUrl);
	}
	
	protected int fulfillChangeRequestFieldByGroup(GenericFormPage requestData, ChangeRequest dbCrData,
			CRGroupData groupData, List<CRFieldSpec> fieldSpecList, SmartList<? extends BaseEntity> eventList, int groupRecordIndex) throws Exception {
		String gName = CR.GROUP_HIDDEN+"_indexof_"+groupData.getName();
		CRFieldData gidField = HIDDEN_GROUP(requestData).getFieldList().stream().filter(it -> it.getName().equals(gName))
				.findFirst().orElse(null);
		if (eventList == null || eventList.isEmpty()) {
			fullFillNewFields(requestData, dbCrData, groupData, fieldSpecList);
			if (gidField != null) {
				gidField.setValue("1");
			}
			return 1;
		}
		int foundAny = 0;
		boolean fillAny = false;
		for(int i=0;i<eventList.size();i++) {
			BaseEntity evtData = eventList.get(i);
			List<KeyValuePair> kvList = evtData.keyValuePairOf();
			KeyValuePair fieldGroup = kvList.stream().filter(entry->entry.getKey().equals("fieldGroup")).findAny().orElse(null);
			if (fieldGroup == null || !fieldGroup.getValue().equals(groupData.getName())) {
				continue;
			}
			foundAny++;
			if (foundAny != groupRecordIndex) {
				continue;
			}
			for(CRFieldSpec fieldSpec: fieldSpecList) {
				if (!GROUP_NAME(fieldSpec).equals(groupData.getName())){
					continue;
				}
				
				CRFieldData fieldData = new CRFieldData();
				fieldData.setName(fieldSpec.getName()+"_"+evtData.getId());
				if (fieldSpec.getInteractionMode().equals("display")) {
					fieldData.setValue(TO_VALUE(getFieldValueWhenFillResponse(fieldSpec.getValue(),requestData, dbCrData, groupData, fieldSpec)));
				}else {
					String memberName = FIELD_NAME(fieldSpec);
					KeyValuePair kv = kvList.stream().filter(entry->entry.getKey().equals(memberName)).findAny().orElse(null);
					if (kv == null || kv.getValue() == null) {
						fieldData.setValue(TO_VALUE(getFieldValueWhenFillResponse(fieldSpec.getDefaultValue(),requestData, dbCrData, groupData, fieldSpec)));
					}else {
						fieldData.setValue(TO_VALUE(getFieldValueWhenFillResponse(kv.getValue(),requestData, dbCrData, groupData, fieldSpec)));
					}
				}
				setFieldSpecInfo(requestData, dbCrData, groupData, fieldData, fieldSpec);
				groupData.addField(fieldData);
				fillAny = true;
			}
		}
		if (!fillAny) {
			fullFillNewFields(requestData, dbCrData, groupData, fieldSpecList);
			if (gidField != null) {
				gidField.setValue(String.valueOf(foundAny+1));
			}
			return foundAny+1;
		}else {
			return groupRecordIndex;
		}
	}

	protected void fullFillNewFields(GenericFormPage requestData, ChangeRequest dbCrData, CRGroupData groupData, List<CRFieldSpec> fieldSpecList) throws Exception{
		for(CRFieldSpec fieldSpec: fieldSpecList) {
			if (!GROUP_NAME(fieldSpec).equals(groupData.getName())){
				continue;
			}
		
			CRFieldData fieldData = new CRFieldData();
			fieldData.setName(fieldSpec.getName()+"_new");
			if (fieldSpec.getValue() != null) {
				fieldData.setValue(TO_VALUE(getFieldValueWhenFillResponse(fieldSpec.getValue(),requestData, dbCrData, groupData, fieldSpec)));
			}else {
				fieldData.setValue(TO_VALUE(getFieldValueWhenFillResponse(fieldSpec.getDefaultValue(),requestData, dbCrData, groupData, fieldSpec)));
			}
			setFieldSpecInfo(requestData, dbCrData, groupData, fieldData, fieldSpec);
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
		case "${crSpec.shortName?lower_case}${helper.NameAsThis(scene.name)+"_"+helper.javaVar(group.name)+"_"+helper.javaVar(field.name)}": 
			doField${helper.NameAsThis(crSpec.shortName)}${helper.CamelName(scene.name)+helper.CamelName(group.name)+helper.CamelName(field.name)}Checking(postedData, fieldSpec, fieldName, value);
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
	protected void doField${helper.NameAsThis(crSpec.shortName)}${helper.CamelName(scene.name)+helper.CamelName(group.name)+helper.CamelName(field.name)}Checking(ChangeRequestPostData postedData, CRFieldSpec fieldSpec, String fieldName, Object value) {
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
		case CR.ACTION_DELETE_RECORD:
			break;
		case CR.ACTION_PREV_STEP:
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
		List<CRGroupSpec> groupSpecList = GROUPS(crSpec, postedData.getSceneCode());
		if (postedData.getFieldData() == null || postedData.getFieldData().isEmpty()) {
			// 没提交任何数据, 那么,只有全部都是可选,才能这样
			if (mustFillSomeField(crSpec, groupSpecList)) {
				throw new ${projectName?cap_first}Exception("您未填写任何数据");
			} else {
				return; // 啥也没提, 但是都是可选, 那就不用
			}
		}
		Iterator<Entry<String, List<Map<String, Object>>>> git = postedData.getFieldData().entrySet().iterator();
		while(git.hasNext()) {
			Entry<String, List<Map<String, Object>>> gEntity = git.next();
			String groupName = gEntity.getKey();
			List<Map<String, Object>> fieldValues = gEntity.getValue();
			CRGroupSpec groupSpec = groupSpecList.stream().filter(g->g.getName().equals(groupName)).findFirst().orElse(null);
			if (groupSpec == null) {
				error("无法处理提交的 "+groupName+" 的数据");
			}
			if (groupSpec.getName().equals(postedData.getActionGroup()) && CR.ACTION_DELETE_RECORD.equals(postedData.getActionCode())) {
				deleteGroup(groupSpec, postedData.getChangeRequestId(),fieldValues);
				continue;
			}
			String crId = postedData.getChangeRequestId();
			switch (groupSpec.getName()) {
<#list projectSpec.changeRequestList as crSpec>
	<#list crSpec.stepList as scene>
		<#list scene.eventList as group>
			case CR.${helper.JAVA_CONST(crSpec.changeRequestType)}.SCENE_${helper.JAVA_CONST(scene.name)}.GROUP_${helper.JAVA_CONST(group.name)}.NAME:
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
	protected void deleteGroup(CRGroupSpec groupSpec, String crId, List<Map<String, Object>> fieldValues) throws Exception {
		Map<String, Object> fieldValue = fieldValues.stream().findFirst().orElse(null);
		if (fieldValue == null) {
			return;
		}
		String id = (String) fieldValue.get("id");
		if (id == null || id.isEmpty()) {
			return;
		}
		switch (groupSpec.getName()) {
<#list projectSpec.changeRequestList as crSpec>
	<#list crSpec.stepList as scene>
		<#list scene.eventList as group>
			case CR.${helper.JAVA_CONST(crSpec.changeRequestType)}.SCENE_${helper.JAVA_CONST(scene.name)}.GROUP_${helper.JAVA_CONST(group.name)}.NAME:{
				Event${helper.CamelName(group.eventType)} event = getUserContext().getDAOGroup().getEvent${helper.CamelName(group.eventType)}DAO().load(id, EO);
				getUserContext().getManagerGroup().getChangeRequestManager().removeEvent${helper.CamelName(group.eventType)}(getUserContext(), crId, id, event.getVersion(), new String[]{});
			}
				break;
		</#list>
	</#list>
</#list>
			default:
				break;
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
				<#if field.selectable == "multi_selectable">
				String ${helper.javaVar(field.name)} = toJsonString(getStringList(fieldValue.get("${helper.javaVar(field.name)}")));
				<#elseif field.inputType == "baseEntity">
                String ${helper.javaVar(field.name)} = getStringValue(fieldValue.get("${helper.javaVar(field.name)}"));
				<#else>
				${helper.getJavaType(field.inputType)} ${helper.javaVar(field.name)} = get${helper.CamelName(field.inputType)}Value(fieldValue.get("${helper.javaVar(field.name)}"));
				</#if>
			</#list>
				String fieldGroup = CR.${helper.JAVA_CONST(crSpec.changeRequestType)}.SCENE_${helper.JAVA_CONST(scene.name)}.GROUP_${helper.JAVA_CONST(group.name)}.NAME; //"${helper.javaVar(scene.name)}_${helper.javaVar(group.name)}";
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
				<#if field.selectable == "multi_selectable">
				event.update${helper.CamelName(field.name)}(toJsonString(getStringList(fieldValue.get("${helper.javaVar(field.name)}"))));
				<#elseif field.inputType == "baseEntity">
				event.update${helper.CamelName(field.name)}(${helper.CamelName(field.modelName)}.refById(getStringValue(fieldValue.get("${helper.javaVar(field.name)}"))));
				<#else>
				event.update${helper.CamelName(field.name)}(get${helper.CamelName(field.inputType)}Value(fieldValue.get("${helper.javaVar(field.name)}")));
				</#if>
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
	
	protected void doBaseEntityFieldChecking(ChangeRequestPostData postedData, CRFieldSpec fieldSpec, String fieldName, Object value) {
	    if (CRFieldSpec.MULTI_SELECTABLE.equals(fieldSpec.getSelectable())) {
            List<String> entityIds = getStringList(value);
            if (entityIds == null || entityIds.isEmpty()) {
                postedData.addVerifyErrorMessage(fieldName, fieldSpec.getLabel(), String.format("%s的输入不正确", fieldSpec.getLabel()));
                return;
            }
            for(String id : entityIds){
                BaseEntity obj = this.getUserContext().getDAOGroup().loadBasicData(TextUtil.toCamelCase(fieldSpec.getModelName()), id);
                if(obj == null) {
                    postedData.addVerifyErrorMessage(fieldName, fieldSpec.getLabel(), String.format("输入的%s:%s不存在", fieldSpec.getLabel(), id));
                }
            }
            return;
        }

		String baseEntityId = getStringValue(value);
		if (baseEntityId == null) {
			postedData.addVerifyErrorMessage(fieldName, fieldSpec.getLabel(), String.format("%s的输入不正确", fieldSpec.getLabel()));
			return;
		}
		BaseEntity obj = this.getUserContext().getDAOGroup().loadBasicData(TextUtil.toCamelCase(fieldSpec.getModelName()), baseEntityId);
		if(obj == null) {
			postedData.addVerifyErrorMessage(fieldName, fieldSpec.getLabel(), String.format("输入的%s:%s不存在", fieldSpec.getLabel(), baseEntityId));
		}
	}
	
	@Override
	protected Object queryCandidatesForModel(CRGroupData groupData, CRFieldData fieldData, CRFieldSpec fieldSpec) {
		String modelType = TextUtil.toCamelCase(fieldSpec.getModelName());
		try {
			List<Object> params = prepareParamsForQueryCandidatesBySpec(groupData, fieldData, fieldSpec);
			CandidateQuery query = new CandidateQuery();
			query.setTargetType(modelType);
			switch (modelType) {
<#list helper.getAllModelNamesNeedCandidates(projectSpec) as modelType>
			case ${helper.NameAsThis(modelType)}.INTERNAL_TYPE:
				return userContext.getManagerGroup().get${helper.NameAsThis(modelType)}Manager().queryCandidates(userContext, query);
</#list>
			default:
				new Throwable("不支持自动填充"+modelType+"的候选值").printStackTrace();
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	protected String getCandidateDataTitle(CRFieldSpec fieldSpec, Object val) {
		if (val instanceof Map) {
			return (String) ((Map) val).get("name");
		}
		if (val instanceof BaseEntity) {
			return ((BaseEntity)val).getDisplayName();
		}
		return null;
	}
	@Override
	protected String getCandidateDataValue(CRFieldSpec fieldSpec, Object val) {
		if (val instanceof Map) {
			return (String) ((Map) val).get("id");
		}
		if (val instanceof BaseEntity) {
			return ((BaseEntity)val).getId();
		}
		return null;
	}

	protected Object getFieldValueWhenFillResponse(
          Object suggestValue,
          GenericFormPage requestData,
          ChangeRequest changeRequest,
          CRGroupData groupData,
          CRFieldSpec fieldSpec)
          throws Exception {
        return suggestValue;
      }

      protected Object getFieldCandidatesWhenFillResponse(
          GenericFormPage requestData,
          ChangeRequest changeRequest,
          CRGroupData groupData,
          CRFieldSpec fieldSpec,
          CRFieldData fieldData)
          throws Exception {
        return makeFieldCandidateValues(groupData, fieldData, fieldSpec);
      }

      protected void setFieldSpecInfo(
            GenericFormPage requestData,
            ChangeRequest dbCrData,
            CRGroupData groupData,
            CRFieldData fieldData,
            CRFieldSpec fieldSpec)
            throws Exception {
          fieldData.setRequired(fieldSpec.getRequired());
          fieldData.setDisabled(!fieldSpec.getInteractionMode().equals("input"));
          if (fieldData.isDisabled()) {
            fieldData.setRequired(false);
          }
          if (fieldSpec.getInteractionMode().equals("display")) {
            fieldData.setType("prompt_message");
            fieldData.setRequired(false);
          } else if (fieldSpec.getInteractionMode().equals("hidden")) {
            fieldData.setHidden(true);
            fieldData.setType("hidden");
          } else {
            if (!isFieldNeedQueryForCandidates(fieldSpec)) {
              if (fieldSpec.getUiStyle().equals("text")
                  && DataTypeUtil.getInt(fieldSpec.getMaximum(), 40) > 100) {
                fieldData.setType("longtext");
              } else {
                fieldData.setType(fieldSpec.getUiStyle());
              }
            } else {
              if (CRFieldSpec.MULTI_SELECTABLE.equals(fieldSpec.getSelectable())) {
                fieldData.setType("multi-select");
              } else {
                fieldData.setType("single-select");
              }
            }
          }

          fieldData.setCandidateValues(
              convertToUiCandidateValues(
                  fieldSpec,
                  getFieldCandidatesWhenFillResponse(
                      requestData, dbCrData, groupData, fieldSpec, fieldData)));
          fieldData.setLabel(fieldSpec.getLabel());
          fieldData.setPlaceholder(
              fieldSpec.getPlaceholder() == null ? "请输入" : fieldSpec.getPlaceholder());
          fieldData.setTipsTitle(fieldSpec.getTipsTitle());
          fieldData.setTipsContent(fieldSpec.getTipsContent());
          fieldData.setIcon(fieldSpec.getIcon());

          fieldData.setMultiple(CRFieldSpec.MULTI_SELECTABLE.equals(fieldSpec.getSelectable()));
          fieldData.setCandidateValuesApi(fieldSpec.getValuesRetrieveApi());
          fieldData.setMinimum(fieldSpec.getMinimum());
          fieldData.setMaximum(fieldSpec.getMaximum());
          fieldData.setRules(getFiledRules(fieldSpec));

          //		所有数据填充完毕后的一些处理
          updateFieldCandidateValueSelected(fieldData, fieldSpec);
        }

}
