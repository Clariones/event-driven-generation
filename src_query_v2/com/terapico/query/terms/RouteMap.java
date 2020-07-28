package com.terapico.query.terms;

import java.util.List;

/**
 * RouteMap: 带路由的地图.
 *
 * 基于这样一个假设: 从不同节点,或者使用不同路径,来到同一个节点, 是不同的节点, 因为 人不能两次踏进同一条河流.
 *
 * 其实很简单: 数据库中,通过不同的外键关系关联到同一张表, 代表着不同的业务含义, 因此在条件表达式中, 需要使用不同的别名.
 */
public class RouteMap {
    protected List<Path> pathList;  // Path 的列表. 一条path就是一个路由, 多条path综合起来, 会组成一个'地图' (类似战争迷雾中的已探索部分)
}
