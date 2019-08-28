package cla.edg.pageflow;

import java.util.List;

import cla.edg.project.yourong.pageflow.S0_Query;

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
		return this;
	}
	public PageFlowScript comments(String string) {
		currentWork.setComments(string);
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
	public PageFlowScript with_object(String paramName) {
		if (currentWork instanceof QueryInfo) {
			String[] names = paramName.split("\\s+as\\s+");
			currentQuery.addObjectParameter(names[1], names[0]);
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
	
	public <T> T graph_query_with(T graphQueryDescriptor) {
		return graphQueryDescriptor;
	}
	
	
	
	
}
