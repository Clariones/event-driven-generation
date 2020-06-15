package cla.edg.project.bcex;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class S01_Examing extends PieceOfScript {

	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
				.request("update profile").with_string("name").with_string("avantar").with_string("user type")
					.comments("更新个人信息").need_login().no_footprint()
					.got_popup_page()
				.request("start exam")
					.comments("开始考试").need_login().no_footprint()
					.query("question").list_of("random").with_integer("number")
						.comments("找到随机的几个问题")
					.got_page("answer sheet").comments("答题卡页面")
						.may_request("answer question")
				.request("answer question").with_string("quiz id").with_string("answer")
					.comments("答题").need_login().no_footprint()
					.when("has more question").comments("还有题目")
						.got_page("answer sheet")
					.when("all done").comments("全部答完")
						.got_page("exam result")
				.request("view score").with_string("quiz id")
					.comments("查看成绩").need_login().no_footprint().can_refresh()
					.got_page("scoreboard")
						.comments("积分榜")
						
				.request("view fault answer")
					.comments("查看我的错题").need_login().has_footprint().can_refresh()
					.query("fault_answer").list_of("user").pagination().with_string("user id")
						.comments("查询用户的错题库")
					.got_page("fault answer list").title("我的错题").list_of("fault-answer")
						.comments("错题")
				.request("view next page fault answer").with_last_record_id()
					.comments("").need_login().no_footprint()
					.got_page("fault answer list")
					
				.request("exam fault answer").with_string("quiz id")
					.comments("错题测验")
					.got_page("fault exam").title("错题练习").as_class("com.doublechaintech.bcex.wxappservicepageview.AnswerSheetPage")
				;
						
	}
	
}
