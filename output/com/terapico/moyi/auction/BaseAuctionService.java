package com.terapico.moyi.auction;

import com.terapico.moyi.CustomMoyiCheckerManager;
import com.terapico.moyi.MoyiUserContext;

public abstract class BaseAuctionService extends CustomMoyiCheckerManager{
	public static final int BY_DEFAULT = 0;
	public static final int LACK_OF_SELLER_DEPOSIT = 1;
	public static final int ALLRIGHT = 2;
	public static final int STILL_BLOCKING = 3;
	public static final int HAS_AUCTION_RELEASED = 4;
	public static final int HAS_REFERRER = 5;
	public static final int HAS_NO_REFERRER = 6;
	public static final int LACK_OF_BIDDER_DEPOSIT = 7;

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
		sync().onCreateOwnershipCertificateFee(ctx);
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
	
	// ///////////////////////////// 创建所有权证书费用，此费用需要卖家用IB支付 //////////////////////////////////
	protected void onCreateOwnershipCertificateFee(MoyiUserContext ctx) throws Exception{
		checkCanDoCreateOwnershipCertificateFee(ctx);
		processCreateOwnershipCertificateFee(ctx);
		writeLogsForCreateOwnershipCertificateFee(ctx);
		async().notifyRelevantPersonsWhenCreateOwnershipCertificateFee(ctx);
	}
	
	protected abstract int processCreateOwnershipCertificateFee(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoCreateOwnershipCertificateFee(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForCreateOwnershipCertificateFee(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenCreateOwnershipCertificateFee(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 用户不支付所有权证书费用. 此时取消前面的订单 //////////////////////////////////
	public void onSellerCancelOwnershipCertificateFeePayment(MoyiUserContext ctx) throws Exception{
		checkCanDoSellerCancelOwnershipCertificateFeePayment(ctx);
		processSellerCancelOwnershipCertificateFeePayment(ctx);
		sync().onSellerRevokeAuction(ctx);
		writeLogsForSellerCancelOwnershipCertificateFeePayment(ctx);
		async().notifyRelevantPersonsWhenSellerCancelOwnershipCertificateFeePayment(ctx);
	}
	
	protected abstract int processSellerCancelOwnershipCertificateFeePayment(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoSellerCancelOwnershipCertificateFeePayment(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForSellerCancelOwnershipCertificateFeePayment(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenSellerCancelOwnershipCertificateFeePayment(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 卖家撤销了未发布的拍卖申请 //////////////////////////////////
	public void onSellerRevokeAuction(MoyiUserContext ctx) throws Exception{
		checkCanDoSellerRevokeAuction(ctx);
		processSellerRevokeAuction(ctx);
		writeLogsForSellerRevokeAuction(ctx);
		async().notifyRelevantPersonsWhenSellerRevokeAuction(ctx);
	}
	
	protected abstract int processSellerRevokeAuction(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoSellerRevokeAuction(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForSellerRevokeAuction(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenSellerRevokeAuction(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 用户支付所有权证书费用 //////////////////////////////////
	public void onSellerPayOwnershipCertificateFee(MoyiUserContext ctx) throws Exception{
		checkCanDoSellerPayOwnershipCertificateFee(ctx);
		int processResult = processSellerPayOwnershipCertificateFee(ctx);
		switch(processResult) {
		case LACK_OF_SELLER_DEPOSIT: // 卖家的履约保证金不足
			// 缴费后生成证书
			sync().onCreateOwnershipCertificate(ctx);
			// 提醒充值保证金，否则交易容易被卡住
			sync().onCreateSellerPerformanceDepositRechargeNotification(ctx);
			break;
		default: // 没有任何其他问题
			// 缴费后生成证书
			sync().onCreateOwnershipCertificate(ctx);
			sync().onMarkAuctionDisplayable(ctx);
			break;
		}
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
	
	// ///////////////////////////// 创建艺术品所有权证书 //////////////////////////////////
	public void onCreateOwnershipCertificate(MoyiUserContext ctx) throws Exception{
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
	
	// ///////////////////////////// 卖家支付了履约保证金 //////////////////////////////////
	public void onSellerPayPerformanceDepositRecharge(MoyiUserContext ctx) throws Exception{
		checkCanDoSellerPayPerformanceDepositRecharge(ctx);
		processSellerPayPerformanceDepositRecharge(ctx);
		sync().onSellerPerformanceDepositRecharged(ctx);
		writeLogsForSellerPayPerformanceDepositRecharge(ctx);
		async().notifyRelevantPersonsWhenSellerPayPerformanceDepositRecharge(ctx);
	}
	
	protected abstract int processSellerPayPerformanceDepositRecharge(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoSellerPayPerformanceDepositRecharge(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForSellerPayPerformanceDepositRecharge(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenSellerPayPerformanceDepositRecharge(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 卖家履约保证金到账 //////////////////////////////////
	protected void onSellerPerformanceDepositRecharged(MoyiUserContext ctx) throws Exception{
		checkCanDoSellerPerformanceDepositRecharged(ctx);
		int processResult = processSellerPerformanceDepositRecharged(ctx);
		switch(processResult) {
		case STILL_BLOCKING: // 充值金额还是不足以释放被阻塞的拍卖
			// 提醒充值保证金，否则交易不会被释放
			sync().onCreateSellerPerformanceDepositRechargeNotification(ctx);
			break;
		default: // 没有被阻塞的拍卖需要被释放，并且保证金也足够
			break;
		}
		writeLogsForSellerPerformanceDepositRecharged(ctx);
		async().notifyRelevantPersonsWhenSellerPerformanceDepositRecharged(ctx);
	}
	
	protected abstract int processSellerPerformanceDepositRecharged(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoSellerPerformanceDepositRecharged(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForSellerPerformanceDepositRecharged(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenSellerPerformanceDepositRecharged(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 提醒卖家充值履约保证金 //////////////////////////////////
	protected void onCreateSellerPerformanceDepositRechargeNotification(MoyiUserContext ctx) throws Exception{
		checkCanDoCreateSellerPerformanceDepositRechargeNotification(ctx);
		processCreateSellerPerformanceDepositRechargeNotification(ctx);
		writeLogsForCreateSellerPerformanceDepositRechargeNotification(ctx);
		async().notifyRelevantPersonsWhenCreateSellerPerformanceDepositRechargeNotification(ctx);
	}
	
	protected abstract int processCreateSellerPerformanceDepositRechargeNotification(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoCreateSellerPerformanceDepositRechargeNotification(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForCreateSellerPerformanceDepositRechargeNotification(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenCreateSellerPerformanceDepositRechargeNotification(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 允许被拍卖艺术品进行公示 //////////////////////////////////
	protected void onMarkAuctionDisplayable(MoyiUserContext ctx) throws Exception{
		checkCanDoMarkAuctionDisplayable(ctx);
		processMarkAuctionDisplayable(ctx);
		writeLogsForMarkAuctionDisplayable(ctx);
		async().notifyRelevantPersonsWhenMarkAuctionDisplayable(ctx);
	}
	
	protected abstract int processMarkAuctionDisplayable(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoMarkAuctionDisplayable(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForMarkAuctionDisplayable(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenMarkAuctionDisplayable(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 买家预约拍卖 //////////////////////////////////
	public void onBidderBookAuction(MoyiUserContext ctx) throws Exception{
		checkCanDoBidderBookAuction(ctx);
		int processResult = processBidderBookAuction(ctx);
		switch(processResult) {
		case HAS_REFERRER: // 有荐宝人
			sync().onCreateRecommendationRecord(ctx);
			sync().onCreateAuctionStartAlertService(ctx);
			break;
		default: // 找不到荐宝人
			sync().onCreateAuctionStartAlertService(ctx);
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
	
	// ///////////////////////////// 创建推荐记录，留待交易成功后发放奖励时作为计算依据 //////////////////////////////////
	protected void onCreateRecommendationRecord(MoyiUserContext ctx) throws Exception{
		checkCanDoCreateRecommendationRecord(ctx);
		processCreateRecommendationRecord(ctx);
		writeLogsForCreateRecommendationRecord(ctx);
		async().notifyRelevantPersonsWhenCreateRecommendationRecord(ctx);
	}
	
	protected abstract int processCreateRecommendationRecord(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoCreateRecommendationRecord(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForCreateRecommendationRecord(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenCreateRecommendationRecord(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 创建拍卖开始提醒任务 //////////////////////////////////
	protected void onCreateAuctionStartAlertService(MoyiUserContext ctx) throws Exception{
		checkCanDoCreateAuctionStartAlertService(ctx);
		int processResult = processCreateAuctionStartAlertService(ctx);
		switch(processResult) {
		case LACK_OF_BIDDER_DEPOSIT: // 买家没有支付竞拍保证金
			sync().onCreateBidderDepositNotification(ctx);
			break;
		default: // 正常情况下没有什么需要做的
			break;
		}
		writeLogsForCreateAuctionStartAlertService(ctx);
		async().notifyRelevantPersonsWhenCreateAuctionStartAlertService(ctx);
	}
	
	protected abstract int processCreateAuctionStartAlertService(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoCreateAuctionStartAlertService(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForCreateAuctionStartAlertService(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenCreateAuctionStartAlertService(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 创建竞拍保证金支付通知 //////////////////////////////////
	protected void onCreateBidderDepositNotification(MoyiUserContext ctx) throws Exception{
		checkCanDoCreateBidderDepositNotification(ctx);
		processCreateBidderDepositNotification(ctx);
		writeLogsForCreateBidderDepositNotification(ctx);
		async().notifyRelevantPersonsWhenCreateBidderDepositNotification(ctx);
	}
	
	protected abstract int processCreateBidderDepositNotification(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoCreateBidderDepositNotification(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForCreateBidderDepositNotification(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenCreateBidderDepositNotification(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 拍卖品的公示开始时间到 //////////////////////////////////
	public void onAuctionStartToDisplay(MoyiUserContext ctx) throws Exception{
		checkCanDoAuctionStartToDisplay(ctx);
		int processResult = processAuctionStartToDisplay(ctx);
		switch(processResult) {
		case LACK_OF_SELLER_DEPOSIT: // 时间到了，但是保证金不足
			sync().onBlockAllRealRightBenifitContractTrade(ctx);
			sync().onCreateSellerPerformanceDepositRechargeNotification(ctx);
			break;
		default: // 正常情况，可以公示
			sync().onBlockAllRealRightBenifitContractTrade(ctx);
			break;
		}
		writeLogsForAuctionStartToDisplay(ctx);
		async().notifyRelevantPersonsWhenAuctionStartToDisplay(ctx);
	}
	
	protected abstract int processAuctionStartToDisplay(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoAuctionStartToDisplay(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForAuctionStartToDisplay(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenAuctionStartToDisplay(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	
	// ///////////////////////////// 冻结一切被拍卖艺术品的墨契交易 //////////////////////////////////
	protected void onBlockAllRealRightBenifitContractTrade(MoyiUserContext ctx) throws Exception{
		checkCanDoBlockAllRealRightBenifitContractTrade(ctx);
		processBlockAllRealRightBenifitContractTrade(ctx);
		writeLogsForBlockAllRealRightBenifitContractTrade(ctx);
		async().notifyRelevantPersonsWhenBlockAllRealRightBenifitContractTrade(ctx);
	}
	
	protected abstract int processBlockAllRealRightBenifitContractTrade(MoyiUserContext ctx) throws Exception;
	protected void checkCanDoBlockAllRealRightBenifitContractTrade(MoyiUserContext ctx) throws Exception {
		// by default, nothing was checked
	}
	protected void writeLogsForBlockAllRealRightBenifitContractTrade(MoyiUserContext ctx) {
		// by default, nothing was logged
	}
	protected void notifyRelevantPersonsWhenBlockAllRealRightBenifitContractTrade(MoyiUserContext ctx) throws Exception {
		// by default, nobody was notified
	}
	

}