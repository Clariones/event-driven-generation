package poc.cla.serachscript;

import poc.cla.modelbean.MODEL;

public class Test1 {
	public static void main(String[] args) {
		Script a = test().search(MODEL.Company()).for_many().need_pagination()
				.where(MODEL.Company().order().eq(MODEL.User())
						.and (MODEL.Order().seller().eq(MODEL.Order().buyer())))
				
				
				
				
				.where_any(MODEL.Company().order().eq(MODEL.User())
						.and (MODEL.Company().order().eq(MODEL.User())))
				
				;
	}

	private static Script test() {
		return new Script();
	}
}
