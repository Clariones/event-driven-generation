<#assign all_branch_code=[]/>
	public static final int STOP = -1;
<#list script.allBranchCode as code>
	public static final int ${code?replace(" ","_")?upper_case} = ${code?index};
</#list>