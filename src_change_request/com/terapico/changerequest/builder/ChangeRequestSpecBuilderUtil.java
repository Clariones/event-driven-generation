package com.terapico.changerequest.builder;

public abstract class ChangeRequestSpecBuilderUtil {

	protected ChangeRequestSpecBuildingService service;
	protected WorkingBoard workingBoard;

	protected void error(String message) {
		throw new RuntimeException(message);
	}
	protected void log(String string) {
		System.out.println(String.format("[%20s]: %s", "Builder", string));
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
