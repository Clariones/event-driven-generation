package cla.edg.project.storedev;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.storedev.gen.graphquery.MODEL;

public class S1_Query extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
//				.query("recommended_store").list_of("user").pagination().with_string("user id").with_string("filter")
//					.comments("新店推荐列表")

				.query("recommended_store_audit_task").list_of("homepage").no_pagination().with_string("user id")
				.comments("登录后首页下方的列表内容,按指定的优先级选取5条记录")

				.query("recommended_store_audit_task").list_of("user").pagination().with_string("user id")
				.with_string("filter").comments("不同状态的审批记录列表")

//				.query("personal_achievement_monthly").list_of("all").pagination().comments("开店排名")

				.query("monthly_statistics_item").list_of("current user").with_string("current user id")

				.query("province").list_of("all").no_pagination().comments("查询所有省市区数据")

				.query("operation_company").list_of("all").no_pagination().comments("查询所有运营公司大中小区数据")

				.query("store_developer").list_of("audit type").with_string("operation company id")
				.with_string("audit type").no_pagination()

				.query(MODEL.recommendedStore().getModelTypeName()).list_of("all").no_pagination()

				.query(MODEL.recommendedStore().getModelTypeName()).list_of("user").with_string("user id")
					.do_it_as().where(MODEL.recommendedStore().initiator().eq("${user id}"))

				.query(MODEL.basicCalculationDataSetting().getModelTypeName()).list_of("all")

				.query(MODEL.storeDeveloper().getModelTypeName()).which("audit type in operation company")
				.with_string("operation company id").with_string("audit type").comments("查询某公司下某种参与审核类型的门店开发人员")
				.do_it_as().where(
						MODEL.storeDeveloper().operationCompanyRoleAssignmentList().operationCompany().eq("${operation company id}"),
						MODEL.storeDeveloper().operationCompanyRoleAssignmentList().operationCompany().companyAuditRoleRelationshipList().auditType().eq("${audit type}")
						)
				//queryIncompleteUpdateChangeRequestByStoreId

				.find(MODEL.changeRequest().getModelTypeName()).which("incomplete update")
					.with_string("store id").with_boolean("is completed")
					.do_it_as().where(MODEL.changeRequest().recommendedStoreHistoryList().recommendedStore().eq("${store id}"),
							MODEL.changeRequest().requestType().eq(MODEL.changeRequestType().UPDATE_APPLICATION),
							MODEL.changeRequest().requestCompleted().eq("${is completed}")
							)

//				.query(MODEL.monthlyStatistics().getModelTypeName()).which("all").with_date("start date").with_date("end date")
//					.do_it_as().where(MODEL.monthlyStatistics().time().bigger_or_eq("${start date}")
//							,MODEL.monthlyStatistics().time().less("${end date}")
//							)

				.find(MODEL.recommendedStoreAuditTask().getModelTypeName()).which("user by store id").with_string("user id").with_string("store id")
					.do_it_as().where(MODEL.recommendedStoreAuditTask().responsibleStoreDeveloper().eq("${user id}"),MODEL.recommendedStoreAuditTask().recommendedStore().eq("${store id}"))

				.query(MODEL.recommendedStoreAuditTask().getModelTypeName()).which("other user by store id").with_string("user id").with_string("store id")
					.do_it_as().where(MODEL.recommendedStoreAuditTask().responsibleStoreDeveloper().not("${user id}"),MODEL.recommendedStoreAuditTask().recommendedStore().eq("${store id}"))

				.query(MODEL.monthlyStatistics().getModelTypeName()).which("selected months").with_date("from date").with_date("to date")
					.do_it_as().where(MODEL.monthlyStatistics().time().bigger_or_eq("${from date}"),
							MODEL.monthlyStatistics().time().less("${to date}")
							)

				.query(MODEL.monthlyStatisticsItem().getModelTypeName()).which("selected months").with_date("from date").with_date("to date")
				.do_it_as().where(MODEL.monthlyStatisticsItem().time().bigger_or_eq("${from date}"),
						MODEL.monthlyStatisticsItem().time().less("${to date}")
						)

				.find(MODEL.storeDeveloper().getModelTypeName()).which("wechat user id").with_string("wechat user id")
					.do_it_as().where(MODEL.storeDeveloper().wechatWorkLoginInfoList().userId().eq("${wechat user id}"))


				.find(MODEL.roleType().getModelTypeName()).which("name").with_string("name")
					.do_it_as().where(MODEL.roleType().name().eq("${name}"))

				.query(MODEL.operationCompanyReport().getModelTypeName()).which("selected months").with_date("from date").with_date("to date")
					.do_it_as().where(MODEL.operationCompanyReport().lastUpdateTime().bigger_or_eq("${from date}"),
						MODEL.operationCompanyReport().lastUpdateTime().less("${to date}")
						)
					.find(MODEL.operationCompanyReport().getModelTypeName()).which("name").with_string("name")
					.do_it_as().where(MODEL.operationCompanyReport().giantArea().eq("${name}")
						)


					;

	}
}
