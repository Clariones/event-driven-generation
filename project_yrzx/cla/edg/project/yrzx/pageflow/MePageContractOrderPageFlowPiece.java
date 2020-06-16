package cla.edg.project.yrzx.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

/**
 * 我的页面，合同订单
 */
public class MePageContractOrderPageFlowPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
				//入口页面
				.request("select project for contract order")
					.comments("我的->合同订单-选择项目")
					.got_page("select project for contract order")

				.request("view my contract order").with_string("project id")
					.comments("我的->合同订单-选择项目-合同订单页面")
					.got_page("contract order")
				/**
				 * 超级账本
				 */
				.request("view account book").with_string("project id")
					.comments("我的->合同订单-选择项目-合同订单页面-超级账本")
					.got_page("account book")

				.request("view contract type by category").with_string("project id").with_string("category id")
					.comments("我的->合同订单-选择项目-合同订单页面-超级账本-合同台账")
					.got_page("contract type by category")
				/**
				 * 合同对账
				 */

				.request("view contract reconciliation").with_string("project id").with_string("filter")
					.comments("我的->合同订单-合同对账")
					.got_page("contract reconciliation")

				.request("view expected contract expenses and receipts").with_string("project id")
					.comments("我的->合同订单-选择项目-合同订单页面-合同预期收支")
					.got_page("expected contract expenses and receipts")

				.request("view expected contract expenses").with_string("project id").with_string("filter").with_last_record_id()
					.comments("我的->合同订单-选择项目-合同订单页面-合同预期收支-预期支出")
					.got_page("expected contract expenses")

				.request("view expected contract expense detail").with_string("item id")
					.comments("我的->合同订单-选择项目-合同订单页面-合同预期收支-预期支出-预期支出详情")
					.got_page("expected contract expense detail")
				.request("create contract payment application").with_string("item id")
					.comments("我的->合同订单-选择项目-合同订单页面-合同预期收支-预期支出-预期支出详情-创建付款申请")
					.got_page("contract payment application detail")

				.request("view contract payment application").with_string("item id")
					.comments("我的->合同订单-选择项目-合同订单页面-合同对账-详情")
					.got_page("contract payment application detail")

				.request("view expected contract receipts").with_string("project id").with_string("filter").with_last_record_id()
					.comments("我的->合同订单-选择项目-合同订单页面-合同预期收支-预期收入")
					.got_page("expected contract receipts")

				.request("view expected contract receipt detail").with_string("item id")
					.comments("我的->合同订单-选择项目-合同订单页面-合同预期收支-预期收入-预期收入详情")
					.got_page("expected contract receipt detail")



				//合同付款
				.request("view contract payment").with_string("project id")
					.comments("我的->合同订单-选择项目-合同订单页面-合同付款")
					.got_page("contract payment")
				//合同收款
				.request("view contract receipts").with_string("project id")
					.comments("我的->合同订单-选择项目-合同订单页面-合同收款")
					.got_page("contract receipts")

				//合同台账
				.request("view contract record list")

							.got_page("contract record list")
						//附加签证、合同增补台账
						.request("view contract supplement record list")
							.comments("我的->合同订单-附加签证、合同增补台账")
							.got_page("contract supplement record list")


//
//				// tab->劳务订单
//						//劳务合同台账
//						.request("view labor contract record list")
//							.comments("我的-合同订单-劳务订单-劳务合同台账")
//							.got_page("labor contract record list")
//						//劳务合同付款
//						.request("view labor contract payment")
//							.comments("我的-合同订单-劳务订单-劳务合同付款")
//							.got_page("labor contract payment")
//						//劳务合同收款
//						.request("view labor contract receipts")
//							.comments("我的-合同订单-劳务订单-劳务合同收款")
//							.got_page("labor contract receipts")

				
			;
	}
}
