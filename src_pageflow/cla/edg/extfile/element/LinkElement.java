package cla.edg.extfile.element;


import java.util.ArrayList;
import java.util.List;

public class LinkElement extends BaseElement {
    protected String fromElement;
    protected String toElement;
    protected boolean needLogin;
    protected List<ParamElement> params;

    /**
     * @see clariones.tool.builder.CONST.LINK_TYPE
     */
    protected String linkType;

    public String getFromElement() {
        return fromElement;
    }

    public void setFromElement(String fromElement) {
        this.fromElement = fromElement;
    }

    public String getToElement() {
        return toElement;
    }

    public void setToElement(String toElement) {
        this.toElement = toElement;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    public boolean isNeedLogin() {
        return needLogin;
    }

    public void setNeedLogin(boolean needLogin) {
        this.needLogin = needLogin;
    }

    public List<ParamElement> getParams() {
        if (params == null) {
            params = new ArrayList<>();
        }
        return params;
    }

    public void setParams(List<ParamElement> params) {
        this.params = params;
    }
}
