    protected  List<${task.type}> ${task.fieldName};
    public List<${task.type}> get${task.fieldName?cap_first}(){
        if (${task.fieldName} == null) {
            ${task.fieldName} = new ArrayList<>();
        }
        return ${task.fieldName};
    }
    public void set${task.fieldName?cap_first}(List<${task.type}> ${task.fieldName}) {
        this.${task.fieldName} = ${task.fieldName};
    }
    public T ${task.fieldName}(${task.type} item){
        get${task.fieldName?cap_first}().add(item);
        return (T)this;
    }
    public T ${task.fieldName}(List<${task.type}> value){
        set${task.fieldName?cap_first}(value);
        return (T)this;
    }
