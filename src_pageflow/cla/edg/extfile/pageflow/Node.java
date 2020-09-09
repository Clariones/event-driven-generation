package cla.edg.extfile.pageflow;

import clariones.tool.builder.Utils;

import java.util.HashMap;
import java.util.Map;

public class Node {
    protected String id;
    protected String name;      // 英文名
    protected String title;     // 中文名
    protected String nodeType;  // page: 页面; request: 请求; branch: 分支
    protected Boolean needLogin;    // 是否需要登录
    protected Integer cacheTimeInSecond;    // 以 秒 为单位的缓存时间. 0/null 表示不缓存
    protected Map<String, Object> extraData;    // 额外的数据 以后业务扩展的时候,自定义
    protected String parent;
    protected String fromNode;
    protected String toNode;

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
        if (name != null && name.equals("&nbsp")){
            Utils.error(name);
        }
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public Boolean getNeedLogin() {
        return needLogin;
    }

    public void setNeedLogin(Boolean needLogin) {
        this.needLogin = needLogin;
    }

    public Integer getCacheTimeInSecond() {
        return cacheTimeInSecond;
    }

    public void setCacheTimeInSecond(Integer cacheTimeInSecond) {
        this.cacheTimeInSecond = cacheTimeInSecond;
    }

    public Map<String, Object> getExtraData() {
        if(extraData == null){
            extraData = new HashMap<>();
        }
        return extraData;
    }

    public void setExtraData(Map<String, Object> extraData) {
        this.extraData = extraData;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getFromNode() {
        return fromNode;
    }

    public void setFromNode(String fromNode) {
        this.fromNode = fromNode;
    }

    public String getToNode() {
        return toNode;
    }

    public void setToNode(String toNode) {
        this.toNode = toNode;
    }
}
