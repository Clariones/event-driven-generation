package cla.edg.objlifescript;

public class ObjectLifeScript {
	
	protected Configuration curConfig;
	protected ExploreNode curNode;
	protected Object curWorker;
	
	protected String name;
	protected Configuration config;
	private void ensureNode(String nodeName) {
		curNode = new ExploreNode();
		curNode.name = nodeName;
		curWorker = curNode;
	}
	private void ensureWorkerType(String errMessage, Class<?> ...classes ) {
		for(Class<?> clazz:classes) {
			if (curWorker.getClass().getCanonicalName().equals(clazz.getCanonicalName())) {
				return;
			}
		}
		throw new RuntimeException("当前的类型是"+curWorker.getClass().getSimpleName()+", " + errMessage);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ObjectLifeScript configure() {
		if (config == null) {
			config = new Configuration();
		}
		curConfig = config;
		curWorker = config;
		return this;
	}

	public ObjectLifeScript package_name(String pkgName) {
		ensureWorkerType("不能指定生成代码的包名",Configuration.class);
		curConfig.packageName = pkgName;
		return this;
	}
	public ObjectLifeScript explore_object(String objName) {
		ensureWorkerType("不能指定探索的目标对象",Configuration.class);
		curConfig.objectTypeName = objName;
		return this;
	}
	public ObjectLifeScript start_from(String nodeName) {
		ensureNode(nodeName);
		return this;
	}
	public ObjectLifeScript then(String string) {
		// TODO Auto-generated method stub
		return this;
	}
	public ObjectLifeScript when_not() {
		// TODO Auto-generated method stub
		return this;
	}
	public ObjectLifeScript stop_with(String string) {
		// TODO Auto-generated method stub
		return when("false");
	}
	public ObjectLifeScript when(String string) {
		// TODO Auto-generated method stub
		return this;
	}
	public ObjectLifeScript comments(String string) {
		// TODO Auto-generated method stub
		return this;
	}
	public ObjectLifeScript jump_to(String string) {
		// TODO Auto-generated method stub
		return this;
	}
	public ObjectLifeScript continue_with(String string) {
		// TODO Auto-generated method stub
		return this;
	}
	public ObjectLifeScript for_each(String string) {
		// TODO Auto-generated method stub
		return this;
	}
	public ObjectLifeScript when_has_not() {
		// TODO Auto-generated method stub
		return this;
	}
	public ObjectLifeScript done_for_each(String string) {
		// TODO Auto-generated method stub
		return this;
	}
	public ObjectLifeScript finally_result(String string) {
		// TODO Auto-generated method stub
		return this;
	}
	public ObjectLifeScript stop() {
		// TODO Auto-generated method stub
		return this;
	}
	public ObjectLifeScript then_mark(String string) {
		// TODO Auto-generated method stub
		return this;
	}
	public ObjectLifeScript then_for_each(String string) {
		// TODO Auto-generated method stub
		return this;
	}
	public ObjectLifeScript do_all_of(String string) {
		// TODO Auto-generated method stub
		return this;
	}
	public ObjectLifeScript one_is(String string) {
		// TODO Auto-generated method stub
		return this;
	}
	public ObjectLifeScript do_one_of(String string) {
		// TODO Auto-generated method stub
		return this;
	}
	public ObjectLifeScript decided_by(String string) {
		// TODO Auto-generated method stub
		return this;
	}
	
	

	
	
}
