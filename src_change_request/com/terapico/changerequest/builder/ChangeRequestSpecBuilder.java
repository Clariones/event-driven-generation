package com.terapico.changerequest.builder;

import cla.edg.modelbean.BaseModelBean;

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

	public ChangeRequestSpecBuilder zh_CN(String chineseText) {
		return i18n("zh_CN", chineseText);
	}

	public ChangeRequestSpecBuilder has_field(String fieldName) {
		return for_field(fieldName, true);
	}
	public ChangeRequestSpecBuilder which_model_of(BaseModelBean bean) {
		return which_model_of(bean.getModelTypeName());
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
	public ChangeRequestSpecBuilder unhidden() {
		return interaction_mode("input");
	}
	public ChangeRequestSpecBuilder normal_input() {
		return interaction_mode("input");
	}

	public ChangeRequestSpecBuilder must_one() {
		return is_required(true).only_one();
	}
	public ChangeRequestSpecBuilder must_have() {
		return is_required(true);
	}
	

	public ChangeRequestSpecBuilder once() {
		return only_one();
	}

	public ChangeRequestSpecBuilder many_times(int min, int max) {
		return required_times(min,max);
	}

	public ChangeRequestSpecBuilder show_them_all_in_cr() {
		return show_previous_event(-1,-1);
	}

	public ChangeRequestSpecBuilder show_last_5_in_cr() {
		return show_previous_event(5,1);
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
		service.setFieldInputType($CR(),$STEP(),$EVENT(),$FIELD(), FieldType.BOOLEAN);
		return has_values(key?"true":"false", value, true);
	}
	public ChangeRequestSpecBuilder and(boolean key, Serializable value) {
		return this.and_more_value(key?"true":"false", value, true);
	}
	public ChangeRequestSpecBuilder or(boolean key, Serializable value) {
		return this.or_another_value(key?"true":"false", value, true);
	}

	public ChangeRequestSpecBuilder values_can_check_from_query_by(String relatedFieldName) {
		return this.values_can_get_from("Query(" + (relatedFieldName==null?"NA":relatedFieldName) +")").do_multiple_select();
	}
	public ChangeRequestSpecBuilder values_can_select_from_query_by(String relatedFieldName) {
		return this.values_can_get_from("Query(" + (relatedFieldName==null?"NA":relatedFieldName) +")");
	}

	public ChangeRequestSpecBuilder import_from(ChangeRequestSpecFactory factory) {
		return factory.makeSequel(this);
	}

	public ChangeRequestSpecBuilder watch_change() {
		return if_change_affect("_all");
	}


	public ChangeRequestSpecBuilder then_hide() {
		return this.then_do_action("hide");
	}
	
	

}
