package cla.edg.page;

import cla.edg.modelbean.BaseModelBean;
import cla.edg.modelbean.BeanPath;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.QueryInfo;
import cla.edg.project.saleschain.gen.dbquery.KeypairIdentity;
import clariones.tool.builder.BaseScriptElement;
import clariones.tool.builder.KV;
import clariones.tool.builder.utils.InternalNaming;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BasePageBuilder extends BaseScriptElement {
    protected PageFlowScript parentScript;
    protected BaseModelBean queryTargetBean;
    protected QueryInfo relatedQuery;
    protected String queryListName;
    protected BeanPath tabsByBeanPath;
    protected String defaultTabCode;
    protected String itemRequestName;
    protected String nextPageRequestName;
    protected List<KV<String, String>> tabInfos;

    public BaseModelBean getQueryTargetBean() {
        return queryTargetBean;
    }

    public void setQueryTargetBean(BaseModelBean queryTargetBean) {
        this.queryTargetBean = queryTargetBean;
    }

    public PageFlowScript getParentScript() {
        return parentScript;
    }

    public void setParentScript(PageFlowScript parentScript) {
        this.parentScript = parentScript;
    }

    public String getQueryListName() {
        return queryListName;
    }

    public void setQueryListName(String queryListName) {
        this.queryListName = queryListName;
    }

    public QueryInfo getRelatedQuery() {
        return relatedQuery;
    }

    public void setRelatedQuery(QueryInfo relatedQuery) {
        this.relatedQuery = relatedQuery;
    }

    public BeanPath getTabsByBeanPath() {
        return tabsByBeanPath;
    }

    public void setTabsByBeanPath(BeanPath tabsByBeanPath) {
        this.tabsByBeanPath = tabsByBeanPath;
    }

    public String getDefaultTabCode() {
        return defaultTabCode;
    }

    public void setDefaultTabCode(String defaultTabCode) {
        this.defaultTabCode = defaultTabCode;
    }

    public String getItemRequestName() {
        return itemRequestName;
    }

    public void setItemRequestName(String itemRequestName) {
        this.itemRequestName = itemRequestName;
    }

    public String getNextPageRequestName() {
        return nextPageRequestName;
    }

    public void setNextPageRequestName(String nextPageRequestName) {
        this.nextPageRequestName = nextPageRequestName;
    }


    public List<KV<String, String>> getTabInfos() {
        return tabInfos;
    }

    public void setTabInfos(List<KV<String, String>> tabInfos) {
        this.tabInfos = tabInfos;
    }

    public String getTargetQueryName(){
        return InternalNaming.makeQueryName(this.getQueryTargetBean(), this.getQueryListName());
    }
}
