package ${base_package}.aputils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ${base_package}.${user_context_class};
import ${base_package}.SmartList;
import ${base_package}.${record_class?lower_case}.${record_class};
import ${base_package}.${target_class?lower_case}.${target_class};
import ${base_package}.${actor_class?lower_case}.${actor_class};
import com.terapico.utils.TaskUtil;

public class BaseFavorite${target_class}Of${actor_class}Util {
	protected static final Map<String, Object> EO = new HashMap<>();
	
	/**
	 * 关注
	 * @param ctx 用户上下文
	 * @param actor${actor_class} 进行"关注"行为的主动对象
	 * @param target${target_class} 被“关注”的对象
	 * @return 关注结果
	 * @throws Exception
	 */
	public ${target_class}Of${actor_class}C2CResult follow(${user_context_class} ctx, ${actor_class} actor${actor_class}, ${target_class} target${target_class}) throws Exception {
		${record_class} record = loadRecord(ctx, actor${actor_class}.getId(), target${target_class}.getId());
		${target_class}Of${actor_class}C2CResult result = new ${target_class}Of${actor_class}C2CResult();
		result.setActor(actor${actor_class});
		result.setTarget(target${target_class});
		result.setFollowedNow(true);
		if (record == null) {
			// 之前没有关注过，现在直接创建记录。这是最简单的情况
			record = createRecord(ctx, actor${actor_class}.getId(), target${target_class}.getId(), true);
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
	 * @param actor${actor_class} 进行"关注"行为的主动对象
	 * @param target${target_class} 被“关注”的对象
	 * @return 关注结果
	 * @throws Exception
	 */
	public ${target_class}Of${actor_class}C2CResult unfollow(${user_context_class} ctx, ${actor_class} actor${actor_class}, ${target_class} target${target_class}) throws Exception {
		${record_class} record = loadRecord(ctx, actor${actor_class}.getId(), target${target_class}.getId());
		${target_class}Of${actor_class}C2CResult result = new ${target_class}Of${actor_class}C2CResult();
		result.setActor(actor${actor_class});
		result.setTarget(target${target_class});
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
	 * 根据${actor_model}(主动对象)和${target_model}(关注对象),获取其记录
	 * @param ctx
	 * @param actorId
	 * @param targetId
	 * @return
	 */
	public ${record_class} loadRecord(${user_context_class} ctx, String actorId, String targetId) throws Exception {
		String sql = "select * from ${record_model}_data where actor_${actor_model}=? and target_${target_model}=?";
		SmartList<${record_class}>list = ctx.getDAOGroup().get${record_class}DAO().queryList(sql, actorId, targetId);
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.last();
	}
	
	/**
	 * 根据${actor_model}(主动对象)加载记录列表
	 * @param ctx
	 * @param actorId
	 * @param available
	 * @param lastRecordId 从此记录后面开始加载。 null表示从id最大的开始
	 * @param pageSize 是否分页。 null 表示不分页，一次性加载。 非null值表示一个页面加载多少条记录
	 * @return
	 * @throws Exception
	 */
	public SmartList<${record_class}> loadByActor${actor_class}(${user_context_class} ctx, String actorId, Boolean available, String lastRecordId, Integer pageSize) throws Exception {
		List<Object> params = new ArrayList<>();
		String sql = prepareForLoadByActor${actor_class}(ctx, params, actorId, available,lastRecordId,pageSize);
		SmartList<${record_class}>list = ctx.getDAOGroup().get${record_class}DAO().queryList(sql, params.toArray());
		if (list != null) {
			if (pageSize == null) {
				list.setRowsPerPage(0);
				ctx.setLastRecordId(null);
			}else {
				list.setRowsPerPage(pageSize);
				ctx.setLastRecordId(list.size()>pageSize?list.last().getId():null);
			}
		}
		enhanceList(ctx, "loadByActor${actor_class}", list);
		return list;
	}
	protected String prepareForLoadByActor${actor_class}(${user_context_class} ctx, List<Object> params, String actorId, Boolean available, String lastRecordId, Integer pageSize) throws Exception {
		String sql = "select * from ${record_model}_data where actor_${actor_model}=? ";
		params.add(actorId);
		if (available != null) {
			params.add(available);
			sql += " and available=? ";
		}
		if (lastRecordId != null) {
			params.add(lastRecordId);
			sql += " and id<=? ";
		}
		sql += " order by id desc ";
		if (pageSize != null) {
			params.add(pageSize+1);
			sql += " limit ?";
		}
		return sql;
	}
	/**
	 * 根据${target_model}(被关注对象)加载记录列表
	 * @param ctx
	 * @param targetId
	 * @param available
	 * @param lastRecordId 从此记录后面开始加载。 null表示从id最大的开始
	 * @param pageSize 是否分页。 null 表示不分页，一次性加载。 非null值表示一个页面加载多少条记录
	 * @return
	 * @throws Exception
	 */
	public SmartList<${record_class}> loadByTarget${target_class}(${user_context_class} ctx, String targetId, Boolean available, String lastRecordId, Integer pageSize) throws Exception {
		List<Object> params = new ArrayList<>();
		String sql = prepareForLoadByTarget${target_class}(ctx, params, targetId, available, lastRecordId, pageSize);
		SmartList<${record_class}>list = ctx.getDAOGroup().get${record_class}DAO().queryList(sql, params.toArray());
		if (list != null) {
			if (pageSize == null) {
				list.setRowsPerPage(0);
				ctx.setLastRecordId(null);
			}else {
				list.setRowsPerPage(pageSize);
				ctx.setLastRecordId(list.size()>pageSize?list.last().getId():null);
			}
		}
		enhanceList(ctx, "loadByTarget${target_class}", list);
		return list;
	}
	protected String prepareForLoadByTarget${target_class}(${user_context_class} ctx, List<Object> params, String targetId, Boolean available, String lastRecordId, Integer pageSize) throws Exception {
		String sql = "select * from ${record_model}_data where target_${target_model}=? ";
		params.add(targetId);
		if (available != null) {
			params.add(available);
			sql += " and available=? ";
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
		return sql;
	}
	
	/**
	 * 获得${actor_model}(主动对象)关注的数量
	 * @param ctx
	 * @param actorId
	 * @return
	 * @throws Exception
	 */
	public int countByActor${actor_class}(${user_context_class} ctx, String actorId) throws Exception {
		List<Object> params = new ArrayList<>();
		String sql = "select count(*) from ${record_model}_data where actor_${actor_model}=? and available=?";
		params.add(actorId);
		params.add(true);
		return ctx.getDAOGroup().get${record_class}DAO().count(sql, params.toArray());
	}
	
	/**
	 * 获得${target_model}(被关注对象)关注的数量
	 * @param ctx
	 * @param actorId
	 * @return
	 * @throws Exception
	 */
	public int countByTarget${target_class}(${user_context_class} ctx, String actorId) throws Exception {
		List<Object> params = new ArrayList<>();
		String sql = "select count(*) from ${record_model}_data where target_${target_model}=? and available=?";
		params.add(actorId);
		params.add(true);
		return ctx.getDAOGroup().get${record_class}DAO().count(sql, params.toArray());
	}
	
	protected void enhanceList(${user_context_class} ctx, String string, SmartList<${record_class}> list) throws Exception {
		// by default, nothing to enhance
	}

	/*
	 * 创建记录对象
	 */
	protected ${record_class} createRecord(${user_context_class} ctx, String actorId, String targetId, boolean available) throws Exception {
		return ctx.getManagerGroup().get${record_class}Manager().create${record_class}(ctx, actorId,targetId, available);
	}
	/*
	 * 保存记录
	 */
	protected void saveRecord(${user_context_class} ctx, ${record_class} record) throws Exception{
		${record_class} dbData;
		String key = String.format("%s_%s", record.getInternalType(), record.getId());
		synchronized(TaskUtil.getLockByKey(ctx, key)) {
			dbData = ctx.getDAOGroup().get${record_class}DAO().load(record.getId(), EO);
			dbData.updateActor${actor_class}(record.getActor${actor_class}());
			dbData.updateTarget${target_class}(record.getTarget${target_class}());
			dbData.updateAvailable(record.getAvailable());
			dbData.updateLastUpdateTime(ctx.now());
			ctx.getManagerGroup().get${record_class}Manager().internalSave${record_class}(ctx, dbData, EO);
		}
		dbData.mergePrimitiveDataTo(record);
	}
}

