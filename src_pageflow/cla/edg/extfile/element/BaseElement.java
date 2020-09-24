package cla.edg.extfile.element;

import java.util.HashMap;
import java.util.Map;

public class BaseElement {
    protected String id;
    protected String name;
    protected String title;
    protected String type;
    protected String level2Type;
    protected Map<String, Object> additionalData;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            this.name = null;
            return;
        }
        this.name = name.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevel2Type() {
        return level2Type;
    }

    public void setLevel2Type(String level2Type) {
        this.level2Type = level2Type;
    }

    public Map<String, Object> getAdditionalData() {
        if (additionalData == null){
            additionalData = new HashMap<>();
        }
        return additionalData;
    }

    public void setAdditionalData(Map<String, Object> additionalData) {
        this.additionalData = additionalData;
    }

    public boolean typeOf(String slType) {
        return slType.equals(getLevel2Type());
    }
}
