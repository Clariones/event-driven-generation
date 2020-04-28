package com.terapico.changerequest.spec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

public class FieldSpec extends CommonSpec<FieldSpec> implements Cloneable{
	protected String interactionMode;
	protected FieldType inputType;
	protected Serializable defaultValue;
	protected Serializable forceValue;
	protected Serializable[] rangeArgs;
	protected String placeholder;
	protected String tipsTitle;
	protected String tipsContext;
	protected Boolean selectable; // radio, option, check-box
	protected Boolean multiSelection;	// option, check-box
	protected Map<String, Serializable> valuesMapping;
	protected String dataRetrieveApiUrl;
	protected String sampleData;
	protected String modelName;
	protected UIStyle uiStyle;
	protected String regularExpression;
	
	public String getSampleData() {
		return sampleData;
	}
	public void setSampleData(String sampleData) {
		this.sampleData = sampleData;
	}
	public String getInteractionMode() {
		return interactionMode;
	}
	public void setInteractionMode(String interactionMode) {
		this.interactionMode = interactionMode;
	}
	public FieldType getInputType() {
		return inputType;
	}
	public void setInputType(FieldType inputType) {
		this.inputType = inputType;
	}
	public Serializable getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(Serializable defaultValue) {
		this.defaultValue = defaultValue;
	}
	public Serializable getForceValue() {
		return forceValue;
	}
	public void setForceValue(Serializable forceValue) {
		this.forceValue = forceValue;
	}
	public Serializable[] getRangeArgs() {
		return rangeArgs;
	}
	public void setRangeArgs(Serializable[] rangeArgs) {
		this.rangeArgs = rangeArgs;
	}
	public String getPlaceholder() {
		return placeholder;
	}
	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}
	public String getTipsTitle() {
		return tipsTitle;
	}
	public void setTipsTitle(String tipsTitle) {
		this.tipsTitle = tipsTitle;
	}
	public String getTipsContext() {
		return tipsContext;
	}
	public void setTipsContext(String tipsContext) {
		this.tipsContext = tipsContext;
	}
	public Boolean getSelectable() {
		return selectable;
	}
	public void setSelectable(Boolean selectable) {
		this.selectable = selectable;
	}
	public Boolean getMultiSelection() {
		return multiSelection;
	}
	public void setMultiSelection(Boolean multiSelection) {
		this.multiSelection = multiSelection;
	}
	public Map<String, Serializable> getValuesMapping() {
		return valuesMapping;
	}
	public void setValuesMapping(Map<String, Serializable> valuesMapping) {
		this.valuesMapping = valuesMapping;
	}
	public String getDataRetrieveApiUrl() {
		return dataRetrieveApiUrl;
	}
	public void setDataRetrieveApiUrl(String dataRetrieveApiUrl) {
		this.dataRetrieveApiUrl = dataRetrieveApiUrl;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	
	
	
	public String getRegularExpression() {
		return regularExpression;
	}
	public void setRegularExpression(String regularExpression) {
		this.regularExpression = regularExpression;
	}
	public UIStyle getUiStyle() {
		return uiStyle;
	}
	public void setUiStyle(UIStyle uiStyle) {
		this.uiStyle = uiStyle;
	}
	protected Map<String, Serializable> ensureValuesMapping() {
		if (valuesMapping != null) {
			return valuesMapping;
		}
		return valuesMapping = new HashMap<>();
	}
	public void addValueMapping(String key, Serializable value) {
		ensureValuesMapping().put(key, value);
	}
	
	public FieldSpec copy() {
		FieldSpec newOne = new FieldSpec();
		newOne.interactionMode = this.interactionMode;
		newOne.inputType = this.inputType;
		newOne.defaultValue = this.defaultValue;
		newOne.forceValue = this.forceValue;
		if (this.rangeArgs != null) {
			newOne.rangeArgs = Arrays.copyOf(this.rangeArgs, this.rangeArgs.length);
		}
		newOne.placeholder = this.placeholder;
		newOne.tipsTitle = this.tipsTitle;
		newOne.tipsContext = this.tipsContext;
		newOne.selectable = this.selectable;
		newOne.multiSelection = this.multiSelection;
		if (this.valuesMapping != null) {
			newOne.valuesMapping = new HashMap<>(this.valuesMapping);
		}
		newOne.dataRetrieveApiUrl = this.dataRetrieveApiUrl;
		newOne.name = this.name;
		newOne.title = this.title;
		if (this.i18nName != null) {
			newOne.i18nName = new HashMap<>(this.i18nName);
		}
		newOne.isRequired = this.isRequired;
		newOne.minCollectionSize = this.minCollectionSize;
		newOne.maxCollectionSize = this.maxCollectionSize;
		newOne.isCollection = this.isCollection;
		newOne.modelName = this.modelName;
		newOne.sampleData = this.sampleData;
		newOne.regularExpression = this.regularExpression;
		newOne.uiStyle = this.uiStyle;
		return newOne;
	}
	
	public void mergeWith(FieldSpec baseData) {
		if (this.getInteractionMode() == null) {
			this.setInteractionMode(baseData.getInteractionMode());
		}
		if (this.getInputType() == null) {
			this.setInputType(baseData.getInputType());
		}
		if (this.getDefaultValue() == null) {
			this.setDefaultValue(baseData.getDefaultValue());
		}
		if (this.getForceValue() == null) {
			this.setForceValue(baseData.getForceValue());
		}
		if (this.getRangeArgs() == null) {
			this.setRangeArgs(baseData.getRangeArgs());
		}
		if (this.getPlaceholder() == null) {
			this.setPlaceholder(baseData.getPlaceholder());
		}
		if (this.getTipsTitle() == null) {
			this.setTipsTitle(baseData.getTipsTitle());
		}
		if (this.getTipsContext() == null) {
			this.setTipsContext(baseData.getTipsContext());
		}
		if (this.getSelectable() == null) {
			this.setSelectable(baseData.getSelectable());
		}
		if (this.getMultiSelection() == null) {
			this.setMultiSelection(baseData.getMultiSelection());
		}
		if (this.getValuesMapping() == null || this.getValuesMapping().isEmpty()) {
			this.setValuesMapping(baseData.getValuesMapping());
		}
//		if (baseData.getValuesMapping() != null) {
//			Map<String, Serializable> data = new HashMap<>(baseData.getValuesMapping());
//			if (this.getValuesMapping() != null) {
//				data.putAll(this.getValuesMapping());
//			}
//			this.setValuesMapping(data);
//		}
		if (this.getDataRetrieveApiUrl() == null) {
			this.setDataRetrieveApiUrl(baseData.getDataRetrieveApiUrl());
		}
		if (this.getName() == null) {
			this.setName(baseData.getName());
		}
		if (this.getTitle() == null) {
			this.setTitle(baseData.getTitle());
		}
		if (baseData.getI18nName() != null) {
			Map<String, String> data = new HashMap<>(baseData.getI18nName());
			if (this.getI18nName() != null) {
				data.putAll(this.getI18nName());
			}
			this.setI18nName(data);
		}
		
		if (this.getIsRequired() == null) {
			this.setIsRequired(baseData.getIsRequired());
		}
		if (this.getMinCollectionSize() == null) {
			this.setMinCollectionSize(baseData.getMinCollectionSize());
		}
		if (this.getMaxCollectionSize() == null) {
			this.setMaxCollectionSize(baseData.getMaxCollectionSize());
		}
		if (this.getIsCollection() == null) {
			this.setIsCollection(baseData.getIsCollection());
		}
		if (this.getSampleData() == null) {
			this.setSampleData(baseData.getSampleData());
		}
		if (this.getModelName() == null) {
			this.setModelName(baseData.getModelName());
		}
		if (this.getUiStyle() == null) {
			this.setUiStyle(baseData.getUiStyle());
		}
		if (this.getRegularExpression() == null) {
			this.setRegularExpression(baseData.getRegularExpression());
		}
	}
	
	protected transient HashMap<String, String> setTags = new HashMap<>();
	protected boolean notSet(String tag) {
		if (setTags.containsKey(tag)) {
			return false;
		}
		setTags.put(tag, tag);
		return true;
	}
	
	public void addI18nIfNeed(String localeCode, String text) {
		if (ensureI18nName().containsKey(localeCode)) {
			return;
		}
		addI18n(localeCode, text);
	}
	public void setInteractionModeIfNeed(String mode) {
		if (notSet("interactionMode")) {
			this.setInteractionMode(mode);
		}
	}
	public void setIsRequiredIfNeed(boolean required) {
		if (notSet("required")) {
			this.setIsRequired(required);
		}
	}
	public void setForceValueIfNeed(Serializable forceValue) {
		if (notSet("forceValue")) {
			this.setForceValue(forceValue);
		}
	}
	public void setRangeArgsIfNeed(Serializable[] rangeArgs) {
		if (notSet("ranges")) {
			this.setRangeArgs(rangeArgs);
		}
	}
	public void setPlaceholderIfNeed(String text) {
		if (notSet("placeholder")) {
			this.setPlaceholder(text);
		}
	}
	public void setTipsTitleIfNeed(String text) {
		if (notSet("tipsTitle")) {
			this.setTipsTitle(text);
		}
	}
	public void setTipsContextIfNeed(String text) {
		if (notSet("tipsContent")) {
			this.setTipsContext(text);
		}
	}
	public void addValueMappingIfNeed(String key, Serializable value) {
		if (ensureValuesMapping().containsKey(key)) {
			return;
		}
		this.addValueMapping(key, value);
	}
	public void setInputTypeIfNeed(FieldType fieldType) {
		if (notSet("inputType")) {
			this.setInputType(fieldType);
		}
	}
	public void setUiStyleIfNeed(UIStyle uiStyle) {
		if (notSet("uiStyle")) {
			this.setUiStyle(uiStyle);
		}
	}
	public void setModelNameIfNeed(String modelName) {
		if (notSet("modelName")) {
			this.setModelName(modelName);
		}
	}
	public void setDefaultValueIfNeed(Serializable defaultValue2) {
		if (notSet("defaultValue")) {
			setDefaultValue(defaultValue2);
		}
		
	}
	public void setRegularExpressionIfNeed(String regExp) {
		if (notSet("regExp")) {
			setRegularExpression(regExp);
		}
		
	}
	public void setSelectableIfNeed(boolean selectable, FieldSpec curFieldSpec) {
		String setterKey = curFieldSpec.hashCode()+"";
		if (notSet("selectable")) {
			setSelectable(selectable);
			setTags.put("selectable", setterKey);
			return;
		}
		if (setTags.get("selectable").equals(setterKey)) {
			setSelectable(selectable);
			return;
		}
	}
	public void setMultiSelectionIfNeed(boolean multiSelection, FieldSpec curFieldSpec) {
		String setterKey = curFieldSpec.hashCode()+"";
		if (notSet("multiSelection")) {
			setTags.put("multiSelection", setterKey);
			setMultiSelection(multiSelection);
			return;
		}
		if (setTags.get("multiSelection").equals(setterKey)) {
			setMultiSelection(multiSelection);
			return;
		}
	}
	public void clearSetTag(String nameOfSetTag) {
		setTags.remove(nameOfSetTag);
	}
	
	@Override
	public String getSpecType() {
		return "Field";
	}
	
	public void appendSampleData(String newSampleData) {
		if (newSampleData == null || newSampleData.isEmpty()) {
			return;
		}
		if (this.getSampleData() == null) {
			this.setSampleData(newSampleData);
			return;
		}
		String[] existedSampleData = this.getSampleData().split("\\|");
		List<String> existedSampleDataList = new ArrayList<>(Arrays.asList(existedSampleData));
		List<String> newSampleDataList = new ArrayList<>(Arrays.asList(newSampleData.split("\\|")));
		for(String newSD : newSampleDataList) {
			if (existedSampleDataList.contains(newSD)) {
				continue;
			}
			existedSampleDataList.add(newSD);
		}
		this.setSampleData(String.join("|", existedSampleDataList));
	}
	
	

	

}
