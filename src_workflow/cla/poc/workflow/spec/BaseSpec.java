package cla.poc.workflow.spec;

import java.util.ArrayList;
import java.util.List;

public class BaseSpec {
    protected String name;
    protected String zhName;
    protected String comments;
    protected List<String> detailComments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZhName() {
        return zhName;
    }

    public void setZhName(String zhName) {
        this.zhName = zhName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public List<String> getDetailComments() {
        if (detailComments == null){
            detailComments = new ArrayList<>();
        }
        return detailComments;
    }

    public void setDetailComments(List<String> detailComments) {
        this.detailComments = detailComments;
    }

    public void addComments(String comments){
        if (getComments() == null){
            setComments(comments);
            return;
        }
        getDetailComments().add(comments);
    }
}
