package cla.edg.generator;

import java.util.Collection;
import java.util.HashSet;

import cla.edg.eventscript.EventInfo;
import cla.edg.eventscript.EventProcessResultBranch;

public class EventScriptGeneratorHelper {
	public Collection<EventProcessResultBranch> getAllBranch(EventInfo event) {
		if (event.getBranches() == null) {
			return new HashSet<>();
		}
		return event.getBranches().values();
	}
}
