package com.terapico.generator;

public abstract class BaseHelper {
	public String NameAsThis(String name) {
		return Utils.toCamelCase(name);
	}
	public String name_as_this(String name) {
		return Utils.toModelName(name);
	}
	public String nameAsThis(String name) {
		return Utils.toJavaVariableName(name);
	}
	public String NAME_AS_THIS(String name) {
		return Utils.toJavaConstStyle(name);
	}
}
