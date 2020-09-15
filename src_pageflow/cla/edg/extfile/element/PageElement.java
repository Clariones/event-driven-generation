package cla.edg.extfile.element;

import clariones.tool.builder.CONST;

public class PageElement extends BaseElement{
    protected int cacheInSecond;
    protected boolean canRefresh;
    protected boolean hasFootPrint;
    protected String  pageType = CONST.PAGE_TYPE.OTHER;

    public int getCacheInSecond() {
        return cacheInSecond;
    }

    public void setCacheInSecond(int cacheInSecond) {
        this.cacheInSecond = cacheInSecond;
    }

    public boolean isCanRefresh() {
        return canRefresh;
    }

    public void setCanRefresh(boolean canRefresh) {
        this.canRefresh = canRefresh;
    }

    public boolean isHasFootPrint() {
        return hasFootPrint;
    }

    public void setHasFootPrint(boolean hasFootPrint) {
        this.hasFootPrint = hasFootPrint;
    }

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }
}
