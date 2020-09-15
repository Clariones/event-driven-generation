package cla.edg.extfile.element;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RequestElement extends BaseElement{
    protected Map<String, String> targetPages = new HashMap<>();
    protected String formName;  // type=form时才有
    protected String splitNodeId;
    protected String formId;
    protected List<Map<String, Object>> params = new ArrayList<>(); // 请求的参数
    protected boolean needLogin;
    protected String requestType = "";

    public Map<String, String> getTargetPages() {
        if (targetPages == null){
            targetPages = new HashMap<>();
        }
        return targetPages;
    }

    public void setTargetPages(Map<String, String> targetPages) {
        this.targetPages = targetPages;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public List<Map<String, Object>> getParams() {
        return params;
    }

    public void setParams(List<Map<String, Object>> params) {
        this.params = params;
    }

    public boolean isNeedLogin() {
        return needLogin;
    }

    public void setNeedLogin(boolean needLogin) {
        this.needLogin = needLogin;
    }

    public String getSplitNodeId() {
        return splitNodeId;
    }

    public void setSplitNodeId(String splitNodeId) {
        this.splitNodeId = splitNodeId;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
}
