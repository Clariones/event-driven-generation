package com.terapico.query.terms;

/**
 * 节点. 只有模型中,作为一个 Type 存在的定义,才有一个节点.
 *
 * 节点是业务层面中,代表某个业务含义的聚合体. 所以像 金额 这样的点,不是节点.
 * 此节点定义和图数据库的节点定义不一致. 本类是提供给业务建模人员使用的,所以
 * 节点的定义,是以(主要)业务的角度来定义的.
 */
public class Node {
    protected String name;      // 节点的正式名称
    protected String aliasName; // 别名, 例如 "select * from X_data as T1" 里的 T1
    protected Attribute attribute;  // 作为端点的属性. 可能是null, 表示到节点为止. 通常这个表示外键

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }
}
