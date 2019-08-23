package cla.edg.graphquery;

import cla.edg.graphquery.terms.GraphQueryDescriber;
import cla.edg.project.yourong.gen.graphquery.AccountBookItemStatus;
import cla.edg.project.yourong.gen.graphquery.MainOrder;
import cla.edg.project.yourong.gen.graphquery.Merchant;
import cla.edg.project.yourong.gen.graphquery.OrderStatus;

public class YourongGraphQueryDescripter extends BaseGraphQueryDescriptor {

	public static void main(String[] args) {
		GraphQueryDescriber testee = new YourongGraphQueryDescripter();
//		testee.pagination().with_boolean("adas").with_double("dafas")
//			.start_from().merchant().then_type()
//			.want().employee_nomination().and_merchant()
//			.search_by()
//				.and(q->{
//						q.when_employee_nomination().id().eq("asdfa")
//						.when_employee_nomination().id().less_then().merchant().name()
//						.or(q2->{
//							});
//					})
//		;
		
		
		testee.pagination().with_string("employee id").with_string("status")
			.start_from().employee_nomination("employee id").then_employer().then_mainOrderList().then_status()
			.want().main_order().line_item().order_status()
			.search_by(
					OrderStatus.getCode().starts_with(MainOrder.getTitle())
					.or	(OrderStatus.getCode().eq("param name1")
							.and(OrderStatus.getCode().eq("param name2"))
							.and(OrderStatus.getCode().eq("param name3"))
						)
					)
			
//				.and(q -> {	q
//					.when_order_status().code().eq("status")
//					// OrderStatus.whenCode().eq(AccountBookItemStatus.getName()),
//					// OrderStatus.whenCode().eq(AccountBookItemStatus.getName()),
//					// or (
//					//     	OrderStatus.whenCode().eq(AccountBookItemStatus.getName()),
//					//		OrderStatus.whenCode().eq(AccountBookItemStatus.getName())
//					// )
//					.when_employee_nomination().createTime().before(AccountBookItemStatus.getName())
//					.or(q1 -> {	q1
//						.when_account_title().name().contains(Merchant.getName())
//						.when_merchant().contactAddress().is_not_null();
//					})
//					;
//				})
			;
	}


}