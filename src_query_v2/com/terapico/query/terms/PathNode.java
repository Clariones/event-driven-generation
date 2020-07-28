package com.terapico.query.terms;

/**
 * 一种确定是"从其他节点过来的 节点".
 *
 * 相对 节点 而言,多了路径信息.
 */
public class PathNode extends Node {
    protected String enterWayName;   // 从哪条路 进入 本node
    protected boolean enterByMe;  // 如果 A.b -> B, 那么 对B节点来说, enterByMe = false

    protected String leaveWayName;   // 从哪条路 离开 本node
    protected boolean leaveByMe;  // 如果 A.b -> B, 那么 对A节点来说, leaveByMe = true

    public String getEnterWayName() {
        return enterWayName;
    }

    public void setEnterWayName(String enterWayName) {
        this.enterWayName = enterWayName;
    }

    public boolean isEnterByMe() {
        return enterByMe;
    }

    public void setEnterByMe(boolean enterByMe) {
        this.enterByMe = enterByMe;
    }

    public String getLeaveWayName() {
        return leaveWayName;
    }

    public void setLeaveWayName(String leaveWayName) {
        this.leaveWayName = leaveWayName;
    }

    public boolean isLeaveByMe() {
        return leaveByMe;
    }

    public void setLeaveByMe(boolean leaveByMe) {
        this.leaveByMe = leaveByMe;
    }
}
