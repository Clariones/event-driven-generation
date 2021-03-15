public class ${helper.NameAsThis(name)} {
<#list tasks as task>
    <#include task.template/>
</#list>
}