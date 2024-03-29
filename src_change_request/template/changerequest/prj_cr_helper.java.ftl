package com.${orgName?lower_case}.${projectName?lower_case};

import java.math.BigDecimal;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import com.fasterxml.jackson.core.type.TypeReference;
import com.terapico.utils.DataTypeUtil;

import com.${orgName?lower_case}.${projectName?lower_case}.changerequest.ChangeRequest;
import com.${orgName?lower_case}.${projectName?lower_case}.changerequest.ChangeRequestTokens;
import com.${orgName?lower_case}.${projectName?lower_case}.eventinfoincr.EventInfoInCr;
import com.${orgName?lower_case}.${projectName?lower_case}.eventinfoincr.EventInfoInCrTable;
import com.terapico.caf.appview.*;
import com.terapico.caf.viewcomponent.*;
import com.terapico.changerequest.*;

import com.terapico.utils.DebugUtil;
import com.terapico.utils.MapUtil;
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
<#list helper.getAllModelNamesNeedCandidates(projectSpec) as modelName>
import com.${orgName?lower_case}.${projectName?lower_case}.${helper.CamelName(modelName)?lower_case}.${helper.CamelName(modelName)};
</#list>

public class ${projectName?cap_first}${helper.NameAsThis(scopeName)}ChangeRequestHelper extends BaseChangeRequestHelper{
    protected boolean inProductEnv(){
		return getUserContext().isProductEnvironment();
	}
    protected class AnonymousUser extends BaseEntity{
        public AnonymousUser(String id) {
            this.id = id;
        }
    }
    protected BaseEntity anonymousUser() {
        return new AnonymousUser(userContext.tokenId);
    }
	protected Custom${projectName?cap_first}UserContextImpl userContext;
	
	protected static String key(${projectName?cap_first}UserContextImpl ctx) {
		return "_key_for_thread_scope_${helper.NameAsThis(scopeName)}ChangeRequestHelper";
	}

	public Custom${projectName?cap_first}UserContextImpl getUserContext() {
		return userContext;
	}
	public void setUserContext(Custom${projectName?cap_first}UserContextImpl userContext) {
		this.userContext = userContext;
	}
	protected void loadCrSpec() {
        try {
            loadCrSpecFromJar("/META-INF/${helper.name_as_this(scopeName)}_cr_spec.json");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

	protected Object toEventTableName(CRGroupSpec groupSpec) {
		return "event_" + (groupSpec.getModelName().trim().replace(' ', '_').toLowerCase())+"_data";
	}

	public void markAsCommitted(ChangeRequest cr) {
        markCommittedStatus(cr, STATUS_COMMITTED);
    }
    public void markAsCommittedAndPreset(ChangeRequest cr) {
        markCommittedStatus(cr, STATUS_PRESET);
    }
    protected void markCommittedStatus(ChangeRequest cr, String committedStatus) {
        cr.updateCommited(true);
        try {
            userContext.getManagerGroup().getChangeRequestManager().internalSaveChangeRequest(userContext, cr, EO);
            String sql = "update "+EventInfoInCrTable.TABLE_NAME+" set status=? where change_request=? ";
            userContext.dao().updateBySql(sql, new Object[]{committedStatus, cr.getId()});
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
		if (nextScene.equals(${helper.NameAsThis(scopeName)}CR.NEXT_COMMIT)) {
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

		ChangeRequestProcessingContext crContext = new ChangeRequestProcessingContext();
        crContext.setCrSpec(crSpec);
        crContext.setSceneCode(sceneCode);
        crContext.setPostData(null);
        userContext.setChangeRequest(cr);
        userContext.setChangeRequestProcessingContext(crContext);
        userContext.putIntoContextLocalStorage("_cr_current_user_info_", currentUserInfo);

		// 然后根据需要,补足fields,填充field的默认值
		GenericFormPage crData = fulfillChangeRequestFields(crContext, cr, groupSpecList, recordIndexInfo, processUrl);
		// 最后要交给业务模块,让业务模块有机会修正准备好的数据: 目前用返回值给业务模块来实现,没做回调
		afterCRDataFulfilled(userContext, crContext, crData);
		return crData;
	}
	// 根据提交的数据,在字段被change的时候,重新组装一个 cr 的response
    public GenericFormPage assemblerChangeRequstResponse(BaseEntity currentUserInfo, ChangeRequestPostData postData, String processUrl) throws Exception {
        if (currentUserInfo == null) {
            currentUserInfo = anonymousUser();
        }
        // 先拿到CR spec
        CRSpec crSpec = CR(postData.getChangeRequestType());
        // 再根据scene code, 找到有哪几个group的spec被需要
        List<CRGroupSpec> groupSpecList = GROUPS(crSpec, postData.getSceneCode());
        // 再用这些Group spec, 找到系统中相关的已经存在的cr和event数据
        ChangeRequest cr = loadCrDataByGroups(postData.getChangeRequestType(), currentUserInfo, groupSpecList);

        ChangeRequestProcessingContext crContext = new ChangeRequestProcessingContext();
        crContext.setCrSpec(crSpec);
        crContext.setSceneCode(postData.getSceneCode());
        crContext.setPostData(postData);
        crContext.setActionCode(postData.getActionCode());
        crContext.setChangingFieldName(postData.getUpdatingField());
        userContext.setChangeRequestProcessingContext(crContext);
        userContext.putIntoContextLocalStorage("_cr_current_user_info_", currentUserInfo);

        // 然后根据需要,补足fields,填充field的默认值
        GenericFormPage crData = fulfillChangeRequestFields(crContext, cr, groupSpecList, postData.getGroupIds(), processUrl);
        // 最后要交给业务模块,让业务模块有机会修正准备好的数据: 目前用返回值给业务模块来实现,没做回调
        afterCRDataFulfilled(userContext, crContext, crData);
        return crData;
    }
    protected void afterCRDataFulfilled(Custom${projectName?cap_first}UserContextImpl userContext, ChangeRequestProcessingContext crContext, GenericFormPage crData) {
        // by default, nothing to do
    }
	protected List<CRGroupSpec> ALL_GROUPS(CRSpec crSpec) {
        return crSpec.getSceneList().stream().flatMap(scSpec->scSpec.getGroups().stream()).collect(Collectors.toList());
    }
	// 根据 group spec list, 把这个cr装满
	protected GenericFormPage fulfillChangeRequestFields(ChangeRequestProcessingContext crContext, ChangeRequest InputCR,
			List<CRGroupSpec> groupSpecList, Map<String, Integer> recordIndexInfo, String processUrl) throws Exception {
        CRSpec crSpec = crContext.getCrSpec();
        String sceneCode = crContext.getSceneCode();
        ChangeRequestPostData postData = crContext.getPostData();

		final ChangeRequest cr = ensureChangeRequest(InputCR, crSpec);
		crContext.setCrId(cr.getId());
		userContext.setChangeRequest(cr);
		// 先建立一个CR
		GenericFormPage requestData = new GenericFormPage();
		requestData.setId(cr.getId());
		requestData.setTitle(crSpec.getTitle());
		requestData.setBrief(crSpec.getBrief());
		requestData.setType(crSpec.getChangeRequestType());
		requestData.setGroupList(new ArrayList<>(groupSpecList.size()+1));
		crContext.setRequestData(requestData);
		// 然后填 hidden 的基础信息 
		{
			CRGroupData hiddenGroup = new CRGroupData();
			hiddenGroup.setName(${helper.NameAsThis(scopeName)}CR.GROUP_HIDDEN);
			hiddenGroup.setId(${helper.NameAsThis(scopeName)}CR.GROUP_HIDDEN);
			hiddenGroup.setTitle("隐藏字段");
			hiddenGroup.setHidden(true);
			requestData.getGroupList().add(hiddenGroup);
			addHiddenField(requestData, ${helper.NameAsThis(scopeName)}CR.FIELD_CR_ID, cr.getId());
			addHiddenField(requestData, ${helper.NameAsThis(scopeName)}CR.FIELD_SCENE_CODE, sceneCode);
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
		    crContext.setGroupSpec(groupSpec);
			CRGroupData groupData = new CRGroupData();
			groupData.setName(groupSpec.getName());
			groupData.setId(groupSpec.getName());
			groupData.setTitle(groupSpec.getTitle());
			groupData.setHidden(false);
			requestData.getGroupList().add(groupData);
			
			int groupRecordIndex = getIndexOfGroup(requestData, groupSpec);
			fulfillChangeRequestField(crContext, cr, groupData, groupRecordIndex, processUrl);
		}
		// 最后是CR级别的actions
		fulfillChangeRequestActions(cr.getId(), requestData, crSpec, sceneCode, processUrl);
		return requestData;
	}

	protected ChangeRequest loadCrDataByGroups(String crType, BaseEntity currentUserInfo, List<CRGroupSpec> groupSpecList) throws Exception {
        List<Object> params = new ArrayList<>();
        String sql = "select * from event_info_in_cr_data E " +
                " where E.initiator_type=? and E.initiator_id=? and E.change_request_type=? " +
                "    order by E.id desc limit ?";
//		StringBuilder sb = new StringBuilder(
//				"select * from change_request_data CR where ${helper.NameAsThis(scopeName)}CR.request_type=? and commited is false and (");

        params.add(currentUserInfo.getInternalType());
        params.add(currentUserInfo.getId());
        params.add(crType);
        params.add(1);
        SmartList<EventInfoInCr> list = getUserContext().getDAOGroup().getEventInfoInCrDAO().queryList(sql, params.toArray());
        if (list == null || list.isEmpty()) {
            return null;
        }

        EventInfoInCr info = list.first();
        // 如果是正在填写的,直接返回
        if (info.getStatus().equals(STATUS_OPENING)){
            String crId = info.getChangeRequest().getId();
            ChangeRequest cr = getUserContext().getDAOGroup().getChangeRequestDAO().load(crId, ChangeRequestTokens.withoutLists());
            enhanceChangeRequest(cr, groupSpecList);
            return cr;
        }

        // 如果是 已提交 , 那么就返回空CR
        if (info.getStatus().equals(STATUS_COMMITTED)){
            return null;
        }

        // 如果是: 提交并且作为下一次的 样本, 那么就应该复制所有的event, 现在暂时没做. 还是返回空
        ChangeRequest cr =  createFromPresetCr(info.getChangeRequest().getId(), crType, currentUserInfo,groupSpecList);
        enhanceChangeRequest(cr, groupSpecList);
        return cr;
	}

    /** 复制一个已经存在的CR */
    protected ChangeRequest createFromPresetCr(String crId, String crType, BaseEntity currentUserInfo, List<CRGroupSpec> groupSpecList) throws Exception{
		return null;
	}

	protected void addHiddenField(GenericFormPage requestData, String fieldShortName, String value) {
		CRGroupData group = HIDDEN_GROUP(requestData);
		CRFieldData fieldData = new CRFieldData();
		fieldData.setName(${helper.NameAsThis(scopeName)}CR.GROUP_HIDDEN+"_"+fieldShortName);
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
				.createChangeRequest(userContext, crSpec.getTitle(), userContext.getCityByIp(), crSpec.getChangeRequestType(), false, "P000001");
		// 这个会导致 changeRequestManager 的 onNewInstanceCreated, 注意这个扩展点
		newCr.setRequestType(userContext.getDAOGroup().getChangeRequestTypeDAO().load(crSpec.getChangeRequestType(),EO));
		return newCr;
	}
	
	protected void enhanceChangeRequest(ChangeRequest cr, List<CRGroupSpec> groupSpecList) throws Exception{
		if (groupSpecList == null || groupSpecList.isEmpty()) {
			return;
		}
		switch(cr.getRequestType().getId()) {
<#list projectSpec.changeRequestList as crSpec>
		case ${helper.NameAsThis(scopeName)}CR.${helper.JAVA_CONST(crSpec.changeRequestType)}.NAME:
			enhance${helper.CamelName(crSpec.changeRequestType)}ChangeRequest(cr, groupSpecList);
			break;
</#list>
		default:
			BUG("不能增强"+cr.getRequestType().getId()+"类型的CR");
		}
	}

	protected EventInfoInCr getEventInfoInCr(String crId) {
        String sql = "select * from " + EventInfoInCrTable.TABLE_NAME+" where change_request=? order by id desc limit 1";
        return getUserContext().getDAOGroup().getEventInfoInCrDAO().queryList(sql, crId).first();
    }

<#list projectSpec.changeRequestList as crSpec>
	protected void enhance${helper.CamelName(crSpec.changeRequestType)}ChangeRequest(ChangeRequest cr, List<CRGroupSpec> groupSpecList) throws Exception{
		EventInfoInCr eiic = getEventInfoInCr(cr.getId());
        Map<String, EventInfo> eventsInfo = getEventInfoMapFrom(eiic.getEventsInfo());
        groupSpecList.forEach(group->{
            List<String> eventIds = getEventIdsFromByGroupName(eventsInfo, group.getName());
            if (eventIds == null || eventIds.isEmpty()) {
                return;
            }
            Object[] params = eventIds.toArray();
            String sql = "select * from " + toEventTableName(group) + " E where E.id in (" +
                    TextUtil.repeat("?", eventIds.size(), ",") + ")";
			switch (group.getName()) {
		<#list crSpec.stepList as scene>
			<#list scene.eventList as group>
			case ${helper.NameAsThis(scopeName)}CR.${helper.JAVA_CONST(crSpec.changeRequestType)}.SCENE_${helper.JAVA_CONST(scene.name)}.GROUP_${helper.JAVA_CONST(group.name)}.NAME: {
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
	protected void fulfillChangeRequestField(ChangeRequestProcessingContext crContext, ChangeRequest dbCrData, CRGroupData groupData, int groupRecordIndex, String processUrl) throws Exception {
        int curRecordIdx = groupRecordIndex;
        CRGroupSpec groupSpec = crContext.getGroupSpec();
		switch (groupSpec.getName()) {
<#list projectSpec.changeRequestList as crSpec>
	<#list crSpec.stepList as scene>
		<#list scene.eventList as group>
		case ${helper.NameAsThis(scopeName)}CR.${helper.JAVA_CONST(crSpec.changeRequestType)}.SCENE_${helper.JAVA_CONST(scene.name)}.GROUP_${helper.JAVA_CONST(group.name)}.NAME:
			curRecordIdx = fulfillChangeRequestFieldByGroup(crContext, dbCrData, groupData, dbCrData.getEvent${helper.CamelName(group.eventType)}List(), groupRecordIndex, groupSpec.getName(), processUrl);
			<#if group.multiple >
			fulfillExistsGroupData(crContext, dbCrData, groupData, dbCrData.getEvent${helper.CamelName(group.eventType)}List(), curRecordIdx, ${group.showPrevious}, ${group.showNext});
			</#if>
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
		fulfillGroupActions(crContext, dbCrData.getId(), groupData, curRecordIdx, processUrl);
	}
	
	protected int fulfillChangeRequestFieldByGroup(ChangeRequestProcessingContext crContext, ChangeRequest dbCrData,
			CRGroupData groupData, SmartList<? extends BaseEntity> eventList, int groupRecordIndex, String groupName, String processUrl) throws Exception {
		CRSpec crSpec = crContext.getCrSpec();
		GenericFormPage requestData = crContext.getRequestData();
		ChangeRequestPostData postData = crContext.getPostData();
		List<CRFieldSpec> fieldSpecList = crSpec.getFieldList();

		String gName = ${helper.NameAsThis(scopeName)}CR.GROUP_HIDDEN+"_indexof_"+groupData.getName();
		CRFieldData gidField = HIDDEN_GROUP(requestData).getFieldList().stream().filter(it -> it.getName().equals(gName))
				.findFirst().orElse(null);
		if (eventList == null || eventList.isEmpty()) {
		    BaseEntity emptyEvent = createEmptyEvent(dbCrData, groupName);
			fullFillNewFields(crContext, dbCrData, groupData, groupName, emptyEvent.getId(), fieldSpecList, processUrl);
			if (gidField != null) {
				gidField.setValue("1");
			}
			return 1;
		}
		int foundAny = 0;
		boolean fillAny = false;
		EventInfoInCr eiic = this.getEventInfoInCr(dbCrData.getId());
        Map<String, EventInfo> eventsInfo = this.getEventInfoMapFrom(eiic.getEventsInfo());
		for(int i=0;i<eventList.size();i++) {
			BaseEntity evtData = eventList.get(i);
			List<KeyValuePair> kvList = evtData.keyValuePairOf();
			String evtGroupName = getFieldGroupOfEvent(eventsInfo, evtData.getInternalType()+"_"+evtData.getId());
            if (evtGroupName == null || !evtGroupName.equals(groupData.getName())) {
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
				crContext.setFieldSpec(fieldSpec);
				CRFieldData fieldData = new CRFieldData();
				fieldData.setName(fieldSpec.getName()+"_"+evtData.getId());
				Object postValue = getValueFromPostedData(postData, groupData.getName(), FIELD_NAME(fieldSpec));
                if (postValue != null) {
                    Object suggestedDefaultValue = calcSuggestedDefaultValue(groupName, fieldSpec, postValue);
                    fieldData.setValue(TO_VALUE(getFieldValueWhenFillResponse(suggestedDefaultValue,requestData, dbCrData, groupData, fieldSpec),fieldSpec));
                }else if (fieldSpec.getInteractionMode().equals("display")) {
				    Object suggestedDefaultValue = calcSuggestedDefaultValue(groupName, fieldSpec, fieldSpec.getValue()==null?fieldSpec.getDefaultValue():fieldSpec.getValue());
					fieldData.setValue(TO_VALUE(getFieldValueWhenFillResponse(suggestedDefaultValue,requestData, dbCrData, groupData, fieldSpec),fieldSpec));
				}else {
					String memberName = FIELD_NAME(fieldSpec);
					KeyValuePair kv = kvList.stream().filter(entry->entry.getKey().equals(memberName)).findAny().orElse(null);
					if (fieldSpec.getValue() != null) {
                        // 如果有 forceValue
                        Object suggestedDefaultValue = calcSuggestedDefaultValue(groupName, fieldSpec, fieldSpec.getValue());
                        fieldData.setValue(TO_VALUE(getFieldValueWhenFillResponse(suggestedDefaultValue,requestData, dbCrData, groupData, fieldSpec),fieldSpec));
                    }else if (kv == null || kv.getValue() == null) {
					    Object suggestedDefaultValue = calcSuggestedDefaultValue(groupName, fieldSpec, fieldSpec.getDefaultValue());
                        fieldData.setValue(TO_VALUE(getFieldValueWhenFillResponse(suggestedDefaultValue,requestData, dbCrData, groupData, fieldSpec),fieldSpec));
					}else {
					    Object suggestedDefaultValue = calcSuggestedDefaultValue(groupName, fieldSpec, kv.getValue());
                    	fieldData.setValue(TO_VALUE(getFieldValueWhenFillResponse(suggestedDefaultValue,requestData, dbCrData, groupData, fieldSpec),fieldSpec));
					}
				}
				setFieldSpecInfo(crContext, dbCrData, groupData, fieldData, processUrl);
				afterFieldFulfilled(getUserContext(), requestData, dbCrData, fieldSpec, groupData, fieldData);
				groupData.addField(fieldData);
				fillAny = true;
			}
		}
		if (!fillAny) {
		    BaseEntity emptyEvent = createEmptyEvent(dbCrData, groupName);
			fullFillNewFields(crContext, dbCrData, groupData, groupName, emptyEvent.getId(), fieldSpecList, processUrl);
			if (gidField != null) {
				gidField.setValue(String.valueOf(foundAny+1));
			}
			return foundAny+1;
		}else {
			return groupRecordIndex;
		}
	}

	protected BaseEntity createEmptyEvent(ChangeRequest dbCrData, String groupName) throws Exception{
	    BaseEntity eventRcd = null;
		switch (groupName) {
<#list projectSpec.changeRequestList as crSpec>
	<#list crSpec.stepList as scene>
		<#list scene.eventList as group>
            case ${helper.NameAsThis(scopeName)}CR.${helper.JAVA_CONST(crSpec.changeRequestType)}.SCENE_${helper.JAVA_CONST(scene.name)}.GROUP_${helper.JAVA_CONST(group.name)}.NAME:{
                Event${helper.CamelName(group.eventType)} event = new Event${helper.CamelName(group.eventType)}();
                event.setChangeRequest(dbCrData);
                eventRcd = userContext.getDAOGroup().getEvent${helper.CamelName(group.eventType)}DAO().save(event, EO);
            }
            break;
		</#list>
	</#list>
</#list>
            default:
                throw new Exception("不支持自动创建"+groupName+"的空数据");
		}
        BaseEntity currentUserInfo = (BaseEntity)getUserContext().getFromContextLocalStorage("_cr_current_user_info_");
		String eventInitiatorType = currentUserInfo.getInternalType();
        String eventInitiatorId = currentUserInfo.getId();
        updateEventInfoInCR(getUserContext(), dbCrData.getId(), dbCrData.getRequestType().getId(), eventRcd, groupName, eventInitiatorType, eventInitiatorId);
        return eventRcd;
    }

	protected void fullFillNewFields(ChangeRequestProcessingContext crContext, ChangeRequest dbCrData,
    	                    CRGroupData groupData, String groupName, String rcdId, List<CRFieldSpec> fieldSpecList, String processUrl) throws Exception{
        CRSpec crSpec = crContext.getCrSpec();
        GenericFormPage requestData = crContext.getRequestData();
        ChangeRequestPostData postData = crContext.getPostData();

		for(CRFieldSpec fieldSpec: fieldSpecList) {
			if (!GROUP_NAME(fieldSpec).equals(groupData.getName())){
				continue;
			}
		    crContext.setFieldSpec(fieldSpec);
			CRFieldData fieldData = new CRFieldData();
			fieldData.setName(fieldSpec.getName()+"_"+rcdId);
			Object postValue = getValueFromPostedData(postData, groupData.getName(), FIELD_NAME(fieldSpec));
            if (postValue != null) {
                Object suggestedDefaultValue = calcSuggestedDefaultValue(groupName, fieldSpec, postValue);
                fieldData.setValue(TO_VALUE(getFieldValueWhenFillResponse(suggestedDefaultValue,requestData, dbCrData, groupData, fieldSpec),fieldSpec));
            }else if (fieldSpec.getValue() != null) {
				Object suggestedDefaultValue = calcSuggestedDefaultValue(groupName, fieldSpec, fieldSpec.getValue());
                fieldData.setValue(TO_VALUE(getFieldValueWhenFillResponse(suggestedDefaultValue,requestData, dbCrData, groupData, fieldSpec),fieldSpec));
			}else {
			    Object dv = null;
			    if (userContext.getChangeRequestProcessResult() != null) {
			        dv = getValueFromPostedData(userContext.getChangeRequestProcessResult().getPostedData(), groupName, fieldSpec.getName());
			    }
			    Object suggestedDefaultValue = calcSuggestedDefaultValue(groupName, fieldSpec, dv==null?fieldSpec.getDefaultValue():dv);
                fieldData.setValue(TO_VALUE(getFieldValueWhenFillResponse(suggestedDefaultValue,requestData, dbCrData, groupData, fieldSpec),fieldSpec));
			}
			setFieldSpecInfo(crContext, dbCrData, groupData, fieldData, processUrl);
			afterFieldFulfilled(getUserContext(), requestData, dbCrData, fieldSpec, groupData, fieldData);
			groupData.addField(fieldData);
		}
	}

	protected void afterFieldFulfilled(Custom${projectName?cap_first}UserContextImpl userContext, GenericFormPage requestData, ChangeRequest dbCrData,
                                       CRFieldSpec fieldSpec, CRGroupData groupData, CRFieldData fieldData) throws Exception{
        // by default, nothing need do here
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

	protected ErrorMessageException wrapTo${projectName?cap_first}Exception(ChangeRequestPostData postedData, String msg) {
		ErrorMessageException exception = new ErrorMessageException(msg);
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
		case ${helper.NameAsThis(scopeName)}CR.ACTION_COMMIT:
		case ${helper.NameAsThis(scopeName)}CR.ACTION_NEXT_STEP:
		case ${helper.NameAsThis(scopeName)}CR.ACTION_NEXT_RECORD:
		case ${helper.NameAsThis(scopeName)}CR.ACTION_DELETE_RECORD:
			break;
		case ${helper.NameAsThis(scopeName)}CR.ACTION_PREV_STEP:
		case ${helper.NameAsThis(scopeName)}CR.ACTION_PREV_RECORD:
		default:
			// 这些情况不需要保存提交的数据
			return;
		}
		
		CRSpec crSpec = CR(postedData.getChangeRequestType());
		if (postedData.getVerifyMessage() != null && postedData.getVerifyMessage().size()>0) {
			String msg = SCENE(crSpec, postedData.getSceneCode()).getTitle()+"输入参数错误";
			throw wrapTo${projectName?cap_first}Exception(postedData, msg);
		}
		if (${helper.NameAsThis(scopeName)}CR.ACTION_DELETE_RECORD.equals(postedData.getActionCode())){
            CRGroupSpec groupSpec = GROUP_SPEC(postedData.getActionGroup());
            deleteEvent(groupSpec, postedData.getChangeRequestId(), postedData.getRecordId());
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
			if (groupSpec.getName().equals(postedData.getActionGroup()) && ${helper.NameAsThis(scopeName)}CR.ACTION_DELETE_RECORD.equals(postedData.getActionCode())) {
				// deleteGroup(groupSpec, postedData.getChangeRequestId(),fieldValues);
				continue;
			}
			String crId = postedData.getChangeRequestId();
			switch (groupSpec.getName()) {
<#list projectSpec.changeRequestList as crSpec>
	<#list crSpec.stepList as scene>
		<#list scene.eventList as group>
			case ${helper.NameAsThis(scopeName)}CR.${helper.JAVA_CONST(crSpec.changeRequestType)}.SCENE_${helper.JAVA_CONST(scene.name)}.GROUP_${helper.JAVA_CONST(group.name)}.NAME:
				save${helper.CamelName(crSpec.changeRequestType)}${helper.CamelName(scene.name)}${helper.CamelName(group.name)}(crId, crSpec.getChangeRequestType(), fieldValues,currentUserInfo);
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
		deleteEvent(groupSpec, crId, id);
    }

    protected void deleteEvent(CRGroupSpec groupSpec, String crId, String eventId) throws Exception {
		EventInfoInCr eiic = getEventInfoInCr(crId);
        Map<String, EventInfo> eventsInfo = getEventInfoMapFrom(eiic.getEventsInfo());
		switch (groupSpec.getName()) {
<#list projectSpec.changeRequestList as crSpec>
	<#list crSpec.stepList as scene>
		<#list scene.eventList as group>
			case ${helper.NameAsThis(scopeName)}CR.${helper.JAVA_CONST(crSpec.changeRequestType)}.SCENE_${helper.JAVA_CONST(scene.name)}.GROUP_${helper.JAVA_CONST(group.name)}.NAME:{
				Event${helper.CamelName(group.eventType)} event = getUserContext().getDAOGroup().getEvent${helper.CamelName(group.eventType)}DAO().load(eventId, EO);
				getUserContext().getManagerGroup().getChangeRequestManager().removeEvent${helper.CamelName(group.eventType)}(getUserContext(), crId, eventId, event.getVersion(), new String[]{});
				removeEventInfoFromCR(eventsInfo, event.getInternalType()+"_"+event.getId());
			}
				break;
		</#list>
	</#list>
</#list>
			default:
				break;
		}
		eiic.updateEventsInfo(DebugUtil.dumpAsJson(eventsInfo, false));
        getUserContext().getManagerGroup().getEventInfoInCrManager().internalSaveEventInfoInCr(getUserContext(), eiic, EO);
	}

    protected void removeEventInfoFromCR(Map<String, EventInfo> eventsInfo, String eventKey) {
		if (eventsInfo != null && eventKey != null) {
			eventsInfo.remove(eventKey);
		}
	}
<#list projectSpec.changeRequestList as crSpec>
	<#list crSpec.stepList as scene>
		<#list scene.eventList as group>
	protected void save${helper.CamelName(crSpec.changeRequestType)}${helper.CamelName(scene.name)}${helper.CamelName(group.name)}(String crId, String crType, List<Map<String, Object>> fieldValues, BaseEntity currentUserInfo) throws Exception {
		if (fieldValues == null || fieldValues.isEmpty()) {
			return;
		}
		for(Map<String, Object> fieldValue: fieldValues) {
			String id = (String) fieldValue.get("id");
			<#--
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
				String fieldGroup = ${helper.NameAsThis(scopeName)}CR.${helper.JAVA_CONST(crSpec.changeRequestType)}.SCENE_${helper.JAVA_CONST(scene.name)}.GROUP_${helper.JAVA_CONST(group.name)}.NAME; //"${helper.javaVar(scene.name)}_${helper.javaVar(group.name)}";
				String eventInitiatorType = currentUserInfo.getInternalType();
				String eventInitiatorId = currentUserInfo.getId();
				String changeRequestId = crId;
				BaseEntity eventRcd = getUserContext().getManagerGroup().getEvent${helper.CamelName(group.eventType)}Manager()
					.createEvent${helper.CamelName(group.eventType)}(getUserContext(),<@compress single_line=true>
			<#list group.fieldList as field>
				<#if field.interactionMode == "display">
					<#continue>
				</#if>
				${helper.javaVar(field.name)},
			</#list>
			</@compress> changeRequestId);
				updateEventInfoInCR(getUserContext(), changeRequestId, crType, eventRcd, fieldGroup, eventInitiatorType, eventInitiatorId);
			}else{
			-->
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
			//}
		}
	}
		</#list>
	</#list>
</#list>

    protected EventInfoInCr updateEventInfoInCR(Custom${projectName?cap_first}UserContextImpl ctx, String changeRequestId, String crType, BaseEntity eventRcd,
                                                String fieldGroup, String eventInitiatorType, String eventInitiatorId) throws Exception{

        SmartList<EventInfoInCr> crList = ctx.getDAOGroup().getEventInfoInCrDAO().findEventInfoInCrByChangeRequest(changeRequestId, EO);
        if (crList != null && crList.size() > 1){
            // 删除自动生成的不合理数据
            ctx.getDAOGroup().getEventInfoInCrDAO().removeEventInfoInCrList(crList, EO);
            crList = null;
        }
        if (crList == null || crList.isEmpty()){
            EventInfo eventInfo = new EventInfo(eventRcd.getInternalType(), eventRcd.getId(), fieldGroup);
            String eventsInfoStr = DebugUtil.dumpAsJson(MapUtil.put(eventRcd.getInternalType()+"_"+eventRcd.getId(), eventInfo).into_map(), false);
            return ctx.getManagerGroup().getEventInfoInCrManager().createEventInfoInCr(ctx, changeRequestId, crType, STATUS_OPENING,
                        eventInitiatorType, eventInitiatorId, eventsInfoStr);
        }else{
            EventInfoInCr eiicRcd = crList.first();
            EventInfo eventInfo = new EventInfo(eventRcd.getInternalType(), eventRcd.getId(), fieldGroup);
            updateOrAddOneEventInfo(eiicRcd, eventInfo);
            return ctx.getManagerGroup().getEventInfoInCrManager().internalSaveEventInfoInCr(ctx, eiicRcd, EO);
        }
    }

    protected void updateOrAddOneEventInfo(EventInfoInCr eiicRcd, EventInfo eventInfo) throws Exception {
        if (TextUtil.isBlank(eiicRcd.getEventsInfo())) {
            Map<String, EventInfo> eventsInfo = MapUtil.put(eventInfo.getEventType()+"_"+eventInfo.getEventId(), eventInfo).into_map(EventInfo.class);
            eiicRcd.updateEventsInfo(DebugUtil.dumpAsJson(eventsInfo, false));
            return;
        }
        Map<String, EventInfo> eventsInfo = DebugUtil.getObjectMapper().readValue(eiicRcd.getEventsInfo(),
                new TypeReference<Map<String, EventInfo>>(){});
        if (eventsInfo == null){
            eventsInfo = new HashMap<>();
        }
        eventsInfo.put(eventInfo.getEventType()+"_"+eventInfo.getEventId(),eventInfo);
        eiicRcd.updateEventsInfo(DebugUtil.dumpAsJson(eventsInfo, false));
    }

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
        List<Object> params = prepareParamsForQueryCandidatesBySpec(groupData, fieldData, fieldSpec);
        String modelType = TextUtil.toCamelCase(fieldSpec.getModelName());
        return queryCandidatesForModel(groupData, fieldData, fieldSpec, modelType, params);
    }
    protected Object queryCandidatesForModel(CRGroupData groupData, CRFieldData fieldData, CRFieldSpec fieldSpec, String modelType, List<Object> params) {
        try {
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
            if (((Map) val).containsKey("title")) {
                return (String) ((Map) val).get("title");
            }
            if (((Map) val).containsKey("name")) {
                return (String) ((Map) val).get("name");
            }
        }
        if (val instanceof BaseEntity) {
            return ((BaseEntity)val).getDisplayName();
        }
        return null;
    }
    @Override
    protected String getCandidateDataValue(CRFieldSpec fieldSpec, Object val) {
        if (val instanceof Map) {
            if (((Map) val).containsKey("id")) {
                return (String) ((Map) val).get("id");
            }
            if (((Map) val).containsKey("key")) {
                return (String) ((Map) val).get("key");
            }
            if (((Map) val).containsKey("value")) {
                return (String) ((Map) val).get("value");
            }
        }
        if (val instanceof BaseEntity) {
            return ((BaseEntity)val).getId();
        }
        return null;
    }

<#--
    protected Object calcSuggestedDefaultValue(String groupName, CRFieldSpec fieldSpec, Object defaultValue){
        if (TextUtil.isBlank(fieldSpec.getAutoFillExpression())){
            return defaultValue;
        }
        List<String> afeList = AutoFillUtil.splitAutoFillExpression(fieldSpec.getAutoFillExpression());
        return pickAutoFillValueByExpression(afeList, userContext);
    }

    protected Object pickAutoFillValueByExpression(List<String> afeList, Object contextObject) {
        String key = "afe_expression_" + String.join(".", afeList);
        if (userContext.getContextLocalStorage().containsKey(key)){
            return userContext.getFromContextLocalStorage(key);
        }
        if (afeList.size() == 1) {
            return pickValueFromContextObject(afeList.get(0), contextObject);
        }
        Object parentContextObject = pickAutoFillValueByExpression(afeList.subList(0, afeList.size()-1), contextObject);
        return pickValueFromContextObject( afeList.get(0), parentContextObject);
    }
-->
    // 暂时来说, 应该是 postedData 不存在,或者postData里的action是 下一条/下一步 才推断要填的值. 暂时先不考虑这个.
    protected Object calcSuggestedDefaultValue(String groupName, CRFieldSpec fieldSpec, Object defaultValue) throws Exception{
        switch (fieldSpec.getName()){
<#list helper.getGroupListWhichHasAutoFillExpression(projectSpec) as crSpec>
	<#list crSpec.stepList as scene>
		<#list scene.eventList as group>
		    <#list group.fieldList as field>
		           <#assign field_name_const = "${helper.NameAsThis(scopeName)}CR."+helper.JAVA_CONST(crSpec.changeRequestType)+".FIELD_"+helper.NAME_AS_THIS(field.name)+"_IN_"+helper.JAVA_CONST(group.name)+"_OF_"+helper.JAVA_CONST(scene.name)/>
		        <#if helper.canFillFromRequest(field)>
		case ${field_name_const}: // from request
		    if (TextUtil.isBlank(userContext.get${helper.NameAsThis(field.autoFillExpression?substring(10))}())) {
		        return defaultValue;
		    }
		    return userContext.get${helper.NameAsThis(field.autoFillExpression?substring(10))}();
		        </#if>
		        <#if helper.canFillFromRequestObject(field)>
        case ${field_name_const}:   // from request object
            return ${helper.getFillFromRequestCode(projectName, field)};
                </#if>
		        <#if helper.canFillFromSubmitted(field)>
		case ${field_name_const}: { // from submitted
            ${helper.getFillFromSubmittedCode(projectName, field)}
        }
                 </#if>
                 <#if helper.canFillFromSubmittedMember(field)>
        case ${field_name_const}: { // from submitted member
            ${helper.getFillFromSubmittedMemberCode(projectName, field)}
        }
                  </#if>
            </#list>
		</#list>
	</#list>
</#list>
        default:
		    break;
		}
		return defaultValue;
	}
	protected Object getFieldValueWhenFillResponse(Object suggestValue,
          GenericFormPage requestData, ChangeRequest changeRequest, CRGroupData groupData,
          CRFieldSpec fieldSpec) throws Exception {
        return suggestValue;
      }

    protected Object getFieldCandidatesWhenFillResponse(GenericFormPage requestData, ChangeRequest changeRequest, CRGroupData groupData,
          CRFieldSpec fieldSpec, CRFieldData fieldData) throws Exception {
        return makeFieldCandidateValues(groupData, fieldData, fieldSpec);
    }

    protected void setFieldSpecInfo(ChangeRequestProcessingContext crContext, ChangeRequest dbCrData, CRGroupData groupData,
                CRFieldData fieldData, String processUrl) throws Exception {
        CRSpec crSpec = crContext.getCrSpec();
        GenericFormPage requestData = crContext.getRequestData();
        CRFieldSpec fieldSpec = crContext.getFieldSpec();

        fieldData.setRequired(fieldSpec.getRequired());
        fieldData.setDisabled(!fieldSpec.getInteractionMode().equals("input"));
        // fieldData.setCandidateValuesApi(formatApiUrl(fieldSpec.getValuesRetrieveApi()));
        fieldData.setMinimum(fieldSpec.getMinimum());
        fieldData.setMaximum(fieldSpec.getMaximum());
        fieldData.setRules(getFiledRules(fieldSpec));
        fieldData.setInline(fieldSpec.isInline());
        fieldData.setLinkToUrl(formatApiUrl(fieldSpec.getValuesRetrieveApi()));
        if (fieldData.isDisabled()) {
            fieldData.setRequired(false);
        }
        if (fieldSpec.getOnChange() != null) {
            fieldData.setOnChangeLinkToUrl(makeFieldChangeUrl(crContext, processUrl, fieldData.getName()));
        }

        fieldData.setType(fieldSpec.getUiStyle());
        if (fieldData.getType().equals("prompt-message")){
            fieldData.setType("display-field");
            fieldData.setValue(makePromptValue(String.valueOf(fieldData.getValue())));
            fieldData.setRules(null);
        }
        fieldData.setRequired(fieldSpec.getRequired());
        fieldData.setHidden(fieldSpec.getUiStyle().equals("hidden"));
        String url = fillRequestParameters(crContext, fieldSpec, groupData, fieldData);
        if (!TextUtil.isBlank(url)){
            fieldData.setSearchAction(new VComponentAction().code("search")
                    .title(fieldSpec.getTipsContent()==null?"搜索":fieldSpec.getTipsContent())
                    .linkToUrl(url)
            );
            fieldData.setLinkToUrl(url.replace(":keyword","+"));
        }

        fieldData.setCandidateValues(
                convertToUiCandidateValues(fieldSpec,
                    getFieldCandidatesWhenFillResponse(requestData, dbCrData, groupData, fieldSpec, fieldData)));
        fieldData.setLabel(fieldSpec.getLabel());
        fieldData.setPlaceholder(fieldSpec.getPlaceholder() == null ? "请输入" : fieldSpec.getPlaceholder());
        fieldData.setTipsTitle(fieldSpec.getTipsTitle());
        fieldData.setTipsContent(fieldSpec.getTipsContent());
        fieldData.setIcon(fieldSpec.getIcon());

        fieldData.setMultiple(CRFieldSpec.MULTI_SELECTABLE.equals(fieldSpec.getSelectable()));

        //	所有数据填充完毕后的一些处理
        updateFieldCandidateValueSelected(fieldData, fieldSpec);
    }

    protected void fulfillExistsGroupData(ChangeRequestProcessingContext crContext, ChangeRequest dbCrData, CRGroupData groupData,
			SmartList<? extends BaseEntity> eventList, int groupRecordIndex, int showPrevious, int showNext) throws Exception {
		fulfillPreviousGroupData(crContext, dbCrData, groupData, eventList, groupRecordIndex, showPrevious);
		fulfillNextGroupData(crContext, dbCrData, groupData, eventList, groupRecordIndex, showNext);
	}

	protected void fulfillPreviousGroupData(ChangeRequestProcessingContext crContext, ChangeRequest dbCrData, CRGroupData groupData,
			            SmartList<? extends BaseEntity> eventList, int groupRecordIndex, int showRecordCnt) throws Exception {
		if (showRecordCnt == 0){
			return;
		}
		CRSpec crSpec = crContext.getCrSpec();
        GenericFormPage requestData = crContext.getRequestData();
        List<CRFieldSpec> fieldSpecList = crSpec.getFieldList();
		List<Object> existsRecordList = new ArrayList<>();
		for(int i=0;i<eventList.size();i++){
			if (!shouldShowPreviousRecord(i+1,groupRecordIndex, showRecordCnt)){
				continue;
			}
			Object value = makeExistsRecordForShowInList(i+1,groupData.getName(), fieldSpecList, eventList.get(i).keyValuePairOf());
			existsRecordList.add(value);
		}
		groupData.addPreviousExistsInList(existsRecordList);
	}

	protected void fulfillNextGroupData(ChangeRequestProcessingContext crContext, ChangeRequest dbCrData, CRGroupData groupData,
			           SmartList<? extends BaseEntity> eventList, int groupRecordIndex, int showRecordCnt) throws Exception {
		if (showRecordCnt == 0){
			return;
		}
		CRSpec crSpec = crContext.getCrSpec();
        GenericFormPage requestData = crContext.getRequestData();
        List<CRFieldSpec> fieldSpecList = crSpec.getFieldList();
		List<Object> existsRecordList = new ArrayList<>();
		for(int i=0;i<eventList.size();i++){
			if (!shouldShowNextRecord(i+1,groupRecordIndex, showRecordCnt)){
				continue;
			}
			Object value = makeExistsRecordForShowInList(i+1, groupData.getName(), fieldSpecList, eventList.get(i).keyValuePairOf());
			existsRecordList.add(value);
		}
		groupData.addNextExistsInList(existsRecordList);
	}

	protected Object makeExistsRecordForShowInList(
    			int idx, String groupName, List<CRFieldSpec> fieldSpecList, List<KeyValuePair> keyValuePairOf)
    			throws Exception {
        List<Map<String, Object>> fieldValues = new ArrayList<>();
        //		fieldValues.add(MapUtil.put("id", idx)
        //				.put("title", "序号")
        //				.put("value", idx)
        //				.into_map());
        for (CRFieldSpec crFieldSpec : fieldSpecList) {
            if (!crFieldSpec.getName().startsWith(groupName)) {
                continue;
            }
            if (!crFieldSpec.getInteractionMode().equalsIgnoreCase("input")) {
                continue; // 不是手工填写的字段, 直接忽略
            }

            for (KeyValuePair keyValuePair : keyValuePairOf) {
                String name = keyValuePair.getKey();
                if (crFieldSpec.getName().endsWith("_" + name)) {
                    fieldValues.add(MapUtil.put("id", name)
                            .put("title", crFieldSpec.getLabel())
                            .put("value", TO_VALUE(keyValuePair.getValue(),crFieldSpec))
                            .into_map()
                    );
                    break;
                }
            }
        }
        return MapUtil.put("id", idx).put("title", idx+"").put("displayMode", "card")
                .put("infoList", fieldValues).into_map();
    }
}
