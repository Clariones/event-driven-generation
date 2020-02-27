package com.terapico.changerequest.spec;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unchecked")
public abstract class CommonSpec <T extends CommonSpec<T>>{
	protected String name;
	protected String title;
	protected Map<String, String> i18nName;
	protected boolean isRequired = true;
	protected int minCollectionSize = 0;
	protected int maxCollectionSize = 0;
	protected boolean isCollection = false;
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
		this.title = title;
	}
	public Map<String, String> getI18nName() {
		return i18nName;
	}
	public void setI18nName(Map<String, String> i18nName) {
		this.i18nName = i18nName;
	}
	public boolean isRequired() {
		return isRequired;
	}
	public void setRequired(boolean isRequired) {
		this.isRequired = isRequired;
	}
	public int getMinCollectionSize() {
		return minCollectionSize;
	}
	public void setMinCollectionSize(int minCollectionSize) {
		this.minCollectionSize = minCollectionSize;
	}
	public int getMaxCollectionSize() {
		return maxCollectionSize;
	}
	public void setMaxCollectionSize(int maxCollectionSize) {
		this.maxCollectionSize = maxCollectionSize;
	}
	public boolean isCollection() {
		return isCollection;
	}
	public void setCollection(boolean isCollection) {
		this.isCollection = isCollection;
	}
	
	public T withName(String name) {
		this.setName(name);
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
	protected boolean is4Title(String localeCode) {
		// 默认用 zh_CN 的做title, 可以重载为 false 避免这个动作
		return "zh_CN".equals(localeCode);
	}
}
