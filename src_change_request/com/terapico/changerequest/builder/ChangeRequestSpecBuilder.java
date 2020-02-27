package com.terapico.changerequest.builder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ChangeRequestSpecBuilder extends ChangeRequestSpecBaseBuilder<ChangeRequestSpecBuilder>{
	private static Map<String, ChangeRequestSpecBuilder> instances = new HashMap<>();
	private ChangeRequestSpecBuilder() {}
	
	public static ChangeRequestSpecBuilder for_project(String projectName) {
		ChangeRequestSpecBuilder ins = instances.get(projectName);
		if (ins != null) {
			return ins;
		}
		synchronized(ChangeRequestSpecBuilder.class) {
			ins = instances.get(projectName);
			if (ins != null) {
				return ins;
			}
			
			ins = new ChangeRequestSpecBuilder();
			instances.put(projectName, ins);
			return ins.new_project(projectName);
		}
	}

	public ChangeRequestSpecBuilder step1(String stepName) {
		return step(1, stepName);
	}
	public ChangeRequestSpecBuilder step2(String stepName) {
		return step(2, stepName);
	}
	public ChangeRequestSpecBuilder step3(String stepName) {
		return step(3, stepName);
	}
	public ChangeRequestSpecBuilder step4(String stepName) {
		return step(4, stepName);
	}
	public ChangeRequestSpecBuilder step5(String stepName) {
		return step(5, stepName);
	}

	public ChangeRequestSpecBuilder zh_CN(String chineseText) {
		return i18n("zh_CN", chineseText);
	}

	public ChangeRequestSpecBuilder has_field(String fieldName) {
		return for_field(fieldName);
	}

	public ChangeRequestSpecBuilder optional() {
		return is_required(false);
	}
	public ChangeRequestSpecBuilder disabled() {
		return interaction_mode("disabled");
	}
	public ChangeRequestSpecBuilder display() {
		return interaction_mode("display");
	}
	public ChangeRequestSpecBuilder hidden() {
		return interaction_mode("hidden");
	}

	public ChangeRequestSpecBuilder must_one() {
		return is_required(true).required_times(1,1);
	}
	public ChangeRequestSpecBuilder must_have() {
		return is_required(true);
	}
	

	public ChangeRequestSpecBuilder once() {
		return required_times(1,1);
	}

	public ChangeRequestSpecBuilder many_times(int min, int max) {
		return required_times(min,max);
	}

	public ChangeRequestSpecBuilder cannot_skip() {
		return is_required(true);
	}

	public ChangeRequestSpecBuilder can_skip() {
		return is_required(false);
	}

	public ChangeRequestSpecBuilder values_canbe(String key, Serializable value) {
		return has_values(key, value, false);
	}
	public ChangeRequestSpecBuilder and(String key, Serializable value) {
		return this.and_more_value(key, value, false);
	}
	public ChangeRequestSpecBuilder or(String key, Serializable value) {
		return this.or_another_value(key, value, false);
	}
	public ChangeRequestSpecBuilder values_canbe(boolean key, Serializable value) {
		return has_values(key?"true":"false", value, true);
	}
	public ChangeRequestSpecBuilder and(boolean key, Serializable value) {
		return this.and_more_value(key?"true":"false", value, true);
	}
	public ChangeRequestSpecBuilder or(boolean key, Serializable value) {
		return this.or_another_value(key?"true":"false", value, true);
	}

}