package com.terapico.changerequest.builder;

import java.util.Map;

public interface ChangeRequestSpecFactory {
	default Map<String, Map<String, Object>> getSpec() {
		throw new RuntimeException("最后提供完整ChangeRequest的类,需要实现这个接口");
	}
	default ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
		throw new RuntimeException("提供ChangeRequest片段的类,需要实现这个接口");
	}
}
