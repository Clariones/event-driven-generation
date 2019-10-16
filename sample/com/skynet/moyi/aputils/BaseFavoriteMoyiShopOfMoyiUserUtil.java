package com.skynet.moyi.aputils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.skynet.moyi.CustomMoyiUserContextImpl;
import com.skynet.moyi.SmartList;
import com.skynet.moyi.favoriteshopofuser.FavoriteShopOfUser;
import com.skynet.moyi.moyishop.MoyiShop;
import com.skynet.moyi.moyiuser.MoyiUser;
import com.terapico.utils.TaskUtil;

public class BaseFavoriteMoyiShopOfMoyiUserUtil {
	protected static final Map<String, Object> EO = new HashMap<>();
	
	/**
	 * 关注
	 * @param ctx 用户上下文
	 * @param actorMoyiUser 进行"关注"行为的主动对象
	 * @param targetMoyiShop 被“关注”的对象
	 * @return 关注结果
	 * @throws Exception
	 */
	public MoyiShopOfMoyiUserC2CResult follow(CustomMoyiUserContextImpl ctx, MoyiUser actorMoyiUser, MoyiShop targetMoyiShop) throws Exception {
		FavoriteShopOfUser record = loadRecord(ctx, actorMoyiUser.getId(), targetMoyiShop.getId());
		MoyiShopOfMoyiUserC2CResult result = new MoyiShopOfMoyiUserC2CResult();
		result.setActor(actorMoyiUser);
		result.setTarget(targetMoyiShop);
		result.setFollowedNow(true);
		if (record == null) {
			// 之前没有关注过，现在直接创建记录。这是最简单的情况
			record = createRecord(ctx, actorMoyiUser.getId(), targetMoyiShop.getId(), true);
			result.setSuccess(true);
			result.setNewFollowing(true);
			result.setLastUpdateTime(record.getLastUpdateTime());
			return result;
		}
		
		if (record.getAvailable()) {
			// 已经关注了，直接返回
			result.setSuccess(true);
			result.setNewFollowing(false);
			result.setLastUpdateTime(record.getLastUpdateTime());
			return result;
		}
		
		// 有记录，没关注，更新数据库
		record.updateAvailable(true);
		saveRecord(ctx, record);
		result.setSuccess(true);
		result.setNewFollowing(true);
		result.setLastUpdateTime(record.getLastUpdateTime());
		return result;
	}

	/**
	 * 取消关注
	 * @param ctx 用户上下文
	 * @param actorMoyiUser 进行"关注"行为的主动对象
	 * @param targetMoyiShop 被“关注”的对象
	 * @return 关注结果
	 * @throws Exception
	 */
	public MoyiShopOfMoyiUserC2CResult unfollow(CustomMoyiUserContextImpl ctx, MoyiUser actorMoyiUser, MoyiShop targetMoyiShop) throws Exception {
		FavoriteShopOfUser record = loadRecord(ctx, actorMoyiUser.getId(), targetMoyiShop.getId());
		MoyiShopOfMoyiUserC2CResult result = new MoyiShopOfMoyiUserC2CResult();
		result.setActor(actorMoyiUser);
		result.setTarget(targetMoyiShop);
		result.setFollowedNow(false);
		if (record == null) {
			// 之前没有关注过，现在也无需创建记录。
			result.setSuccess(true);
			result.setNewFollowing(false);
			result.setLastUpdateTime(ctx.now());
			return result;
		}
		if (record.getAvailable()) {
			// 已经关注了，取消返回
			record.updateAvailable(false);
			saveRecord(ctx, record);
			result.setSuccess(true);
			result.setNewFollowing(false);
			result.setLastUpdateTime(record.getLastUpdateTime());
			return result;
		}
		// 有记录，没关注，直接可以返回了
		result.setSuccess(true);
		result.setNewFollowing(false);
		result.setLastUpdateTime(record.getLastUpdateTime());
		return result;
	}

	/**
	 * 根据moyi_user(主动对象)和moyi_shop(关注对象),获取其记录
	 * @param ctx
	 * @param actorId
	 * @param targetId
	 * @return
	 */
	public FavoriteShopOfUser loadRecord(CustomMoyiUserContextImpl ctx, String actorId, String targetId) throws Exception {
		String sql = "select * from favorite_shop_of_user_data where actor_moyi_user=? and target_moyi_shop=?";
		SmartList<FavoriteShopOfUser>list = ctx.getDAOGroup().getFavoriteShopOfUserDAO().queryList(sql, actorId, targetId);
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.last();
	}
	
	/**
	 * 根据moyi_user(主动对象)加载记录列表
	 * @param ctx
	 * @param actorId
	 * @param avialable
	 * @param lastRecordId 从此记录后面开始加载。 null表示从id最大的开始
	 * @param pageSize 是否分页。 null 表示不分页，一次性加载。 非null值表示一个页面加载多少条记录
	 * @return
	 * @throws Exception
	 */
	public SmartList<FavoriteShopOfUser> loadByActorMoyiUser(CustomMoyiUserContextImpl ctx, String actorId, Boolean avialable, String lastRecordId, Integer pageSize) throws Exception {
		List<Object> params = new ArrayList<>();
		String sql = "select * from favorite_shop_of_user_data where actor_moyi_user=? ";
		params.add(actorId);
		if (avialable != null) {
			params.add(avialable);
			sql += " and avialable=? ";
		}
		if (lastRecordId != null) {
			params.add(lastRecordId);
			sql += " and id<? ";
		}
		sql += " order by id desc ";
		if (pageSize != null) {
			params.add(pageSize+1);
			sql += " limit ?";
		}
		SmartList<FavoriteShopOfUser>list = ctx.getDAOGroup().getFavoriteShopOfUserDAO().queryList(sql, params.toArray());
		enhanceList(ctx, "loadByActorMoyiUser", list);
		return list;
	}
	
	/**
	 * 根据moyi_shop(被关注对象)加载记录列表
	 * @param ctx
	 * @param targetId
	 * @param avialable
	 * @param lastRecordId 从此记录后面开始加载。 null表示从id最大的开始
	 * @param pageSize 是否分页。 null 表示不分页，一次性加载。 非null值表示一个页面加载多少条记录
	 * @return
	 * @throws Exception
	 */
	public SmartList<FavoriteShopOfUser> loadByTargetMoyiShop(CustomMoyiUserContextImpl ctx, String targetId, Boolean avialable, String lastRecordId, Integer pageSize) throws Exception {
		List<Object> params = new ArrayList<>();
		String sql = "select * from favorite_shop_of_user_data where target_moyi_shop=? ";
		params.add(targetId);
		if (avialable != null) {
			params.add(avialable);
			sql += " and avialable=? ";
		}
		if (lastRecordId != null) {
			params.add(lastRecordId);
			sql += " and id<? ";
		}
		sql += " order by id desc ";
		if (pageSize != null) {
			params.add(pageSize+1);
			sql += " limit ?";
		}
		SmartList<FavoriteShopOfUser>list = ctx.getDAOGroup().getFavoriteShopOfUserDAO().queryList(sql, params.toArray());
		enhanceList(ctx, "loadByTargetMoyiShop", list);
		return list;
	}
	
	/**
	 * 获得moyi_user(主动对象)关注的数量
	 * @param ctx
	 * @param actorId
	 * @return
	 * @throws Exception
	 */
	public int countByActorMoyiUser(CustomMoyiUserContextImpl ctx, String actorId) throws Exception {
		List<Object> params = new ArrayList<>();
		String sql = "select count(*) from favorite_shop_of_user_data where actor_moyi_user=? and avialable=?";
		params.add(actorId);
		params.add(true);
		return ctx.getDAOGroup().getFavoriteShopOfUserDAO().count(sql, params.toArray());
	}
	
	/**
	 * 获得moyi_shop(被关注对象)关注的数量
	 * @param ctx
	 * @param actorId
	 * @return
	 * @throws Exception
	 */
	public int countByTargetMoyiShop(CustomMoyiUserContextImpl ctx, String actorId) throws Exception {
		List<Object> params = new ArrayList<>();
		String sql = "select count(*) from favorite_shop_of_user_data where target_moyi_shop=? and avialable=?";
		params.add(actorId);
		params.add(true);
		return ctx.getDAOGroup().getFavoriteShopOfUserDAO().count(sql, params.toArray());
	}
	
	protected void enhanceList(CustomMoyiUserContextImpl ctx, String string, SmartList<FavoriteShopOfUser> list) {
		// by default, nothing to enhance
	}

	/*
	 * 创建记录对象
	 */
	protected FavoriteShopOfUser createRecord(CustomMoyiUserContextImpl ctx, String actorId, String targetId, boolean available) {
		return ctx.getManagerGroup().getFavoriteShopOfUserManager().createFavoriteShopOfUser(ctx, actorId,targetId, available);
	}
	/*
	 * 保存记录
	 */
	protected void saveRecord(CustomMoyiUserContextImpl ctx, FavoriteShopOfUser record) {
		FavoriteShopOfUser dbData;
		String key = String.format("%s_%s", record.getInternalType(), record.getId());
		synchronized(TaskUtil.getLockByKey(ctx, key)) {
			dbData = ctx.getDAOGroup().getFavoriteShopOfUserDAO().load(record.getId(), EO);
			dbData.updateActorMoyiUser(record.getActorMoyiUser());
			dbData.updateTargetMoyiShop(record.getTargetMoyiShop());
			dbData.updateAvailable(record.getAvailable());
			dbData.updateLastUpdateTime(ctx.now());
			ctx.getManagerGroup().getFavoriteShopOfUserManager().internalSave(dbData, EO);
		}
		dbData.mergePrimitiveDataTo(record);
	}
}


