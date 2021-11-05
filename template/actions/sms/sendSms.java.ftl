	public Object sendVerifyCode(${custom_context_name} ctx, String mobile) throws Exception {
		String vCode = RandomUtil.randomNum(6);
		mobile = ${NAMING.toCamelCase(project_name)}BaseUtils.formatChinaMobile(mobile);
		cacheVerifyCode(ctx, mobile, vCode);
		ctx.sendMessage(mobile, getSmsSign(ctx), getSmsVCodeTemplate(ctx), MapUtil.put("code", vCode).into_map(String.class));
		if (ctx.isProductEnvironment()) {
			return makeToast("短信已经发送到"+TextUtil.shrink(mobile, 3, 2, "***")+",请注意查收", 10, "info");
		}else {
			return makeToast("验证码"+vCode+"已经发送到"+TextUtil.shrink(mobile, 3, 2, "***")+",请注意查收", 10, "info");
		}
	}
    
    protected String getSmsVCodeTemplate(${custom_context_name} ctx) {
		return TextUtil.getExtVariable("SMS_VERIFY_CODE", "");
	}
	protected String getSmsSign(${custom_context_name} ctx) {
		return TextUtil.getExtVariable("SMS_SIGN", "");
	}