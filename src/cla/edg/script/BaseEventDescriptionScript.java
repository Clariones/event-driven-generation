package cla.edg.script;

public abstract class BaseEventDescriptionScript {

	protected static EventScript $(String name) {
		EventScript result = new EventScript();
		result.setBussinessName(name);
		return result;
	}

	public abstract EventScript getScript();
}
