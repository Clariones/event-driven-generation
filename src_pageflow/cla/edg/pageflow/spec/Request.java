package cla.edg.pageflow.spec;

import cla.edg.pageflow.AccessParameter;
import cla.edg.pageflow.Branch;

import java.util.ArrayList;
import java.util.List;

public class Request extends BasePageFlowSpecElement {
    protected boolean needLogin = false;        // 是否需要登录
    protected boolean hasFootprint = false;        // 是否进入 history
    protected boolean handleForm = false;        // 是否一个 form 请求
    protected boolean canRefresh = false;        // 是否下拉刷新
    protected List<Branch> branches;            // response 的分支情况
    protected int cacheTimeInSeconds = 0;        // 是否要做前端缓存, 如果是的话, 要缓存几秒
    protected String changeRequestName;            // 如果是form请求, 是哪个form
    protected List<AccessParameter> parameters;

    public Request() {
        parameters = new ArrayList<>();
    }

    public boolean isCanRefresh() {
        return canRefresh;
    }

    public void setCanRefresh(boolean canRefresh) {
        this.canRefresh = canRefresh;
    }

    public int getCacheTimeInSeconds() {
        return cacheTimeInSeconds;
    }

    public void setCacheTimeInSeconds(int cacheTimeInSeconds) {
        if (cacheTimeInSeconds <= 0) {
            this.cacheTimeInSeconds = 0;
            return;
        }
        if (handleForm) {
            throw new RuntimeException("输入是form的请求不能使用页面缓存");
        }
        this.cacheTimeInSeconds = cacheTimeInSeconds;
    }

    public boolean isHandleForm() {
        return handleForm;
    }

    public void setHandleForm(boolean handleForm) {
        this.handleForm = handleForm;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public boolean isNeedLogin() {
        return needLogin;
    }

    public void setNeedLogin(boolean need_login) {
        this.needLogin = need_login;
    }

    public boolean isHasFootprint() {
        return hasFootprint;
    }

    public void setHasFootprint(boolean hasFootprint) {
        this.hasFootprint = hasFootprint;
    }

    public String getChangeRequestName() {
        return changeRequestName;
    }

    public void setChangeRequestName(String changeRequestName) {
        this.changeRequestName = changeRequestName;
    }

    public Branch addBranch(String code) {
        if (branches == null) {
            branches = new ArrayList<>();
        }
        Branch bch = new Branch();
        bch.setName(code);
        branches.add(bch);
        return bch;
    }

    public List<AccessParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<AccessParameter> parameters) {
        this.parameters = parameters;
    }


    private AccessParameter newParam(int position, String typeName, String paramName, String formName) {
        AccessParameter p = new AccessParameter();
        p.setTypeName(typeName);
        p.setParamName(paramName);
        p.setFormName(formName);
        if (position < 0) {
            position = Math.max(0, parameters.size() + position);
        }
        if (position >= parameters.size()) {
            parameters.add(p);
        } else {
            parameters.add(position, p);
        }
        return p;
    }

    public AccessParameter addParam(int position, String paramName, String paramType, String className) {
        if (this.isHandleForm()) {
            throw new RuntimeException("请求的参数要么是form，要么是其它。不能既有form又有普通参数");
        }
        if (parameters != null){
            AccessParameter p = parameters.stream().filter(it -> it.getParamName().equals(paramName)).findAny().orElse(null);
            if (p != null){
                return p;
            }
        }
        AccessParameter p = newParam(position, paramType, paramName, null);
        if (className != null) {
            p.setExtType(true);
        }
        return p;
    }

    public AccessParameter addFormParameter(String formName) {
        if (!parameters.isEmpty()) {
            throw new RuntimeException("请求的参数要么是form，要么是其它。不能既有form又有普通参数");
        }
        if (cacheTimeInSeconds > 0) {
            throw new RuntimeException("做了页面缓存的请求, 不应该是处理form提交的请求");
        }
        this.setHandleForm(true);
        return newParam(0, "form", "formData", formName);
    }
}
