package cla.edg.graphquery;

import cla.edg.graphquery.terms.GraphQueryDescriber;
import cla.edg.project.yourong.gen.graphquery.AccountBookItemStatus;
import cla.edg.project.yourong.gen.graphquery.AccountTitle;
import cla.edg.project.yourong.gen.graphquery.Article;
import cla.edg.project.yourong.gen.graphquery.MainOrder;
import cla.edg.project.yourong.gen.graphquery.Merchant;
import cla.edg.project.yourong.gen.graphquery.MerchantType;
import cla.edg.project.yourong.gen.graphquery.OrderStatus;
import cla.edg.project.yourong.gen.graphquery.TaskStatus;

public class YourongGraphQueryDescripter extends BaseGraphQueryDescriptor {

	public static void main(String[] args) {
		GraphQueryDescriber testee = new YourongGraphQueryDescripter();
		
		testee.pagination().with_string("employee id").with_string("status")
			.start_from().employee_nomination_with("employee id").then_employer().then_mainOrderList().then_status()
			.want().main_order().line_item().order_status()
			.search_by(
					OrderStatus.getCode().starts_with(MainOrder.getTitle())
					.or	(OrderStatus.getCode().eq("param name1")
							.and(OrderStatus.getCode().eq("param name2"))
							.and(OrderStatus.getCode().eq(AccountTitle.getCode()))
						)
					)
		.query_graph("to find articles by current employee").pagination().with_decimal("price").with_string("id")
			.start_from().employee_nomination_with("id").then_articleList().then_articleParagraphList()
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
			.start_from().employee_nomination_with("employee id").then_employer().then_taskList().then_taskStatus()
																				 .then_taskList().then_workPackage()
			.search_by(
					TaskStatus.getCode().eq("status")
					)
			
			;
	}


}