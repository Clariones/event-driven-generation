package com.terapico.changerequest.builder;

import java.util.Map;

public interface ChangeRequestSpecFactory {
	public Map<String, Map<String, Object>> getSpec();
}
