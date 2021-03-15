
    protected  Map<String, ${task.type}> ${task.fieldName};
    public Map<String, ${task.type}> get${task.fieldName?cap_first}(){
        if (${task.fieldName} == null) {
            ${task.fieldName} = new HashMap<>();
        }
        return ${task.fieldName};
    }
    public void set${task.fieldName?cap_first}(Map<String, ${task.type}> ${task.fieldName}) {
        this.${task.fieldName} = ${task.fieldName};
    }
    public T ${task.fieldName}(String key, ${task.type} item){
        get${task.fieldName?cap_first}().put(key, item);
        return (T)this;
    }
    public T ${task.fieldName}(Map<String, ${task.type}> value){
        set${task.fieldName?cap_first}(value);
        return (T)this;
    }
