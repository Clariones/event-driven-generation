package com.terapico.changerequest.builder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import clariones.tool.builder.Utils;
import com.terapico.changerequest.builder.OutputName.CHANGE_REQUEST;
import com.terapico.changerequest.builder.OutputName.CHANGE_REQUEST.STEP;
import com.terapico.changerequest.builder.OutputName.CHANGE_REQUEST.STEP.EVENT;
import com.terapico.changerequest.builder.OutputName.CHANGE_REQUEST.STEP.EVENT.FIELD;
import com.terapico.changerequest.spec.ChangeRequestSpec;
import com.terapico.changerequest.spec.EventSpec;
import com.terapico.changerequest.spec.FieldSpec;
import com.terapico.changerequest.spec.ProjectChangeRequestSpec;
import com.terapico.changerequest.spec.StepSpec;

public abstract class CRSBuildingServiceBaseLocalImpl implements ChangeRequestSpecBuildingService {
	protected ProjectChangeRequestSpec projectSpec;
	protected Map<String, String> config;
	protected static final AtomicLong eventCount = new AtomicLong(0);

	protected void error(String message) {
		throw new RuntimeException(message);
	}

	public Map<String, String> getConfig() {
		return config;
	}

	@Override
	public void setConfig(Map<String, String> config) {
		this.config = config;
	}

	public ProjectChangeRequestSpec getProjectSpec() {
		return projectSpec;
	}
	public void setProjectSpec(ProjectChangeRequestSpec projectSpec) {
		this.projectSpec = projectSpec;
	}
	public ProjectChangeRequestSpec root() {
		if (projectSpec == null) {
			error("还没建立项目");
		}
		return projectSpec;
	}

	protected ChangeRequestSpec getChangeRequest(String crName) {
		if (projectSpec == null) {
			error("还没建立项目");
		}
		Map<String, ChangeRequestSpec> specs = projectSpec.getChangeRequestSpecs();
		if (specs == null) {
			return null;
		}
		return specs.get(crName);
	}
	protected StepSpec getStep(String crName, String stepName) {
		ChangeRequestSpec crSpec = getChangeRequest(crName);
		if (crSpec == null || crSpec.getStepSpecs() == null) {
			return null;
		}
		return crSpec.getStepSpecs().stream().filter(it->it.getName().equals(stepName)).findFirst().orElse(null);
	}
	protected EventSpec getEvent(String crName, String stepName, String eventName) {
		StepSpec stepSpec = getStep(crName, stepName);
		if (stepSpec == null || stepSpec.getEventSpecs() == null) {
			return null;
		}
		return stepSpec.getEventSpecs().stream().filter(it->it.getName().equals(eventName)).findFirst().orElse(null);
	}
	protected EventSpec getEvent(String eventType) {
		if (root().getAllEventSpecs() == null) {
			return null;
		}
		return root().getAllEventSpecs().get(eventType);
	}
	protected FieldSpec getField(String crName, String stepName, String eventName, String fieldName) {
		EventSpec eventSpec = getEvent(crName, stepName, eventName);
		if (eventSpec == null || eventSpec.getFieldSpecs() == null) {
			return null;
		}
		return eventSpec.getFieldSpecs().stream().filter(it->it.getName().equals(fieldName)).findFirst().orElse(null);
	}

	protected boolean isGlobalNewEvent(String eventType) {
		if (root().getAllEventSpecs() == null) {
			return true;
		}
		if (root().getAllEventSpecs().containsKey(eventType)) {
			return false;
		}
		return true;
	}

	protected String getTempEventName(String crName, String stepName, String eventType) {
		// 如果现有的events没有这个名字,默认用这个type作为名字
		ChangeRequestSpec crSpec = root().getChangeRequestSpecs().get(crName);
		if (crSpec == null || crSpec.getStepSpecs() == null){
			return eventType;
		}
		StepSpec stepSpec = crSpec.getStepSpecs().stream().filter(it -> it.getName().equals(stepName))
				.findFirst().orElse(null);
		if (stepSpec == null || stepSpec.getEventSpecs() == null){
			return eventType;
		}
		int exists = stepSpec.getEventSpecs().stream().map(it -> {
				if (it.getName().equals(eventType)){
					return 1;
				}
				if (it.getName().startsWith("evt_"+eventType+"_")){
					return 1;
				}
				return 0;
			}).reduce(0, Integer::sum);
		if (exists == 0){
			return eventType;
		}
		return String.format("evt_%s_%d", eventType, exists);

//		if (root().getChangeRequestSpecs().values().stream()
//				.flatMap(itStep->{
//					if (itStep.getStepSpecs() == null) {
//						return new ArrayList<StepSpec>().stream();
//					}
//					return itStep.getStepSpecs().stream();
//				})
//				.flatMap(itEvent->{
//					if (itEvent.getEventSpecs() == null) {
//						return new ArrayList<EventSpec>().stream();
//					}
//					return itEvent.getEventSpecs().stream();
//				})
//				.anyMatch(it->it.getName().equals(eventType))) {
//			return String.format("evt_%s_%d", eventType, eventCount.incrementAndGet());
//		}
//		return eventType;
	}

	protected FieldSpec sureField(String crName, String stepName, String eventName, String fieldName) {
		EventSpec eventSpec = this.getEvent(crName, stepName, eventName);
		FieldSpec spec = eventSpec.findField(fieldName);
		if (spec != null) {
			return spec;
		}
		//if (spec == null) 
		spec = eventSpec.getPrototype().findField(fieldName);
		if (spec == null) {
			error("还没有创建Field " + crName +"/"+ stepName +"/"+ eventName +"/"+ fieldName);
		}
		FieldSpec newSpec = spec.copy();
		eventSpec.addField(newSpec);
		return newSpec;
	}
	protected FieldSpec prototypeField(String crName, String stepName, String eventName, String fieldName) {
		return getEvent(getEvent(crName, stepName, eventName).getType()).findField(fieldName);
	}
	protected EventSpec sureEvent(String crName, String stepName, String eventName) {
		EventSpec spec = this.getEvent(crName, stepName, eventName);
		if (spec == null) {
			error("还没有创建Event " + crName +"/"+ stepName +"/"+ eventName);
		}
		return spec;
	}
	protected StepSpec sureStep(String crName, String stepName) {
		StepSpec spec = this.getStep(crName, stepName);
		if (spec == null) {
			error("还没有创建Step " + crName +"/"+ stepName);
		}
		return spec;
	}
	protected ChangeRequestSpec sureCR(String crName) {
		ChangeRequestSpec spec = this.getChangeRequest(crName);
		if (spec == null) {
			error("还没有创建ChangeRequest " + crName );
		}
		return spec;
	}

	protected Map<String, Object> makeOutput() {
		Map<String, Object> result = new HashMap<>();
		result.put(OutputName.NAME, root().getName());
		result.put(OutputName.TITLE, root().getTitle());
		result.put("referModelName", projectSpec.getRefferModelNames());

		List<Object> crSpecs = new ArrayList<>();
		root().getChangeRequestSpecs().forEach((crName,crSpec)->{
			Map<String, Object> crSpecOutput = makeCROutput(crSpec);
			crSpecs.add(crSpecOutput);
		});
		result.put(OutputName.CHANGE_REQUEST_LIST, crSpecs);
		return result;
	}

	protected Map<String, Object> makeCROutput(ChangeRequestSpec spec) {
		Map<String, Object> result = new HashMap<>();
		result.put(CHANGE_REQUEST.TITLE, spec.getTitle());
		result.put(CHANGE_REQUEST.TYPE, spec.getName());
		result.put(CHANGE_REQUEST.NEED_LOGIN, spec.isNeedLogin());
		result.put("shortName", spec.getShortName());
		result.put(CHANGE_REQUEST.ICON, spec.getIcon());
		result.put(CHANGE_REQUEST.BIND_TYPES, spec.getBindTypes());
		result.put(CHANGE_REQUEST.REQUEST_PREFIX, spec.getRequestUrlPrefix());
		List<Object> stepSpecs = new ArrayList<>();
		spec.getStepSpecs().forEach(stepSpec->{
			Map<String, Object> stepSpecOutput = makeStepOutput(spec, stepSpec);
			stepSpecs.add(stepSpecOutput);
		});
		result.put(CHANGE_REQUEST.STEP_LIST, stepSpecs);
		return result;
	}

	protected Map<String, Object> makeStepOutput(ChangeRequestSpec crSpec, StepSpec stepSpec) {
		Map<String, Object> result = new HashMap<>();
		result.put(STEP.TITLE, stepSpec.getTitle());
		result.put(STEP.NAME, stepSpec.getName());
		result.put(STEP.INDEX, stepSpec.getIndex());
		result.put(STEP.SKIP, !stepSpec.getIsRequired());
		List<Object> eventSpecs = new ArrayList<>();
		stepSpec.getEventSpecs().forEach(eventSpec->{
			Map<String, Object> eventSpecOutput = makeEventOutput(crSpec, stepSpec, eventSpec);
			eventSpecs.add(eventSpecOutput);
		});
		result.put(STEP.EVENT_LIST, eventSpecs);
		return result;
	}

	protected Map<String, Object> makeEventOutput(ChangeRequestSpec crSpec, StepSpec stepSpec, EventSpec eventSpec) {
		Map<String, Object> result = new HashMap<>();
		result.put(EVENT.TITLE, eventSpec.getTitle());
		result.put(EVENT.NAME, eventSpec.getName());
		result.put(EVENT.TYPE, eventSpec.getType());
		result.put(EVENT.MUST, eventSpec.getIsRequired());
		result.put(EVENT.MULTIPLE, eventSpec.getIsCollection());
		result.put(EVENT.SHOW_PREVIOUS, eventSpec.getShowPreviousCount());
		result.put(EVENT.SHOW_NEXT, eventSpec.getShowNextCount());

		if (eventSpec.getIsCollection()) {
			if (eventSpec.getMinCollectionSize()==null) {
				result.put(EVENT.MIN, eventSpec.getIsRequired()?1:0);
			}else {
				result.put(EVENT.MIN, eventSpec.getMinCollectionSize());
			}
			result.put(EVENT.MAX, eventSpec.getMaxCollectionSize()==null?EVENT._DEFAULT_MAX:eventSpec.getMaxCollectionSize());
		}
		List<Object> fieldSpecs = new ArrayList<>();
		eventSpec.getFieldSpecs().forEach(fieldSpec->{
			Map<String, Object> fieldSpecOutput = makeFieldOutput(crSpec, stepSpec, eventSpec, fieldSpec);
			fieldSpecs.add(fieldSpecOutput);
		});
		result.put(EVENT.FIELD_LIST, fieldSpecs);
		return result;
	}

	protected Map<String, Object> makeFieldOutput(ChangeRequestSpec crSpec, StepSpec stepSpec, EventSpec eventSpec,
			FieldSpec fieldSpec) {
		Map<String, Object> result = new HashMap<>();
		result.put(FIELD.NAME, fieldSpec.getName());
		result.put(FIELD.TITLE, fieldSpec.getTitle());
		putIfNotNull(result, FIELD.UI_STYLE, calaFieldUiStyle(fieldSpec));
		result.put(FIELD.INTER_ACTION_MODE,fieldSpec.getInteractionMode());
		result.put(FIELD.INLINE,fieldSpec.isInline());
		if (fieldSpec.getSelectable() == null || fieldSpec.getSelectable().booleanValue() ==  false) {
			result.put(FIELD.SELECTABLE, FIELD.SELECTABLE_NOT);
		}else if(fieldSpec.getMultiSelection() == null || fieldSpec.getMultiSelection().booleanValue() == false){
			result.put(FIELD.SELECTABLE, FIELD.SELECTABLE_SINGLE);
		}else {
			result.put(FIELD.SELECTABLE, FIELD.SELECTABLE_MULTI);
		}
		result.put(FIELD.MUST, fieldSpec.getIsRequired());
		
		result.put(FIELD.TYPE, fieldSpec.getInputType().getSystemTypeName());
		putIfNotNull(result, FIELD.MODEL_NAME, fieldSpec.getModelName());
		putIfNotNull(result, "extraData", fieldSpec.getExtraData());
		putIfNotNull(result, FIELD.PLACE_HOLDER, fieldSpec.getPlaceholder());
		putIfNotNull(result, FIELD.TIPS_CONTENT, fieldSpec.getTipsContext());
		putIfNotNull(result, FIELD.TIPS_TITLE, fieldSpec.getTipsTitle());
		putIfNotNull(result, FIELD.ON_CHANGE, fieldSpec.getOnChangeApi());
		putIfNotNull(result, FIELD.FORCE_VALUE, fieldSpec.getForceValue());
		putIfNotNull(result, FIELD.DEFAULT_VALUE, fieldSpec.getDefaultValue());
		putIfNotNull(result, FIELD.AUTO_FILL_EXPRESSION, fieldSpec.getAutoFillExpression());
		putIfNotNull(result, FIELD.VALUES, fieldSpec.getValuesMapping());
		putIfNotNull(result, FIELD.VALUES_RETRIEVE_API, fieldSpec.getDataRetrieveApiUrl());
		putIfNotNull(result, FIELD.SAMPLE_DATA,  calcSampleData(fieldSpec));//fieldSpec.getSampleData());

		putIfNotNull(result, FIELD.REGULAR_EXPRESSION, calaFieldRegExp(fieldSpec));
		if (fieldSpec.getRangeArgs() != null) {
			if (fieldSpec.getRangeArgs().length < 2){
				error(fieldSpec.getName()+" range should be (x,y), not (\"x,\"y)");
			}
			putIfNotNull(result, FIELD.MIN, fieldSpec.getRangeArgs()[0]);
			putIfNotNull(result, FIELD.MAX, fieldSpec.getRangeArgs()[1]);
		}
		return result;
	}

	private Object calcSampleData(FieldSpec fieldSpec) {
		if(fieldSpec.getSampleData() != null) {
			return fieldSpec.getSampleData();
		}
		if (fieldSpec.getMultiSelection() != null && fieldSpec.getMultiSelection().booleanValue()) {
			return "text()";
		}
		if (fieldSpec.getModelName() != null) {
			return String.format("$(%s)", Utils.toModelName(fieldSpec.getModelName()));
		}
		switch(fieldSpec.getInputType()) {
		case TEXT:{
			if (fieldSpec.getUiStyle() != null) {
				switch (fieldSpec.getUiStyle()) {
				case INPUT_EMAIL:
					return "someone@company.com";
				case INPUT_URL:
					return "https://www/baidu.com";
				default:
					break;
				}
			}
			fixFieldRangeIfNeeded(fieldSpec, fieldSpec.getIsRequired()?"1":"0", "60");
			return String.format("%s|%s", fieldSpec.getName(), fieldSpec.getTitle());
		}
		case MULTI_TEXT:
			fixFieldRangeIfNeeded(fieldSpec, fieldSpec.getIsRequired()?"1":null, (1024*1024*1024)+"");
			return "text()";
		case RICH_TEXT:
			fixFieldRangeIfNeeded(fieldSpec, fieldSpec.getIsRequired()?"1":null, (1024*1024*1024)+"");
			return "richText()";
		case BOOLEAN:
			return "true|false";
		case IMAGES:
			fixFieldRangeIfNeeded(fieldSpec, "0", "9");
			return "images()";
		case IMAGE:
			// fixFieldRangeIfNeeded(fieldSpec, "0", "512");
			return String.format("%s.jpg", Utils.toJavaVariableName(fieldSpec.getName()));
		case VIDEO:
			fixFieldRangeIfNeeded(fieldSpec, "0", "1024");
			return String.format("%s.mp4", Utils.toJavaVariableName(fieldSpec.getName()));
		case ATTACHMENT:
			fixFieldRangeIfNeeded(fieldSpec, "0", "1024");
			return String.format("%s.docx", Utils.toJavaVariableName(fieldSpec.getName()));
		case DATE:
			fixFieldRangeIfNeeded(fieldSpec, "1970-1-1", "2099-12-31");
			return "2099-12-31";
		case DATE_TIME:
			fixFieldRangeIfNeeded(fieldSpec, "1970-1-1T00:00:00", "2099-12-31T23:59:59");
			return "2099-12-31T23:59:59";
		case TIME:
			fixFieldRangeIfNeeded(fieldSpec, "00:00:00", "23:59:59");
			return "23:59:00";
		case INTEGER:
			fixFieldRangeIfNeeded(fieldSpec, "0", "100000000");
			return "12345678";
		case DECIMAL:
			fixFieldRangeIfNeeded(fieldSpec, "0.000", "100000000.000");
			return "12345678.000";
		case MONEY:
			fixFieldRangeIfNeeded(fieldSpec, "-100000000.000", "100000000.000");
			return "$12345678.000";
		case ARTICLE:
			fixFieldRangeIfNeeded(fieldSpec, fieldSpec.getIsRequired()?"1":null, (1024*1024*1024)+"");
			return "article()";
		case MOBILE:
			return "13300001234";
		default:
			throw new RuntimeException(fieldSpec.getName()+"出错: " + fieldSpec.getInputType()+"的样例数据还没处理");
		}
	}

	protected void fixFieldRangeIfNeeded(FieldSpec fieldSpec, String minExp, String maxExp) {
		if (fieldSpec.getRangeArgs() != null) {
			return;
		}
		if (fieldSpec.getSampleData() != null){
			return;
		}
		fieldSpec.setRangeArgs(new Serializable[] {minExp, maxExp});
	}

	protected Object calaFieldRegExp(FieldSpec fieldSpec) {
		if (fieldSpec.getRegularExpression() != null) {
			return fieldSpec.getRegularExpression();
		}
		if (fieldSpec.getInputType().equals(FieldType.MOBILE)) {
			return "1[3-9]\\d{9}";
		}
		if (fieldSpec.getUiStyle() != null) {
			switch (fieldSpec.getUiStyle()) {
			case INPUT_EMAIL:
				return "^(\\w)+(\\.\\w+)*@(\\w)+((\\.\\w+)+)$";
			case INPUT_URL:
				return "(https?|ftp|file)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]";
			default:
				break;
			}
		}
		return null;
	}

	/**
	 * 计算字段的 UIStyle.
	 *
	 * UI style 对应最终在前台使用的 type 字段,基本原则是这样:
	 * 1. 如果在脚本中定义了它的UI style, 那么就用这个, 否则按下面的规则处理:
	 * 2. 如果 定义了 display(), 那么type=prompt-message, required=false,不入数据库
	 * 3. 如果 定义了 hidden(), 那么type=hidden, required 不变, 以下都要入数据库
	 * 4. 如果 查询定义为 Query(wxappService/xxxx ) 类似这样的 请求查询, type=object-picker, required 不涉及,
	 * 5. 如果 查询定义为 Query(:xxx)这种根据变量来的, type就根据是否 multiple 来设置
	 * 6. 如果 设置了 multi-select, type=multi-select
	 * 7. 如果 设置了 single-select, type=single-select
	 * 8. 剩下的, 就根据数据类型来:
	 * @param fieldSpec
	 * @return
	 */
	protected String calaFieldUiStyle(FieldSpec fieldSpec) {
		if (fieldSpec.getUiStyle() != null) {
			return fieldSpec.getUiStyle().getName();
		}
		if (fieldSpec.getInteractionMode().equals("display")){
			fieldSpec.setIsRequired(false);
			return UIStyle.INPUT_PROMPT.getName();
		}
		if (fieldSpec.getInteractionMode().equals("hidden")){
			fieldSpec.setIsRequired(false);
			return UIStyle.INPUT_HIDDEN.getName();
		}

		if (ifUseObjectPicker(fieldSpec)) {
			return UIStyle.INPUT_OBJECT_PICKER.getName();
		}
//		if (fieldSpec.getModelName() != null) {
//			return UIStyle.INPUT_OBJECT_SELECT.getName();
//		}
		if (fieldSpec.getMultiSelection() != null && fieldSpec.getMultiSelection().booleanValue()) {
			return UIStyle.INPUT_MULTI_SELECT.getName();
		}
		if (fieldSpec.getSelectable() != null && fieldSpec.getSelectable().booleanValue()) {  // fieldSpec.getMultiSelection() is false now
			return UIStyle.INPUT_SINGLE_SELECT.getName();
		}
		switch (fieldSpec.getInputType()) {
		case MULTI_TEXT: 
			return UIStyle.INPUT_LONGTEXT.getName();
		case RICH_TEXT:
			return UIStyle.INPUT_RICHTEXT.getName();
		case BOOLEAN:
			return UIStyle.INPUT_BOOLEAN.getName();
		case IMAGES:
		case IMAGE:
			return UIStyle.INPUT_IMAGE.getName();
		case ATTACHMENT:
			return UIStyle.INPUT_ATTACHMENT.getName();
		case VIDEO:
			return UIStyle.INPUT_VIDEO.getName();
		case DATE:
			return UIStyle.INPUT_DATE.getName();
		case DATE_TIME:
			return UIStyle.INPUT_DATETIME.getName();
		case INTEGER:
			return UIStyle.INPUT_INTEGER.getName();
		case DECIMAL:
			return UIStyle.INPUT_DECIMAL.getName();
		case MONEY:
			return UIStyle.INPUT_MONEY.getName();
		case BASE_ENTITY: {
			if (ifUseObjectPicker(fieldSpec)) {
				return UIStyle.INPUT_OBJECT_PICKER.getName();
			}
			return UIStyle.INPUT_OBJECT_SELECT.getName();
		}
		case ARTICLE:
			return UIStyle.INPUT_ARTICLE.getName();
		case MOBILE:
			return UIStyle.INPUT_TEXT.getName();
		case TIME:
		case TEXT:
			break;

		default:
			error(fieldSpec.getInputType() + "的calaFieldUiStyle()还没做");
			break;
		}
		if (fieldSpec.getValuesMapping() != null) {
			return UIStyle.INPUT_SINGLE_SELECT.getName();
		}
		return UIStyle.INPUT_TEXT.getName();
	}

	protected boolean ifUseObjectPicker(FieldSpec fieldSpec){
		if (fieldSpec.getDataRetrieveApiUrl() == null){
			return false;
		}
		String url = fieldSpec.getDataRetrieveApiUrl();
		if (!url.startsWith("Query(")){
			return false;
		}
		if (url.contains("/") && !url.contains(",")){
			return true;
		}
		return false;
	}

	@Override
	public void putIfNotNull(Map<String, Object> result, String key, Object value) {
		if (value == null) {
			return;
		}
		result.put(key, value);
	}
}
