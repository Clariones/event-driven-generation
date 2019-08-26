package cla.edg.graphquery;

import cla.edg.graphquery.terms.GraphQueryDescriber;
import cla.edg.project.yourong.gen.graphquery.AccountBookItemStatus;
import cla.edg.project.yourong.gen.graphquery.AccountTitle;
import cla.edg.project.yourong.gen.graphquery.Article;
import cla.edg.project.yourong.gen.graphquery.EmployeeNomination;
import cla.edg.project.yourong.gen.graphquery.MainOrder;
import cla.edg.project.yourong.gen.graphquery.Merchant;
import cla.edg.project.yourong.gen.graphquery.MerchantType;
import cla.edg.project.yourong.gen.graphquery.OrderStatus;
import cla.edg.project.yourong.gen.graphquery.TaskStatus;

public class YourongGraphQueryDescripter extends BaseGraphQueryDescriptor {

	public static void main(String[] args) {
		GraphQueryDescriber testee = new YourongGraphQueryDescripter();
		
		testee.pagination().with_string("employee id").with_string("status")
			.start_from().employee_nomination_with("employee id")
			.through(	EmployeeNomination.getEmployee(),
						Merchant.getMainOrderList(),
						MainOrder.getStatus()
					)
			.want().main_order().line_item().order_status()
			.search_by(
					OrderStatus.getCode().starts_with(MainOrder.getTitle())
					.or	(OrderStatus.getCode().eq("param name1")
							.and(OrderStatus.getCode().eq("param name2"))
							.and(OrderStatus.getCode().eq(AccountTitle.getCode()))
						)
					)
		.query_graph("to find articles by current employee").pagination().with_decimal("price").with_string("id")
			.comments("根据当前的用户信息, 查找其在 我的作品 中看到的文章列表")
			.start_from().employee_nomination_with("id")
			.through(	EmployeeNomination.getEmployee(),
					Merchant.getMainOrderList(),
					MainOrder.getStatus()
				)
			.want().article(/*文章*/).article_category(/*文章分类*/).article_paragraph(/*文章段落列表*/).employee_nomination(/*作者*/)
			.search_by(
					MerchantType.getCode().eq("#Personal")
					.and(
							Article.getAuthorName().contains(Merchant.getName())
							.or(Article.getAuthorName().starts_with(Merchant.getName()))
							.or(Article.getAuthorName().ends_with(Merchant.getName()))
						)
					)
		.query_graph("for tasks opening and assigned to my company").pagination().with_string("employee id").with_string("status")
			.want().task().work_package().project()
			.start_from().employee_nomination_with("employee id")
			.search_by(
					TaskStatus.getCode().eq("status")
					)
			
			;
	}


}