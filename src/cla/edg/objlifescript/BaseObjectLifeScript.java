package cla.edg.objlifescript;

public class BaseObjectLifeScript {
	protected static ObjectLifeScript $(String name) {
		ObjectLifeScript rst = new ObjectLifeScript();
		rst.setName(name);
		return rst;
	}
}
