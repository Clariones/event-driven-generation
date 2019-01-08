<#assign all_branch_code=[]/>
<#list script.allBranchCode as code>
	public static final int ${code?replace(" ","_")?upper_case} = ${code?index};
</#list>