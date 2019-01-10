package cla.edg.pageflow;

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
	public BasePageFlowScript no_login() {
		if (currentWork == null) {
			this.needLoginByDefault = false;
		}else if (currentWork instanceof Request) {
			currentRequest.setNeedLogin(false);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定可以匿名访问");
		}
		return this;
	}
	public BasePageFlowScript has_footprint() {
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
		if (currentWork instanceof Branch) {
			Page page = currentBranch.setPage(pageName);
//			setCurrentWork(page);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定结果页面");
		}
		return this;
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
	public PageFlowScript with_form(String formName) {
		if (currentWork instanceof Request) {
			AccessParameter p = currentRequest.addFormParameter(formName);
			currentRequest.setHasFootprint(false);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定提交的form");
		}
		return this;
	}
	public PageFlowScript with_integer(String paramName) {
		if (currentWork instanceof Request) {
			AccessParameter p = currentRequest.addIntegerParameter(paramName);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定整型参数");
		}
		return this;
	}
	public PageFlowScript with_boolean(String paramName) {
		if (currentWork instanceof Request) {
			AccessParameter p = currentRequest.addBooleanParameter(paramName);
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定布尔参数");
		}
		return this;
	}
	public PageFlowScript with_string(String paramName) {
		if (currentWork instanceof Request) {
			AccessParameter p = currentRequest.addStringParameter(paramName);
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
		Page page = new Page();
		page.setName(pageName);
		this.addNewPage(page);
		this.setCurrentWork(page);
		return this;
	}
	public PageFlowScript TBD() {
		throw new RuntimeException("TBD");
	}
	

	
}
