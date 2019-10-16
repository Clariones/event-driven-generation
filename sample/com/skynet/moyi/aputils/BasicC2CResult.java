package com.skynet.moyi.aputils;

import java.util.Date;

import com.skynet.moyi.BaseEntity;
/**
 * Basic click-to-connect result
 * @author clariones
 *
 * @param <A> 'Actor' type
 * @param <T> 'Target' type
 */
public class BasicC2CResult<A extends BaseEntity, T extends BaseEntity> {
	protected boolean success;
	protected boolean followedNow;
	protected boolean newFollowing;
	protected A actor;
	protected T target;
	protected Date lastUpdateTime;
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public boolean isFollowedNow() {
		return followedNow;
	}
	public void setFollowedNow(boolean followedNow) {
		this.followedNow = followedNow;
	}
	public boolean isNewFollowing() {
		return newFollowing;
	}
	public void setNewFollowing(boolean newFollowing) {
		this.newFollowing = newFollowing;
	}
	public A getActor() {
		return actor;
	}
	public void setActor(A actor) {
		this.actor = actor;
	}
	public T getTarget() {
		return target;
	}
	public void setTarget(T target) {
		this.target = target;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	
	
}

