package cla.edg.project.yrzx.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class HighLevelMePageFlowPiece extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
				.request("view me page").need_login()
					.got_page("me").title("我的").as_class("com.terapico.appview.MePage")
						.may_request("view my project list")
						.may_request("view my account list")
						.may_request("view my order list")
						.may_request("view my application list")
						.may_request("view my recommendation list")
						.may_request("view my emplacement list")
				
				// me 页面的navigators
				// 项目
				.request("view my project list").with_string("filter").with_last_record_id()
					.comments("查看我的项目列表").need_login()
					.when("only one").comments("只有一个项目")
						.got_page("project hall").title("项目大厅")
					.when_others().comments("正常情况")
						.got_page("project list").title("我的项目").list_of("project")
							.may_request("view project hall")


				// 账户
				.request("view my account list").with_string("filter")
					.comments("查看我的账户").need_login()
					.got_page("account list").title("我的账户").list_of("card")
						.may_request("view account detail")
				// 订单
				.request("view my order list").with_string("filter").with_last_record_id()
					.comments("查看我的订单. 订单计算后分类为: 待处理订单/已完成订单/其他/全部").need_login()
					.got_page("order list").title("我的订单").list_of("order")
						.may_request("view order detail")
				// 装修申请
				.request("view my application list").with_string("filter").with_last_record_id()
					.comments("查看我的申请").need_login()
					.got_page("application list").title("我的装修").list_of("application")
						
				// 推荐
				.request("view my recommendation list").with_string("filter").with_last_record_id()
					.comments("查看我的推荐").need_login()
					.got_page("recommendation list").title("我的推荐").list_of("recommendation")

				// 入驻申请
				.request("view my emplacement list").with_string("filter").with_last_record_id()
					.comments("查看我的入驻申请").need_login()
					.got_page("emplacement list").title("我的申请").list_of("emplacement_application")

				// 公司人员管理
				.request("view company organization").with_string("merchant id").with_last_record_id()
					.comments("查看公司的员工").need_login().no_footprint()
					.got_page("employee list").title("员工清单").list_of("user")
						.may_request("remove employee")
				.request("remove employee").with_string("employee nomination id")
					.comments("删除员工").need_login().no_footprint()
					.got_page("employee list")

				// 角色切换
				.request("view all employee nomination of me").with_last_record_id()
					.comments("列出所有的任职岗位").need_login()
					.got_page("employee nomination list").title("岗位列表").list_of("card")
						.may_request("select employee nomination")
				.request("select employee nomination").with_string("employee nomination id")
					.comments("选择一个岗位作为当前岗位")
					.got_page("employee nomination list")
				.request("logout").comments("退出当前账号").no_login().no_footprint()
					.got_page("me")

				// 账户详情
				.request("view account detail").with_string("account id").with_string("filter").with_last_record_id()
					.comments("查看某个账户的详情,带明细").need_login().no_footprint()
					.got_page("account detail").title("账户详情")
						.may_request("view account record list")
				.request("view account record list").with_string("account id").with_last_record_id()
					.comments("查看某个账户的流水").need_login().no_footprint()
					.got_page("account record list").title("账户明细").list_of("card")

				// 订单详情
				.request("view order detail").with_string("order id")
					.comments("查看订单详情")
					.got_page("order detail").title("订单详情").as_class("")
				
			;
	}
}
