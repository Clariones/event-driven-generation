package cla.edg.project.yrzx.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.yrzx.gen.graphquery.MODEL;

/**
 * 装修申请
 * 我的推荐
 * 入住申请
 * 的相关查询
 */
public class ApplicationAndRecommendationQueryPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		script

		/**
		 * 装修申请(我的装修)
		 */
		.query(MODEL.customerProjectApplication()).list_of("merchant").with_string("merchant id").with_string("filter").pagination()
				.comments("按状态查看merchant的装修申请")
			.do_it_as()
				.where(
						MODEL.customerProjectApplication().applicantMerchant().eq("${merchant id}"),
						MODEL.customerProjectApplication().status().eq("${filter}").optional()
				)
				.wants(MODEL.customerProjectApplication().applicantEmployee(),
						MODEL.customerProjectApplication().applicantMerchant(),
						MODEL.customerProjectApplication().propertyType(),
						MODEL.customerProjectApplication().status()
						)
		/**
		 * 我的推荐
		 */
		.query(MODEL.recommendation()).list_of("merchant").with_string("merchant id").with_string("filter").pagination()
			.do_it_as()
				.where(
						MODEL.recommendation().applicantMerchant().eq("${merchant id}"),
						MODEL.recommendation().status().eq("${filter}").optional()
				)
				.wants(
						MODEL.recommendation().applicantEmployee(),
						MODEL.recommendation().status(),
						MODEL.recommendation().applicantMerchant(),
						MODEL.recommendation().type()

						)

		/**
		 * 入住申请
		 */
		.query(MODEL.emplacementApplication()).list_of("merchant by status").with_string("merchant id").with_string("filter").pagination()
			.comments("按状态查询某个merchant发起的入驻申请")
				.do_it_as()
				.where(
						MODEL.emplacementApplication().applicantMerchant().eq("${merchant id}"),
						MODEL.emplacementApplication().status().eq("${filter}").optional()
				)
				.wants(
						MODEL.emplacementApplication().partnerType(),
						MODEL.emplacementApplication().serviceLocation(),
						MODEL.emplacementApplication().applicantMerchant(),
						MODEL.emplacementApplication().status()

				)

		;return script;
	}

}
