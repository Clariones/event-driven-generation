package cla.edg.graph;

import org.junit.Test;


import com.terapico.generator.Utils;

class InMemoryGraphTest {
	@Test
	void test() throws Exception {
		InMemoryGraph<String, String> tg = new InMemoryGraph<String, String>();
		
		tg.setNode("artwork_auction");
		tg.setNode("artwork_auction_status");
		tg.setEdge("artwork_auction", "artwork_auction_status", "status");
		
		tg.setNode("artwork_auction");
		tg.setNode("moyi_user");
		tg.setEdge("artwork_auction", "moyi_user", "owner");
		
		Edge<String, String> edge = tg.getEdge("artwork_auction", "artwork_auction_status", "status");
		System.out.println(Utils.toJson(tg, true));
	}
	
	@Test
	void test2() throws Exception {
		InMemoryGraph<String, String> tg = new InMemoryGraph<String, String>();
		
		Step<String, String> s1 = tg.addPath(null, "A", "a-b", "B");
		Step<String, String> s2 = tg.addPath(s1, "B", "b-c", "C");
		Step<String, String> s22 = tg.addPath(s1, "B", "b+c", "C");
		Step<String, String> s3 = tg.addPath(s2, "C", "c-d", "D");
		Step<String, String> s32 = tg.addPath(s22, "C", "c-d", "D");
		Step<String, String> s4 = tg.addPath(null, "A", "a-b", "B");
		Step<String, String> s5 = tg.addPath(s4, "B", "b-c", "C");
		System.out.println(Utils.toJson(tg, true));
	}

}
