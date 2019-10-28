<#assign loginInfo=script.userLoginInfo />
<#assign login_target_class=NAMING.toCamelCase(loginInfo.userModelName)/>
<#assign login_target_model=loginInfo.userModelName/>
    
    protected Object processClientLogin(${custom_context_name} ctx, Map<String, Object> params) throws Exception {
        // 先根据输入参数，判断应该用哪个 loginHandler
        BaseLoginHandler loginHandler = findLoginHandler(ctx, params);
        // loginHandler 首先找到登录的目标用户。 如果登录失败，会抛出异常。 如果允许登录，
        ${login_target_class} loginTarget = loginHandler.doLogin(ctx, params);
        if (loginTarget == null) {
            // 如果没有抛异常，返回null，说明是个 '新建用户'。 触发'onNewLogin'方法
            loginTarget = onNewLogin(ctx, params);
        }
        // 找到登录目标对应的 secUser 和 userApp
        SecUser secUser = findSecUserByLoginTarget(ctx, loginTarget);
        if (secUser == null) {
            secUser = when${login_target_class}NotRelatedWithSecUser(ctx, loginHandler, loginTarget);
        }
        UserApp userApp = ctx.getUserAppByBindedEntity(ctx, loginTarget);
		// 缓存
        String loginInfoCacheToken = createLoginInfoCacheToken(ctx, loginTarget);
        ctx.setTokenId(loginInfoCacheToken);
        cacheLoginedUser(ctx, loginInfoCacheToken, secUser, userApp, loginTarget);
        String jwtToken = makeClientToken(ctx, loginInfoCacheToken, loginTarget);
        ctx.setCurrentUserInfo(loginTarget);
        saveTokenInResponse(ctx, jwtToken);
        afterLogined(ctx, loginTarget);
        return loginTarget;
    }

	protected void afterLogined(${custom_context_name} ctx, ${login_target_class} loginTarget) {
    	// 默认不用再做什么了
	}

	protected void saveTokenInResponse(${custom_context_name} ctx, String jwtToken) {
    	ctx.setResponseHeader(JWTUtil.HEADER_NAME, jwtToken);
	}

	protected String makeClientToken(${custom_context_name} ctx, String loginInfoCacheToken, ${login_target_class} loginTarget) {
		String jwtTokenString = JWTUtil.getJwtToken(loginInfoCacheToken,
				${NAMING.toCamelCase(project_name)}BaseUtils.getOssUploadFolderName("", loginTarget.getId(), ctx.isProductEnvironment()),
				ctx.isProductEnvironment()?"product":"test", ctx.now());
		return jwtTokenString;
	}

	protected int getLoginInfoCachePeriod(${custom_context_name} ctx) {
		return (int) (7*DateTimeUtil.DAY_IN_MS/DateTimeUtil.SECOND_IN_MS);
	}
	protected void cacheLoginedUser(${custom_context_name} ctx, String loginInfoCacheToken, SecUser secUser, UserApp userApp, ${login_target_class} loginTarget) {
		Map<String, Object> data = MapUtil.put("secUserId", secUser.getId())
				.put("userAppId", userApp.getId())
				.put("loginAs", loginTarget.getId())
				.putIf(ctx.getFromContextLocalStorage("wechatLoginSessionKey")!=null, "wechatLoginSessionKey", ctx.getFromContextLocalStorage("wechatLoginSessionKey"))
				.put("fromTime", ctx.now())
				.into_map();
		// 一周没有活动，就重新登录。 超过5天则更新
		int cachePeriod = getLoginInfoCachePeriod(ctx);
		ctx.putToCache("login_"+loginInfoCacheToken, data, cachePeriod);

		// 保证 this.currentApp(ctx) 能够拿到 userApp
		ctx.putToCache(getCurrentAppKey(ctx), userApp, cachePeriod);
		ctx.setSecUser(secUser);
	}

	// 为当前登陆的用户创建一个 tokenKey，用于cache，并将其生成jwtToken
	protected String createLoginInfoCacheToken(${custom_context_name} ctx, ${login_target_class} loginTarget) {
    	// 随机生成一个字符串
    	return ${NAMING.toCamelCase(project_name)}BaseUtils.hashWithSHA256(loginTarget.getId(), RandomUtil.randomChars(8));
	}

	// 如果对应的secUser不存在，一般来说是代码或者数据异常，需要人工干预。 也可以不调查原因，直接创建secUser和userApp。 默认的实现是 抛异常。
    protected SecUser when${login_target_class}NotRelatedWithSecUser(${custom_context_name} ctx, BaseLoginHandler loginHandler, ${login_target_class} loginTarget) throws Exception {
        throwsExceptionWithMessage(ctx, String.format("该用户(%s)没有关联系统账户，请联系客户处理账号异常。", loginTarget.getId()));
        return null;
    }

    protected void throwsExceptionWithMessage(${custom_context_name} ctx, String message) throws WxappServiceException {
    	throw new WxappServiceException(message);
    }

    protected SecUser findSecUserByLoginTarget(${custom_context_name} ctx, ${login_target_class} loginTarget) {
    	String sql = "select SU.* from sec_user_data SU left join user_app_data UA on UA.sec_user = SU.id " + 
    			"	where UA.object_type=? and UA.object_id=? and SU.domain is not null";
    	SmartList<SecUser> suList = secUserDaoOf(ctx).queryList(sql, loginTarget.getInternalType(), loginTarget.getId());
        return suList.first();
    }

    
    // 默认新用户登录，自动创建账户。 具体的字段需要业务实现。所以此处为 abstract
    protected abstract ${login_target_class} onNewLogin(${custom_context_name} ctx, Map<String, Object> params) throws Exception;

    protected BaseLoginHandler findLoginHandler(${custom_context_name} ctx, Map<String, Object> params) {

        String loginMethod = (String) params.get("loginMethod");
		switch (loginMethod) {
<#if loginInfo.canLoginBy("wechat_work_app")>
            case BaseLoginHandler.WECHAT_WORK_APP: {
                return new BaseLoginHandler() {
                    @Override
                    public ${login_target_class} doLogin(${custom_context_name} ctx, Map<String, Object> params) throws Exception{
                        WxCpService svc = getWxCpService();
                        String code = (String) params.get(BaseLoginHandler.PARAM_CODE);
                        WxCpMaJsCode2SessionResult sessionInfo = svc.jsCode2Session(code);
                        String userId = sessionInfo.getUserId();
                        String userSessionKey = sessionInfo.getSessionKey();
                        ctx.putIntoContextLocalStorage("wechatLoginSessionKey", userSessionKey);
                        MultipleAccessKey key = new MultipleAccessKey();
						WechatWorkLoginInfo logInfo = wechatWorkLoginInfoDaoOf(ctx).loadByUserId(userId, EO);
						if (logInfo == null) {
							return null;
						}
						logInfo.updateSessionKey(userSessionKey);
						wechatWorkLoginInfoManagerOf(ctx).internalSaveWechatWorkLoginInfo(ctx, logInfo, EO);
						return ${login_target_class?uncap_first}DaoOf(ctx).load(logInfo.get${login_target_class}().getId(), EO);
                    }
                };
            }
</#if>
<#if loginInfo.canLoginBy("wechat_app")>
            case BaseLoginHandler.WECHAT_APP:{
                return new BaseLoginHandler() {
                    @Override
                    public ${login_target_class} doLogin(${custom_context_name} ctx, Map<String, Object> params) throws Exception{
                        WxMaService wxService = getWxMaService();
                        String code = (String) params.get(BaseLoginHandler.PARAM_CODE);
                        WxMaJscode2SessionResult sessionInfo = wxService.jsCode2SessionInfo(code);
                        String openId = sessionInfo.getOpenid();
                        String userSessionKey = sessionInfo.getSessionKey();
                        ctx.putIntoContextLocalStorage("wechatLoginSessionKey", userSessionKey);
                        String sql = "select * from wechat_login_info_data where open_id=? and ${login_target_model} is not null";
						SmartList<WechatLoginInfo> infoList = wechatLoginInfoDaoOf(ctx).queryList(sql, openId);
						if (infoList == null || infoList.isEmpty()) {
							return null;
						}
						WechatLoginInfo logInfo = infoList.first();
						logInfo.updateSessionKey(userSessionKey);
						wechatLoginInfoManagerOf(ctx).internalSaveWechatLoginInfo(ctx, logInfo, EO);
						return ${login_target_class?uncap_first}DaoOf(ctx).load(logInfo.get${login_target_class}().getId(), EO);
                    }
                };
            }
</#if>
<#if loginInfo.canLoginBy("mobile_and_vcode")>
            case BaseLoginHandler.MOBILE_AND_VCODE:{
            	return new BaseLoginHandler() {
                    @Override
                    public ${login_target_class} doLogin(${custom_context_name} ctx, Map<String, Object> params) throws Exception{
                    	String vCode = (String) params.get("verifyCode");
                    	String mobile = (String) params.get("mobile");
                    	mobile = ${NAMING.toCamelCase(project_name)}BaseUtils.formatChinaMobile(mobile);
                    	checkVerifyCode(ctx, vCode, mobile);
                    	
                        String sql = "select * from ${login_target_model}_data where mobile=?";
                        SmartList<${login_target_class}> list = ${login_target_class?uncap_first}DaoOf(ctx).queryList(sql, mobile);
                        if (list == null || list.isEmpty()) {
                        	return null;
                        }
                        return list.first();
                    }
                };
            }
</#if>
            default:
        }
        return null;
    }