var allData = [
<#list helper.getAllPages(script) as page>
	{	
		data: { id:'${NAMING.toCamelCase(page.name)}', name:'${page.comments!}页面', type: 'rectangle'} 
	},
</#list>
<#list helper.getAllRequestDispatchNode(script) as reqNode>
	{	
		data: { id:'${NAMING.toCamelCase(reqNode.name)}_DN', name:'?', type: 'diamond'} 
	},
</#list>
<#list helper.getAllPageOutRequest(script) as edge>
	{	
		data: { 
			id:'${NAMING.toCamelCase(edge.page)}_${NAMING.toCamelCase(edge.request)}', 
			source: '${NAMING.toCamelCase(edge.page)}',
			target: '${NAMING.toCamelCase(edge.request)}_DN',
			name:'${edge.name!}'
		} 
	},
</#list>
<#list helper.getAllRequestBranchPages(script) as edge>
	{
		data: { 
			id:'${NAMING.toCamelCase(edge.request)}_${NAMING.toCamelCase(edge.page)}', 
			source: '${NAMING.toCamelCase(edge.request)}_DN',
			target: '${NAMING.toCamelCase(edge.page)}',
			name:'${edge.name!}'
		}
	},
</#list>
<#list helper.getRootPageRequest(script) as req>
	{	data: { 
			id:'root_${NAMING.toCamelCase(req.name)}', 
			source: 'ROOT',
			target: '${NAMING.toCamelCase(req.name)}_DN',
			name:'${req.comments!}'
		}
	},
</#list>
	{
		data: { id:'ROOT', name:'开始', type: 'star'} 
	}
];