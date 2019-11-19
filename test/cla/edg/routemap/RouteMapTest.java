package cla.edg.routemap;

import org.junit.jupiter.api.Test;

import cla.edg.modelbean.LogicalOperator;
import cla.edg.project.moyi.gen.graphquery.ArtworkAuctionStatus;
import cla.edg.project.moyi.gen.graphquery.MODEL;

class RouteMapTest {

	@Test
	void test3() throws Exception {
		// TODO Auto-generated method stub
				LogicalOperator c1 = MODEL.artwork().artworkAuctionList().seller().eq("MS000001");
				// System.out.println(Utils.toJson(c1, true));
				
				LogicalOperator c2 = MODEL.artworkAuction().buyer().eq("MU000002")
					.or(MODEL.artworkAuction().artworkAuctionStatus().eq(ArtworkAuctionStatus.BIDDING));
				// System.out.println(Utils.toJson(c2, true));
				
				c1.and(c2);
				
				
//				RouteUtil.getJoinClaus(rm1);
		
	}
}
