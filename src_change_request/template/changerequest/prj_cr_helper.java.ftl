package com.${orgName?lower_case}.${projectName?lower_case};

import java.util.ArrayList;
import java.util.List;

import com.${orgName?lower_case}.${projectName?lower_case}.changerequest.ChangeRequest;
import com.terapico.changerequest.BaseChangeRequestHelper;
import com.terapico.changerequest.CrGroupSpec;

<#list allEventSpec?keys as eventName>
	<#assign event=allEventSpec[eventName]/>
import com.${orgName?lower_case}.${projectName?lower_case}.event${helper.CamelName(event.eventType)?lower_case}.Event${helper.CamelName(event.eventType)};
import com.${orgName?lower_case}.${projectName?lower_case}.event${helper.CamelName(event.eventType)?lower_case}.Event${helper.CamelName(event.eventType)}Table;
</#list>

public class ${projectName?cap_first}ChangeRequestHelper extends BaseChangeRequestHelper{
	protected ${projectName?cap_first}UserContextImpl userContext;
	
	
	public ${projectName?cap_first}UserContextImpl getUserContext() {
		return userContext;
	}


	public void setUserContext(${projectName?cap_first}UserContextImpl userContext) {
		this.userContext = userContext;
	}


	protected void loadCrSpec() throws Exception {
		loadCrSpecFromJar("/META_INF/${projectName?lower_case}_cr_spec.json");
	}


	protected Object toEventTableName(String orginalName) {
		return "event_" + (orginalName.trim().replace(' ', '_').toLowerCase())+"_data";
	}


	protected ChangeRequest loadCrDataByGroups(String crType, BaseEntity currentUserInfo, List<CrGroupSpec> groupSpecList) throws Exception {
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
			sb.append(" exists (select * from ").append(toEventTableName(group.getOrginalName()))
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


	protected void enhanceChangeRequest(ChangeRequest cr, List<CrGroupSpec> groupSpecList) throws Exception{
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
	protected void enhance${helper.CamelName(crSpec.changeRequestType)}ChangeRequest(ChangeRequest cr, List<CrGroupSpec> groupSpecList) throws Exception{
		groupSpecList.forEach(group->{
			Object[] params = new Object[] {cr.id, group.getName(), 1000};
			String sql = "select * from " + toEventTableName(group.getOrginalName()) + " E where E.change_request=? " + 
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
	
}
