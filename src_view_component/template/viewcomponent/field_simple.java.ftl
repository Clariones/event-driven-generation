    protected ${task.type} ${task.fieldName};
    public ${task.type} get${task.fieldName?cap_first}(){
        return ${task.fieldName};
    }
    public void set${task.fieldName?cap_first}(${task.type} ${task.fieldName}) {
        this.${task.fieldName} = ${task.fieldName};
    }
    public T ${task.fieldName}(${task.type} value){
        set${task.fieldName?cap_first}(value);
        return (T)this;
    }
