	
	public Object sendVerifyCode(${custom_context_name} ctx, String inputMobile) throws Exception {
		String mobile = TextUtil.formatChinaMobile(inputMobile);
		if (mobile == null) {
			throw new Exception("您输入的" + inputMobile + "不是有效的手机号");
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
		return assemblerToastPage(ctx, "sendVerifyCode");
		
	}
	protected Object assemblerToastPage(${custom_context_name} ctx, String methodName) throws Exception {
		return ctx.getToast();
	}
    
    protected String getSmsVCodeTemplate(${custom_context_name} ctx) {
		return TextUtil.getExtVariable("SMS_VERIFY_CODE", "");
	}
	protected String getSmsSign(${custom_context_name} ctx) {
		return TextUtil.getExtVariable("SMS_SIGN", "");
	}