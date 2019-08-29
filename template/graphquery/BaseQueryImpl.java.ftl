package com.recyclesupplychain.jingou;

public class TestGen {

<#list queryInfo.queryList as query>
	/*
	${query.comments}(${query.name})
	*/
	public Object query${NAMING.toCamelCase( query.getName() )}(String employeeId, String statusCode) throws Exception {
		GraphServiceImpl gs = new GraphServiceImpl();
		gs.setHost("192.168.0.118");
		BaseQuery query = new JingouQuery(${query.startPoint.typeName}.class, ${NAMING.toCamelCase( query.startPoint.paramName ) ? uncap_first})
	<#list query.searchEdges as edge>
			.relation("${edge.edgeName}")
	</#list>
			<@compress single_line=true>.want(
	<#list query.enhanceTypeName as typeName>
			${typeName}.class<#if typeName_has_next>,</#if>
	</#list>)</@>
			.filter("${query.queryConditionAsString}")
	<#list query.parameters as param>
			.parameter("${NAMING.toCamelCase( param.paramName ) ? uncap_first}", ${NAMING.toCamelCase( param.paramName ) ? uncap_first})
	</#list>
			<@compress single_line=true>.sort("<#list query.sortMembers 
		as member>${member.className}.${member.memberName} ${member.sortDirection}<#if member_has_next>, </#if></#list>"
		)</@>
			.limit(10)
		;
		
	 ResultList<${query.targetTypeName}> resultList = gs.query(query, ${query.targetTypeName}.class);
        System.out.println(resultList);
		return null;
	}
</#list>

	public static void main(String[] args) {
		TestGen t = new TestGen();
		try {
			t.queryTestFunction1("EA000002", OrderStatus.NOT_READY);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
