package cla.edg.page;

import cla.edg.modelbean.*;
import cla.edg.pageflow.PageFlowScript;
import clariones.tool.builder.KV;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PageBuilder extends BasePageBuilder{
    public PageFlowScript done() {
        return parentScript;
    }
    public PageBuilder list_result_of_query(BaseModelBean queryTargetBean) {
        setQueryTargetBean(queryTargetBean);
        return this;
    }

    public PageBuilder list_of(String listName) {
        setQueryListName(listName);
        return this;
    }

    public PageBuilder split_into_tabs_by(BaseModelBean bean) {
        setTabsByBeanPath(bean.getBeanPath());
        for (EnumAttribute enumAttribute : bean.getEnumNameList()) {
            addTabInfo(enumAttribute.getLiteralName(), enumAttribute.getChineseName());
        }
        return this;
    }

    private void addTabInfo(String code, String name) {
        if (tabInfos == null){
            tabInfos = new ArrayList<>();
        }
        tabInfos.add(new KV(code, name));
    }


    public PageBuilder split_into_tabs_by(BaseAttribute attr) {
        setTabsByBeanPath(attr.getContainerBean().getBeanPath());
        return this;
    }

    public PageBuilder which_default(String defaultTabCode) {
        setDefaultTabCode(defaultTabCode);
        return this;
    }

    public PageBuilder item_can_request(String requestName) {
        setItemRequestName(requestName.trim());
        return this;
    }

    public PageBuilder pagination_by_request(String requestName) {
        setNextPageRequestName(requestName);
        return this;
    }

}
