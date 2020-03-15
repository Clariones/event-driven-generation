package com.${orgName?lower_case}.${projectName?lower_case};

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.${orgName?lower_case}.${projectName?lower_case}.changerequest.ChangeRequest;
import com.terapico.caf.appview.CRFieldData;
import com.terapico.caf.appview.CRGroupData;
import com.terapico.caf.appview.CRSceneData;
import com.terapico.caf.appview.ChangeReqeuestData;
import com.terapico.changerequest.BaseChangeRequestHelper;
import com.terapico.changerequest.CRFieldSpec;
import com.terapico.changerequest.CRGroupSpec;
import com.terapico.changerequest.CRSpec;

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

	// 根据定位信息,组装一个 cr 的response
	public ChangeReqeuestData assemblerChangeRequstResponse(BaseEntity currentUserInfo, String crType, String sceneCode)
			throws Exception {
		// 先拿到CR spec
		CRSpec crSpec = CR(crType);
		// 再根据scene code, 找到有哪几个group的spec被需要
		List<CRGroupSpec> groupSpecList = GROUPS(crSpec, sceneCode);
		// 再用这些Group spec, 找到系统中相关的已经存在的cr和event数据
		ChangeRequest cr = loadCrDataByGroups(crType, currentUserInfo, groupSpecList);
		// 然后根据需要,补足fields,填充field的默认值
		ChangeReqeuestData crData = fulfillChangeRequestFields(cr, crSpec, sceneCode, groupSpecList);
		// 最后要交给业务模块,让业务模块有机会修正准备好的数据: 目前用返回值给业务模块来实现,没做回调
		// adjustChangeRequestResponse(cr, crSpec, sceneCode, groupSpecList);
		return crData;
	}
	// 根据 group spec list, 把这个cr装满
	protected ChangeReqeuestData fulfillChangeRequestFields(ChangeRequest InputCR, CRSpec crSpec, String sceneCode,
			List<CRGroupSpec> groupSpecList) throws Exception {
		final ChangeRequest cr = ensureChangeRequest(InputCR, crSpec);
		// 先建立一个CR
		ChangeReqeuestData reuestData = new ChangeReqeuestData();
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
					.append(" E where E.change_request = CR.id and event_initiator=? and E.field_group=?) \n");
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

	protected void addHiddenField(ChangeReqeuestData reuestData, String fieldShortName, String value) {
		CRGroupData group = HIDDEN_GROUP(reuestData);
		CRFieldData fieldData = new CRFieldData();
		fieldData.setName(CR.GROUP_HIDDEN+"_"+fieldShortName);
		fieldData.setValue(value);
		group.addField(fieldData);
	}

	protected CRGroupData HIDDEN_GROUP(ChangeReqeuestData reuestData) {
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
			Object[] params = new Object[] {cr.id, group.getName(), 1000};
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
	protected void fulfillChangeRequestField(ChangeReqeuestData reuestData, ChangeRequest dbCrData, CRGroupData groupData, CRGroupSpec groupSpec,
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
	
	protected void fulfillChangeRequestFieldByGroup(ChangeReqeuestData reuestData, ChangeRequest dbCrData,
			CRGroupData groupData, List<CRFieldSpec> fieldSpecList, SmartList<? extends BaseEntity> eventList) {
		if (eventList == null || eventList.isEmpty()) {
			fullFillNewFields(groupData, fieldSpecList);
			return;
		}
		boolean foundAny = false;
		for(int i=0;i<eventList.size();i++) {
			BaseEntity evtData = eventList.get(i);
			List<KeyValuePair> kvList = evtData.keyValuePairOf();
			Object fieldGroup = kvList.stream().filter(entry->entry.getKey().equals("fieldGroup")).findAny().orElse(null);
			if (fieldGroup == null || !fieldGroup.equals(groupData.getName())) {
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
					Object value = kvList.stream().filter(entry->entry.getKey().equals(memberName)).findAny().orElse(null);
					if (value == null) {
						fieldData.setValue(TO_VALUE(fieldSpec.getDefaultValue()));
					}else {
						fieldData.setValue(TO_VALUE(value));
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

}
