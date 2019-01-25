var allData = [
<#list helper.getAllPages(script) as page>
	{	
		data: { id:'${NAMING.toCamelCase(page.name)}', name:'${page.comments!}页面', type: 'rectangle', size: 30} 
	},
</#list>
<#assign tempMap = helper.getAllRequestBranches(script)/>
<#list tempMap.edges as edge>
	{	
		data: { 
			id:'${NAMING.toCamelCase(edge.from.name)}_${NAMING.toCamelCase(edge.to)}', 
			source: '${NAMING.toCamelCase(edge.from.name)}',
			target: '${NAMING.toCamelCase(edge.to)}',
			name:'${edge.path}'
		} 
	},
</#list>
<#list tempMap.rootPages as page>
	{	
		data: { 
			id:'ROOT_${NAMING.toCamelCase(page)}', 
			source: 'ROOT',
			target: '${NAMING.toCamelCase(page)}',
			name:'',
			size: 80
		} 
	},
</#list>
	{
		data: { id:'ROOT', name:'开始', type: 'star', x:0,y:0} 
	}
];