package cla.edg.pageflow;

import cla.edg.modelbean.BaseAttribute;
import cla.edg.modelbean.BaseModelBean;
import cla.edg.modelbean.BeanRelation;
import cla.edg.routemap.MeetingPoint;

public class SortingInfo {
	protected MeetingPoint<BaseModelBean, BeanRelation> meetingPoint;
	protected boolean ascDirection;
	protected Object sortField;
	protected boolean userExpr = false;
	
	public boolean isUserExpr() {
		return userExpr;
	}
	public void setUserExpr(boolean userExpr) {
		this.userExpr = userExpr;
	}
	public Object getSortField() {
		return sortField;
	}
	public void setSortField(Object sortField) {
		this.sortField = sortField;
	}
	public MeetingPoint<BaseModelBean, BeanRelation> getMeetingPoint() {
		return meetingPoint;
	}
	public void setMeetingPoint(MeetingPoint<BaseModelBean, BeanRelation> meetingPoint) {
		this.meetingPoint = meetingPoint;
	}
	public boolean isAscDirection() {
		return ascDirection;
	}
	public void setAscDirection(boolean ascDirection) {
		this.ascDirection = ascDirection;
	}
	
	public String getSortingFieldName() {
		if (sortField instanceof BaseAttribute) {
			BaseAttribute attr = (BaseAttribute) sortField;
			return attr.getName();
		}
		
		if (sortField instanceof BaseModelBean) {
			BaseModelBean bean = (BaseModelBean)sortField;
			if (bean.isReferDirection()) {
				return bean.getName();
			}else {
				return "id";
			}
		}
		throw new RuntimeException("计算排序字段名称时,超出预期");
	}
	
	
}
