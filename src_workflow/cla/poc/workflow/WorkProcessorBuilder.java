package cla.poc.workflow;

public class WorkProcessorBuilder extends BasicBuilder<WorkProcessorBuilder>{
    protected String basePackage;

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String folderName) {
        this.basePackage = folderName;
    }

    public static WorkProcessorBuilder start() {
        return new WorkProcessorBuilder();
    }

    public WorkProcessorBuilder once_started() {
        return in_status("start").zh_CN("启动");
    }

    public WorkProcessorBuilder when_success() {
        return when("ok").zh_CN("成功");
    }

    public WorkProcessorBuilder once_enter() {
        return on_event("enter").zh_CN("进入");
    }



    public WorkProcessorBuilder import_from(WorkProcessorScript script) {
        return script.makeSequel(this);
    }

    public WorkProcessorBuilder basePackage(String name) {
        setBasePackage(name);
        return this;
    }

    public WorkProcessorBuilder nothing_to() {
        return this;
    }



}
