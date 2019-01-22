package ${package};

import ${base_package}.Custom${project_name?cap_first}CheckerManager;
import ${base_package}.${custom_context_name};

public abstract class ${class_name} extends Custom${project_name?cap_first}CheckerManager{
<#include "Constants.ftl">

<#include "BasicFunctions.ftl">

<#list script.events as event>
<#include "EventProcessingFunctions.ftl">
</#list>

}