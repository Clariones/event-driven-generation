package com.skynet.moyi.favoriteshopofuser;

import java.util.Date;

import com.skynet.moyi.BaseEntity;
import com.skynet.moyi.moyishop.MoyiShop;
import com.skynet.moyi.moyiuser.MoyiUser;

public class FavoriteShopOfUser extends BaseEntity {
	protected Date lastUpdateTime;
	protected MoyiUser actorMoyiUser;
	protected MoyiShop targetMoyiShop;
	protected boolean available;
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public void updateLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public MoyiUser getActorMoyiUser() {
		return actorMoyiUser;
	}
	public void setActorMoyiUser(MoyiUser actorMoyiUser) {
		this.actorMoyiUser = actorMoyiUser;
	}
	public void updateActorMoyiUser(MoyiUser actorMoyiUser) {
		this.actorMoyiUser = actorMoyiUser;
	}
	public MoyiShop getTargetMoyiShop() {
		return targetMoyiShop;
	}
	public void setTargetMoyiShop(MoyiShop targetMoyiShop) {
		this.targetMoyiShop = targetMoyiShop;
	}
	public void updateTargetMoyiShop(MoyiShop targetMoyiShop) {
		this.targetMoyiShop = targetMoyiShop;
	}
	public boolean getAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public void updateAvailable(boolean available) {
		this.available = available;
	}
	
}
