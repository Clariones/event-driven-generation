package cla.edg.pageflow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import com.google.gson.Gson;

import cla.edg.Utils;
import cla.edg.modelbean.BaseAttribute;
import cla.edg.modelbean.BaseModelBean;
import cla.edg.modelbean.BeanRelation;
import cla.edg.modelbean.CorperationPathNode;
import cla.edg.modelbean.LogicalOperator;
import cla.edg.modelbean.ModelBeanRoute;
import cla.edg.modelbean.NumberAttribute;
import cla.edg.routemap.Edge;
import cla.edg.routemap.Node;
import cla.edg.routemap.RouteUtil;

public class QueryActionInfo {
	private static final String IF_LAST_RECORD = "<IF_LAST_RECORD>";
	private static final String END_OF_BRACKET = "<END_OF_BRACKET>";
	private static final String END_OF_LAST_RECORD = END_OF_BRACKET;
	// ========================== 公共部分 ===========================
	protected Set<String> externTypesNeedKnown;
	protected LogicalOperator searchWhere;
	protected String targetModelTypeName;
	protected boolean querySingle;
	protected boolean pagination;
	protected boolean counting = false;
	protected boolean sum = false;
	protected NumberAttribute sumAttribute;
	protected boolean notGeneratePaginationParams = false;
	protected String limitExp = null;
	
	
	public boolean isSum() {
		return sum;
	}
	public void setSum(boolean sum) {
		this.sum = sum;
	}
	public NumberAttribute getSumAttribute() {
		return sumAttribute;
	}
	public void setSumAttribute(NumberAttribute sumAttribute) {
		this.sumAttribute = sumAttribute;
	}
	public String getLimitExp() {
		return limitExp;
	}
	public boolean isNotGeneratePaginationParams() {
		return notGeneratePaginationParams;
	}
	public void setNotGeneratePaginationParams(boolean notGeneratePaginationParams) {
		this.notGeneratePaginationParams = notGeneratePaginationParams;
	}
	public boolean isCounting() {
		return counting;
	}
	public void setCounting(boolean counting) {
		this.counting = counting;
	}
	public String getTargetModelTypeName() {
		return targetModelTypeName;
	}
	public void setTargetModelTypeName(String targetModelTypeName) {
		this.targetModelTypeName = targetModelTypeName;
	}
	public boolean isQuerySingle() {
		return querySingle;
	}
	public void setQuerySingle(boolean querySingle) {
		this.querySingle = querySingle;
	}
	public boolean isPagination() {
		return pagination;
	}
	public void setPagination(boolean pagination) {
		this.pagination = pagination;
	}
	public LogicalOperator getSearchWhere() {
		return searchWhere;
	}
	public void setSearchWhere(LogicalOperator searchWhere) {
		this.searchWhere = searchWhere;
	}
	public Set<String> getExternTypesNeedKnown() {
		if (externTypesNeedKnown == null) {
			externTypesNeedKnown = new HashSet<>();
		}
		return externTypesNeedKnown;
	}
	public void setExternTypesNeedKnown(Set<String> externTypesNeedKnown) {
		this.externTypesNeedKnown = externTypesNeedKnown;
	}
	public String getSql() {
		if (this.getBeanRoute() != null) {
			if (this.isCounting() || this.isSum()) {
				return this.getCountOrSumSqlFromSearchClause();
			}
			return this.getSqlFromSearchClause();
		}else {
			return this.getDbSql();
		}
	}
	public List<Object> getParams() {
		if (this.getBeanRoute() != null) {
			return this.getParamsFromSearchClause();
		}else {
			return this.getParamPrepareQueue();
		}
	}
	// ========================== 写法1: 直接写SQL ===========================
	protected String sqlTemplate;
	protected List<Object> paramDefinitions;
	protected List<CorperationPathNode> searchAlongPath;
	public List<CorperationPathNode> getSearchAlongPath() {
		return searchAlongPath;
	}
	public void setSearchAlongPath(List<CorperationPathNode> searchAlongPath) {
		this.searchAlongPath = searchAlongPath;
	}
	public List<Object> getParamDefinitions() {
		if (paramDefinitions == null) {
			paramDefinitions = new ArrayList<>();
		}
		return paramDefinitions;
	}
	public void setParamDefinitions(List<Object> paramDefinitions) {
		this.paramDefinitions = paramDefinitions;
	}
	public String getSqlTemplate() {
		return sqlTemplate;
	}

	public void setSqlTemplate(String sql) {
		sqlTemplate = sql;
	}
	public void addParam(Object param) {
		getParamDefinitions().add(String.valueOf(param));
	}
	public void addParamString(Object param) {
		getParamDefinitions().add(new Gson().toJson(param));
	}
	
	public String getDbSql() {
		return makeOutputString(this.getSqlTemplate().replaceAll("\\?\\{[^\\}]+\\}", "?"));
	}
	
	Pattern ptnSqlParam = Pattern.compile("(\\?(\\{[^\\}]+\\})?)");
	public List<Object> getParamPrepareQueue() {
		List<Object> result = new ArrayList<>();
		List<String> segs = Utils.findAllMatched( this.getSqlTemplate(), ptnSqlParam);
		int curAdditionalParamIdx = 0;
		for(String seg : segs) {
//			System.out.println(seg);
			if (seg.equals("?")) {
				result.add(getParamDefinitions().get(curAdditionalParamIdx++));
				continue;
			}
			String name = seg.substring(2, seg.length()-1);
			result.add(Utils.toJavaVariableName(name));
		}
		return result;
	}
	
	// ========================== 写法2: 用route map组装SQL ===========================
	protected List<Object> params;
	protected ModelBeanRoute beanRoute;
	protected SortingInfo currentSortingPath;
	protected ModelBeanRoute sortingMap;
	protected List<SortingInfo> sortingFields = new ArrayList<>();
	protected ModelBeanRoute wantedMap;
	
	
	public ModelBeanRoute getWantedMap() {
		return wantedMap;
	}
	public void setWantedMap(ModelBeanRoute wantedMap) {
		this.wantedMap = wantedMap;
	}
	public ModelBeanRoute getBeanRoute() {
		return beanRoute;
	}
	public void setBeanRoute(ModelBeanRoute beanRoute) {
		this.beanRoute = beanRoute;
	}
	public List<Object> getParamsFromSearchClause() {
		return params;
	}
	public String getCountOrSumSqlFromSearchClause() {
		StringBuilder sb =  new StringBuilder();
		if (this.sortingMap != null) {
			beanRoute = (ModelBeanRoute) beanRoute.mergeWith(sortingMap);
		}
		if (this.sumAttribute != null) {
			beanRoute = (ModelBeanRoute) beanRoute.mergeWith(sumAttribute.getContainerBean().getBeanRoute());
		}
		beanRoute.assignAlias();
		String selectStr = beanRoute.getCountOrSumSelectClause(this.getTargetModelTypeName(), this.sumAttribute);
		sb.append(selectStr);
		
		params = new ArrayList<>();
		String whereClause = RouteUtil.getWhereClause(params, this.getSearchWhere());
		sb.append(whereClause);
		return makeOutputString(sb.toString());
	}
	private String makeOutputString(String str) {
		return str
				.replaceAll("<IF_LAST_RECORD>[\r\n]*", IF_LAST_RECORD)
				.replaceAll("<END_OF_BRACKET>[\r\n]*", END_OF_BRACKET)
				.replaceAll("[\r\n]+", "\" +\r\n\t\t\t\"")
				.replace(IF_LAST_RECORD, "\" +\r\n\t\t    (lastRecord == null ? \"\": \"")
				.replace(END_OF_BRACKET, "\") +\r\n\t\t\t\"")
				;
	}
	public String getSqlFromSearchClause() {
		if (this.sortingMap != null) {
			beanRoute = (ModelBeanRoute) beanRoute.mergeWith(sortingMap);
		}
		beanRoute.assignAlias();
		StringBuilder sb =  new StringBuilder();
		String selectStr = beanRoute.getSelectClause(this.getTargetModelTypeName());
		sb.append(selectStr);
		
		params = new ArrayList<>();
		String whereClause = RouteUtil.getWhereClause(params, this.getSearchWhere());
		sb.append(whereClause);
		// create pagination clause
		makePaginationClause(params, sb, null);
		// create order by 
		makeSortClause(params, sb, null);
		// create limit
		makeLimitClause(params, sb, null);
		return makeOutputString(sb.toString());
	}
	private void makePaginationClause(List<Object> params, StringBuilder sb, Object object) {
		if (!this.isPagination()) {
			return;
		}
		sb.append(IF_LAST_RECORD);
		if (this.sortingFields.isEmpty()) {
			sb.append("\n    AND (").append(beanRoute.getTargetModelAlias()).append(".id <= ?) ");
			sb.append(END_OF_LAST_RECORD);
			return;
		}
		
		sb.append("\r\n      AND (");
		for(int i=0;i<sortingFields.size();i++) {
			makePaginationCondition(sb, i);
		}
		
		sb.append(") ");
		sb.append(END_OF_LAST_RECORD);
		return;
	}
	private void makePaginationCondition(StringBuilder sb, int pos) {
		
		if (pos > 0) {
			sb.append(" OR (");
		}
		for(int i=0;i<pos;i++) {
			SortingInfo fd = sortingFields.get(i);
			if (i>0) {
				sb.append(" AND ");
			}
			sb.append(fd.getMeetingPoint().getAlias()).append(".").append(fd.getSortingFieldName()).append("=?");
		}
		SortingInfo fd = sortingFields.get(pos);
		if (pos>0) {
			sb.append(" AND ");
		}
		sb.append(fd.getMeetingPoint().getAlias()).append(".").append(fd.getSortingFieldName());
		if (fd.isAscDirection()) {
			sb.append(">=?");
		}else {
			sb.append("<=?");
		}
		if (pos > 0) {
			sb.append(")");
		}
		
	}
	private void makeSortClause(List<Object> paramValueExpList, StringBuilder sb, LogicalOperator whereClauses) {
		if (this.sortingFields.isEmpty()) {
			sb.append("\n    ORDER BY ").append(beanRoute.getTargetModelAlias()).append(".id DESC ");
			return;
		}
		// 用指定的
		sb.append("\n    ORDER BY ");
		boolean first = true;
		for(SortingInfo field: sortingFields) {
			if (!first) {
				sb.append(", ");
			}
			sb.append(field.getMeetingPoint().getAlias()).append(".").append(field.getSortingFieldName()).append(field.isAscDirection()?" asc":" desc");
			if (first) {
				first = false;
			}
		}
		sb.append(' ');
	}

	private void makeLimitClause(List<Object> paramValueExpList, StringBuilder sb, LogicalOperator whereClauses) {
		if (this.isPagination()) {
			sb.append("\n    LIMIT ? ");
			// paramValueExpList.add("pageSize");
			return;
		}
		
		if (this.getLimitExp() != null) {
			sb.append("\n    LIMIT ? ");
			return;
		}
		
		if (this.isQuerySingle()) {
			sb.append("\n    LIMIT ? ");
			paramValueExpList.add("1");
			return;
		}
	}
	
	// 和排序相关的
	public void addSortingPath(BaseAttribute attr, boolean asc) {
		ModelBeanRoute inputBeanRoute = attr.getContainerBean().getBeanRoute();
		currentSortingPath = new SortingInfo();
		currentSortingPath.setMeetingPoint(inputBeanRoute.getCurrentMeetingPoint());
		currentSortingPath.setAscDirection(asc);
		currentSortingPath.setSortField(attr);
		sortingFields.add(currentSortingPath);
		
		if (sortingMap == null) {
			sortingMap = inputBeanRoute;
			return;
		}
		sortingMap = (ModelBeanRoute) sortingMap.mergeWith(inputBeanRoute);
	}
	private void ensureSortingMap() {
		if (sortingMap == null) {
			sortingMap = new ModelBeanRoute();
		}
	}
	public void addSortingPath(BaseModelBean bean, boolean asc) {
		bean.goBackOneStep();
		ModelBeanRoute inputBeanRoute = bean.getBeanRoute();
		if (inputBeanRoute == null) {
			addSortingPath(bean.id(), asc);
			return;
		}
		currentSortingPath = new SortingInfo();
		currentSortingPath.setMeetingPoint(inputBeanRoute.getCurrentMeetingPoint());
		currentSortingPath.setAscDirection(asc);
		currentSortingPath.setSortField(bean);
		sortingFields.add(currentSortingPath);
		if (sortingMap == null) {
			sortingMap = inputBeanRoute;
			return;
		}
		sortingMap = (ModelBeanRoute) sortingMap.mergeWith(inputBeanRoute);
	}
	// 设置排序字段的方向 true-asc; false-desc
	public void setCurrentSortingDirectionASC(boolean asc) {
		if (currentSortingPath == null) {
			exception("asc()/desc() 应该在 order_by(xxx) 后使用");
		}
		currentSortingPath.setAscDirection(asc);
	}
	
	private void exception(String message) {
		throw new RuntimeException(message);
	}
	
	
	public List<Object> getSingleObjectEnhancePathList() {
		return getEnhancePathList("data", this.getWantedMap());
	}
	public List<Object> getListEnhancePathList() {
		return getEnhancePathList("list", this.getWantedMap());
	}
	// 和enhance相关的
	public List<Object> getLastRecordEnhancePathList() {
		if (this.isNotGeneratePaginationParams()) {
			System.out.println("查询" + this.getTargetModelTypeName() +"时指定不自动生成分页参数处理" );
			return new ArrayList<>();
		}
		return getEnhancePathList("lastRecord", sortingMap);
	}
	protected List<Object> getEnhancePathList(String startName, ModelBeanRoute beanEnhanceRoute) {
		if (beanEnhanceRoute == null || beanEnhanceRoute.getAllNodes() == null || beanEnhanceRoute.getAllNodes().size() <= 1) {
			System.out.println("查询" + this.getTargetModelTypeName() +"时未指定排序信息,默认按ID排序和分页" );
			return new ArrayList<>();
		}
		
		beanEnhanceRoute.assignAlias();
		
		List<Edge<BaseModelBean, BeanRelation>> edges = beanEnhanceRoute.getDFSPaths(beanEnhanceRoute.getStartNode().getMeetingPointList().get(0));
		
		List<Object> result = new ArrayList<>();
		edges.forEach(edge->{
			// 我要生成类似下面这两句话:
			// List<InkDeedStatus> statusList = MiscUtils.collectReferencedObjectWithType(ctx, lastRecord, InkDeedStatus.class);
			// ctx.getDAOGroup().enhanceList(statusList, InkDeedStatus.class);
			Node<BaseModelBean, BeanRelation> fromNode = beanEnhanceRoute.getNodeByKey(edge.getFromNode().getNodeKey());
			Node<BaseModelBean, BeanRelation> toNode = beanEnhanceRoute.getNodeByKey(edge.getToNode().getNodeKey());
			String enhancedTypeName = toNode.getData().getModelTypeName();
			enhancedTypeName = Utils.toCamelCase(enhancedTypeName);
			String enhancedListVarName = edge.getData().getKey();
			enhancedListVarName = String.format("%sListOf%sAs%s", 
					edge.getData().getMemberName(),
					Utils.toCamelCase(fromNode.getData().getModelTypeName()),
					edge.getFromNode().getAlias()
					);
			String standOnVarName = startName;
			if (edge.getFromNode().getEdgesToMe().isEmpty()) {
				// 就直接从lastRecord开始
			}else {
				Edge<BaseModelBean, BeanRelation> fromEdge = edge.getFromNode().getEdgesToMe().iterator().next();
				fromNode = beanEnhanceRoute.getNodeByKey(fromEdge.getFromNode().getNodeKey());
				standOnVarName = String.format("%sListOf%sAs%s", 
						fromEdge.getData().getMemberName(),
						Utils.toCamelCase(fromNode.getData().getModelTypeName()),
						fromEdge.getFromNode().getAlias()
						);
			}
			String methodType = "enhance";
			String methodName = "";
			String ownerType = "";
			if (!edge.getData().isForwardReference()) {
				methodType = "loadOurs";
				methodName = String.format("loadOur%s", Utils.capFirst(edge.getData().getMemberName()));
				ownerType = edge.getFromNode().getNodeKey();
				if (standOnVarName.equals("data")) {
					standOnVarName = "asList(data)";
				}
			}
			result.add(Utils.put("enhancedTypeName", enhancedTypeName)
					.put("enhancedListVarName", enhancedListVarName)
					.put("standOnVarName", standOnVarName)
					.put("methodType", methodType)
					.put("methodName", methodName)
					.put("ownerType", ownerType)
					.into_map()
					);
		});
		
		return result;
	}
	
	public List<Object> getPaginationParamsExp() {
		List<Object> params = new ArrayList<>();
		makePaginationParams(params);
		return params;
	}
	private void makePaginationParams(List<Object> params) {
		if (!this.isPagination()) {
			return;
		}
		if (this.sortingFields.isEmpty()) { // 要分页,又没有指定排序规则的情况下, 按照目标类型的ID分页
			params.add("lastRecord.getId()");
			return;
		}
		// 指定了排序规则的, 按排序顺序来填充参数
		for(int i=0;i<sortingFields.size();i++) {
			for(int j = 0; j <= i; j++) {
				makePaginationConditionParam(params, j);
			}
		}
		return;
	}
	private void makePaginationConditionParam(List<Object> params, int pos) {
		StringBuilder sb = new StringBuilder();
		sb.append("lastRecord");
		SortingInfo fd = sortingFields.get(pos);
		List<Edge<BaseModelBean, BeanRelation>> paths = sortingMap.getPathsFromStartToPoint(fd.getMeetingPoint());
//		if (paths.size() == 0) {
//			sb.append(".get").append(Utils.capFirst(fd.getSortingFieldName())).append("()");
//		}
		for(Edge<BaseModelBean, BeanRelation> edge: paths) {
			BeanRelation br = edge.getData();
			sb.append(".get").append(Utils.capFirst(br.getMemberName())).append("()");
			if (!br.isForwardReference()) {
				sb.append(".first()");
			}
		}
		sb.append(".get").append(Utils.toCamelCase(fd.getSortingFieldName())).append("()");
		if (fd.getSortField() instanceof BaseModelBean) {
			sb.append(".getId()");
		}
		params.add(sb.toString());
	}
	public void setLimitExp(String limitExp) {
		this.limitExp = limitExp;
	}
	
	public boolean isLimitExpIsObject() {
		if (limitExp == null) {
			return false;
		}
		return Utils.isElVariable(limitExp);
	}
	
	public String getSumDataType() {
		switch (this.sumAttribute.getModelTypeName()) {
		case "long":
			return "Long";
		case "int":
		case "int_auto_zero":
			return "Integer";
		case "double":
		case "money_auto_zero":
		case "money":
		default:
			return "BigDecimal";
		}
	}
}
