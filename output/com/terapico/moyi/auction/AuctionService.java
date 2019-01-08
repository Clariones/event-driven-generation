package com.terapico.moyi.auction;

import com.terapico.moyi.CustomMoyiCheckerManager;
import com.terapico.moyi.MoyiUserContext;

public abstract class AuctionService extends CustomMoyiCheckerManager{

	public AuctionService sync() {
		return this;
	}

	public AuctionService async() {
		return (AuctionService) getAsyncProxy();
	}
	// ///////////////////////////// 系统根据时间关闭拍卖 //////////////////////////////////
	public void onSystemCloseAuctionByTime(MoyiUserContext ctx) throws Exception{
		checkCanDoSystemCloseAuctionByTime(ctx);
		int processResult = processSystemCloseAuctionByTime(ctx);
		switch(processResult) {
		case DEAL: // 成交
			sync().onAuctionClosedAsDeal(ctx);
			break;
		default: // 流拍
			sync().onAuctionClosedAsBoughtIn(ctx);
			break;
		}
		writeLogsForSystemCloseAuctionByTime(ctx);
		async().notifyRelevantPersonsWhenSystemCloseAuctionByTime(ctx);
	}
	
	protected abstract int processSystemCloseAuctionByTime(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoSystemCloseAuctionByTime(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForSystemCloseAuctionByTime(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenSystemCloseAuctionByTime(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 流拍 //////////////////////////////////
	protected void onAuctionClosedAsBoughtIn(MoyiUserContext ctx) throws Exception{
		checkCanDoAuctionClosedAsBoughtIn(ctx);
		processAuctionClosedAsBoughtIn(ctx);
		// 流拍以后退还卖家履约保证金
		async().onGiveBackSellerAuctionDeposit(ctx);
		// 仅限未竞价成功的竞买人
		async().onGiveBackBidderDeposit(ctx);
		writeLogsForAuctionClosedAsBoughtIn(ctx);
		async().notifyRelevantPersonsWhenAuctionClosedAsBoughtIn(ctx);
	}
	
	protected abstract int processAuctionClosedAsBoughtIn(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoAuctionClosedAsBoughtIn(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForAuctionClosedAsBoughtIn(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenAuctionClosedAsBoughtIn(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 成交 //////////////////////////////////
	protected void onAuctionClosedAsDeal(MoyiUserContext ctx) throws Exception{
		checkCanDoAuctionClosedAsDeal(ctx);
		processAuctionClosedAsDeal(ctx);
		sync().onCreateAuctionOrder(ctx);
		sync().onGiveBackBidderDeposit(ctx);
		writeLogsForAuctionClosedAsDeal(ctx);
		async().notifyRelevantPersonsWhenAuctionClosedAsDeal(ctx);
	}
	
	protected abstract int processAuctionClosedAsDeal(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoAuctionClosedAsDeal(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForAuctionClosedAsDeal(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenAuctionClosedAsDeal(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
}