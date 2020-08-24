package cla.edg.pageflow;

import cla.edg.modelbeanv2.*;
import com.terapico.query.utils.QueryInfoUtil;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Function;


public class PageFlowScriptV2 extends PageFlowScript {
	protected QueryInfoUtil queryInfo;

	public QueryInfoUtil getQueryInfo() {
		return queryInfo;
	}

	public void setQueryInfo(QueryInfoUtil queryInfo) {
		this.queryInfo = queryInfo;
	}

	public PageFlowScriptV2 do_it_as2() {
		if (currentWork instanceof QueryInfo) {
			queryInfo = new QueryInfoUtil();
			currentQuery.setQueryInfo(queryInfo);
			queryInfo.setTargetModelTypeName(currentQuery.getObjectName());
			queryInfo.setQuerySingle(currentQuery.isQuerySingleObject());
			queryInfo.setPagination(currentQuery.isPagination());
		}else {
			throw new RuntimeException("当前任务是"+currentWork.getClass().getSimpleName()+", 不能指定执行细节");
		}
		return this;
	}

	public PageFlowScriptV2 runBy(Function<PageFlowScriptV2, PageFlowScriptV2> func) {
		return func.apply(this);
	}

	public PageFlowScriptV2 order_by(BaseAttribute attribute){
		assertQueryInfo();
		queryInfo.addOrderBy(attribute);
		return this;
	}

	private void assertQueryInfo() {
		if (currentQuery.getQueryInfo() == null){
			throw new RuntimeException("只能在 do_it_as() 后使用");
		}
	}

	public PageFlowScriptV2 where(LogicalOperator... operators) {
		if (operators == null || operators.length == 0) {
			return this;
		}
		if (operators.length == 1){
			queryInfo.setWhereClause(operators[0]);
			return this;
		}
		queryInfo.setWhereClause(LogicalOperator.create(LogicalOperator.CollectionType.and, operators));
		return this;
	}

	public PageFlowScriptV2 where2(LogicalOperator... operators) {
		return where(operators);
	}

	public PageFlowScriptV2 desc() {
		assertQueryInfo();
		queryInfo.setOrderByDirection("desc");
		return this;
	}
	public PageFlowScriptV2 asc() {
		assertQueryInfo();
		queryInfo.setOrderByDirection("asc");
		return this;
	}

	public PageFlowScriptV2 wants(BaseModelBean... endPoints) {
		assertQueryInfo();
		queryInfo.setWantsBeans(new LinkedList<>(Arrays.asList(endPoints)));
		return this;
	}

	public PageFlowScriptV2 query(BaseModelBean bean){
		query(bean.getModelTypeName());
		return this;
	}

	public PageFlowScriptV2 find(BaseModelBean bean){
		find(bean.getModelTypeName());
		return this;
	}
	public PageFlowScriptV2 count() {
		assertQueryInfo();
		queryInfo.setCountAttr(new BaseAttribute());
		return this;
	}
	public PageFlowScriptV2 count_by(BaseAttribute attr){
		assertQueryInfo();
		queryInfo.setCountByAttr(attr);
		return this;
	}
	public PageFlowScriptV2 count_by(BaseModelBean bean){
		assertQueryInfo();
		queryInfo.setCountByAttr(bean.id());
		return this;
	}
	public PageFlowScriptV2 top(String limitExp) {
		assertQueryInfo();
		queryInfo.setTopNExpression(limitExp);
		return this;
	}
}
