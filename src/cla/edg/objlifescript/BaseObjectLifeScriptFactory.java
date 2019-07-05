package cla.edg.objlifescript;

import java.util.HashMap;

public abstract class BaseObjectLifeScriptFactory {
	protected static ObjectLifeScript $(String name) {
		ObjectLifeScript rst = new ObjectLifeScript();
		rst.setName(name);
		return rst;
	}

	public abstract ObjectLifeScript getScript();
}
