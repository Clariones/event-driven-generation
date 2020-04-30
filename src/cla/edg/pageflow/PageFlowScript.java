package cla.edg.pageflow;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import cla.edg.graphquery.terms.BaseGraphQueryDescriptor;
import cla.edg.modelbean.BaseAttribute;
import cla.edg.modelbean.BaseModelBean;
import cla.edg.modelbean.CorperationPathNode;
import cla.edg.modelbean.LogicalOperator;
import cla.edg.modelbean.ModelBeanRoute;
import cla.edg.modelbean.NumberAttribute;


public class PageFlowScript extends BasePageFlowScript {

	public PageFlowScript need_login() {
		if (currentWork == null) {
			this.needLoginByDefault = true;
		}else if (currentWork instanceof Request) {
			currentRequest.setNeedLogin(true);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定需要登录");
		}
		return this;
	}
	public PageFlowScript no_login() {
		if (currentWork == null) {
			this.needLoginByDefault = false;
		}else if (currentWork instanceof Request) {
			currentRequest.setNeedLogin(false);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定可以匿名访问");
		}
		return this;
	}
	public PageFlowScript has_footprint() {
		if (currentWork == null) {
			this.hasFootPrintDefault = true;
		}else if (currentWork instanceof Request) {
			currentRequest.setHasFootprint(true);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定可以回退");
		}
		return this;
	}
	public PageFlowScript no_footprint() {
		if (currentWork == null) {
			this.hasFootPrintDefault = false;
		}else if (currentWork instanceof Request) {
			currentRequest.setHasFootprint(false);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定不能回退");
		}
		return this;
	}
	public PageFlowScript request(String pathName) {
		Request request = new Request();
		request.setName(pathName);
		request.setNeedLogin(needLoginByDefault);
		request.setHasFootprint(hasFootPrintDefault);
		addNewRequest(request);
		setCurrentWork(request);
		return this.comments("这个程序员很懒,什么也没留下");
	}
	public PageFlowScript comments(String string) {
		if (currentWork instanceof BasePageFlowElement) {
			((BasePageFlowElement) currentWork).setComments(string);
		}
		return this;
	}
	
	public PageFlowScript got_page(String pageName) {
		if (currentWork instanceof Request) {
			return when("by default").got_page(pageName);
		}
		if (currentWork instanceof QueryInfo) {
			return when("by default").got_page(pageName);
		}
		if (currentWork instanceof Branch) {
			Page page = findPageByName(pageName);
			if (page == null) {
				page = new Page();
				page.setName(pageName);
				addNewPage(page);
			}
			currentBranch.setPage(pageName);
			setCurrentWork(page);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定结果页面");
		}
		return this;
	}
	public PageFlowScript got_page_same_as_request(String requestName) {
		Request referedRequest = findRequestByName(requestName);
		if (referedRequest == null) {
			throw new RuntimeException("请求"+requestName+"不存在");
		}
		if (currentWork instanceof Request) {
			((Request) currentWork).setBranches(referedRequest.getBranches());
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能引用结果页面");
		}
		return this;
	}
	
	public PageFlowScript when_others() {
		return when("by default");
	}
	public PageFlowScript when(String code) {
		if (currentWork instanceof Request) {
			Branch bch = currentRequest.addBranch(code);
			setCurrentWork(bch);
		}else {
			setCurrentWork(currentRequest);
			Branch bch = currentRequest.addBranch(code);
			setCurrentWork(bch);
//		}else {
//			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定分支");
		}
		return this;
	}
	public PageFlowScript customize() {
		if (currentWork instanceof Request) {
			List<AccessParameter> ps = currentRequest.getParameters();
			if (ps == null) {
				throw new RuntimeException("没有指定任何参数，不能标记定制化");
			}
			AccessParameter p = ps.get(ps.size()-1);
			if (!p.getTypeName().equals("form")) {
				throw new RuntimeException("不是Form参数，不能标记定制化");
			}
			p.setCustomized(true);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能标记定制化");
		}
		return this;
	}
	public PageFlowScript with_form(String formName) {
		if (currentWork instanceof Request) {
			AccessParameter p = currentRequest.addFormParameter(formName);
			currentRequest.setHasFootprint(false);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定提交的form"+formName);
		}
		return this;
	}
	public PageFlowScript with_integer(String paramName) {
		if (currentWork instanceof Request) {
			AccessParameter p = currentRequest.addIntegerParameter(paramName);
		}else if (currentWork instanceof QueryInfo) {
			currentQuery.addIntegerParameter(paramName);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定整型参数"+paramName);
		}
		return this;
	}
	public PageFlowScript with_float(String paramName) {
		if (currentWork instanceof Request) {
			AccessParameter p = currentRequest.addFloatParameter(paramName);
		}else if (currentWork instanceof QueryInfo) {
			currentQuery.addFloatParameter(paramName);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定浮点型参数"+paramName);
		}
		return this;
	}
	public PageFlowScript with_boolean(String paramName) {
		if (currentWork instanceof Request) {
			AccessParameter p = currentRequest.addBooleanParameter(paramName);
		}else if (currentWork instanceof QueryInfo) {
			currentQuery.addBooleanParameter(paramName);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定布尔参数"+paramName);
		}
		return this;
	}
	public PageFlowScript with_last_record_id() {
		return with_string("last record id");
	}
	
	public PageFlowScript with_string(String paramName) {
		if (currentWork instanceof Request) {
			AccessParameter p = currentRequest.addStringParameter(paramName);
		}else if (currentWork instanceof QueryInfo) {
			currentQuery.addStringParameter(paramName);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定字符串参数"+paramName);
		}
		return this;
	}
	public PageFlowScript with_date(String paramName) {
		if (currentWork instanceof Request) {
			AccessParameter p = currentRequest.addDateParameter(paramName);
		}else if (currentWork instanceof QueryInfo) {
			currentQuery.addDateParameter(paramName);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定字符串参数"+paramName);
		}
		return this;
	}
	public PageFlowScript with_object(String paramName) {
		if (currentWork instanceof QueryInfo) {
			String[] names = paramName.split("\\s+as\\s+");
			currentQuery.addObjectParameter(names[1], names[0]);
		}else if (currentWork instanceof Request) {
			String[] names = paramName.split("\\s+as\\s+");
			currentRequest.addObjectParameter(names[1], names[0]);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定对象参数"+paramName);
		}
		return this;
	}
	public PageFlowScript variable() {
		if (currentWork instanceof Request) {
			List<AccessParameter> params = currentRequest.getParameters();
			if (params == null || params.isEmpty()) {
				throw new RuntimeException("variable()必须用于with_xxx()之后，用于指定某个参数在构造URL时留为变量格式");
			}
			AccessParameter p = params.get(params.size()-1);
			p.setAsVariable(true);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定字符串参数");
		}
		return this;
	}
	public PageFlowScript may_request(String requestName) {
		if (currentWork instanceof Page) {
			currentPage.addPossibleRequest(requestName);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能增加页面请求");
		}
		return this;
	}
	
	
	public PageFlowScript in_page(String pageName) {
		Page page = findPageByName(pageName);
		if (page == null) {
			page = new Page();
			page.setName(pageName);
			addNewPage(page);
		}
		setCurrentWork((Request)null);
		setCurrentWork(page);
		return this;
	}
	public PageFlowScript TBD() {
		throw new RuntimeException("TBD");
	}
	public PageFlowScript go_back_previous_page() {
		got_page("go back");
		return this;
	}
	
	public PageFlowScript query(BaseModelBean bean) {
		return query(bean.getModelTypeName());
	}
	public PageFlowScript query(String tgtName) {
		QueryInfo qInfo = new QueryInfo();
		qInfo.setObjectName(tgtName);
		addQueryInfo(qInfo);
		setCurrentWork(qInfo);
		return this;
	}
	
	public PageFlowScript which(String whichDescription) {
		if (currentQuery == null) {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能描述搜索");
		}
		currentQuery.setName(whichDescription);
		return this;
	}
	public PageFlowScript pagination() {
		if (currentQuery == null) {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定分页");
		}
		currentQuery.setPagination(true);
		return this;
	}
	public PageFlowScript no_pagination() {
		if (currentQuery == null) {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定分页");
		}
		currentQuery.setPagination(false);
		return this;
	}
	public PageFlowScript rule_comments(String string) {
		if (currentQuery == null) {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能添加query规则描述:"+string);
		}
		currentQuery.addRuleComments(string);
		return this;
	}
	public PageFlowScript cache_in_seconds(int cacheTimeInSeconds) {
		if (currentWork instanceof Request) {
			currentRequest.setCacheTimeInSeconds(cacheTimeInSeconds);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能设置缓存时间");
		}
		return this;
	}
	public PageFlowScript list_of(String templateName) {
		if (currentWork instanceof Page) {
			currentPage.setListOfTemplate(templateName);
		}else if (currentWork instanceof QueryInfo) {
			return which(templateName);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能增加页面请求");
		}
		return this;
	}
	public PageFlowScript as_class(String className) {
		if (currentWork instanceof Page) {
			currentPage.setRenderClassName(className);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定类名");
		}
		return this;
	}
	public PageFlowScript title(String name) {
		if (currentWork instanceof Page) {
			currentPage.setPageTitle(name);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定页面标题");
		}
		return this;
	}
	public PageFlowScript can_refresh() {
		if (currentWork instanceof Page) {
			currentPage.setRefreshAction(true);
		}else if (currentWork instanceof Request) {
			currentRequest.setCanRefresh(true);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能设定刷新行为");
		}
		return this;
	}
	public PageFlowScript import_from(PieceOfScript scriptOfQuery) {
		return scriptOfQuery.makeSequel(this);
	}
	public PageFlowScript todo() {
		if (currentWork instanceof Request) {
			this.got_page("TODO").comments("TODO");
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+",还没支持 TODO 的定义");
		}
		return this;
	}
	public PageFlowScript got_ajax_page() {
		return got_page("ajax response");
	}
		
	public BaseGraphQueryDescriptor graph_query_with() {
		if (getGraphQueryDescriptor() == null) {
			setGraphQueryDescriptor(new BaseGraphQueryDescriptor());
			getGraphQueryDescriptor().setPageFlowScript(this);
		}
		return getGraphQueryDescriptor();
	}
	
	
	public PageFlowScript base_on() {
		currentWork = this.getConfiguration();
		return this;
	}
	public PageFlowScript got_popup_page() {
		return got_page("simple popup");
	}
	public PageFlowScript login_as(String modelName) {
		UserLoginInfo ulInfo = new UserLoginInfo();
		ulInfo.setUserModelName(modelName);
		userLoginInfo = ulInfo;
		return this.request("client login").with_object("com.terapico.caf.baseelement.LoginParam as loginParam")
				.comments("默认的客户端登录接口").no_footprint().no_login();
	}
	public PageFlowScript login_from_wxapp_by_wechat_work() {
		userLoginInfo.addLoginMethod("wechat_work_app");
		return this;
	}
	public PageFlowScript login_from_wxapp_by_openid() {
		userLoginInfo.addLoginMethod("wechat_app");
		return this;
	}
	public PageFlowScript login_by_mobile_with_verify_code() {
		userLoginInfo.addLoginMethod("mobile_and_vcode");
		return this;
	}
	public PageFlowScript standard_homepage(String title) {
		return this.request("view homepage")
				.comments("查看首页").no_login().has_footprint().can_refresh()
			.got_page("home").title(title).as_class("com.terapico.appview.HomePage")
			;
	}
	public PageFlowScript standard_me(String title) {
		return this.request("view dashboard")
				.comments("我的").need_login().has_footprint().can_refresh()
			.got_page("me").title(title).as_class("com.terapico.appview.MePage")
			;
	}
	protected PageFlowScript with_field(String name, String scope) {
		if (currentWork instanceof Page) {
			currentPage.addField(name, scope);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能设定字段");
		}
		return this;
	}
	
	public PageFlowScript got_me_page() {
		return got_page("me").as_class("com.terapico.appview.MePage");
	}
	public PageFlowScript got_home_page() {
		return got_page("home").as_class("com.terapico.appview.HomePage");
	}
	
	public PageFlowScript find(String tgtName) {
		this.query(tgtName);
		currentQuery.setQuerySingleObject(true);
		return this;
	}
	public PageFlowScript do_it_as() {
		if (currentWork instanceof QueryInfo) {
			queryActionInfo = new QueryActionInfo();
			currentQuery.setQueryActionInfo(queryActionInfo);
			queryActionInfo.setTargetModelTypeName(currentQuery.getObjectName());
			queryActionInfo.setQuerySingle(currentQuery.isQuerySingleObject());
			queryActionInfo.setPagination(currentQuery.isPagination());
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定执行细节");
		}
		return this;
	}
	public PageFlowScript sql_is(String sql) {
		if (currentWork instanceof QueryInfo) {
			queryActionInfo.setSqlTemplate(sql);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定SQL细节");
		}
		return this;
	}
	public PageFlowScript param_string(String param) {
		if (currentWork instanceof QueryInfo) {
			queryActionInfo.addParamString(param);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定SQL参数细节");
		}
		return this;
	}
	public PageFlowScript param(Object param) {
		if (currentWork instanceof QueryInfo) {
			queryActionInfo.addParam(param);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定SQL参数细节");
		}
		return this;
	}
	public PageFlowScript need_know(String typeName) {
		if (currentWork instanceof QueryInfo) {
			queryActionInfo.getExternTypesNeedKnown().add(typeName);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定SQL参数细节");
		}
		return this;
	}
	
	public PageFlowScript not_generate_pagination_params() {
		if (currentWork instanceof QueryInfo) {
			queryActionInfo.setNotGeneratePaginationParams(true);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定搜索条件");
		}
		return this;
	}
	public PageFlowScript where(LogicalOperator ... conditions) {
		return where_with(true, conditions);
	}
	public PageFlowScript where_any(LogicalOperator ... conditions) {
		return where_with(false, conditions);
	}
	protected PageFlowScript where_with(boolean doAnd, LogicalOperator ... conditions) {
		if (currentWork instanceof QueryInfo) {
			// 
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定搜索条件");
		}
		
		ModelBeanRoute beanRoute = null;
		LogicalOperator c1 = conditions[0];
		if (conditions.length == 1) {
			beanRoute = c1.getBeanRoute();
		}else {
			for(int i=1;i<conditions.length;i++) {
				if (doAnd) {
					c1.and(conditions[i]);
				}else{
					c1.or(conditions[i]);
				}
			}
			beanRoute = c1.getBeanRoute();
		}
		if (beanRoute == null) {
			throw new RuntimeException("找不到bean route");
		}
		
		queryActionInfo.setBeanRoute(beanRoute);
		queryActionInfo.setSearchWhere(c1);
		queryActionInfo.getExternTypesNeedKnown().addAll(beanRoute.getAllNodes().values().stream()
				.map(it -> it.getData().getFullClassName()).collect(Collectors.toSet()));
		queryActionInfo.getExternTypesNeedKnown().addAll(c1.needKnownClasses);
		//
		return this;
	}
	public PageFlowScript wants(BaseModelBean ... endPoints) {
		if (currentWork instanceof QueryInfo) {
			// 
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定加载范围");
		}
		BaseModelBean b1 = endPoints[0];
		ModelBeanRoute beanRoute = null;
		beanRoute = b1.getBeanRoute();
		if (endPoints.length == 1) {
			// 不用合并了
		}else {
			for(int i=1;i<endPoints.length;i++) {
				beanRoute = (ModelBeanRoute) beanRoute.mergeWith(endPoints[i].getBeanRoute());
			}
		}
		if (beanRoute == null) {
			throw new RuntimeException("找不到bean route");
		}
		queryActionInfo.getExternTypesNeedKnown().addAll(beanRoute.getAllNodes().values().stream()
				.map(it -> it.getData().getFullClassName()).collect(Collectors.toSet()));
		queryActionInfo.setWantedMap(beanRoute);
		return this;
	}
	public PageFlowScript search_along(BaseModelBean ... modelPaths) {
		if (currentWork instanceof QueryInfo) {
			// 
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定搜索路径");
		}
		List<CorperationPathNode> allList = new ArrayList<>();
		for(BaseModelBean bean : modelPaths) {
			bean.getCorperatedPath().forEach(it->{
				String key = it.getKey();
				if (allList.stream().anyMatch(e->e.getKey().equals(key))) {
					return;
				}
				allList.add(it);
			});
		}
		queryActionInfo.setSearchAlongPath(allList);
		return this;
	}
	
	public PageFlowScript test() {
		String sql = queryActionInfo.getSqlFromSearchClause();
		System.out.println(sql);
		return this;
	}
	public PageFlowScript find(BaseModelBean bean) {
		return find(bean.getModelTypeName());
	}

	public PageFlowScript count() {
		if (currentWork instanceof QueryInfo && queryActionInfo != null) {
			// 目前只支持这种场景
			queryActionInfo.setCounting(true);
		} else {
			throw new RuntimeException("当前任务是" + currentWork.getClass().getSimpleName() + ", 不能指定搜索条件");
		}
		return this;
	}
	public PageFlowScript count_by(BaseAttribute countByAttr) {
		if (currentWork instanceof QueryInfo && queryActionInfo != null) {
			// 目前只支持这种场景
			queryActionInfo.setCounting(true);
			queryActionInfo.setSumAttribute(countByAttr);
		} else {
			throw new RuntimeException("当前任务是" + currentWork.getClass().getSimpleName() + ", 不能指定count by条件");
		}
		return this;
	}
	public PageFlowScript count_by(BaseModelBean countByAttr) {
		if (currentWork instanceof QueryInfo && queryActionInfo != null) {
			// 目前只支持这种场景
			queryActionInfo.setCounting(true);
			queryActionInfo.setSumAttribute(countByAttr.id());
		} else {
			throw new RuntimeException("当前任务是" + currentWork.getClass().getSimpleName() + ", 不能指定count_by条件");
		}
		return this;
	}
	public PageFlowScript sum(NumberAttribute attribute) {
		if (currentWork instanceof QueryInfo && queryActionInfo != null) {
			// 目前只支持这种场景
			queryActionInfo.setSum(true);
			queryActionInfo.setSumAttribute(attribute);
		} else {
			throw new RuntimeException("当前任务是" + currentWork.getClass().getSimpleName() + ", 不能指定求和条件");
		}
		return this;
	}
	public PageFlowScript order_by(BaseAttribute attr) {
		if (currentWork instanceof QueryInfo && queryActionInfo != null) {
			// 目前只支持这种场景
			queryActionInfo.addSortingPath(attr, false);
		} else {
			throw new RuntimeException("当前任务是" + currentWork.getClass().getSimpleName() + ", 不能指定排序条件");
		}
		return this;
	}
	public PageFlowScript order_by(BaseModelBean bean) {
		if (currentWork instanceof QueryInfo && queryActionInfo != null) {
			// 目前只支持这种场景
			queryActionInfo.addSortingPath(bean, false);
		} else {
			throw new RuntimeException("当前任务是" + currentWork.getClass().getSimpleName() + ", 不能指定排序条件");
		}
		return this;
	}
	public PageFlowScript desc() {
		if (currentWork instanceof QueryInfo && queryActionInfo != null) {
			// 目前只支持这种场景
			queryActionInfo.setCurrentSortingDirectionASC(false);
		} else {
			throw new RuntimeException("当前任务是" + currentWork.getClass().getSimpleName() + ", 不能指定排序方向");
		}
		return this;
	}
	public PageFlowScript asc() {
		if (currentWork instanceof QueryInfo && queryActionInfo != null) {
			// 目前只支持这种场景
			queryActionInfo.setCurrentSortingDirectionASC(true);
		} else {
			throw new RuntimeException("当前任务是" + currentWork.getClass().getSimpleName() + ", 不能指定排序方向");
		}
		return this;
	}
	public PageFlowScript top(String limitExp) {
		if (currentWork instanceof QueryInfo) {
			queryActionInfo.setLimitExp(limitExp);
			return this;
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定搜索条件");
		}
	}
	public PageFlowScript top_3() {
		return top("3");
	}
	public PageFlowScript top_5() {
		return top("5");
	}
	public PageFlowScript top_10() {
		return top("10");
	}
	public PageFlowScript got_cr_page() {
		return got_page("general_cr_page");
	}
	
	
	public PageFlowScript request_with_changerequest(String crName) {
		request("submit cr " + crName);
		currentRequest.setChangeRequestName(crName);
		return this;
	}



}
