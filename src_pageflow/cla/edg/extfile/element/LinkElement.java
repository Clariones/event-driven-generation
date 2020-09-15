package cla.edg.extfile.element;


public class LinkElement extends BaseElement {
    protected String fromElement;
    protected String toElement;
    protected boolean needLogin;

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
}
