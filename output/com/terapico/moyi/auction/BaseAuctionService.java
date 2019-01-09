package com.terapico.moyi.auction;

import com.terapico.moyi.CustomMoyiCheckerManager;
import com.terapico.moyi.MoyiUserContext;

public abstract class BaseAuctionService extends CustomMoyiCheckerManager{
	public static final int BY_DEFAULT = 0;
	public static final int PERMITTED = 1;
	public static final int LACK_OF_DEPOSIT = 2;
	public static final int HAS_REFEREE = 3;
	public static final int HAS_NO_REFEREE = 4;
	public static final int NOT_REGISTER_BIDDER = 5;
	public static final int NOT_CONFIRMED_BIDDER = 6;
	public static final int DEAL = 7;
	public static final int BOUGHT_IN = 8;
	public static final int HAS_INK_DEED_SOLD = 9;
	public static final int NO_INK_DEED_SOLD = 10;

	public BaseAuctionService sync() {
		return this;
	}

	public BaseAuctionService async() {
		return (BaseAuctionService) getAsyncProxy();
	}

	// ///////////////////////////// 卖家上传所有权资料 //////////////////////////////////
	public void onSellerUploadOwnershipInformation(MoyiUserContext ctx) throws Exception{
		checkCanDoSellerUploadOwnershipInformation(ctx);
		processSellerUploadOwnershipInformation(ctx);
		writeLogsForSellerUploadOwnershipInformation(ctx);
		async().notifyRelevantPersonsWhenSellerUploadOwnershipInformation(ctx);
	}
	
	protected abstract int processSellerUploadOwnershipInformation(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoSellerUploadOwnershipInformation(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForSellerUploadOwnershipInformation(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenSellerUploadOwnershipInformation(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 支付证书费用 //////////////////////////////////
	public void onSellerPayOwnershipCertificateFee(MoyiUserContext ctx) throws Exception{
		checkCanDoSellerPayOwnershipCertificateFee(ctx);
		processSellerPayOwnershipCertificateFee(ctx);
		sync().onCreateOwnershipCertificate(ctx);
		sync().onStartAuction(ctx);
		writeLogsForSellerPayOwnershipCertificateFee(ctx);
		async().notifyRelevantPersonsWhenSellerPayOwnershipCertificateFee(ctx);
	}
	
	protected abstract int processSellerPayOwnershipCertificateFee(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoSellerPayOwnershipCertificateFee(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForSellerPayOwnershipCertificateFee(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenSellerPayOwnershipCertificateFee(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 平台创建艺术品数字证书 //////////////////////////////////
	protected void onCreateOwnershipCertificate(MoyiUserContext ctx) throws Exception{
		checkCanDoCreateOwnershipCertificate(ctx);
		processCreateOwnershipCertificate(ctx);
		writeLogsForCreateOwnershipCertificate(ctx);
		async().notifyRelevantPersonsWhenCreateOwnershipCertificate(ctx);
	}
	
	protected abstract int processCreateOwnershipCertificate(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoCreateOwnershipCertificate(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForCreateOwnershipCertificate(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenCreateOwnershipCertificate(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 公示时间到 //////////////////////////////////
	public void onTimeToStartAuctionDisplay(MoyiUserContext ctx) throws Exception{
		checkCanDoTimeToStartAuctionDisplay(ctx);
		processTimeToStartAuctionDisplay(ctx);
		sync().onReleaseInkDeedLiquidity(ctx);
		writeLogsForTimeToStartAuctionDisplay(ctx);
		async().notifyRelevantPersonsWhenTimeToStartAuctionDisplay(ctx);
	}
	
	protected abstract int processTimeToStartAuctionDisplay(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoTimeToStartAuctionDisplay(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForTimeToStartAuctionDisplay(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenTimeToStartAuctionDisplay(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 卖家发售墨契 //////////////////////////////////
	public void onSellerPutInkDeedToSale(MoyiUserContext ctx) throws Exception{
		checkCanDoSellerPutInkDeedToSale(ctx);
		int processResult = processSellerPutInkDeedToSale(ctx);
		switch(processResult) {
		case PERMITTED: // 可以正常发售墨契
			sync().onFreezeSellerDepositBecauseOfInkDeedSold(ctx);
			sync().onCreateInkDeedTransaction(ctx);
			break;
		default: // 卖家的保证金不足以支持此次墨契的发售
			sync().onLackOfSellerDeposit(ctx);
			break;
		}
		writeLogsForSellerPutInkDeedToSale(ctx);
		async().notifyRelevantPersonsWhenSellerPutInkDeedToSale(ctx);
	}
	
	protected abstract int processSellerPutInkDeedToSale(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoSellerPutInkDeedToSale(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForSellerPutInkDeedToSale(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenSellerPutInkDeedToSale(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 用户购买墨契 //////////////////////////////////
	public void onUserPayForInkDeed(MoyiUserContext ctx) throws Exception{
		checkCanDoUserPayForInkDeed(ctx);
		processUserPayForInkDeed(ctx);
		sync().onTransferInkDeedOwnership(ctx);
		writeLogsForUserPayForInkDeed(ctx);
		async().notifyRelevantPersonsWhenUserPayForInkDeed(ctx);
	}
	
	protected abstract int processUserPayForInkDeed(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoUserPayForInkDeed(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForUserPayForInkDeed(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenUserPayForInkDeed(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 平台为墨契冻结卖家保证金 //////////////////////////////////
	protected void onFreezeSellerDepositBecauseOfInkDeedSold(MoyiUserContext ctx) throws Exception{
		checkCanDoFreezeSellerDepositBecauseOfInkDeedSold(ctx);
		processFreezeSellerDepositBecauseOfInkDeedSold(ctx);
		writeLogsForFreezeSellerDepositBecauseOfInkDeedSold(ctx);
		async().notifyRelevantPersonsWhenFreezeSellerDepositBecauseOfInkDeedSold(ctx);
	}
	
	protected abstract int processFreezeSellerDepositBecauseOfInkDeedSold(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoFreezeSellerDepositBecauseOfInkDeedSold(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForFreezeSellerDepositBecauseOfInkDeedSold(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenFreezeSellerDepositBecauseOfInkDeedSold(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 荐宝人荐宝 //////////////////////////////////
	public void onRefereeShareArtwork(MoyiUserContext ctx) throws Exception{
		checkCanDoRefereeShareArtwork(ctx);
		processRefereeShareArtwork(ctx);
		writeLogsForRefereeShareArtwork(ctx);
		async().notifyRelevantPersonsWhenRefereeShareArtwork(ctx);
	}
	
	protected abstract int processRefereeShareArtwork(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoRefereeShareArtwork(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForRefereeShareArtwork(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenRefereeShareArtwork(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 竞拍人预约 //////////////////////////////////
	public void onBidderBookAuction(MoyiUserContext ctx) throws Exception{
		checkCanDoBidderBookAuction(ctx);
		int processResult = processBidderBookAuction(ctx);
		switch(processResult) {
		case HAS_REFEREE: // 是通过荐宝人的链接触发的
			sync().onRecordRefereeForBidder(ctx);
			sync().onRegisterBidder(ctx);
			break;
		default: // 不是荐宝人推荐的
			sync().onRegisterBidder(ctx);
			break;
		}
		writeLogsForBidderBookAuction(ctx);
		async().notifyRelevantPersonsWhenBidderBookAuction(ctx);
	}
	
	protected abstract int processBidderBookAuction(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoBidderBookAuction(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForBidderBookAuction(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenBidderBookAuction(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 竞拍人缴付保证金 //////////////////////////////////
	public void onBidderPayDeposit(MoyiUserContext ctx) throws Exception{
		checkCanDoBidderPayDeposit(ctx);
		processBidderPayDeposit(ctx);
		sync().onConfirmBidder(ctx);
		writeLogsForBidderPayDeposit(ctx);
		async().notifyRelevantPersonsWhenBidderPayDeposit(ctx);
	}
	
	protected abstract int processBidderPayDeposit(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoBidderPayDeposit(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForBidderPayDeposit(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenBidderPayDeposit(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 拍卖开始 //////////////////////////////////
	public void onTimeToStartAuctionBidding(MoyiUserContext ctx) throws Exception{
		checkCanDoTimeToStartAuctionBidding(ctx);
		processTimeToStartAuctionBidding(ctx);
		sync().onFreezeInkDeedLiquidity(ctx);
		writeLogsForTimeToStartAuctionBidding(ctx);
		async().notifyRelevantPersonsWhenTimeToStartAuctionBidding(ctx);
	}
	
	protected abstract int processTimeToStartAuctionBidding(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoTimeToStartAuctionBidding(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForTimeToStartAuctionBidding(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenTimeToStartAuctionBidding(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 竞拍人出价 //////////////////////////////////
	public void onBidderOfferPrice(MoyiUserContext ctx) throws Exception{
		checkCanDoBidderOfferPrice(ctx);
		int processResult = processBidderOfferPrice(ctx);
		switch(processResult) {
		case NOT_CONFIRMED_BIDDER: // 未交足够的保证金
			sync().onLackOfBidderDeposit(ctx);
			break;
		case NOT_REGISTER_BIDDER: // 未注册过的竞拍者
			sync().onRegisterBidder(ctx);
			break;
		default: // 可以正常出价
			sync().onUpdateBiddingPrice(ctx);
			break;
		}
		writeLogsForBidderOfferPrice(ctx);
		async().notifyRelevantPersonsWhenBidderOfferPrice(ctx);
	}
	
	protected abstract int processBidderOfferPrice(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoBidderOfferPrice(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForBidderOfferPrice(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenBidderOfferPrice(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 拍卖成交 //////////////////////////////////
	protected void onAuctionClosedAsDeal(MoyiUserContext ctx) throws Exception{
		checkCanDoAuctionClosedAsDeal(ctx);
		processAuctionClosedAsDeal(ctx);
		sync().onCreateAuctionOrders(ctx);
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
	
	// ///////////////////////////// 买家支付拍卖相关订单 //////////////////////////////////
	public void onBuyerPayAuctionOrders(MoyiUserContext ctx) throws Exception{
		checkCanDoBuyerPayAuctionOrders(ctx);
		processBuyerPayAuctionOrders(ctx);
		sync().onReleaseBidderDeposit(ctx);
		writeLogsForBuyerPayAuctionOrders(ctx);
		async().notifyRelevantPersonsWhenBuyerPayAuctionOrders(ctx);
	}
	
	protected abstract int processBuyerPayAuctionOrders(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoBuyerPayAuctionOrders(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForBuyerPayAuctionOrders(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenBuyerPayAuctionOrders(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 卖家发货 //////////////////////////////////
	public void onSellerDeliverLot(MoyiUserContext ctx) throws Exception{
		checkCanDoSellerDeliverLot(ctx);
		processSellerDeliverLot(ctx);
		writeLogsForSellerDeliverLot(ctx);
		async().notifyRelevantPersonsWhenSellerDeliverLot(ctx);
	}
	
	protected abstract int processSellerDeliverLot(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoSellerDeliverLot(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForSellerDeliverLot(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenSellerDeliverLot(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 买家确认收货 //////////////////////////////////
	public void onBuyerConfirmPurchase(MoyiUserContext ctx) throws Exception{
		checkCanDoBuyerConfirmPurchase(ctx);
		processBuyerConfirmPurchase(ctx);
		sync().onPlatformExchangeInkDeed(ctx);
		sync().onReleaseSellerDepositWithoutDrawback(ctx);
		sync().onReleaseBidderDeposit(ctx);
		sync().onSellerGetTheSalesIncome(ctx);
		sync().onAuctionTradeFinish(ctx);
		writeLogsForBuyerConfirmPurchase(ctx);
		async().notifyRelevantPersonsWhenBuyerConfirmPurchase(ctx);
	}
	
	protected abstract int processBuyerConfirmPurchase(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoBuyerConfirmPurchase(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForBuyerConfirmPurchase(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenBuyerConfirmPurchase(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 平台兑付墨契 //////////////////////////////////
	protected void onPlatformExchangeInkDeed(MoyiUserContext ctx) throws Exception{
		checkCanDoPlatformExchangeInkDeed(ctx);
		processPlatformExchangeInkDeed(ctx);
		writeLogsForPlatformExchangeInkDeed(ctx);
		async().notifyRelevantPersonsWhenPlatformExchangeInkDeed(ctx);
	}
	
	protected abstract int processPlatformExchangeInkDeed(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoPlatformExchangeInkDeed(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForPlatformExchangeInkDeed(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenPlatformExchangeInkDeed(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 平台解冻墨契保证金 //////////////////////////////////
	protected void onReleaseSellerDepositWithoutDrawback(MoyiUserContext ctx) throws Exception{
		checkCanDoReleaseSellerDepositWithoutDrawback(ctx);
		processReleaseSellerDepositWithoutDrawback(ctx);
		writeLogsForReleaseSellerDepositWithoutDrawback(ctx);
		async().notifyRelevantPersonsWhenReleaseSellerDepositWithoutDrawback(ctx);
	}
	
	protected abstract int processReleaseSellerDepositWithoutDrawback(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoReleaseSellerDepositWithoutDrawback(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForReleaseSellerDepositWithoutDrawback(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenReleaseSellerDepositWithoutDrawback(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 买家收到销售款 //////////////////////////////////
	protected void onSellerGetTheSalesIncome(MoyiUserContext ctx) throws Exception{
		checkCanDoSellerGetTheSalesIncome(ctx);
		processSellerGetTheSalesIncome(ctx);
		writeLogsForSellerGetTheSalesIncome(ctx);
		async().notifyRelevantPersonsWhenSellerGetTheSalesIncome(ctx);
	}
	
	protected abstract int processSellerGetTheSalesIncome(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoSellerGetTheSalesIncome(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForSellerGetTheSalesIncome(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenSellerGetTheSalesIncome(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 拍卖交易完成 //////////////////////////////////
	protected void onAuctionTradeFinish(MoyiUserContext ctx) throws Exception{
		checkCanDoAuctionTradeFinish(ctx);
		processAuctionTradeFinish(ctx);
		sync().onMarkLotSold(ctx);
		writeLogsForAuctionTradeFinish(ctx);
		async().notifyRelevantPersonsWhenAuctionTradeFinish(ctx);
	}
	
	protected abstract int processAuctionTradeFinish(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoAuctionTradeFinish(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForAuctionTradeFinish(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenAuctionTradeFinish(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 拍卖结束时间到 //////////////////////////////////
	public void onAuctionClosedByTime(MoyiUserContext ctx) throws Exception{
		checkCanDoAuctionClosedByTime(ctx);
		int processResult = processAuctionClosedByTime(ctx);
		switch(processResult) {
		case DEAL: // deal
			sync().onAuctionClosedAsDeal(ctx);
			break;
		default: // 流拍
			sync().onAuctionClosedAsBoughtIn(ctx);
			break;
		}
		writeLogsForAuctionClosedByTime(ctx);
		async().notifyRelevantPersonsWhenAuctionClosedByTime(ctx);
	}
	
	protected abstract int processAuctionClosedByTime(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoAuctionClosedByTime(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForAuctionClosedByTime(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenAuctionClosedByTime(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 支付超时 //////////////////////////////////
	public void onTimeoutForBuyerPay(MoyiUserContext ctx) throws Exception{
		checkCanDoTimeoutForBuyerPay(ctx);
		processTimeoutForBuyerPay(ctx);
		sync().onBuyerBreached(ctx);
		writeLogsForTimeoutForBuyerPay(ctx);
		async().notifyRelevantPersonsWhenTimeoutForBuyerPay(ctx);
	}
	
	protected abstract int processTimeoutForBuyerPay(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoTimeoutForBuyerPay(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForTimeoutForBuyerPay(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenTimeoutForBuyerPay(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 卖家发货超时 //////////////////////////////////
	public void onTimeoutForSellerDelivery(MoyiUserContext ctx) throws Exception{
		checkCanDoTimeoutForSellerDelivery(ctx);
		processTimeoutForSellerDelivery(ctx);
		sync().onSellerBreached(ctx);
		writeLogsForTimeoutForSellerDelivery(ctx);
		async().notifyRelevantPersonsWhenTimeoutForSellerDelivery(ctx);
	}
	
	protected abstract int processTimeoutForSellerDelivery(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoTimeoutForSellerDelivery(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForTimeoutForSellerDelivery(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenTimeoutForSellerDelivery(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 买家确认超时 //////////////////////////////////
	public void onTimeoutForBuyerConfirmation(MoyiUserContext ctx) throws Exception{
		checkCanDoTimeoutForBuyerConfirmation(ctx);
		processTimeoutForBuyerConfirmation(ctx);
		sync().onPlatformExchangeInkDeed(ctx);
		sync().onReleaseSellerDepositWithoutDrawback(ctx);
		sync().onSellerGetTheSalesIncome(ctx);
		sync().onAuctionTradeFinish(ctx);
		writeLogsForTimeoutForBuyerConfirmation(ctx);
		async().notifyRelevantPersonsWhenTimeoutForBuyerConfirmation(ctx);
	}
	
	protected abstract int processTimeoutForBuyerConfirmation(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoTimeoutForBuyerConfirmation(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForTimeoutForBuyerConfirmation(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenTimeoutForBuyerConfirmation(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 流拍 //////////////////////////////////
	protected void onAuctionClosedAsBoughtIn(MoyiUserContext ctx) throws Exception{
		checkCanDoAuctionClosedAsBoughtIn(ctx);
		int processResult = processAuctionClosedAsBoughtIn(ctx);
		switch(processResult) {
		case NO_INK_DEED_SOLD: // 没有成交的墨契
			sync().onReleaseSellerDepositWithoutDrawback(ctx);
			sync().onReleaseBidderDeposit(ctx);
			sync().onAuctionTradeTerminate(ctx);
			break;
		default: // 有已销售的墨契
			sync().onDrawbackInkDeed(ctx);
			sync().onReleaseSellerDepositBecauseOfInkDeedDrawback(ctx);
			sync().onReleaseBidderDeposit(ctx);
			sync().onAuctionTradeTerminate(ctx);
			break;
		}
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
	
	// ///////////////////////////// 卖家保证金不足 //////////////////////////////////
	protected void onLackOfSellerDeposit(MoyiUserContext ctx) throws Exception{
		checkCanDoLackOfSellerDeposit(ctx);
		processLackOfSellerDeposit(ctx);
		writeLogsForLackOfSellerDeposit(ctx);
		async().notifyRelevantPersonsWhenLackOfSellerDeposit(ctx);
	}
	
	protected abstract int processLackOfSellerDeposit(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoLackOfSellerDeposit(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForLackOfSellerDeposit(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenLackOfSellerDeposit(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 买家保证金不足 //////////////////////////////////
	protected void onLackOfBidderDeposit(MoyiUserContext ctx) throws Exception{
		checkCanDoLackOfBidderDeposit(ctx);
		processLackOfBidderDeposit(ctx);
		writeLogsForLackOfBidderDeposit(ctx);
		async().notifyRelevantPersonsWhenLackOfBidderDeposit(ctx);
	}
	
	protected abstract int processLackOfBidderDeposit(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoLackOfBidderDeposit(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForLackOfBidderDeposit(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenLackOfBidderDeposit(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 卖家违约 //////////////////////////////////
	protected void onSellerBreached(MoyiUserContext ctx) throws Exception{
		checkCanDoSellerBreached(ctx);
		processSellerBreached(ctx);
		sync().onRefundBuyerPay(ctx);
		sync().onDrawbackInkDeed(ctx);
		sync().onConfiscateSellerDeposit(ctx);
		sync().onAuctionTradeTerminate(ctx);
		writeLogsForSellerBreached(ctx);
		async().notifyRelevantPersonsWhenSellerBreached(ctx);
	}
	
	protected abstract int processSellerBreached(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoSellerBreached(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForSellerBreached(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenSellerBreached(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 买家违约 //////////////////////////////////
	protected void onBuyerBreached(MoyiUserContext ctx) throws Exception{
		checkCanDoBuyerBreached(ctx);
		int processResult = processBuyerBreached(ctx);
		switch(processResult) {
		case NO_INK_DEED_SOLD: // 没有成交的墨契
			sync().onConfiscateBuyerDeposit(ctx);
			sync().onReleaseSellerDepositWithoutDrawback(ctx);
			sync().onReleaseBidderDeposit(ctx);
			sync().onRouteBuyerPenalty(ctx);
			sync().onAuctionTradeTerminate(ctx);
			break;
		default: // 有已销售的墨契
			sync().onConfiscateBuyerDeposit(ctx);
			sync().onDrawbackInkDeed(ctx);
			sync().onReleaseSellerDepositBecauseOfInkDeedDrawback(ctx);
			sync().onReleaseBidderDeposit(ctx);
			sync().onRouteBuyerPenalty(ctx);
			sync().onAuctionTradeTerminate(ctx);
			break;
		}
		writeLogsForBuyerBreached(ctx);
		async().notifyRelevantPersonsWhenBuyerBreached(ctx);
	}
	
	protected abstract int processBuyerBreached(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoBuyerBreached(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForBuyerBreached(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenBuyerBreached(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 买家投诉 //////////////////////////////////
	public void onBuyerComplaint(MoyiUserContext ctx) throws Exception{
		checkCanDoBuyerComplaint(ctx);
		processBuyerComplaint(ctx);
		writeLogsForBuyerComplaint(ctx);
		async().notifyRelevantPersonsWhenBuyerComplaint(ctx);
	}
	
	protected abstract int processBuyerComplaint(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoBuyerComplaint(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForBuyerComplaint(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenBuyerComplaint(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 用户挂单销售墨契 //////////////////////////////////
	public void onUserPendInkDeedOrder(MoyiUserContext ctx) throws Exception{
		checkCanDoUserPendInkDeedOrder(ctx);
		processUserPendInkDeedOrder(ctx);
		writeLogsForUserPendInkDeedOrder(ctx);
		async().notifyRelevantPersonsWhenUserPendInkDeedOrder(ctx);
	}
	
	protected abstract int processUserPendInkDeedOrder(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoUserPendInkDeedOrder(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForUserPendInkDeedOrder(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenUserPendInkDeedOrder(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 开始拍卖流程 //////////////////////////////////
	protected void onStartAuction(MoyiUserContext ctx) throws Exception{
		checkCanDoStartAuction(ctx);
		processStartAuction(ctx);
		writeLogsForStartAuction(ctx);
		async().notifyRelevantPersonsWhenStartAuction(ctx);
	}
	
	protected abstract int processStartAuction(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoStartAuction(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForStartAuction(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenStartAuction(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 冻结墨契流动性 //////////////////////////////////
	protected void onFreezeInkDeedLiquidity(MoyiUserContext ctx) throws Exception{
		checkCanDoFreezeInkDeedLiquidity(ctx);
		processFreezeInkDeedLiquidity(ctx);
		writeLogsForFreezeInkDeedLiquidity(ctx);
		async().notifyRelevantPersonsWhenFreezeInkDeedLiquidity(ctx);
	}
	
	protected abstract int processFreezeInkDeedLiquidity(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoFreezeInkDeedLiquidity(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForFreezeInkDeedLiquidity(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenFreezeInkDeedLiquidity(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 创建墨契交易 //////////////////////////////////
	protected void onCreateInkDeedTransaction(MoyiUserContext ctx) throws Exception{
		checkCanDoCreateInkDeedTransaction(ctx);
		processCreateInkDeedTransaction(ctx);
		writeLogsForCreateInkDeedTransaction(ctx);
		async().notifyRelevantPersonsWhenCreateInkDeedTransaction(ctx);
	}
	
	protected abstract int processCreateInkDeedTransaction(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoCreateInkDeedTransaction(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForCreateInkDeedTransaction(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenCreateInkDeedTransaction(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 登记竞拍者 //////////////////////////////////
	protected void onRegisterBidder(MoyiUserContext ctx) throws Exception{
		checkCanDoRegisterBidder(ctx);
		processRegisterBidder(ctx);
		writeLogsForRegisterBidder(ctx);
		async().notifyRelevantPersonsWhenRegisterBidder(ctx);
	}
	
	protected abstract int processRegisterBidder(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoRegisterBidder(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForRegisterBidder(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenRegisterBidder(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 确认竞拍者资格 //////////////////////////////////
	protected void onConfirmBidder(MoyiUserContext ctx) throws Exception{
		checkCanDoConfirmBidder(ctx);
		processConfirmBidder(ctx);
		writeLogsForConfirmBidder(ctx);
		async().notifyRelevantPersonsWhenConfirmBidder(ctx);
	}
	
	protected abstract int processConfirmBidder(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoConfirmBidder(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForConfirmBidder(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenConfirmBidder(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 释放墨契流动性 //////////////////////////////////
	protected void onReleaseInkDeedLiquidity(MoyiUserContext ctx) throws Exception{
		checkCanDoReleaseInkDeedLiquidity(ctx);
		processReleaseInkDeedLiquidity(ctx);
		writeLogsForReleaseInkDeedLiquidity(ctx);
		async().notifyRelevantPersonsWhenReleaseInkDeedLiquidity(ctx);
	}
	
	protected abstract int processReleaseInkDeedLiquidity(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoReleaseInkDeedLiquidity(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForReleaseInkDeedLiquidity(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenReleaseInkDeedLiquidity(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 转移墨契所有权 //////////////////////////////////
	protected void onTransferInkDeedOwnership(MoyiUserContext ctx) throws Exception{
		checkCanDoTransferInkDeedOwnership(ctx);
		processTransferInkDeedOwnership(ctx);
		writeLogsForTransferInkDeedOwnership(ctx);
		async().notifyRelevantPersonsWhenTransferInkDeedOwnership(ctx);
	}
	
	protected abstract int processTransferInkDeedOwnership(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoTransferInkDeedOwnership(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForTransferInkDeedOwnership(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenTransferInkDeedOwnership(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 记录荐宝人推荐成功的竞拍者 //////////////////////////////////
	protected void onRecordRefereeForBidder(MoyiUserContext ctx) throws Exception{
		checkCanDoRecordRefereeForBidder(ctx);
		processRecordRefereeForBidder(ctx);
		writeLogsForRecordRefereeForBidder(ctx);
		async().notifyRelevantPersonsWhenRecordRefereeForBidder(ctx);
	}
	
	protected abstract int processRecordRefereeForBidder(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoRecordRefereeForBidder(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForRecordRefereeForBidder(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenRecordRefereeForBidder(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 创建拍卖订单 //////////////////////////////////
	protected void onCreateAuctionOrders(MoyiUserContext ctx) throws Exception{
		checkCanDoCreateAuctionOrders(ctx);
		processCreateAuctionOrders(ctx);
		writeLogsForCreateAuctionOrders(ctx);
		async().notifyRelevantPersonsWhenCreateAuctionOrders(ctx);
	}
	
	protected abstract int processCreateAuctionOrders(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoCreateAuctionOrders(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForCreateAuctionOrders(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenCreateAuctionOrders(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 有新的竞拍出价 //////////////////////////////////
	protected void onUpdateBiddingPrice(MoyiUserContext ctx) throws Exception{
		checkCanDoUpdateBiddingPrice(ctx);
		processUpdateBiddingPrice(ctx);
		writeLogsForUpdateBiddingPrice(ctx);
		async().notifyRelevantPersonsWhenUpdateBiddingPrice(ctx);
	}
	
	protected abstract int processUpdateBiddingPrice(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoUpdateBiddingPrice(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForUpdateBiddingPrice(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenUpdateBiddingPrice(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 给已经成交的墨契做退款处理 //////////////////////////////////
	protected void onDrawbackInkDeed(MoyiUserContext ctx) throws Exception{
		checkCanDoDrawbackInkDeed(ctx);
		processDrawbackInkDeed(ctx);
		writeLogsForDrawbackInkDeed(ctx);
		async().notifyRelevantPersonsWhenDrawbackInkDeed(ctx);
	}
	
	protected abstract int processDrawbackInkDeed(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoDrawbackInkDeed(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForDrawbackInkDeed(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenDrawbackInkDeed(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 平台处理已成交墨契的退还事项后，解冻卖家保证金 //////////////////////////////////
	protected void onReleaseSellerDepositBecauseOfInkDeedDrawback(MoyiUserContext ctx) throws Exception{
		checkCanDoReleaseSellerDepositBecauseOfInkDeedDrawback(ctx);
		processReleaseSellerDepositBecauseOfInkDeedDrawback(ctx);
		writeLogsForReleaseSellerDepositBecauseOfInkDeedDrawback(ctx);
		async().notifyRelevantPersonsWhenReleaseSellerDepositBecauseOfInkDeedDrawback(ctx);
	}
	
	protected abstract int processReleaseSellerDepositBecauseOfInkDeedDrawback(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoReleaseSellerDepositBecauseOfInkDeedDrawback(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForReleaseSellerDepositBecauseOfInkDeedDrawback(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenReleaseSellerDepositBecauseOfInkDeedDrawback(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 解冻未竞拍成功的竞拍者的保证金 //////////////////////////////////
	protected void onReleaseBidderDeposit(MoyiUserContext ctx) throws Exception{
		checkCanDoReleaseBidderDeposit(ctx);
		processReleaseBidderDeposit(ctx);
		writeLogsForReleaseBidderDeposit(ctx);
		async().notifyRelevantPersonsWhenReleaseBidderDeposit(ctx);
	}
	
	protected abstract int processReleaseBidderDeposit(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoReleaseBidderDeposit(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForReleaseBidderDeposit(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenReleaseBidderDeposit(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 拍卖中止 //////////////////////////////////
	protected void onAuctionTradeTerminate(MoyiUserContext ctx) throws Exception{
		checkCanDoAuctionTradeTerminate(ctx);
		processAuctionTradeTerminate(ctx);
		writeLogsForAuctionTradeTerminate(ctx);
		async().notifyRelevantPersonsWhenAuctionTradeTerminate(ctx);
	}
	
	protected abstract int processAuctionTradeTerminate(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoAuctionTradeTerminate(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForAuctionTradeTerminate(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenAuctionTradeTerminate(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 被拍卖的艺术品标注为已售 //////////////////////////////////
	protected void onMarkLotSold(MoyiUserContext ctx) throws Exception{
		checkCanDoMarkLotSold(ctx);
		processMarkLotSold(ctx);
		writeLogsForMarkLotSold(ctx);
		async().notifyRelevantPersonsWhenMarkLotSold(ctx);
	}
	
	protected abstract int processMarkLotSold(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoMarkLotSold(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForMarkLotSold(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenMarkLotSold(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 扣除卖家保证金 //////////////////////////////////
	protected void onConfiscateSellerDeposit(MoyiUserContext ctx) throws Exception{
		checkCanDoConfiscateSellerDeposit(ctx);
		processConfiscateSellerDeposit(ctx);
		writeLogsForConfiscateSellerDeposit(ctx);
		async().notifyRelevantPersonsWhenConfiscateSellerDeposit(ctx);
	}
	
	protected abstract int processConfiscateSellerDeposit(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoConfiscateSellerDeposit(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForConfiscateSellerDeposit(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenConfiscateSellerDeposit(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 退款给买家 //////////////////////////////////
	protected void onRefundBuyerPay(MoyiUserContext ctx) throws Exception{
		checkCanDoRefundBuyerPay(ctx);
		processRefundBuyerPay(ctx);
		writeLogsForRefundBuyerPay(ctx);
		async().notifyRelevantPersonsWhenRefundBuyerPay(ctx);
	}
	
	protected abstract int processRefundBuyerPay(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoRefundBuyerPay(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForRefundBuyerPay(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenRefundBuyerPay(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 瓜分买家的违约金 //////////////////////////////////
	protected void onRouteBuyerPenalty(MoyiUserContext ctx) throws Exception{
		checkCanDoRouteBuyerPenalty(ctx);
		processRouteBuyerPenalty(ctx);
		writeLogsForRouteBuyerPenalty(ctx);
		async().notifyRelevantPersonsWhenRouteBuyerPenalty(ctx);
	}
	
	protected abstract int processRouteBuyerPenalty(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoRouteBuyerPenalty(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForRouteBuyerPenalty(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenRouteBuyerPenalty(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 扣除买家保证金 //////////////////////////////////
	protected void onConfiscateBuyerDeposit(MoyiUserContext ctx) throws Exception{
		checkCanDoConfiscateBuyerDeposit(ctx);
		processConfiscateBuyerDeposit(ctx);
		writeLogsForConfiscateBuyerDeposit(ctx);
		async().notifyRelevantPersonsWhenConfiscateBuyerDeposit(ctx);
	}
	
	protected abstract int processConfiscateBuyerDeposit(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoConfiscateBuyerDeposit(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForConfiscateBuyerDeposit(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenConfiscateBuyerDeposit(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	

}