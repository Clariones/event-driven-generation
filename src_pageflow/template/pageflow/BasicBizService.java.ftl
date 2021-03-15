<#import "tools.ftl" as T/>
package ${package};

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.binarywang.wx.miniapp.bean.WxMaPhoneNumberInfo;
import cn.binarywang.wx.miniapp.util.crypt.WxMaCryptUtils;
import com.terapico.utils.*;

import com.skynet.infrastructure.StorageService;

import ${base_package}.*;
import ${package}pageview.*;

/**
 * 此类负责：所有的基础设施服务。 例如重复提交的基础方法，权限认证，异常包装，本服务内的通用工具方法等。
 * @author clariones
 *
 */
public abstract class Basic${class_name}ViewBizService extends ${class_name}ViewService implements FootprintProducer {
    private WxMaService wxMaService;
    public WxMaService getWxMaService() {
        return wxMaService;
    }
    public void setWxMaService(WxMaService wxMaService) {
        this.wxMaService = wxMaService;
    }

	@Override
	public boolean canReplaceFootPrint(Footprint fp1, Footprint fp2) {
		if (!fp1.getMethodName().equals(fp2.getMethodName())) {
			return false;
		}
		return true;
	}

	@Override
	public boolean clearTop() {
		return true;
	}
	
	public Object sendVerifyCode(${custom_context_name} ctx, String inMobile) throws Exception {
		String mobile = TextUtil.formatChinaMobile(inMobile);
		if (mobile == null) {
			throw new Exception("您输入的" + inMobile + "不是有效的手机号");
		}
		String verifyCode = RandomUtil.randomNum(6);
		cacheVerifyCode(ctx, mobile, verifyCode);
		ctx.sendMessage(mobile, getSmsSign(ctx), getSmsVCodeTemplate(ctx), MapUtil.with("code", verifyCode));
		if (ctx.isProductEnvironment()) {
			ctx.setToast(makeToast("验证码已经发送到手机" + TextUtil.shrink(mobile, 3, 3, "***") + ",请注意查收", 5, "info"));
		} else {
			ctx.setToast(makeToast("验证码" + verifyCode + "已经发送到手机" + TextUtil.shrink(mobile, 3, 3, "***") + ",请注意查收", 5,
					"info"));
		}
		SimpleToastPage page = this.assemblerSimpleToastPage(ctx, "sendVerifyCode");
		return page.doRender(ctx);
	}

	public Object customGetOssToken(${custom_context_name} ctx) throws Exception {
        String userUploadHome = "upload/${helper.nameAsThis(project_name)?lower_case}/anonymous";
        if (ctx.getCurrentUserInfo() != null) {
            userUploadHome = "upload/${helper.nameAsThis(project_name)?lower_case}/" + ctx.getCurrentUserInfo().getId();
        }
        // we will output json only
        ctx.forceRenderingAsJson();

        StorageService storageService = (StorageService) ctx.getBean("storageService");
        return storageService.genToken(userUploadHome);

    }

    public Object getPhoneNoInfo(${custom_context_name} ctx, String code, String encryptedData, String iv) throws Exception {
        String sessionKey;
        String userSessionKey = null;
        String appId = wxMaService.getWxMaConfig().getAppid();
        WxMaJscode2SessionResult sessionInfo = wxMaService.jsCode2SessionInfo(code);
        if (sessionInfo == null) {
            throw new Exception("获取session 失败");
        }
        String openId = sessionInfo.getOpenid();
        userSessionKey = sessionInfo.getSessionKey();
        ctx.log("getPhoneNoInfo()=userSessionKey="+userSessionKey);
        String cacheKey = this.getWechatSessionKeyCacheKey(ctx, appId, openId);
        ctx.putToCache(cacheKey, userSessionKey, (int) (1 * DateTimeUtil.HOUR_IN_MS / DateTimeUtil.SECOND_IN_MS));
        String x = WxMaCryptUtils.decrypt(userSessionKey, encryptedData, iv);
        ctx.log("getPhoneNoInfo()="+x);
        WxMaPhoneNumberInfo phoneNoInfo = WxMaPhoneNumberInfo.fromJson(x);
        updateCurrentUserMobile(ctx, phoneNoInfo.getPurePhoneNumber());
        return x;
    }

    protected void updateCurrentUserMobile(${custom_context_name} ctx, String mobile) throws Exception {
//		根据业务确定是否要更新当前用户的手机号,例如:
//		PersonalUser user = (PersonalUser) ctx.getCurrentUserInfo();
//		user.updateMobile(mobile);
//		ctx.getManagerGroup().getPersonalUserManager().internalSavePersonalUser(ctx, user, EO);
    }

    protected String getWechatSessionKeyCacheKey(${custom_context_name} ctx, String appId, String openId) {
        return String.format("wechatSession:%s:%s:%s", openId, appId, ctx.tokenId());
    }
}
