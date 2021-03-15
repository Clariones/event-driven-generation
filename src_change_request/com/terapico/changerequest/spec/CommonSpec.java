package com.terapico.changerequest.spec;

import clariones.tool.builder.Utils;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unchecked")
public abstract class CommonSpec <T extends CommonSpec<T>>{
	protected String name;
	protected String title;
	protected Map<String, String> i18nName;
	protected Boolean isRequired = true;
	protected Integer minCollectionSize;
	protected Integer maxCollectionSize;
	protected Boolean isCollection = false;
	protected Map<String, Object> extraData;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
//		if (title != null && title.equals("个人信息")) {
//			whereami("设置了title="+title+", 我的老title="+this.getTitle());
//		}
		this.title = title;
	}
	public Map<String, String> getI18nName() {
		return i18nName;
	}
	public void setI18nName(Map<String, String> i18nName) {
		this.i18nName = i18nName;
	}
	public Boolean getIsRequired() {
		return isRequired;
	}
	public void setIsRequired(Boolean isRequired) {
//		if(this.getName().equals("register office")) {
//			this.whereami("isRequired="+isRequired);
//		}
		this.isRequired = isRequired;
	}
	public Integer getMinCollectionSize() {
		return minCollectionSize;
	}
	public void setMinCollectionSize(Integer minCollectionSize) {
		this.minCollectionSize = minCollectionSize;
	}
	public Integer getMaxCollectionSize() {
		return maxCollectionSize;
	}
	public void setMaxCollectionSize(Integer maxCollectionSize) {
		this.maxCollectionSize = maxCollectionSize;
	}
	public Boolean getIsCollection() {
		return isCollection;
	}
	public void setIsCollection(Boolean isCollection) {
		this.isCollection = isCollection;
	}

	public Map<String, Object> getExtraData() {
		return extraData;
	}

	public void setExtraData(Map<String, Object> extraData) {
		this.extraData = extraData;
	}

	public abstract String getSpecType();
	
	public T withName(String name) {
		this.setName(name);
		log("新建 "+this.getSpecType()+":"+name);
		return (T) this;
	}
	
	
	public T withI18n(Map<String, String> i18nNames) {
		this.setI18nName(new HashMap<>(i18nNames));
		return (T) this;
	}
	
	protected Map<String, String> ensureI18nName(){
		if (i18nName != null) {
			return i18nName;
		}
		return i18nName = new HashMap<>();
	}
	public T addI18n(String localeCode, String text) {
		ensureI18nName().put(localeCode, text);
		if (is4Title(localeCode)) {
			this.setTitle(text);
		}
		return (T)this;
	}
	
	protected Boolean is4Title(String localeCode) {
		// 默认用 zh_CN 的做title, 可以重载为 false 避免这个动作
		return "zh_CN".equals(localeCode);
	}
	protected void log(String message) {
		Utils.debug_on(2,message);
	}
	public void rename(String newName) {
		log("改名 "+this.getSpecType()+":"+name+" rename to "+newName);
		this.setName(newName);
	}
	protected void whereami(String message) {
		new Throwable(message).printStackTrace();
	}

    public void addInteraction(String refFieldName, String refOperation, Object refValue, String actionCode){
		Map<String, Object>  data = Utils.ensureMap(ensureExtraData(), "interaction", Object.class);
		Map<String, Object>  infoData = Utils.ensureMap(data, refFieldName, Object.class);
		// cla_TODO: 还没写完
		String key = refOperation+"_"+String.valueOf(refValue);
		Map<String, Object> newData = Utils.ensureMap(infoData, key, Object.class);
		newData.put("operation",refOperation );
		newData.put("refValue",refValue );
		newData.put("action",actionCode );
	}

	protected Map<String, Object> ensureExtraData(){
		if (getExtraData() == null){
			setExtraData(new HashMap<>());
		}
		return getExtraData();
	}
}
