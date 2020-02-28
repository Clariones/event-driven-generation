package com.terapico.changerequest.builder;

import java.io.Serializable;

import com.terapico.changerequest.spec.ProjectChangeRequestSpec;

import cla.edg.Utils;

public class ChangeRequestSpecBaseBuilder<T extends ChangeRequestSpecBaseBuilder<T>>
		extends  ChangeRequestSpecBuilderUtil{
	protected T me;

	@SuppressWarnings("unchecked")
	protected T new_project(String projectName) {
		service = getBuildingService();
		workingBoard = new WorkingBoard();
		service.createNewProject(projectName);
		workingBoard.onProject(projectName);
		me = (T) this;
		return me;
	}

	protected ChangeRequestSpecBuildingService getBuildingService() {
		// 目前在本地执行,直接new
		return new ChangeRequestSpecBuildingServiceLocalImpl();
	}

	public ProjectChangeRequestSpec getChangeRequestSpec() {
		return service.getProjectChangeRequestSpec();
	}

	public T change_request(String crTypeName) {
		if (service.checkChangeRequestExists(crTypeName)) {
			error("ChangerRequest " + crTypeName + " 的定义已存在");
		}
		service.createNewChangeRequest(crTypeName);
		workingBoard.onChangeRequest(crTypeName);
		return me;
	}

	public T range(Serializable... rangeArgs) {
		if(workingBoard.isBuildingField()) {
			service.setFieldRange($CR(),$STEP(),$EVENT(),$FIELD(), rangeArgs);
			workingBoard.onJob(WorkingBoard.RANGE);
		}else {
			error("此时不能指定范围");
		}
		return me;
	}

	public T place_holder(String text) {
		if(workingBoard.isBuildingField()) {
			service.setFieldPlaceholder($CR(),$STEP(),$EVENT(),$FIELD(), text);
			workingBoard.onJob(WorkingBoard.PLACEHOLDER);
		}else {
			error("只有字段才能指定placeholder");
		}
		return me;
	}

	public T tips_title(String text) {
		if(workingBoard.isBuildingField()) {
			service.setFieldTipsTitle($CR(),$STEP(),$EVENT(),$FIELD(), text);
			workingBoard.onJob(WorkingBoard.TIPS_TITLE);
		}else {
			error("只有字段才能指定tips标题");
		}
		return me;
	}

	public T tips_content(String text) {
		if(workingBoard.isBuildingField()) {
			service.setFieldTipsContent($CR(),$STEP(),$EVENT(),$FIELD(), text);
			workingBoard.onJob(WorkingBoard.TIPS_CONTENT);
		}else {
			error("只有字段才能指定tips内容");
		}
		return me;
	}

	public T which_type_of(FieldType type) {
		if(workingBoard.isBuildingField()) {
			service.setFieldInputType($CR(),$STEP(),$EVENT(),$FIELD(), type);
			workingBoard.onJob(WorkingBoard.INPUT_TYPE);
		}else {
			error("目前只有字段才能指定 type");
		}
		return me;
	}

	
	public T has_values(String key, Serializable value, boolean keyIsBoolean) {
		if(workingBoard.isBuildingField()) {
			service.addFieldValueMapping($CR(),$STEP(),$EVENT(),$FIELD(), key, value);
			service.setFieldSelectable($CR(),$STEP(),$EVENT(),$FIELD(), true, true);
			if (keyIsBoolean) {
				service.setFieldInputType($CR(),$STEP(),$EVENT(),$FIELD(), FieldType.BOOLEAN);
			}
			workingBoard.onJob(WorkingBoard.SET_VALUE_MAPPING);
		}else {
			error("只有字段才能指定 values");
		}
		return me;
	}

	public T and_more_value(String key, Serializable value, boolean keyIsBoolean) {
		if(workingBoard.isBuildingField()) {
			if(workingBoard.getCurrentJobName().equals(WorkingBoard.SET_VALUE_MAPPING)) {
				service.addFieldValueMapping($CR(),$STEP(),$EVENT(),$FIELD(), key, value);
				service.setFieldSelectable($CR(),$STEP(),$EVENT(),$FIELD(), true, true);
				workingBoard.onJob(WorkingBoard.MORE_VALUE_MAPPING);
			}else if(workingBoard.getCurrentJobName().equals(WorkingBoard.MORE_VALUE_MAPPING)){
				if (!service.isFieldMultiSelectable($CR(),$STEP(),$EVENT(),$FIELD())) {
					error("当前字段已经推断为'单选',使用and表示它可能是多选,请检查您的业务规则再决定是 and 还是 or");
				}
				service.addFieldValueMapping($CR(),$STEP(),$EVENT(),$FIELD(), key, value);
			}else {
				error("此时不支持使用 and");
			}
			if (keyIsBoolean) {
				service.setFieldInputType($CR(),$STEP(),$EVENT(),$FIELD(), FieldType.BOOLEAN);
			}
		}else {
			error("只有字段才能指定 values");
		}
		return me;
	}
	public T or_another_value(String key, Serializable value, boolean keyIsBoolean) {
		if(workingBoard.isBuildingField()) {
			if(workingBoard.getCurrentJobName().equals(WorkingBoard.SET_VALUE_MAPPING)) {
				service.addFieldValueMapping($CR(),$STEP(),$EVENT(),$FIELD(), key, value);
				service.setFieldSelectable($CR(),$STEP(),$EVENT(),$FIELD(), true, false);
				workingBoard.onJob(WorkingBoard.MORE_VALUE_MAPPING);
			}else if(workingBoard.getCurrentJobName().equals(WorkingBoard.MORE_VALUE_MAPPING)){
				if (service.isFieldSingleSelectable($CR(),$STEP(),$EVENT(),$FIELD())) {
					error("当前字段已经推断为'多选',使用or表示它应该是单选,请检查您的业务规则再决定是 and 还是 or");
				}
				service.addFieldValueMapping($CR(),$STEP(),$EVENT(),$FIELD(), key, value);
			}else {
				error("此时不支持使用 or");
			}
			if (keyIsBoolean) {
				service.setFieldInputType($CR(),$STEP(),$EVENT(),$FIELD(), FieldType.BOOLEAN);
			}
		}else {
			error("只有字段才能指定 values");
		}
		return me;
	}

	public T defaule_value(Serializable defaultValue) {
		if(workingBoard.isBuildingField()) {
			service.setFieldDefaultValue($CR(),$STEP(),$EVENT(),$FIELD(), defaultValue);
			workingBoard.onJob(WorkingBoard.DEFAULT_VALUE);
		}else {
			error("目前只有字段才能指定缺省值");
		}
		return me;
	}

	public T value(Serializable forceValue) {
		if(workingBoard.isBuildingField()) {
			service.forceFieldValue($CR(),$STEP(),$EVENT(),$FIELD(), forceValue);
			workingBoard.onJob(WorkingBoard.FORCE_VALUE);
		}else {
			error("此时不能指定值");
		}
		return me;
	}

	public T as(String name) {
		switch (workingBoard.currentWorkingLevel()) {
		case WorkingBoard.EVENT:
			service.renameEvent($CR(), $STEP(), $EVENT(), name);
			workingBoard.onEvent(name);
			break;
		default:
			error("只有描述 Event 时,才能重新命名");
		}
		return me;
	}

	public T for_field(String fieldName) {
		// 现在开始建立 field.
		// 如果 现在还在建立 changRequest, 那么自动建立 step 和 event
		// 如果 现在还在建立 step, 那么自动建立 event
		
		if (workingBoard.getCurrentEventName() == null) {
			if(workingBoard.isBuildingChangeRequest()) {
				String stepName = service.createDefaultStepByChangeRequest($CR());
				workingBoard.onStep(stepName);
			}
			if (workingBoard.isBuildingStep()) {
				String eventTempName = service.addEventIntoStep($CR(), $STEP(), $STEP());
				service.renameEvent($CR(), $STEP(), eventTempName, $STEP());
				workingBoard.onEvent($STEP());
			}
			if (workingBoard.getCurrentEventName() == null) {
				error("只有在Event内才能描述Field");
			}
		}
		if (service.checkFieldExists($CR(),$STEP(),$EVENT(),fieldName)) {
			// 找到就算了
		}else {
			service.createNewField($CR(),$STEP(),$EVENT(),fieldName);
			service.setFieldInputType($CR(),$STEP(),$EVENT(),fieldName, FieldType.TEXT);
			service.clearPrototypeEventSetTag($CR(),$STEP(),$EVENT(),fieldName, "inputType");
			service.setFieldInteractionMode($CR(),$STEP(),$EVENT(),fieldName, "input");
			service.clearPrototypeEventSetTag($CR(),$STEP(),$EVENT(),fieldName, "interactionMode");
		}
		workingBoard.onField(fieldName);
		return me;
	}

	public T values_can_get_from(String apiUrl) {
		if(workingBoard.isBuildingField()) {
			service.setFieldValuesRetrieveApi($CR(),$STEP(),$EVENT(),$FIELD(), apiUrl);
			workingBoard.onJob(WorkingBoard.VALUES_API);
		}else {
			error("只有Field支持设定数据接口");
		}
		return me;
	}

	protected T step(int stepIdx, String stepName) {
		if (workingBoard.getCurrentChangeRequestName() == null) {
			error("只能在描述CR时指定Step");
		}
		if(service.checkStepExists($CR(), stepName)) {
			error("Step " + stepName+" 已经在"+$CR()+"中定义过.");
		}
		service.createNewStep($CR(), stepIdx, stepName);
		workingBoard.onStep(stepName);
		log("新建 Step:"+$STEP());
		return me;
	}


	public T contains_event(String eventName) {
		if (workingBoard.getCurrentStepName() == null) {
			// 如果当前不是 Step, 直接event, 那么说明要建立一个默认的,名字和 CR 一样的 Step
			String stepName = service.createDefaultStepByChangeRequest($CR());
			workingBoard.onStep(stepName);
		}
		if (workingBoard.getCurrentStepName() == null) {
			System.out.println(Utils.toJson(workingBoard, true));
			error("只有在Step中才能描述vent");
		}
		String eventTempName = service.addEventIntoStep($CR(), $STEP(), eventName);
		workingBoard.onEvent(eventTempName);
		return me;
	}

	protected T i18n(String localeCode, String text) {
		switch (workingBoard.currentWorkingLevel()) {
		case WorkingBoard.FIELD:
			service.addFieldI18n($CR(), $STEP(), $EVENT(), $FIELD(), localeCode, text);
			break;
		case WorkingBoard.EVENT:
			service.addEventI18n($CR(), $STEP(), $EVENT(), localeCode, text);
			break;
		case WorkingBoard.STEP:
			service.addStepI18n($CR(), $STEP(), localeCode, text);
			break;
		case WorkingBoard.CHANGE_REQUEST:
			service.addChangeRequestI18n($CR(), localeCode, text);
			break;
		default:
			error("只有描述 CR,Step,Event或者Field时,才能指定" + localeCode + "的文本");
		}
		return me;
	}

	protected T is_required(boolean required) {
		if (workingBoard.isBuildingField()) {
			service.setFieldRequired($CR(),$STEP(),$EVENT(),$FIELD(), required);
			workingBoard.onJob(WorkingBoard.REQUIRED);
		}else if (workingBoard.isBuildingEvent()) {
			service.setEventRequired($CR(),$STEP(),$EVENT(), required);
		}else if(workingBoard.isBuildingStep()) {
			service.setStepRequired($CR(),$STEP(), required);
		}else {
			error("此时不能指定'是否必须'");
		}
		return me;
	}

	protected T interaction_mode(String mode) {
		if (workingBoard.isBuildingField()) {
			service.setFieldInteractionMode($CR(),$STEP(),$EVENT(),$FIELD(), mode);
			workingBoard.onJob(WorkingBoard.INTERACTION_MODE);
			return me;
		}
		error("不支持在此时设置字段的交互模式");
		return null; // 如果走到这里了,直接异常
	}

	public T required_times(int min, int max) {
		switch (workingBoard.currentWorkingLevel()) {
		case WorkingBoard.EVENT:
			service.setEventRepeatTimes($CR(), $STEP(), $EVENT(), min, max);
			break;
		default:
			error("只有描述 Event 才能指定数量范围");
		}
		return me;
	}
	
	
	public T only_one() {
		switch (workingBoard.currentWorkingLevel()) {
		case WorkingBoard.EVENT:
			service.setEventOnlyonce($CR(), $STEP(), $EVENT());
			break;
		default:
			error("只有描述 Event 才能指定只用1次");
		}
		return me;
	}
}
