package com.terapico.changerequest.builder;

import clariones.tool.builder.Utils;

public abstract class ChangeRequestSpecBuilderUtil {

	protected ChangeRequestSpecBuildingService service;
	protected WorkingBoard workingBoard;

	protected void error(String message) {
		throw new RuntimeException(message);
	}
	protected void log(String string) {
		Utils.debug_on(1,  string);
	}
	protected String $CR() {
		return workingBoard.getCurrentChangeRequestName();
	}

	protected String $FIELD() {
		return workingBoard.getCurrentFieldName();
	}

	protected String $EVENT() {
		return workingBoard.getCurrentEventName();
	}

	protected String $STEP() {
		return workingBoard.getCurrentStepName();
	}

}
