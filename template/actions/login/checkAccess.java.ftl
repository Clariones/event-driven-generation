    @Override
    public void onAccess(BaseUserContext baseUserContext, String methodName, Object[] parameters) {
        super.onAccess(baseUserContext, methodName, parameters);
        // 当前调用的信息保存在（类似于）session里
        ${custom_context_name} ctx = (${custom_context_name}) baseUserContext;
        ctx.putToCache(${NAMING.toCamelCase(project_name)}BaseUtils.getCacheAccessKey(ctx), Boolean.TRUE, (int)(1*DateTimeUtil.HOUR_IN_MS/DateTimeUtil.SECOND_IN_MS)); // 1个小时
        ctx.putIntoContextLocalStorage(${NAMING.toCamelCase(project_name)}BaseConstants.CACHE_KEY_ACCESS_METHOD, methodName);
        ctx.putIntoContextLocalStorage(${NAMING.toCamelCase(project_name)}BaseConstants.CACHE_KEY_ACCESS_PARAMS, parameters);

        ctx.saveAccessInfo(this.getBeanName(), methodName, parameters);
    }

    @Override
    public Object checkAccess(BaseUserContext baseUserContext, String methodName, Object[] parameters)
            throws IllegalAccessException {
        ${custom_context_name} ctx = (${custom_context_name}) baseUserContext;
        try {
			${login_target_class} logined = tryToLoad${login_target_class}FromCache(ctx);
			boolean needLogin = isMethodNeedLogin(ctx, methodName, parameters);
			boolean shouldRefreshToken = shouldRefreshToken(ctx);
			String jwtToken = ctx.getInputJwtToken();
			if (logined != null) {
				if (shouldRefreshToken) {
					String loginInfoCacheToken = createLoginInfoCacheToken(ctx, logined);
					ctx.setJwtKeyId(loginInfoCacheToken);
					ctx.setTokenId(loginInfoCacheToken);
					cacheLoginedUser(ctx, ctx.getJwtKeyId(), ctx.getSecUser(), this.currentApp(ctx), logined );
					jwtToken = makeClientToken(ctx, loginInfoCacheToken, logined);
				}
				ctx.setCurrentUserInfo(logined);
				saveTokenInResponse(ctx, jwtToken);
				return accessOK();
			}
			// 没有登录
			if (needLogin) {
				return accessFail("请登录后再继续使用。");
			}
			// 无需登录，那就生成一个临时的token
			if (shouldRefreshToken) {
				logined = ${login_target_class}.withId("anonymuse");
				String loginInfoCacheToken = createLoginInfoCacheToken(ctx, logined);
		        ctx.setTokenId(loginInfoCacheToken);
		        cacheLoginedUser(ctx, loginInfoCacheToken, null, null, logined);
		        jwtToken = makeClientToken(ctx, loginInfoCacheToken, logined);
		        ctx.setCurrentUserInfo(null);
		        saveTokenInResponse(ctx, jwtToken);
			}
	        return accessOK();
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalAccessException(e.getMessage());
		}
        
    }
    
    protected boolean shouldRefreshToken(${custom_context_name} ctx) {
    	Map<String, Object> data = (Map<String, Object>) ctx.getFromContextLocalStorage("cached_login_data");
    	if (data == null || !data.containsKey("fromTime")) {
    		return true;
    	}
    	Date date = DateTimeUtil.parseInputDateTime(String.valueOf(data.get("fromTime")));
    	if (ctx.now().getTime() - date.getTime() > (5*DateTimeUtil.DAY_IN_MS)) {
    		return true;
    	}
		return false;
	}
	protected boolean isMethodNeedLogin(${custom_context_name} ctx, String methodName, Object[] parameters) {
		// 默认用名字前缀来判断
		return methodName.startsWith("customer");
	}
	protected ${login_target_class} tryToLoad${login_target_class}FromCache(${custom_context_name} ctx) throws Exception {
		DecodedJWT token = getTokenFromClientRequest(ctx);
		if (token == null) {
			return null;
		}
		String jwtKeyId = token.getKeyId();
		ctx.setJwtKeyId(jwtKeyId);
		ctx.setTokenId(jwtKeyId);
		// 从 cache中取得
		Map<String, Object> data = ctx.getCachedObject("login_"+jwtKeyId, Map.class);
		if (data == null) {
			// 没有缓存，或者缓存过期了。
			return null;
		}
		ctx.putIntoContextLocalStorage("cached_login_data", data);
		String userAppId = (String) data.get("userAppId");
		if (userAppId == null) {
			return null;
		}
		String loginedId = (String) data.get("loginAs");
		try{
			${login_target_class} loginTarget = ${login_target_class?uncap_first}DaoOf(ctx).load(loginedId, EO);
			UserApp userApp = userAppDaoOf(ctx).load(userAppId, UserAppTokens.start().withSecUser().done());
			ctx.setCurrentUserInfo(loginTarget);
			int cachePeriod = getLoginInfoCachePeriod(ctx);
			ctx.putToCache(getCurrentAppKey(ctx), userApp, cachePeriod);
			ctx.setSecUser(userApp.getSecUser());
			
			return loginTarget;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
    
    protected DecodedJWT getTokenFromClientRequest(${custom_context_name} ctx) {
		// 先从Header取
    	String jwtToken = ctx.getRequestHeader(JWTUtil.HEADER_NAME);
    	if (TextUtil.isBlank(jwtToken)) {
    		// 试试从cookie取
    		jwtToken = getJwtTokenFromCookie(ctx);
    	}
    	if (!ctx.isProductEnvironment()) {
			ctx.log("Got jwt token: " + TextUtil.shrink(jwtToken, 20, 6,  "..."));
		}
		if (TextUtil.isBlank(jwtToken)) {
			ctx.log("令牌无效:请求中没有JWT token");
			return null;
		}
		jwtToken = JWTUtil.trimJwtToken(jwtToken);
		ctx.setInputJwtToken(jwtToken);
		
		DecodedJWT jwt = JWTUtil.decodeToken(jwtToken);
		if (jwt == null) {
			ctx.log("令牌无效:解析失败");
			return null;
		}
		String tokenEnvType = jwt.getClaim("envType").asString();
		String id = jwt.getKeyId();
		ctx.log(String.format("令牌(%s):%s",tokenEnvType,id));
		if (ctx.isProductEnvironment()) {
			if (!"product".equals(tokenEnvType)) {
				ctx.log("令牌无效:非生产环境token");
				return null;
			}
		} else {
			if (!"test".equals(tokenEnvType)) {
				ctx.log("令牌无效:非测试环境token");
				return null;
			}
		}
		return jwt;
	}
    protected String getJwtTokenFromCookie(${custom_context_name} ctx) {
		if (ctx.isProductEnvironment()) {
			return null;
		}
		Cookie[] cookies = ctx.getCookies();
		if (cookies == null || cookies.length == 0) {
			return null;
		}
		for (Cookie cookie: cookies) {
			if (cookie.getName().equalsIgnoreCase(JWTUtil.HEADER_NAME)) {
				return cookie.getValue();
			}
		}
		return null;
	}
	