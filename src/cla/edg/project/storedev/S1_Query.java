package cla.edg.project.storedev;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S1_Query extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
//				.query("recommended_store").list_of("user").pagination().with_string("user id").with_string("filter")
//					.comments("新店推荐列表")

				.query("recommended_store_audit_task").list_of("homepage").no_pagination().with_string("user id")
				.comments("登录后首页下方的列表内容,按指定的优先级选取5条记录")

				.query("recommended_store_audit_task").list_of("user").pagination().with_string("user id").with_string("filter")
				.comments("不同状态的审批记录列表")

//				.query("personal_achievement_monthly").list_of("all").pagination().comments("开店排名")

				.query("monthly_statistics_item").list_of("current user").with_string("current user id")

				.query("province").list_of("all").no_pagination().comments("查询所有省市区数据")

				.query("giant_area").list_of("all").no_pagination().comments("查询所有大中小区数据")



			;
	}
}
