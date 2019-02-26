<#list script.events as event>
	public static final String EVENT_${NAMING.toJavaConstStyle(event.name)} = "${event.name}";
</#list>


	public ${class_name} sync() {
		return this;
	}

	public ${class_name} async() {
		return (${class_name}) getAsyncProxy();
	}
